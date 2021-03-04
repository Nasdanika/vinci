package org.nasdanika.vinci.app.gen;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.jsoup.Jsoup;
import org.nasdanika.common.Context;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.NullProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLElement;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Decorator;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ScriptActionActivator;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.bootstrap.BootstrapElement;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionCategory;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.app.ActivatorType;
import org.nasdanika.vinci.bootstrap.Appearance;

public class ActionFacade extends org.nasdanika.html.app.impl.ActionImpl implements Decorator {
	
	// String representation: platform:/plugin/org.nasdanika.vinci.templates/pages/default/primary.vinci
	public static final URI DEFAULT_PAGE_TEMPLATE = URI.createPlatformPluginURI("/org.nasdanika.vinci.templates/pages/default/primary.vinci", true);
		
	private List<Object> content;

	private org.nasdanika.common.Supplier<ViewBuilder> decoratorSupplier;

	private Context actionContext; 

	private ActionBase target;

	private Map<String, ViewPart> widgets;
	
	public ActionFacade(
			Context actionContext, 
			ActionBase target,
			URI actionURI,
			EObject parent,
			List<Object> content,
			List<Object> elements,
			Map<String, ViewPart> widgets) throws Exception {

		this.actionContext = actionContext;
		this.target = target;
		
		Appearance appearance = target.getAppearance();
		decoratorSupplier = appearance == null ? null : EObjectAdaptable.adaptToSupplierFactory(appearance, ViewBuilder.class).create(actionContext);				
		
		setText(actionContext.interpolateToString(target.getText()));
		setId(actionContext.interpolate(target.getId()));
		setIcon(actionContext.interpolateToString(target.getIcon()));
		String color = target.getColor();
		if (!Util.isBlank(color)) {
			setColor(Color.fromLabel(color));
		}		
		setOutline(target.isOutline());
		setNotification(actionContext.interpolateToString(target.getNotification()));
		setDisabled(target.isDisabled());
		setConfirmation(actionContext.interpolateToString(target.getConfirmation()));
//		setFloatRight(target.isFloatRight());
		// description
		String mDescription = target.getDescription();
		String mTooltip = target.getTooltip();
		MarkdownHelper markdownHelper = actionContext.computingContext().get(MarkdownHelper.class, MarkdownHelper.INSTANCE);
		if (!Util.isBlank(mDescription)) {
			setDescription(markdownHelper.markdownToHtml(mDescription));
			if (Util.isBlank(mTooltip)) {
				String textDoc = Jsoup.parse(getDescription()).text();
				setTooltip(markdownHelper.firstSentence(textDoc));
			}
		}
		// tooltip
		if (!Util.isBlank(mTooltip)) {
			setTooltip(mTooltip);
		}
		// activator
		String activator = target.getActivator();
		
		if (target.getSectionColumns() > 0) {
			setSectionColumns(target.getSectionColumns());
		}

		if (isDisabled()) {
			setActivator(new NavigationActionActivator() {
				
				@Override
				public String getUrl(String base) {
					return "#";
				}
				
				@Override
				public boolean inline() {
					return false;
				}

			});			
		} else {
			switch (target.getActivatorType()) {
			case NONE:
				// No activator
				break;
			case BIND:
				throw new UnsupportedOperationException("Not implemented yet");
			case INLINE: 
			case REFERENCE:					
				if (actionURI == null) {
					throw new IllegalArgumentException("Activator type is reference and activator URI is not set");
				}
				setActivator(new NavigationActionActivator() {
	
					@Override
					public String getUrl(String base) {
						if (Util.isBlank(base)) {
							return actionURI.toString();
						}					
						URI baseURI = URI.createURI(base);
						URI relative = actionURI.deresolve(baseURI, true, true, true);
						if (relative.isEmpty()) {
							// A trick to deresolve action URI to the last segment plus fragment etc. instead of blank string.
							relative = actionURI.deresolve(URI.createURI("random-" + UUID.randomUUID()+".html").resolve(actionURI), true, true, true);
						}
						return relative.toString();
					}
					
					@Override
					public boolean inline() {
						return target.getActivatorType() == ActivatorType.INLINE;
					}
	
				});
				break;
			case SCRIPT:
				String code = actionContext.interpolateToString(activator);
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
		}
				
		// category
		if (parent instanceof ActionCategory) {
			ActionCategory actionCategory = (ActionCategory) parent;
			
			Appearance categoryAappearance = actionCategory.getAppearance();
			@SuppressWarnings("resource")
			org.nasdanika.common.Supplier<ViewBuilder> categoryDecoratorSupplier = categoryAappearance == null ? null : EObjectAdaptable.adaptToSupplierFactory(categoryAappearance, ViewBuilder.class).create(actionContext);
			
			class CategoryFacade extends org.nasdanika.html.app.impl.LabelImpl implements Decorator {

				@Override
				public void decorate(Object target, ViewGenerator viewGenerator) {
					if (categoryDecoratorSupplier != null) {
						Object decoratorSelector = viewGenerator.get(Decorator.SELECTOR_KEY);
						if (Decorator.NO_DECORATOR.equals(decoratorSelector)) {
							// NOP
						} else if ("content-panel.breadcrumb".equals(decoratorSelector)) {
							// TODO 
						} else {
							NullProgressMonitor progressMonitor = new NullProgressMonitor(); // A better way - from the viewGenerator?
							try {
								ViewBuilder cd = categoryDecoratorSupplier.execute(progressMonitor);
								if (cd != null) {
									if (target instanceof BootstrapElement) {
										cd.build(target, viewGenerator, progressMonitor);
									} else if (target instanceof HTMLElement) {
										cd.build(viewGenerator.get(BootstrapFactory.class).wrap((HTMLElement<?>) target), viewGenerator, progressMonitor);
									}
								}
							} catch (Exception e) {
								throw new NasdanikaException(e);
							}
						}
					}
				}								
				
			}
			
			CategoryFacade cat = new CategoryFacade();
			String catColor = actionCategory.getColor();
			if (!Util.isBlank(catColor)) {
				cat.setColor(Color.fromLabel(catColor));
			}
			cat.setIcon(actionContext.interpolateToString(actionCategory.getIcon()));
			cat.setNotification(actionContext.interpolateToString(actionCategory.getNotification()));
			cat.setText(actionContext.interpolateToString(actionCategory.getText()));
			cat.setOutline(actionCategory.isOutline());
			cat.setId(actionCategory.getId());
			// description
			String catDescription = actionCategory.getDescription();
			String catTooltip = actionCategory.getTooltip();
			if (!Util.isBlank(catDescription)) {
				cat.setDescription(markdownHelper.markdownToHtml(catDescription));
				if (Util.isBlank(catTooltip)) {
					String textDoc = Jsoup.parse(cat.getDescription()).text();
					cat.setTooltip(markdownHelper.firstSentence(textDoc));

				}
			}
			// tooltip
			if (!Util.isBlank(catTooltip)) {
				cat.setTooltip(catTooltip);
			}

			setCategory(cat);
		}
		
		setSectionStyle(Util.isBlank(target.getSectionStyle()) ? SectionStyle.AUTO : SectionStyle.fromLabel(target.getSectionStyle()));

		ActionRole role = ActionRole.fromLabel(target.getRole());
		if (!Util.isBlank(role.code)) {
			getRoles().add(role.code);
		}

		this.content = content;
		this.widgets = widgets;
		
		if (elements != null) {
			for (Object child : elements) {
				ActionImpl childAction = (org.nasdanika.html.app.impl.ActionImpl) child;
				getChildren().add(childAction);
				childAction.setParent(this);
			}			
		}
	}

	@Override
	public Object generate(ViewGenerator viewGen, ProgressMonitor progressMonitor) {
		if (content == null) {
			return null;
		}
		ViewGenerator viewGenerator = viewGen.fork();
		viewGenerator.register(Action.class, this);
		
		for (Entry<String, ViewPart> widget: widgets.entrySet()) {
			viewGenerator.put("widgets/" + widget.getKey(), viewGenerator.processViewPart(widget.getValue(), progressMonitor));
		}
		
		Fragment ret = viewGenerator.get(HTMLFactory.class, HTMLFactory.INSTANCE).fragment();
		for (Object ce: content) {
			ret.content(viewGenerator.processViewPart(ce, null));
		}
		return ret;
	}

	@Override
	public void decorate(Object target, ViewGenerator viewGenerator) {
		if (decoratorSupplier != null) {
			Object decoratorSelector = viewGenerator.get(Decorator.SELECTOR_KEY);
			if (Decorator.NO_DECORATOR.equals(decoratorSelector)) {
				// NOP
			} else if ("content-panel.title".equals(decoratorSelector)) {
				// TODO
			} else if ("content-panel.breadcrumb".equals(decoratorSelector)) {
				// TODO 
			} else if ("action-link".equals(decoratorSelector)) {
				// TODO 
			} else {
				NullProgressMonitor progressMonitor = new NullProgressMonitor(); // A better way - from the viewGenerator?
				try {
					ViewBuilder decorator = decoratorSupplier.execute(progressMonitor);
					if (decorator != null) {
						if (target instanceof BootstrapElement) {
							decorator.build(target, viewGenerator, progressMonitor);
						} else if (target instanceof HTMLElement) {
							decorator.build(viewGenerator.get(BootstrapFactory.class).wrap((HTMLElement<?>) target), viewGenerator, progressMonitor);
						}
					}
				} catch (Exception e) {
					throw new NasdanikaException(e);
				}
			}
		}
	}
	
	@Override
	public String toString() {
		return "Action facade "+getText();
	}
	
	/**
	 * @return Action context built from the generation context and action configurations. 
	 */
	public Context getContext() {
		return actionContext;
	}
	
	/**
	 * @return {@link ActionBase} facaded by this aciton.
	 */
	public ActionBase getTarget() {
		return target;
	}
	
	/**
	 * @return Page template for the action. Inherited from parent. Defaults to <code>platform:/plugin/org.nasdanika.vinci.templates/pages/default/primary.vinci</code>. 
	 */
	public URI getPageTemplate() {
		String pageTemplate = target.getPageTemplate();
		if (Util.isBlank(pageTemplate)) {
			Action theParent = getParent();
			if (theParent instanceof ActionFacade) {
				return ((ActionFacade) theParent).getPageTemplate();
			}
			return DEFAULT_PAGE_TEMPLATE;
		}
		URI ret = URI.createURI(actionContext.interpolateToString(pageTemplate));
		Resource resource = target.eResource();
		if (resource == null) {
			return ret;
		}
		URI resUri = resource.getURI();
		return ret.resolve(resUri);
	}
	
	@Override
	public boolean isEmpty() {
		return content == null || content.isEmpty();
	}

};
