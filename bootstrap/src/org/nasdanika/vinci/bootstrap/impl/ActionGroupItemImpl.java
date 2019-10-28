/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.CompoundWork;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Work;
import org.nasdanika.common.WorkFactory;
import org.nasdanika.vinci.bootstrap.ActionGroupItem;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Group Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.ActionGroupItemImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionGroupItemImpl extends ItemImpl implements ActionGroupItem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionGroupItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.ACTION_GROUP_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<WorkFactory<Object>> getName() {
		return (EList<WorkFactory<Object>>)eDynamicGet(BootstrapPackage.ACTION_GROUP_ITEM__NAME, BootstrapPackage.Literals.ACTION_GROUP_ITEM__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.ACTION_GROUP_ITEM__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.ACTION_GROUP_ITEM__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BootstrapPackage.ACTION_GROUP_ITEM__NAME:
				getName().clear();
				getName().addAll((Collection<? extends WorkFactory<Object>>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BootstrapPackage.ACTION_GROUP_ITEM__NAME:
				getName().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BootstrapPackage.ACTION_GROUP_ITEM__NAME:
				return !getName().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	protected Work<List<Object>> createNameWork(Context context) throws Exception {
		CompoundWork<List<Object>, Object> ret = new CompoundWork<List<Object>, Object>("Name", context.get(Executor.class)) {

			@Override
			protected List<Object> combine(List<Object> results, ProgressMonitor progressMonitor) throws Exception {
				return results;
			}
			
		}; 
		
		for (WorkFactory<Object> ne: getName()) {
			ret.add(ne.create(context));
		}
		
		return ret;
	}

} //ActionGroupItemImpl
