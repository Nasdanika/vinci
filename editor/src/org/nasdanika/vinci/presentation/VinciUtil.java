package org.nasdanika.vinci.presentation;

import org.eclipse.emf.common.util.URI;
import org.nasdanika.html.app.Action;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActivatorType;
import org.nasdanika.vinci.app.impl.ActionFacade;

public class VinciUtil {
	
	// Utility.
	private VinciUtil() {
		
	}

	/**
	 * @param action Action.  
	 * @param url Resolved and relativized URL.
	 * @return True if url is relative and activator doesn't start with './' which by convention means a relative url which shall not be generated.
	 */
	public static boolean shallGenerate(ActionBase actionBase, String url) {
		if (actionBase != null 
				&& actionBase.getActivatorType() == ActivatorType.REFERENCE 
				&& actionBase.getActivator() != null 
				&& actionBase.getActivator().startsWith("./")) {
			
			return false;
		}
		
		return URI.createURI(url).isRelative();
	}	
	
	/**
	 * @param action Action.  
	 * @param url Resolved and relativized URL.
	 * @return True if url is relative and activator doesn't start with './' which by convention means a relative url which shall not be generated.
	 */
	public static boolean shallGenerate(Action action, String url) {
		return shallGenerate(action instanceof ActionFacade ? ((ActionFacade) action).getTarget() : null, url);
	}	

}
