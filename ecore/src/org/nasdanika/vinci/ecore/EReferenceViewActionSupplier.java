package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EReference;

public class EReferenceViewActionSupplier extends EStructuralFeatureViewActionSupplier<EReference> {

	public EReferenceViewActionSupplier(EReference value) {
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
