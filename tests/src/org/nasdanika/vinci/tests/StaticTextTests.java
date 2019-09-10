package org.nasdanika.codegen.tests;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.junit.Assert;
import org.junit.Test;
import org.nasdanika.codegen.StaticText;
import org.nasdanika.codegen.html.CodegenDocumentationGenerator;
import org.nasdanika.codegen.util.ConfigurableValidatingModelGenerator;
import org.nasdanika.codegen.util.ValidatingModelGenerator;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressEntry;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SimpleMutableContext;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.html.app.impl.ProgressReportGenerator;

/**
 * Tests of {@link StaticText}.
 * @author Pavel
 *
 */
public class StaticTextTests extends TestsBase {

	
	private static final String TEST_MODELS_BASE_URI = "org.nasdanika.codegen.tests.models/models/";
	
	// --- Basic ---
	
	/**
	 * Generates a greeting without interpolation.
	 * @throws Exception
	 */
	@Test
	public void testBasicValidatingGeneration() throws Exception {
		ValidatingModelGenerator<String> validatingModelGenerator = new ValidatingModelGenerator<>(TEST_MODELS_BASE_URI+"static-text/basic.codegen");
		BinaryEntityContainer fsc = new FileSystemContainer(new File("target/generator-tests/static-text/basic"));
		MutableContext mc = new SimpleMutableContext();
		mc.register(Container.class, fsc);
		mc.put("name", "World");
		
		try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
			ProgressEntry pe = new ProgressEntry("Generating basic text", 0);
			List<String> result = validatingModelGenerator.createWork(mc).execute(progressMonitor.compose(pe));	
			
			// HTML report
			Container<Object> container = fsc.stateAdapter().adapt(null, encoder);
			ProgressReportGenerator prg = new ProgressReportGenerator("Generation", pe);
			Container<Object> progressReportContainer = container.getContainer("progress-report", progressMonitor.split("Getting progress report container", 1));
			prg.generate(progressReportContainer, progressMonitor.split("Generating progress report", 1));				
			
			Assert.assertEquals(1, result.size());
			Assert.assertEquals("Hello, ${name}!", result.get(0));
		}
	}
		
	@Test
	public void testBasicDocumentationGeneration() throws Exception {
		CodegenDocumentationGenerator generator = new CodegenDocumentationGenerator("Nasdanika Basic Codegen Model", null);
		generator.loadModel(TEST_MODELS_BASE_URI+"static-text/basic.codegen");
		BinaryEntityContainer fsc = new FileSystemContainer(new File("target/generator-model-doc/static-text/basic"));
		try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
			ProgressEntry pe = new ProgressEntry("Generating static text", 0);
			Container<Object> container = fsc.stateAdapter().adapt(null, encoder);
			generator.generate(container, progressMonitor.compose(pe));
			
			// HTML report
			ProgressReportGenerator prg = new ProgressReportGenerator("Generation", pe);
			Container<Object> progressReportContainer = container.getContainer("progress-report", progressMonitor.split("Getting progress report container", 1));
			prg.generate(progressReportContainer, progressMonitor.split("Generating progress report", 1));				
		}
	}
	
	// TODO - implement proper report generation.
	
	// --- Interpolation ---
	
	/**
	 * Generates a greeting with interpolation.
	 * @throws Exception
	 */
	@Test
	public void testInterpolation() throws Exception {
		ValidatingModelGenerator<String> validatingModelGenerator = new ValidatingModelGenerator<>(TEST_MODELS_BASE_URI+"static-text/interpolation.codegen");
		BinaryEntityContainer fsc = new FileSystemContainer(new File("target/generator-tests/static-text/interpolation"));
		MutableContext mc = new SimpleMutableContext();
		mc.register(Container.class, fsc);
		mc.put("greetings/name", "World");
		
		try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
			ProgressEntry pe = new ProgressEntry("Generating interpolated static text", 0);
			List<String> result = validatingModelGenerator.createWork(mc).execute(progressMonitor.compose(pe));	
			
			// HTML report
			Container<Object> container = fsc.stateAdapter().adapt(null, encoder);
			ProgressReportGenerator prg = new ProgressReportGenerator("Generation", pe);
			Container<Object> progressReportContainer = container.getContainer("progress-report", progressMonitor.split("Getting progress report container", 1));
			prg.generate(progressReportContainer, progressMonitor.split("Generating progress report", 1));				
			
			Assert.assertEquals(1, result.size());
			Assert.assertEquals("Hello, World!", result.get(0));
		}
	}
	
	/**
	 * Generates a greeting with interpolation and a property hierarchy.
	 * @throws Exception
	 */
	@Test
	public void testHierarchicalInterpolation() throws Exception {
		ValidatingModelGenerator<String> validatingModelGenerator = new ValidatingModelGenerator<>(TEST_MODELS_BASE_URI+"static-text/interpolation.codegen");
		BinaryEntityContainer fsc = new FileSystemContainer(new File("target/generator-tests/static-text/interpolation-hierarchical"));
		MutableContext mc = new SimpleMutableContext();
		mc.register(Container.class, fsc);
		mc.put("greetings", Collections.singletonMap("name", "World"));
		
		try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
			ProgressEntry pe = new ProgressEntry("Generating interpolated text", 0);
			List<String> result = validatingModelGenerator.createWork(mc).execute(progressMonitor.compose(pe));	
			
			// HTML report
			Container<Object> container = fsc.stateAdapter().adapt(null, encoder);
			ProgressReportGenerator prg = new ProgressReportGenerator("Generation", pe);
			Container<Object> progressReportContainer = container.getContainer("progress-report", progressMonitor.split("Getting progress report container", 1));
			prg.generate(progressReportContainer, progressMonitor.split("Generating progress report", 1));				
			
			Assert.assertEquals(1, result.size());
			Assert.assertEquals("Hello, World!", result.get(0));
		}
	}
	
	/**
	 * Generates a greeting with interpolation and a property hierarchy retrieved from a map wrapped into a context.
	 * @throws Exception
	 */
	@Test
	public void testMapToContextInterpolation() throws Exception {
		Map<String, Object> config = new HashMap<>();
		config.put("greetings", Collections.singletonMap("name", "World"));		
		
		ValidatingModelGenerator<String> validatingModelGenerator = new ValidatingModelGenerator<>(TEST_MODELS_BASE_URI+"static-text/interpolation.codegen");
		BinaryEntityContainer fsc = new FileSystemContainer(new File("target/generator-tests/static-text/interpolation-hierarchical"));
		MutableContext mc = new SimpleMutableContext();
		mc.register(Container.class, fsc);
		
		try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
			ProgressEntry pe = new ProgressEntry("Generating interpolated text", 0);
			Context context = mc.compose(Context.wrap(config::get));
			List<String> result = validatingModelGenerator.createWork(context).execute(progressMonitor.compose(pe));	
			
			// HTML report
			Container<Object> container = fsc.stateAdapter().adapt(null, encoder);
			ProgressReportGenerator prg = new ProgressReportGenerator("Generation", pe);
			Container<Object> progressReportContainer = container.getContainer("progress-report", progressMonitor.split("Getting progress report container", 1));
			prg.generate(progressReportContainer, progressMonitor.split("Generating progress report", 1));				
			
			Assert.assertEquals(1, result.size());
			Assert.assertEquals("Hello, World!", result.get(0));
		}
	}
	
	class MapConfigurableValidatingModelStringGenerator extends ConfigurableValidatingModelGenerator<String, Map<String,Object>> {

		public MapConfigurableValidatingModelStringGenerator(String platformPluginUri, Map<String, Object> configuration) throws Exception {
			super(platformPluginUri, configuration);
		}

		@Override
		protected Diagnostic validateConfiguration(Context context) {
			if (configuration.containsKey("greetings")) {
				return new BasicDiagnostic(Diagnostic.OK, "Validating configuration", 0, "OK", new Object[] {configuration});
			}
			return new BasicDiagnostic(Diagnostic.ERROR, "Validating configuration", 0, "Configuration must contain key 'greetings'", new Object[] {configuration});
		}

		@Override
		protected Context createConfigurationContext(Context chain) {
			return Context.wrap(configuration::get).compose(chain);
		}
		
	}
	
	/**
	 * Generates a greeting with interpolation and configuration loaded from a map.
	 * @throws Exception
	 */
	@Test
	public void testInterpolationWithConfiguration() throws Exception {
		Map<String, Object> config = new HashMap<>();
		config.put("greetings", Collections.singletonMap("name", "World"));
		
		MapConfigurableValidatingModelStringGenerator generator = new MapConfigurableValidatingModelStringGenerator(TEST_MODELS_BASE_URI+"static-text/interpolation.codegen", config);
		BinaryEntityContainer fsc = new FileSystemContainer(new File("target/generator-tests/static-text/interpolation-with-configuration"));
		
		try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
			ProgressEntry pe = new ProgressEntry("Generating interpolated text", 0);
			List<String> result = generator.createWork(Context.EMPTY_CONTEXT).execute(progressMonitor.compose(pe));	
			
			// HTML report
			Container<Object> container = fsc.stateAdapter().adapt(null, encoder);
			ProgressReportGenerator prg = new ProgressReportGenerator("Generation", pe);
			Container<Object> progressReportContainer = container.getContainer("progress-report", progressMonitor.split("Getting progress report container", 1));
			prg.generate(progressReportContainer, progressMonitor.split("Generating progress report", 1));				
			
			Assert.assertEquals(1, result.size());
			Assert.assertEquals("Hello, World!", result.get(0));
		}
	}		
		
	/**
	 * Generates a greeting with interpolation and an invalid configuration loaded from a map.
	 * @throws Exception
	 */
	@Test(expected = DiagnosticException.class)
	public void testInterpolationWithInvalidConfiguration() throws Exception {
		Map<String, Object> config = new HashMap<>();
		config.put("greetngs", Collections.singletonMap("name", "World"));
		
		MapConfigurableValidatingModelStringGenerator generator = new MapConfigurableValidatingModelStringGenerator(TEST_MODELS_BASE_URI+"static-text/interpolation.codegen", config);
		BinaryEntityContainer fsc = new FileSystemContainer(new File("target/generator-tests/static-text/interpolation-with-invalid-configuration"));
		
		try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
			ProgressEntry pe = new ProgressEntry("Generating interpolated text", 0);
			List<String> result = generator.createWork(Context.EMPTY_CONTEXT).execute(progressMonitor.compose(pe));	
			
			// HTML report
			Container<Object> container = fsc.stateAdapter().adapt(null, encoder);
			ProgressReportGenerator prg = new ProgressReportGenerator("Generation", pe);
			Container<Object> progressReportContainer = container.getContainer("progress-report", progressMonitor.split("Getting progress report container", 1));
			prg.generate(progressReportContainer, progressMonitor.split("Generating progress report", 1));				
			
			Assert.assertEquals(1, result.size());
			Assert.assertEquals("Hello, World!", result.get(0));
		}
	}
		
	@Test
	public void testController() throws Exception {
		Context context = Context.EMPTY_CONTEXT;
		GenerationResult result = validateAndGenerate("static-text/controller", context);
		
		@SuppressWarnings("unchecked")
		List<String> results = (List<String>) result.result; 
		assertEquals(3, results.size());
		assertEquals("Hello, Mr. Element-0!", results.get(0));		
	}
	
	@Test
	public void testControllerWithArguments() throws Exception {
		Context context = Context.singleton("argument-property", "XYZ");
		GenerationResult result = validateAndGenerate("static-text/controller-with-arguments", context);
		
		@SuppressWarnings("unchecked")
		List<String> results = (List<String>) result.result; 
		assertEquals(3, results.size());
		assertEquals("Hello, Mr. E-XYZ-0!", results.get(0));
	}
		
	@Test
	public void testControllerWithStaticMethoReference() throws Exception {
		Context context = Context.EMPTY_CONTEXT;
		GenerationResult result = validateAndGenerate("static-text/controller-static-method-reference", context);
		
		@SuppressWarnings("unchecked")
		List<String> results = (List<String>) result.result; 
		assertEquals(3, results.size());
		assertEquals("Hello, Mr. Static-1!", results.get(1));
	}
		
	@Test
	public void testControllerWithInstanceMethoReference() throws Exception {
		Context context = Context.singleton("argument-property", "ABC");
		GenerationResult result = validateAndGenerate("static-text/controller-method-reference-with-arguments", context);
		
		@SuppressWarnings("unchecked")
		List<String> results = (List<String>) result.result; 
		assertEquals(3, results.size());
		assertEquals("Hello, Mr. E-ABC-2!", results.get(2));
	}

//	interpolation-configuration-invalid.yml
//	interpolation-configuration.yml
//	interpolation.codegen documentation
	
	
	
	
//	arguments-no-controller-disabled.codegen
//	arguments-no-controller.codegen
//	cannot-convert-arguments.codegen
//	configuration-bad.codegen
//	configuration-list.codegen
//	configuration-reference.codegen
//	configuration-reference.json
//	configuration-reference.properties
//	configuration-reference.yml
//	configuration.codegen
//	context-path.codegen
//	disabled.codegen
//	wrong-controller-class.codegen
//	wrong-number-of-controller-arguments.codegen	
	
}
