package org.nasdanika.vinci.app.impl;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.PropertyComputer;
import org.nasdanika.html.Tag;
import org.nasdanika.html.app.ActionActivator;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionMapping;
import org.nasdanika.vinci.app.ActionReference;

public class ActionMappingsPropertyComputer implements PropertyComputer {

	private EList<ActionMapping> mappings;
	private String registrationKey;

	public ActionMappingsPropertyComputer(String registrationKey, EList<ActionMapping> mappings) {
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
	public <T> T compute(Context context, String key, Class<T> type) {
		if (registrationKey.equals(key)) {
			return (T) this;
		}
		if (key.startsWith(registrationKey+"/")) {
			String keyTail = key.substring(registrationKey.length() + 1);
			for (ActionMapping actionMapping: mappings) {
				if (keyTail.equals(actionMapping.getAlias())) {
					if (type.isInstance(actionMapping.getTarget())) {
						return (T) actionMapping.getTarget();
					}
					
					if (type == String.class || type.isAssignableFrom(Tag.class)) { 
						try {
							ActionFacade actionFacade = new ActionFacade(context, unwrap(actionMapping.getTarget()));
							ViewGenerator viewGenerator = context.get(ViewGenerator.class, new ViewGeneratorImpl(context, null, null));
							Tag link = viewGenerator.link(actionFacade);
							return (T) (type == String.class ? link.toString() : link);
						} catch (Exception e) {
							throw new NasdanikaException(e);
						}
					}
					
					throw new IllegalArgumentException("Cannot convert " + actionMapping.getTarget() + " to " + type);				
				}
				
				if (keyTail.startsWith(actionMapping.getAlias()+"/")) {
					if (type == String.class) {
						try {
							ActionFacade actionFacade = new ActionFacade(context, unwrap(actionMapping.getTarget()));
							String subKey = keyTail.substring(actionMapping.getAlias().length() + 1);
							switch (subKey) {
							case "text":
								return (T) actionFacade.getText();
							case "icon":
								return (T) actionFacade.getIcon();
							case "url":
								ActionActivator activator = actionFacade.getActivator();
								if (activator instanceof NavigationActionActivator) {
									return (T) ((NavigationActionActivator) activator).getUrl();
								}
								return null;
							default:
								return null;
							}
						} catch (Exception e) {
							throw new NasdanikaException(e);
						}
					}
					return null;
				}
			}
		}
		return null;
	}
	
	public void put(MutableContext context) {
		context.put(registrationKey, this);
	}

}
