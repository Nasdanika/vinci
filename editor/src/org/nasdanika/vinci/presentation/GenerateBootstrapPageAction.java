package org.nasdanika.vinci.presentation;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.html.HTMLPage;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.fontawesome.FontAwesomeFactory;
import org.nasdanika.html.jstree.JsTreeFactory;

/**
 * Wraps conent into a bootstrap page with Bootstrap, FontAwesome and JsTree CDN stylesheets and scripts.
 * @author Pavel
 *
 * @param <T>
 */
public class GenerateBootstrapPageAction<T extends EObject & SupplierFactory<Object>> extends GenerateContentAction<T> {

	public GenerateBootstrapPageAction(String name, T modelElement, AdapterFactory adapterFactory) {
		super(name, modelElement, adapterFactory);
	}
	
	@Override
	protected Object wrap(Object result, Context context) {
		BootstrapFactory bootstrapFactory = context.get(BootstrapFactory.class, BootstrapFactory.INSTANCE);
		HTMLPage page = bootstrapFactory.bootstrapCdnHTMLPage();
		
		FontAwesomeFactory faf = context.get(FontAwesomeFactory.class, FontAwesomeFactory.INSTANCE);
		faf.cdn(page);
		
		JsTreeFactory jstf = context.get(JsTreeFactory.class, JsTreeFactory.INSTANCE);
		jstf.cdn(page);
		
		page.body(result);
		return page;
	}
	
	protected String getOutputName(IFile modelFile, Context context) {
		String outputName = modelFile.getName();
		int lastDotIdx = outputName.lastIndexOf('.');
		// TODO - from config
		return (lastDotIdx == -1 ? outputName : outputName.substring(0, lastDotIdx)) + "-page.html";
	}
	
}