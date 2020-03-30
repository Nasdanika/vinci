package org.nasdanika.vinci.emf;

import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Action;

/**
 * Base interface for action suppliers.
 * @author Pavel
 *
 */
public interface ActionSupplier {
	
	/**
	 * Return an {@link Action} which is created on the first call and stored in an instance variable. 
	 * @param monitor
	 * @return
	 * @throws Exception
	 */
	Action getAction(ProgressMonitor monitor) throws Exception;
	
}
