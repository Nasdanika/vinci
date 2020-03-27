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
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.vinci.emf.ViewActionSupplierFactory;

/**
 * Provides adapters for the Ecore types - {@link EPackage}, {@link EClass}, {@link EStructuralFeature}, {@link EOperation}, ...
 * @author Pavel
 *
 */
public class EcoreViewActionSupplierFactoryAdapterFactory extends ComposedAdapterFactory {
	
	public EcoreViewActionSupplierFactoryAdapterFactory(/* TODO - configuration, e.g. roles of different things - navigation, section, ... */) {
		// Registering adapter factories.
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplierFactory, EPackage>(
				EcorePackage.Literals.EPACKAGE, 
				ViewActionSupplierFactory.class, 
				this.getClass().getClassLoader(), 
				ePackage -> new EPackageViewActionSupplierFactory(ePackage)));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplierFactory, EClass>(
				EcorePackage.Literals.ECLASS, 
				ViewActionSupplierFactory.class, 
				this.getClass().getClassLoader(), 
				EClassViewActionSupplierFactory::new));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplierFactory, EDataType>(
				EcorePackage.Literals.EDATA_TYPE, 
				ViewActionSupplierFactory.class, 
				this.getClass().getClassLoader(), 
				EDataTypeViewActionSupplierFactory::new));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplierFactory, EEnum>(
				EcorePackage.Literals.EENUM, 
				ViewActionSupplierFactory.class, 
				this.getClass().getClassLoader(), 
				EEnumViewActionSupplierFactory::new));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplierFactory, EEnumLiteral>(
				EcorePackage.Literals.EENUM_LITERAL, 
				ViewActionSupplierFactory.class, 
				this.getClass().getClassLoader(), 
				EEnumLiteralViewActionSupplierFactory::new));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplierFactory, EAttribute>(
				EcorePackage.Literals.EATTRIBUTE, 
				ViewActionSupplierFactory.class, 
				this.getClass().getClassLoader(), 
				EAttributeViewActionSupplierFactory::new));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplierFactory, EReference>(
				EcorePackage.Literals.EREFERENCE, 
				ViewActionSupplierFactory.class, 
				this.getClass().getClassLoader(), 
				EReferenceViewActionSupplierFactory::new));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplierFactory, EOperation>(
				EcorePackage.Literals.EOPERATION, 
				ViewActionSupplierFactory.class, 
				this.getClass().getClassLoader(), 
				EOperationViewActionSupplierFactory::new));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplierFactory, EParameter>(
				EcorePackage.Literals.EPARAMETER, 
				ViewActionSupplierFactory.class, 
				this.getClass().getClassLoader(), 
				EParameterViewActionSupplierFactory::new));	
		
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplierFactory, ETypeParameter>(
				EcorePackage.Literals.ETYPE_PARAMETER, 
				ViewActionSupplierFactory.class, 
				this.getClass().getClassLoader(), 
				ETypeParameterViewActionSupplierFactory::new));	
	}

}
