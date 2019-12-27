/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bootstrap Container Application Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contributes to building BootstrapContainerApplication
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.vinci.app.AppPackage#getBootstrapContainerApplicationBuilder()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BootstrapContainerApplicationBuilder extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wraps element into a Consumer to be used as an application builder.
	 * <!-- end-model-doc -->
	 * @model type="org.nasdanika.ncore.IConsumer&lt;org.eclipse.emf.ecore.EJavaObject&gt;" exceptions="org.nasdanika.ncore.Exception" contextDataType="org.nasdanika.ncore.IContext"
	 * @generated
	 */
	Consumer<Object> createConsumer(Context context) throws Exception;

} // BootstrapContainerApplicationBuilder
