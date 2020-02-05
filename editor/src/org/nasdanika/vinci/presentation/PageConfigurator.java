package org.nasdanika.vinci.presentation;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.nasdanika.common.Context;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.ncore.NcoreFactory;
import org.nasdanika.ncore.Property;
import org.nasdanika.vinci.app.AppFactory;
import org.nasdanika.vinci.app.BootstrapContainerApplication;
import org.nasdanika.vinci.bootstrap.BootstrapPage;
import org.nasdanika.vinci.html.ContentTag;
import org.nasdanika.vinci.html.HtmlFactory;
import org.nasdanika.vinci.html.HtmlPackage;
import org.nasdanika.vinci.html.Script;
import org.nasdanika.vinci.html.Stylesheet;

public class PageConfigurator implements InitialObjectConfigurator {

	@Override
	public void addParameter(String name, String value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean accept(EObject eObject) {
		return HtmlPackage.Literals.PAGE.isInstance(eObject);
	}

	@Override
	public String getLabel() {
		return "Template";
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public EObject configure(EObject initialModel) {
		if (pageTemplateComposite.isTemplate()) {
			BootstrapPage page = (BootstrapPage) initialModel;
			page.setFontAwesome(true);
			page.setJsTree(true);
			page.setGithubMarkdownCss(true);
			page.setCdn(true);
			page.setTheme(pageTemplateComposite.getTheme().name());
			page.setName("${actions/active/text}");
			
			BootstrapContainerApplication bootstrapContainerApplication = AppFactory.eINSTANCE.createBootstrapContainerApplication();
			page.getBuilders().add(bootstrapContainerApplication);
			bootstrapContainerApplication.setFluid(pageTemplateComposite.isFluid());
			
			ContentTag meta = HtmlFactory.eINSTANCE.createContentTag();
			
			Property metaName = NcoreFactory.eINSTANCE.createProperty();
			metaName.setName("name");
			metaName.setInterpolate(false);
			metaName.setValue("generator");
			meta.getAttributes().add(metaName);
			
			Property metaContent = NcoreFactory.eINSTANCE.createProperty();
			metaContent.setName("content");
			metaContent.setInterpolate(false);
			metaContent.setValue("Nasdanika Vinci");
			meta.getAttributes().add(metaContent);
			
			page.getHead().add((SupplierFactory) meta);
			
			try {
				Stylesheet stylesheet = HtmlFactory.eINSTANCE.createStylesheet();
				stylesheet.setCode(DefaultConverter.INSTANCE.stringContent(getClass().getResource("page.css")));
				page.getHead().add(stylesheet);

				Script script = HtmlFactory.eINSTANCE.createScript();
				String scriptTemplate = DefaultConverter.INSTANCE.stringContent(getClass().getResource(pageTemplateComposite.isDarkNavbar() ? "page-dark.js" : "page-light.js"));
				Context context = Context.singleton("header-color", pageTemplateComposite.getHeaderColor().code);			
				script.setCode(context.interpolate(scriptTemplate));
				page.getHead().add(script);
			} catch (IOException e) {
				VinciEditorPlugin.INSTANCE.log(e);
			}
		}
		return initialModel;
	}
	
	private PageTemplateComposite pageTemplateComposite;

	@Override
	public Control createControl(Composite parent, EObject initialModel) {
		pageTemplateComposite = new PageTemplateComposite(parent, SWT.NONE);		
		return pageTemplateComposite;
	}

}
