package org.nasdanika.vinci.ecore;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.vinci.app.Action;

public class EClassifierViewActionSupplier<T extends EClassifier> extends ENamedElementViewActionSupplier<T> {

	public EClassifierViewActionSupplier(T value, Context context) {
		super(value, context);
	}
	
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(progressMonitor);
		
		// Instance class
		Class<?> instanceClass = eObject.getInstanceClass();
		if (instanceClass == null) {
			EPackage registeredPackage = (EPackage) EPackage.Registry.INSTANCE.get(eObject.getEPackage().getNsURI());
			if (registeredPackage != null) {
				EClassifier registeredClassifier = registeredPackage.getEClassifier(eObject.getName());
				if (registeredClassifier != null) {
					instanceClass = registeredClassifier.getInstanceClass();
				}
			}
		}
		
		if (instanceClass != null) {
			String instanceClassName = instanceClass.getName();
			Object jdcbm = context.get(EcoreDocumentationGeneratorCommand.JAVADOC_CONTEXT_BUILDER_MOUNT);
			if (jdcbm != null) {
				instanceClassName = "${" + jdcbm + instanceClassName + "}";
			}
			String mc = action.getMarkdownContent();
			if (Util.isBlank(mc)) {
				action.setMarkdownContent("Instance class: ``" + instanceClassName + "``");
			} else {
				action.setMarkdownContent(
						"Instance class: ``" + 
						instanceClassName + 
						"``" +
						System.lineSeparator() +
						System.lineSeparator() +
						mc);				
			}
		}
						
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
