package org.nasdanika.vinci.tests;

import java.io.File;

import org.junit.Test;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressEntry;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.common.resources.Container;
import org.nasdanika.common.resources.FileSystemContainer;
import org.nasdanika.html.ecore.EcoreDocumentationGenerator;
import org.nasdanika.html.ecore.EcoreHelpGenerator;

public class GenerateModelDocumentation extends TestsBase {

	private static final String NCORE_MODEL_URI = "urn:org.nasdanika.ncore";
	private static final String VINCI_APP_MODEL_URI = "urn:org.nasdanika.vinci.app";
	private static final String VINCI_HTML_MODEL_URI = "urn:org.nasdanika.vinci.html";
	private static final String VINCI_BOOTSTRAP_MODEL_URI = "urn:org.nasdanika.vinci.bootstrap";
	private static final String VINCI_COMPONENTS_MODEL_URI = "urn:org.nasdanika.vinci.components";
	
	/**
	 * Generates Ecore model documentation.
	 * @throws Exception
	 */
	@Test
	public void testEcoreDocumentation() throws Exception {		
		EcoreDocumentationGenerator generator = new EcoreDocumentationGenerator("Nasdanika Vinci Model", null, null, false);
		generator.loadGenModel(NCORE_MODEL_URI);
		generator.loadGenModel(VINCI_APP_MODEL_URI);
		generator.loadGenModel(VINCI_HTML_MODEL_URI);
		generator.loadGenModel(VINCI_BOOTSTRAP_MODEL_URI);
		generator.loadGenModel(VINCI_COMPONENTS_MODEL_URI);
		File docDir = new File("target/model-doc");
		System.out.println("Generating HTML model documentation to "+docDir.getAbsolutePath());
		BinaryEntityContainer fsc = new FileSystemContainer(docDir);
		try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
			ProgressEntry pe = new ProgressEntry("Generating Codegen Model Documentation", 0);
			Container<Object> container = fsc.stateAdapter().adapt(null, encoder);
			generator.generate(container, progressMonitor.compose(pe));
			container.put("progress-report.json", pe.toString(), progressMonitor.split("Saving progress report", 1));
			
//			// HTML report
//			ProgressReportGenerator prg = new ProgressReportGenerator("Documentation generation", pe);
//			Container<Object> progressReportContainer = container.getContainer("progress-report", progressMonitor.split("Getting progress report container", 1));
//			prg.generate(progressReportContainer, progressMonitor.split("Generating progress report", 1));
		}
	}

	/**
	 * Generates Ecore model Eclipse help.
	 * @throws Exception
	 */
	@Test
	public void testEcoreHelp() throws Exception {		
		EcoreHelpGenerator generator = new EcoreHelpGenerator("Model", null, null, "Vinci", "../org.nasdanika.vinci.help/toc.xml#Vinci", "doc/model/");
		generator.loadGenModel(NCORE_MODEL_URI);
		generator.loadGenModel(VINCI_APP_MODEL_URI);
		generator.loadGenModel(VINCI_HTML_MODEL_URI);
		generator.loadGenModel(VINCI_BOOTSTRAP_MODEL_URI);
		generator.loadGenModel(VINCI_COMPONENTS_MODEL_URI);
		File docDir = new File("target/help/model");
		System.out.println("Generating Eclipse help model documentation to "+docDir.getAbsolutePath());
		BinaryEntityContainer fsc = new FileSystemContainer(docDir);
		try (ProgressMonitor progressMonitor = new PrintStreamProgressMonitor()) {
			ProgressEntry pe = new ProgressEntry("Generating Vinci Model Documentation", 0);
			Container<Object> container = fsc.stateAdapter().adapt(null, encoder);
			generator.generate(container, progressMonitor.compose(pe));
			container.put("progress-report.json", pe.toString(), progressMonitor.split("Writing progress-report.json", 1));
		}
	}
	
}
