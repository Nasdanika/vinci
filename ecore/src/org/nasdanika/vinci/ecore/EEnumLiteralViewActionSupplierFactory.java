package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EEnumLiteral;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.Util;

public class EEnumLiteralViewActionSupplierFactory extends ENamedElementViewActionSupplierFactory<EEnumLiteral> {

	public EEnumLiteralViewActionSupplierFactory(EEnumLiteral value) {
		super(value);
	}
	
//	@Override
//	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
//		String description = getDescription();
//		return Util.isBlank(description) ? "" : description;
//	}

}
