package org.nasdanika.vinci.components.gen;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

import org.apache.commons.codec.binary.Hex;
import org.eclipse.emf.common.util.URI;
import org.nasdanika.common.Context;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.common.resources.BinaryEntityContainer;
import org.nasdanika.html.Tag;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.texttospeech.SpeechSynthesizer;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.components.TextToSpeech;

/**
 * Adapts {@link TextToSpeech} to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public abstract class TextToSpeechSupplierFactory<T extends TextToSpeech> implements SupplierFactory<ViewPart> {
	
	protected T textToSpeech;

	protected TextToSpeechSupplierFactory(T textToSpeech) {
		this.textToSpeech = textToSpeech;
	}
	
	protected abstract String getText(Context context) throws Exception;	
	
	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		
		String theText = getText(context);
		String text = textToSpeech.isInterpolate() ? context.interpolate(theText) : theText;
		
		Supplier<ViewPart> audioSupplier = new Supplier<ViewPart>() {
			
			@Override
			public double size() {
				return 1;
			}
			
			@Override
			public String name() {
				return textToSpeech.getTitle();
			}
			
			@Override
			public ViewPart execute(ProgressMonitor progressMonitor) throws Exception {
				SpeechSynthesizer synthesizer = context.get(SpeechSynthesizer.class);
				boolean ssml = "SSML".equals(textToSpeech.getFormat());
				
				InputStream audio = synthesizer.synthesizeSpeech(textToSpeech.getLanguage(), textToSpeech.getVoice(), ssml, ssml ? "<speak>" + text + "</speak>" : text, progressMonitor);
						
				String path = context.interpolate(textToSpeech.getPath());
				String audioLocation = textToSpeech.isEmbed() ? null : Util.isBlank(path) ? (ssml ? "S" : "T") + Hex.encodeHexString(MessageDigest.getInstance("SHA-256").digest(text.getBytes(StandardCharsets.UTF_8))) + ".mp3" : path;				
				String encodedAudio = textToSpeech.isEmbed() ? "data:audio/mpeg;base64, " + Base64.getEncoder().encodeToString(DefaultConverter.INSTANCE.toByteArray(audio)) : null;
				if (audioLocation != null) {
					URI baseURI = context.get(Context.BASE_URI_PROPERTY, URI.class);
					URI contextURI = context.get(URI.class);
					String audioPath = URI.createURI(audioLocation).resolve(contextURI).deresolve(baseURI).toString();						
					
					BinaryEntityContainer resourceContainer = context.get(BinaryEntityContainer.class);
					resourceContainer.stateAdapter().put(audioPath, audio, progressMonitor);
				}
				
				// TODO Auto-generated method stub
				return new ViewPart() {
	
					@Override
					public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
						Tag sourceTag = TagName.source.create();
						
						if (textToSpeech.isEmbed()) {
							sourceTag.attribute("src", encodedAudio);
						} else {
							sourceTag.attribute("type", "audio/mpeg");
							sourceTag.attribute("src", audioLocation);
						}
						
						return TagName.audio.create(sourceTag, "Your browser does not support the audio element").attribute("controls", true);
					}
					
				};
			}			
		}; 
				
		Appearance appearance = textToSpeech.getAppearance();
		if (appearance == null) {
			return audioSupplier;
		}
		
		return audioSupplier.then(appearance.create(context).asFunction()).then(bs -> new ViewPart() {
	
			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				return bs.getFirst().then(bs.getSecond());
			}
			
		});
	}
		
}
