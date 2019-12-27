/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.BiSupplier;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;
import org.nasdanika.common.StringMapCompoundSupplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.bootstrap.ActionGroup;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.ContentActionGroupItem;
import org.nasdanika.vinci.html.HtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Action Group Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.ContentActionGroupItemImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.ContentActionGroupItemImpl#getMarkdownContent <em>Markdown Content</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.ContentActionGroupItemImpl#getHtmlContent <em>Html Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentActionGroupItemImpl extends ActionGroupItemImpl implements ContentActionGroupItem {
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
	protected ContentActionGroupItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.CONTENT_ACTION_GROUP_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SupplierFactory<Object>> getContent() {
		return (EList<SupplierFactory<Object>>)eDynamicGet(BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__CONTENT, HtmlPackage.Literals.CONTAINER__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarkdownContent() {
		return (String)eDynamicGet(BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__MARKDOWN_CONTENT, HtmlPackage.Literals.CONTAINER__MARKDOWN_CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkdownContent(String newMarkdownContent) {
		eDynamicSet(BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__MARKDOWN_CONTENT, HtmlPackage.Literals.CONTAINER__MARKDOWN_CONTENT, newMarkdownContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHtmlContent() {
		return (String)eDynamicGet(BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__HTML_CONTENT, HtmlPackage.Literals.CONTAINER__HTML_CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHtmlContent(String newHtmlContent) {
		eDynamicSet(BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__HTML_CONTENT, HtmlPackage.Literals.CONTAINER__HTML_CONTENT, newHtmlContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__CONTENT:
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
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__CONTENT:
				return getContent();
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__MARKDOWN_CONTENT:
				return getMarkdownContent();
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__HTML_CONTENT:
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
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends SupplierFactory<Object>>)newValue);
				return;
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__MARKDOWN_CONTENT:
				setMarkdownContent((String)newValue);
				return;
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__HTML_CONTENT:
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
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__CONTENT:
				getContent().clear();
				return;
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__MARKDOWN_CONTENT:
				setMarkdownContent(MARKDOWN_CONTENT_EDEFAULT);
				return;
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__HTML_CONTENT:
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
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__CONTENT:
				return !getContent().isEmpty();
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__MARKDOWN_CONTENT:
				return MARKDOWN_CONTENT_EDEFAULT == null ? getMarkdownContent() != null : !MARKDOWN_CONTENT_EDEFAULT.equals(getMarkdownContent());
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__HTML_CONTENT:
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
				case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__CONTENT: return HtmlPackage.CONTAINER__CONTENT;
				case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__MARKDOWN_CONTENT: return HtmlPackage.CONTAINER__MARKDOWN_CONTENT;
				case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__HTML_CONTENT: return HtmlPackage.CONTAINER__HTML_CONTENT;
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
				case HtmlPackage.CONTAINER__CONTENT: return BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__CONTENT;
				case HtmlPackage.CONTAINER__MARKDOWN_CONTENT: return BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__MARKDOWN_CONTENT;
				case HtmlPackage.CONTAINER__HTML_CONTENT: return BootstrapPackage.CONTENT_ACTION_GROUP_ITEM__HTML_CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@Override
	public Consumer<Object> create(Context context) throws Exception {
		@SuppressWarnings("resource")
		StringMapCompoundSupplier<List<Object>> partsSupplier = new StringMapCompoundSupplier<>("Parts");
		partsSupplier.put(createNameSupplier(context));
		partsSupplier.put(createContentSupplierFactory().create(context));

		java.util.function.Consumer<BiSupplier<Object, Map<String,List<Object>>>> consumer = new java.util.function.Consumer<BiSupplier<Object, Map<String,List<Object>>>>() {

			@Override
			public void accept(BiSupplier<Object, Map<String,List<Object>>> supplier) {
				HTMLFactory htmlFactory = context.get(HTMLFactory.class, HTMLFactory.INSTANCE);

				Fragment nameFragment = htmlFactory.fragment();
				supplier.getSecond().get("Name").forEach(nameFragment);
				
				Fragment contentFragment = htmlFactory.fragment();
				supplier.getSecond().get("Content").forEach(contentFragment);
				
				((ActionGroup) supplier.getFirst()).contentAction(
						nameFragment, 
						isActive(), 
						isDisabled(), 
						Util.isBlank(getColor()) ? null : Color.fromLabel(getColor()), 
						null, 
						contentFragment);
			}


		};
		
		return partsSupplier.asFunction().then(Consumer.fromConsumer(consumer, getTitle(), 1));
	}

} //ContentActionGroupItemImpl
