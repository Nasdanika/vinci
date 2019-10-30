/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import java.util.List;
import java.util.concurrent.Executor;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.CompoundWork;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.common.Work;
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
		CompoundWork<Object, List<Object>> ret = new CompoundWork<Object, List<Object>>(getTitle(), context.get(Executor.class)) {

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
						nameFragment);
				
				return actionGroup; // Not used
			}
			
		}; 
		
		ret.add(createNameWork(context));
		
		return ret;
	}

} //LinkActionGroupItemImpl
