package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.common.Context;

public class EAttributeViewActionSupplier extends EStructuralFeatureViewActionSupplier<EAttribute> {

	public EAttributeViewActionSupplier(EAttribute value, Context context, java.util.function.Function<EPackage,String> ePackagePathComputer) {
		super(value, context, ePackagePathComputer);
	}
		

}
