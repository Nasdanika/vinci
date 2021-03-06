package org.nasdanika.vinci.app.impl;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PropertyComputer;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionMapping;
import org.nasdanika.vinci.app.ActionReference;

/**
 * This property computer expands action mappings by name to action mappings by id
 * to be expanded at HTML app level. This dual expansion is needed because action url is not 
 * known at the time of generating the HTML action model, only at the time of generating HTML. 
 * @author Pavel
 *
 */
public class ActionMappingsPropertyComputer implements PropertyComputer {

	private EList<ActionMapping> mappings;
	private String registrationKey;
	private Context chain;

	public ActionMappingsPropertyComputer(Context chain, String registrationKey, EList<ActionMapping> mappings) {
		this.chain = chain;
		this.registrationKey = registrationKey;
		this.mappings = mappings;		
	}
	
	private ActionBase unwrap(AbstractAction target) {
		if (target instanceof ActionBase) {
			return (ActionBase) target;
		}
		
		if (target instanceof ActionReference) {
			return unwrap(((ActionReference) target).getAction());
		}
		
		throw new UnsupportedOperationException("Unwrapping of " + target + " is not supported (yet)");
	}	

	@SuppressWarnings("unchecked")
	@Override
	public <T> T compute(Context context, String key, String path, Class<T> type) {
		int spaceIdx = path.indexOf(' ');
		String spec = spaceIdx == -1 ? path : path.substring(0, spaceIdx); 
		String tail = spaceIdx == -1 ? "" : path.substring(spaceIdx);
		for (ActionMapping actionMapping: mappings) {
			ActionBase target = unwrap(actionMapping.getTarget());
			if (spec.equals(actionMapping.getAlias())) {
				if (type.isInstance(actionMapping.getTarget())) {
					return (T) actionMapping.getTarget();
				}
				
				if (type.isAssignableFrom(String.class)) {
					return (T) ("${" + ViewGenerator.ACTION_REGISTRY_PROPERTY + "/" + target.getId() + tail + "}");
				}
				
				throw new IllegalArgumentException("Cannot convert " + actionMapping.getTarget() + " to " + type);				
			}
			
			if (path.startsWith(actionMapping.getAlias()+"/")) {
				if (type.isAssignableFrom(String.class)) {
					String subKey = path.substring(actionMapping.getAlias().length());
					return (T) ("${" + ViewGenerator.ACTION_REGISTRY_PROPERTY + "/" + target.getId() + subKey + "}");
				}
				return null;
			}
		}
		if (chain == null) {
			return null;
		}
		Object parent = chain.get(registrationKey);
		if (parent instanceof ActionMappingsPropertyComputer) {
			return ((ActionMappingsPropertyComputer) parent).compute(context, key, path, type);
		}
		return null;	
	}
	
	public void put(MutableContext context) {
		context.put(registrationKey, this);
	}

}
