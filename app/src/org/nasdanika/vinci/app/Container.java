/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container of elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.Container#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.app.AppPackage#getContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Container<E> extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container elements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference.
	 * @see #setElements(Object)
	 * @see org.nasdanika.vinci.app.AppPackage#getContainer_Elements()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	E getElements();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.Container#getElements <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' containment reference.
	 * @see #getElements()
	 * @generated
	 */
	void setElements(E value);

} // Container
