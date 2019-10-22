/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.common.CommandFactory;

import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.Card;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.CardImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.CardImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.CardImpl#getFooter <em>Footer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardImpl extends MinimalEObjectImpl.Container implements Card {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.CARD;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<CommandFactory<Object>> getHeader() {
		return (EList<CommandFactory<Object>>)eDynamicGet(BootstrapPackage.CARD__HEADER, BootstrapPackage.Literals.CARD__HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CommandFactory<Object>> getBody() {
		return (EList<CommandFactory<Object>>)eDynamicGet(BootstrapPackage.CARD__BODY, BootstrapPackage.Literals.CARD__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CommandFactory<Object>> getFooter() {
		return (EList<CommandFactory<Object>>)eDynamicGet(BootstrapPackage.CARD__FOOTER, BootstrapPackage.Literals.CARD__FOOTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.CARD__HEADER:
				return ((InternalEList<?>)getHeader()).basicRemove(otherEnd, msgs);
			case BootstrapPackage.CARD__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
			case BootstrapPackage.CARD__FOOTER:
				return ((InternalEList<?>)getFooter()).basicRemove(otherEnd, msgs);
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
			case BootstrapPackage.CARD__HEADER:
				return getHeader();
			case BootstrapPackage.CARD__BODY:
				return getBody();
			case BootstrapPackage.CARD__FOOTER:
				return getFooter();
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
			case BootstrapPackage.CARD__HEADER:
				getHeader().clear();
				getHeader().addAll((Collection<? extends CommandFactory<Object>>)newValue);
				return;
			case BootstrapPackage.CARD__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends CommandFactory<Object>>)newValue);
				return;
			case BootstrapPackage.CARD__FOOTER:
				getFooter().clear();
				getFooter().addAll((Collection<? extends CommandFactory<Object>>)newValue);
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
			case BootstrapPackage.CARD__HEADER:
				getHeader().clear();
				return;
			case BootstrapPackage.CARD__BODY:
				getBody().clear();
				return;
			case BootstrapPackage.CARD__FOOTER:
				getFooter().clear();
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
			case BootstrapPackage.CARD__HEADER:
				return !getHeader().isEmpty();
			case BootstrapPackage.CARD__BODY:
				return !getBody().isEmpty();
			case BootstrapPackage.CARD__FOOTER:
				return !getFooter().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CardImpl
