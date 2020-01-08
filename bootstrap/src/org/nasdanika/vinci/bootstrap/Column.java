/**
 */
package org.nasdanika.vinci.bootstrap;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.vinci.html.Container;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container row column.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Column#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getColumn()
 * @model superTypes="org.nasdanika.vinci.bootstrap.BootstrapElement org.nasdanika.vinci.html.Container org.nasdanika.ncore.ISupplierFactory&lt;org.nasdanika.vinci.html.ViewBuilder&gt;"
 * @generated
 */
public interface Column extends BootstrapElement, Container, SupplierFactory<ViewBuilder> {

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.bootstrap.ColumnWidth}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Column widths for different breakpoints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' containment reference list.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getColumn_Width()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnWidth> getWidth();
} // Column
