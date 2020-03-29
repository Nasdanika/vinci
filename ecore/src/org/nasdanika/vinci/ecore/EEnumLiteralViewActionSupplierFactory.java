package org.nasdanika.vinci.ecore;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.Util;
import org.nasdanika.vinci.app.Action;

public class EEnumLiteralViewActionSupplierFactory extends ENamedElementViewActionSupplierFactory<EEnumLiteral> {

	public EEnumLiteralViewActionSupplierFactory(EEnumLiteral value) {
		super(value);
	}
	
	@Override
	protected Action create(Context context, ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(context, progressMonitor);
		
		action.setId(eObject.eClass().getName() + "-" + Hex.encodeHexString(eObject.getEEnum().getEPackage().getNsURI().getBytes(StandardCharsets.UTF_8)) + "-" + eObject.getEEnum().getName() + "-" + eObject.getName());
		
		return action;
	}
	
}
