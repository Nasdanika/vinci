package org.nasdanika.vinci.html.gen;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.html.Container;

/**
 * Base class for adapters for subclasses of {@link Container}. 
 * @author Pavel
 *
 * @param <T>
 */
public abstract class ContainerAdapter<T extends Container> {
	
	protected T target;

	protected ContainerAdapter(T target) {
		this.target = target;
	}
		
	/**
	 * Creates a compound supplier factory with markdown content supplier factory first, if markdown content is not blank, and the rest of the content following.
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected SupplierFactory<List<ViewPart>> createContentSupplierFactory() throws NasdanikaException {
		ListCompoundSupplierFactory<ViewPart> contentSupplierFactory = new ListCompoundSupplierFactory<>("Content");
				
		String markdown = target.getMarkdownContent();
		if (!Util.isBlank(markdown)) {
			SupplierFactory<ViewPart> markdownSupplierFactory = SupplierFactory.from((context, progressMonidor) -> {
				return ViewPart.fromValue(context.interpolate(MarkdownHelper.INSTANCE.markdownToHtml(markdown).trim()));				
			},  "Markdown content", 1);
						
			contentSupplierFactory.add(markdownSupplierFactory);
		}
		
		FunctionFactory<Object,ViewPart> wrapper = new FunctionFactory<Object, ViewPart>() {
			
			@Override
			public Function<Object, ViewPart> create(Context arg) throws Exception {
				return Function.fromBiFunction((o,pm) -> ViewPart.fromValue(o), "Wrapper", 1);
			}
			
		};
				
		for (EObject content: target.getContent()) {
			SupplierFactory<Object> sf = EObjectAdaptable.adaptTo(content, SupplierFactory.class);
			if (sf == null) {
				throw new NasdanikaException("Cannot adapt " + content + " to " + SupplierFactory.class);
			}
			contentSupplierFactory.add(sf.then(wrapper));
		}
		
		return contentSupplierFactory;
	}
	
}
