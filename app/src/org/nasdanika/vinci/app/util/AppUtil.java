package org.nasdanika.vinci.app.util;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ActionActivator;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActivatorType;
import org.nasdanika.vinci.app.impl.ActionFacade;

public class AppUtil {
	
	// Utility.
	private AppUtil() {
		
	}

	/**
	 * @param action Action.  
	 * @param baseURI Base uri to relativize action URL.
	 * @return Generation path (url relative to the base) if url is relative and activator doesn't start with './' which by convention means a relative url which shall not be generated. Null otherwise. 
	 * For sections this method returns non-null if the first non-section parent URL before the fragment part (if any) is different from the section URL.  
	 */
	public static String getGenerationPath(Action action, URI baseURI) {
		ActionActivator activator = action.getActivator();
		if (activator instanceof NavigationActionActivator) {
			NavigationActionActivator naa = (NavigationActionActivator) activator;
			String url = naa.getUrl(baseURI.toString());  
			URI actionURI = URI.createURI(url);			
			if (actionURI.isRelative()) {
				if (action instanceof ActionFacade) {
					ActionBase actionBase = ((ActionFacade) action).getTarget();
					if (actionBase != null 
							&& actionBase.getActivatorType() == ActivatorType.REFERENCE 
							&& actionBase.getActivator() != null 
							&& actionBase.getActivator().startsWith("./")) {
						
						return null; // actions with activators starting with ./ are not generated.
					}					
				}
				
				// Sections
				if (action.isInRole(Action.Role.SECTION)) {
					Action parent = action.getParent();
					while (parent != null && parent.isInRole(Action.Role.SECTION)) {
						parent = parent.getParent();
					}
					if (parent != null) {
						ActionActivator parentActivator = parent.getActivator();
						if (parentActivator instanceof NavigationActionActivator) {
							NavigationActionActivator pna = (NavigationActionActivator) parentActivator;
							String parentUrl = pna.getUrl(baseURI.toString());  
							if (url.startsWith(parentUrl + "#")) {
								return null; // Just fragment
							}
						}
						
					}
				}
				
				return url;
			}
		}
		return null;
	}	

}
