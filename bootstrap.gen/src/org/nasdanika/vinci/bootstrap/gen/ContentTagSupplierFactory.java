package org.nasdanika.vinci.bootstrap.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.StringMapCompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.ContentTag;

public class ContentTagSupplierFactory extends org.nasdanika.vinci.html.gen.ContentTagSupplierFactory<ContentTag> {

	public ContentTagSupplierFactory(ContentTag target) {
		super(target);
	}
		
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		Appearance appearance = target.getAppearance();
		if (appearance == null) {
			return super.create(context);
		}
		
		Supplier<ViewBuilder> appearanceSupplier = EObjectAdaptable.adaptToSupplierFactory(appearance, ViewBuilder.class).create(context);
		
		StringMapCompoundSupplier<Object> partsSupplier = new StringMapCompoundSupplier<Object>(target.getTitle());
		partsSupplier.put("Appearance", (Supplier) appearanceSupplier);
		partsSupplier.put("Tag", (Supplier) super.create(context));
		
		return partsSupplier.then(map -> new ViewPart() {

			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				Object ret = ((ViewPart) map.get("Tag")).generate(viewGenerator, progressMonitor);
				Object avb = map.get("Appearance");
				if (avb instanceof ViewBuilder) {
					((ViewBuilder) avb).build(ret, viewGenerator, progressMonitor);
				}
				return ret;
			}
			
		});
	}	

}
