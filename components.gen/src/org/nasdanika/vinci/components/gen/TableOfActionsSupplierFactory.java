package org.nasdanika.vinci.components.gen;

import java.util.ArrayList;
import java.util.List;

import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.app.viewparts.TableOfActionsViewPart;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.components.ListOfContents;
import org.nasdanika.vinci.components.TableOfActions;

/**
 * Adapts {@link ListOfContents} to {@link SupplierFactory} in order to generate HTML anchor.
 * @author Pavel
 *
 */
public class TableOfActionsSupplierFactory extends TableOfContentsBaseSupplierFactory<TableOfActions> {
	
	public TableOfActionsSupplierFactory(TableOfActions tableOfActions) {
		super(tableOfActions);
	}
	
	@Override
	protected Supplier<ViewPart> createTableOfContents(Context context) throws Exception {
		List<String> actionIds= new ArrayList<>();
		for (AbstractAction action: tableOfContents.getActions()) {
			String id = ActionLinkSupplierFactory.unwrap(action).getId();
			if (Util.isBlank(id)) {
				throw new IllegalStateException("Action has no ID. Refernced actions must have unique id's");
			}
			actionIds.add(id);
		}
		
		TableOfActionsViewPart tableOfActionsViewPart = new TableOfActionsViewPart(
				actionIds, 
				context.interpolateToString(tableOfContents.getHeader()), 
				tableOfContents.isDescriptions(), 
				tableOfContents.isTooltips(),
				tableOfContents.getDepth());
		
		tableOfActionsViewPart.setBordered(tableOfContents.isBordered());
		tableOfActionsViewPart.setBorderless(tableOfContents.isBorderless());
		tableOfActionsViewPart.setDark(tableOfContents.isDark());
		tableOfActionsViewPart.setHover(tableOfContents.isHover());
		tableOfActionsViewPart.setSmall(tableOfContents.isSmall());
		tableOfActionsViewPart.setStriped(tableOfContents.isStriped());
		
		return Supplier.from(tableOfActionsViewPart, tableOfContents.getTitle());
	}
	
}
