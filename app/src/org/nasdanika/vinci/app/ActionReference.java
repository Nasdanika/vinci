/**
 */
package org.nasdanika.vinci.app;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Action reference allows to "mount" an existing action as a child of another action. 
 * Using action references a single "logical" aciton hierarchy may be assembled from multiple model resources.
 * 
 * The referenced action inherits this action reference context. As such the same referenced action referenced by different action references may behave differently depending
 * on the action reference context/configuration. I.e. a reference may create a different "instance" of referenced action. 
 * In this case the referenced action activator shall also be context dependent - otherwise different instances of the same action will point to the same resource/url.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.ActionReference#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionReference#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionReference#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.app.AppPackage#getActionReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='action'"
 * @generated
 */
public interface ActionReference extends AbstractAction {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference title to display in the editor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionReference_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionReference#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionReference_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionReference#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referenced/mounted action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(AbstractAction)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionReference_Action()
	 * @model required="true"
	 * @generated
	 */
	AbstractAction getAction();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionReference#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(AbstractAction value);

} // ActionReference
