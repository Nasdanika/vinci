package org.nasdanika.vinci.emf;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Label;

public abstract class EClassLabelSupplier extends ENamedElementLabelSupplier<EClass, Label> {

	public EClassLabelSupplier(EClass eNamedElement) {
		super(eNamedElement);
	}
	
	@Override
	protected void configure(ProgressMonitor monitor) {
		super.configure(monitor);
		String hexNsUri = Hex.encodeHexString(modelElement.getEPackage().getNsURI().getBytes(StandardCharsets.UTF_8));
		label.setId(hexNsUri + "-" + modelElement.getName());
	}

}
