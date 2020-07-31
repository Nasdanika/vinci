package org.nasdanika.vinci.presentation;

import java.io.InputStream;
import java.util.function.BiFunction;

import org.eclipse.core.runtime.ILog;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.Util;
import org.nasdanika.emf.presentation.NasdanikaGenerateAction;
import org.nasdanika.ncore.ModelElement;

/**
 * Base class for vinci generation actions.
 * @author Pavel Vlasov
 *
 */
public abstract class VinciGenerateAction<T extends EObject> extends NasdanikaGenerateAction<T> {

	public static BiFunction<String, Object, InputStream> ENCODER = (path, contents) -> {
		InputStream ret = DefaultConverter.INSTANCE.convert(contents, InputStream.class);
		if (ret == null) {
			// toString() conversion
			ret = DefaultConverter.INSTANCE.convert(String.valueOf(contents), InputStream.class);
		}
		return ret;
	};
		
	public VinciGenerateAction(String name, T modelElement, AdapterFactory adapterFactory) {
		super(name, modelElement, adapterFactory);
	}
	
	@Override
	protected String getLabel(EObject eObject) {
		String label = super.getLabel(eObject);
		if (!Util.isBlank(label)) {
			return label;
		}
		if (eObject instanceof ModelElement) {
			return "[" + eObject.eClass().getName() + "] " + ((ModelElement) eObject).getTitle();
		}
		return "[" + eObject.eClass().getName() + "] " +eObject.toString();
	}
	
	@Override
	protected ILog getLog() {
		return VinciEditorPlugin.getPlugin().getLog();
	}
	
}
