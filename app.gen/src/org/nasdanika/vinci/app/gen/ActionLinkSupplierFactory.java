package org.nasdanika.vinci.app.gen;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionLink;
import org.nasdanika.vinci.app.impl.ActionMappingsPropertyComputer;

/**
 * Adapts {@link ActionLink} to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public class ActionLinkSupplierFactory extends AbstractActionAdapter<ActionLink> implements SupplierFactory<Object> {
	
	public ActionLinkSupplierFactory(ActionLink target) {
		super(target);
	}

	@Override
	public org.nasdanika.common.Supplier<Object> create(Context ctx) throws Exception {
		
		SupplierFactory<Object> sf = context -> {
			
			URI refUri = URI.createURI(context.interpolate(target.getRef()));
			Resource resource = target.eResource();
			if (resource != null) {
				URI resUri = resource.getURI();
				refUri = refUri.resolve(resUri);
			}
					
			java.util.function.Function<Class<ResourceSet>,ResourceSet> factory = type -> {
				if (ResourceSet.class.isAssignableFrom(type)) {
					return new ResourceSetImpl();
				}
				throw new UnsupportedOperationException("Unsupported type: "+type+", expected "+ResourceSet.class);
			};
			
			ResourceSet resourceSet = context.get(ResourceSet.class, factory);
			Resource refResource = resourceSet.getResource(refUri, true);
			String fragment = refUri.fragment();				
			ActionBase action = (ActionBase) (fragment == null ? refResource.getContents().get(0) : refResource.getEObject(fragment));
			
			// Not performing diagnostic in a regular way as it might be dependent on context variables not available at design time.
			
			Diagnostician diagnostician = new Diagnostician() {
				
				public Map<Object,Object> createDefaultContext() {
					Map<Object, Object> ctx = super.createDefaultContext();
					ctx.put(Context.class, context);
					return ctx;
				};
				
			};				
			Diagnostic validationResult = diagnostician.validate(action);
			if (validationResult.getSeverity() == Diagnostic.ERROR) {
				throw new DiagnosticException(validationResult);
			}
			
			return EObjectAdaptable.adaptToSupplierFactory(action, Object.class).create(context);
		};
		
		MutableContext actionContext = ctx.fork();
		new ActionMappingsPropertyComputer(ctx, "action-mappings", target.getActionMappings()).put(actionContext);
		
		String path = target.getPath();
		if (!Util.isBlank(path)) {
			URI uri = ctx.get(URI.class);
			if (uri == null) {
				actionContext.register(URI.class, URI.createURI(path));				
			} else if (uri.isHierarchical() && !uri.isRelative()) {
				if (!path.endsWith("/")) {
					path += "/";
				}
				actionContext.register(URI.class, URI.createURI(path).resolve(uri));
			} else {
				// Best attempt ...
				String uriStr = uri.toString();
				int idx = uriStr.lastIndexOf('/');
				actionContext.register(URI.class, URI.createURI(idx == -1 ? path : uriStr.substring(0, idx +1) + path));				
				
			}
		}
		
		return configure(sf).create(actionContext);		
	}
		
}
