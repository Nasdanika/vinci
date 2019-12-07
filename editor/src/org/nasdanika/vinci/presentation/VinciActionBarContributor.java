package org.nasdanika.vinci.presentation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.presentation.NasdanikaActionBarContributor;
import org.nasdanika.vinci.bootstrap.BootstrapPage;

/**
 * Contributes generate actions.
 * @author Pavel
 *
 */
public class VinciActionBarContributor extends NasdanikaActionBarContributor {

	protected IMenuManager generateMenuManager;
	
	protected Map<String, Object> generateActions;	

	@Override
	public void contributeToSubMenu(IMenuManager submenuManager) {
//		super.contributeToSubMenu(submenuManager);

		generateMenuManager = new MenuManager(VinciEditorPlugin.INSTANCE.getString("_UI_Generate_menu_item"));
		submenuManager.insertBefore("additions", generateMenuManager);
	}
	
	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		super.selectionChanged(event);
		// Remove any menu items for old selection.
		//
		if (generateMenuManager != null) {
			depopulateManager(generateMenuManager, generateActions);
		}

		ISelection selection = event.getSelection();
		if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() == 1) {
			Object object = ((IStructuredSelection) selection).getFirstElement();
			generateActions = groupActions(createGenerateActions(object));
		} else {
			generateActions = Collections.emptyMap();
		}

		if (generateMenuManager != null) {
			populateManager(generateMenuManager, generateActions, null);
			generateMenuManager.update(true);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected Collection<IAction> createGenerateActions(Object selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (selection instanceof EObject && ((EObject) selection).eContainer() == null) {
			if (selection instanceof BootstrapPage) {
				BootstrapPage page = (BootstrapPage) selection;
				if (!page.getBuilders().isEmpty()) {
					actions.add(new GenerateApplicationAction<BootstrapPage>("Application", page));
				}
				actions.add(new GenerateContentAction("Content", (EObject) selection));			
			} else if (selection instanceof SupplierFactory) {
				actions.add(new GenerateContentAction("Content", (EObject) selection));			
				actions.add(new GenerateBootstrapPageAction("Bootstrap page", (EObject) selection));			
			}
		}
		return actions;
	}	
	
	@Override
	public void menuAboutToShow(IMenuManager menuManager) {
		super.menuAboutToShow(menuManager);
		MenuManager submenuManager = null;

		submenuManager = new MenuManager(VinciEditorPlugin.INSTANCE.getString("_UI_Generate_menu_item"));
		populateManager(submenuManager, generateActions, null);
		menuManager.insertBefore("edit", submenuManager);
	}
	

}
