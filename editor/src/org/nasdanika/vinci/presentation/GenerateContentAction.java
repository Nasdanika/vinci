package org.nasdanika.vinci.presentation;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.function.BiFunction;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.PlatformUI;
import org.nasdanika.common.Context;
//import org.nasdanika.codegen.util.JavaProjectClassLoader;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.eclipse.ProgressMonitorAdapter;
import org.nasdanika.eclipse.resources.EclipseContainer;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;

/**
 * @author Pavel Vlasov
 *
 */
public class GenerateContentAction<T extends EObject & SupplierFactory<Object>> extends VinciGenerateAction<T> {
		
	private static final int TOTAL_WORK = 1000;

	public static BiFunction<String, Object, InputStream> ENCODER = (path, contents) -> {
		InputStream ret = DefaultConverter.INSTANCE.convert(contents, InputStream.class);
		if (ret == null) {
			// toString() conversion
			ret = DefaultConverter.INSTANCE.convert(String.valueOf(contents), InputStream.class);
		}
		return ret;
	};
	
	public GenerateContentAction(String name, T modelElement, AdapterFactory adapterFactory) {
		super(name, modelElement, adapterFactory);		
	}
	
	protected void execute(IProgressMonitor monitor) throws Exception {	
		try {
			Resource eResource = modelElement.eResource();
			ResourceSet rs = eResource.getResourceSet();
			ComposedAdapterFactory.registerGlobalFactory(rs);
			
			IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(eResource.getURI().toPlatformString(true)));
			
			EclipseContainer output = new EclipseContainer(modelFile.getParent());
			Context generationContext = Context.singleton(BinaryEntityContainer.class, output);
			
			org.nasdanika.common.resources.Container<Object> contentContainer = output.stateAdapter().adapt(null, ENCODER);		
			
			SubMonitor subMonitor = SubMonitor.convert(monitor, TOTAL_WORK);

			try (Supplier<Object> work = modelElement.create(generationContext)) {
				double size = work.size() * 2 + 2;
				double scale = TOTAL_WORK / (size == 0 ? 1.0 : size);
				try (ProgressMonitor progressMonitor = new ProgressMonitorAdapter(subMonitor, scale)) {
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
						String outputName = getOutputName(modelFile, generationContext);
						try (ProgressMonitor wrapMonitor = progressMonitor.split("Wrapping", 1); ProgressMonitor contentMonitor = progressMonitor.split("Writing content "+outputName, 1)) {
							contentContainer.put(outputName, wrap(result, generationContext, wrapMonitor).toString(), contentMonitor);
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
	
	protected String getOutputName(IFile modelFile, Context context) {
		String outputName = modelFile.getName();
		int lastDotIdx = outputName.lastIndexOf('.');
		// TODO - from config
		return (lastDotIdx == -1 ? outputName + "-content" : outputName.substring(0, lastDotIdx)) + ".html";
	}

	/**
	 * Override to wrap result in, say Bootstrap page.
	 * @param result
	 * @return
	 */
	protected Object wrap(Object result, Context context, ProgressMonitor progressMonitor) {
		return new ViewGeneratorImpl(context, null, null).processViewPart(result, progressMonitor); 
	}

}
