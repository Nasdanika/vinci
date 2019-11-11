/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import java.util.List;
import java.util.concurrent.Executor;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.common._legacy.CompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.bootstrap.ActionGroup;
import org.nasdanika.html.bootstrap.Color;
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
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.LinkActionGroupItemImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkActionGroupItemImpl extends ActionGroupItemImpl implements LinkActionGroupItem {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;
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
	public String getUrl() {
		return (String)eDynamicGet(BootstrapPackage.LINK_ACTION_GROUP_ITEM__URL, BootstrapPackage.Literals.LINK_ACTION_GROUP_ITEM__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(BootstrapPackage.LINK_ACTION_GROUP_ITEM__URL, BootstrapPackage.Literals.LINK_ACTION_GROUP_ITEM__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.LINK_ACTION_GROUP_ITEM__URL:
				return getUrl();
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
			case BootstrapPackage.LINK_ACTION_GROUP_ITEM__URL:
				setUrl((String)newValue);
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
			case BootstrapPackage.LINK_ACTION_GROUP_ITEM__URL:
				setUrl(URL_EDEFAULT);
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
			case BootstrapPackage.LINK_ACTION_GROUP_ITEM__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Supplier<Object> create(Context context) throws Exception {
		CompoundSupplier<Object, List<Object>> ret = new CompoundSupplier<Object, List<Object>>(getTitle(), context.get(Executor.class)) {

			@Override
			protected Object combine(List<List<Object>> results, ProgressMonitor progressMonitor) throws Exception {
				HTMLFactory htmlFactory = context.get(HTMLFactory.class, HTMLFactory.INSTANCE);
				ActionGroup actionGroup = context.get(ActionGroup.class);				

				Fragment nameFragment = htmlFactory.fragment();
				results.get(0).forEach(nameFragment);
				
				actionGroup.action(
						isActive(), 
						isDisabled(), 
						Util.isBlank(getColor()) ? null : Color.valueOf(getColor()),
						getUrl(),		
						nameFragment);
				
				return actionGroup; // Not used
			}
			
		}; 
		
		ret.add(createNameWork(context));
		
		return ret;
	}

} //LinkActionGroupItemImpl
