package org.nasdanika.vinci.ecore;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EClassifier;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Action;

public class EClassifierViewActionSupplier<T extends EClassifier> extends ENamedElementViewActionSupplier<T> {

	public EClassifierViewActionSupplier(T value, Context context) {
		super(value, context);
	}
	
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(progressMonitor);
		action.setId(eObject.eClass().getName() + "-" + Hex.encodeHexString(eObject.getEPackage().getNsURI().getBytes(StandardCharsets.UTF_8)) + "-" + eObject.getName());
		action.setActivator(eObject.getName()+".html");
		
		return action;
	}
	
	@Override
	public void configure(ProgressMonitor monitor) throws Exception {
		super.configure(monitor);		
		action.setText(eObject.getName() + typeParameters(eObject));
	}
	
}
