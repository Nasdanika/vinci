package org.nasdanika.vinci.bootstrap.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.vinci.bootstrap.TableHeader;

public class TableHeaderSupplierFactory extends TableSectionSupplierFactory<TableHeader> {
	
	public TableHeaderSupplierFactory(TableHeader target) {
		super(target);
	}

	@Override
	public Supplier<ViewBuilder> create(Context context) throws Exception {
		return super.create(context).then(vb -> vb.compose(new ViewBuilder() {

			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				org.nasdanika.html.bootstrap.Table.TableHeader header = (org.nasdanika.html.bootstrap.Table.TableHeader) target;
				header.dark(TableHeaderSupplierFactory.this.target.isDark());
				header.light(TableHeaderSupplierFactory.this.target.isLight());
			}
			
		}));
	}

}
