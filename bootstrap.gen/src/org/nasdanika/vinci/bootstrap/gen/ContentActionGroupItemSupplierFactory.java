package org.nasdanika.vinci.bootstrap.gen;

import java.util.List;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.bootstrap.ActionGroup;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.vinci.bootstrap.ContentActionGroupItem;
import org.nasdanika.vinci.html.gen.ContainerAdapter;

public class ContentActionGroupItemSupplierFactory  implements SupplierFactory<ViewBuilder> {
	
	private ContentActionGroupItem target;
	
	public ContentActionGroupItemSupplierFactory(ContentActionGroupItem target) {
		this.target = target;
	}
	
	@Override
	public Supplier<ViewBuilder> create(Context context) throws Exception {
		Supplier<List<ViewPart>> nameSupplier = ContainerAdapter.wrap(EObjectAdaptable.adaptToSupplierFactory(target.getName(), Object.class)).create(context);
		Supplier<List<ViewPart>> contentSupplier = new ContainerAdapter<>(target).createContentSupplierFactory().create(context);
		
		return nameSupplier.then(contentSupplier.asFunction()).then(bs -> new ViewBuilder() {

			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				HTMLFactory htmlFactory = viewGenerator.get(HTMLFactory.class);

				Fragment nameFragment = htmlFactory.fragment();
				for (ViewPart nvp: bs.getFirst()) {
					nameFragment.content(viewGenerator.processViewPart(nvp, progressMonitor));
				}
				
				Fragment contentFragment = htmlFactory.fragment();
				for (ViewPart cvp: bs.getSecond()) {
					contentFragment.content(viewGenerator.processViewPart(cvp, progressMonitor));
				}
				
				((ActionGroup) target).contentAction(
						nameFragment, 
						ContentActionGroupItemSupplierFactory.this.target.isActive(), 
						ContentActionGroupItemSupplierFactory.this.target.isDisabled(), 
						org.nasdanika.common.Util.isBlank(ContentActionGroupItemSupplierFactory.this.target.getColor()) ? null : Color.fromLabel(ContentActionGroupItemSupplierFactory.this.target.getColor()), 
						null, 
						contentFragment);
			}
		
		});
	}

}
