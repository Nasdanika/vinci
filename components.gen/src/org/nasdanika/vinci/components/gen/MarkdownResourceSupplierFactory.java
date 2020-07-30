package org.nasdanika.vinci.components.gen;

import java.net.URL;

import org.nasdanika.common.Context;
import org.nasdanika.common.Converter;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.vinci.components.MarkdownResource;

/**
 * Adapts {@link MarkdownResource} to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public class MarkdownResourceSupplierFactory extends MarkdownSupplierFactory<MarkdownResource> {
	
	public MarkdownResourceSupplierFactory(MarkdownResource markdownResource) {
		super(markdownResource);
	}
	
	@Override
	protected String getMarkdown(Context context) throws Exception {
		URL url = EmfUtil.resolveReference(markdownComponent.eResource(), context.interpolate(markdownComponent.getLocation()));
		if (url == null) {
			throw new IllegalArgumentException("Resource does not exist");
		}
		Converter converter = context.get(Converter.class, DefaultConverter.INSTANCE);
		return converter.convert(url, String.class);
	}	
	
}
