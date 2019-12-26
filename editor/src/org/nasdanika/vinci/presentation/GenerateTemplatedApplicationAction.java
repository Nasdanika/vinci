package org.nasdanika.vinci.presentation;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import org.eclipse.core.resources.IFile;
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
import org.nasdanika.common.Supplier;
import org.nasdanika.common.Util;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.Container;
import org.nasdanika.eclipse.ProgressMonitorAdapter;
import org.nasdanika.eclipse.resources.EclipseContainer;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ActionActivator;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.ApplicationBuilder;
import org.nasdanika.html.app.DecoratorProvider;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionApplicationBuilder;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.BootstrapPage;
import org.nasdanika.vinci.html.HtmlPackage;

/**
 * Generate an application from a root action using a page template.
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
			
			EclipseContainer output = new EclipseContainer(modelFile.getParent().getFolder(new Path(outputName)));
			Context generationContext = Context.singleton(BinaryEntityContainer.class, output); 
			
			SubMonitor subMonitor = SubMonitor.convert(monitor, TOTAL_WORK);
			
			ResourceSetImpl resourceSet = new ResourceSetImpl();
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
			
			// Default template. TODO - read from config, interpolate, resolve relative to the model.
			URI templateUri = URI.createPlatformPluginURI("/org.nasdanika.vinci.templates/pages/default/primary.vinci", true);			
			
			Resource templateResource = resourceSet.getResource(templateUri, true);
			BootstrapPage page = (BootstrapPage) templateResource.getContents().get(0);	
			
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
			
			// Generate action tree
			try (Supplier<Object> work = modelElement.create(generationContext)) {
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
						generatePages(generationContext, page, action, action, output.stateAdapter().adapt(null, ENCODER), subMonitor.split(halfWork));
						
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
			Context generationContext,
			BootstrapPage page, 
			Action rootAction, 
			Action activeAction, 
			Container<Object> contentContainer, 
			SubMonitor monitor) throws Exception {
		
		monitor.setWorkRemaining(TOTAL_WORK);
		int pageWork = TOTAL_WORK / (1 + activeAction.getChildren().size());
		
		ActionActivator activator = activeAction.getActivator();
		if (activator instanceof NavigationActionActivator) {		
			
			NavigationActionActivator naa = (NavigationActionActivator) activator;
			String url = naa.getUrl();
			if (isValidAndRelative(url)) {
				List<Action> navChildren = rootAction.getNavigationChildren();
				Action principalAction = navChildren.isEmpty() ? null : navChildren.get(0); 
				List<Action> navigationPanelActions = principalAction == null ? Collections.emptyList() : principalAction.getNavigationChildren(); 
		
		
				MutableContext pageContext = generationContext.fork();
				pageContext.register(ApplicationBuilder.class, new ActionApplicationBuilder(rootAction, principalAction, navigationPanelActions, activeAction) {
					
					@Override
					protected ViewGenerator createViewGenerator(Application application, Consumer<?> headContentConsumer, Consumer<?> bodyContentConsumer) {
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
		
				SubMonitor pageMonitor = monitor.split(pageWork);
				try (Supplier<Object> work = page.create(pageContext)) {
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
							String path = pageContext.interpolate(url);
							int hashIdx = path.indexOf("#");
							if (hashIdx != -1) {
								path = path.substring(0, hashIdx);
							}
							try (ProgressMonitor contentMonitor = progressMonitor.split("Writing cotent "+path, 1)) {
								contentContainer.put(path, result.toString(), contentMonitor);
							}
						}
					}
				}
			}
		}
		
		for (Action child: activeAction.getChildren()) {
			generatePages(generationContext, page, rootAction, child, contentContainer, monitor.split(pageWork));
		}
	}

}
