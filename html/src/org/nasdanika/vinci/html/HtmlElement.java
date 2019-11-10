/**
 */
package org.nasdanika.vinci.html;

import org.nasdanika.common.Function;
import org.nasdanika.ncore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for other HTML and bootstrap elements. 
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.vinci.html.HtmlPackage#getHtmlElement()
 * @model abstract="true"
 * @generated
 */
public interface HtmlElement extends ModelElement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wraps element into a Function so it can be used as a builder - an existing object can be passed to HTML element's function and it will "build" it by applying styles, attriutes, etc.
	 * <!-- end-model-doc -->
	 * @model type="org.nasdanika.ncore.IFunction&lt;org.eclipse.emf.ecore.EJavaObject, org.eclipse.emf.ecore.EJavaObject&gt;"
	 * @generated
	 */
	Function<Object, Object> asBuilder();
} // HtmlElement
