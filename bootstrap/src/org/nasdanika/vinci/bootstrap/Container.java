/**
 */
package org.nasdanika.vinci.bootstrap;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.SupplierFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Container#getRows <em>Rows</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Container#isFluid <em>Fluid</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getContainer()
 * @model superTypes="org.nasdanika.vinci.bootstrap.BootstrapElement org.nasdanika.ncore.SupplierFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;"
 * @generated
 */
public interface Container extends BootstrapElement, SupplierFactory<Object> {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.bootstrap.Row}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getContainer_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Row> getRows();

	/**
	 * Returns the value of the '<em><b>Fluid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fluid container takes 100% width of the parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fluid</em>' attribute.
	 * @see #setFluid(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getContainer_Fluid()
	 * @model
	 * @generated
	 */
	boolean isFluid();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Container#isFluid <em>Fluid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fluid</em>' attribute.
	 * @see #isFluid()
	 * @generated
	 */
	void setFluid(boolean value);

} // Container