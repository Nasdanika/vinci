package org.nasdanika.vinci.ecore;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EClassifier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Action;

public class EClassifierViewActionSupplier<T extends EClassifier> extends ENamedElementViewActionSupplier<T> {

	public EClassifierViewActionSupplier(T value) {
		super(value);
	}
	
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(progressMonitor);
		action.setId(id(eObject));
		return action;
	}
	
	@Override
	protected void configure(ProgressMonitor monitor) throws Exception {
		super.configure(monitor);		
		action.setText(eObject.getName() + typeParameters(eObject));
	}

	/**
	 * Generates {@link EClassifier} ID.
	 * @param eClassifier
	 * @return
	 */
	public static String id(EClassifier eClassifier) {
		return eClassifier.eClass().getName() + "-" + Hex.encodeHexString(eClassifier.getEPackage().getNsURI().getBytes(StandardCharsets.UTF_8)) + "-" + eClassifier.getName();
	}
	
}
