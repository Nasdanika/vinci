package org.nasdanika.vinci.emf;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.AppFactory;

/**
 * Adapts {@link EObject} to {@link Action}.
 * @author Pavel Vlasov
 *
 */
public class EObjectViewActionSupplierFactory<T extends EObject> implements ViewActionSupplierFactory {
		
	protected T eObject;

	public EObjectViewActionSupplierFactory(T eObject) {
		this.eObject = eObject;
	}	
	
	@Override
	public Supplier<Action> create(Context context) throws Exception {
		return new Supplier<Action>() {
			
			@Override
			public double size() {
				return 1;
			}
			
			@Override
			public String name() {
				return "EObject action";
			}
			
			@Override
			public Action execute(ProgressMonitor progressMonitor) throws Exception {
				return EObjectViewActionSupplierFactory.this.create(context, progressMonitor);
			}
		};
	}		
	
	protected Action create(Context context, ProgressMonitor progressMonitor) {
		Action ret = AppFactory.eINSTANCE.createAction();
		return ret;
	}
	
}
