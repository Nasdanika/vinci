package org.nasdanika.vinci.ecore;

import java.util.Iterator;

import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ETypeParameter;
import org.nasdanika.common.ProgressMonitor;

public class ETypeParameterViewActionSupplier extends ENamedElementViewActionSupplier<ETypeParameter> {

	public ETypeParameterViewActionSupplier(ETypeParameter value) {
		super(value);
	}
	
	@Override
	protected void configure(ProgressMonitor monitor) throws Exception {
		super.configure(monitor);

		StringBuilder label = new StringBuilder();

		label.append(action.getText());

		if (!eObject.getEBounds().isEmpty()) {
			label.append(" extends ");
			for (Iterator<EGenericType> j = eObject.getEBounds().iterator(); j.hasNext();) {
				EGenericType bound = j.next();
				label.append(computeLabel(bound, monitor));
				if (j.hasNext()) {
					label.append(" &amp; ");
				}
			}
			action.setText(label.toString());
		}
	}
	
}
