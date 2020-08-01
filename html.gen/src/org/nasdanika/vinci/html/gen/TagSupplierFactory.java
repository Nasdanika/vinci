package org.nasdanika.vinci.html.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.MapCompoundSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.ncore.Entry;
import org.nasdanika.vinci.html.Tag;

public class TagSupplierFactory<T extends Tag> implements SupplierFactory<ViewPart> {
	
	protected T target;
	
	public TagSupplierFactory(T target) {
		this.target = target;
	}
		
	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		ViewPart tagViewPart = new ViewPart() {

			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				return viewGenerator.get(HTMLFactory.class, HTMLFactory.INSTANCE).tag(target.getName());
			}
			
		};
				
		Supplier<ViewPart> viewPartSupplier = Supplier.from(tagViewPart, target.getTitle());
		
		if (target.getAttributes().isEmpty()) {
			return viewPartSupplier;
		}
				
		@SuppressWarnings("resource")
		MapCompoundSupplier<String,Object> attrsSupplier = new MapCompoundSupplier<>("Attributes");
		
		for (Entry e: target.getAttributes()) {
			if (e.isEnabled()) {
				attrsSupplier.put(e.getName(), EObjectAdaptable.adaptToSupplierFactory(e, Object.class).create(context));
			}
		}
		
		return viewPartSupplier.then(attrsSupplier.asFunction()).then(bs -> new ViewPart() {

			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				org.nasdanika.html.Tag ret = (org.nasdanika.html.Tag) bs.getFirst().generate(viewGenerator, progressMonitor);
				ret.attributes(bs.getSecond());
				return ret;
			}
			
		});
		
	}	

}
