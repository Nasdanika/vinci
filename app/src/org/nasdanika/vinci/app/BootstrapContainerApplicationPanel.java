/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.vinci.bootstrap.ColumnWidth;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bootstrap Container Application Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bootstrap container application panel - a section with width spec - navigation panel and content panel.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.BootstrapContainerApplicationPanel#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.app.AppPackage#getBootstrapContainerApplicationPanel()
 * @model
 * @generated
 */
public interface BootstrapContainerApplicationPanel extends BootstrapContainerApplicationSection {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.bootstrap.ColumnWidth}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' containment reference list.
	 * @see org.nasdanika.vinci.app.AppPackage#getBootstrapContainerApplicationPanel_Width()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnWidth> getWidth();

} // BootstrapContainerApplicationPanel
