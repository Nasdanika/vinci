package org.nasdanika.vinci.bootstrap.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ListCompoundSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapElement;

public class BootstrapElementViewBuilderSupplierFactory implements ViewBuilder.Supplier.Factory {
	
	private BootstrapElement target;

	public BootstrapElementViewBuilderSupplierFactory(BootstrapElement target) {
		this.target = target;
	}	
	
	public ViewBuilder.Supplier create(Context context) throws Exception {
		Appearance appearance = target.getAppearance();
		if (appearance == null) {
			return new ViewBuilder.Supplier() {

				@Override
				public ViewBuilder execute(ProgressMonitor progressMonitor) throws Exception {
					return new ViewBuilder() {

						@Override
						public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
							// NOP							
						}
						
					};
				}

				@Override
				public double size() {
					return 0;
				}

				@Override
				public String name() {
					return "Empty supplier";
				}
				
			};
		}
		@SuppressWarnings("resource")
		ListCompoundSupplier<ViewBuilder> viewBuilderSupplier = new ListCompoundSupplier<>(target.getTitle() + " as View Builder", super.asViewBuilderSupplier(context), appearance.create(context));
		return viewBuilderSupplier.then(elements -> elements.stream().reduce(ViewBuilder.NOP, (a,b) -> a.compose(b)));
	}
	

}
