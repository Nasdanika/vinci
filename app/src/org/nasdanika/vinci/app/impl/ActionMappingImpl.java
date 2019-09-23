/**
 */
package org.nasdanika.vinci.app.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.ActionMapping;
import org.nasdanika.vinci.app.AppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionMappingImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionMappingImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionMappingImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionMappingImpl extends MinimalEObjectImpl.Container implements ActionMapping {
	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

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
	protected ActionMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.ACTION_MAPPING;
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
	public String getAlias() {
		return (String)eDynamicGet(AppPackage.ACTION_MAPPING__ALIAS, AppPackage.Literals.ACTION_MAPPING__ALIAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlias(String newAlias) {
		eDynamicSet(AppPackage.ACTION_MAPPING__ALIAS, AppPackage.Literals.ACTION_MAPPING__ALIAS, newAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractAction getTarget() {
		return (AbstractAction)eDynamicGet(AppPackage.ACTION_MAPPING__TARGET, AppPackage.Literals.ACTION_MAPPING__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction basicGetTarget() {
		return (AbstractAction)eDynamicGet(AppPackage.ACTION_MAPPING__TARGET, AppPackage.Literals.ACTION_MAPPING__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(AbstractAction newTarget) {
		eDynamicSet(AppPackage.ACTION_MAPPING__TARGET, AppPackage.Literals.ACTION_MAPPING__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(AppPackage.ACTION_MAPPING__DESCRIPTION, AppPackage.Literals.ACTION_MAPPING__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(AppPackage.ACTION_MAPPING__DESCRIPTION, AppPackage.Literals.ACTION_MAPPING__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppPackage.ACTION_MAPPING__ALIAS:
				return getAlias();
			case AppPackage.ACTION_MAPPING__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case AppPackage.ACTION_MAPPING__DESCRIPTION:
				return getDescription();
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
			case AppPackage.ACTION_MAPPING__ALIAS:
				setAlias((String)newValue);
				return;
			case AppPackage.ACTION_MAPPING__TARGET:
				setTarget((AbstractAction)newValue);
				return;
			case AppPackage.ACTION_MAPPING__DESCRIPTION:
				setDescription((String)newValue);
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
			case AppPackage.ACTION_MAPPING__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case AppPackage.ACTION_MAPPING__TARGET:
				setTarget((AbstractAction)null);
				return;
			case AppPackage.ACTION_MAPPING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case AppPackage.ACTION_MAPPING__ALIAS:
				return ALIAS_EDEFAULT == null ? getAlias() != null : !ALIAS_EDEFAULT.equals(getAlias());
			case AppPackage.ACTION_MAPPING__TARGET:
				return basicGetTarget() != null;
			case AppPackage.ACTION_MAPPING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

} //ActionMappingImpl
