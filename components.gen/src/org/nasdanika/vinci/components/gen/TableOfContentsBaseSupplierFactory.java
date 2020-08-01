package org.nasdanika.vinci.components.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.components.TableOfContentsBase;

/**
 * Adapts {@link TableOfContentsBase} to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public abstract class TableOfContentsBaseSupplierFactory<T extends TableOfContentsBase> implements SupplierFactory<ViewPart> {
	
	protected T tableOfContents;

	protected TableOfContentsBaseSupplierFactory(T tableOfContents) {
		this.tableOfContents = tableOfContents;
	}
	
	protected abstract Supplier<ViewPart> createTableOfContents(Context context) throws Exception;	
	
	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		Supplier<ViewPart> ret = createTableOfContents(context);
				
		if (ret == null) {
			return ret;
		}
		
		Appearance appearance = tableOfContents.getAppearance();
		if (appearance == null) {
			return ret;
		}
		
		return ret.then(EObjectAdaptable.adaptToSupplierFactory(appearance,ViewBuilder.class).create(context).asFunction()).then(bs -> new ViewPart() {

			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {				
				return bs.getFirst().then(bs.getSecond());
			}
			
		});
		
	}
		
}
