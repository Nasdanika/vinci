/**
 */
package org.nasdanika.vinci.app.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.bootstrap.Container.Row.Col;
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
 *   <li>{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationSectionImpl#getMarkdownContent <em>Markdown Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BootstrapContainerApplicationSectionImpl extends BootstrapElementImpl implements BootstrapContainerApplicationSection {
	/**
	 * The default value of the '{@link #getMarkdownContent() <em>Markdown Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkdownContent()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKDOWN_CONTENT_EDEFAULT = null;

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
	public EList<EObject> getContent() {
		return (EList<EObject>)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__CONTENT, HtmlPackage.Literals.CONTAINER__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarkdownContent() {
		return (String)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__MARKDOWN_CONTENT, HtmlPackage.Literals.CONTAINER__MARKDOWN_CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkdownContent(String newMarkdownContent) {
		eDynamicSet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__MARKDOWN_CONTENT, HtmlPackage.Literals.CONTAINER__MARKDOWN_CONTENT, newMarkdownContent);
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__MARKDOWN_CONTENT:
				return getMarkdownContent();
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
				getContent().addAll((Collection<? extends EObject>)newValue);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__MARKDOWN_CONTENT:
				setMarkdownContent((String)newValue);
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__MARKDOWN_CONTENT:
				setMarkdownContent(MARKDOWN_CONTENT_EDEFAULT);
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__MARKDOWN_CONTENT:
				return MARKDOWN_CONTENT_EDEFAULT == null ? getMarkdownContent() != null : !MARKDOWN_CONTENT_EDEFAULT.equals(getMarkdownContent());
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
				case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__MARKDOWN_CONTENT: return HtmlPackage.CONTAINER__MARKDOWN_CONTENT;
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
				case HtmlPackage.CONTAINER__MARKDOWN_CONTENT: return AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__MARKDOWN_CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	@Override
	public Supplier<ViewBuilder> asViewBuilderSupplier(Context context) throws Exception {
		// Content, appearance, combine
		return createContentSupplierFactory().create(context).then(super.asViewBuilderSupplier(context).asFunction()).then(bs -> new ViewBuilder() {
			
			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				org.nasdanika.html.bootstrap.Container.Row.Col col = (org.nasdanika.html.bootstrap.Container.Row.Col) target;
				configureCol(col);
				for (ViewPart cvp: bs.getFirst()) {
					col.content(viewGenerator.processViewPart(cvp, progressMonitor));
				}
				ViewBuilder svb = bs.getSecond();
				if (svb != null) {
					svb.build(col, viewGenerator, progressMonitor);
				}
			}
			
		});		
	}

	/**
	 * To be overridden by {@link BootstrapContainerApplicationPanelImpl} to configure widths.
	 * @param col
	 */
	protected void configureCol(Col col) {
		
	}

} //BootstrapContainerApplicationSectionImpl
