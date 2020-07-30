package org.nasdanika.vinci.components.gen;

import java.util.Base64;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.html.Tag;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.components.Image;

/**
 * Adapts {@link Image} to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public class ImageSupplierFactory implements SupplierFactory<ViewPart> {
	
	private Image image;

	public ImageSupplierFactory(Image image) {
		this.image = image;
	}

	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		
		String caption = context.interpolate(image.getCaption());
		
		Supplier<ViewPart> imageSupplier = Supplier.fromCallable(() -> new ViewPart() {

			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				Tag imageTag = TagName.img.create();
				
				byte[] content = image.getContent();
				if (content != null) {
					imageTag.attribute("src", "data:image/png;base64, " + Base64.getEncoder().encodeToString(content));
				}
				
				String height = context.interpolate(image.getHeight());
				if (!Util.isBlank(height)) {
					imageTag.attribute("height", height);
				}
				
				String width = context.interpolate(image.getWidth());
				if (!Util.isBlank(width)) {
					imageTag.attribute("width", width);
				}
												
				// TODO - image map support and navigation to target.
				
				if (Util.isBlank(caption)) {				
					return imageTag;
				}
				
				return TagName.figure.create(imageTag, TagName.figcaption.create(caption));
			}
			
		}, image.getTitle(), 1);
		
		Appearance appearance = image.getAppearance();
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
		
}
