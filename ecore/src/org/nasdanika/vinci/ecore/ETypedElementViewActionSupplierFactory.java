package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.vinci.app.Action;

public class ETypedElementViewActionSupplierFactory<T extends ETypedElement> extends ENamedElementViewActionSupplierFactory<T> {
	
	public ETypedElementViewActionSupplierFactory(T value) {
		super(value);
	}
	
	@Override
	protected Action create(Context context, ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(context, progressMonitor);

		StringBuilder label = new StringBuilder(eObject.getName());
		EGenericType genericType = eObject.getEGenericType();
		if (genericType != null) {
			label.append(" : ");
			label.append(computeLabel(genericType, context, progressMonitor));
			if (eObject.isMany()) {
				label.append("*");
			}
		}

//		String name = super.getText();
//		EObject container = target.eContainer();
//		if (container instanceof EClassifier) {
//			EClassifier classifier = (EClassifier) container;
//			label.append(classifier.getName()); /// ???? Why ????
//		} else {
//			label.append(name);
//		}
		action.setText(label.toString());
		
		// TODO content - properties, description.
		
		return action;
	}
	
//	@Override
//	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
//		BootstrapFactory bootstrapFactory = viewGenerator.get(BootstrapFactory.class);
//		Container contentContainer = bootstrapFactory.fluidContainer();
//		contentContainer.text().alignment(Alignment.LEFT);
//		Table propertiesTable = propertiesTable(viewGenerator);
//		if (!propertiesTable.toHTMLElement().isEmpty()) {
//			contentContainer.row().col(propertiesTable)
//				.width(Breakpoint.DEFAULT, Size.NONE)
//				.padding().bottom(Breakpoint.DEFAULT, Size.S3);
//		}
//		String description = getDescription();
//		if (!Util.isBlank(description)) {
//			contentContainer.row().col(description).width(Breakpoint.DEFAULT, Size.NONE);
//		}		
//		
//		return contentContainer;
//	}
//	
//	protected Table propertiesTable(ViewGenerator viewGenerator) {
//		Table table = viewGenerator.get(BootstrapFactory.class).table();
//		table.toHTMLElement().style().width("auto");
//		
//		EClassifier type = target.getEType();
//		if (type != null) {
//			ViewAction typeViewAction = EObjectAdaptable.adaptTo(type, ViewAction.class);
//			Row typeRow = table.row();
//			typeRow.header(getResourceContext().getString(PropertyKeys.UI_TYPE, "Type"));
//			typeRow.cell(typeViewAction == null ?  type.getName() : viewGenerator.link(typeViewAction));
//		}
//		
//		Row cardinalityRow = table.row();
//		cardinalityRow.header(getResourceContext().getString(PropertyKeys.UI_CARDINALITY, "Cardinality"));
//		cardinalityRow.cell(cardinality(target));
//		
//		return table;
//	}

}
