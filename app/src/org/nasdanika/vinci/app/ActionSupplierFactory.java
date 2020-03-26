package org.nasdanika.vinci.app;

import org.eclipse.emf.ecore.EObject;

/**
 * Specialization of {@link LabelSupplierFactory}. {@link EObject}'s which can be used as sources for {@link Action} generation
 * can be adapted to this interface. 
 * @author Pavel
 *
 */
public interface ActionSupplierFactory extends LabelSupplierFactory<Action> {

}
