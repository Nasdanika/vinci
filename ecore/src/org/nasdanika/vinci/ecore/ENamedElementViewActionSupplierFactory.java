package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.ENamedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.LabelSupplierFactory;
import org.nasdanika.vinci.emf.ENamedElementLabelSupplierFactory;

public class ENamedElementViewActionSupplierFactory<T extends ENamedElement> extends EModelElementViewActionSupplierFactory<T> {
	
	public ENamedElementViewActionSupplierFactory(T value) {
		super(value);
	}
	
	@Override
	protected Action create(Context context, ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(context, progressMonitor);
		
		LabelSupplierFactory<Action> labelSupplierFactory = new ENamedElementLabelSupplierFactory<T, Action>(eObject) {

			@Override
			protected Action create(Context context, ProgressMonitor monitor) {
				return action;
			}			
			
		};
				
		return labelSupplierFactory.create(context).execute(progressMonitor);
	}

}
