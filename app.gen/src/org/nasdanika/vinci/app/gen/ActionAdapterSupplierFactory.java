package org.nasdanika.vinci.app.gen;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Action.Supplier.Factory;
import org.nasdanika.vinci.app.ActionAdapter;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.impl.ActionMappingsPropertyComputer;

/**
 * Adapts {@link ActionBase} subclasses to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public class ActionAdapterSupplierFactory extends AbstractActionAdapter<ActionAdapter> implements SupplierFactory<Action> {
	
	public ActionAdapterSupplierFactory(ActionAdapter target) {
		super(target);
	}
	
	@Override
	public org.nasdanika.common.Supplier<Action> create(Context context) throws Exception {
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
		Factory adapter = EObjectAdaptable.adaptTo(target, Action.Supplier.Factory.class, target.getFactory());
		return configure(adapter).create(actionContext);
	}
	
}
