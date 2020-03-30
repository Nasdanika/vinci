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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.nasdanika.cli.CommandBase;
import org.nasdanika.cli.ProgressMonitorMixin;
import org.nasdanika.common.ProgressMonitor;
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
		description = "Generates Ecore model documentation as Vinci action tree",
		name = "ecore-doc",
		versionProvider = BundleVersionProvider.class)
public class EcoreDocumentationGeneratorCommand extends CommandBase {
	
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
	
	// TODO - localizations - enum as they become available.

	protected GenModelResourceSet resourceSet;
	// protected ResourceLocator resourceLocator;

	/**
	 * Generates documentation
	 * @param resourceLocator Locator of localized resources.
	 */
	public EcoreDocumentationGeneratorCommand() {
		resourceSet = new GenModelResourceSet();		
		resourceSet.getAdapterFactories().add(createAdapterFactory());
		// this.resourceLocator = resourceLocator;
	}

	/**
	 * Override to customize the adapter factory.
	 * @return
	 */
	protected EcoreViewActionSupplierFactoryAdapterFactory createAdapterFactory() {
		return new EcoreViewActionSupplierFactoryAdapterFactory();
	}
	
	public List<ViewActionSupplier> loadGenModel() {
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
						ret.add(EObjectAdaptable.adaptTo(genPackage.getEcorePackage(), ViewActionSupplier.class));
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
				String resourceName = action.getText();
				if (!names.add(action.getText())) {
					resourceName += "-" + pos;
				}
				File effectiveOutputDir = outputDir == null ? new File(".") : outputDir;
				if (!effectiveOutputDir.exists()) {
					effectiveOutputDir.mkdirs();
				}
				File output = new File(effectiveOutputDir, resourceName + ".vinci");
				
				Resource resource = new XMLResourceImpl(URI.createURI(output.toURI().toString()));
				resource.getContents().add(action);		
				outputResourceSet.getResources().add(resource);
				++pos;
			}
			for (Resource resource: outputResourceSet.getResources()) {
				resource.save(null);
			}
		}
		return 0;
	}
		
}

