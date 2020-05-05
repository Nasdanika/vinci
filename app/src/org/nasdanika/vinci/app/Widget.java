/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.common.SupplierFactory;

import org.nasdanika.ncore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Named content which is injected into the generated context under ``widgets/<widget name>`` and can be referenced from, say, markdown. This allows to combine the simplicity and ease of use of markdown with advanced functionality of components, e.g. the image component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.Widget#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.app.AppPackage#getWidget()
 * @model
 * @generated
 */
public interface Widget extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.common.SupplierFactory}<code>&lt;java.lang.Object&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Widget content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.nasdanika.vinci.app.AppPackage#getWidget_Content()
	 * @model type="org.nasdanika.ncore.ISupplierFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;" containment="true"
	 * @generated
	 */
	EList<SupplierFactory<Object>> getContent();

} // Widget
