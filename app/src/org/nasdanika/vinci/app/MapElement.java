/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Map element is used for "logical" parenting of elements which overrides containment "physical" parenting. In other words if parent is null then eContainer() is the parent.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.MapElement#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.app.AppPackage#getMapElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MapElement<P> extends EObject {

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Object)
	 * @see org.nasdanika.vinci.app.AppPackage#getMapElement_Parent()
	 * @model kind="reference"
	 * @generated
	 */
	P getParent();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.MapElement#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(P value);
} // MapElement
