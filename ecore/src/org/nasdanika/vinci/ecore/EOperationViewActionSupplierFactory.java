package org.nasdanika.vinci.ecore;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.ETypeParameter;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionRole;

public class EOperationViewActionSupplierFactory extends ETypedElementViewActionSupplierFactory<EOperation> {

	public EOperationViewActionSupplierFactory(EOperation value) {
		super(value);
	}
		
	@Override
	protected Action create(Context context, ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(context, progressMonitor);
		action.setRole(ActionRole.SECTION.label);
	
		StringBuilder idBuilder = new StringBuilder(eObject.eClass().getName())
				.append("-")
				.append(Hex.encodeHexString(eObject.getEContainingClass().getEPackage().getNsURI().getBytes(StandardCharsets.UTF_8)))
				.append("-")
				.append(eObject.getEContainingClass().getName())
				.append("-")
				.append(eObject.getName());
		
		if (!eObject.getEParameters().isEmpty()) {
			// Creating a digest of parameter types to make the id shorter.
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			for (EParameter ep: eObject.getEParameters()) {
				EClassifier type = ep.getEType();
				String typeStr = type.eClass().getName() + "-" + Hex.encodeHexString(type.getEPackage().getNsURI().getBytes(StandardCharsets.UTF_8)) + "-" + type.getName() + ",";
				md.update(typeStr.getBytes(StandardCharsets.UTF_8));
			}
			idBuilder.append("-").append(Hex.encodeHexString(md.digest()));
		}
		
		action.setId(idBuilder.toString());		
		
		return action;
	}
	
	
	// TODO - parameters.
	
	// TODO - id - signature.
	
//	@Override
//	public String getText() {
//		StringBuilder label = new StringBuilder();
//
//		if (!target.getETypeParameters().isEmpty()) {
//			label.append("&lt;");
//			for (Iterator<ETypeParameter> i = target.getETypeParameters().iterator(); i.hasNext();) {
//				ETypeParameter typeParameter = i.next();
//				label.append(EObjectAdaptable.adaptTo(typeParameter, ViewAction.class).getText());
//				if (i.hasNext()) {
//					label.append(", ");
//				}
//			}
//			label.append("&gt; ");
//		}
//
//		if (target.getEGenericType() == null) {
//			label.append("void ");
//		}
//		label.append(super.getText());
//
//		if (!target.getEParameters().isEmpty()) {
//			label.append("(");
//			for (Iterator<EParameter> i = target.getEParameters().iterator(); i.hasNext();) {
//				EParameter parameter = i.next();
//				label.append(EObjectAdaptable.adaptTo(parameter, ViewAction.class).getText());
//				if (i.hasNext()) {
//					label.append(", ");
//				}
//			}
//			label.append(")");
//		}
//
//		if (!target.getEExceptions().isEmpty()) {
//			label.append(" throws ");
//			for (Iterator<EClassifier> i = target.getEExceptions().iterator(); i.hasNext();) {
//				EClassifier exception = i.next();
//				label.append(EObjectAdaptable.adaptTo(exception, ViewAction.class).getText());
//				if (i.hasNext()) {
//					label.append(", ");
//				}
//			}
//		}
//
//		return label.toString();		
//	}

}
