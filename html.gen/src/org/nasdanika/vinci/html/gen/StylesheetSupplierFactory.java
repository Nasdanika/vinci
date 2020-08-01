package org.nasdanika.vinci.html.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.html.Stylesheet;

public class StylesheetSupplierFactory implements SupplierFactory<ViewPart> {
	
	private Stylesheet target;
	
	public StylesheetSupplierFactory(Stylesheet target) {
		this.target = target;
	}

	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		return Supplier.<ViewPart>fromCallable(() -> {
			return new ViewPart() {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					return viewGenerator.get(HTMLFactory.class).tag(TagName.style, context.interpolate(target.getCode()));
				}
				
			};
		}, target.getTitle(), 1);
	}
	
}
