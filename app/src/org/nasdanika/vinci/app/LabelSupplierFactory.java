package org.nasdanika.vinci.app;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.SupplierFactory;

/**
 * Specialization of {@link SupplierFactory}. {@link EObject}'s which can be used as sources for {@link Label} generation
 * can be adapted to this interface. 
 * @author Pavel
 *
 */
public interface LabelSupplierFactory<T extends Label> extends SupplierFactory<T> {

}
