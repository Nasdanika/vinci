/**
 */
package org.nasdanika.vinci.components;

import org.nasdanika.common.SupplierFactory;

import org.nasdanika.ncore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markdown Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generates HTML from [Markdown](https://en.wikipedia.org/wiki/Markdown) resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.MarkdownResource#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.MarkdownResource#isStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.components.ComponentsPackage#getMarkdownResource()
 * @model superTypes="org.nasdanika.ncore.ModelElement org.nasdanika.ncore.ISupplierFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;"
 * @generated
 */
public interface MarkdownResource extends ModelElement, SupplierFactory<Object> {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Markdown resource location. The resource location is resolved relative to the model resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getMarkdownResource_Location()
	 * @model required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.MarkdownResource#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this attribute is set to true the generated markdown is placed in a ``div`` with ``markdown-body`` class in order to be styled by the GitHub Markdown CSS. For this the page shall have "Github Markdown CSS" attribute set to true or add a stylesheet explicitly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(boolean)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getMarkdownResource_Style()
	 * @model
	 * @generated
	 */
	boolean isStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.MarkdownResource#isStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #isStyle()
	 * @generated
	 */
	void setStyle(boolean value);

} // MarkdownResource
