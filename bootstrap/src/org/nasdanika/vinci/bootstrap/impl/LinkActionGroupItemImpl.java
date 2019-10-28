/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.Context;
import org.nasdanika.common.Work;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.LinkActionGroupItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Action Group Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.LinkActionGroupItemImpl#getHref <em>Href</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkActionGroupItemImpl extends ActionGroupItemImpl implements LinkActionGroupItem {
	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkActionGroupItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.LINK_ACTION_GROUP_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return (String)eDynamicGet(BootstrapPackage.LINK_ACTION_GROUP_ITEM__HREF, BootstrapPackage.Literals.LINK_ACTION_GROUP_ITEM__HREF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		eDynamicSet(BootstrapPackage.LINK_ACTION_GROUP_ITEM__HREF, BootstrapPackage.Literals.LINK_ACTION_GROUP_ITEM__HREF, newHref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.LINK_ACTION_GROUP_ITEM__HREF:
				return getHref();
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
			case BootstrapPackage.LINK_ACTION_GROUP_ITEM__HREF:
				setHref((String)newValue);
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
			case BootstrapPackage.LINK_ACTION_GROUP_ITEM__HREF:
				setHref(HREF_EDEFAULT);
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
			case BootstrapPackage.LINK_ACTION_GROUP_ITEM__HREF:
				return HREF_EDEFAULT == null ? getHref() != null : !HREF_EDEFAULT.equals(getHref());
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Work<Object> create(Context context) throws Exception {
		throw new UnsupportedOperationException();
	}

} //LinkActionGroupItemImpl
