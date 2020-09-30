package org.nasdanika.vinci.app.util;

import org.nasdanika.emf.Palette;
import org.nasdanika.vinci.app.AppPackage;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	public static final Palette ACTIONS_PALETTE = Palette.Registry.INSTANCE.create(
			"org.nasdanika.vinci.app:actions", 
			"Actions", 
			"Elements for building action models", true);	

	@Override
	public void start(BundleContext context) throws Exception {
		org.nasdanika.vinci.bootstrap.util.Activator.BOOTSTRAP_PAGE_BUILDERS_PALETTE.add(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION);	
		
		ACTIONS_PALETTE.add(
				AppPackage.Literals.ACTION,
				AppPackage.Literals.ACTION_REFERENCE,
				AppPackage.Literals.ACTION_CATEGORY,
				AppPackage.Literals.PARTITION); // TODO - link, mapping	
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// NOP
	}

}
