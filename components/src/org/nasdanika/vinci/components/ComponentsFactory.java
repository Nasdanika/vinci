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
	 * Returns a new object of class '<em>Action Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Link</em>'.
	 * @generated
	 */
	ActionLink createActionLink();

	/**
	 * Returns a new object of class '<em>Table Of Contents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Of Contents</em>'.
	 * @generated
	 */
	TableOfContents createTableOfContents();

	/**
	 * Returns a new object of class '<em>List Of Contents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Of Contents</em>'.
	 * @generated
	 */
	ListOfContents createListOfContents();

	/**
	 * Returns a new object of class '<em>List Of Actions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Of Actions</em>'.
	 * @generated
	 */
	ListOfActions createListOfActions();

	/**
	 * Returns a new object of class '<em>Table Of Actions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Of Actions</em>'.
	 * @generated
	 */
	TableOfActions createTableOfActions();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentsPackage getComponentsPackage();

} //ComponentsFactory
