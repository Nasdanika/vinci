/**
 */
package org.nasdanika.vinci.app.impl;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.CompoundWork;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reference;
import org.nasdanika.common.Work;
import org.nasdanika.common.WorkFactory;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.BootstrapContainerApplicationSection;
import org.nasdanika.vinci.bootstrap.impl.BootstrapElementImpl;
import org.nasdanika.vinci.html.HtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bootstrap Container Application Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationSectionImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BootstrapContainerApplicationSectionImpl extends BootstrapElementImpl implements BootstrapContainerApplicationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BootstrapContainerApplicationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<WorkFactory<Object>> getContent() {
		return (EList<WorkFactory<Object>>)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__CONTENT, HtmlPackage.Literals.CONTAINER__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__CONTENT:
				return getContent();
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends WorkFactory<Object>>)newValue);
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__CONTENT:
				getContent().clear();
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__CONTENT:
				return !getContent().isEmpty();
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
		if (baseClass == org.nasdanika.vinci.html.Container.class) {
			switch (derivedFeatureID) {
				case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__CONTENT: return HtmlPackage.CONTAINER__CONTENT;
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
		if (baseClass == org.nasdanika.vinci.html.Container.class) {
			switch (baseFeatureID) {
				case HtmlPackage.CONTAINER__CONTENT: return AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
		
	protected Work<List<Object>> createContentWork(Context context) throws Exception {
		CompoundWork<List<Object>, Object> ret = new CompoundWork<List<Object>, Object>("Content", context.get(Executor.class)) {

			@Override
			protected List<Object> combine(List<Object> results, ProgressMonitor progressMonitor) throws Exception {
				return results;
			}
			
		}; 
		
		for (WorkFactory<Object> ce: getContent()) {
			ret.add(ce.create(context));
		}
		
		return ret;
	}	
	
	@Override
	public Consumer<Object> asBuilder() {
		// TODO.
		Consumer<Object> superBuilder = super.asBuilder();		
		return new Consumer<Object>() {

			@Override
			public WorkFactory<Void> create(WorkFactory<Object> arg) throws Exception {

				return new WorkFactory<Void>() {
					
					@Override
					public Work<Void> create(Context context) throws Exception {
						
						// Sequential - arg, content
						CompoundWork<Void, Void> ret = new CompoundWork<Void, Void>(BootstrapContainerApplicationSectionImpl.this.eContainmentFeature().getName(), null) {
							
							@Override
							protected Void combine(List<Void> results, ProgressMonitor progressMonitor) throws Exception {
								return null;
							}
							
						};

						Reference<Object> containerReference = new Reference<>();
						
						Work<Void> argWork = arg.create(context).adapt(c -> {
							containerReference.set(c);
							return null;
						});
						ret.add(argWork);
						
						Work<Void> contentWork = createContentWork(context).adapt(content -> {
							content.forEach((org.nasdanika.html.bootstrap.Container.Row.Col) containerReference.get()); 
							return null;
						});
						ret.add(contentWork);
						
						return ret;
					}
				};
				
			}
			
		};
	}

} //BootstrapContainerApplicationSectionImpl
