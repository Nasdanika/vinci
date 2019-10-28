/**
 */
package org.nasdanika.vinci.bootstrap;

import org.nasdanika.ncore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for model elements which can be active, disabled, and have color.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Item#isActive <em>Active</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Item#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Item#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getItem()
 * @model abstract="true"
 * @generated
 */
public interface Item extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getItem_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Item#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getItem_Disabled()
	 * @model
	 * @generated
	 */
	boolean isDisabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Item#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isDisabled()
	 * @generated
	 */
	void setDisabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getItem_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Item#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // Item
