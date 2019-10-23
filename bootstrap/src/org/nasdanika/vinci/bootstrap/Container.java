/**
 */
package org.nasdanika.vinci.bootstrap;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.WorkFactory;

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
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getContainer()
 * @model superTypes="org.nasdanika.vinci.bootstrap.BootstrapElement org.nasdanika.ncore.WorkFactory&lt;org.nasdanika.vinci.bootstrap.IBootstrapElement&gt;"
 * @generated
 */
public interface Container extends BootstrapElement, WorkFactory<org.nasdanika.html.bootstrap.BootstrapElement> {
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

} // Container
