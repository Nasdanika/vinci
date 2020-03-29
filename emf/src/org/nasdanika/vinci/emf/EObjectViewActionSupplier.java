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
			
	protected Action create(ProgressMonitor monitor) throws Exception {
		return AppFactory.eINSTANCE.createAction();
	}

	@Override
	public synchronized Action execute(ProgressMonitor monitor) throws Exception {
		if (action == null) {
			action = create(monitor);
		}
		return action;
	}

	@Override
	public double size() {
		return 1;
	}

	@Override
	public String name() {
		return "View action supplier for "+eObject;
	}
	
}
