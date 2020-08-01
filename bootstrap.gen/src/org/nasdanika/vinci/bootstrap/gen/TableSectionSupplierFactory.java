package org.nasdanika.vinci.bootstrap.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.StringMapCompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.TableSection;

public class TableSectionSupplierFactory<T extends TableSection> extends TableRowContainerAdapter<T> implements SupplierFactory<ViewBuilder> {

	public TableSectionSupplierFactory(T target) {
		super(target);
	}

	@Override
	public Supplier<ViewBuilder> create(Context context) throws Exception {		
		StringMapCompoundSupplier<ViewBuilder> parts = new StringMapCompoundSupplier<>(target.getTitle());
		
		Appearance appearance = target.getAppearance();
		if (appearance != null) {
			parts.put("Appearance", EObjectAdaptable.adaptToSupplierFactory(appearance, ViewBuilder.class).create(context));
		}
		parts.put("Rows", createRowsBuilderSupplier(context));
		
		return parts.then(partsMap -> new ViewBuilder() {
			
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				org.nasdanika.html.bootstrap.RowContainer<?,?> rowContainer = (org.nasdanika.html.bootstrap.RowContainer<?,?>) target;
				
				ViewBuilder appearanceBuilder = partsMap.get("Appearance");
				if (appearanceBuilder != null) {
					appearanceBuilder.build(rowContainer, viewGenerator, progressMonitor);
				}
				
				ViewBuilder rowsBuilder = partsMap.get("Rows");
				if (rowsBuilder != null) {
					rowsBuilder.build(rowContainer, viewGenerator, progressMonitor);
				}
			}

		});
		
	}

}
