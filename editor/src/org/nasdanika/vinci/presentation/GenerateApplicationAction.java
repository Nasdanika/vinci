package org.nasdanika.vinci.presentation;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.PlatformUI;
import org.nasdanika.common.Context;
//import org.nasdanika.codegen.util.JavaProjectClassLoader;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.eclipse.ProgressMonitorAdapter;
import org.nasdanika.eclipse.resources.EclipseContainer;
import org.nasdanika.vinci.app.ActionReference;
import org.nasdanika.vinci.app.ActivatorType;

/**
 * @author Pavel Vlasov
 *
 */
public class GenerateApplicationAction<T extends EObject & SupplierFactory<Object>> extends VinciGenerateAction<T> {
		
	private static final int TOTAL_WORK = 1000;

	public static BiFunction<String, Object, InputStream> ENCODER = (path, contents) -> {
		InputStream ret = DefaultConverter.INSTANCE.convert(contents, InputStream.class);
		if (ret == null) {
			// toString() conversion
			ret = DefaultConverter.INSTANCE.convert(String.valueOf(contents), InputStream.class);
		}
		return ret;
	};
	
	public GenerateApplicationAction(String name, T modelElement, AdapterFactory adapterFactory) {
		super(name, modelElement, adapterFactory);
	}
	
	@Override
	protected void execute(IProgressMonitor monitor) throws Exception {	
		try {
			IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(modelElement.eResource().getURI().toPlatformString(true)));
			String outputName = modelFile.getName();
			int lastDotIdx = outputName.lastIndexOf('.');
			// TODO - from config
			outputName = lastDotIdx == -1 ? outputName + "-site" : outputName.substring(0, lastDotIdx);
			
			EclipseContainer output = new EclipseContainer(modelFile.getParent().getFolder(new Path(outputName)));
			Context generationContext = Context.singleton(BinaryEntityContainer.class, output);
			
			org.nasdanika.common.resources.Container<Object> contentContainer = output.stateAdapter().adapt(null, ENCODER);		
			
			Map<String,String> actionIds = new HashMap<>();
			collectActionIds(modelElement, actionIds);

			SubMonitor subMonitor = SubMonitor.convert(monitor, TOTAL_WORK);
			int actionWorkSlice = TOTAL_WORK / (actionIds.isEmpty() ? 1 : actionIds.size());
			for (Entry<String, String> actionEntry: actionIds.entrySet()) {														
				SubMonitor actionMonitor = subMonitor.split(actionWorkSlice);
				MutableContext actionContext = generationContext.fork();
				actionContext.put("active-action", actionEntry.getKey());
				try (Supplier<Object> work = modelElement.create(actionContext)) {
					double size = work.size() * 2 + 1;
					double scale = actionWorkSlice / (size == 0 ? 1.0 : size);
					try (ProgressMonitor progressMonitor = new ProgressMonitorAdapter(actionMonitor, scale)) {
						try (ProgressMonitor diagnosticMonitor = progressMonitor.split("Diagnostic", size)) {
							org.nasdanika.common.Diagnostic diagnostic = work.diagnose(diagnosticMonitor);
							if (diagnostic.getStatus() == org.nasdanika.common.Status.ERROR) {
//								diagnostic.dump(System.out, 0);
					            MultiStatus status = createMultiStatus(diagnostic);
					    		ErrorDialog.openError(PlatformUI.getWorkbench().getModalDialogShellProvider().getShell(), "Diagnostic error", diagnostic.getMessage(), status);
								VinciEditorPlugin.getPlugin().getLog().log(status);
								return;
							}
						}
					
						try (ProgressMonitor generationMonitor = progressMonitor.split("Generation", size)) {
							Object result = work.execute(generationMonitor);
							String path = actionContext.interpolate(actionEntry.getValue());
							try (ProgressMonitor contentMonitor = progressMonitor.split("Writing content "+path, 1)) {
								contentContainer.put(path, result.toString(), contentMonitor);
							}
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

	private void collectActionIds(EObject element, Map<String, String> actionIds) {
		if (element instanceof org.nasdanika.vinci.app.ActionBase) {
			extractId((org.nasdanika.vinci.app.ActionBase) element, actionIds);
		} else if (element instanceof ActionReference) {
			collectActionIds(((ActionReference) element).getAction(), actionIds);
		}					
		
		TreeIterator<EObject> cit = element.eAllContents();
		
		// ID's of actions to be generated.
		while (cit.hasNext()) {
			EObject next = cit.next();
			if (next instanceof org.nasdanika.vinci.app.ActionBase) {
				extractId((org.nasdanika.vinci.app.ActionBase) next, actionIds);							
			} else if (next instanceof ActionReference) {
				collectActionIds(((ActionReference) next).getAction(), actionIds);
			}
		}
	}

	private void extractId(org.nasdanika.vinci.app.ActionBase action, Map<String, String> actionIds) {
		if (!Util.isBlank(action.getId()) && action.getActivatorType() == ActivatorType.REFERENCE) {
			String url = action.getActivator();
			if (Util.isBlank(url)) {
				url = action.getId()+".html";
				if ("Section".equals(action.getRole())) {
					url += "#" + action.getId();
				}
			}
			if (Util.isBlank(url) || Util.isValidAndRelative(url)) {
				int hashIdx = url.indexOf("#");				
				actionIds.put(action.getId(), hashIdx == -1 ? url : url.substring(0, hashIdx));
			}
		}
	}

}
