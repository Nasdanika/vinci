package org.nasdanika.vinci.html.util;

import org.nasdanika.emf.Palette;
import org.nasdanika.vinci.html.HtmlPackage;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	/**
	 * HTML content palette - elements which can be added to HTML page body and other body HTML elements.
	 */
	public static final Palette HTML_CONTENT_PALETTE = Palette.Registry.INSTANCE.create(
			"org.nasdanika.vinci.html:html-content",
			"HTML Content",
			"Elements which can be used as HTML content", 
			true);
	

	@Override
	public void start(BundleContext context) throws Exception {
//		HTML_CONTENT_PALETTE.add(HtmlPackage.Literals.TAG);	
		HTML_CONTENT_PALETTE.add(HtmlPackage.Literals.VIEW_PART_ADAPTER);

		// TODO Input
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub

	}

}
