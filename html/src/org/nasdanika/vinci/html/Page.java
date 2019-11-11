/**
 */
package org.nasdanika.vinci.html;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.SupplierFactory;

import org.nasdanika.ncore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HTML page. The name attribute is output as ``<TITLE>`` in the head.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.html.Page#getHead <em>Head</em>}</li>
 *   <li>{@link org.nasdanika.vinci.html.Page#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.vinci.html.Page#getBuilders <em>Builders</em>}</li>
 *   <li>{@link org.nasdanika.vinci.html.Page#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.vinci.html.Page#getStylesheets <em>Stylesheets</em>}</li>
 *   <li>{@link org.nasdanika.vinci.html.Page#getScripts <em>Scripts</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.html.HtmlPackage#getPage()
 * @model superTypes="org.nasdanika.ncore.NamedElement org.nasdanika.ncore.WorkFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;"
 * @generated
 */
public interface Page extends NamedElement, SupplierFactory<Object> {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.common.SupplierFactory}<code>&lt;java.lang.Object&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Head content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Head</em>' containment reference list.
	 * @see org.nasdanika.vinci.html.HtmlPackage#getPage_Head()
	 * @model type="org.nasdanika.ncore.WorkFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;" containment="true"
	 * @generated
	 */
	EList<SupplierFactory<Object>> getHead();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.common.SupplierFactory}<code>&lt;java.lang.Object&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Body content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see org.nasdanika.vinci.html.HtmlPackage#getPage_Body()
	 * @model type="org.nasdanika.ncore.WorkFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;" containment="true"
	 * @generated
	 */
	EList<SupplierFactory<Object>> getBody();

	/**
	 * Returns the value of the '<em><b>Builders</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.common.FunctionFactory}<code>&lt;java.lang.Object, java.lang.Object&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Builders operate on an instance of ``org.nasdanika.html.HTMLPage`` created by the the page element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Builders</em>' containment reference list.
	 * @see org.nasdanika.vinci.html.HtmlPackage#getPage_Builders()
	 * @model type="org.nasdanika.ncore.IFunction&lt;org.eclipse.emf.ecore.EJavaObject, org.eclipse.emf.ecore.EJavaObject&gt;" containment="true"
	 * @generated
	 */
	EList<FunctionFactory<Object, Object>> getBuilders();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Page language - ``lang`` attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.nasdanika.vinci.html.HtmlPackage#getPage_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.html.Page#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Stylesheets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL's of external stylesheets used by the page.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stylesheets</em>' attribute list.
	 * @see org.nasdanika.vinci.html.HtmlPackage#getPage_Stylesheets()
	 * @model
	 * @generated
	 */
	EList<String> getStylesheets();

	/**
	 * Returns the value of the '<em><b>Scripts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL's of external scripts used by the page, e.g. jQuery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scripts</em>' attribute list.
	 * @see org.nasdanika.vinci.html.HtmlPackage#getPage_Scripts()
	 * @model
	 * @generated
	 */
	EList<String> getScripts();

} // Page
