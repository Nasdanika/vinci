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
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.Container;
import org.nasdanika.vinci.bootstrap.Row;

public class ContainerSupplierFactory implements SupplierFactory<ViewPart> {
	
	private Container target;
	
	public ContainerSupplierFactory(Container target) {
		this.target = target;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		@SuppressWarnings("resource")
		MapCompoundSupplier<String,Object> builderSuppliers = new MapCompoundSupplier<>("Builders");
		Appearance appearance = target.getAppearance();
		if (appearance != null) {
			builderSuppliers.put("Appearance", (Supplier) EObjectAdaptable.adaptToSupplierFactory(appearance, ViewBuilder.class).create(context));
		}
		ListCompoundSupplier<ViewBuilder> rowBuilders = new ListCompoundSupplier<>("Rows");
		for (Row row: target.getRows()) {
			rowBuilders.add(EObjectAdaptable.adaptToSupplierFactory(row, ViewBuilder.class).create(context));
		}
		builderSuppliers.put("Rows", (Supplier) rowBuilders);
		
		return builderSuppliers.then(builders -> new ViewPart() {
				
			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				BootstrapFactory bootstrapFactory = viewGenerator.get(BootstrapFactory.class);
				org.nasdanika.html.bootstrap.Container container = target.isFluid() ? bootstrapFactory.fluidContainer() : bootstrapFactory.container();
				Object appearanceBuilder = builders.get("Appearance");
				if (appearanceBuilder instanceof ViewBuilder) {
					((ViewBuilder) appearanceBuilder).build(container, viewGenerator, progressMonitor);
				}
				
				for (ViewBuilder rowBuilder: (List<ViewBuilder>) builders.get("Rows")) {
					rowBuilder.build(container.row(), viewGenerator, progressMonitor);
				}
				
				return container;				
			}
				
		});				
	}

}
