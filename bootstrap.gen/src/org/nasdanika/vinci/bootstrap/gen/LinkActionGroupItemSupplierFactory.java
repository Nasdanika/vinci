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
import org.nasdanika.vinci.bootstrap.LinkActionGroupItem;
import org.nasdanika.vinci.html.gen.ContainerAdapter;

public class LinkActionGroupItemSupplierFactory implements SupplierFactory<ViewBuilder> {
	
	private LinkActionGroupItem target;

	public LinkActionGroupItemSupplierFactory(LinkActionGroupItem target) {
		this.target = target;
	}
	
	@Override
	public Supplier<ViewBuilder> create(Context context) throws Exception {
		Supplier<List<ViewPart>> nameSupplier = ContainerAdapter.wrap(EObjectAdaptable.adaptToSupplierFactory(LinkActionGroupItemSupplierFactory.this.target.getName(), Object.class)).create(context);
		return nameSupplier.then(nameViewParts -> new ViewBuilder() {

			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				HTMLFactory htmlFactory = viewGenerator.get(HTMLFactory.class);
				Fragment nameFragment = htmlFactory.fragment();
				for (ViewPart nvp: nameViewParts) {
					nameFragment.content(viewGenerator.processViewPart(nvp, progressMonitor));
				}
				
				String color = LinkActionGroupItemSupplierFactory.this.target.getColor();
				((ActionGroup) target).action(
						LinkActionGroupItemSupplierFactory.this.target.isActive(), 
						LinkActionGroupItemSupplierFactory.this.target.isDisabled(), 
						org.nasdanika.common.Util.isBlank(color) ? null : Color.fromLabel(color),
								LinkActionGroupItemSupplierFactory.this.target.getUrl(),		
						nameFragment);
			}
			
		});
	}
	

}
