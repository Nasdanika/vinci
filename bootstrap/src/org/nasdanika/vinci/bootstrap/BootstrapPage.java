/**
 */
package org.nasdanika.vinci.bootstrap;

import org.nasdanika.vinci.html.Page;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HTML page with bootstrap elements in the head - meta, stylesheets, and scripts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.BootstrapPage#isCdn <em>Cdn</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.BootstrapPage#getTheme <em>Theme</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getBootstrapPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='theme'"
 * @generated
 */
public interface BootstrapPage extends Page {
	/**
	 * Returns the value of the '<em><b>Cdn</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this attribute is true (default) then a generated page contains stylesheet and script elements pointing to Bootstrap CDN (Content Delivery Network).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cdn</em>' attribute.
	 * @see #setCdn(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getBootstrapPage_Cdn()
	 * @model default="true"
	 * @generated
	 */
	boolean isCdn();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.BootstrapPage#isCdn <em>Cdn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdn</em>' attribute.
	 * @see #isCdn()
	 * @generated
	 */
	void setCdn(boolean value);

	/**
	 * Returns the value of the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bootstrap [theme](https://www.nasdanika.org/master/products/html/apidocs/org.nasdanika.html.bootstrap/apidocs/org/nasdanika/html/bootstrap/Theme.html). This attribute is applicable only if CDN is set to true. In this case Bootstrap stylesheets added to the page point to a specific theme.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Theme</em>' attribute.
	 * @see #setTheme(String)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getBootstrapPage_Theme()
	 * @model
	 * @generated
	 */
	String getTheme();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.BootstrapPage#getTheme <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theme</em>' attribute.
	 * @see #getTheme()
	 * @generated
	 */
	void setTheme(String value);

} // BootstrapPage
