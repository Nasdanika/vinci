/**
 */
package org.nasdanika.vinci.bootstrap;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.common.WorkFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Group Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for action group items
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.ActionGroupItem#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getActionGroupItem()
 * @model abstract="true" superTypes="org.nasdanika.vinci.bootstrap.Item org.nasdanika.ncore.WorkFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;"
 * @generated
 */
public interface ActionGroupItem extends Item, WorkFactory<Object> {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.common.WorkFactory}<code>&lt;java.lang.Object&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Item name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference list.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getActionGroupItem_Name()
	 * @model type="org.nasdanika.ncore.WorkFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;" containment="true" required="true"
	 * @generated
	 */
	EList<WorkFactory<Object>> getName();

} // ActionGroupItem
