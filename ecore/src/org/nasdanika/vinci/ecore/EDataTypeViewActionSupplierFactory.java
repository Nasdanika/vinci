package org.nasdanika.vinci.ecore;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.components.ComponentsFactory;
import org.nasdanika.vinci.components.ListOfActions;
import org.nasdanika.vinci.emf.ViewActionSupplier;

public class EDataTypeViewActionSupplierFactory extends EClassifierViewActionSupplier<EDataType> {

	public EDataTypeViewActionSupplierFactory(EDataType value, Context context) {
		super(value, context);
	}
	
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action ret = super.create(progressMonitor);
		
		// Uses
		Collection<EClass> uses = getUses().stream().sorted((a,b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
		if (!uses.isEmpty()) {
			ListOfActions usesList = ComponentsFactory.eINSTANCE.createListOfActions();
			ret.getContent().add(usesList);
			usesList.setDepth(1);
			usesList.setTooltips(true);
			usesList.setHeader("Uses");
			for (EClass use: uses) {
				ViewActionSupplier uvas = EObjectAdaptable.adaptTo(use, ViewActionSupplier.class);
				if (uvas != null) {
					usesList.getActions().add(uvas.getAction(progressMonitor));
				}
			}
		}
		
		return ret;
	}
	
}
