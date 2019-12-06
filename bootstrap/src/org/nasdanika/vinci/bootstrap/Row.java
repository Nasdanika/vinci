/**
 */
package org.nasdanika.vinci.bootstrap;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.ConsumerFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Row#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getRow()
 * @model superTypes="org.nasdanika.vinci.bootstrap.BootstrapElement org.nasdanika.ncore.IConsumerFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;"
 * @generated
 */
public interface Row extends BootstrapElement, ConsumerFactory<Object> {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.bootstrap.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getRow_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

} // Row
