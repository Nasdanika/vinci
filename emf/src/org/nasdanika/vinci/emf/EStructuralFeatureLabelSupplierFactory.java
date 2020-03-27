package org.nasdanika.vinci.emf;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Label;

public abstract class EStructuralFeatureLabelSupplierFactory<T extends EStructuralFeature> extends ENamedElementLabelSupplierFactory<T,Label> {

	public EStructuralFeatureLabelSupplierFactory(T eNamedElement) {
		super(eNamedElement);
	}
	
	@Override
	protected void configure(Label label, Context context, ProgressMonitor monitor) {
		super.configure(label, context, monitor);
		EClass eClass = modelElement.getEContainingClass();
		String hexNsUri = Hex.encodeHexString(eClass.getEPackage().getNsURI().getBytes(StandardCharsets.UTF_8));
		label.setId(hexNsUri + "-" + eClass.getName() + "-" + modelElement.getName());
	}

}
