/**
 */
package org.nasdanika.vinci.components.impl;


import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.Util;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.ncore.impl.ModelElementImpl;
import org.nasdanika.vinci.bootstrap.Appearance;
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
 *   <li>{@link org.nasdanika.vinci.components.impl.MarkdownImpl#isStyle <em>Style</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.impl.MarkdownImpl#isInterpolate <em>Interpolate</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.impl.MarkdownImpl#getAppearance <em>Appearance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MarkdownImpl extends ModelElementImpl implements Markdown {
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
	 * The default value of the '{@link #isInterpolate() <em>Interpolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterpolate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERPOLATE_EDEFAULT = false;
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
	public boolean isStyle() {
		return (Boolean)eDynamicGet(ComponentsPackage.MARKDOWN__STYLE, ComponentsPackage.Literals.MARKDOWN__STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(boolean newStyle) {
		eDynamicSet(ComponentsPackage.MARKDOWN__STYLE, ComponentsPackage.Literals.MARKDOWN__STYLE, newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInterpolate() {
		return (Boolean)eDynamicGet(ComponentsPackage.MARKDOWN__INTERPOLATE, ComponentsPackage.Literals.MARKDOWN__INTERPOLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpolate(boolean newInterpolate) {
		eDynamicSet(ComponentsPackage.MARKDOWN__INTERPOLATE, ComponentsPackage.Literals.MARKDOWN__INTERPOLATE, newInterpolate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appearance getAppearance() {
		return (Appearance)eDynamicGet(ComponentsPackage.MARKDOWN__APPEARANCE, ComponentsPackage.Literals.MARKDOWN__APPEARANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearance(Appearance newAppearance, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAppearance, ComponentsPackage.MARKDOWN__APPEARANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppearance(Appearance newAppearance) {
		eDynamicSet(ComponentsPackage.MARKDOWN__APPEARANCE, ComponentsPackage.Literals.MARKDOWN__APPEARANCE, newAppearance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.MARKDOWN__APPEARANCE:
				return basicSetAppearance(null, msgs);
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
			case ComponentsPackage.MARKDOWN__STYLE:
				return isStyle();
			case ComponentsPackage.MARKDOWN__INTERPOLATE:
				return isInterpolate();
			case ComponentsPackage.MARKDOWN__APPEARANCE:
				return getAppearance();
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
			case ComponentsPackage.MARKDOWN__STYLE:
				setStyle((Boolean)newValue);
				return;
			case ComponentsPackage.MARKDOWN__INTERPOLATE:
				setInterpolate((Boolean)newValue);
				return;
			case ComponentsPackage.MARKDOWN__APPEARANCE:
				setAppearance((Appearance)newValue);
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
			case ComponentsPackage.MARKDOWN__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case ComponentsPackage.MARKDOWN__INTERPOLATE:
				setInterpolate(INTERPOLATE_EDEFAULT);
				return;
			case ComponentsPackage.MARKDOWN__APPEARANCE:
				setAppearance((Appearance)null);
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
			case ComponentsPackage.MARKDOWN__STYLE:
				return isStyle() != STYLE_EDEFAULT;
			case ComponentsPackage.MARKDOWN__INTERPOLATE:
				return isInterpolate() != INTERPOLATE_EDEFAULT;
			case ComponentsPackage.MARKDOWN__APPEARANCE:
				return getAppearance() != null;
		}
		return super.eIsSet(featureID);
	}
	
	protected abstract String doGetMarkdown(Context context) throws Exception;
	
	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		
		String markdown = doGetMarkdown(context);
		if (Util.isBlank(markdown)) {
			return Supplier.empty();
		}
		
		String[] html = { MarkdownHelper.INSTANCE.markdownToHtml(markdown).trim() };
		if (isInterpolate()) {
			html[0] = context.interpolate(html[0]);
		}		
		
		Supplier<ViewPart> markdownSupplier = Supplier.fromCallable(() -> new ViewPart() {

			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				// Double interpolation for mapping expansion
				if (isInterpolate()) {
					html[0] = viewGenerator.interpolate(html[0]);
				}		
				
				if (!isStyle()) {
					return html[0];
				}
				return viewGenerator.get(HTMLFactory.class).div(html[0]).addClass("markdown-body");
			}
			
		}, getTitle(), 1);
		
		Appearance appearance = getAppearance();
		if (appearance == null) {
			return markdownSupplier;
		}
		
		return markdownSupplier.then(appearance.create(context).asFunction()).then(bs -> new ViewPart() {

			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				java.util.function.Function<Object, Object> wrapper = mrkdwn -> {
					if (mrkdwn instanceof String) {
						mrkdwn = viewGenerator.get(HTMLFactory.class).div(mrkdwn);
					}
					return mrkdwn;
				};
				
				return bs.getFirst().then(bs.getSecond().before(wrapper));
			}
			
		});
	}
	

} //MarkdownImpl
