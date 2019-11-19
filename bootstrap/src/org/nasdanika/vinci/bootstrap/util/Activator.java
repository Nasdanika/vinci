package org.nasdanika.vinci.bootstrap.util;

import org.nasdanika.emf.Palette;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.BootstrapPage;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	/**
	 * Bootstrap page builders palette - elements which can build {@link BootstrapPage}.
	 */
	public static final Palette BOOTSTRAP_PAGE_BUILDERS_PALETTE = Palette.Registry.INSTANCE.get("org.nasdanika.vinci.bootstrap:bootstrap-page-builders");	

	@Override
	public void start(BundleContext context) throws Exception {
		Palette htmlContentPalette = org.nasdanika.vinci.html.util.Activator.HTML_CONTENT_PALETTE;

		/**
		 * Top level Bootstrap elements.
		 */
		htmlContentPalette.add(
//			BootstrapPackage.Literals.ACCORDION,	
			BootstrapPackage.Literals.ACTION_GROUP);//,	
//			BootstrapPackage.Literals.ALERT,	
//			BootstrapPackage.Literals.BADGE,	
//			BootstrapPackage.Literals.BREADCRUMBS,	
//			BootstrapPackage.Literals.BUTTON,	
//			BootstrapPackage.Literals.BUTTON_GROUP,	
//			BootstrapPackage.Literals.BUTTON_TOOLBAR,	
//			BootstrapPackage.Literals.CARD,	
//			BootstrapPackage.Literals.COLLAPSE,	
//			BootstrapPackage.Literals.CONTAINER,	
//			BootstrapPackage.Literals.DROPDOWN,	
//			BootstrapPackage.Literals.FORM,	
//			BootstrapPackage.Literals.FORM_GROUP,	
//			BootstrapPackage.Literals.INPUT_GROUP,	
//			BootstrapPackage.Literals.LIST_GROUP,	
//			BootstrapPackage.Literals.MODAL,	
//			BootstrapPackage.Literals.NAVBAR,	
//			BootstrapPackage.Literals.NAVS,	
//			BootstrapPackage.Literals.TABLE,	
//			BootstrapPackage.Literals.TAG,	
//			BootstrapPackage.Literals.TOOLTIP);							

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// NOP
	}

}
