/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;

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
	 * Creates a supplier of ApplicationBuilder used to build the application.
	 * <!-- end-model-doc -->
	 * @model type="org.nasdanika.ncore.ISupplier&lt;org.eclipse.emf.ecore.EJavaObject&gt;" exceptions="org.nasdanika.ncore.Exception" contextDataType="org.nasdanika.ncore.IContext"
	 * @generated
	 */
	Supplier<Object> createApplicationBuilderSupplier(Context context) throws Exception;

} // BootstrapContainerApplicationBuilder
