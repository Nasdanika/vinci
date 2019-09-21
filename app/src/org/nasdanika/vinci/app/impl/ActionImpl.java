/**
 */
package org.nasdanika.vinci.app.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.AbstractActionParent;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionElement;
import org.nasdanika.vinci.app.ActionMapping;
import org.nasdanika.vinci.app.ActionSpec;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.MapElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionImpl#getActionMappings <em>Action Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends LabelImpl<ActionSpec> implements Action {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractActionParent getParent() {
		return (AbstractActionParent)eDynamicGet(AppPackage.ACTION__PARENT, AppPackage.Literals.MAP_ELEMENT__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractActionParent basicGetParent() {
		return (AbstractActionParent)eDynamicGet(AppPackage.ACTION__PARENT, AppPackage.Literals.MAP_ELEMENT__PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(AbstractActionParent newParent) {
		eDynamicSet(AppPackage.ACTION__PARENT, AppPackage.Literals.MAP_ELEMENT__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionElement getElements() {
		return (ActionElement)eDynamicGet(AppPackage.ACTION__ELEMENTS, AppPackage.Literals.CONTAINER__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElements(ActionElement newElements, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newElements, AppPackage.ACTION__ELEMENTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElements(ActionElement newElements) {
		eDynamicSet(AppPackage.ACTION__ELEMENTS, AppPackage.Literals.CONTAINER__ELEMENTS, newElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActionMapping> getActionMappings() {
		return (EList<ActionMapping>)eDynamicGet(AppPackage.ACTION__ACTION_MAPPINGS, AppPackage.Literals.ACTION__ACTION_MAPPINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.ACTION__ELEMENTS:
				return basicSetElements(null, msgs);
			case AppPackage.ACTION__ACTION_MAPPINGS:
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
			case AppPackage.ACTION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case AppPackage.ACTION__ELEMENTS:
				return getElements();
			case AppPackage.ACTION__ACTION_MAPPINGS:
				return getActionMappings();
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
			case AppPackage.ACTION__PARENT:
				setParent((AbstractActionParent)newValue);
				return;
			case AppPackage.ACTION__ELEMENTS:
				setElements((ActionElement)newValue);
				return;
			case AppPackage.ACTION__ACTION_MAPPINGS:
				getActionMappings().clear();
				getActionMappings().addAll((Collection<? extends ActionMapping>)newValue);
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
			case AppPackage.ACTION__PARENT:
				setParent((AbstractActionParent)null);
				return;
			case AppPackage.ACTION__ELEMENTS:
				setElements((ActionElement)null);
				return;
			case AppPackage.ACTION__ACTION_MAPPINGS:
				getActionMappings().clear();
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
			case AppPackage.ACTION__PARENT:
				return basicGetParent() != null;
			case AppPackage.ACTION__ELEMENTS:
				return getElements() != null;
			case AppPackage.ACTION__ACTION_MAPPINGS:
				return !getActionMappings().isEmpty();
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
		if (baseClass == ActionElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MapElement.class) {
			switch (derivedFeatureID) {
				case AppPackage.ACTION__PARENT: return AppPackage.MAP_ELEMENT__PARENT;
				default: return -1;
			}
		}
		if (baseClass == AbstractAction.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractActionParent.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == org.nasdanika.vinci.app.Container.class) {
			switch (derivedFeatureID) {
				case AppPackage.ACTION__ELEMENTS: return AppPackage.CONTAINER__ELEMENTS;
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
		if (baseClass == ActionElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MapElement.class) {
			switch (baseFeatureID) {
				case AppPackage.MAP_ELEMENT__PARENT: return AppPackage.ACTION__PARENT;
				default: return -1;
			}
		}
		if (baseClass == AbstractAction.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractActionParent.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == org.nasdanika.vinci.app.Container.class) {
			switch (baseFeatureID) {
				case AppPackage.CONTAINER__ELEMENTS: return AppPackage.ACTION__ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActionImpl
