/**
 */
package org.nasdanika.vinci.app.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.ncore.Configurable;
import org.nasdanika.ncore.Entry;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.ActionElement;
import org.nasdanika.vinci.app.ActionMapping;
import org.nasdanika.vinci.app.ActionReference;
import org.nasdanika.vinci.app.AppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionReferenceImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionReferenceImpl#getActionMappings <em>Action Mappings</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionReferenceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionReferenceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionReferenceImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionReferenceImpl extends MinimalEObjectImpl.Container implements ActionReference {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.ACTION_REFERENCE;
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
	public EList<Entry<Object>> getConfiguration() {
		return (EList<Entry<Object>>)eDynamicGet(AppPackage.ACTION_REFERENCE__CONFIGURATION, NcorePackage.Literals.CONFIGURABLE__CONFIGURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActionMapping> getActionMappings() {
		return (EList<ActionMapping>)eDynamicGet(AppPackage.ACTION_REFERENCE__ACTION_MAPPINGS, AppPackage.Literals.ABSTRACT_ACTION__ACTION_MAPPINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(AppPackage.ACTION_REFERENCE__TITLE, AppPackage.Literals.ACTION_REFERENCE__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(AppPackage.ACTION_REFERENCE__TITLE, AppPackage.Literals.ACTION_REFERENCE__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(AppPackage.ACTION_REFERENCE__DESCRIPTION, AppPackage.Literals.ACTION_REFERENCE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(AppPackage.ACTION_REFERENCE__DESCRIPTION, AppPackage.Literals.ACTION_REFERENCE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractAction getAction() {
		return (AbstractAction)eDynamicGet(AppPackage.ACTION_REFERENCE__ACTION, AppPackage.Literals.ACTION_REFERENCE__ACTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction basicGetAction() {
		return (AbstractAction)eDynamicGet(AppPackage.ACTION_REFERENCE__ACTION, AppPackage.Literals.ACTION_REFERENCE__ACTION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(AbstractAction newAction) {
		eDynamicSet(AppPackage.ACTION_REFERENCE__ACTION, AppPackage.Literals.ACTION_REFERENCE__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Supplier<Object> createApplicationBuilderSupplier(Context context) throws Exception {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.ACTION_REFERENCE__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
			case AppPackage.ACTION_REFERENCE__ACTION_MAPPINGS:
				return ((InternalEList<?>)getActionMappings()).basicRemove(otherEnd, msgs);
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
			case AppPackage.ACTION_REFERENCE__CONFIGURATION:
				return getConfiguration();
			case AppPackage.ACTION_REFERENCE__ACTION_MAPPINGS:
				return getActionMappings();
			case AppPackage.ACTION_REFERENCE__TITLE:
				return getTitle();
			case AppPackage.ACTION_REFERENCE__DESCRIPTION:
				return getDescription();
			case AppPackage.ACTION_REFERENCE__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
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
			case AppPackage.ACTION_REFERENCE__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends Entry<Object>>)newValue);
				return;
			case AppPackage.ACTION_REFERENCE__ACTION_MAPPINGS:
				getActionMappings().clear();
				getActionMappings().addAll((Collection<? extends ActionMapping>)newValue);
				return;
			case AppPackage.ACTION_REFERENCE__TITLE:
				setTitle((String)newValue);
				return;
			case AppPackage.ACTION_REFERENCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AppPackage.ACTION_REFERENCE__ACTION:
				setAction((AbstractAction)newValue);
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
			case AppPackage.ACTION_REFERENCE__CONFIGURATION:
				getConfiguration().clear();
				return;
			case AppPackage.ACTION_REFERENCE__ACTION_MAPPINGS:
				getActionMappings().clear();
				return;
			case AppPackage.ACTION_REFERENCE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AppPackage.ACTION_REFERENCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AppPackage.ACTION_REFERENCE__ACTION:
				setAction((AbstractAction)null);
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
			case AppPackage.ACTION_REFERENCE__CONFIGURATION:
				return !getConfiguration().isEmpty();
			case AppPackage.ACTION_REFERENCE__ACTION_MAPPINGS:
				return !getActionMappings().isEmpty();
			case AppPackage.ACTION_REFERENCE__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case AppPackage.ACTION_REFERENCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case AppPackage.ACTION_REFERENCE__ACTION:
				return basicGetAction() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ActionElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Configurable.class) {
			switch (derivedFeatureID) {
				case AppPackage.ACTION_REFERENCE__CONFIGURATION: return NcorePackage.CONFIGURABLE__CONFIGURATION;
				default: return -1;
			}
		}
		if (baseClass == SupplierFactory.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ActionElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Configurable.class) {
			switch (baseFeatureID) {
				case NcorePackage.CONFIGURABLE__CONFIGURATION: return AppPackage.ACTION_REFERENCE__CONFIGURATION;
				default: return -1;
			}
		}
		if (baseClass == SupplierFactory.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AppPackage.ACTION_REFERENCE___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT:
				try {
					return createApplicationBuilderSupplier((Context)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public Supplier<Object> create(Context context) throws Exception {
		MutableContext actionContext = context.fork();
		new ActionMappingsPropertyComputer("action-mappings", getActionMappings()).put(actionContext);
		return getAction().create(actionContext);
	}
		
} //ActionReferenceImpl
