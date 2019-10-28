/**
 */
package org.nasdanika.vinci.bootstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of actions (links). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.ActionGroup#isFlush <em>Flush</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.ActionGroup#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getActionGroup()
 * @model
 * @generated
 */
public interface ActionGroup extends Div {

	/**
	 * Returns the value of the '<em><b>Flush</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flush</em>' attribute.
	 * @see #setFlush(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getActionGroup_Flush()
	 * @model
	 * @generated
	 */
	boolean isFlush();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.ActionGroup#isFlush <em>Flush</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flush</em>' attribute.
	 * @see #isFlush()
	 * @generated
	 */
	void setFlush(boolean value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.bootstrap.ActionGroupItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Item name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getActionGroup_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionGroupItem> getItems();
} // ActionGroup
