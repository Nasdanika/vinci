package org.nasdanika.vinci.ecore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.vinci.emf.ViewActionSupplier;

/**
 * Provides adapters for the Ecore types - {@link EPackage}, {@link EClass}, {@link EStructuralFeature}, {@link EOperation}, ...
 * @author Pavel
 *
 */
public class EcoreViewActionSupplierFactoryAdapterFactory extends ComposedAdapterFactory {
	
	public EcoreViewActionSupplierFactoryAdapterFactory(/* TODO - configuration, e.g. roles of different things - navigation, section, ... */) {
		// Registering adapter factories.
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EPackage>(
				EcorePackage.Literals.EPACKAGE, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				ePackage -> new EPackageViewActionSupplier(ePackage)));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EClass>(
				EcorePackage.Literals.ECLASS, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				EClassViewActionSupplier::new));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EDataType>(
				EcorePackage.Literals.EDATA_TYPE, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				EDataTypeViewActionSupplierFactory::new));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EEnum>(
				EcorePackage.Literals.EENUM, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				EEnumViewActionSupplier::new));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EEnumLiteral>(
				EcorePackage.Literals.EENUM_LITERAL, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				EEnumLiteralViewActionSupplier::new));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EAttribute>(
				EcorePackage.Literals.EATTRIBUTE, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				EAttributeViewActionSupplier::new));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EReference>(
				EcorePackage.Literals.EREFERENCE, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				EReferenceViewActionSupplier::new));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EOperation>(
				EcorePackage.Literals.EOPERATION, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				EOperationViewActionSupplier::new));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EParameter>(
				EcorePackage.Literals.EPARAMETER, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				EParameterViewActionSupplier::new));	
	}

}
