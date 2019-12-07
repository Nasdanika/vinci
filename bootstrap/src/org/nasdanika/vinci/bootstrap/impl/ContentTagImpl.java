/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapElement;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.ContentTag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.ContentTagImpl#getAppearance <em>Appearance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentTagImpl extends org.nasdanika.vinci.html.impl.ContentTagImpl implements ContentTag {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.CONTENT_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appearance getAppearance() {
		return (Appearance)eDynamicGet(BootstrapPackage.CONTENT_TAG__APPEARANCE, BootstrapPackage.Literals.BOOTSTRAP_ELEMENT__APPEARANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearance(Appearance newAppearance, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAppearance, BootstrapPackage.CONTENT_TAG__APPEARANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppearance(Appearance newAppearance) {
		eDynamicSet(BootstrapPackage.CONTENT_TAG__APPEARANCE, BootstrapPackage.Literals.BOOTSTRAP_ELEMENT__APPEARANCE, newAppearance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.CONTENT_TAG__APPEARANCE:
				return basicSetAppearance(null, msgs);
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
			case BootstrapPackage.CONTENT_TAG__APPEARANCE:
				return getAppearance();
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
			case BootstrapPackage.CONTENT_TAG__APPEARANCE:
				setAppearance((Appearance)newValue);
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
			case BootstrapPackage.CONTENT_TAG__APPEARANCE:
				setAppearance((Appearance)null);
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
			case BootstrapPackage.CONTENT_TAG__APPEARANCE:
				return getAppearance() != null;
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
		if (baseClass == BootstrapElement.class) {
			switch (derivedFeatureID) {
				case BootstrapPackage.CONTENT_TAG__APPEARANCE: return BootstrapPackage.BOOTSTRAP_ELEMENT__APPEARANCE;
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
		if (baseClass == BootstrapElement.class) {
			switch (baseFeatureID) {
				case BootstrapPackage.BOOTSTRAP_ELEMENT__APPEARANCE: return BootstrapPackage.CONTENT_TAG__APPEARANCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	@Override
	public Supplier<Object> create(Context context) throws Exception {
		Appearance appearance = getAppearance();
		if (appearance == null) {
			return super.create(context);
		}
		
		Function<Object,Object> wrapper = Function.fromBiFunction(
				(tag,  progressMonitor) -> context.get(BootstrapFactory.class, BootstrapFactory.INSTANCE).wrap((org.nasdanika.html.HTMLElement<?>) tag), 
				"Wrap", 
				1);
		
		return super.create(context).then(wrapper.then(appearance.create(context)).asFunction());
	}

} //ContentTagImpl
