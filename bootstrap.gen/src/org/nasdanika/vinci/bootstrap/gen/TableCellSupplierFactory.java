package org.nasdanika.vinci.bootstrap.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.TableCell;
import org.nasdanika.vinci.html.gen.ContainerAdapter;

public class TableCellSupplierFactory implements SupplierFactory<ViewBuilder> {
	
	private TableCell target;

	public TableCellSupplierFactory(TableCell target) {
		this.target = target;
	}

	@Override
	public Supplier<ViewBuilder> create(Context context) throws Exception {
		
		Supplier<ViewBuilder> ret = new ContainerAdapter<>(target).createContentSupplierFactory().create(context).then(content -> new ViewBuilder() {

			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				org.nasdanika.html.bootstrap.RowContainer.Row row = (org.nasdanika.html.bootstrap.RowContainer.Row) target;
				org.nasdanika.html.bootstrap.RowContainer.Row.Cell cell = TableCellSupplierFactory.this.target.isHeader() ? row.header() : row.cell();
				if (!Util.isBlank(TableCellSupplierFactory.this.target.getBackground())) {
					cell.background(Color.fromLabel(TableCellSupplierFactory.this.target.getBackground()));
				}
				String color = TableCellSupplierFactory.this.target.getColor();
				if (!Util.isBlank(color)) {
					cell.color(Color.fromLabel(color));
				}
				int colSpan = TableCellSupplierFactory.this.target.getColSpan();
				if (colSpan > 1) {
					cell.toHTMLElement().colspan(colSpan);
				}
				int rowSpan = TableCellSupplierFactory.this.target.getRowSpan();
				if (rowSpan > 1) {
					cell.toHTMLElement().rowspan(rowSpan);
				}
				for (ViewPart cvp: content) {
					cell.toHTMLElement().accept(viewGenerator.processViewPart(cvp, progressMonitor));
				}
				
			}
			
		});
		
		Appearance appearance = TableCellSupplierFactory.this.target.getAppearance();
		if (appearance == null) {
			return ret;
		}
		
		return ret.then(EObjectAdaptable.adaptToSupplierFactory(appearance, ViewBuilder.class).create(context).asFunction()).then(bs -> bs.getFirst().compose(bs.getSecond()));
	}

}
