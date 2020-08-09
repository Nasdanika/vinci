/**
 */
package org.nasdanika.vinci.app.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.ncore.Configurable;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NcorePackage;

import org.nasdanika.vinci.app.ActionAdapter;
import org.nasdanika.vinci.app.ActionMapping;
import org.nasdanika.vinci.app.AppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionAdapterImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionAdapterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionAdapterImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionAdapterImpl#getActionMappings <em>Action Mappings</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionAdapterImpl#getFactory <em>Factory</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionAdapterImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionAdapterImpl extends MinimalEObjectImpl.Container implements ActionAdapter {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

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
	 * The default value of the '{@link #getFactory() <em>Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.ACTION_ADAPTER;
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
	public String getTitle() {
		return (String)eDynamicGet(AppPackage.ACTION_ADAPTER__TITLE, NcorePackage.Literals.MODEL_ELEMENT__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(AppPackage.ACTION_ADAPTER__TITLE, NcorePackage.Literals.MODEL_ELEMENT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(AppPackage.ACTION_ADAPTER__DESCRIPTION, NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(AppPackage.ACTION_ADAPTER__DESCRIPTION, NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getConfiguration() {
		return (EList<EObject>)eDynamicGet(AppPackage.ACTION_ADAPTER__CONFIGURATION, NcorePackage.Literals.CONFIGURABLE__CONFIGURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActionMapping> getActionMappings() {
		return (EList<ActionMapping>)eDynamicGet(AppPackage.ACTION_ADAPTER__ACTION_MAPPINGS, AppPackage.Literals.ABSTRACT_ACTION__ACTION_MAPPINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFactory() {
		return (String)eDynamicGet(AppPackage.ACTION_ADAPTER__FACTORY, AppPackage.Literals.ACTION_ADAPTER__FACTORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFactory(String newFactory) {
		eDynamicSet(AppPackage.ACTION_ADAPTER__FACTORY, AppPackage.Literals.ACTION_ADAPTER__FACTORY, newFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return (String)eDynamicGet(AppPackage.ACTION_ADAPTER__PATH, AppPackage.Literals.ACTION_ADAPTER__PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		eDynamicSet(AppPackage.ACTION_ADAPTER__PATH, AppPackage.Literals.ACTION_ADAPTER__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.ACTION_ADAPTER__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
			case AppPackage.ACTION_ADAPTER__ACTION_MAPPINGS:
				return ((InternalEList<?>)getActionMappings()).basicRemove(otherEnd, msgs);
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
			case AppPackage.ACTION_ADAPTER__TITLE:
				return getTitle();
			case AppPackage.ACTION_ADAPTER__DESCRIPTION:
				return getDescription();
			case AppPackage.ACTION_ADAPTER__CONFIGURATION:
				return getConfiguration();
			case AppPackage.ACTION_ADAPTER__ACTION_MAPPINGS:
				return getActionMappings();
			case AppPackage.ACTION_ADAPTER__FACTORY:
				return getFactory();
			case AppPackage.ACTION_ADAPTER__PATH:
				return getPath();
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
			case AppPackage.ACTION_ADAPTER__TITLE:
				setTitle((String)newValue);
				return;
			case AppPackage.ACTION_ADAPTER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AppPackage.ACTION_ADAPTER__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends EObject>)newValue);
				return;
			case AppPackage.ACTION_ADAPTER__ACTION_MAPPINGS:
				getActionMappings().clear();
				getActionMappings().addAll((Collection<? extends ActionMapping>)newValue);
				return;
			case AppPackage.ACTION_ADAPTER__FACTORY:
				setFactory((String)newValue);
				return;
			case AppPackage.ACTION_ADAPTER__PATH:
				setPath((String)newValue);
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
			case AppPackage.ACTION_ADAPTER__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AppPackage.ACTION_ADAPTER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AppPackage.ACTION_ADAPTER__CONFIGURATION:
				getConfiguration().clear();
				return;
			case AppPackage.ACTION_ADAPTER__ACTION_MAPPINGS:
				getActionMappings().clear();
				return;
			case AppPackage.ACTION_ADAPTER__FACTORY:
				setFactory(FACTORY_EDEFAULT);
				return;
			case AppPackage.ACTION_ADAPTER__PATH:
				setPath(PATH_EDEFAULT);
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
			case AppPackage.ACTION_ADAPTER__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case AppPackage.ACTION_ADAPTER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case AppPackage.ACTION_ADAPTER__CONFIGURATION:
				return !getConfiguration().isEmpty();
			case AppPackage.ACTION_ADAPTER__ACTION_MAPPINGS:
				return !getActionMappings().isEmpty();
			case AppPackage.ACTION_ADAPTER__FACTORY:
				return FACTORY_EDEFAULT == null ? getFactory() != null : !FACTORY_EDEFAULT.equals(getFactory());
			case AppPackage.ACTION_ADAPTER__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
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
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case AppPackage.ACTION_ADAPTER__TITLE: return NcorePackage.MODEL_ELEMENT__TITLE;
				case AppPackage.ACTION_ADAPTER__DESCRIPTION: return NcorePackage.MODEL_ELEMENT__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Configurable.class) {
			switch (derivedFeatureID) {
				case AppPackage.ACTION_ADAPTER__CONFIGURATION: return NcorePackage.CONFIGURABLE__CONFIGURATION;
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
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case NcorePackage.MODEL_ELEMENT__TITLE: return AppPackage.ACTION_ADAPTER__TITLE;
				case NcorePackage.MODEL_ELEMENT__DESCRIPTION: return AppPackage.ACTION_ADAPTER__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Configurable.class) {
			switch (baseFeatureID) {
				case NcorePackage.CONFIGURABLE__CONFIGURATION: return AppPackage.ACTION_ADAPTER__CONFIGURATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActionAdapterImpl
