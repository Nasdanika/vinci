/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.BiSupplier;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.html.bootstrap.Breakpoint;
import org.nasdanika.html.bootstrap.Container.Row.Col;
import org.nasdanika.html.bootstrap.Size;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.Column;
import org.nasdanika.vinci.bootstrap.ColumnWidth;
import org.nasdanika.vinci.html.HtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.ColumnImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.ColumnImpl#getMarkdownContent <em>Markdown Content</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.ColumnImpl#getHtmlContent <em>Html Content</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.ColumnImpl#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends BootstrapElementImpl implements Column {
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
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SupplierFactory<Object>> getContent() {
		return (EList<SupplierFactory<Object>>)eDynamicGet(BootstrapPackage.COLUMN__CONTENT, HtmlPackage.Literals.CONTAINER__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarkdownContent() {
		return (String)eDynamicGet(BootstrapPackage.COLUMN__MARKDOWN_CONTENT, HtmlPackage.Literals.CONTAINER__MARKDOWN_CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkdownContent(String newMarkdownContent) {
		eDynamicSet(BootstrapPackage.COLUMN__MARKDOWN_CONTENT, HtmlPackage.Literals.CONTAINER__MARKDOWN_CONTENT, newMarkdownContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHtmlContent() {
		return (String)eDynamicGet(BootstrapPackage.COLUMN__HTML_CONTENT, HtmlPackage.Literals.CONTAINER__HTML_CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHtmlContent(String newHtmlContent) {
		eDynamicSet(BootstrapPackage.COLUMN__HTML_CONTENT, HtmlPackage.Literals.CONTAINER__HTML_CONTENT, newHtmlContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ColumnWidth> getWidth() {
		return (EList<ColumnWidth>)eDynamicGet(BootstrapPackage.COLUMN__WIDTH, BootstrapPackage.Literals.COLUMN__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.COLUMN__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case BootstrapPackage.COLUMN__WIDTH:
				return ((InternalEList<?>)getWidth()).basicRemove(otherEnd, msgs);
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
			case BootstrapPackage.COLUMN__CONTENT:
				return getContent();
			case BootstrapPackage.COLUMN__MARKDOWN_CONTENT:
				return getMarkdownContent();
			case BootstrapPackage.COLUMN__HTML_CONTENT:
				return getHtmlContent();
			case BootstrapPackage.COLUMN__WIDTH:
				return getWidth();
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
			case BootstrapPackage.COLUMN__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends SupplierFactory<Object>>)newValue);
				return;
			case BootstrapPackage.COLUMN__MARKDOWN_CONTENT:
				setMarkdownContent((String)newValue);
				return;
			case BootstrapPackage.COLUMN__HTML_CONTENT:
				setHtmlContent((String)newValue);
				return;
			case BootstrapPackage.COLUMN__WIDTH:
				getWidth().clear();
				getWidth().addAll((Collection<? extends ColumnWidth>)newValue);
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
			case BootstrapPackage.COLUMN__CONTENT:
				getContent().clear();
				return;
			case BootstrapPackage.COLUMN__MARKDOWN_CONTENT:
				setMarkdownContent(MARKDOWN_CONTENT_EDEFAULT);
				return;
			case BootstrapPackage.COLUMN__HTML_CONTENT:
				setHtmlContent(HTML_CONTENT_EDEFAULT);
				return;
			case BootstrapPackage.COLUMN__WIDTH:
				getWidth().clear();
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
			case BootstrapPackage.COLUMN__CONTENT:
				return !getContent().isEmpty();
			case BootstrapPackage.COLUMN__MARKDOWN_CONTENT:
				return MARKDOWN_CONTENT_EDEFAULT == null ? getMarkdownContent() != null : !MARKDOWN_CONTENT_EDEFAULT.equals(getMarkdownContent());
			case BootstrapPackage.COLUMN__HTML_CONTENT:
				return HTML_CONTENT_EDEFAULT == null ? getHtmlContent() != null : !HTML_CONTENT_EDEFAULT.equals(getHtmlContent());
			case BootstrapPackage.COLUMN__WIDTH:
				return !getWidth().isEmpty();
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
				case BootstrapPackage.COLUMN__CONTENT: return HtmlPackage.CONTAINER__CONTENT;
				case BootstrapPackage.COLUMN__MARKDOWN_CONTENT: return HtmlPackage.CONTAINER__MARKDOWN_CONTENT;
				case BootstrapPackage.COLUMN__HTML_CONTENT: return HtmlPackage.CONTAINER__HTML_CONTENT;
				default: return -1;
			}
		}
		if (baseClass == ConsumerFactory.class) {
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
		if (baseClass == org.nasdanika.vinci.html.Container.class) {
			switch (baseFeatureID) {
				case HtmlPackage.CONTAINER__CONTENT: return BootstrapPackage.COLUMN__CONTENT;
				case HtmlPackage.CONTAINER__MARKDOWN_CONTENT: return BootstrapPackage.COLUMN__MARKDOWN_CONTENT;
				case HtmlPackage.CONTAINER__HTML_CONTENT: return BootstrapPackage.COLUMN__HTML_CONTENT;
				default: return -1;
			}
		}
		if (baseClass == ConsumerFactory.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@Override
	public Consumer<Object> create(Context context) throws Exception {
		
		BiFunction<BiSupplier<Object, List<Object>>, ProgressMonitor, Object> cbf = (biSupplier, progressMonitor) -> {
			Col col = (Col) biSupplier.getFirst();
			for (ColumnWidth cw: getWidth()) {
				Breakpoint breakpoint = Util.isBlank(cw.getBreakpoint()) ? Breakpoint.DEFAULT : Breakpoint.fromLabel(cw.getBreakpoint());
				Size width = Util.isBlank(cw.getWidth()) ? Size.NONE : Size.fromCode(cw.getWidth());
				col.width(breakpoint, width);
			}
			for (Object c: biSupplier.getSecond()) {
				col.accept(c);
			}
			return col;
		}; 
		Function<BiSupplier<Object, List<Object>>,Object> combiner = Function.fromBiFunction(cbf , getTitle(), 1);
		
		Function<Object, Object> contentFunction = createContentSupplierFactory().create(context).asFunction().then(combiner);
		Appearance appearance = getAppearance();
		return contentFunction.then(appearance == null ? Consumer.NOP : appearance.create(context));
	}

} //ColumnImpl
