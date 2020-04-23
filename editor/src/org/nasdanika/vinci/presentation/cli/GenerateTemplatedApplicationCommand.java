package org.nasdanika.vinci.presentation.cli;

import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.jsoup.Jsoup;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.ServiceComputer;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.Util;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.emf.ModelCommand;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ActionRegistry;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.ApplicationBuilder;
import org.nasdanika.html.app.DecoratorProvider;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionApplicationBuilder;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.impl.ActionFacade;
import org.nasdanika.vinci.bootstrap.BootstrapPage;
import org.nasdanika.vinci.presentation.VinciUtil;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
		description = "Generates a web application (Web site) from a Vinci action model",
		name = "application",
		versionProvider = VinciBundleVersionProvider.class)
public class GenerateTemplatedApplicationCommand extends ModelCommand<AbstractAction> {
	
	@Option(names = {"-o", "--output"}, description = "Output directory, defaults to the current directory")
	private File outputDir;	
	
	@Option(names = {"-b", "--base-uri"}, description = "Base URI for resolving and relativizing. Resolved against the output directory URI. Defaults to the output directory URI.")
	private String baseUri;		

	@Override
	protected ConsumerFactory<AbstractAction> getConsumerFactory() {
		return new ConsumerFactory<AbstractAction>() {

			@Override
			public Consumer<AbstractAction> create(Context context) throws Exception {
				return new Consumer<AbstractAction>() {

					@Override
					public double size() {
						return 1;
					}

					@Override
					public String name() {
						return "Generate " + GenerateTemplatedApplicationCommand.this.getName();
					}

					@Override
					public void execute(AbstractAction action, ProgressMonitor progressMonitor) throws Exception {
						GenerateTemplatedApplicationCommand.this.execute(action, context, progressMonitor);
					}
					
				};
			}
		};
	}
	
	protected String getName() {
		return getClass().getAnnotation(Command.class).name();
	}
	
	public static BiFunction<String, Object, InputStream> ENCODER = (path, contents) -> {
		InputStream ret = DefaultConverter.INSTANCE.convert(contents, InputStream.class);
		if (ret == null) {
			// toString() conversion
			ret = DefaultConverter.INSTANCE.convert(String.valueOf(contents), InputStream.class);
		}
		return ret;
	};	
		
	protected void execute(
			AbstractAction rootAction, 
			Context context, 
			ProgressMonitor monitor) throws Exception {
		
		if (outputDir == null) {
			outputDir = new File(".");
		}
		FileSystemContainer output = new FileSystemContainer(outputDir);		
		ResourceSet resourceSet = rootAction.eResource().getResourceSet();
		URI outputURI = URI.createFileURI(outputDir.getAbsolutePath() + File.separator);
		URI baseURI = Util.isBlank(baseUri) ? outputURI : URI.createURI(baseUri).resolve(outputURI);
		MutableContext generationContext = context.fork();
		generationContext.register(BinaryEntityContainer.class, output);
		generationContext.register(ResourceSet.class, resourceSet);
		generationContext.register(URI.class, baseURI);
		generationContext.put(Context.BASE_URI_PROPERTY, baseURI);
		
		// Generate action tree
		try (Supplier<Object> work = rootAction.create(generationContext)) {
			monitor.setWorkRemaining(work.size() * 2 + 1);
			org.nasdanika.common.Diagnostic diagnostic = work.splitAndDiagnose(monitor);
			if (diagnostic.getStatus() == org.nasdanika.common.Status.ERROR) {
				throw new org.nasdanika.common.DiagnosticException("Action diagnostic failed", diagnostic);
			}
		
			Action action = (Action) work.splitAndExecute(monitor);
			// Page for each action with relative navigation activator - recursive						
			generatePages(baseURI, generationContext, resourceSet, action, action, output.stateAdapter().adapt(null, ENCODER), monitor.split("Generating pages", 1, action));
			
		}							
	}
	
	protected void generatePages(
			URI baseURI,
			Context generationContext,
			ResourceSet resourceSet, 
			Action rootAction, 
			Action activeAction, 
			Container<Object> contentContainer, 
			ProgressMonitor monitor) throws Exception {
		
		monitor.setWorkRemaining(1 + activeAction.getChildren().size());
		
		String generationPath = VinciUtil.getGenerationPath(activeAction, baseURI);
		if (generationPath != null) {					
			List<Action> navChildren = rootAction.getNavigationChildren();
			Action principalAction = navChildren.isEmpty() ? null : navChildren.get(0); 
			List<Action> navigationPanelActions = principalAction == null ? Collections.emptyList() : principalAction.getNavigationChildren(); 	
	
			MutableContext pageContext = generationContext.fork();			

			// Absolute URI of the action for resolution of relative links.
			pageContext.put(Context.BASE_URI_PROPERTY, URI.createURI(generationPath).resolve(baseURI).toString());

			ActionRegistry actionRegistry = ActionRegistry.fromAction(rootAction);
			pageContext.register(ActionRegistry.class, actionRegistry);
			pageContext.put(ViewGenerator.ACTION_REGISTRY_PROPERTY, actionRegistry.asPropertyComputer());
			
			ServiceComputer<ApplicationBuilder> applicationBuilderComputer = (ctx, type) -> createApplicationBuilder(ctx, type, rootAction, principalAction, navigationPanelActions, activeAction);
			pageContext.register(ApplicationBuilder.class, applicationBuilderComputer);
			
			if (activeAction != null) {
				StringBuilder titleBuilder = new StringBuilder();
				String text = activeAction.getText();					
				if (!Util.isBlank(text)) {
					titleBuilder.append(Jsoup.parse(text).text());
				}
				String rootText = rootAction.getText();
				if (!Util.isBlank(rootText)) {
					if (titleBuilder.length() > 0) {
						titleBuilder.append(" - ");
					}
					titleBuilder.append(Jsoup.parse(rootText).text());
				}					
				if (titleBuilder.length() > 0) {
					pageContext.put("actions/active/text", titleBuilder.toString());
				}
			}

			URI templateUri = activeAction instanceof ActionFacade ? ((ActionFacade) activeAction).getPageTemplate() : ActionFacade.DEFAULT_PAGE_TEMPLATE;				
			Resource templateResource = resourceSet.getResource(templateUri, true);
			String fragment = templateUri.fragment();				
			BootstrapPage page = (BootstrapPage) (fragment == null ? templateResource.getContents().get(0) : templateResource.getEObject(fragment));	
			
			Diagnostician diagnostician = new Diagnostician() {
				
				public Map<Object,Object> createDefaultContext() {
					Map<Object, Object> ctx = super.createDefaultContext();
					ctx.put(Context.class, generationContext);
					return ctx;
				};
				
			};				
			Diagnostic validationResult = diagnostician.validate(page);
			if (validationResult.getSeverity() == Diagnostic.ERROR) {
				throw new DiagnosticException(validationResult);
			}
			
			generatePage(activeAction, page, generationPath, contentContainer, pageContext, monitor);
		}
		
		for (Action child: activeAction.getChildren()) {
			generatePages(baseURI, generationContext, resourceSet, rootAction, child, contentContainer, monitor.split("Generating page for "+child.getText(), 1, child));
		}
	}
	
	protected ApplicationBuilder createApplicationBuilder(
			Context context, 
			Class<ApplicationBuilder> type, 
			Action rootAction,
			Action principalAction,
			List<Action> navigationPanelActions,
			Action activeAction) {
		
		return new ActionApplicationBuilder(rootAction, principalAction, navigationPanelActions, activeAction) {
			
			@Override
			protected ViewGenerator createViewGenerator(
					Application application, 
					java.util.function.Consumer<?> headContentConsumer, 
					java.util.function.Consumer<?> bodyContentConsumer) {
				
				Context appBuilderContext = context;				
				if (application instanceof DecoratorProvider) {
					appBuilderContext = context.compose(Context.singleton(DecoratorProvider.class, (DecoratorProvider) application));
				}
				return new ViewGeneratorImpl(appBuilderContext, headContentConsumer, bodyContentConsumer);
			}
			
		};		
	}

	/**
	 * Generates action page
	 * @param page
	 * @param url
	 * @param contentContainer
	 * @param pageContext
	 * @param monitor
	 * @throws Exception
	 */
	protected void generatePage(
			Action activeAction, 
			BootstrapPage page, 
			String url, 
			Container<Object> contentContainer, 
			Context pageContext, 
			ProgressMonitor monitor) throws Exception {
		
		try (Supplier<Object> work = page.create(pageContext)) {
			try (ProgressMonitor pageMonitor = monitor.split("Generating page", 1)) {
				pageMonitor.setWorkRemaining(work.size() *2 + 1);						

				org.nasdanika.common.Diagnostic diagnostic = work.splitAndDiagnose(pageMonitor);
				if (diagnostic.getStatus() == org.nasdanika.common.Status.ERROR) {
					throw new org.nasdanika.common.DiagnosticException("Page diagnostic failed", diagnostic);
				}
			
				Object result = work.splitAndExecute(pageMonitor);
				String path = pageContext.interpolate(url);
				int hashIdx = path.indexOf("#");
				if (hashIdx != -1) {
					path = path.substring(0, hashIdx);
				}
				if (!path.startsWith("../")) {
					try (ProgressMonitor contentMonitor = pageMonitor.split("Writing content "+path, 1)) {
						contentContainer.put(path, result.toString(), contentMonitor);
					}
				}
			}
		}
	}

}
