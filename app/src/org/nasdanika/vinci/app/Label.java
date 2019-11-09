/**
 */
package org.nasdanika.vinci.app;

import org.nasdanika.common.WorkFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.ncore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.Label#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.Label#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.Label#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.Label#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.Label#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.Label#isOutline <em>Outline</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.Label#getNotification <em>Notification</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.app.AppPackage#getLabel()
 * @model abstract="true" superTypes="org.nasdanika.ncore.ModelElement org.nasdanika.ncore.WorkFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;"
 * @generated
 */
public interface Label extends ModelElement, WorkFactory<Object> {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Color)
	 * @see org.nasdanika.vinci.app.AppPackage#getLabel_Color()
	 * @model dataType="org.nasdanika.vinci.app.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.Label#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getLabel_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.Label#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notification</em>' attribute.
	 * @see #setNotification(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getLabel_Notification()
	 * @model
	 * @generated
	 */
	String getNotification();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.Label#getNotification <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification</em>' attribute.
	 * @see #getNotification()
	 * @generated
	 */
	void setNotification(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getLabel_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.Label#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Label icon. Treated as URL if contains ``/`` or as a CSS class otherwise. E.g. ``fas fa-wrench`` would be treated as a CSS class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getLabel_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.Label#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tooltip</em>' attribute.
	 * @see #setTooltip(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getLabel_Tooltip()
	 * @model
	 * @generated
	 */
	String getTooltip();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.Label#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(String value);

	/**
	 * Returns the value of the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outline</em>' attribute.
	 * @see #setOutline(boolean)
	 * @see org.nasdanika.vinci.app.AppPackage#getLabel_Outline()
	 * @model
	 * @generated
	 */
	boolean isOutline();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.Label#isOutline <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline</em>' attribute.
	 * @see #isOutline()
	 * @generated
	 */
	void setOutline(boolean value);

} // Label
