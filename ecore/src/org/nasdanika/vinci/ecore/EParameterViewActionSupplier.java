package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EParameter;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.app.ActivatorType;

public class EParameterViewActionSupplier extends ETypedElementViewActionSupplier<EParameter> {

	public EParameterViewActionSupplier(EParameter value) {
		super(value);
	}
	
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action ret = super.create(progressMonitor);
		ret.setRole(ActionRole.SECTION.label);
		
		ret.setActivatorType(ActivatorType.NONE);
		return ret;
	}

}
