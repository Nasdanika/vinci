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
import org.nasdanika.common.Supplier;
import org.nasdanika.common.Util;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.emf.ModelCommand;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ActionActivator;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.ApplicationBuilder;
import org.nasdanika.html.app.DecoratorProvider;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionApplicationBuilder;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.impl.ActionFacade;
import org.nasdanika.vinci.bootstrap.BootstrapPage;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
		description = "Generates a web application (Web site) from a Vinci action model",
		name = "application",
		versionProvider = VinciBundleVersionProvider.class)
public class GenerateTemplatedApplicationCommand extends ModelCommand<AbstractAction> {
	
	@Option(names = {"-o", "--output"}, description = "Output directory, defaults to the current directory")
	private File outputDir;	
	
	@Option(
			names = {"--sections"}, 
			description = "If true (default) section pages are generated", 
			defaultValue = "true",
			negatable = true)
	private boolean sections;		

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
		
		FileSystemContainer output = new FileSystemContainer(outputDir);		
		ResourceSet resourceSet = rootAction.eResource().getResourceSet();
		Context generationContext = context.compose(Context.singleton(BinaryEntityContainer.class, output)).compose(Context.singleton(ResourceSet.class, resourceSet)); 		
		
		// Generate action tree
		try (Supplier<Object> work = rootAction.create(generationContext)) {
			monitor.setWorkRemaining(work.size() * 2 + 1);
			org.nasdanika.common.Diagnostic diagnostic = work.splitAndDiagnose(monitor);
			if (diagnostic.getStatus() == org.nasdanika.common.Status.ERROR) {
				throw new org.nasdanika.common.DiagnosticException("Action diagnostic failed", diagnostic);
			}
		
			Action action = (Action) work.splitAndExecute(monitor);
			// Page for each action with relative navigation activator - recursive						
			generatePages(generationContext, resourceSet, action, action, output.stateAdapter().adapt(null, ENCODER), monitor.split("Generating pages", 1, action));
			
		}							
	}
	
	protected void generatePages(
			Context generationContext,
			ResourceSet resourceSet, 
			Action rootAction, 
			Action activeAction, 
			Container<Object> contentContainer, 
			ProgressMonitor monitor) throws Exception {
		
		monitor.setWorkRemaining(1 + activeAction.getChildren().size());
		
		ActionActivator activator = activeAction.getActivator();
		if (activator instanceof NavigationActionActivator && (sections || !activeAction.isInRole(Action.Role.SECTION))) {					
			NavigationActionActivator naa = (NavigationActionActivator) activator;
			String url = naa.getUrl();
			if (Util.isValidAndRelative(url)) {
				List<Action> navChildren = rootAction.getNavigationChildren();
				Action principalAction = navChildren.isEmpty() ? null : navChildren.get(0); 
				List<Action> navigationPanelActions = principalAction == null ? Collections.emptyList() : principalAction.getNavigationChildren(); 
		
		
				MutableContext pageContext = generationContext.fork();
				pageContext.register(ApplicationBuilder.class, new ActionApplicationBuilder(rootAction, principalAction, navigationPanelActions, activeAction) {
					
					@Override
					protected ViewGenerator createViewGenerator(
							Application application, 
							java.util.function.Consumer<?> headContentConsumer, 
							java.util.function.Consumer<?> bodyContentConsumer) {
						
						Context appBuilderContext = generationContext;
						if (application instanceof DecoratorProvider) {
							appBuilderContext = generationContext.compose(Context.singleton(DecoratorProvider.class, (DecoratorProvider) application));
						}
						return new ViewGeneratorImpl(appBuilderContext, headContentConsumer, bodyContentConsumer);
					}
					
				});
				
				if (activeAction != null) {
					String text = activeAction.getText();
					if (!Util.isBlank(text)) {
						pageContext.put("actions/active/text", Jsoup.parse(text).text());
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
				
				generatePage(activeAction, page, url, contentContainer, pageContext, monitor);
			}
		}
		
		for (Action child: activeAction.getChildren()) {
			generatePages(generationContext, resourceSet, rootAction, child, contentContainer, monitor.split("Generating page for "+child.getText(), 1, child));
		}
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
				try (ProgressMonitor contentMonitor = pageMonitor.split("Writing content "+path, 1)) {
					contentContainer.put(path, result.toString(), contentMonitor);
				}
			}
		}
	}

}
