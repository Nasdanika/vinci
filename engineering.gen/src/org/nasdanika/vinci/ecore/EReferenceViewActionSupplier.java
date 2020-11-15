package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EReference;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.vinci.bootstrap.Table;
import org.nasdanika.vinci.components.ActionLink;
import org.nasdanika.vinci.components.ComponentsFactory;
import org.nasdanika.vinci.emf.ViewActionSupplier;

public class EReferenceViewActionSupplier extends EStructuralFeatureViewActionSupplier<EReference> {

	public EReferenceViewActionSupplier(EReference value, Context context) {
		super(value, context);
	}
	
	@Override
	protected Table propertiesTable(ProgressMonitor monitor) throws Exception {
		Table propertiesTable = super.propertiesTable(monitor);
		EReference opposite = eObject.getEOpposite();
		if (opposite != null) {
			ViewActionSupplier oppositeViewActionSupplier = EObjectAdaptable.adaptTo(opposite, ViewActionSupplier.class);
			if (oppositeViewActionSupplier == null) {
				addRow(propertiesTable, "Opposite").add(wrap(opposite.getName()));
			} else {
				ActionLink link = ComponentsFactory.eINSTANCE.createActionLink();
				link.setTarget(oppositeViewActionSupplier.getAction(monitor));
				addRow(propertiesTable, "Opposite").add(link);				
			}
		}
		return propertiesTable;
	}

}
