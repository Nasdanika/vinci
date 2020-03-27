package org.nasdanika.vinci.ecore;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.common.ResourceLocator;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.vinci.emf.ViewActionSupplierFactory;

/**
 * Generates Vinci {@link org.nasdanika.vinci.app.Action} tree documentation.
 * @author Pavel
 *
 */
public class EcoreDocumentationGenerator {

	protected GenModelResourceSet resourceSet;
	protected ResourceLocator resourceLocator;

	/**
	 * Generates documentation
	 * @param resourceLocator Locator of localized resources.
	 */
	public EcoreDocumentationGenerator(ResourceLocator resourceLocator) {
		
		resourceSet = new GenModelResourceSet();		
		resourceSet.getAdapterFactories().add(createAdapterFactory());
		
		this.resourceLocator = resourceLocator;
	}

	/**
	 * Override to customize the adapter factory.
	 * @return
	 */
	protected EcoreViewActionSupplierFactoryAdapterFactory createAdapterFactory() {
		return new EcoreViewActionSupplierFactoryAdapterFactory();
	}
	
	public List<ViewActionSupplierFactory> loadGenModel(List<String> nsURIs) {
		List<Resource> resources = new ArrayList<>();
		for (String nsURI: nsURIs) {
			resources.add(resourceSet.loadGenModel(nsURI));
		}
		List<ViewActionSupplierFactory> ret = new ArrayList<>();
		for (Resource resource: resources) {
			for (EObject contents: resource.getContents()) {
				if (contents instanceof GenModel) {
					for (GenPackage genPackage: ((GenModel) contents).getGenPackages()) {
						ret.add(EObjectAdaptable.adaptTo(genPackage.getEcorePackage(), ViewActionSupplierFactory.class));
					}
				}
			}
		}
		return ret;
	}
		
}

