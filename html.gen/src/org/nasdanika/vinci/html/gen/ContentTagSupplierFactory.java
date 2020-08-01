package org.nasdanika.vinci.html.gen;

import java.util.Collection;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.StringMapCompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.html.ContentTag;

public class ContentTagSupplierFactory<T extends ContentTag> extends TagSupplierFactory<T> {
	
	public ContentTagSupplierFactory(T target) {
		super(target);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		StringMapCompoundSupplier<Object> mapSupplier = new StringMapCompoundSupplier<>(target.getTitle());
		
		Supplier<ViewPart> tagViewPartSupplier = super.create(context);
		mapSupplier.put("Tag", (Supplier) tagViewPartSupplier);		
		mapSupplier.put((Supplier) new ContainerAdapter(target).createContentSupplierFactory().create(context));
		return mapSupplier.then(map -> {
			return new ViewPart() {

				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					org.nasdanika.html.Tag tag = (org.nasdanika.html.Tag) ((ViewPart) map.get("Tag")).generate(viewGenerator, progressMonitor);
					for (ViewPart viewPart: ((Collection<ViewPart>) map.get("Content"))) {
						tag.accept(viewGenerator.processViewPart(viewPart, progressMonitor));
					}
					return tag;
				}
				
			};
		});
	}
	

}
