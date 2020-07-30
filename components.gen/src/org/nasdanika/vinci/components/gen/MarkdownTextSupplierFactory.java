package org.nasdanika.vinci.components.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.vinci.components.MarkdownText;

/**
 * Adapts {@link MarkdownText} to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public class MarkdownTextSupplierFactory extends MarkdownSupplierFactory<MarkdownText> {
	
	public MarkdownTextSupplierFactory(MarkdownText markdownText) {
		super(markdownText);
	}
	
	@Override
	protected String getMarkdown(Context context) {
		return markdownComponent.getMarkdown();
	}
	
}
