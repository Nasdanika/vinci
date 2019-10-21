/**
 */
package org.nasdanika.vinci.app.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.Command;
import org.nasdanika.common.Context;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.ActionCategory;
import org.nasdanika.vinci.app.AppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ActionCategoryImpl extends CategoryImpl<AbstractAction> implements ActionCategory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.ACTION_CATEGORY;
	}

	@Override
	public Command<Object> create(Context context) throws Exception {
		throw new UnsupportedOperationException();
	}

} //ActionCategoryImpl
