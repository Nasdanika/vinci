/**
 */
package org.nasdanika.vinci.bootstrap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Float#getSide <em>Side</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Float#getBreakpoint <em>Breakpoint</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getFloat()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='attributes'"
 * @generated
 */
public interface Float extends EObject {
	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see #setSide(String)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getFloat_Side()
	 * @model required="true"
	 * @generated
	 */
	String getSide();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Float#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(String value);

	/**
	 * Returns the value of the '<em><b>Breakpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breakpoint</em>' attribute.
	 * @see #setBreakpoint(String)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getFloat_Breakpoint()
	 * @model
	 * @generated
	 */
	String getBreakpoint();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Float#getBreakpoint <em>Breakpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breakpoint</em>' attribute.
	 * @see #getBreakpoint()
	 * @generated
	 */
	void setBreakpoint(String value);

} // Float
