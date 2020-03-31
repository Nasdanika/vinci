package org.nasdanika.vinci.ecore;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionRole;

public class EEnumLiteralViewActionSupplier extends ENamedElementViewActionSupplier<EEnumLiteral> {

	public EEnumLiteralViewActionSupplier(EEnumLiteral value) {
		super(value);
	}
	
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(progressMonitor);
		action.setRole(ActionRole.SECTION.label);
		
		action.setId(eObject.eClass().getName() + "-" + Hex.encodeHexString(eObject.getEEnum().getEPackage().getNsURI().getBytes(StandardCharsets.UTF_8)) + "-" + eObject.getEEnum().getName() + "-" + eObject.getName());
		
		return action;
	}
	
}