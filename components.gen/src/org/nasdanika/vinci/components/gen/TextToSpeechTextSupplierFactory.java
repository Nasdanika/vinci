package org.nasdanika.vinci.components.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.vinci.components.TextToSpeechText;

/**
 * Adapts {@link TextToSpeechText} to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public class TextToSpeechTextSupplierFactory extends TextToSpeechSupplierFactory<TextToSpeechText> {
	
	public TextToSpeechTextSupplierFactory(TextToSpeechText textToSpeechText) {
		super(textToSpeechText);
	}
	
	@Override
	protected String getText(Context context) throws Exception {
		return textToSpeech.getText();
	}
	
}
