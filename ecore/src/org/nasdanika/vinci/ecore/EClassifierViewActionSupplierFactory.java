package org.nasdanika.vinci.ecore;

import java.nio.charset.StandardCharsets;
import java.util.Iterator;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ETypeParameter;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.emf.ViewActionSupplierFactory;

public class EClassifierViewActionSupplierFactory<T extends EClassifier> extends ENamedElementViewActionSupplierFactory<T> {

	public EClassifierViewActionSupplierFactory(T value) {
		super(value);
	}
	
	@Override
	protected Action create(Context context, ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(context, progressMonitor);
		
		StringBuilder label = new StringBuilder(eObject.getName());

		if (!eObject.getETypeParameters().isEmpty()) {
			label.append("&lt;");
			Iterator<ETypeParameter> tpit = eObject.getETypeParameters().iterator();
			while (tpit.hasNext()) {
				ETypeParameter typeParameter = tpit.next();
				label.append(EObjectAdaptable.adaptTo(typeParameter, ViewActionSupplierFactory.class).create(context).execute(progressMonitor).getText());
				if (tpit.hasNext()) {
					label.append(", ");
				}
			}
			label.append("&gt;");
		}
		action.setText(label.toString());
		
		action.setId(eObject.eClass().getName() + "-" + Hex.encodeHexString(eObject.getEPackage().getNsURI().getBytes(StandardCharsets.UTF_8)) + "-" + eObject.getName());
		
		return action;
	}
	
}
