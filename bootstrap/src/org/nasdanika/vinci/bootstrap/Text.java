/**
 */
package org.nasdanika.vinci.bootstrap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Text styling.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Text#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Text#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Text#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Text#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Text#isMonospace <em>Monospace</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Text#isItalic <em>Italic</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Text#isNowrap <em>Nowrap</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Text#isTruncate <em>Truncate</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getText()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='attributes'"
 * @generated
 */
public interface Text extends EObject {
	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text alignment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see #setAlignment(String)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getText_Alignment()
	 * @model
	 * @generated
	 */
	String getAlignment();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Text#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text bootstrap color.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getText_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Text#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text case transformation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transform</em>' attribute.
	 * @see #setTransform(String)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getText_Transform()
	 * @model
	 * @generated
	 */
	String getTransform();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Text#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' attribute.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text weight.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(String)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getText_Weight()
	 * @model
	 * @generated
	 */
	String getWeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Text#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(String value);

	/**
	 * Returns the value of the '<em><b>Monospace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Monospace flag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monospace</em>' attribute.
	 * @see #setMonospace(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getText_Monospace()
	 * @model
	 * @generated
	 */
	boolean isMonospace();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Text#isMonospace <em>Monospace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monospace</em>' attribute.
	 * @see #isMonospace()
	 * @generated
	 */
	void setMonospace(boolean value);

	/**
	 * Returns the value of the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Italic flag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Italic</em>' attribute.
	 * @see #setItalic(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getText_Italic()
	 * @model
	 * @generated
	 */
	boolean isItalic();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Text#isItalic <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italic</em>' attribute.
	 * @see #isItalic()
	 * @generated
	 */
	void setItalic(boolean value);

	/**
	 * Returns the value of the '<em><b>Nowrap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prevents text from wrapping.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nowrap</em>' attribute.
	 * @see #setNowrap(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getText_Nowrap()
	 * @model
	 * @generated
	 */
	boolean isNowrap();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Text#isNowrap <em>Nowrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nowrap</em>' attribute.
	 * @see #isNowrap()
	 * @generated
	 */
	void setNowrap(boolean value);

	/**
	 * Returns the value of the '<em><b>Truncate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use to truncate the text with an ellipsis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Truncate</em>' attribute.
	 * @see #setTruncate(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getText_Truncate()
	 * @model
	 * @generated
	 */
	boolean isTruncate();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Text#isTruncate <em>Truncate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Truncate</em>' attribute.
	 * @see #isTruncate()
	 * @generated
	 */
	void setTruncate(boolean value);

} // Text
