package org.nasdanika.vinci.presentation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.nasdanika.vinci.html.HtmlPackage;

public class PageConfigurator implements InitialObjectConfigurator {

	@Override
	public void addParameter(String name, String value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean accept(EObject eObject) {
		return HtmlPackage.Literals.PAGE.isInstance(eObject);
	}

	@Override
	public String getLabel() {
		return "Template";
	}

	@Override
	public EObject configure(EObject initialModel) {
		// TODO Auto-generated method stub
		return initialModel;
	}

	@Override
	public Control createControl(Composite parent, EObject initialModel) {
		Label lblNewLabel = new Label(parent, SWT.NONE);
		lblNewLabel.setText("New Label: "+initialModel);
		// TODO Auto-generated method stub
		return lblNewLabel;
	}

}
