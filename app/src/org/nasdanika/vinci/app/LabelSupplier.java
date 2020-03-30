package org.nasdanika.vinci.app;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.ProgressMonitor;

/**
 * {@link EObject}'s which can be used as sources for {@link Label} generation can be adapted to this interface. 
 * @author Pavel
 *
 */
public interface LabelSupplier<T extends Label> {
		
	T getLabel(ProgressMonitor monitor) throws Exception;

}
