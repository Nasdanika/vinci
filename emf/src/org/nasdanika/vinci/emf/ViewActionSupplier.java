package org.nasdanika.vinci.emf;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.ProgressMonitor;

/**
 * Supplier of "view" (as opposed to "edit") actions. This interface is used to adapt
 * {@link EObject}'s to in order to generate action model from some other model.
 * @author Pavel Vlasov
 *
 */
public interface ViewActionSupplier extends ActionSupplier  {
	
	/**
	 * Configures action, e.g. establishes cross-references.
	 * @param monitor
	 * @throws Exception
	 */
	void configure(ProgressMonitor monitor) throws Exception;
	
}
