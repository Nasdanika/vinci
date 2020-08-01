/**
 */
package org.nasdanika.vinci.html;

import org.nasdanika.ncore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Script with code stored in the model element ``code`` attribute.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.html.Script#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.html.HtmlPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Script code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.nasdanika.vinci.html.HtmlPackage#getScript_Code()
	 * @model required="true"
	 *        annotation="urn:org.nasdanika content-type='text/code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.html.Script#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // Script
