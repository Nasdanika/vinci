package org.nasdanika.vinci.components.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.app.viewparts.TableOfContentsViewPart;
import org.nasdanika.vinci.components.ListOfContents;
import org.nasdanika.vinci.components.TableOfContents;

/**
 * Adapts {@link ListOfContents} to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public class TableOfContentsSupplierFactory<T extends TableOfContents> extends TableOfContentsBaseSupplierFactory<T> {
	
	public TableOfContentsSupplierFactory(T tableOfContents) {
		super(tableOfContents);
	}
	
	@Override
	protected Supplier<ViewPart> createTableOfContents(Context context) throws Exception {
		TableOfContentsViewPart tableOfContentsViewPart = new TableOfContentsViewPart(
				"Section".equals(tableOfContents.getRole()) ? Action.Role.SECTION : Action.Role.NAVIGATION, 
				context.interpolateToString(tableOfContents.getHeader()), 
				tableOfContents.isDescriptions(), 
				tableOfContents.isTooltips(),
				tableOfContents.getDepth());
		
		tableOfContentsViewPart.setBordered(tableOfContents.isBordered());
		tableOfContentsViewPart.setBorderless(tableOfContents.isBorderless());
		tableOfContentsViewPart.setDark(tableOfContents.isDark());
		tableOfContentsViewPart.setHover(tableOfContents.isHover());
		tableOfContentsViewPart.setSmall(tableOfContents.isSmall());
		tableOfContentsViewPart.setStriped(tableOfContents.isStriped());
		
		return Supplier.from(tableOfContentsViewPart, tableOfContents.getTitle());
	}
	
}
