package org.nasdanika.vinci.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.presentation.GenerateApplicationAction;


public class GenerateApplicationExternalJavaAction implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> selection) {
		if (selection.size() == 1) {
			EObject selected = selection.iterator().next();
			if (selected instanceof DRepresentationElement) {
				EList<EObject> semanticElements = ((DRepresentationElement) selected).getSemanticElements();
				if (semanticElements.size() == 1) {
					EObject se = semanticElements.iterator().next();
					return se instanceof ActionBase && se.eContainer() == null;
				}
			}
		}
		return false;
	}

	@Override
	public void execute(Collection<? extends EObject> selection, Map<String, Object> context) {
		ActionBase action = (ActionBase) ((DRepresentationElement) selection.iterator().next()).getSemanticElements().iterator().next();
		Action generateApplicationAction = new GenerateApplicationAction<ActionBase>("Generate application", action, null);
		generateApplicationAction.run();
	}

}
