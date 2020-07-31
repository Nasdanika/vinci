package org.nasdanika.vinci.app.gen;

import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionLink;
import org.nasdanika.vinci.app.ActionReference;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.BootstrapContainerApplication;
import org.nasdanika.vinci.app.Widget;

/**
 * Generation adapter factory for Vinci App elements.
 * @author Pavel
 *
 */
public class AppGenerationAdapterFactory extends ComposedAdapterFactory {
	
	@SuppressWarnings("rawtypes")
	public AppGenerationAdapterFactory() {
		// Registering adapter factories.
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, Widget>(
				AppPackage.Literals.WIDGET, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				WidgetSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, ActionBase>(
					AppPackage.Literals.ACTION_BASE, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ActionBaseSupplierFactory::new));
		
//		registerAdapterFactory(
//				new FunctionAdapterFactory<SupplierFactory, Partition>(
//					AppPackage.Literals.PARTITION, 
//					SupplierFactory.class, 
//					this.getClass().getClassLoader(),
//					ActionBaseSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, ActionLink>(
					AppPackage.Literals.ACTION_LINK, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ActionLinkSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, ActionReference>(
					AppPackage.Literals.ACTION_REFERENCE, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ActionReferenceSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, BootstrapContainerApplication>(
					AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					BootstrapContainerApplicationSupplierFactory::new));
		
	}

}
