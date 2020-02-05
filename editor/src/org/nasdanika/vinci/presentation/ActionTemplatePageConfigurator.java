package org.nasdanika.vinci.presentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.provider.ActionPageTemplateComposite;


public class ActionTemplatePageConfigurator implements InitialObjectConfigurator {

	@Override
	public void addParameter(String name, String value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean accept(EObject eObject) {
		return AppPackage.Literals.ACTION_BASE.isInstance(eObject);
	}

	@Override
	public String getLabel() {
		return "Page Template";
	}

	@Override
	public EObject configure(EObject initialModel) {
		((ActionBase) initialModel).setPageTemplate(actionPageTemplateComposite.getTemplateURI());
		return initialModel;
	}
	
	private ActionPageTemplateComposite actionPageTemplateComposite;

	@Override
	public Control createControl(Composite parent, EObject initialModel) {
		actionPageTemplateComposite = new ActionPageTemplateComposite(parent, SWT.NONE);		
		return actionPageTemplateComposite;
	}
	
}
