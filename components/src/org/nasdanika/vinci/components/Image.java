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
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Embedded image which can be loaded from a file or taken as a screenshot.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.Image#getFormat <em>Format</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.Image#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.Image#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.Image#getAppearance <em>Appearance</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.Image#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.components.ComponentsPackage#getImage()
 * @model superTypes="org.nasdanika.ncore.ModelElement org.nasdanika.ncore.ISupplierFactory&lt;org.nasdanika.vinci.html.ViewPart&gt;"
 * @generated
 */
public interface Image extends ModelElement, SupplierFactory<ViewPart> {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Image format. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getImage_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.Image#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Image bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(byte[])
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getImage_Content()
	 * @model
	 * @generated
	 */
	byte[] getContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.Image#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(byte[] value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not blank, image caption is shown below the image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caption</em>' attribute.
	 * @see #setCaption(String)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getImage_Caption()
	 * @model
	 * @generated
	 */
	String getCaption();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.Image#getCaption <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' attribute.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(String value);

	/**
	 * Returns the value of the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appearance to apply to the image. E.g. border or float.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appearance</em>' containment reference.
	 * @see #setAppearance(Appearance)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getImage_Appearance()
	 * @model containment="true"
	 * @generated
	 */
	Appearance getAppearance();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.Image#getAppearance <em>Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance</em>' containment reference.
	 * @see #getAppearance()
	 * @generated
	 */
	void setAppearance(Appearance value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If target is set, then click on the image activates the target action. For example, a click on a screensot may open a dialog with a screen recording positioned at the time the screenshot was taken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractAction)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getImage_Target()
	 * @model
	 * @generated
	 */
	AbstractAction getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.Image#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractAction value);

} // Image
