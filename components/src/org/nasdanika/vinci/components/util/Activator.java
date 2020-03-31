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
				ComponentsPackage.Literals.ACTION_LINK,
				ComponentsPackage.Literals.MARKDOWN_TEXT,
				ComponentsPackage.Literals.MARKDOWN_RESOURCE,
				ComponentsPackage.Literals.LIST_OF_ACTIONS,
				ComponentsPackage.Literals.TABLE_OF_ACTIONS,	
				ComponentsPackage.Literals.LIST_OF_CONTENTS,
				ComponentsPackage.Literals.TABLE_OF_CONTENTS);	
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// NOP
	}

}
