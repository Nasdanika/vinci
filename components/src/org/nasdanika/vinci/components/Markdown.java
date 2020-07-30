/**
 */
package org.nasdanika.vinci.components;

import org.nasdanika.ncore.ModelElement;
import org.nasdanika.vinci.bootstrap.Appearance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markdown</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for generation of HTML from [Markdown](https://en.wikipedia.org/wiki/Markdown).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.Markdown#isStyle <em>Style</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.Markdown#isInterpolate <em>Interpolate</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.Markdown#getAppearance <em>Appearance</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.components.ComponentsPackage#getMarkdown()
 * @model abstract="true"
 * @generated
 */
public interface Markdown extends ModelElement {

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this attribute is set to true the generated markdown is placed in a ``div`` with ``markdown-body`` class in order to be styled by the GitHub Markdown CSS. For this the page shall have "Github Markdown CSS" attribute set to true or add a stylesheet explicitly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(boolean)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getMarkdown_Style()
	 * @model
	 * @generated
	 */
	boolean isStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.Markdown#isStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #isStyle()
	 * @generated
	 */
	void setStyle(boolean value);

	/**
	 * Returns the value of the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, HTML generated from the markdown is interpolated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolate</em>' attribute.
	 * @see #setInterpolate(boolean)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getMarkdown_Interpolate()
	 * @model
	 * @generated
	 */
	boolean isInterpolate();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.Markdown#isInterpolate <em>Interpolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolate</em>' attribute.
	 * @see #isInterpolate()
	 * @generated
	 */
	void setInterpolate(boolean value);

	/**
	 * Returns the value of the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appearance to apply to the generated HTML.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appearance</em>' containment reference.
	 * @see #setAppearance(Appearance)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getMarkdown_Appearance()
	 * @model containment="true"
	 * @generated
	 */
	Appearance getAppearance();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.Markdown#getAppearance <em>Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance</em>' containment reference.
	 * @see #getAppearance()
	 * @generated
	 */
	void setAppearance(Appearance value);
} // Markdown
