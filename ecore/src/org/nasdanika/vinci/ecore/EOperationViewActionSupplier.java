package org.nasdanika.vinci.ecore;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionCategory;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.app.AppFactory;
import org.nasdanika.vinci.bootstrap.BootstrapFactory;
import org.nasdanika.vinci.bootstrap.ContentTag;
import org.nasdanika.vinci.emf.ViewActionSupplier;

public class EOperationViewActionSupplier extends ETypedElementViewActionSupplier<EOperation> {

	public EOperationViewActionSupplier(EOperation value) {
		super(value);
	}
		
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(progressMonitor);
		action.setRole(ActionRole.SECTION.label);
		action.setSectionStyle(SectionStyle.DEFAULT.label);
	
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
		
		if (!eObject.getEParameters().isEmpty()) {
			ActionCategory parametersCategory = AppFactory.eINSTANCE.createActionCategory();
			parametersCategory.setText("Parameters");
			action.getElements().add(parametersCategory);
			for (EParameter parameter: eObject.getEParameters()) {
				ViewActionSupplier sfvasf = EObjectAdaptable.adaptTo(parameter, ViewActionSupplier.class);
				parametersCategory.getElements().add(sfvasf.getAction(progressMonitor));
			}
		}
		
		return action;
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected void configure(ProgressMonitor monitor) throws Exception {
		super.configure(monitor);
		
		// Exceptions
		EList<EGenericType> eGenericExceptions = eObject.getEGenericExceptions();
		if (!eGenericExceptions.isEmpty()) {
			ContentTag header = BootstrapFactory.eINSTANCE.createContentTag();
			header.setName(TagName.h3.name());
			header.addContent("Exceptions");
			action.getContent().add((SupplierFactory) header);
			
			ContentTag list = BootstrapFactory.eINSTANCE.createContentTag();
			list.setName(TagName.ul.name());
			action.getContent().add((SupplierFactory) list);
			
			for (EGenericType genericException: eGenericExceptions) {
				ContentTag listItem = BootstrapFactory.eINSTANCE.createContentTag();
				listItem.setName(TagName.li.name());
				list.getContent().add((SupplierFactory) listItem);
				genericType(genericException, listItem.getContent(), monitor);
			}
		}		
	}

}
