package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.emf.ViewActionSupplier;

public class EEnumViewActionSupplier extends EClassifierViewActionSupplier<EEnum> {

	public EEnumViewActionSupplier(EEnum value) {
		super(value);
	}
	
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(progressMonitor);
		
		for (EEnumLiteral literal: eObject.getELiterals()) {
			ViewActionSupplier elvasf = EObjectAdaptable.adaptTo(literal, ViewActionSupplier.class);
			action.getElements().add(elvasf.getAction(progressMonitor));
		}
		
		return action;
	}
	
	@Override
	protected void configure(ProgressMonitor monitor) throws Exception {
		super.configure(monitor);
		
		// TODO (table of) content
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
