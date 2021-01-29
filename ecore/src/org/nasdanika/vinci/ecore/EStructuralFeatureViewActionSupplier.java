package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionRole;

public class EStructuralFeatureViewActionSupplier<T extends EStructuralFeature> extends ETypedElementViewActionSupplier<T> {

	public EStructuralFeatureViewActionSupplier(T value, Context context, java.util.function.Function<EPackage,String> ePackagePathComputer) {
		super(value, context, ePackagePathComputer);
	}
	
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(progressMonitor);
		action.setRole(ActionRole.SECTION.label);
		EClass eContainingClass = eObject.getEContainingClass();
		action.setId(
				encodeEPackage(eContainingClass.getEPackage())
				+ "-"
				+ eContainingClass.getName()
				+ "-"
				+ eObject.eClass().getName()
				+ "-" 				
				+ eObject.getName());
		
		action.setActivator(eContainingClass.getName() + ".html#" + eObject.eClass().getName() + "-" + eObject.getName());
		
		return action;
	}
	
}
