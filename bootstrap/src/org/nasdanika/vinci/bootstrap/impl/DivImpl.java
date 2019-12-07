/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.html.TagName;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.Div;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Div</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DivImpl extends TagImpl implements Div {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.DIV;
	}
	
	@Override
	public String getName() {
		return TagName.div.name();
	}

} //DivImpl
