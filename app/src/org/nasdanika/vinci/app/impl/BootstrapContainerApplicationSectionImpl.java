/**
 */
package org.nasdanika.vinci.app.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.BiSupplier;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;
import org.nasdanika.common.SupplierFactory;
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
 *   <li>{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationSectionImpl#getHtmlContent <em>Html Content</em>}</li>
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
	 * The default value of the '{@link #getHtmlContent() <em>Html Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtmlContent()
	 * @generated
	 * @ordered
	 */
	protected static final String HTML_CONTENT_EDEFAULT = null;

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
	public EList<SupplierFactory<Object>> getContent() {
		return (EList<SupplierFactory<Object>>)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__CONTENT, HtmlPackage.Literals.CONTAINER__CONTENT, true, true);
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
	public String getHtmlContent() {
		return (String)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__HTML_CONTENT, HtmlPackage.Literals.CONTAINER__HTML_CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHtmlContent(String newHtmlContent) {
		eDynamicSet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__HTML_CONTENT, HtmlPackage.Literals.CONTAINER__HTML_CONTENT, newHtmlContent);
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__HTML_CONTENT:
				return getHtmlContent();
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
				getContent().addAll((Collection<? extends SupplierFactory<Object>>)newValue);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__MARKDOWN_CONTENT:
				setMarkdownContent((String)newValue);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__HTML_CONTENT:
				setHtmlContent((String)newValue);
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__HTML_CONTENT:
				setHtmlContent(HTML_CONTENT_EDEFAULT);
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__HTML_CONTENT:
				return HTML_CONTENT_EDEFAULT == null ? getHtmlContent() != null : !HTML_CONTENT_EDEFAULT.equals(getHtmlContent());
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
				case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__HTML_CONTENT: return HtmlPackage.CONTAINER__HTML_CONTENT;
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
				case HtmlPackage.CONTAINER__HTML_CONTENT: return AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION__HTML_CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	@Override
	public Consumer<Object> asConsumer(Context context) throws Exception {
		java.util.function.Function<BiSupplier<Object, List<Object>>, Object> builder = biSupplier -> {
			org.nasdanika.html.bootstrap.Container.Row.Col col = (org.nasdanika.html.bootstrap.Container.Row.Col) biSupplier.getFirst();
			configureCol(col);
			biSupplier.getSecond().forEach(col);
			return col;
		};
		return createContentSupplierFactory().create(context).asFunction().then(builder).then(super.asConsumer(context));
	}

	/**
	 * To be overridden by {@link BootstrapContainerApplicationPanelImpl} to configure widths.
	 * @param col
	 */
	protected void configureCol(Col col) {
		
	}

} //BootstrapContainerApplicationSectionImpl
