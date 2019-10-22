/**
 */
package org.nasdanika.vinci.bootstrap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.common.CommandFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Card#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Card#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Card#getFooter <em>Footer</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getCard()
 * @model
 * @generated
 */
public interface Card extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.common.CommandFactory}<code>&lt;java.lang.Object&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference list.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getCard_Header()
	 * @model type="org.nasdanika.ncore.CommandFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;" containment="true"
	 * @generated
	 */
	EList<CommandFactory<Object>> getHeader();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.common.CommandFactory}<code>&lt;java.lang.Object&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getCard_Body()
	 * @model type="org.nasdanika.ncore.CommandFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;" containment="true"
	 * @generated
	 */
	EList<CommandFactory<Object>> getBody();

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.common.CommandFactory}<code>&lt;java.lang.Object&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference list.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getCard_Footer()
	 * @model type="org.nasdanika.ncore.CommandFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;" containment="true"
	 * @generated
	 */
	EList<CommandFactory<Object>> getFooter();

} // Card
