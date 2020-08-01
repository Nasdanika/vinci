package org.nasdanika.vinci.bootstrap.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.Util;
import org.nasdanika.html.HTMLPage;
import org.nasdanika.html.bootstrap.Theme;
import org.nasdanika.vinci.bootstrap.BootstrapPage;
import org.nasdanika.vinci.html.gen.PageSupplierFactory;

public class BootstrapPageSupplierFactory extends PageSupplierFactory<BootstrapPage> {

	public BootstrapPageSupplierFactory(BootstrapPage target) {
		super(target);
	}
	
	@Override
	protected HTMLPage createPage(Context context) {
		org.nasdanika.html.bootstrap.BootstrapFactory bootstrapFactory = context.get(org.nasdanika.html.bootstrap.BootstrapFactory.class, org.nasdanika.html.bootstrap.BootstrapFactory.INSTANCE);
		if (target.isCdn()) {
			if (Util.isBlank(target.getTheme())) {
				return bootstrapFactory.bootstrapCdnHTMLPage();
			}
			return bootstrapFactory.bootstrapCdnHTMLPage(Theme.valueOf(target.getTheme()));
		}
		return bootstrapFactory.bootstrapHTMLPage();
	}

}
