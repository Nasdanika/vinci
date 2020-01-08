/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container of elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.Container#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.Container#getLinkedElements <em>Linked Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.app.AppPackage#getContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Container<E> extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.vinci.app.AppPackage#getContainer_Elements()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	EList<E> getElements();

	/**
	 * Returns the value of the '<em><b>Linked Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements contained by another objects and logically linked to this container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linked Elements</em>' reference list.
	 * @see org.nasdanika.vinci.app.AppPackage#getContainer_LinkedElements()
	 * @model kind="reference"
	 * @generated
	 */
	EList<E> getLinkedElements();

} // Container
