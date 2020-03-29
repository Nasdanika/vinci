package org.nasdanika.vinci.ecore;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Action;

public class EStructuralFeatureViewActionSupplierFactory<T extends EStructuralFeature> extends ETypedElementViewActionSupplierFactory<T> {

	public EStructuralFeatureViewActionSupplierFactory(T value) {
		super(value);
	}
	
	@Override
	protected Action create(Context context, ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(context, progressMonitor);
		
		action.setId(eObject.eClass().getName() + "-" + Hex.encodeHexString(eObject.getEContainingClass().getEPackage().getNsURI().getBytes(StandardCharsets.UTF_8)) + "-" + eObject.getEContainingClass().getName() + "-" + eObject.getName());
		
		return action;
	}
	
}
