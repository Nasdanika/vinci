/**
 */
package org.nasdanika.vinci.app.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.AbstractActionParent;
import org.nasdanika.vinci.app.ActionReference;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.MapElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionReferenceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionReferenceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionReferenceImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionReferenceImpl extends MinimalEObjectImpl.Container implements ActionReference {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.ACTION_REFERENCE;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractActionParent getParent() {
		return (AbstractActionParent)eDynamicGet(AppPackage.ACTION_REFERENCE__PARENT, AppPackage.Literals.MAP_ELEMENT__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractActionParent basicGetParent() {
		return (AbstractActionParent)eDynamicGet(AppPackage.ACTION_REFERENCE__PARENT, AppPackage.Literals.MAP_ELEMENT__PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(AbstractActionParent newParent) {
		eDynamicSet(AppPackage.ACTION_REFERENCE__PARENT, AppPackage.Literals.MAP_ELEMENT__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(AppPackage.ACTION_REFERENCE__DESCRIPTION, AppPackage.Literals.ACTION_REFERENCE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(AppPackage.ACTION_REFERENCE__DESCRIPTION, AppPackage.Literals.ACTION_REFERENCE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractAction getAction() {
		return (AbstractAction)eDynamicGet(AppPackage.ACTION_REFERENCE__ACTION, AppPackage.Literals.ACTION_REFERENCE__ACTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction basicGetAction() {
		return (AbstractAction)eDynamicGet(AppPackage.ACTION_REFERENCE__ACTION, AppPackage.Literals.ACTION_REFERENCE__ACTION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(AbstractAction newAction) {
		eDynamicSet(AppPackage.ACTION_REFERENCE__ACTION, AppPackage.Literals.ACTION_REFERENCE__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppPackage.ACTION_REFERENCE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case AppPackage.ACTION_REFERENCE__DESCRIPTION:
				return getDescription();
			case AppPackage.ACTION_REFERENCE__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
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
			case AppPackage.ACTION_REFERENCE__PARENT:
				setParent((AbstractActionParent)newValue);
				return;
			case AppPackage.ACTION_REFERENCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AppPackage.ACTION_REFERENCE__ACTION:
				setAction((AbstractAction)newValue);
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
			case AppPackage.ACTION_REFERENCE__PARENT:
				setParent((AbstractActionParent)null);
				return;
			case AppPackage.ACTION_REFERENCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AppPackage.ACTION_REFERENCE__ACTION:
				setAction((AbstractAction)null);
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
			case AppPackage.ACTION_REFERENCE__PARENT:
				return basicGetParent() != null;
			case AppPackage.ACTION_REFERENCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case AppPackage.ACTION_REFERENCE__ACTION:
				return basicGetAction() != null;
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
				case AppPackage.ACTION_REFERENCE__PARENT: return AppPackage.MAP_ELEMENT__PARENT;
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
				case AppPackage.MAP_ELEMENT__PARENT: return AppPackage.ACTION_REFERENCE__PARENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActionReferenceImpl
