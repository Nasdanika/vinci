package org.nasdanika.vinci.ecore;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.app.AppFactory;
import org.nasdanika.vinci.components.ComponentsFactory;
import org.nasdanika.vinci.components.ListOfActions;
import org.nasdanika.vinci.emf.ViewActionSupplier;

public class EEnumViewActionSupplier extends EClassifierViewActionSupplier<EEnum> {

	public EEnumViewActionSupplier(EEnum value, Context context) {
		super(value, context);
	}
	
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(progressMonitor);
		action.setSectionStyle(SectionStyle.DEFAULT.label);
		
		action.getElements().add(createLiteralsAction(progressMonitor));
		action.getElements().add(createUsesAction(progressMonitor));
	
		return action;
	}
	
	protected Action createLiteralsAction(ProgressMonitor progressMonitor) throws Exception {
		Action literalsAction = AppFactory.eINSTANCE.createAction();
		literalsAction.setSectionStyle(SectionStyle.TABLE.label);
		literalsAction.setText("Literals");
		literalsAction.setRole(ActionRole.SECTION.label);
		
		for (EEnumLiteral literal: eObject.getELiterals()) {
			literalsAction.getElements().add(adaptChild(literal).getAction(progressMonitor));
		}
		
		return literalsAction;
	}
		
	protected Action createUsesAction(ProgressMonitor progressMonitor) throws Exception {
		Action usesAction = AppFactory.eINSTANCE.createAction();
		usesAction.setText("Uses");
		usesAction.setRole(ActionRole.SECTION.label);
				
		// Uses
		Collection<EClass> uses = getUses().stream().sorted((a,b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
		if (!uses.isEmpty()) {
			ListOfActions usesList = ComponentsFactory.eINSTANCE.createListOfActions();
			usesAction.getContent().add(usesList);
			usesList.setDepth(1);
			usesList.setTooltips(true);
			for (EClass use: uses) {
				ViewActionSupplier uvas = EObjectAdaptable.adaptTo(use, ViewActionSupplier.class);
				if (uvas != null) {
					usesList.getActions().add(uvas.getAction(progressMonitor));
				}
			}
		}
		
		
		return usesAction;
	}

}
