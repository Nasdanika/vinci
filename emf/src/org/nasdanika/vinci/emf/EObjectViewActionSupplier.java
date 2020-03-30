package org.nasdanika.vinci.emf;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.AppFactory;

/**
 * Adapts {@link EObject} to {@link Action}.
 * @author Pavel Vlasov
 *
 */
public class EObjectViewActionSupplier<T extends EObject> implements ViewActionSupplier {
		
	protected T eObject;
	
	/**
	 * Action is created on the first call and then is returned on subsequent calls.
	 */
	protected Action action;

	public EObjectViewActionSupplier(T eObject) {
		this.eObject = eObject;
	}	
			
	/**
	 * Creates and optionally configures an action. 
	 * This call shall not set up non-containment references to other actions as they might not be created yet and 
	 * creation on-demand may lead to stack overflows if there are circular references (which are perfectly legal).
	 * Action configuration, at least establishment of references, shall be done in the configure method. 
	 */
	protected Action create(ProgressMonitor monitor) throws Exception {
		return AppFactory.eINSTANCE.createAction();
	}

	/**
	 * Creates and configures an action. In recursive calls it is possible that this method returns an action
	 * which is not yet configured.
	 * @return An action, possibly not yet configured.
	 */
	@Override
	public synchronized Action getAction(ProgressMonitor monitor) throws Exception {
		if (action == null) {
			action = create(monitor);
			configure(monitor);
		}
		return action;
	}

	/**
	 * Configures the action, e.g. sets references to other actions.   
	 * @param monitor
	 * @throws Exception
	 */
	protected void configure(ProgressMonitor monitor) throws Exception {
		
	}
	
}
