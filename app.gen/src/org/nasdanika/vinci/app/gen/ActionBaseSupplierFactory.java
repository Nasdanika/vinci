package org.nasdanika.vinci.app.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.common.Context;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.MapCompoundSupplierFactory;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reference;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionCategory;
import org.nasdanika.vinci.app.ActionElement;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.app.ActivatorType;
import org.nasdanika.vinci.app.Widget;
import org.nasdanika.vinci.app.impl.ActionMappingsPropertyComputer;

/**
 * Adapts {@link ActionBase} subclasses to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public class ActionBaseSupplierFactory extends AbstractActionSupplierFactory<ActionBase> implements SupplierFactory<Object> {
	
	public ActionBaseSupplierFactory(ActionBase target) {
		super(target);
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public org.nasdanika.common.Supplier<Object> create(Context context) throws Exception {
		
		String ELEMENTS_KEY = "Elements";		
		String CONTENT_KEY = "Content";	
		String WIDGETS_KEY = "Widgets";
		
		// Effective parent.
		Resource resource = target.eResource();	
		Reference<EObject> parentRef = new Reference<>(target.eContainer());
		if (resource != null) {
			ResourceSet resourceSet = resource.getResourceSet();
			TreeIterator<?> cit;
			if (resourceSet == null) {
				cit = resource.getAllContents();
			} else {
				cit = resourceSet.getAllContents();
			}
			while (cit.hasNext()) {
				Object next = cit.next();
				if (next instanceof org.nasdanika.vinci.app.Container) {
					if (((org.nasdanika.vinci.app.Container<?>) next).getLinkedElements().contains(this)) {
						parentRef.set((EObject) next);
					}
				}
			}
		}
		
		ListCompoundSupplierFactory<Object> elementsFactory = new ListCompoundSupplierFactory<Object>(ELEMENTS_KEY);

		for (ActionElement e: target.getEffectiveElements()) {
			if (e instanceof AbstractAction) {
				elementsFactory.add(EObjectAdaptable.adaptToSupplierFactory(e, Object.class)); 
			} else { // ActionCategory
				for (ActionElement ce: ((ActionCategory) e).getEffectiveElements()) {
					if (ce instanceof AbstractAction) {
						elementsFactory.add(EObjectAdaptable.adaptToSupplierFactory(e, Object.class));
					}
				}
			}
		}
		
		MapCompoundSupplierFactory<String, ViewPart> widgetsFactory = new MapCompoundSupplierFactory<String, ViewPart>(WIDGETS_KEY);
		for (Widget widget: target.getWidgets()) {
			widgetsFactory.put(widget.getName(), EObjectAdaptable.adaptToSupplierFactory(widget, ViewPart.class));
		}
		
		MapCompoundSupplierFactory<String, Object> mcs = new MapCompoundSupplierFactory<>("Action");		
		
		List<SupplierFactory<Object>> content = new ArrayList<>();		
		
		String markdown = target.getMarkdownContent();
		if (!Util.isBlank(markdown)) {
			SupplierFactory<Object> markdownSupplierFactory = SupplierFactory.from((ctx, progressMonidor) -> new ViewPart() {

				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					String html = ctx.interpolate(MarkdownHelper.INSTANCE.markdownToHtml(markdown).trim());
					return TagName.div.create(viewGenerator.interpolate(html)).addClass("markdown-body"); // Double interpolation for mapping expansion
				}
				
			},  "Markdown content", 1);
			content.add(markdownSupplierFactory);
		}
				
		for (EObject ce: target.getContent()) {
			content.add((SupplierFactory<Object>) Objects.requireNonNull(EObjectAdaptable.adaptTo(ce, SupplierFactory.class), "Cannot adapt " + ce + " to " + SupplierFactory.class));
		}
		mcs.put(CONTENT_KEY, (SupplierFactory) new ListCompoundSupplierFactory<Object>(CONTENT_KEY, content));
		mcs.put(ELEMENTS_KEY, (SupplierFactory) elementsFactory);
		mcs.put(WIDGETS_KEY, (SupplierFactory) widgetsFactory);
				
		URI navigationActivatorURI = getNavigationActivatorURI(context);		
		
		FunctionFactory<Map<String, Object>, Object> actionFacadeFactory = new FunctionFactory<Map<String,Object>, Object>() {
			
			@Override
			public org.nasdanika.common.Function<Map<String, Object>, Object> create(Context functionContext) throws Exception {
					BiFunction<Map<String, Object>, ProgressMonitor, Object> ret = (config, progressMonitor) -> {
					try { 
						return new ActionFacade(
							functionContext, 
							target, 
							navigationActivatorURI,
							parentRef.get(), 
							(List<Object>) config.get(CONTENT_KEY), 
							(List<Object>) config.get(ELEMENTS_KEY),
							(Map<String, ViewPart>) config.get(WIDGETS_KEY));
					} catch (Exception e) {
						throw new NasdanikaException(e);
					}
				};
				return org.nasdanika.common.Function.fromBiFunction(ret, "Action facade", 1);
			}
		};
				
		MutableContext actionContext = context.fork();
		if (navigationActivatorURI != null) {
			actionContext.register(URI.class, navigationActivatorURI);
		}		
		
		new ActionMappingsPropertyComputer(context, "action-mappings", target.getActionMappings()).put(actionContext);
		
		return configure(mcs.then(actionFacadeFactory)).create(actionContext);
	}
		
	/**
	 * If action role is reference resolves its activator to URI. Returns null otherwise.
	 * @param context
	 * @return
	 */
	private URI getNavigationActivatorURI(Context context) {
		// Context URI service - used by the Action facade and by child elements.
		if (target.getActivatorType() == ActivatorType.REFERENCE || target.getActivatorType() == ActivatorType.INLINE) {
			String activator = target.getActivator();
			if (activator != null && activator.startsWith("./")) {
				activator = activator.substring(2); // Removing ./ which is used to indicate that action content generation is not required.
			}
			if (Util.isBlank(activator) && !Util.isBlank(target.getId())) {
				activator = target.getId() + ".html";
				if (ActionRole.SECTION.label.equals(target.getRole())) {
					activator += "#" + target.getId();
				}
			}
			String activatorStr = context.interpolate(activator);
			if (Util.isBlank(activatorStr)) {
				throw new IllegalArgumentException("Activator type is reference and activator URL is blank");
			}
			
			URI actionURI = URI.createURI(activatorStr);
			URI contextURI = context.get(URI.class);
			return contextURI == null || !contextURI.isHierarchical() || contextURI.isRelative() ? actionURI : actionURI.resolve(contextURI);
		}
		return null;
	}
	
	
}
