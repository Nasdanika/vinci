package org.nasdanika.vinci.emf;

import org.eclipse.emf.ecore.EObject;

/**
 * Supplier of "edit" (as opposed to "view") actions. This interface is used to adapt
 * {@link EObject}'s to in order to generate action model from some other model.
 * @author Pavel Vlasov
 *
 */
public interface EditActionSupplier extends ActionSupplier {
		
}
