package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.ncore.NcoreFactory;
import org.nasdanika.ncore.Property;
import org.nasdanika.ncore.Value;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapFactory;
import org.nasdanika.vinci.bootstrap.Table;
import org.nasdanika.vinci.bootstrap.TableCell;
import org.nasdanika.vinci.bootstrap.TableRow;

public class ETypedElementViewActionSupplier<T extends ETypedElement> extends ENamedElementViewActionSupplier<T> {
	
	public ETypedElementViewActionSupplier(T value) {
		super(value);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected void configure(ProgressMonitor monitor) throws Exception {
		super.configure(monitor);

		StringBuilder label = new StringBuilder(eObject.getName());
		EGenericType genericType = eObject.getEGenericType();
		if (genericType != null) {
			label.append(" : ");
			label.append(computeLabel(genericType, monitor));
			if (eObject.isMany()) {
				label.append("*");
			}
		}
		
		action.getContent().add((SupplierFactory) propertiesTable(monitor)); 

//		String name = super.getText();
//		EObject container = target.eContainer();
//		if (container instanceof EClassifier) {
//			EClassifier classifier = (EClassifier) container;
//			label.append(classifier.getName()); /// ???? Why ????
//		} else {
//			label.append(name);
//		}
		action.setText(label.toString());
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
	protected Table propertiesTable(ProgressMonitor monitor) {		
		Table table = BootstrapFactory.eINSTANCE.createTable();
		
		Appearance tableAppearance = BootstrapFactory.eINSTANCE.createAppearance();
		table.setAppearance(tableAppearance);
		Property styleAttribute = NcoreFactory.eINSTANCE.createProperty();
		styleAttribute.setName("style");
		styleAttribute.setValue("width:auto");
		tableAppearance.getAttributes().add(styleAttribute);
		
		EGenericType genericType = eObject.getEGenericType(); // TODO - generic type
		if (genericType != null) {
//			// TODO - generic parameters with links.
//			ViewAction typeViewAction = EObjectAdaptable.adaptTo(type, ViewAction.class);
//			Row typeRow = table.row();
//			typeRow.header(getResourceContext().getString(PropertyKeys.UI_TYPE, "Type"));
//			typeRow.cell(typeViewAction == null ?  type.getName() : viewGenerator.link(typeViewAction));
		}
		
		TableRow cardinalityRow = BootstrapFactory.eINSTANCE.createTableRow();
		table.getRows().add(cardinalityRow);
		
		TableCell cardinalityRowHeader = BootstrapFactory.eINSTANCE.createTableCell();
		cardinalityRow.getCells().add(cardinalityRowHeader);
		cardinalityRowHeader.setHeader(true);
		Value cardinalityHeaderValue = NcoreFactory.eINSTANCE.createValue();
		cardinalityHeaderValue.setValue("Cardinality");
		cardinalityRowHeader.getContent().add(cardinalityHeaderValue);
		
		TableCell cardinalityRowCell = BootstrapFactory.eINSTANCE.createTableCell();
		cardinalityRow.getCells().add(cardinalityRowCell);
		Value cardinalityCellValue = NcoreFactory.eINSTANCE.createValue();
		cardinalityCellValue.setValue(cardinality(eObject));
		cardinalityRowCell.getContent().add(cardinalityCellValue);
		
		return table;
	}

}
