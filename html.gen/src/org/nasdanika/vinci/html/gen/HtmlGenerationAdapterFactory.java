package org.nasdanika.vinci.html.gen;

import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.vinci.html.ContentTag;
import org.nasdanika.vinci.html.HtmlPackage;
import org.nasdanika.vinci.html.Page;
import org.nasdanika.vinci.html.Script;
import org.nasdanika.vinci.html.ScriptReference;
import org.nasdanika.vinci.html.ScriptResource;
import org.nasdanika.vinci.html.Stylesheet;
import org.nasdanika.vinci.html.StylesheetReference;
import org.nasdanika.vinci.html.StylesheetResource;
import org.nasdanika.vinci.html.Tag;

public class HtmlGenerationAdapterFactory extends ComposedAdapterFactory {
	
	@SuppressWarnings("rawtypes")
	public HtmlGenerationAdapterFactory() {
		// Registering adapter factories.
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, Tag>(
				HtmlPackage.Literals.TAG, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				TagSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, ContentTag>(
					HtmlPackage.Literals.CONTENT_TAG, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ContentTagSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, Page>(
					HtmlPackage.Literals.PAGE, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					PageSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, Script>(
					HtmlPackage.Literals.SCRIPT, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ScriptSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, ScriptReference>(
					HtmlPackage.Literals.SCRIPT_REFERENCE, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ScriptReferenceSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, ScriptResource>(
					HtmlPackage.Literals.SCRIPT_RESOURCE, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ScriptResourceSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, Stylesheet>(
					HtmlPackage.Literals.STYLESHEET, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					StylesheetSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, StylesheetReference>(
					HtmlPackage.Literals.STYLESHEET_REFERENCE, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					StylesheetReferenceSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, StylesheetResource>(
					HtmlPackage.Literals.STYLESHEET_RESOURCE, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					StylesheetResourceSupplierFactory::new));
	}

}
