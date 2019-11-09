package org.nasdanika.vinci.app.util;

import org.nasdanika.vinci.app.AppPackage;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		org.nasdanika.vinci.bootstrap.util.Activator.BOOTSTRAP_PAGE_BUILDERS_PALETTE.add(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION);	
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// NOP
	}

}
