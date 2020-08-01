package org.nasdanika.vinci.bootstrap.gen;

import java.util.List;

import org.nasdanika.common.Context;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.bootstrap.RowContainer;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.vinci.bootstrap.TableRowContainer;

public abstract class TableRowContainerAdapter<T extends TableRowContainer> {
	
	protected T target;
	
	public TableRowContainerAdapter(T target) {
		this.target = target;
	}
	
	protected Supplier<ViewBuilder> createRowsBuilderSupplier(Context context) throws Exception {
		Supplier<List<ViewBuilder>> rowBuilderSuppliers = new ListCompoundSupplierFactory<ViewBuilder>("Rows", EObjectAdaptable.adaptToSupplierFactory(target.getRows(), ViewBuilder.class)).create(context);
		
		Supplier<ViewBuilder> rowsBuilderSupplier = rowBuilderSuppliers.then(rowBuilders -> new ViewBuilder() {

			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				RowContainer<?,?> rowContainer = (RowContainer<?,?>) target;
				for (ViewBuilder rb: rowBuilders) {
					rb.build(rowContainer.row(), viewGenerator, progressMonitor);
				}
			}
			
		});
		return rowsBuilderSupplier;
	}	

}
