package org.nasdanika.vinci.presentation;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.PlatformUI;
import org.jsoup.Jsoup;
import org.nasdanika.common.Context;
//import org.nasdanika.codegen.util.JavaProjectClassLoader;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.ServiceComputer;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.Util;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.Container;
import org.nasdanika.eclipse.ProgressMonitorAdapter;
import org.nasdanika.eclipse.resources.EclipseContainer;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ActionRegistry;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.ApplicationBuilder;
import org.nasdanika.html.app.DecoratorProvider;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionApplicationBuilder;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.texttospeech.CachingSpeechSynthesizer;
import org.nasdanika.texttospeech.GoogleCloudTextToSpeechSynthesizer;
import org.nasdanika.texttospeech.SpeechSynthesizer;
import org.nasdanika.texttospeech.SpeechSynthesizerProxy;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.gen.ActionFacade;
import org.nasdanika.vinci.app.gen.AppUtil;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.BootstrapPage;
import org.nasdanika.vinci.html.HtmlPackage;

/**
 * Generate an application from the root action using a page template.
 * @author Pavel Vlasov
 *
 */
public class GenerateTemplatedApplicationAction extends VinciGenerateAction<AbstractAction> {
		
	private static final int TOTAL_WORK = 1000;

	public static BiFunction<String, Object, InputStream> ENCODER = (path, contents) -> {
		InputStream ret = DefaultConverter.INSTANCE.convert(contents, InputStream.class);
		if (ret == null) {
			// toString() conversion
			ret = DefaultConverter.INSTANCE.convert(String.valueOf(contents), InputStream.class);
		}
		return ret;
	};
	
	public GenerateTemplatedApplicationAction(String name, AbstractAction modelElement, AdapterFactory adapterFactory) {
		super(name, modelElement, adapterFactory);
	}
	
	protected void execute(IProgressMonitor monitor) throws Exception {	
		try {
			IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(modelElement.eResource().getURI().toPlatformString(true)));
			String outputName = modelFile.getName();
			int lastDotIdx = outputName.lastIndexOf('.');
			// TODO - from config and also other context entries
			outputName = lastDotIdx == -1 ? outputName + "-site" : outputName.substring(0, lastDotIdx);
			
			IFolder outputFolder = modelFile.getParent().getFolder(new Path(outputName));
			EclipseContainer output = new EclipseContainer(outputFolder);
			
			SubMonitor subMonitor = SubMonitor.convert(monitor, TOTAL_WORK);
			
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
			EPackage[] ePackages = {
					NcorePackage.eINSTANCE,
					HtmlPackage.eINSTANCE,
					BootstrapPackage.eINSTANCE,
					AppPackage.eINSTANCE
			};
			for (EPackage ePackage: ePackages) {
				resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
			}
			MutableContext generationContext = Context.EMPTY_CONTEXT.fork();
			generationContext.register(BinaryEntityContainer.class, output);
			generationContext.register(ResourceSet.class, resourceSet);
			
			ComposedAdapterFactory.registerGlobalFactory(modelElement.eResource().getResourceSet());
			ComposedAdapterFactory.registerGlobalFactory(resourceSet);
			
			try (SpeechSynthesizer speechSynthesizer = new CachingSpeechSynthesizer(new SpeechSynthesizerProxy(GoogleCloudTextToSpeechSynthesizer::new))) {
				generationContext.register(SpeechSynthesizer.class, speechSynthesizer);			
				
				URI baseURI = URI.createURI(outputFolder.getLocationURI().toString()+"/");			
				generationContext.register(URI.class, baseURI);
				generationContext.put(Context.BASE_URI_PROPERTY, baseURI);
				
				// Generate action tree
				try (Supplier<Object> work = EObjectAdaptable.adaptToSupplierFactory(modelElement, Object.class).create(generationContext)) {
					double size = work.size() * 2 + 1;
					int halfWork = TOTAL_WORK/2;
					SubMonitor actionMonitor = subMonitor.split(halfWork);
					double scale = halfWork / (size == 0 ? 1.0 : size);
					try (ProgressMonitor progressMonitor = new ProgressMonitorAdapter(actionMonitor, scale)) {
						try (ProgressMonitor diagnosticMonitor = progressMonitor.split("Diagnostic", size)) {
							org.nasdanika.common.Diagnostic diagnostic = work.diagnose(diagnosticMonitor);
							if (diagnostic.getStatus() == org.nasdanika.common.Status.ERROR) {
	//							diagnostic.dump(System.out, 0);
					            MultiStatus status = createMultiStatus(diagnostic);
					    		ErrorDialog.openError(PlatformUI.getWorkbench().getModalDialogShellProvider().getShell(), "Diagnostic error", diagnostic.getMessage(), status);
								VinciEditorPlugin.getPlugin().getLog().log(status);
								return;
							}
						}
					
						try (ProgressMonitor generationMonitor = progressMonitor.split("Generation", size)) {
							Action action = (Action) work.execute(generationMonitor);
							// Page for each action with relative navigation activator - recursive						
							generatePages(baseURI, generationContext, resourceSet, action, action, output.stateAdapter().adapt(null, ENCODER), subMonitor.split(halfWork));
							
						}
					}
				}
			}
		} catch (CoreException | InvocationTargetException | InterruptedException | RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new InvocationTargetException(e);
		} finally {
			monitor.done();
		}					
	}

	private void generatePages(
			URI baseURI,
			Context generationContext,
			ResourceSet resourceSet, 
			Action rootAction, 
			Action activeAction, 
			Container<Object> contentContainer, 
			SubMonitor monitor) throws Exception {
		
		monitor.setWorkRemaining(TOTAL_WORK);
		int pageWork = TOTAL_WORK / (1 + activeAction.getChildren().size());
		
		String generationPath = AppUtil.getGenerationPath(activeAction, baseURI);
		if (generationPath != null) {					
			List<Action> navChildren = rootAction.getNavigationChildren();
			Action principalAction = navChildren.isEmpty() ? null : navChildren.get(0); 
			List<Action> navigationPanelActions = principalAction == null ? Collections.emptyList() : principalAction.getNavigationChildren(); 

			MutableContext pageContext = generationContext.fork();

			// Absolute URI of the action for resolution of relative links.
			pageContext.put(Context.BASE_URI_PROPERTY, URI.createURI(generationPath).resolve(baseURI).toString());
			
			ServiceComputer<ApplicationBuilder> applicationBuilderComputer = (ctx, type) -> createApplicationBuilder(ctx, type, rootAction, principalAction, navigationPanelActions, activeAction);
			pageContext.register(ApplicationBuilder.class, applicationBuilderComputer);

			ActionRegistry actionRegistry = ActionRegistry.fromAction(rootAction);
			pageContext.register(ActionRegistry.class, actionRegistry);
			pageContext.put(ViewGenerator.ACTION_REGISTRY_PROPERTY, actionRegistry.asPropertyComputer());
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
	
			SubMonitor pageMonitor = monitor.split(pageWork);
			
			URI templateUri = getTemplateURI(activeAction);				
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
			
			try (Supplier<Object> work = EObjectAdaptable.adaptToSupplierFactoryNonNull(page,Object.class).create(pageContext)) {
				double size = work.size() * 2 + 1;
				double scale = pageWork / (size == 0 ? 1.0 : size);
				try (ProgressMonitor progressMonitor = new ProgressMonitorAdapter(pageMonitor, scale)) {
					try (ProgressMonitor diagnosticMonitor = progressMonitor.split("Diagnostic", size)) {
						org.nasdanika.common.Diagnostic diagnostic = work.diagnose(diagnosticMonitor);
						if (diagnostic.getStatus() == org.nasdanika.common.Status.ERROR) {
				            MultiStatus status = createMultiStatus(diagnostic);
				    		ErrorDialog.openError(PlatformUI.getWorkbench().getModalDialogShellProvider().getShell(), "Diagnostic error", diagnostic.getMessage(), status);
							VinciEditorPlugin.getPlugin().getLog().log(status);
							return;
						}
					}
				
					try (ProgressMonitor generationMonitor = progressMonitor.split("Generation", size)) {
						Object result = work.execute(generationMonitor);
						String path = pageContext.interpolateToString(generationPath);
						int hashIdx = path.indexOf("#");
						if (hashIdx != -1) {
							path = path.substring(0, hashIdx);
						}
						if (!path.startsWith("../")) {
							try (ProgressMonitor contentMonitor = progressMonitor.split("Writing content "+path, 1)) {
								contentContainer.put(path, result.toString(), contentMonitor);
							}
						}
					}
				}
			}
		}
		
		for (Action child: activeAction.getChildren()) {
			generatePages(baseURI, generationContext, resourceSet, rootAction, child, contentContainer, monitor.split(pageWork));
		}
	}

	private URI getTemplateURI(Action action) {
		if (action == null) {
			return ActionFacade.DEFAULT_PAGE_TEMPLATE;
		}
		
		if (action instanceof ActionFacade) {
			return ((ActionFacade) action).getPageTemplate(); 
		}
		
		return getTemplateURI(action.getParent());
	}
		
	protected ApplicationBuilder createApplicationBuilder(
			Context ctx, 
			Class<ApplicationBuilder> type, 
			Action rootAction,
			Action principalAction,
			List<Action> navigationPanelActions,
			Action activeAction) {
		
		return new ActionApplicationBuilder(ctx, rootAction, principalAction, navigationPanelActions, activeAction) {
			
			@Override
			protected ViewGenerator createViewGenerator(
					Application application, 
					java.util.function.Consumer<Object> headContentConsumer, 
					java.util.function.Consumer<Object> bodyContentConsumer) {
				
				Context appBuilderContext = context;				
				if (application instanceof DecoratorProvider) {
					appBuilderContext = context.compose(Context.singleton(DecoratorProvider.class, (DecoratorProvider) application));
				}
				return new ViewGeneratorImpl(appBuilderContext, headContentConsumer, bodyContentConsumer);
			}
			
		};		
	}	
	
}
