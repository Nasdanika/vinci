package org.nasdanika.vinci.emf;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Supplier;
import org.nasdanika.vinci.app.Action;

/**
 * Supplier of "view" (as opposed to "edit") actions. This interface is used to adapt
 * {@link EObject}'s to in order to generate action model from some other model.
 * @author Pavel Vlasov
 *
 */
public interface ViewActionSupplier extends Supplier<Action> {
	
}
