/**
 */
package org.nasdanika.vinci.app.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.common.WorkFactory;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.BootstrapApplication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bootstrap Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BootstrapApplicationImpl extends MinimalEObjectImpl.Container implements BootstrapApplication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BootstrapApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.BOOTSTRAP_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	@Override
	public WorkFactory<Void> create(WorkFactory<Object> arg) throws Exception {
		throw new UnsupportedOperationException();
	}

} //BootstrapApplicationImpl
