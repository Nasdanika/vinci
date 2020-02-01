/**
 */
package org.nasdanika.vinci.app.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Context;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.ncore.Configurable;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionElement;
import org.nasdanika.vinci.app.ActionLink;
import org.nasdanika.vinci.app.ActionMapping;
import org.nasdanika.vinci.app.AppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionLinkImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionLinkImpl#getActionMappings <em>Action Mappings</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionLinkImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionLinkImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionLinkImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionLinkImpl extends MinimalEObjectImpl.Container implements ActionLink {
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
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.ACTION_LINK;
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
	public EList<SupplierFactory<Object>> getConfiguration() {
		return (EList<SupplierFactory<Object>>)eDynamicGet(AppPackage.ACTION_LINK__CONFIGURATION, NcorePackage.Literals.CONFIGURABLE__CONFIGURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActionMapping> getActionMappings() {
		return (EList<ActionMapping>)eDynamicGet(AppPackage.ACTION_LINK__ACTION_MAPPINGS, AppPackage.Literals.ABSTRACT_ACTION__ACTION_MAPPINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(AppPackage.ACTION_LINK__TITLE, AppPackage.Literals.ACTION_LINK__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(AppPackage.ACTION_LINK__TITLE, AppPackage.Literals.ACTION_LINK__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(AppPackage.ACTION_LINK__DESCRIPTION, AppPackage.Literals.ACTION_LINK__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(AppPackage.ACTION_LINK__DESCRIPTION, AppPackage.Literals.ACTION_LINK__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRef() {
		return (String)eDynamicGet(AppPackage.ACTION_LINK__REF, AppPackage.Literals.ACTION_LINK__REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(String newRef) {
		eDynamicSet(AppPackage.ACTION_LINK__REF, AppPackage.Literals.ACTION_LINK__REF, newRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Supplier<Object> createApplicationBuilderSupplier(Context context) throws Exception {
		return ActionLink.super.createApplicationBuilderSupplier(context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.ACTION_LINK__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
			case AppPackage.ACTION_LINK__ACTION_MAPPINGS:
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
			case AppPackage.ACTION_LINK__CONFIGURATION:
				return getConfiguration();
			case AppPackage.ACTION_LINK__ACTION_MAPPINGS:
				return getActionMappings();
			case AppPackage.ACTION_LINK__TITLE:
				return getTitle();
			case AppPackage.ACTION_LINK__DESCRIPTION:
				return getDescription();
			case AppPackage.ACTION_LINK__REF:
				return getRef();
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
			case AppPackage.ACTION_LINK__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends SupplierFactory<Object>>)newValue);
				return;
			case AppPackage.ACTION_LINK__ACTION_MAPPINGS:
				getActionMappings().clear();
				getActionMappings().addAll((Collection<? extends ActionMapping>)newValue);
				return;
			case AppPackage.ACTION_LINK__TITLE:
				setTitle((String)newValue);
				return;
			case AppPackage.ACTION_LINK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AppPackage.ACTION_LINK__REF:
				setRef((String)newValue);
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
			case AppPackage.ACTION_LINK__CONFIGURATION:
				getConfiguration().clear();
				return;
			case AppPackage.ACTION_LINK__ACTION_MAPPINGS:
				getActionMappings().clear();
				return;
			case AppPackage.ACTION_LINK__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AppPackage.ACTION_LINK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AppPackage.ACTION_LINK__REF:
				setRef(REF_EDEFAULT);
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
			case AppPackage.ACTION_LINK__CONFIGURATION:
				return !getConfiguration().isEmpty();
			case AppPackage.ACTION_LINK__ACTION_MAPPINGS:
				return !getActionMappings().isEmpty();
			case AppPackage.ACTION_LINK__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case AppPackage.ACTION_LINK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case AppPackage.ACTION_LINK__REF:
				return REF_EDEFAULT == null ? getRef() != null : !REF_EDEFAULT.equals(getRef());
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
				case AppPackage.ACTION_LINK__CONFIGURATION: return NcorePackage.CONFIGURABLE__CONFIGURATION;
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
				case NcorePackage.CONFIGURABLE__CONFIGURATION: return AppPackage.ACTION_LINK__CONFIGURATION;
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
			case AppPackage.ACTION_LINK___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT:
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
	public Supplier<Object> create(Context ctx) throws Exception {
		
		SupplierFactory<Object> sf = context -> {
			
			URI refUri = URI.createURI(context.interpolate(getRef()));
			Resource resource = eResource();
			if (resource != null) {
				URI resUri = resource.getURI();
				refUri = refUri.resolve(resUri);
			}
					
			java.util.function.Function<Class<ResourceSet>,ResourceSet> factory = type -> {
				if (ResourceSet.class.isAssignableFrom(type)) {
					return new ResourceSetImpl();
				}
				throw new UnsupportedOperationException("Unsupported type: "+type+", expected "+ResourceSet.class);
			};
			
			ResourceSet resourceSet = context.get(ResourceSet.class, factory);
			Resource refResource = resourceSet.getResource(refUri, true);
			String fragment = refUri.fragment();				
			ActionBase action = (ActionBase) (fragment == null ? refResource.getContents().get(0) : refResource.getEObject(fragment));
			
			// Not performing diagnostic in a regular way as it might be dependent on context variables not available at design time.
			
			Diagnostician diagnostician = new Diagnostician() {
				
				public Map<Object,Object> createDefaultContext() {
					Map<Object, Object> ctx = super.createDefaultContext();
					ctx.put(Context.class, context);
					return ctx;
				};
				
			};				
			Diagnostic validationResult = diagnostician.validate(action);
			if (validationResult.getSeverity() == Diagnostic.ERROR) {
				throw new DiagnosticException(validationResult);
			}
			
			return action.create(context);
		};
		
		MutableContext actionContext = ctx.fork();
		new ActionMappingsPropertyComputer("action-mappings", getActionMappings()).put(actionContext);
		
		return configure(sf).create(actionContext);		
	}
	
} //ActionLinkImpl
