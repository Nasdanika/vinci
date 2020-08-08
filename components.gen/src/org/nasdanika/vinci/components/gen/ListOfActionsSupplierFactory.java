package org.nasdanika.vinci.components.gen;

import java.util.ArrayList;
import java.util.List;

import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.html.OrderedListType;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.app.viewparts.ListOfActionsViewPart;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.components.ListOfActions;
import org.nasdanika.vinci.components.ListOfContents;

/**
 * Adapts {@link ListOfContents} to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public class ListOfActionsSupplierFactory extends ListOfContentsSupplierFactory<ListOfActions> {
	
	public ListOfActionsSupplierFactory(ListOfActions listOfActions) {
		super(listOfActions);
	}
	
	@Override
	protected Supplier<ViewPart> createTableOfContents(Context context) throws Exception {
		List<String> actionIds = new ArrayList<>();
		for (AbstractAction action: tableOfContents.getActions()) {
			String id = ActionLinkSupplierFactory.unwrap(action).getId();
			if (Util.isBlank(id)) {
				throw new IllegalStateException("Action has no ID. Referenced actions must have unique id's");
			}
			actionIds.add(id);
		}
	
		ListOfActionsViewPart listOfContentsViewPart = new ListOfActionsViewPart(
				actionIds,
				context.interpolateToString(tableOfContents.getHeader()), 
				tableOfContents.isTooltips(), 
				tableOfContents.getDepth(), 
				Util.isBlank(tableOfContents.getOrdering()) ? null : OrderedListType.fromLabel(tableOfContents.getOrdering()));
		
		return Supplier.from(listOfContentsViewPart, tableOfContents.getTitle());
	}
	
}
