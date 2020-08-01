package org.nasdanika.vinci.bootstrap.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.vinci.bootstrap.ActionGroup;
import org.nasdanika.vinci.bootstrap.ActionGroupItem;
import org.nasdanika.vinci.bootstrap.ContentActionGroupItem;

public class ActionGroupSupplierFactory implements SupplierFactory<ViewPart> {
	
	ActionGroup target;
	
	public ActionGroupSupplierFactory(ActionGroup target) {
		this.target = target;
	}
	
	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		ListCompoundSupplierFactory<ViewBuilder> itemsSupplierFactory = new ListCompoundSupplierFactory<ViewBuilder>("Items", EObjectAdaptable.adaptToSupplierFactory(target.getItems(), ViewBuilder.class));
		
		return itemsSupplierFactory.create(context).then(itemBuilders -> new ViewPart() {

			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				org.nasdanika.html.bootstrap.ActionGroup actionGroup = viewGenerator.get(BootstrapFactory.class).actionGroup(target.isFlush());
				for (ViewBuilder itemBuilder: itemBuilders) {
					itemBuilder.build(actionGroup, viewGenerator, progressMonitor);
				}
				for (ActionGroupItem item: target.getItems()) {
					if (item instanceof ContentActionGroupItem) {
						return actionGroup.asContainer(true);
					}			
				}
				return actionGroup;
			}
			
		});
	}	

}
