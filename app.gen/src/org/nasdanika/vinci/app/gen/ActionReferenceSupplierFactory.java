package org.nasdanika.vinci.app.gen;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.vinci.app.ActionReference;
import org.nasdanika.vinci.app.impl.ActionMappingsPropertyComputer;

/**
 * Adapts {@link ActionReference} to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public class ActionReferenceSupplierFactory extends AbstractActionSupplierFactory<ActionReference> implements SupplierFactory<Object> {
	
	public ActionReferenceSupplierFactory(ActionReference target) {
		super(target);
	}

	@Override
	public org.nasdanika.common.Supplier<Object> create(Context context) throws Exception {
		MutableContext actionContext = context.fork();
		new ActionMappingsPropertyComputer(context, "action-mappings", target.getActionMappings()).put(actionContext);
		String path = target.getPath();
		if (!Util.isBlank(path)) {
			URI uri = context.get(URI.class);
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
		return configure(EObjectAdaptable.adaptToSupplierFactory(target.getAction(), Object.class)).create(actionContext);
	}
		
}
