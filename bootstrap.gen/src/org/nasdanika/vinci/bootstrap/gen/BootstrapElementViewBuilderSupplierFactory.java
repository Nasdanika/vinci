package org.nasdanika.vinci.bootstrap.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapElement;

public class BootstrapElementViewBuilderSupplierFactory<T extends BootstrapElement> implements ViewBuilder.Supplier.Factory {
	
	protected T target;

	public BootstrapElementViewBuilderSupplierFactory(T target) {
		this.target = target;
	}	
	
	public ViewBuilder.Supplier create(Context context) throws Exception {
		Appearance appearance = target.getAppearance();
		if (appearance == null) {
			return ViewBuilder.Supplier.from(Supplier.empty());
		}
		return ViewBuilder.Supplier.from(EObjectAdaptable.adaptToSupplierFactoryNonNull(appearance, ViewBuilder.class).create(context));
	}	

}
