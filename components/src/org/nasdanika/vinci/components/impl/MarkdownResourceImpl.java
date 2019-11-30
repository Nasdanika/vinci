/**
 */
package org.nasdanika.vinci.components.impl;

import java.net.URL;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.nasdanika.common.Context;
import org.nasdanika.common.Converter;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.Supplier;
import org.nasdanika.emf.Util;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.ncore.impl.ModelElementImpl;
import org.nasdanika.vinci.components.ComponentsPackage;
import org.nasdanika.vinci.components.MarkdownResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Markdown Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.impl.MarkdownResourceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.impl.MarkdownResourceImpl#isStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkdownResourceImpl extends ModelElementImpl implements MarkdownResource {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

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
	protected MarkdownResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.MARKDOWN_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MARKDOWN_RESOURCE__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MARKDOWN_RESOURCE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.MARKDOWN_RESOURCE__LOCATION:
				return getLocation();
			case ComponentsPackage.MARKDOWN_RESOURCE__STYLE:
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
			case ComponentsPackage.MARKDOWN_RESOURCE__LOCATION:
				setLocation((String)newValue);
				return;
			case ComponentsPackage.MARKDOWN_RESOURCE__STYLE:
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
			case ComponentsPackage.MARKDOWN_RESOURCE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ComponentsPackage.MARKDOWN_RESOURCE__STYLE:
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
			case ComponentsPackage.MARKDOWN_RESOURCE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case ComponentsPackage.MARKDOWN_RESOURCE__STYLE:
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
		result.append(" (location: ");
		result.append(location);
		result.append(", style: ");
		result.append(style);
		result.append(')');
		return result.toString();
	}

	@Override
	public Supplier<Object> create(Context context) throws Exception {
		return Supplier.fromCallable(() -> {
			URL url = Util.resolveReference(eResource(), context.interpolate(getLocation()));
			Converter converter = context.get(Converter.class, DefaultConverter.INSTANCE);
			String markdown = converter.convert(url, String.class);
			MarkdownHelper markdownHelper = new MarkdownHelper();
			String html = markdownHelper.markdownToHtml(context.interpolate(markdown));
			if (!isStyle()) {
				return html;
			}
			HTMLFactory htmlFactory = context.get(HTMLFactory.class, HTMLFactory.INSTANCE);
			return htmlFactory.div(html).addClass("markdown-body");
		}, getTitle(), 1);
	}

} //MarkdownResourceImpl
