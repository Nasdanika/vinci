/**
 */
package org.nasdanika.vinci.components;

import org.nasdanika.common.SupplierFactory;

import org.nasdanika.html.app.ViewPart;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.bootstrap.Appearance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generates a link to the target action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.ActionLink#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.ActionLink#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.ActionLink#getAppearance <em>Appearance</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.components.ComponentsPackage#getActionLink()
 * @model superTypes="org.nasdanika.ncore.ModelElement org.nasdanika.ncore.ISupplierFactory&lt;org.nasdanika.vinci.html.ViewPart&gt;"
 * @generated
 */
public interface ActionLink extends ModelElement, SupplierFactory<ViewPart> {

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link text. If blank, the action text is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getActionLink_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.ActionLink#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action to link to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractAction)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getActionLink_Target()
	 * @model required="true"
	 * @generated
	 */
	AbstractAction getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.ActionLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractAction value);

	/**
	 * Returns the value of the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appearance to apply to the generated HTML.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appearance</em>' containment reference.
	 * @see #setAppearance(Appearance)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getActionLink_Appearance()
	 * @model containment="true"
	 * @generated
	 */
	Appearance getAppearance();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.ActionLink#getAppearance <em>Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance</em>' containment reference.
	 * @see #getAppearance()
	 * @generated
	 */
	void setAppearance(Appearance value);
} // ActionLink
