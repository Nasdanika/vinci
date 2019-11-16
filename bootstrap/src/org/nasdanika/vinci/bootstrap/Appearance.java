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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='border_overlap background'"
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
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.bootstrap.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getAppearance_Text()
	 * @model containment="true"
	 * @generated
	 */
	EList<Text> getText();

	/**
	 * Returns the value of the '<em><b>Float</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.bootstrap.Text}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float</em>' containment reference list.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getAppearance_Float()
	 * @model containment="true"
	 * @generated
	 */
	EList<Text> getFloat();

} // Appearance
