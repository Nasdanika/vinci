package org.nasdanika.vinci.components.util;

import org.nasdanika.emf.Palette;
import org.nasdanika.vinci.components.ComponentsPackage;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		Palette htmlContentPalette = org.nasdanika.vinci.html.util.Activator.HTML_CONTENT_PALETTE;

		htmlContentPalette.add(
				ComponentsPackage.Literals.MARKDOWN,
				ComponentsPackage.Literals.MARKDOWN_RESOURCE);	
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// NOP
	}

}
