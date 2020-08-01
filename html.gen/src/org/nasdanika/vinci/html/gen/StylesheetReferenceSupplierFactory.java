package org.nasdanika.vinci.html.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.html.StylesheetReference;

public class StylesheetReferenceSupplierFactory implements SupplierFactory<ViewPart> {
	
	private StylesheetReference target;
	
	public StylesheetReferenceSupplierFactory(StylesheetReference target) {
		this.target = target;
	}

	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		return Supplier.<ViewPart>fromCallable(() -> {
			return new ViewPart() {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					return viewGenerator.get(HTMLFactory.class).tag(TagName.link)
							.attribute("href", context.interpolate(target.getHref()))
							.attribute("rel", "stylesheet")
							.attribute("type", "text/css"); 
				}
				
			};
		}, target.getTitle(), 1);
	}
	
}
