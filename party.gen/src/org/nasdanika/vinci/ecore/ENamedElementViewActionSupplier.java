package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.ENamedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.LabelSupplier;
import org.nasdanika.vinci.emf.ENamedElementLabelSupplier;

public class ENamedElementViewActionSupplier<T extends ENamedElement> extends EModelElementViewActionSupplier<T> {
	
	public ENamedElementViewActionSupplier(T value, Context context) {
		super(value, context);
	}
	
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(progressMonitor);
		action.setTitle(eObject.getName());
		
		LabelSupplier<Action> labelSupplier = new ENamedElementLabelSupplier<T, Action>(eObject) {

			@Override
			protected Action create(ProgressMonitor monitor) {
				return action;
			}			
			
		};
				
		return labelSupplier.getLabel(progressMonitor);
	}

}
