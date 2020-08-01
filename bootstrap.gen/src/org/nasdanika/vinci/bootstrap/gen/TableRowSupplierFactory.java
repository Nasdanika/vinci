package org.nasdanika.vinci.bootstrap.gen;

import java.util.List;

import org.nasdanika.common.Context;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.StringMapCompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.TableRow;

public class TableRowSupplierFactory implements SupplierFactory<ViewBuilder> {
	
	private TableRow target;


	public TableRowSupplierFactory(TableRow target) {
		this.target = target;
	}
	
	protected Supplier<ViewBuilder> createCellsBuilderSupplier(Context context) throws Exception {
		Supplier<List<ViewBuilder>> cellBuilderSuppliers = new ListCompoundSupplierFactory<ViewBuilder>("Cells", EObjectAdaptable.adaptToSupplierFactory(target.getCells(), ViewBuilder.class)).create(context);
		
		Supplier<ViewBuilder> cellsBuilderSupplier = cellBuilderSuppliers.then(cellBuilders -> new ViewBuilder() {
	
			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				org.nasdanika.html.bootstrap.RowContainer.Row row = (org.nasdanika.html.bootstrap.RowContainer.Row) target;
				for (ViewBuilder cb: cellBuilders) {
					cb.build(row, viewGenerator, progressMonitor);
				}
			}
			
		});
		return cellsBuilderSupplier;
	}		
		
	@SuppressWarnings("resource")
	@Override
	public Supplier<ViewBuilder> create(Context context) throws Exception {		
		StringMapCompoundSupplier<ViewBuilder> parts = new StringMapCompoundSupplier<>(target.getTitle());
		
		Appearance appearance = target.getAppearance();
		if (appearance != null) {
			parts.put("Appearance", EObjectAdaptable.adaptToSupplierFactory(appearance, ViewBuilder.class).create(context));
		}
		parts.put("Cells", createCellsBuilderSupplier(context));
		
		return parts.then(partsMap -> new ViewBuilder() {
			
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				org.nasdanika.html.bootstrap.RowContainer.Row row = (org.nasdanika.html.bootstrap.RowContainer.Row) target;
	
				if (!Util.isBlank(TableRowSupplierFactory.this.target.getBackground())) {
					row.background(Color.fromLabel(TableRowSupplierFactory.this.target.getBackground()));
				}
				if (!Util.isBlank(TableRowSupplierFactory.this.target.getColor())) {
					row.color(Color.fromLabel(TableRowSupplierFactory.this.target.getColor()));
				}
				
				ViewBuilder appearanceBuilder = partsMap.get("Appearance");
				if (appearanceBuilder != null) {
					appearanceBuilder.build(row, viewGenerator, progressMonitor);
				}
				
				ViewBuilder cellsBuilder = partsMap.get("Cells");
				if (cellsBuilder != null) {
					cellsBuilder.build(row, viewGenerator, progressMonitor);
				}
			}
	
		});
		
	}

}
