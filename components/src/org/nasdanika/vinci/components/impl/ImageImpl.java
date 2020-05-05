/**
 */
package org.nasdanika.vinci.components.impl;

import java.util.Base64;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.Util;
import org.nasdanika.html.Tag;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.ncore.impl.ModelElementImpl;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.components.ComponentsPackage;
import org.nasdanika.vinci.components.Image;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.impl.ImageImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.impl.ImageImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.impl.ImageImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.impl.ImageImpl#getAppearance <em>Appearance</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.impl.ImageImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageImpl extends ModelElementImpl implements Image {
	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CONTENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return (String)eDynamicGet(ComponentsPackage.IMAGE__FORMAT, ComponentsPackage.Literals.IMAGE__FORMAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		eDynamicSet(ComponentsPackage.IMAGE__FORMAT, ComponentsPackage.Literals.IMAGE__FORMAT, newFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getContent() {
		return (byte[])eDynamicGet(ComponentsPackage.IMAGE__CONTENT, ComponentsPackage.Literals.IMAGE__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(byte[] newContent) {
		eDynamicSet(ComponentsPackage.IMAGE__CONTENT, ComponentsPackage.Literals.IMAGE__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaption() {
		return (String)eDynamicGet(ComponentsPackage.IMAGE__CAPTION, ComponentsPackage.Literals.IMAGE__CAPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaption(String newCaption) {
		eDynamicSet(ComponentsPackage.IMAGE__CAPTION, ComponentsPackage.Literals.IMAGE__CAPTION, newCaption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appearance getAppearance() {
		return (Appearance)eDynamicGet(ComponentsPackage.IMAGE__APPEARANCE, ComponentsPackage.Literals.IMAGE__APPEARANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearance(Appearance newAppearance, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAppearance, ComponentsPackage.IMAGE__APPEARANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppearance(Appearance newAppearance) {
		eDynamicSet(ComponentsPackage.IMAGE__APPEARANCE, ComponentsPackage.Literals.IMAGE__APPEARANCE, newAppearance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractAction getTarget() {
		return (AbstractAction)eDynamicGet(ComponentsPackage.IMAGE__TARGET, ComponentsPackage.Literals.IMAGE__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction basicGetTarget() {
		return (AbstractAction)eDynamicGet(ComponentsPackage.IMAGE__TARGET, ComponentsPackage.Literals.IMAGE__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(AbstractAction newTarget) {
		eDynamicSet(ComponentsPackage.IMAGE__TARGET, ComponentsPackage.Literals.IMAGE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.IMAGE__APPEARANCE:
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
			case ComponentsPackage.IMAGE__FORMAT:
				return getFormat();
			case ComponentsPackage.IMAGE__CONTENT:
				return getContent();
			case ComponentsPackage.IMAGE__CAPTION:
				return getCaption();
			case ComponentsPackage.IMAGE__APPEARANCE:
				return getAppearance();
			case ComponentsPackage.IMAGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case ComponentsPackage.IMAGE__FORMAT:
				setFormat((String)newValue);
				return;
			case ComponentsPackage.IMAGE__CONTENT:
				setContent((byte[])newValue);
				return;
			case ComponentsPackage.IMAGE__CAPTION:
				setCaption((String)newValue);
				return;
			case ComponentsPackage.IMAGE__APPEARANCE:
				setAppearance((Appearance)newValue);
				return;
			case ComponentsPackage.IMAGE__TARGET:
				setTarget((AbstractAction)newValue);
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
			case ComponentsPackage.IMAGE__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case ComponentsPackage.IMAGE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case ComponentsPackage.IMAGE__CAPTION:
				setCaption(CAPTION_EDEFAULT);
				return;
			case ComponentsPackage.IMAGE__APPEARANCE:
				setAppearance((Appearance)null);
				return;
			case ComponentsPackage.IMAGE__TARGET:
				setTarget((AbstractAction)null);
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
			case ComponentsPackage.IMAGE__FORMAT:
				return FORMAT_EDEFAULT == null ? getFormat() != null : !FORMAT_EDEFAULT.equals(getFormat());
			case ComponentsPackage.IMAGE__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
			case ComponentsPackage.IMAGE__CAPTION:
				return CAPTION_EDEFAULT == null ? getCaption() != null : !CAPTION_EDEFAULT.equals(getCaption());
			case ComponentsPackage.IMAGE__APPEARANCE:
				return getAppearance() != null;
			case ComponentsPackage.IMAGE__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		
		String caption = context.interpolate(getCaption());
		
		Supplier<ViewPart> imageSupplier = Supplier.fromCallable(() -> new ViewPart() {

			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				Tag imageTag = TagName.img.create();
				
				byte[] content = getContent();
				if (content != null) {
					imageTag.attribute("src", "data:image/" + getFormat() + ";base64, " + Base64.getEncoder().encodeToString(content));
				}
												
				// TODO - image map support.
				
				if (Util.isBlank(caption)) {				
					return imageTag;
				}
				
				return TagName.figure.create(imageTag, TagName.figcaption.create(caption));
			}
			
		}, getTitle(), 1);
		
		Appearance appearance = getAppearance();
		if (appearance == null) {
			return imageSupplier;
		}
		
		return imageSupplier.then(appearance.create(context).asFunction()).then(bs -> new ViewPart() {

			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				return bs.getFirst().then(bs.getSecond());
			}
			
		});
	}

} //ImageImpl
