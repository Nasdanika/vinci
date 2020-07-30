package org.nasdanika.vinci.html.gen;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.html.Container;

public class ContainerSupplierFactory implements SupplierFactory<Object> {
	
	private Container container;

	public ContainerSupplierFactory(Container container) {
		this.container = container;
	}

	@Override
	public Supplier<Object> create(Context context) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
		
//	/**
//	 * Creates a compound supplier factory with markdown content supplier factory first, if markdown content is not blank, and the rest of the content following.
//	 * @return
//	 */
//	@SuppressWarnings("unchecked")
//	public SupplierFactory<List<ViewPart>> createContentSupplierFactory() throws NasdanikaException {
//		ListCompoundSupplierFactory<ViewPart> contentSupplierFactory = new ListCompoundSupplierFactory<>("Content");
//				
//		String markdown = container.getMarkdownContent();
//		if (!Util.isBlank(markdown)) {
//			SupplierFactory<ViewPart> markdownSupplierFactory = SupplierFactory.from((context, progressMonidor) -> {
//				return ViewPart.fromValue(context.interpolate(MarkdownHelper.INSTANCE.markdownToHtml(markdown).trim()));				
//			},  "Markdown content", 1);
//						
//			contentSupplierFactory.add(markdownSupplierFactory);
//		}
//		
//		FunctionFactory<Object,ViewPart> wrapper = new FunctionFactory<Object, ViewPart>() {
//			
//			@Override
//			public Function<Object, ViewPart> create(Context arg) throws Exception {
//				return Function.fromBiFunction((o,pm) -> ViewPart.fromValue(o), "Wrapper", 1);
//			}
//			
//		};
//				
//		for (EObject content: container.getContent()) {
//			SupplierFactory<Object> sf = EObjectAdaptable.adaptTo(content, SupplierFactory.class);
//			if (sf == null) {
//				throw new NasdanikaException("Cannot adapt " + content + " to " + SupplierFactory.class);
//			}
//			contentSupplierFactory.add(sf.then(wrapper));
//		}
//		
//		return contentSupplierFactory;
//	}
	
}
