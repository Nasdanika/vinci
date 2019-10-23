/**
 */
package org.nasdanika.vinci.html;

import org.nasdanika.common.WorkFactory;
import org.nasdanika.html.TagName;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.html.Tag#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.html.HtmlPackage#getTag()
 * @model superTypes="org.nasdanika.vinci.html.HtmlElement org.nasdanika.vinci.html.Container org.nasdanika.ncore.WorkFactory&lt;org.nasdanika.vinci.html.ITag&gt;"
 * @generated
 */
public interface Tag extends HtmlElement, Container, WorkFactory<org.nasdanika.html.Tag> {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(TagName)
	 * @see org.nasdanika.vinci.html.HtmlPackage#getTag_Name()
	 * @model dataType="org.nasdanika.vinci.html.TagName"
	 * @generated
	 */
	TagName getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.html.Tag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(TagName value);
} // Tag
