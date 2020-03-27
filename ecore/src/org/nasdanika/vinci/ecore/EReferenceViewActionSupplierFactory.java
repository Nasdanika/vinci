package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.localization.PropertyKeys;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.RowContainer.Row;
import org.nasdanika.html.bootstrap.RowContainer.Row.Cell;
import org.nasdanika.html.bootstrap.Table;

public class EReferenceViewActionSupplierFactory extends EStructuralFeatureViewActionSupplierFactory<EReference> {

	public EReferenceViewActionSupplierFactory(EReference value) {
		super(value);
	}
	
//	@Override
//	protected Table propertiesTable(ViewGenerator viewGenerator) {
//		Table ret = super.propertiesTable(viewGenerator);
//		EReference opposite = target.getEOpposite();
//		if (opposite != null) {
//			ViewAction oppositeViewAction = EObjectAdaptable.adaptTo(opposite, ViewAction.class);
//			EObject oppositeContainer = opposite.eContainer();
//			ViewAction oppositeContainerViewAction = EObjectAdaptable.adaptTo(oppositeContainer, ViewAction.class);
//			Row typeRow = ret.row();
//			typeRow.header(getResourceContext().getString(PropertyKeys.UI_OPPOSITE, "Opposite"));
//			Cell refCell = typeRow.cell();
//			if (oppositeContainerViewAction != null) {
//				refCell.toHTMLElement().content(viewGenerator.link(oppositeContainerViewAction), "/");				
//			}
//			refCell.toHTMLElement().content(oppositeViewAction == null ?  opposite.getName() : viewGenerator.link(oppositeViewAction));
//		}
//		return ret;
//	}

}
