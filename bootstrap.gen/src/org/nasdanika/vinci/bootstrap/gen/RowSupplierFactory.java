package org.nasdanika.vinci.bootstrap.gen;

import java.util.List;

import org.nasdanika.common.Context;
import org.nasdanika.common.ListCompoundSupplier;
import org.nasdanika.common.MapCompoundSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.Column;
import org.nasdanika.vinci.bootstrap.Row;

public class RowSupplierFactory implements SupplierFactory<ViewBuilder> {
	
	private Row target;

	public RowSupplierFactory(Row target) {
		this.target = target;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Supplier<ViewBuilder> create(Context context) throws Exception {
		@SuppressWarnings("resource")
		MapCompoundSupplier<String,Object> builderSuppliers = new MapCompoundSupplier<>("Builders");
		Appearance appearance = target.getAppearance();
		if (appearance != null) {
			builderSuppliers.put("Appearance", (Supplier) EObjectAdaptable.adaptToSupplierFactory(appearance, ViewBuilder.class).create(context));
		}
		ListCompoundSupplier<ViewBuilder> colBuilders = new ListCompoundSupplier<>("Cols");
		for (Column col: target.getColumns()) {
			colBuilders.add(EObjectAdaptable.adaptToSupplierFactory(col, ViewBuilder.class).create(context));
		}
		builderSuppliers.put("Cols", (Supplier) colBuilders);
		
		return builderSuppliers.then(builders -> new ViewBuilder() {
				
			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				org.nasdanika.html.bootstrap.Container.Row row = (org.nasdanika.html.bootstrap.Container.Row) target; 
				Object appearanceBuilder = builders.get("Appearance");
				if (appearanceBuilder instanceof ViewBuilder) {
					((ViewBuilder) appearanceBuilder).build(row, viewGenerator, progressMonitor);
				}
				
				for (ViewBuilder colBuilder: (List<ViewBuilder>) builders.get("Cols")) {
					colBuilder.build(row.col(), viewGenerator, progressMonitor);
				}
			}
				
		});
		
	}

}
