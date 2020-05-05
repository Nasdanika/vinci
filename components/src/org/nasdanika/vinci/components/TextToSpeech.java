/**
 */
package org.nasdanika.vinci.components;

import org.nasdanika.common.SupplierFactory;

import org.nasdanika.html.app.ViewPart;

import org.nasdanika.ncore.ModelElement;

import org.nasdanika.vinci.bootstrap.Appearance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text To Speech</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Uses [Google Text-to-Speech](https://cloud.google.com/text-to-speech) to synthesize 
 * voice from text or [SSML](https://cloud.google.com/text-to-speech/docs/ssml). 
 * Voice is output to an mp3 file. File name is defined by the ``path`` attribute if it is not blank. 
 * In this case path is resolved relative to the containing action. 
 * If ``path`` attribute is blank then the file name as a digest of language, voice, format, and text.
 * 
 * Generates audio tag which plays the synthesized speech.
 * 
 * Use of text to speech requires ``GOOGLE_APPLICATION_CREDENTIALS`` environment variable to be set to the location of the private key JSON file
 * as explained in [Google Cloud Getting Started with Authentication](https://cloud.google.com/docs/authentication/getting-started).
 * 
 *    
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.TextToSpeech#isLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.TextToSpeech#isVoice <em>Voice</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.TextToSpeech#getFormat <em>Format</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.TextToSpeech#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.TextToSpeech#isInterpolate <em>Interpolate</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.TextToSpeech#getAppearance <em>Appearance</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.components.ComponentsPackage#getTextToSpeech()
 * @model superTypes="org.nasdanika.ncore.ModelElement org.nasdanika.ncore.ISupplierFactory&lt;org.nasdanika.vinci.html.ViewPart&gt;"
 * @generated
 */
public interface TextToSpeech extends ModelElement, SupplierFactory<ViewPart> {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language and locale code, e.g. ``en-US``. If blank, then the contextual language and locale are used - hardcoded in the UI and configurable in the CLI. 
	 * See [Supported voices and languages](https://cloud.google.com/text-to-speech/docs/voices) for a list of locales and voices.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(boolean)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getTextToSpeech_Language()
	 * @model
	 * @generated
	 */
	boolean isLanguage();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.TextToSpeech#isLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #isLanguage()
	 * @generated
	 */
	void setLanguage(boolean value);

	/**
	 * Returns the value of the '<em><b>Voice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Voice name, e.g. ``en-US-Wavenet-D``. If blank, then the contextual voice is used - hardcoded in the UI and configurable in the CLI. 
	 * See [Supported voices and languages](https://cloud.google.com/text-to-speech/docs/voices) for a list of locales and voices.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Voice</em>' attribute.
	 * @see #setVoice(boolean)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getTextToSpeech_Voice()
	 * @model
	 * @generated
	 */
	boolean isVoice();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.TextToSpeech#isVoice <em>Voice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voice</em>' attribute.
	 * @see #isVoice()
	 * @generated
	 */
	void setVoice(boolean value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text format - ``Text`` or ``SSML``.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getTextToSpeech_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.TextToSpeech#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text to speak, in case of  [SSML](https://cloud.google.com/text-to-speech/docs/ssml) format ``<speak>`` and  ``</speak>`` opening and closing tags are implied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getTextToSpeech_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.TextToSpeech#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, text/ssml is interpolated before speech generation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolate</em>' attribute.
	 * @see #setInterpolate(boolean)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getTextToSpeech_Interpolate()
	 * @model
	 * @generated
	 */
	boolean isInterpolate();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.TextToSpeech#isInterpolate <em>Interpolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolate</em>' attribute.
	 * @see #isInterpolate()
	 * @generated
	 */
	void setInterpolate(boolean value);

	/**
	 * Returns the value of the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appearance to apply to the generated audio tag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appearance</em>' containment reference.
	 * @see #setAppearance(Appearance)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getTextToSpeech_Appearance()
	 * @model containment="true"
	 * @generated
	 */
	Appearance getAppearance();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.TextToSpeech#getAppearance <em>Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance</em>' containment reference.
	 * @see #getAppearance()
	 * @generated
	 */
	void setAppearance(Appearance value);

} // TextToSpeech
