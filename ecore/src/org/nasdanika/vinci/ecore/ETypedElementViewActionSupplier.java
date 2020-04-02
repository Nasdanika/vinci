package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ETypedElement;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.ncore.NcoreFactory;
import org.nasdanika.ncore.Property;
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
		action.setText(label.toString());
	}

	protected Table propertiesTable(ProgressMonitor monitor) throws Exception {		
		Table table = BootstrapFactory.eINSTANCE.createTable();
		
		Appearance tableAppearance = BootstrapFactory.eINSTANCE.createAppearance();
		table.setAppearance(tableAppearance);
		Property styleAttribute = NcoreFactory.eINSTANCE.createProperty();
		styleAttribute.setName("style");
		styleAttribute.setValue("width:auto");
		tableAppearance.getAttributes().add(styleAttribute);
		
		EGenericType genericType = eObject.getEGenericType(); 
		if (genericType != null) {
			TableRow typeRow = BootstrapFactory.eINSTANCE.createTableRow();
			table.getRows().add(typeRow);
			
			TableCell typeRowHeader = BootstrapFactory.eINSTANCE.createTableCell();
			typeRow.getCells().add(typeRowHeader);
			typeRowHeader.setHeader(true);
			typeRowHeader.getContent().add(wrap("Type"));
			
			TableCell typeRowCell = BootstrapFactory.eINSTANCE.createTableCell();
			typeRow.getCells().add(typeRowCell);
			genericType(genericType, typeRowCell.getContent(), monitor);
		}
		
		TableRow cardinalityRow = BootstrapFactory.eINSTANCE.createTableRow();
		table.getRows().add(cardinalityRow);
		
		TableCell cardinalityRowHeader = BootstrapFactory.eINSTANCE.createTableCell();
		cardinalityRow.getCells().add(cardinalityRowHeader);
		cardinalityRowHeader.setHeader(true);
		cardinalityRowHeader.getContent().add(wrap("Cardinality"));
		
		TableCell cardinalityRowCell = BootstrapFactory.eINSTANCE.createTableCell();
		cardinalityRow.getCells().add(cardinalityRowCell);
		cardinalityRowCell.getContent().add(wrap(cardinality(eObject)));
		
		return table;
	}

}
