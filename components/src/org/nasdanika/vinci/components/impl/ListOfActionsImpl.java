/**
 */
package org.nasdanika.vinci.components.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.components.ComponentsPackage;
import org.nasdanika.vinci.components.ListOfActions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.impl.ListOfActionsImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfActionsImpl extends ListOfContentsImpl implements ListOfActions {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfActionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.LIST_OF_ACTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractAction> getActions() {
		return (EList<AbstractAction>)eDynamicGet(ComponentsPackage.LIST_OF_ACTIONS__ACTIONS, ComponentsPackage.Literals.LIST_OF_ACTIONS__ACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.LIST_OF_ACTIONS__ACTIONS:
				return getActions();
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
			case ComponentsPackage.LIST_OF_ACTIONS__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends AbstractAction>)newValue);
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
			case ComponentsPackage.LIST_OF_ACTIONS__ACTIONS:
				getActions().clear();
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
			case ComponentsPackage.LIST_OF_ACTIONS__ACTIONS:
				return !getActions().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
} //ListOfActionsImpl
