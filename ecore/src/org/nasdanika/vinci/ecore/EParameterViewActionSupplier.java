package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EParameter;
import org.nasdanika.vinci.app.ActionRole;

public class EParameterViewActionSupplier extends ETypedElementViewActionSupplier<EParameter> {

	public EParameterViewActionSupplier(EParameter value) {
		super(value);
		action.setRole(ActionRole.SECTION.label);
	}

}
