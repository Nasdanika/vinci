/**
 */
package org.nasdanika.vinci.components.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.components.ComponentsPackage;
import org.nasdanika.vinci.components.ListOfContents;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Contents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.impl.ListOfContentsImpl#getOrdering <em>Ordering</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfContentsImpl extends TableOfContentsBaseImpl implements ListOfContents {
	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDERING_EDEFAULT = "";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfContentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.LIST_OF_CONTENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrdering() {
		return (String)eDynamicGet(ComponentsPackage.LIST_OF_CONTENTS__ORDERING, ComponentsPackage.Literals.LIST_OF_CONTENTS__ORDERING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrdering(String newOrdering) {
		eDynamicSet(ComponentsPackage.LIST_OF_CONTENTS__ORDERING, ComponentsPackage.Literals.LIST_OF_CONTENTS__ORDERING, newOrdering);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.LIST_OF_CONTENTS__ORDERING:
				return getOrdering();
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
			case ComponentsPackage.LIST_OF_CONTENTS__ORDERING:
				setOrdering((String)newValue);
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
			case ComponentsPackage.LIST_OF_CONTENTS__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
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
			case ComponentsPackage.LIST_OF_CONTENTS__ORDERING:
				return ORDERING_EDEFAULT == null ? getOrdering() != null : !ORDERING_EDEFAULT.equals(getOrdering());
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Supplier<ViewPart> create(Context arg) throws Exception {
		return Supplier.from(ViewPart.fromValue("List of Contents will be here"), getTitle());
	}

} //ListOfContentsImpl
