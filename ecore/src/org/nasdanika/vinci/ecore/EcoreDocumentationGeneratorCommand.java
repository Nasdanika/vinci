package org.nasdanika.vinci.ecore;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.nasdanika.cli.CommandBase;
import org.nasdanika.cli.ProgressMonitorMixin;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.emf.ViewActionSupplier;

import picocli.CommandLine.Command;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

/**
 * Generates Vinci {@link org.nasdanika.vinci.app.Action} tree documentation.
 * @author Pavel
 *
 */
@Command(
		description = "Generates Ecore model documentation as a Vinci action tree",
		name = "ecore",
		versionProvider = BundleVersionProvider.class)
public class EcoreDocumentationGeneratorCommand extends CommandBase {
	
	static final String JAVADOC_CONTEXT_BUILDER_MOUNT = "javadoc-context-builder-mount";

	@Parameters(
			paramLabel = "NS-URI", 
			arity = "1..*",
			description = "A list of model NS URI's to generate documentation for. "
					+ "For each NS-URI a vinci file is generated named after the root package in the model. "
					+ "If there are duplicate package names then argument index is added to de-dup the names. ")
	protected List<String> nsURIs = new ArrayList<>();	
	
	@Mixin
	private ProgressMonitorMixin progressMonitorMixin;
		
	@Option(names = {"-o", "--output"}, description = "Output directory, defaults to the current directory.")
	private File outputDir;		
		
	@Option(names = {"-b", "--base-uri"}, description = "Base URI for resolving eclasifier references in diagram image maps. Resolved against the output directory URI. Defaults to the output directory URI.")
	private String baseUri;
	
	@Option(
			names = {"-J", "--javadoc-context-builder-mount"}, 
			arity = "0..1",
			fallbackValue = "javadoc/",
			description = "If specified model instance class names are output as tokens for expansion to links to JavaDoc. If specified without parameter option value is ${FALLBACK-VALUE}")
	private String javaDocContextBuilderMount;			
	
	
	// TODO - localizations - enum as they become available.

	protected GenModelResourceSet resourceSet;
	// protected ResourceLocator resourceLocator;

	/**
	 * Override to customize the adapter factory.
	 * @return
	 */
	protected EcoreViewActionSupplierFactoryAdapterFactory createAdapterFactory() {
		if (outputDir == null) {
			outputDir = new File(".");
		}
		URI outputURI = URI.createFileURI(outputDir.getAbsolutePath() + File.separator);
		URI baseURI = Util.isBlank(baseUri) ? outputURI : URI.createURI(baseUri).resolve(outputURI);
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		context.register(URI.class, baseURI);
		context.put("base-uri", baseURI);
		if (!Util.isBlank(javaDocContextBuilderMount)) {
			context.put(JAVADOC_CONTEXT_BUILDER_MOUNT, javaDocContextBuilderMount);
		}
		
		return new EcoreViewActionSupplierFactoryAdapterFactory(context);
	}
	
	public List<ViewActionSupplier> loadGenModel() {
		resourceSet = new GenModelResourceSet();		
		resourceSet.getAdapterFactories().add(createAdapterFactory());
		
		List<Resource> resources = new ArrayList<>();
		for (String nsURI: nsURIs) {
			Resource genModel = resourceSet.loadGenModel(nsURI);
			if (genModel == null) {
				throw new IllegalArgumentException("Gen model not found for NS URI " + nsURI);
			}
			resources.add(genModel);
		}
		List<ViewActionSupplier> ret = new ArrayList<>();
		for (Resource resource: resources) {
			for (EObject contents: resource.getContents()) {
				if (contents instanceof GenModel) {
					for (GenPackage genPackage: ((GenModel) contents).getGenPackages()) {
						EPackage ecorePackage = genPackage.getEcorePackage();
						ret.add(EObjectAdaptable.adaptTo(ecorePackage, ViewActionSupplier.class));
					}
				}
			}
		}
		return ret;
	}

	@Override
	public Integer call() throws Exception {
		List<ViewActionSupplier> suppliers = loadGenModel();
		
		Set<String> names = new HashSet<>();
		
		ResourceSet outputResourceSet = new ResourceSetImpl();
		try (ProgressMonitor pm = progressMonitorMixin.createProgressMonitor(suppliers.size())) { 
			int pos = 0;
			for (ViewActionSupplier supplier: suppliers) {
				Action action = supplier.getAction(pm);
				supplier.configure(pm);
				
				String resourceName = action.getText();
				if (!names.add(action.getText())) {
					resourceName += "-" + pos;
				}
				File effectiveOutputDir = outputDir == null ? new File(".") : outputDir;
				if (!effectiveOutputDir.exists()) {
					effectiveOutputDir.mkdirs();
				}
				File output = new File(effectiveOutputDir, resourceName + ".vinci");
				
				Resource resource = outputResourceSet.createResource(URI.createURI(output.toURI().toString()));
				resource.getContents().add(action);		
				++pos;
			}
			for (Resource resource: outputResourceSet.getResources()) {
				resource.save(null);
			}
		}
		return 0;
	}
		
}

