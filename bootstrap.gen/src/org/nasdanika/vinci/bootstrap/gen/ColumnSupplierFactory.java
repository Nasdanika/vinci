package org.nasdanika.vinci.bootstrap.gen;

import java.util.List;

import org.nasdanika.common.Context;
import org.nasdanika.common.ElementIdentityMapCompoundSupplierFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.bootstrap.Breakpoint;
import org.nasdanika.html.bootstrap.Container.Row.Col;
import org.nasdanika.html.bootstrap.Size;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.Column;
import org.nasdanika.vinci.bootstrap.ColumnWidth;
import org.nasdanika.vinci.html.gen.ContainerAdapter;

public class ColumnSupplierFactory implements SupplierFactory<ViewBuilder> {
	
	private Column target;
	
	public ColumnSupplierFactory(Column target) {
		this.target = target;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Supplier<ViewBuilder> create(Context context) throws Exception {
		
		ElementIdentityMapCompoundSupplierFactory<Object> mapSupplierFactory = new ElementIdentityMapCompoundSupplierFactory<>(target.getTitle());
		Appearance appearance = target.getAppearance();
		mapSupplierFactory.put((SupplierFactory) appearance);
				
		SupplierFactory contentSupplierFactory = (SupplierFactory) new ContainerAdapter(target).createContentSupplierFactory();
		mapSupplierFactory.put(contentSupplierFactory);
		
		return mapSupplierFactory.create(context).then(results -> new ViewBuilder( ) {

			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				Col col = (Col) target;
				for (ColumnWidth cw: ColumnSupplierFactory.this.target.getWidth()) {
					Breakpoint breakpoint = Util.isBlank(cw.getBreakpoint()) ? Breakpoint.DEFAULT : Breakpoint.fromLabel(cw.getBreakpoint());
					Size width = Util.isBlank(cw.getWidth()) ? Size.NONE : Size.fromCode(cw.getWidth());
					col.width(breakpoint, width);
				}
				
				ViewBuilder apperanceBuilder = (ViewBuilder) results.apply((SupplierFactory) appearance);
				if (apperanceBuilder != null) {
					apperanceBuilder.build(target, viewGenerator, progressMonitor);
				}
				
				for (ViewPart contentViewPart: (List<ViewPart>) results.apply(contentSupplierFactory)) {
					col.content(viewGenerator.processViewPart(contentViewPart, progressMonitor));
				}
			}
			
		});		
	}

}
