package org.nasdanika.vinci.app.util;

import org.nasdanika.emf.Palette;
import org.nasdanika.html.app.impl.BootstrapContainerApplication;
import org.nasdanika.vinci.app.AppPackage;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	/**
	 * Bootstrap container application builders palette - elements which can build {@link BootstrapContainerApplication}.
	 */
	public static final Palette BOOTSTRAP_CONTAINER_APPLICATION_BUILDERS_PALETTE = Palette.Registry.INSTANCE.get("org.nasdanika.vinci.app:bootstrap-container-application-builders");		

	@Override
	public void start(BundleContext context) throws Exception {
		org.nasdanika.vinci.bootstrap.util.Activator.BOOTSTRAP_PAGE_BUILDERS_PALETTE.add(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION);	
		BOOTSTRAP_CONTAINER_APPLICATION_BUILDERS_PALETTE.add(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION);	
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// NOP
	}

}
