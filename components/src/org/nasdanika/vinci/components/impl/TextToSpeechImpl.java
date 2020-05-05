/**
 */
package org.nasdanika.vinci.components.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.ncore.impl.ModelElementImpl;

import org.nasdanika.vinci.bootstrap.Appearance;

import org.nasdanika.vinci.components.ComponentsPackage;
import org.nasdanika.vinci.components.TextToSpeech;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text To Speech</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.impl.TextToSpeechImpl#isLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.impl.TextToSpeechImpl#isVoice <em>Voice</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.impl.TextToSpeechImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.impl.TextToSpeechImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.impl.TextToSpeechImpl#isInterpolate <em>Interpolate</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.impl.TextToSpeechImpl#getAppearance <em>Appearance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextToSpeechImpl extends ModelElementImpl implements TextToSpeech {
	/**
	 * The default value of the '{@link #isLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LANGUAGE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isVoice() <em>Voice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVoice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOICE_EDEFAULT = false;

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
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

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
	protected TextToSpeechImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.TEXT_TO_SPEECH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLanguage() {
		return (Boolean)eDynamicGet(ComponentsPackage.TEXT_TO_SPEECH__LANGUAGE, ComponentsPackage.Literals.TEXT_TO_SPEECH__LANGUAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(boolean newLanguage) {
		eDynamicSet(ComponentsPackage.TEXT_TO_SPEECH__LANGUAGE, ComponentsPackage.Literals.TEXT_TO_SPEECH__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVoice() {
		return (Boolean)eDynamicGet(ComponentsPackage.TEXT_TO_SPEECH__VOICE, ComponentsPackage.Literals.TEXT_TO_SPEECH__VOICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoice(boolean newVoice) {
		eDynamicSet(ComponentsPackage.TEXT_TO_SPEECH__VOICE, ComponentsPackage.Literals.TEXT_TO_SPEECH__VOICE, newVoice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return (String)eDynamicGet(ComponentsPackage.TEXT_TO_SPEECH__FORMAT, ComponentsPackage.Literals.TEXT_TO_SPEECH__FORMAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		eDynamicSet(ComponentsPackage.TEXT_TO_SPEECH__FORMAT, ComponentsPackage.Literals.TEXT_TO_SPEECH__FORMAT, newFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return (String)eDynamicGet(ComponentsPackage.TEXT_TO_SPEECH__TEXT, ComponentsPackage.Literals.TEXT_TO_SPEECH__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		eDynamicSet(ComponentsPackage.TEXT_TO_SPEECH__TEXT, ComponentsPackage.Literals.TEXT_TO_SPEECH__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInterpolate() {
		return (Boolean)eDynamicGet(ComponentsPackage.TEXT_TO_SPEECH__INTERPOLATE, ComponentsPackage.Literals.TEXT_TO_SPEECH__INTERPOLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpolate(boolean newInterpolate) {
		eDynamicSet(ComponentsPackage.TEXT_TO_SPEECH__INTERPOLATE, ComponentsPackage.Literals.TEXT_TO_SPEECH__INTERPOLATE, newInterpolate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appearance getAppearance() {
		return (Appearance)eDynamicGet(ComponentsPackage.TEXT_TO_SPEECH__APPEARANCE, ComponentsPackage.Literals.TEXT_TO_SPEECH__APPEARANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearance(Appearance newAppearance, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAppearance, ComponentsPackage.TEXT_TO_SPEECH__APPEARANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppearance(Appearance newAppearance) {
		eDynamicSet(ComponentsPackage.TEXT_TO_SPEECH__APPEARANCE, ComponentsPackage.Literals.TEXT_TO_SPEECH__APPEARANCE, newAppearance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.TEXT_TO_SPEECH__APPEARANCE:
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
			case ComponentsPackage.TEXT_TO_SPEECH__LANGUAGE:
				return isLanguage();
			case ComponentsPackage.TEXT_TO_SPEECH__VOICE:
				return isVoice();
			case ComponentsPackage.TEXT_TO_SPEECH__FORMAT:
				return getFormat();
			case ComponentsPackage.TEXT_TO_SPEECH__TEXT:
				return getText();
			case ComponentsPackage.TEXT_TO_SPEECH__INTERPOLATE:
				return isInterpolate();
			case ComponentsPackage.TEXT_TO_SPEECH__APPEARANCE:
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
			case ComponentsPackage.TEXT_TO_SPEECH__LANGUAGE:
				setLanguage((Boolean)newValue);
				return;
			case ComponentsPackage.TEXT_TO_SPEECH__VOICE:
				setVoice((Boolean)newValue);
				return;
			case ComponentsPackage.TEXT_TO_SPEECH__FORMAT:
				setFormat((String)newValue);
				return;
			case ComponentsPackage.TEXT_TO_SPEECH__TEXT:
				setText((String)newValue);
				return;
			case ComponentsPackage.TEXT_TO_SPEECH__INTERPOLATE:
				setInterpolate((Boolean)newValue);
				return;
			case ComponentsPackage.TEXT_TO_SPEECH__APPEARANCE:
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
			case ComponentsPackage.TEXT_TO_SPEECH__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case ComponentsPackage.TEXT_TO_SPEECH__VOICE:
				setVoice(VOICE_EDEFAULT);
				return;
			case ComponentsPackage.TEXT_TO_SPEECH__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case ComponentsPackage.TEXT_TO_SPEECH__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case ComponentsPackage.TEXT_TO_SPEECH__INTERPOLATE:
				setInterpolate(INTERPOLATE_EDEFAULT);
				return;
			case ComponentsPackage.TEXT_TO_SPEECH__APPEARANCE:
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
			case ComponentsPackage.TEXT_TO_SPEECH__LANGUAGE:
				return isLanguage() != LANGUAGE_EDEFAULT;
			case ComponentsPackage.TEXT_TO_SPEECH__VOICE:
				return isVoice() != VOICE_EDEFAULT;
			case ComponentsPackage.TEXT_TO_SPEECH__FORMAT:
				return FORMAT_EDEFAULT == null ? getFormat() != null : !FORMAT_EDEFAULT.equals(getFormat());
			case ComponentsPackage.TEXT_TO_SPEECH__TEXT:
				return TEXT_EDEFAULT == null ? getText() != null : !TEXT_EDEFAULT.equals(getText());
			case ComponentsPackage.TEXT_TO_SPEECH__INTERPOLATE:
				return isInterpolate() != INTERPOLATE_EDEFAULT;
			case ComponentsPackage.TEXT_TO_SPEECH__APPEARANCE:
				return getAppearance() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Supplier<ViewPart> create(Context arg) throws Exception {
		throw new UnsupportedOperationException();
	}

} //TextToSpeechImpl
