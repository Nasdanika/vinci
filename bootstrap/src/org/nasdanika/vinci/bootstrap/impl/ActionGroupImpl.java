/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.bootstrap.ActionGroup;
import org.nasdanika.vinci.bootstrap.ActionGroupItem;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.ActionGroupImpl#isFlush <em>Flush</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.ActionGroupImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionGroupImpl extends DivImpl implements ActionGroup {
	/**
	 * The default value of the '{@link #isFlush() <em>Flush</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlush()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLUSH_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.ACTION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFlush() {
		return (Boolean)eDynamicGet(BootstrapPackage.ACTION_GROUP__FLUSH, BootstrapPackage.Literals.ACTION_GROUP__FLUSH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlush(boolean newFlush) {
		eDynamicSet(BootstrapPackage.ACTION_GROUP__FLUSH, BootstrapPackage.Literals.ACTION_GROUP__FLUSH, newFlush);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActionGroupItem> getItems() {
		return (EList<ActionGroupItem>)eDynamicGet(BootstrapPackage.ACTION_GROUP__ITEMS, BootstrapPackage.Literals.ACTION_GROUP__ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.ACTION_GROUP__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case BootstrapPackage.ACTION_GROUP__FLUSH:
				return isFlush();
			case BootstrapPackage.ACTION_GROUP__ITEMS:
				return getItems();
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
			case BootstrapPackage.ACTION_GROUP__FLUSH:
				setFlush((Boolean)newValue);
				return;
			case BootstrapPackage.ACTION_GROUP__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends ActionGroupItem>)newValue);
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
			case BootstrapPackage.ACTION_GROUP__FLUSH:
				setFlush(FLUSH_EDEFAULT);
				return;
			case BootstrapPackage.ACTION_GROUP__ITEMS:
				getItems().clear();
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
			case BootstrapPackage.ACTION_GROUP__FLUSH:
				return isFlush() != FLUSH_EDEFAULT;
			case BootstrapPackage.ACTION_GROUP__ITEMS:
				return !getItems().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	@Override
	public Supplier<ViewPart> create(Context arg) throws Exception {
		throw new UnsupportedOperationException("TODO - implement refactoring");
//		Supplier<org.nasdanika.html.bootstrap.ActionGroup> actionGroupSupplier = Supplier.fromSupplier(() -> context.get(BootstrapFactory.class, BootstrapFactory.INSTANCE).actionGroup(isFlush()), "Action group", 1);		
//
//		@SuppressWarnings("resource")
//		CompoundConsumer<Object> itemsConsumer = new CompoundConsumer<>("Items");
//		boolean hasContentItems = false;
//		for (ActionGroupItem item: getItems()) {
//			itemsConsumer.add(item.create(context));
//			hasContentItems = hasContentItems || item instanceof ContentActionGroupItem;
//		}
//		
//		Supplier<Object> ret = actionGroupSupplier.then(itemsConsumer.asFunction());
//		if (hasContentItems) {
//			ret = ret.then(ag -> ((org.nasdanika.html.bootstrap.ActionGroup) ag).asContainer(true)); // TODO - configurable?
//		}
//		return ret;
	}

} //ActionGroupImpl
