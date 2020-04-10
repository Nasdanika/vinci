package org.nasdanika.vinci.ecore;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionRole;

public class EStructuralFeatureViewActionSupplier<T extends EStructuralFeature> extends ETypedElementViewActionSupplier<T> {

	public EStructuralFeatureViewActionSupplier(T value) {
		super(value);
	}
	
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(progressMonitor);
		action.setRole(ActionRole.SECTION.label);
		EClass eContainingClass = eObject.getEContainingClass();
		action.setId(eObject.eClass().getName() + "-" + Hex.encodeHexString(eContainingClass.getEPackage().getNsURI().getBytes(StandardCharsets.UTF_8)) + "-" + eContainingClass.getName() + "-" + eObject.getName());
		
		action.setActivator(eContainingClass.getName() + ".html#" + eObject.eClass().getName() + "-" + eObject.getName());
		
		return action;
	}
	
}
