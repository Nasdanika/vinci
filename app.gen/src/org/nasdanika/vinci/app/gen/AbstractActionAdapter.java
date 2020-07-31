package org.nasdanika.vinci.app.gen;

import org.nasdanika.ncore.gen.ConfigurableAdapter;
import org.nasdanika.vinci.app.AbstractAction;

/**
 * Base class for adapters for subclasses of {@link AbstractAction}. 
 * @author Pavel
 *
 * @param <T>
 */
public abstract class AbstractActionAdapter<T extends AbstractAction> extends ConfigurableAdapter<T> {
	
	protected AbstractActionAdapter(T target) {
		super(target);
	}
	
}
