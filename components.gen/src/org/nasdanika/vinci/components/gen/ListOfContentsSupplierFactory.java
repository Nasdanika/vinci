package org.nasdanika.vinci.components.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.html.OrderedListType;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.app.viewparts.ListOfContentsViewPart;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.components.ListOfContents;

/**
 * Adapts {@link ListOfContents} to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public class ListOfContentsSupplierFactory<T extends ListOfContents> extends TableOfContentsBaseSupplierFactory<T> {
	
	public ListOfContentsSupplierFactory(T listOfContents) {
		super(listOfContents);
	}
	
	@Override
	protected Supplier<ViewPart> createTableOfContents(Context context) throws Exception {
		ListOfContentsViewPart listOfContentsViewPart = new ListOfContentsViewPart(
				ActionRole.SECTION.label.equals(tableOfContents.getRole()) ? Action.Role.SECTION : Action.Role.NAVIGATION, 
				context.interpolate(tableOfContents.getHeader()), 
				tableOfContents.isTooltips(), 
				tableOfContents.getDepth(), 
				Util.isBlank(tableOfContents.getOrdering()) ? null : OrderedListType.fromLabel(tableOfContents.getOrdering()));
		
		return Supplier.from(listOfContentsViewPart, tableOfContents.getTitle());
	}
	
}
