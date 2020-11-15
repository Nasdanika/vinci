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
import org.nasdanika.common.Context;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.vinci.emf.ViewActionSupplier;

/**
 * Provides adapters for the Ecore types - {@link EPackage}, {@link EClass}, {@link EStructuralFeature}, {@link EOperation}, ...
 * @author Pavel
 *
 */
public class EcoreViewActionSupplierFactoryAdapterFactory extends ComposedAdapterFactory {
	
	public EcoreViewActionSupplierFactoryAdapterFactory(Context context) {
		// Registering adapter factories.
		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EPackage>(
				EcorePackage.Literals.EPACKAGE, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				e -> new EPackageViewActionSupplier(e,context)));	

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EClass>(
				EcorePackage.Literals.ECLASS, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				e -> new EClassViewActionSupplier(e,context)));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EDataType>(
				EcorePackage.Literals.EDATA_TYPE, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				e -> new EDataTypeViewActionSupplierFactory(e,context)));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EEnum>(
				EcorePackage.Literals.EENUM, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				e -> new EEnumViewActionSupplier(e,context)));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EEnumLiteral>(
				EcorePackage.Literals.EENUM_LITERAL, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				e -> new EEnumLiteralViewActionSupplier(e,context)));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EAttribute>(
				EcorePackage.Literals.EATTRIBUTE, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				e -> new EAttributeViewActionSupplier(e,context)));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EReference>(
				EcorePackage.Literals.EREFERENCE, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				e -> new EReferenceViewActionSupplier(e,context)));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EOperation>(
				EcorePackage.Literals.EOPERATION, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				e -> new EOperationViewActionSupplier(e,context)));		

		registerAdapterFactory(
			new FunctionAdapterFactory<ViewActionSupplier, EParameter>(
				EcorePackage.Literals.EPARAMETER, 
				ViewActionSupplier.class, 
				this.getClass().getClassLoader(), 
				e -> new EParameterViewActionSupplier(e,context)));	
	}

}
