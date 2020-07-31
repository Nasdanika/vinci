package org.nasdanika.vinci.app.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.app.ActionLink;
import org.nasdanika.vinci.app.Widget;
import org.nasdanika.vinci.html.gen.ContainerAdapter;

/**
 * Adapts {@link ActionLink} to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public class WidgetSupplierFactory extends ContainerAdapter<Widget> implements SupplierFactory<ViewPart> {
	
	public WidgetSupplierFactory(Widget widget) {
		super(widget);
	}
	
	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		return createContentSupplierFactory().create(context).then(content -> {
			return new ViewPart() {

				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					 Fragment fragment = viewGenerator.get(HTMLFactory.class).fragment();
					for (ViewPart viewPart: content) {
						fragment.accept(viewGenerator.processViewPart(viewPart, progressMonitor));
					}
					return fragment;
				}
				
			};
		});
	}
	
}
