/**
 */
package org.nasdanika.vinci.components.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.nasdanika.common.Context;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.ncore.impl.ModelElementImpl;
import org.nasdanika.vinci.components.ComponentsPackage;
import org.nasdanika.vinci.components.Markdown;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Markdown</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.impl.MarkdownImpl#getMarkdown <em>Markdown</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.impl.MarkdownImpl#isStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkdownImpl extends ModelElementImpl implements Markdown {
	/**
	 * The default value of the '{@link #getMarkdown() <em>Markdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkdown()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKDOWN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMarkdown() <em>Markdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkdown()
	 * @generated
	 * @ordered
	 */
	protected String markdown = MARKDOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #isStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStyle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STYLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStyle()
	 * @generated
	 * @ordered
	 */
	protected boolean style = STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkdownImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.MARKDOWN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarkdown() {
		return markdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkdown(String newMarkdown) {
		String oldMarkdown = markdown;
		markdown = newMarkdown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MARKDOWN__MARKDOWN, oldMarkdown, markdown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(boolean newStyle) {
		boolean oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MARKDOWN__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.MARKDOWN__MARKDOWN:
				return getMarkdown();
			case ComponentsPackage.MARKDOWN__STYLE:
				return isStyle();
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
			case ComponentsPackage.MARKDOWN__MARKDOWN:
				setMarkdown((String)newValue);
				return;
			case ComponentsPackage.MARKDOWN__STYLE:
				setStyle((Boolean)newValue);
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
			case ComponentsPackage.MARKDOWN__MARKDOWN:
				setMarkdown(MARKDOWN_EDEFAULT);
				return;
			case ComponentsPackage.MARKDOWN__STYLE:
				setStyle(STYLE_EDEFAULT);
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
			case ComponentsPackage.MARKDOWN__MARKDOWN:
				return MARKDOWN_EDEFAULT == null ? markdown != null : !MARKDOWN_EDEFAULT.equals(markdown);
			case ComponentsPackage.MARKDOWN__STYLE:
				return style != STYLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (markdown: ");
		result.append(markdown);
		result.append(", style: ");
		result.append(style);
		result.append(')');
		return result.toString();
	}

	@Override
	public Supplier<Object> create(Context context) throws Exception {
		return Supplier.fromCallable(() -> {
			MarkdownHelper markdownHelper = new MarkdownHelper();
			String html = markdownHelper.markdownToHtml(context.interpolate(markdown));
			if (!isStyle()) {
				return html;
			}
			HTMLFactory htmlFactory = context.get(HTMLFactory.class, HTMLFactory.INSTANCE);
			return htmlFactory.div(html).addClass("markdown-body");
		}, getTitle(), 1);
	}

} //MarkdownImpl
