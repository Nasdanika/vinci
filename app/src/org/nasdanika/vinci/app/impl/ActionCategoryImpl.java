/**
 */
package org.nasdanika.vinci.app.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.AbstractActionParent;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionCategory;
import org.nasdanika.vinci.app.ActionElement;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.MapElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionCategoryImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionCategoryImpl extends CategoryImpl<AbstractAction> implements ActionCategory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.ACTION_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionBase getParent() {
		return (ActionBase)eDynamicGet(AppPackage.ACTION_CATEGORY__PARENT, AppPackage.Literals.MAP_ELEMENT__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBase basicGetParent() {
		return (ActionBase)eDynamicGet(AppPackage.ACTION_CATEGORY__PARENT, AppPackage.Literals.MAP_ELEMENT__PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(ActionBase newParent) {
		eDynamicSet(AppPackage.ACTION_CATEGORY__PARENT, AppPackage.Literals.MAP_ELEMENT__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppPackage.ACTION_CATEGORY__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AppPackage.ACTION_CATEGORY__PARENT:
				setParent((ActionBase)newValue);
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
			case AppPackage.ACTION_CATEGORY__PARENT:
				setParent((ActionBase)null);
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
			case AppPackage.ACTION_CATEGORY__PARENT:
				return basicGetParent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MapElement.class) {
			switch (derivedFeatureID) {
				case AppPackage.ACTION_CATEGORY__PARENT: return AppPackage.MAP_ELEMENT__PARENT;
				default: return -1;
			}
		}
		if (baseClass == ActionElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractActionParent.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MapElement.class) {
			switch (baseFeatureID) {
				case AppPackage.MAP_ELEMENT__PARENT: return AppPackage.ACTION_CATEGORY__PARENT;
				default: return -1;
			}
		}
		if (baseClass == ActionElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractActionParent.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActionCategoryImpl
