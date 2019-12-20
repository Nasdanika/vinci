package org.nasdanika.vinci.app.impl;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.jsoup.Jsoup;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.NullProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLElement;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Decorator;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ScriptActionActivator;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.bootstrap.BootstrapElement;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionCategory;
import org.nasdanika.vinci.app.ActionRole;

public class ActionFacade extends org.nasdanika.html.app.impl.ActionImpl implements Decorator {
		
	private List<Object> content;

	private Consumer<Object> decorator;
	
	public ActionFacade(Context actionContext, ActionBase target) {
		this(actionContext, target, null, null, null, null);
	}		

	public ActionFacade(
			Context actionContext, 
			ActionBase target, 
			EObject parent,
			Consumer<Object> decorator,
			List<Object> content,
			List<Object> elements) {
		
		this.decorator = decorator;
		setText(actionContext.interpolate(target.getText()));
		setId(actionContext.interpolate(target.getId()));
		setIcon(actionContext.interpolate(target.getIcon()));
		String color = target.getColor();
		if (!Util.isBlank(color)) {
			setColor(Color.fromLabel(color));
		}		
		setOutline(target.isOutline());
		setNotification(actionContext.interpolate(target.getNotification()));
		setDisabled(target.isDisabled());
		setConfirmation(actionContext.interpolate(target.getConfirmation()));
//		setFloatRight(target.isFloatRight());
		// description
		String mDescription = target.getDescription();
		String mTooltip = target.getTooltip();
		if (!Util.isBlank(mDescription)) {
			MarkdownHelper mHelper = new MarkdownHelper();
			setDescription(mHelper.markdownToHtml(mDescription));
			if (Util.isBlank(mTooltip)) {
				String textDoc = Jsoup.parse(getDescription()).text();
				setTooltip(mHelper.firstSentence(textDoc));

			}
		}
		// tooltip
		if (!Util.isBlank(mTooltip)) {
			setTooltip(mTooltip);
		}
		// activator
		String activator = target.getActivator();

		switch (target.getActivatorType()) {
		case NONE:
			// No activator
			break;
		case BIND:
			throw new UnsupportedOperationException("Not implemented yet");
		case REFERENCE:
			if (Util.isBlank(activator) && !Util.isBlank(target.getId())) {
				activator = target.getId() + ".html";
				if (target.getRole() == ActionRole.SECTION) {
					activator += "#" + target.getId();
				}
			}
			String url = actionContext.interpolate(activator);
			if (Util.isBlank(url)) {
				throw new IllegalArgumentException("Activator type is reference and activator URL is blank");
			}
			setActivator(new NavigationActionActivator() {

				@Override
				public String getUrl() {
					return url;
				}

			});
			break;
		case SCRIPT:
			String code = actionContext.interpolate(activator);
			if (Util.isBlank(code)) {
				throw new IllegalArgumentException("Activator type is script and activator code is blank");
			}
			setActivator(new ScriptActionActivator() {

				@Override
				public String getCode() {
					return code;
				}

			});
			break;
		default:
			throw new IllegalArgumentException();
		}

		// category
		if (parent instanceof ActionCategory) {
			ActionCategory actionCategory = (ActionCategory) parent;
			org.nasdanika.html.app.impl.LabelImpl cat = new org.nasdanika.html.app.impl.LabelImpl();
			String catColor = actionCategory.getColor();
			if (!Util.isBlank(catColor)) {
				cat.setColor(Color.fromLabel(catColor));
			}
			cat.setIcon(actionContext.interpolate(actionCategory.getIcon()));
			cat.setNotification(actionContext.interpolate(actionCategory.getNotification()));
			cat.setText(actionContext.interpolate(actionCategory.getText()));
			cat.setOutline(actionCategory.isOutline());
			cat.setId(actionCategory.getId());
			// description
			String catDescription = actionCategory.getDescription();
			String catTooltip = actionCategory.getTooltip();
			if (!Util.isBlank(catDescription)) {
				MarkdownHelper catHelper = new MarkdownHelper();
				setDescription(catHelper.markdownToHtml(catDescription));
				if (Util.isBlank(catTooltip)) {
					String textDoc = Jsoup.parse(getDescription()).text();
					setTooltip(catHelper.firstSentence(textDoc));

				}
			}
			// tooltip
			if (!Util.isBlank(catTooltip)) {
				setTooltip(catTooltip);
			}

			setCategory(cat);
		}
		
		setSectionStyle(Util.isBlank(target.getSectionStyle()) ? SectionStyle.Auto : SectionStyle.fromLabel(target.getSectionStyle()));

		switch (target.getRole()) {
		case CONTEXT:
			getRoles().add(Action.Role.CONTEXT);
			break;
		case EDIT:
			getRoles().add(Action.Role.EDIT);
			break;
		case NAVIGATION:
			getRoles().add(Action.Role.NAVIGATION);
			break;
		case SECTION:
			getRoles().add(Action.Role.SECTION);
			break;
		case VIEW:
			getRoles().add(Action.Role.VIEW);
			break;
		default:
			getRoles().add(target.getRole().name());
			break;
		}

		this.content = content;
		
		if (elements != null) {
			for (Object child : elements) {
				ActionImpl childAction = (org.nasdanika.html.app.impl.ActionImpl) child;
				getChildren().add(childAction);
				childAction.setParent(this);
			}			
		}
	}

	@Override
	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
		if (content == null) {
			return null;
		}
		Fragment ret = viewGenerator.get(HTMLFactory.class, HTMLFactory.INSTANCE).fragment();
		content.forEach(ret);
		return ret;
	}

	@Override
	public void decorate(Object target, ViewGenerator viewGenerator) {
		if (decorator != null) {
			try {
				NullProgressMonitor progressMonitor = new NullProgressMonitor(); // A better way - from the viewGenerator?
				if (target instanceof BootstrapElement) {
					decorator.execute(target, progressMonitor);
				} else if (target instanceof HTMLElement) {
					decorator.execute(viewGenerator.get(BootstrapFactory.class, BootstrapFactory.INSTANCE).wrap((HTMLElement<?>) target), progressMonitor);
				}
			} catch (Exception e) {
				e.printStackTrace(); // TODO - improve handling, but shall not happen.
			}
		}
	}

};
