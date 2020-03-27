package org.nasdanika.vinci.ecore;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;

public class EStructuralFeatureViewActionSupplierFactory<T extends EStructuralFeature> extends ETypedElementViewActionSupplierFactory<T> {

	public EStructuralFeatureViewActionSupplierFactory(T value) {
		super(value);
	}
	
//	@Override
//	protected List<EStructuralFeature> getChildFeatures() {
//		return Collections.emptyList();
//	}
	
}
