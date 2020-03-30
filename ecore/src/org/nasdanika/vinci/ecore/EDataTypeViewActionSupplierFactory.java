package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EDataType;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.Util;

public class EDataTypeViewActionSupplierFactory extends EClassifierViewActionSupplier<EDataType> {

	public EDataTypeViewActionSupplierFactory(EDataType value) {
		super(value);
	}
	
//	@Override
//	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
//		String description = getDescription();
//		return Util.isBlank(description) ? "" : description;
//	}
	
}
