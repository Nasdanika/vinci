/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Action mapping provides a logical name (alias) for another (abstract) action for convenient linking/referencing from action's content.
 * 
 * Action mapping target is injected into the context under ``action-mappings/<mapping name>`` key. When retrieved as a String, e.g. during interpolation, the mapping is converted to a link. 
 * I.e. in ``This is my mapping ${action-mappings/my-mapping}!`` ``${action-mappings/my-mapping}`` will be interpolated into a link to the mapped action.
 * 
 * Mappings are inherited by children. Lower level mappings hide higher level mappings. Action reference mappings are passed to the reference target. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.ActionMapping#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionMapping#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionMapping#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.app.AppPackage#getActionMapping()
 * @model
 * @generated
 */
public interface ActionMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical name of the target action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionMapping_Alias()
	 * @model required="true"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionMapping#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractAction)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionMapping_Target()
	 * @model required="true"
	 * @generated
	 */
	AbstractAction getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionMapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractAction value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionMapping_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionMapping#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ActionMapping
