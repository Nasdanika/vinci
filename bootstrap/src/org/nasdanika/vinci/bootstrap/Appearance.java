/**
 */
package org.nasdanika.vinci.bootstrap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.ConsumerFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appearance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is used for configuring common aspects of HTML and Bootstrap elements such as background, spacing, text, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Appearance#getBackground <em>Background</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Appearance#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Appearance#getBorder <em>Border</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Appearance#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Appearance#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Appearance#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Appearance#getFloat <em>Float</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getAppearance()
 * @model superTypes="org.nasdanika.ncore.ConsumerFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='border_overlap background attributes'"
 * @generated
 */
public interface Appearance extends EObject, ConsumerFactory<Object> {
	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bootstrap color for background.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(String)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getAppearance_Background()
	 * @model
	 * @generated
	 */
	String getBackground();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Appearance#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTML attributes in [YAML](https://en.wikipedia.org/wiki/YAML) format. YAML is used because:
	 * 
	 * * Provides a convenient way of definining structured/hierarchical attributes such as ``class``, ``style``, and ``data-*``. These attributes are treated in a special way as explained below.
	 * * Comments improve maintainability.
	 * 
	 * ## Interpolation
	 * 
	 * Attribute values are interpolated, i.e. tokens in the form of ``${token name[|default value]}`` are replaced with the contextual values or default values, if any. Examples:
	 * 
	 * * ``${my-style}`` - Token without a default value.
	 * * ``${font-weight|bold}`` - Token with a default value.
	 * 
	 * ## Regular attributes
	 * 
	 * For all top-level keys except ``class``, ``style``, and ``data`` attribute value is produced by converting the value to string for scalars and to JSON string for lists and maps. 
	 * For attributes which do not start with ``data-`` a warning is issued if the value is not a scalar, i.e. a list or a map.
	 * 
	 * ### Example
	 * 
	 * ```yaml
	 * title: Hello
	 * href: "https://www.nasdanika.org"
	 * data-toggle: "#mybutton"
	 * ```
	 * 
	 * ## Class
	 * 
	 * For class attribute its value is formed by concantenating elements using space as a separator. If elements are hierarchical then class name is formed by concatenation with a dash (``-``) as a separator.
	 * 
	 * ### Examples
	 * 
	 * All these examples yield the same HTML output, which one to use is a question of preference.
	 * 
	 * #### String value
	 * 
	 * ```yaml
	 * class: d-none d-lg-block d-print-block
	 * ```
	 * 
	 * #### List
	 * 
	 * ```yaml
	 * class: 
	 *     - d-none 
	 *     - d-lg-block 
	 *     - d-print-block
	 *  ```
	 * 
	 * #### Map and List
	 * 
	 * ```yaml
	 * class: 
	 *     - d:
	 *         - none 
	 *         - lg-block 
	 *         - print-block
	 *  ```
	 * 
	 * #### Map
	 * 
	 * ```yaml
	 * class: 
	 *     d:
	 *         none: true # Boolean values are not concatenated into the class name, they serve as flags. In this case true is needed because none is part of a map, not a list
	 *         lg: block
	 *         print: block
	 *  ```
	 * 
	 * ## Data
	 * 
	 * If value of ``data`` attbibute is a map then keys of that map get concatenated with ``data`` using dash (``-``) as a separator, them same applies to nested maps. Non-map values become attribute values - scalars are converted to string, lists are converted to JSON string.
	 * 
	 * ### Example
	 * 
	 * ```yaml
	 * data:
	 *     toggle: collapse
	 *     target: "#collapseexample"
	 * ```
	 * 
	 * ## Style
	 * 
	 * Style can be defined as a string, list or map. If style is defined as a list, all list values are concatenated with a space as a separator - it is a convent way for long unstructured definitions.
	 * 
	 * If style value is a map then the value and its contained map values are processed in the following fashion:
	 * 
	 * * Keys are concatenated with dash as a separator.
	 * * List values are contcatenated wtih space as a separator.
	 * 
	 * ### Example
	 * 
	 * ```yaml
	 * style:
	 *     text:
	 *         decoration: none
	 *         color: blue
	 *         align: center
	 *         shadow:
	 *             - 2px
	 *             - 3px
	 *             - red
	 *     border: 1px solid black
	 * ```
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attributes</em>' attribute.
	 * @see #setAttributes(String)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getAppearance_Attributes()
	 * @model
	 * @generated
	 */
	String getAttributes();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Appearance#getAttributes <em>Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' attribute.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(String value);

	/**
	 * Returns the value of the '<em><b>Border</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.bootstrap.Border}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' containment reference list.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getAppearance_Border()
	 * @model containment="true" upper="4"
	 * @generated
	 */
	EList<Border> getBorder();

	/**
	 * Returns the value of the '<em><b>Margin</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.bootstrap.Spacing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin</em>' containment reference list.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getAppearance_Margin()
	 * @model containment="true"
	 * @generated
	 */
	EList<Spacing> getMargin();

	/**
	 * Returns the value of the '<em><b>Padding</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.bootstrap.Spacing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding</em>' containment reference list.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getAppearance_Padding()
	 * @model containment="true"
	 * @generated
	 */
	EList<Spacing> getPadding();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(Text)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getAppearance_Text()
	 * @model containment="true"
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Appearance#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

	/**
	 * Returns the value of the '<em><b>Float</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.bootstrap.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float</em>' containment reference list.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getAppearance_Float()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.nasdanika.vinci.bootstrap.Float> getFloat();

} // Appearance