/**
 */
package org.nasdanika.vinci.components;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.vinci.app.AbstractAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Of Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Containing action content rendered in a table.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.TableOfActions#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.components.ComponentsPackage#getTableOfActions()
 * @model
 * @generated
 */
public interface TableOfActions extends TableOfContents {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.app.AbstractAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Root actions to include in the list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getTableOfActions_Actions()
	 * @model
	 * @generated
	 */
	EList<AbstractAction> getActions();

} // TableOfActions
