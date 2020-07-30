package org.nasdanika.vinci.components.gen;

import java.net.URL;

import org.nasdanika.common.Context;
import org.nasdanika.common.Converter;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.vinci.components.TextToSpeechResource;

/**
 * Adapts {@link TextToSpeechResource} to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public class TextToSpeechResourceSupplierFactory extends TextToSpeechSupplierFactory<TextToSpeechResource> {
	
	public TextToSpeechResourceSupplierFactory(TextToSpeechResource textToSpeechResource) {
		super(textToSpeechResource);
	}
	
	@Override
	protected String getText(Context context) throws Exception {
		URL url = EmfUtil.resolveReference(textToSpeech.eResource(), context.interpolate(textToSpeech.getLocation()));
		if (url == null) {
			throw new IllegalArgumentException("Resource does not exist");
		}
		Converter converter = context.get(Converter.class, DefaultConverter.INSTANCE);
		return converter.convert(url, String.class);
	}	
	
}
