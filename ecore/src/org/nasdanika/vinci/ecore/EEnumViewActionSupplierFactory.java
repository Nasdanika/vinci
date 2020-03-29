package org.nasdanika.vinci.ecore;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.emf.ViewActionSupplierFactory;

public class EEnumViewActionSupplierFactory extends EClassifierViewActionSupplierFactory<EEnum> {

	public EEnumViewActionSupplierFactory(EEnum value) {
		super(value);
	}
	
	@Override
	protected Action create(Context context, ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(context, progressMonitor);
		
		// TODO (table of) content
		
		for (EEnumLiteral literal: eObject.getELiterals()) {
			ViewActionSupplierFactory elvasf = EObjectAdaptable.adaptTo(literal, ViewActionSupplierFactory.class);
			action.getElements().add(elvasf.create(context).execute(progressMonitor));
		}
		
		return action;
	}
	
	
//	@Override
//	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
//		BootstrapFactory bootstrapFactory = viewGenerator.get(BootstrapFactory.class);
//		Container contentContainer = bootstrapFactory.fluidContainer();
//		contentContainer.text().alignment(Alignment.LEFT);
//		String description = getDescription();
//		if (!Util.isBlank(description)) {
//			contentContainer.row().col(description).width(Breakpoint.DEFAULT, Size.NONE);
//		}
//		
//		// TODO - enum literals table.
//		
//		return contentContainer;
//	}
//		
//	@Override
//	public List<Action> getChildren() {
//		List<Action> ret = new ArrayList<>();
//		
//		for (EEnumLiteral literal: target.getELiterals()) {			
//			Action literalAction = adaptTo(literal, ViewAction.class);
//			if (literalAction != null) {
//				ret.add(filterChildAction(literalAction, Action.Role.NAVIGATION, null));
//			}
//		}
//		return ret;
//	}	

}
