/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.common.CompoundConsumer;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appearance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.AppearanceImpl#getBackground <em>Background</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppearanceImpl extends MinimalEObjectImpl.Container implements Appearance {
	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppearanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.APPEARANCE;
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
	@Override
	public String getBackground() {
		return (String)eDynamicGet(BootstrapPackage.APPEARANCE__BACKGROUND, BootstrapPackage.Literals.APPEARANCE__BACKGROUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackground(String newBackground) {
		eDynamicSet(BootstrapPackage.APPEARANCE__BACKGROUND, BootstrapPackage.Literals.APPEARANCE__BACKGROUND, newBackground);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.APPEARANCE__BACKGROUND:
				return getBackground();
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
			case BootstrapPackage.APPEARANCE__BACKGROUND:
				setBackground((String)newValue);
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
			case BootstrapPackage.APPEARANCE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
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
			case BootstrapPackage.APPEARANCE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? getBackground() != null : !BACKGROUND_EDEFAULT.equals(getBackground());
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Consumer<Object> create(Context context) throws Exception {
		Consumer<Object> backGroundConsumer = new Consumer<Object>() {

			@Override
			public double size() {
				return 1;
			}

			@Override
			public String name() {
				return "Background";
			}

			@Override
			public void execute(Object arg, ProgressMonitor progressMonitor) throws Exception {
				String bgStr = getBackground();
				if (!Util.isBlank(bgStr)) {
					((org.nasdanika.html.bootstrap.BootstrapElement<?,?>) arg).background(org.nasdanika.html.bootstrap.Color.valueOf(bgStr));
				}				
			}
			
		};
		
		CompoundConsumer<Object> ret = new CompoundConsumer<Object>("Appearance", backGroundConsumer);
		
		return ret;
	}

} //AppearanceImpl
