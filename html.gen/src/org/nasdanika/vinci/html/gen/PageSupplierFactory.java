package org.nasdanika.vinci.html.gen;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.StringMapCompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLPage;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewBuilder.Supplier.Factory;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;
import org.nasdanika.html.fontawesome.FontAwesomeFactory;
import org.nasdanika.html.jstree.JsTreeFactory;
import org.nasdanika.vinci.html.Page;

public class PageSupplierFactory<T extends Page> implements SupplierFactory<Object> {
	private static final String LINE_AWESOME_CSS_CDN = "https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css";
	
	protected T target;
	
	public PageSupplierFactory(T target) {
		this.target = target;
	}
	
	/**
	 * Override in sub-classes to create a specialized page.
	 * @param context
	 * @return
	 */
	protected HTMLPage createPage(Context context) {
		return context.get(HTMLFactory.class, HTMLFactory.INSTANCE).page();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Supplier<Object> create(Context context) throws Exception {
		StringMapCompoundSupplier<List<Object>> partsSupplier = new StringMapCompoundSupplier<>(target.getTitle());
		partsSupplier.put(new ListCompoundSupplierFactory<Object>("Head", EObjectAdaptable.adaptToSupplierFactory(target.getHead(), Object.class)).create(context));
		partsSupplier.put(new ListCompoundSupplierFactory<Object>("Body", EObjectAdaptable.adaptToSupplierFactory(target.getBody(), Object.class)).create(context));
		
		Function<Map<String,List<Object>>,Object[]> pageFactory = Function.fromBiFunction((parts, progressMonitor) -> {
			HTMLPage page = createPage(context);
			ViewGenerator viewGenerator = new ViewGeneratorImpl(context, page::head, page::body);
			
			List<Object> head = parts.get("Head");
			if (head != null) {
				for (Object hp: head) {
					page.head(viewGenerator.processViewPart(hp, progressMonitor));
				}
				
				for (Object bp: parts.get("Body")) {
					page.body(viewGenerator.processViewPart(bp, progressMonitor));
				}

				String name = context.interpolate(target.getName());
				if (!Util.isBlank(name)) {
					page.title(name);
				}
				
				if (target.isFontAwesome()) {
					context.get(FontAwesomeFactory.class, FontAwesomeFactory.INSTANCE).cdn(page);
				}
				
				if (target.isLineAwesome()) {
					page.stylesheet(LINE_AWESOME_CSS_CDN);
				}
				
				if (target.isJsTree()) {
					context.get(JsTreeFactory.class, JsTreeFactory.INSTANCE).cdn(page);
				}
				
				if (target.isGithubMarkdownCss()) {
					page.stylesheet(MarkdownHelper.GITHUB_MARKDOWN_CSS_CDN);
				}
				
				if (target.isHighlightJs()) {
					page.stylesheet(MarkdownHelper.HIGHLIGHT_JS_CSS_CDN);
					page.script(MarkdownHelper.HIGHLIGHT_JS_SCRIPT_CDN);
					page.head(context.get(HTMLFactory.class, HTMLFactory.INSTANCE).tag(TagName.script, MarkdownHelper.HIGHLIGHT_JS_INIT_SCRIPT));
				}				
				
			}
			
			return new Object[] {page, viewGenerator};
			
		}, "Page builder", 1);
		
		Supplier<Object[]> pageSupplier = partsSupplier.then(pageFactory);
		
		@SuppressWarnings("resource")
		StringMapCompoundSupplier<Object> combiner = new StringMapCompoundSupplier<Object>(target.getTitle());		
		combiner.put("Page", (Supplier) pageSupplier);
		
		ListCompoundSupplierFactory<ViewBuilder> buildersFactory = new ListCompoundSupplierFactory<ViewBuilder>("Builders");
		for (EObject builder: target.getBuilders()) {
			Factory bsf = EObjectAdaptable.adaptToNonNull(builder, ViewBuilder.Supplier.Factory.class);
			buildersFactory.add(bsf);
		}
		Supplier<List<ViewBuilder>> buildersSupplier = buildersFactory.create(context);
		combiner.put("Builders", (Supplier) buildersSupplier);
		
		Function<Map<String, Object>, Object> pageBuilder = Function.fromBiFunction((map, progressMonitor) -> {
			
			Object[] pageAndGenerator = ((Object[]) map.get("Page"));
			for (ViewBuilder builder: (List<ViewBuilder>) map.get("Builders")) {
				builder.build(pageAndGenerator[0], (ViewGenerator) pageAndGenerator[1], progressMonitor);
			}
			return (HTMLPage) pageAndGenerator[0];
			
		}, target.getTitle(), 1);
		
		return combiner.then(pageBuilder);
	}
	
	
}
