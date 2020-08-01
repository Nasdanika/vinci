/**
 */
package org.nasdanika.vinci.html;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Util;
import org.nasdanika.ncore.NcoreFactory;
import org.nasdanika.ncore.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container of content such as text and HTML markup.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.html.Container#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.vinci.html.Container#getMarkdownContent <em>Markdown Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.html.HtmlPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container content. 
	 * 
	 * Content elements are adapted to ${javadoc/org.nasdanika.common.SupplierFactory} for generation of HTML content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.nasdanika.vinci.html.HtmlPackage#getContainer_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getContent();

	/**
	 * Returns the value of the '<em><b>Markdown Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [Markdown](https://en.wikipedia.org/wiki/Markdown) text. If this attribute contains text, the text is converted to HTML, interpolated and used as the first content element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Markdown Content</em>' attribute.
	 * @see #setMarkdownContent(String)
	 * @see org.nasdanika.vinci.html.HtmlPackage#getContainer_MarkdownContent()
	 * @model annotation="urn:org.nasdanika content-type='text/markdown'"
	 * @generated
	 */
	String getMarkdownContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.html.Container#getMarkdownContent <em>Markdown Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Markdown Content</em>' attribute.
	 * @see #getMarkdownContent()
	 * @generated
	 */
	void setMarkdownContent(String value);
	
	/**
	 * Convenience method for adding content as {@link Value}
	 * @param content
	 */
	default void addContent(String content) {
		if (!Util.isBlank(content)) {
			Value value = NcoreFactory.eINSTANCE.createValue();
			value.setValue(content);
			getContent().add(value);
		}		
	}	

} // Container
