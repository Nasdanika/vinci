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
import org.nasdanika.vinci.components.ComponentsPackage;
import org.nasdanika.vinci.components.MarkdownText;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Markdown Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.impl.MarkdownTextImpl#getMarkdown <em>Markdown</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkdownTextImpl extends MarkdownImpl implements MarkdownText {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkdownTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.MARKDOWN_TEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MARKDOWN_TEXT__MARKDOWN, oldMarkdown, markdown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.MARKDOWN_TEXT__MARKDOWN:
				return getMarkdown();
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
			case ComponentsPackage.MARKDOWN_TEXT__MARKDOWN:
				setMarkdown((String)newValue);
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
			case ComponentsPackage.MARKDOWN_TEXT__MARKDOWN:
				setMarkdown(MARKDOWN_EDEFAULT);
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
			case ComponentsPackage.MARKDOWN_TEXT__MARKDOWN:
				return MARKDOWN_EDEFAULT == null ? markdown != null : !MARKDOWN_EDEFAULT.equals(markdown);
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

} //MarkdownTextImpl
