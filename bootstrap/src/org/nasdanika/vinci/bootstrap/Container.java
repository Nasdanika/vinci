/**
 */
package org.nasdanika.vinci.bootstrap;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.html.app.ViewPart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [Bootstrap layout](https://getbootstrap.com/docs/4.3/layout/overview/) container contains rows which in turn contain columns.
 * <!-- end-model-doc -->
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
 * @model superTypes="org.nasdanika.vinci.bootstrap.BootstrapElement org.nasdanika.ncore.ISupplierFactory&lt;org.nasdanika.vinci.html.ViewPart&gt;"
 * @generated
 */
public interface Container extends BootstrapElement, SupplierFactory<ViewPart> {
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
	 * Fluid container spans the entire width of the viewport.
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
