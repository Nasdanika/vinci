package org.nasdanika.vinci.bootstrap.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.StringMapCompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.Table;
import org.nasdanika.vinci.bootstrap.TableHeader;
import org.nasdanika.vinci.bootstrap.TableSection;

public class TableSupplierFactory extends TableRowContainerAdapter<Table> implements SupplierFactory<ViewPart> {

	public TableSupplierFactory(Table target) {
		super(target);
	}

	@SuppressWarnings("resource")
	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {		
		StringMapCompoundSupplier<ViewBuilder> parts = new StringMapCompoundSupplier<>(target.getTitle());
		
		Appearance appearance = target.getAppearance();
		if (appearance != null) {
			parts.put("Appearance", EObjectAdaptable.adaptToSupplierFactory(appearance, ViewBuilder.class).create(context));
		}
		
		TableHeader header = target.getHeader();
		if (header != null) {
			parts.put("Header", EObjectAdaptable.adaptToSupplierFactory(header, ViewBuilder.class).create(context));
		}
		TableSection body = target.getBody();
		if (body != null) {
			parts.put("Body", EObjectAdaptable.adaptToSupplierFactory(body, ViewBuilder.class).create(context));
		}
		TableSection footer = target.getFooter();
		if (footer != null) {
			parts.put("Footer", EObjectAdaptable.adaptToSupplierFactory(footer, ViewBuilder.class).create(context));
		}
		parts.put("Rows", createRowsBuilderSupplier(context));
		
		return parts.then(partsMap -> new ViewPart() {

			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				org.nasdanika.html.bootstrap.Table table = viewGenerator.get(BootstrapFactory.class).table();
				table.bordered(target.isBordered());
				table.borderless(target.isBorderless());
				table.dark(target.isDark());
				table.hover(target.isHover());
				table.small(target.isSmall());
				table.striped(target.isStriped());
				
				ViewBuilder appearanceBuilder = partsMap.get("Appearance");
				if (appearanceBuilder != null) {
					appearanceBuilder.build(table, viewGenerator, progressMonitor);
				}
				
				ViewBuilder headerBuilder = partsMap.get("Header");
				if (headerBuilder != null) {
					headerBuilder.build(table.header(), viewGenerator, progressMonitor);
				}
				
				ViewBuilder bodyBuilder = partsMap.get("Body");
				if (bodyBuilder != null) {
					bodyBuilder.build(table.body(), viewGenerator, progressMonitor);
				}
				
				ViewBuilder footerBuilder = partsMap.get("Footer");
				if (footerBuilder != null) {
					footerBuilder.build(table.footer(), viewGenerator, progressMonitor);
				}
				
				ViewBuilder rowsBuilder = partsMap.get("Rows");
				if (rowsBuilder != null) {
					rowsBuilder.build(table, viewGenerator, progressMonitor);
				}
				
				return table;
			}
			
		});
		
	}

}
