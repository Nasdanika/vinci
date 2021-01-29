package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionRole;

public class EEnumLiteralViewActionSupplier extends ENamedElementViewActionSupplier<EEnumLiteral> {

	public EEnumLiteralViewActionSupplier(EEnumLiteral value, Context context, java.util.function.Function<EPackage,String> ePackagePathComputer) {
		super(value, context, ePackagePathComputer);
	}
	
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(progressMonitor);
		action.setRole(ActionRole.SECTION.label);
		
		action.setId(eObject.eClass().getName() + "-" + encodeEPackage(eObject.getEEnum().getEPackage()) + "-" + eObject.getEEnum().getName() + "-" + eObject.getName());
		action.setActivator(eObject.getEEnum().getName()+".html#"+eObject.getName());
		
		return action;
	}
	
}
