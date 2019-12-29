/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ListCompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapElement;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.html.impl.HtmlElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.BootstrapElementImpl#getAppearance <em>Appearance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BootstrapElementImpl extends HtmlElementImpl implements BootstrapElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BootstrapElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.BOOTSTRAP_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appearance getAppearance() {
		return (Appearance)eDynamicGet(BootstrapPackage.BOOTSTRAP_ELEMENT__APPEARANCE, BootstrapPackage.Literals.BOOTSTRAP_ELEMENT__APPEARANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearance(Appearance newAppearance, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAppearance, BootstrapPackage.BOOTSTRAP_ELEMENT__APPEARANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppearance(Appearance newAppearance) {
		eDynamicSet(BootstrapPackage.BOOTSTRAP_ELEMENT__APPEARANCE, BootstrapPackage.Literals.BOOTSTRAP_ELEMENT__APPEARANCE, newAppearance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.BOOTSTRAP_ELEMENT__APPEARANCE:
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
			case BootstrapPackage.BOOTSTRAP_ELEMENT__APPEARANCE:
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
			case BootstrapPackage.BOOTSTRAP_ELEMENT__APPEARANCE:
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
			case BootstrapPackage.BOOTSTRAP_ELEMENT__APPEARANCE:
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
			case BootstrapPackage.BOOTSTRAP_ELEMENT__APPEARANCE:
				return getAppearance() != null;
		}
		return super.eIsSet(featureID);
	}
		
	@Override
	public Supplier<ViewBuilder> asViewBuilderSupplier(Context context) throws Exception {
		Appearance appearance = getAppearance();
		if (appearance == null) {
			return super.asViewBuilderSupplier(context);
		}
		@SuppressWarnings("resource")
		ListCompoundSupplier<ViewBuilder> viewBuilderSupplier = new ListCompoundSupplier<>(getTitle() + " as View Builder", super.asViewBuilderSupplier(context), appearance.create(context));
		return viewBuilderSupplier.then(elements -> elements.stream().reduce(ViewBuilder.NOP, (a,b) -> a.compose(b)));
	}

} //BootstrapElementImpl
