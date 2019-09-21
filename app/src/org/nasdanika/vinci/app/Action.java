/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Action can be a child of another action or of an action category. It may contain content and action elements - abstract actions and action categories. It may also contain action aliases - logical names of actions referenced by this action's content.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.Action#getActionMappings <em>Action Mappings</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.app.AppPackage#getAction()
 * @model superTypes="org.nasdanika.vinci.app.Label&lt;org.nasdanika.vinci.app.ActionSpec&gt; org.nasdanika.vinci.app.AbstractAction org.nasdanika.vinci.app.AbstractActionParent org.nasdanika.vinci.app.Container&lt;org.nasdanika.vinci.app.ActionElement&gt;"
 * @generated
 */
public interface Action extends Label<ActionSpec>, AbstractAction, AbstractActionParent, Container<ActionElement> {

	/**
	 * Returns the value of the '<em><b>Action Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.app.ActionMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of mappings of action logical names to target actions. Aliases are inherited by action children.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Mappings</em>' containment reference list.
	 * @see org.nasdanika.vinci.app.AppPackage#getAction_ActionMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionMapping> getActionMappings();
} // Action
