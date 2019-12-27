/**
 */
package org.nasdanika.vinci.html.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Context;
import org.nasdanika.common.StringMapCompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.vinci.html.ContentTag;
import org.nasdanika.vinci.html.HtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.html.impl.ContentTagImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.vinci.html.impl.ContentTagImpl#getMarkdownContent <em>Markdown Content</em>}</li>
 *   <li>{@link org.nasdanika.vinci.html.impl.ContentTagImpl#getHtmlContent <em>Html Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentTagImpl extends TagImpl implements ContentTag {
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
	protected ContentTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.CONTENT_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SupplierFactory<Object>> getContent() {
		return (EList<SupplierFactory<Object>>)eDynamicGet(HtmlPackage.CONTENT_TAG__CONTENT, HtmlPackage.Literals.CONTAINER__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarkdownContent() {
		return (String)eDynamicGet(HtmlPackage.CONTENT_TAG__MARKDOWN_CONTENT, HtmlPackage.Literals.CONTAINER__MARKDOWN_CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkdownContent(String newMarkdownContent) {
		eDynamicSet(HtmlPackage.CONTENT_TAG__MARKDOWN_CONTENT, HtmlPackage.Literals.CONTAINER__MARKDOWN_CONTENT, newMarkdownContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHtmlContent() {
		return (String)eDynamicGet(HtmlPackage.CONTENT_TAG__HTML_CONTENT, HtmlPackage.Literals.CONTAINER__HTML_CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHtmlContent(String newHtmlContent) {
		eDynamicSet(HtmlPackage.CONTENT_TAG__HTML_CONTENT, HtmlPackage.Literals.CONTAINER__HTML_CONTENT, newHtmlContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.CONTENT_TAG__CONTENT:
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
			case HtmlPackage.CONTENT_TAG__CONTENT:
				return getContent();
			case HtmlPackage.CONTENT_TAG__MARKDOWN_CONTENT:
				return getMarkdownContent();
			case HtmlPackage.CONTENT_TAG__HTML_CONTENT:
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
			case HtmlPackage.CONTENT_TAG__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends SupplierFactory<Object>>)newValue);
				return;
			case HtmlPackage.CONTENT_TAG__MARKDOWN_CONTENT:
				setMarkdownContent((String)newValue);
				return;
			case HtmlPackage.CONTENT_TAG__HTML_CONTENT:
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
			case HtmlPackage.CONTENT_TAG__CONTENT:
				getContent().clear();
				return;
			case HtmlPackage.CONTENT_TAG__MARKDOWN_CONTENT:
				setMarkdownContent(MARKDOWN_CONTENT_EDEFAULT);
				return;
			case HtmlPackage.CONTENT_TAG__HTML_CONTENT:
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
			case HtmlPackage.CONTENT_TAG__CONTENT:
				return !getContent().isEmpty();
			case HtmlPackage.CONTENT_TAG__MARKDOWN_CONTENT:
				return MARKDOWN_CONTENT_EDEFAULT == null ? getMarkdownContent() != null : !MARKDOWN_CONTENT_EDEFAULT.equals(getMarkdownContent());
			case HtmlPackage.CONTENT_TAG__HTML_CONTENT:
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
				case HtmlPackage.CONTENT_TAG__CONTENT: return HtmlPackage.CONTAINER__CONTENT;
				case HtmlPackage.CONTENT_TAG__MARKDOWN_CONTENT: return HtmlPackage.CONTAINER__MARKDOWN_CONTENT;
				case HtmlPackage.CONTENT_TAG__HTML_CONTENT: return HtmlPackage.CONTAINER__HTML_CONTENT;
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
				case HtmlPackage.CONTAINER__CONTENT: return HtmlPackage.CONTENT_TAG__CONTENT;
				case HtmlPackage.CONTAINER__MARKDOWN_CONTENT: return HtmlPackage.CONTENT_TAG__MARKDOWN_CONTENT;
				case HtmlPackage.CONTAINER__HTML_CONTENT: return HtmlPackage.CONTENT_TAG__HTML_CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Supplier<Object> create(Context context) throws Exception {
		Supplier<Object> tagSupplier = super.create(context);
		@SuppressWarnings("resource")
		StringMapCompoundSupplier<Object> mapSupplier = new StringMapCompoundSupplier<>("Parts");
		mapSupplier.put("Tag", tagSupplier);
		mapSupplier.put((Supplier) createContentSupplierFactory().create(context));
		return mapSupplier.then(map -> {
			org.nasdanika.html.Tag tag = (org.nasdanika.html.Tag) map.get("Tag");
			for (Object c: ((Collection<Object>) map.get("Content"))) {
				tag.accept(c);
			}
			return tag;
		});
	}

} //ContentTagImpl
