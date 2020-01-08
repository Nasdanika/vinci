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
 * Action can be a child of another action or of an action category. It may contain content and action elements - abstract actions and action categories. It may also contain action mappings - logical names of actions referenced by this action's content.
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
 *   <li>{@link org.nasdanika.vinci.app.ActionBase#isEmbedded <em>Embedded</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionBase#getMarkdownContent <em>Markdown Content</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionBase#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.app.AppPackage#getActionBase()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sectionStyle'"
 * @generated
 */
public interface ActionBase extends Label, AbstractAction, Container<ActionElement> {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.vinci.app.ActionRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions may play different roles in their container. Action roles are used in automated "wiring" of actions into the generated application:
	 * 
	 * For the root action its children are displayed depending on their rolw as follows:
	 * 
	 * * Navigation: 
	 *     * The first navigation child is called "Principal" and is displayed in the navbar brand. 
	 *     * The remaining navigation children are displayed in navs on the right in the header.
	 * * Context children are displayed in the footer.
	 * 
	 * For the principal action (the first navigation child of the root action):
	 * 
	 * * Navigation actions are displayed in the navigation panel on the left.
	 * * Context actions are displayed in the navbar.
	 * 
	 * For other non-section actions navigation children are displayed in the navigation panel and context children are displayed in right-floating navs on the top of the content panel.
	 * 
	 * Section actions are displayed as part of the content panel of their parent. Their navigation children are treated as sections and display of their context children depends on the section style.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines how to generate section children.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Section Style</em>' attribute.
	 * @see #setSectionStyle(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionBase_SectionStyle()
	 * @model
	 * @generated
	 */
	String getSectionStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionBase#getSectionStyle <em>Section Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Style</em>' attribute.
	 * @see #getSectionStyle()
	 * @generated
	 */
	void setSectionStyle(String value);

	/**
	 * Returns the value of the '<em><b>Section Columns</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applicable to section style "Card". Defines how many columns shall be in a row of section cards.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Section Columns</em>' attribute.
	 * @see #setSectionColumns(int)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionBase_SectionColumns()
	 * @model default="3"
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
	 * <!-- begin-model-doc -->
	 * Activator is either a URL if the activator type is Reference, or a script if the activator type is Script or Bind.
	 * 
	 * The application generator generates a page for an action only In the activator type is Reference and the URL does not contain ``://`` and does not start with ``/`` or ``./``. 
	 * Using ``./`` is a way to reference externally generated content. For example, create a hierarch/federation of sites.
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Action activator type. Actions may have no activators. Activator and activator type settings are not used for actions in Section role.
	 * <!-- end-model-doc -->
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
	 * Confirmation to display in a confirmation dialog before action activation to give the user an opportunity to cancel the action. E.g. confirmation of deletion.
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
	 * Returns the value of the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, then action content is displayed instead of the action label. For example, a login form action or a search action can be embedded into a navbar.
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
	 * Returns the value of the '<em><b>Markdown Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [Markdown](https://en.wikipedia.org/wiki/Markdown) text. If this attribute contains text, the text is converted to HTML, interpolated and used as the first content element.
	 * The primary purpose of this attribute is rapid development/prototyping of web applications/sites. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Markdown Content</em>' attribute.
	 * @see #setMarkdownContent(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionBase_MarkdownContent()
	 * @model annotation="urn:org.nasdanika content-type='text/markdown'"
	 * @generated
	 */
	String getMarkdownContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionBase#getMarkdownContent <em>Markdown Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Markdown Content</em>' attribute.
	 * @see #getMarkdownContent()
	 * @generated
	 */
	void setMarkdownContent(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.common.SupplierFactory}<code>&lt;java.lang.Object&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.nasdanika.vinci.app.AppPackage#getActionBase_Content()
	 * @model type="org.nasdanika.ncore.ISupplierFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;" containment="true"
	 * @generated
	 */
	EList<SupplierFactory<Object>> getContent();

} // ActionBase
