/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.SupplierFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for concrete action classes - Action and Partition. These sub-classes are semantically equivalent and differ only in diagram representation - Action is represented by a node, Partition by a container node.
 * Action can be a child of another action or of an action category. It may contain content and action elements - abstract actions and action categories. It may also contain action aliases - logical names of actions referenced by this action's content.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.ActionBase#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionBase#getSectionStyle <em>Section Style</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionBase#getSectionColumns <em>Section Columns</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionBase#getActivator <em>Activator</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionBase#getActivatorType <em>Activator Type</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionBase#getConfirmation <em>Confirmation</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionBase#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionBase#isFloatRight <em>Float Right</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionBase#isEmbedded <em>Embedded</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionBase#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.app.AppPackage#getActionBase()
 * @model abstract="true"
 * @generated
 */
public interface ActionBase extends Label, AbstractAction, Container<ActionElement> {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.vinci.app.ActionRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions may play different roles in their container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see org.nasdanika.vinci.app.ActionRole
	 * @see #setRole(ActionRole)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionBase_Role()
	 * @model
	 * @generated
	 */
	ActionRole getRole();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionBase#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see org.nasdanika.vinci.app.ActionRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ActionRole value);

	/**
	 * Returns the value of the '<em><b>Section Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.vinci.app.SectionStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Style</em>' attribute.
	 * @see org.nasdanika.vinci.app.SectionStyle
	 * @see #setSectionStyle(SectionStyle)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionBase_SectionStyle()
	 * @model
	 * @generated
	 */
	SectionStyle getSectionStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionBase#getSectionStyle <em>Section Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Style</em>' attribute.
	 * @see org.nasdanika.vinci.app.SectionStyle
	 * @see #getSectionStyle()
	 * @generated
	 */
	void setSectionStyle(SectionStyle value);

	/**
	 * Returns the value of the '<em><b>Section Columns</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applicable to section style "Card". Defines how many columns shall be in a row of section cards.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Section Columns</em>' attribute.
	 * @see #setSectionColumns(int)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionBase_SectionColumns()
	 * @model default="1"
	 * @generated
	 */
	int getSectionColumns();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionBase#getSectionColumns <em>Section Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Columns</em>' attribute.
	 * @see #getSectionColumns()
	 * @generated
	 */
	void setSectionColumns(int value);

	/**
	 * Returns the value of the '<em><b>Activator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activator</em>' attribute.
	 * @see #setActivator(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionBase_Activator()
	 * @model
	 * @generated
	 */
	String getActivator();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionBase#getActivator <em>Activator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activator</em>' attribute.
	 * @see #getActivator()
	 * @generated
	 */
	void setActivator(String value);

	/**
	 * Returns the value of the '<em><b>Activator Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.vinci.app.ActivatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activator Type</em>' attribute.
	 * @see org.nasdanika.vinci.app.ActivatorType
	 * @see #setActivatorType(ActivatorType)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionBase_ActivatorType()
	 * @model
	 * @generated
	 */
	ActivatorType getActivatorType();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionBase#getActivatorType <em>Activator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activator Type</em>' attribute.
	 * @see org.nasdanika.vinci.app.ActivatorType
	 * @see #getActivatorType()
	 * @generated
	 */
	void setActivatorType(ActivatorType value);

	/**
	 * Returns the value of the '<em><b>Confirmation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Confirmation to display in a confirmation dialog before action execution to give the user an opportunity to cancel the action. E.g. confirmation of deletion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confirmation</em>' attribute.
	 * @see #setConfirmation(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionBase_Confirmation()
	 * @model
	 * @generated
	 */
	String getConfirmation();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionBase#getConfirmation <em>Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirmation</em>' attribute.
	 * @see #getConfirmation()
	 * @generated
	 */
	void setConfirmation(String value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, then action is displayed as disabled. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(boolean)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionBase_Disabled()
	 * @model
	 * @generated
	 */
	boolean isDisabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionBase#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isDisabled()
	 * @generated
	 */
	void setDisabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Float Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is applicable for actions displayed in a navbar. If true, then action is displayed on the right.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Float Right</em>' attribute.
	 * @see #setFloatRight(boolean)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionBase_FloatRight()
	 * @model
	 * @generated
	 */
	boolean isFloatRight();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionBase#isFloatRight <em>Float Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float Right</em>' attribute.
	 * @see #isFloatRight()
	 * @generated
	 */
	void setFloatRight(boolean value);

	/**
	 * Returns the value of the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, then action content is displayed instead of action label. For example, a login form action or a search action can be embedded into a navbar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedded</em>' attribute.
	 * @see #setEmbedded(boolean)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionBase_Embedded()
	 * @model
	 * @generated
	 */
	boolean isEmbedded();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionBase#isEmbedded <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded</em>' attribute.
	 * @see #isEmbedded()
	 * @generated
	 */
	void setEmbedded(boolean value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.common.SupplierFactory}<code>&lt;java.lang.Object&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action content generator(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.nasdanika.vinci.app.AppPackage#getActionBase_Content()
	 * @model type="org.nasdanika.ncore.ISupplierFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;" containment="true"
	 * @generated
	 */
	EList<SupplierFactory<Object>> getContent();

} // ActionBase
