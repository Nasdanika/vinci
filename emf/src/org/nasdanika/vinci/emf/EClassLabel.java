package org.nasdanika.vinci.emf;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Label;

public abstract class EClassLabel extends ENamedElementLabel<EClass, Label> {

	public EClassLabel(EClass eNamedElement) {
		super(eNamedElement);
	}
	
	@Override
	protected void configure(Label label, Context context, ProgressMonitor monitor) {
		super.configure(label, context, monitor);
		String hexNsUri = Hex.encodeHexString(modelElement.getEPackage().getNsURI().getBytes(StandardCharsets.UTF_8));
		label.setId(hexNsUri + "-" + modelElement.getName());
	}

}
