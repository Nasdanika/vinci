/**
 */
package org.nasdanika.vinci.components;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.vinci.components.ComponentsPackage
 * @generated
 */
public interface ComponentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentsFactory eINSTANCE = org.nasdanika.vinci.components.impl.ComponentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Markdown Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Markdown Text</em>'.
	 * @generated
	 */
	MarkdownText createMarkdownText();

	/**
	 * Returns a new object of class '<em>Markdown Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Markdown Resource</em>'.
	 * @generated
	 */
	MarkdownResource createMarkdownResource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentsPackage getComponentsPackage();

} //ComponentsFactory
