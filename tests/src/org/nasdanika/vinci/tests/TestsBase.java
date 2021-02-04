package org.nasdanika.vinci.tests;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.BiFunction;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.common.Context;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressEntry;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.ProgressRecorder;
import org.nasdanika.common.Status;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.emf.ModelWorkFactory;
import org.nasdanika.emf.ValidatingModelWorkFactory;
import org.nasdanika.html.HTMLPage;
import org.nasdanika.html.Select;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Breakpoint;
import org.nasdanika.html.bootstrap.Container;
import org.nasdanika.html.bootstrap.InputGroup;
import org.nasdanika.html.bootstrap.Size;
import org.nasdanika.html.bootstrap.Theme;
import org.nasdanika.html.echarts.EChartsFactory;
import org.nasdanika.html.fontawesome.FontAwesomeFactory;
import org.nasdanika.html.jstree.JsTreeFactory;
import org.nasdanika.html.knockout.KnockoutFactory;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.html.HtmlPackage;

public class TestsBase {
	
	public static BiFunction<String, Object, InputStream> ENCODER = (path, contents) -> {
		InputStream ret = DefaultConverter.INSTANCE.convert(contents, InputStream.class);
		if (ret == null) {
			// toString() conversion
			ret = DefaultConverter.INSTANCE.convert(String.valueOf(contents), InputStream.class);
		}
		return ret;
	};					

	public static BiFunction<String, Object, InputStream> encoder = (path, contents) -> {
		InputStream ret = DefaultConverter.INSTANCE.convert(contents, InputStream.class);
		if (ret == null) {
			// toString() conversion
			ret = DefaultConverter.INSTANCE.convert(String.valueOf(contents), InputStream.class);
		}
		return ret;
	};	
			
	protected static final String TEST_MODELS_BASE_URI = "org.nasdanika.vinci.tests.models/models/";
	protected static final String TEST_OUTPUT_BASE = "target/unit-tests/";
	
	protected static class TestResult {
		
		public Object result;
		public BinaryEntityContainer output;
						
		/**
		 * Writes content to a bootstrap/fontawesome/jstree/knockout page and to a file under repository site.
		 * @param path
		 * @param title
		 * @param content
		 * @throws Exception
		 */
		public void writePage(String path, String title, ProgressMonitor monitor) throws IOException {
			TestsBase.writeBootstrapPage(output, path, title, monitor, result);
		}
		
		/**
		 * Writes content to a bootstrap/fontawesome/jstree/knockout page and to a file under repository site.
		 * A theme select is added above the content for live switching between available themes.
		 * @param path
		 * @param title
		 * @param content
		 * @throws IOException
		 */
		public void writeThemedPage(String path, String title, ProgressMonitor monitor) throws IOException {
			TestsBase.writeThemedPage(output, path, title, monitor, result);
		}
		
		/**
		 * Writes content to a file under repository site.
		 * @param path
		 * @param content
		 * @throws IOException
		 */
		public void writeFile(String path, ProgressMonitor monitor) throws IOException {
			TestsBase.writeFile(output, path, monitor, result);
		}		
		
	}

	public static <T> ValidatingModelWorkFactory<T> createModelWorkFactory(String path) throws Exception {
		ResourceSet rs = ModelWorkFactory.createResourceSet(
				NcorePackage.eINSTANCE,
				HtmlPackage.eINSTANCE,
				BootstrapPackage.eINSTANCE,
				AppPackage.eINSTANCE);
		
		org.nasdanika.emf.ext.Activator.registerGlobalComposedFactory(rs);
		return new ValidatingModelWorkFactory<T>(rs, TEST_MODELS_BASE_URI+path+".vinci");
	}			
	
	/**
	 * Performs validation and work execution with empty context.
	 * @param path Path to the test to execute relative to the model base URI. The model is loaded from the path concatenated with .vinci extension and results are stored to
	 * the path relative to the test output base. 
	 * @throws Exception
	 */
	protected TestResult execute(String path) throws Exception {
		return execute(path, Context.EMPTY_CONTEXT);
	}
	
	/**
	 * Performs validation and work execution.
	 * @param path Path to the test to execute relative to the model base URI. The model is loaded from the path concatenated with .vinci extension and results are stored to
	 * the path relative to the test output base. 
	 * @throws Exception
	 */
	protected TestResult execute(String path, Context context) throws Exception {
		TestResult result = new TestResult();
		result.output = new FileSystemContainer(new File(TEST_OUTPUT_BASE+path));
		MutableContext mc = Context.EMPTY_CONTEXT.compose(context).fork();
		mc.register(BinaryEntityContainer.class, result.output);
		
		try (Supplier<Object> work = createModelWorkFactory(path).create(mc)) {
			
			try (ProgressRecorder workDiagnostic = new ProgressRecorder()) {
				org.nasdanika.common.Diagnostic diagnostic = work.diagnose(workDiagnostic);
				if (diagnostic.getStatus() == Status.ERROR) {
					diagnostic.dump(System.out, 0);
					System.out.println(workDiagnostic.toJSON().toString(4));
					throw new org.nasdanika.common.DiagnosticException("Cannot execute generator work", diagnostic);
				}
			}
		
			try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
				try (ProgressEntry pe = new ProgressEntry("Generating Generator Model Documentation", 0)) {
					 result.result = work.execute(progressMonitor.split("Generating "+path, work.size()).compose(pe.split("Doc", 1)));	
				
		//			// HTML report
		//			ProgressReportGenerator prg = new ProgressReportGenerator("Documentation generation", pe);
		//			Container<Object> container = fsc.stateAdapter().adapt(null, encoder);
		//			Container<Object> progressReportContainer = container.getContainer("progress-report", progressMonitor.split("Getting progress report container", 1));
		//			prg.generate(progressReportContainer, progressMonitor.split("Generating progress report", 1));
				}
			}
			
			return result;
		} catch (DiagnosticException e) {
			dumpDiagnostic(e.getDiagnostic(), 0);
			throw e;
		}
	}
	
	static void dumpDiagnostic(Diagnostic d, int indent) {
		for (int i=0; i < indent; ++i) {
			System.out.print("    ");
		}
		System.out.println(toString(d));
	    if (d.getChildren() != null) {
	    	d.getChildren().forEach(c -> dumpDiagnostic(c, indent + 1));
	    }		
	}
	
	static String toString(Diagnostic d) {
		StringBuilder result = new StringBuilder();
		switch (d.getSeverity()) {
		case Diagnostic.OK:
			result.append("OK");
			break;
		case Diagnostic.INFO:
			result.append("INFO");
			break;
		case Diagnostic.WARNING:
			result.append("WARNING");
			break;
		case Diagnostic.ERROR:
			result.append("ERROR");
			break;
		case Diagnostic.CANCEL:
			result.append("CANCEL");
			break;
		default:
			result.append(Integer.toHexString(d.getSeverity()));
			break;
		}

		result.append(" source=");
		result.append(d.getSource());

		result.append(" code=");
		result.append(d.getCode());

		result.append(' ');
		result.append(d.getMessage());

		if (d.getData() != null) {
			result.append(" data=");
			result.append(d.getData());
		}

		return result.toString();
	}	
		
	/**
	 * Writes content to a bootstrap/fontawesome/jstree/knockout page and to a file under repository site.
	 * @param path
	 * @param title
	 * @param content
	 * @throws Exception
	 */
	public static void writeBootstrapPage(BinaryEntityContainer container, String path, String title, ProgressMonitor monitor, Object... content) throws IOException {		
		HTMLPage bootstrapPage = BootstrapFactory.INSTANCE.bootstrapCdnHTMLPage();
		FontAwesomeFactory.INSTANCE.cdn(bootstrapPage);
		JsTreeFactory.INSTANCE.cdn(bootstrapPage);
		KnockoutFactory.INSTANCE.cdn(bootstrapPage);
		EChartsFactory.INSTANCE.cdn(bootstrapPage);
		// More declarations as needed.		
		bootstrapPage.title(title);
		bootstrapPage.body(content);
		writeFile(container, path, monitor, bootstrapPage);
	}

	public static void writeFile(BinaryEntityContainer container, String path, ProgressMonitor monitor, Object content) {
		org.nasdanika.common.resources.Container<Object> contentContainer = container.stateAdapter().adapt(null, ENCODER);
		try (ProgressMonitor pageMonitor = monitor.split("Writing content "+path, 1)) {
			contentContainer.put(path, content.toString(), pageMonitor);
		}
	}
	
	/**
	 * Writes content to a bootstrap/fontawesome/jstree/knockout page and to a file under repository site.
	 * A theme select is added above the content for live switching between available themes.
	 * @param path
	 * @param title
	 * @param content
	 * @throws IOException
	 */
	public static void writeThemedPage(BinaryEntityContainer bec, String path, String title, ProgressMonitor monitor, Object... content) throws IOException {		
		BootstrapFactory factory = BootstrapFactory.INSTANCE;
		Container container = factory.container();
		Select select = factory.themeSelect(Theme.Default);
		InputGroup selectInputGroup = factory.inputGroup();
		selectInputGroup.prepend("Select Bootstrap theme");
//		selectInputGroup.append(FontAwesomeFactory.INSTANCE.icon("desktop", Style.SOLID));
		selectInputGroup.input(select);		
		container.row().margin().bottom(Breakpoint.DEFAULT, Size.S1).toBootstrapElement().col(selectInputGroup);
		container.row().col(content);
		writeBootstrapPage(bec, path, title, monitor, container);
	}
}
