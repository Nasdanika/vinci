/**
 */
package org.nasdanika.vinci.app.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Util;
import org.nasdanika.html.bootstrap.Breakpoint;
import org.nasdanika.html.bootstrap.Size;
import org.nasdanika.html.bootstrap.Container.Row.Col;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.BootstrapContainerApplicationPanel;

import org.nasdanika.vinci.bootstrap.ColumnWidth;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bootstrap Container Application Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationPanelImpl#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BootstrapContainerApplicationPanelImpl extends BootstrapContainerApplicationSectionImpl implements BootstrapContainerApplicationPanel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BootstrapContainerApplicationPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ColumnWidth> getWidth() {
		return (EList<ColumnWidth>)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_PANEL__WIDTH, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION_PANEL__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_PANEL__WIDTH:
				return ((InternalEList<?>)getWidth()).basicRemove(otherEnd, msgs);
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_PANEL__WIDTH:
				return getWidth();
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_PANEL__WIDTH:
				getWidth().clear();
				getWidth().addAll((Collection<? extends ColumnWidth>)newValue);
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_PANEL__WIDTH:
				getWidth().clear();
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_PANEL__WIDTH:
				return !getWidth().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	protected void configureCol(Col col) {
		for (ColumnWidth width: getWidth()) {
			String bStr = width.getBreakpoint();
			Breakpoint breakpoint = Util.isBlank(bStr) ? Breakpoint.DEFAULT : Breakpoint.fromLabel(bStr);
			
			String widthStr = width.getWidth();
			Size size = Util.isBlank(widthStr) ? Size.NONE : Size.fromCode(widthStr);
			
			col.width(breakpoint, size);
		}
	}

} //BootstrapContainerApplicationPanelImpl
