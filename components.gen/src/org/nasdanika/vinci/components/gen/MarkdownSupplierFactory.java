package org.nasdanika.vinci.components.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.components.Markdown;

/**
 * Adapts {@link Markdown} to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public abstract class MarkdownSupplierFactory<T extends Markdown> implements SupplierFactory<ViewPart> {
	
	protected T markdownComponent;

	protected MarkdownSupplierFactory(T markdownComponent) {
		this.markdownComponent = markdownComponent;
	}
		
	protected abstract String getMarkdown(Context context) throws Exception;
	
	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		
		String markdown = getMarkdown(context);
		if (Util.isBlank(markdown)) {
			return Supplier.empty();
		}
		
		String[] html = { context.get(MarkdownHelper.class).markdownToHtml(markdown).trim() };
		if (markdownComponent.isInterpolate()) {
			html[0] = context.interpolateToString(html[0]);
		}		
		
		Supplier<ViewPart> markdownSupplier = Supplier.fromCallable(() -> new ViewPart() {

			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				// Double interpolation for mapping expansion
				if (markdownComponent.isInterpolate()) {
					html[0] = viewGenerator.interpolateToString(html[0]);
				}		
				
				if (!markdownComponent.isStyle()) {
					return html[0];
				}
				return viewGenerator.get(HTMLFactory.class).div(html[0]).addClass("markdown-body");
			}
			
		}, markdownComponent.getTitle(), 1);
		
		Appearance appearance = markdownComponent.getAppearance();
		if (appearance == null) {
			return markdownSupplier;
		}
		
		return markdownSupplier.then(EObjectAdaptable.adaptToSupplierFactory(appearance,ViewBuilder.class).create(context).asFunction()).then(bs -> new ViewPart() {

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
		
}
