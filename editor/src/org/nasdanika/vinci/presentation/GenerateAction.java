package org.nasdanika.vinci.presentation;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
//import org.eclipse.jdt.core.IJavaProject;
//import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.model.WorkbenchLabelProvider;
//import org.nasdanika.codegen.util.JavaProjectClassLoader;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressEntry;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.ProgressRecorder;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.Util;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.ncore.ModelElement;

/**
 * @author Pavel Vlasov
 *
 */
public class GenerateAction extends Action {
		
	public static BiFunction<String, Object, InputStream> ENCODER = (path, contents) -> {
		InputStream ret = DefaultConverter.INSTANCE.convert(contents, InputStream.class);
		if (ret == null) {
			// toString() conversion
			ret = DefaultConverter.INSTANCE.convert(String.valueOf(contents), InputStream.class);
		}
		return ret;
	};
	
	protected EObject modelElement;					
			
//	/**
//	 * @throws Exception
//	 */
//	public void testBankOfNasdanikaAdvanced() throws Exception {
//		String path = "app/bank-of-nasdanika-advanced";
//		execute(path).writeFile("index.html", new PrintStreamProgressMonitor()); 		
//		
//		String[] ids = {
//				"2dd49b89-b498-461b-8bf8-01c2c1e81476", // Savings
//				"b24142d2-b17a-4357-86ae-9717644db759"  // Credit card
//			};
//			for (String id: ids) {
//				execute(path, Context.singleton("active-action", id)).writeFile(id+".html", new PrintStreamProgressMonitor());
//			}
//	}
//	
//	/**
//	 * Performs validation and work execution.
//	 * @param path Path to the test to execute relative to the model base URI. The model is loaded from the path concatenated with .vinci extension and results are stored to
//	 * the path relative to the test output base. 
//	 * @throws Exception
//	 */
//	protected TestResult execute(String path, Context context) throws Exception {
//		TestResult result = new TestResult();
//		result.output = new FileSystemContainer(new File(TEST_OUTPUT_BASE+path));
//		MutableContext mc = Context.EMPTY_CONTEXT.compose(context).fork();
//		mc.register(BinaryEntityContainer.class, result.output);
//		
//		try (Supplier<Object> work = createModelWorkFactory(path).create(mc)) {
//			
//			try (ProgressRecorder workDiagnostic = new ProgressRecorder()) {
//				org.nasdanika.common.Diagnostic diagnostic = work.diagnose(workDiagnostic);
//				if (diagnostic.getStatus() == Status.ERROR) {
//					diagnostic.dump(System.out, 0);
//					System.out.println(workDiagnostic.toJSON().toString(4));
//					throw new org.nasdanika.common.DiagnosticException("Cannot execute generator work", diagnostic);
//				}
//			}
//		
//			try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
//				try (ProgressEntry pe = new ProgressEntry("Generating Generator Model Documentation", 0)) {
//					 result.result = work.execute(progressMonitor.split("Generating "+path, work.size()).compose(pe.split("Doc", 1)));	
//				
//		//			// HTML report
//		//			ProgressReportGenerator prg = new ProgressReportGenerator("Documentation generation", pe);
//		//			Container<Object> container = fsc.stateAdapter().adapt(null, encoder);
//		//			Container<Object> progressReportContainer = container.getContainer("progress-report", progressMonitor.split("Getting progress report container", 1));
//		//			prg.generate(progressReportContainer, progressMonitor.split("Generating progress report", 1));
//				}
//			}
//			
//			return result;
//		} catch (DiagnosticException e) {
//			dumpDiagnostic(e.getDiagnostic(), 0);
//			throw e;
//		}
//	}
//
//
//	public static void writeFile(BinaryEntityContainer container, String path, ProgressMonitor monitor, Object content) {
//		org.nasdanika.common.resources.Container<Object> contentContainer = container.stateAdapter().adapt(null, ENCODER);
//		try (ProgressMonitor pageMonitor = monitor.split("Writing cotent "+path, 1)) {
//			contentContainer.put(path, content.toString(), pageMonitor);
//		}
//	}
	
	public GenerateAction(String name, EObject modelElement) {
		super(name);
		this.modelElement = modelElement;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		Shell shell = workbench.getModalDialogShellProvider().getShell();
				
		Diagnostician diagnostician = new Diagnostician() {
			
			@Override
			public String getObjectLabel(EObject eObject) {
				String ret = eObject instanceof ModelElement ? ((ModelElement) eObject).getTitle() : null;
				return Util.isBlank(ret) ? super.getObjectLabel(eObject) : ret;
			}
			
		}; 
		
		Diagnostic diagnostic = diagnostician.validate(modelElement);
		
		IStatus validationStatus = BasicDiagnostic.toIStatus(diagnostic);
		if (validationStatus.getSeverity() == IStatus.ERROR) {
            ErrorDialog.openError(shell, "Model is invalid", "Model contains errors", validationStatus);
			VinciEditorPlugin.getPlugin().getLog().log(validationStatus);
			return;
		}
		
		try {							
			URI resourceURI = modelElement.eResource().getURI();
			URL baseURL = null;			
			try {
				baseURL = new URL(resourceURI.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
//			Map<String, Object> properties = new HashMap<>();
//			properties.put(Configuration.BASE_URL_PROPERTY, baseURL);
							
//			ClassLoader[] classLoader = { getClass().getClassLoader() }; 
//			
//			IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(resourceURI.toPlatformString(true)));
//			if (modelFile.exists()) {
//				IProject project = modelFile.getProject();
//				IProjectNature javaNature = project.getNature(JavaCore.NATURE_ID);
//				if (javaNature instanceof IJavaProject) {
//					classLoader[0] = new JavaProjectClassLoader(classLoader[0], (IJavaProject) javaNature);
//				}					
//			}
			
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				
				@Override
				protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {	
					try {
//						List<Work<List<Object>>> allWork = new ArrayList<>();
//						int totalWork = 0;
//						for (Generator<Object> g: rootGenerators) {
//							Work<List<Object>> work = g.createWork();
//							totalWork += work.size();
//							allWork.add(work);
//						}
//						SubMonitor subMonitor = SubMonitor.convert(monitor, totalWork);
//						for (Work<List<Object>> work: allWork) {
//							work.execute(rootContext, subMonitor);
//						}
//					} catch (CoreException | InvocationTargetException | InterruptedException | RuntimeException e) {
//						throw e;
					} catch (Exception e) {
						throw new InvocationTargetException(e);
					} finally {
						monitor.done();
					}					
				}
				
			};

			new ProgressMonitorDialog(shell).run(true, true, operation);
		} catch (Exception exception) {
            MultiStatus status = createMultiStatus(exception.toString(), exception);
            ErrorDialog.openError(shell, "Generation error", exception.toString(), status);
			VinciEditorPlugin.getPlugin().getLog().log(status);
			exception.printStackTrace();
		}
	}
	
	private static MultiStatus createMultiStatus(String msg, Throwable t) {
		List<Status> childStatuses = new ArrayList<>();

		for (StackTraceElement stackTrace : t.getStackTrace()) {
			childStatuses.add(new Status(IStatus.ERROR, "org.nasdanika.codegen.editor", stackTrace.toString()));
		}

		if (t.getCause() != null) {
			childStatuses.add(createMultiStatus("Caused by: " + t.getCause(), t.getCause()));
		}

		for (Throwable s : t.getSuppressed()) {
			childStatuses.add(createMultiStatus("Supressed: " + s, s.getCause()));
		}

		MultiStatus ms = new MultiStatus("org.nasdanika.codegen.editor", IStatus.ERROR,	childStatuses.toArray(new Status[childStatuses.size()]), msg, t);

		return ms;
	}	

}
