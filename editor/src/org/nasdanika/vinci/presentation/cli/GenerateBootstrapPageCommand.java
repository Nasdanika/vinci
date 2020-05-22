package org.nasdanika.vinci.presentation.cli;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.html.HTMLPage;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;
import org.nasdanika.vinci.app.impl.ActionFacade;
import org.nasdanika.vinci.bootstrap.BootstrapPage;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
		description = "Generates element content and wraps it into a Bootstrap template page",
		name = "page",
		versionProvider = VinciBundleVersionProvider.class)
public class GenerateBootstrapPageCommand<T extends EObject & SupplierFactory<Object>> extends GenerateContentCommand<T> {
	
	@Option(names = {"-m", "--template"}, description = "Page template URL.")
	private String template;
	
	@Option(names = {"-T", "--title"}, description = "Page title. Defaults to resource URI")
	private String title;		
		
	@Override
	protected Object wrap(Object result, T element, Context context, ProgressMonitor progressMonitor) throws Exception {
		URI templateUri = Util.isBlank(template) ? ActionFacade.DEFAULT_PAGE_TEMPLATE : URI.createURI(template);			
		Resource eResource = element.eResource();
		ResourceSet resourceSet = eResource.getResourceSet();
		Resource templateResource = resourceSet.getResource(templateUri, true);
		String fragment = templateUri.fragment();				
		BootstrapPage page = (BootstrapPage) (fragment == null ? templateResource.getContents().get(0) : templateResource.getEObject(fragment));	
		
		Diagnostician diagnostician = new Diagnostician() {
			
			public Map<Object,Object> createDefaultContext() {
				Map<Object, Object> ctx = super.createDefaultContext();
				ctx.put(Context.class, context);
				return ctx;
			};
			
		};	
		
		Diagnostic validationResult = diagnostician.validate(page);
		if (validationResult.getSeverity() == Diagnostic.ERROR) {
			throw new DiagnosticException(validationResult);
		}
		
		page = EcoreUtil.copy(page);
		page.setName(Util.isBlank(title) ? uri : title);
		page.getBuilders().clear(); // Templates contain application builders which we don't need.
		
		try (Supplier<Object> work = page.create(context)) {
			try (ProgressMonitor pageMonitor = progressMonitor.split("Generating page", 1)) {
				pageMonitor.setWorkRemaining(work.size() *2 + 1);						

				org.nasdanika.common.Diagnostic diagnostic = work.splitAndDiagnose(pageMonitor);
				if (diagnostic.getStatus() == org.nasdanika.common.Status.ERROR) {
					throw new org.nasdanika.common.DiagnosticException("Page diagnostic failed", diagnostic);
				}
			
				org.nasdanika.html.HTMLPage htmlPage = (HTMLPage) work.splitAndExecute(pageMonitor);				
				htmlPage.body(new ViewGeneratorImpl(context, htmlPage::head, htmlPage::body).processViewPart(result, progressMonitor));
				return htmlPage;
			}
		}
	}

}
