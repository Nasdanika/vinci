package org.nasdanika.vinci.html.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.html.ViewPartAdapter;

public class ViewPartAdapterSupplierFactory implements SupplierFactory<ViewPart> {
	
	protected ViewPartAdapter target;
	
	public ViewPartAdapterSupplierFactory(ViewPartAdapter target) {
		this.target = target;
	}
		
	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		return EObjectAdaptable.adaptTo(target, ViewPart.Supplier.Factory.class, target.getFactory()).create(context);
	}	

}
