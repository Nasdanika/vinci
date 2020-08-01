package org.nasdanika.vinci.app.gen;

import java.util.List;
import java.util.function.Function;

import org.nasdanika.common.BiSupplier;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.bootstrap.Container.Row.Col;
import org.nasdanika.vinci.app.BootstrapContainerApplicationSection;
import org.nasdanika.vinci.app.impl.BootstrapContainerApplicationPanelImpl;
import org.nasdanika.vinci.bootstrap.gen.BootstrapElementViewBuilderSupplierFactory;
import org.nasdanika.vinci.html.gen.ContainerAdapter;

public class BootstrapContainerApplicationSectionViewBuilderSupplierFactory<T extends BootstrapContainerApplicationSection> extends BootstrapElementViewBuilderSupplierFactory<T> {
		
	public BootstrapContainerApplicationSectionViewBuilderSupplierFactory(T target) {
		super(target);
	}
		
	@Override
	public ViewBuilder.Supplier create(Context context) throws Exception {
		// Content, appearance, combine
		ContainerAdapter<BootstrapContainerApplicationSection> containerAdapter = new ContainerAdapter<BootstrapContainerApplicationSection>(target);
		Supplier<List<ViewPart>> contentSupplier = containerAdapter.createContentSupplierFactory().create(context);
		org.nasdanika.html.app.ViewBuilder.Supplier superSupplier = super.create(context);
		Function<BiSupplier<List<ViewPart>, ViewBuilder>, ViewBuilder> supplier = bs -> new ViewBuilder() {
			
			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				org.nasdanika.html.bootstrap.Container.Row.Col col = (org.nasdanika.html.bootstrap.Container.Row.Col) target;
				configureCol(col);
				for (ViewPart cvp: bs.getFirst()) {
					col.content(viewGenerator.processViewPart(cvp, progressMonitor));
				}
				ViewBuilder svb = bs.getSecond();
				if (svb != null) {
					svb.build(col, viewGenerator, progressMonitor);
				}
			}
			
		};
		return ViewBuilder.Supplier.from(contentSupplier.then(superSupplier.asFunction()).then(supplier));		
	}

	/**
	 * To be overridden by {@link BootstrapContainerApplicationPanelImpl} to configure widths.
	 * @param col
	 */
	protected void configureCol(Col col) {
		
	}	

}
