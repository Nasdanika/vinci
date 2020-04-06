package org.nasdanika.vinci.emf;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EObjectAdaptable;
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
	 * elements of this list are configured in configure()
	 */
	protected List<ViewActionSupplier> children = new ArrayList<>();
	
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
	 * Creates an action. 
	 * @return An action, possibly not yet configured.
	 */
	@Override
	public synchronized Action getAction(ProgressMonitor monitor) throws Exception {
		if (action == null) {
			action = create(monitor);
		}
		return action;
	}
	
	/**
	 * Adapts child eObject to {@link ViewActionSupplier} and adds to the list of children to be configured.
	 * @param child
	 * @return
	 */
	protected ViewActionSupplier adaptChild(EObject child) {
		ViewActionSupplier ret = EObjectAdaptable.adaptTo(child, ViewActionSupplier.class);
		children.add(ret);
		return ret;
	}

	/**
	 * Configures the action, e.g. sets references to other actions.   
	 * @param monitor
	 * @throws Exception
	 */
	@Override
	public void configure(ProgressMonitor monitor) throws Exception {
		for (ViewActionSupplier child: children) {
			child.configure(monitor);
		}
	}
	
}
