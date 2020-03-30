package org.nasdanika.vinci.ecore;

import java.nio.charset.StandardCharsets;
import java.util.Iterator;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ETypeParameter;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.emf.ViewActionSupplier;

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
		
		StringBuilder label = new StringBuilder(eObject.getName());

		if (!eObject.getETypeParameters().isEmpty()) {
			label.append("&lt;");
			Iterator<ETypeParameter> tpit = eObject.getETypeParameters().iterator();
			while (tpit.hasNext()) {
				ETypeParameter typeParameter = tpit.next();
				label.append(EObjectAdaptable.adaptTo(typeParameter, ViewActionSupplier.class).getAction(monitor).getText());
				if (tpit.hasNext()) {
					label.append(", ");
				}
			}
			label.append("&gt;");
		}
		action.setText(label.toString());
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
