package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.emf.ViewActionSupplier;

public class EEnumViewActionSupplier extends EClassifierViewActionSupplier<EEnum> {

	public EEnumViewActionSupplier(EEnum value) {
		super(value);
	}
	
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(progressMonitor);
		action.setSectionStyle(SectionStyle.TABLE.label);
		
		for (EEnumLiteral literal: eObject.getELiterals()) {
			ViewActionSupplier elvasf = EObjectAdaptable.adaptTo(literal, ViewActionSupplier.class);
			action.getElements().add(elvasf.getAction(progressMonitor));
		}
		
		return action;
	}

}
