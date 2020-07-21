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
 * In the above case, when aciton mapping is retrieved as a String without a sub-key, it is possible to provide alternative text for the mapping link by separating it from the mapping by a space.
 * For example, ``${action-mappings/my-mapping alternative text here}`` will be interpolated as a link to the target action with "alternative text here" link text.
 * As a consequence, action aliases cannot have spaces in them.
 * 
 * Action mapping also supports ``text``, ``icon``, and ``url`` sub-keys computing to action text and action url for actions with reference activator. 
 * For example:
 * 
 * * ``${action-mappings/my-mapping/text}`` will interpolate to the mapped action text.
 * * ``${action-mappings/my-mapping/icon}`` will interpolate to the mapped action icon.
 * * ``${action-mappings/my-mapping/url}`` will interpolate to the mapped action url.
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
	 * <!-- begin-model-doc -->
	 * Mapping target.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Mapping description.
	 * <!-- end-model-doc -->
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
