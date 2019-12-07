package org.nasdanika.vinci.presentation;

import java.io.InputStream;
import java.util.function.BiFunction;

import org.eclipse.core.runtime.ILog;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.presentation.NasdanikaGenerateAction;
import org.nasdanika.ncore.ModelElement;

/**
 * Base class for vinci generation actions.
 * @author Pavel Vlasov
 *
 */
public abstract class VinciGenerateAction<T extends EObject & SupplierFactory<Object>> extends NasdanikaGenerateAction<T> {

	public static BiFunction<String, Object, InputStream> ENCODER = (path, contents) -> {
		InputStream ret = DefaultConverter.INSTANCE.convert(contents, InputStream.class);
		if (ret == null) {
			// toString() conversion
			ret = DefaultConverter.INSTANCE.convert(String.valueOf(contents), InputStream.class);
		}
		return ret;
	};
		
	public VinciGenerateAction(String name, T modelElement) {
		super(name, modelElement);
	}
	
	@Override
	protected String getLabel(EObject eObject) {
		return eObject instanceof ModelElement ? ((ModelElement) eObject).getTitle() : null;
	}
	
	@Override
	protected ILog getLog() {
		return VinciEditorPlugin.getPlugin().getLog();
	}
	
}
