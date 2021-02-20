package org.nasdanika.vinci.emf;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.ENamedElement;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.AnnotationSource;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.impl.Util;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.vinci.app.Label;
import org.nasdanika.vinci.app.LabelSupplier;


/**
 * Base class for labels and actions representing {@link ENamedElement}s. 
 * This class implements getText() method by splitting element name by camel case, capitalizing the first word and lower-casing the rest.
 * It also implements getDescription() and getTooltip() (TODO).
 * @author Pavel Vlasov
 *
 */
public abstract class ENamedElementLabelSupplier<T extends ENamedElement, R extends Label> extends AnnotationSource<T> implements LabelSupplier<R> {
	
	protected R label;	
	
	@Override
	public synchronized R getLabel(ProgressMonitor monitor) throws Exception {
		if (label == null) {
			label = create(monitor);
			configure(monitor);
		}
		return label;
	}
	
	/**
	 * Creates a new instance of Label subtype.
	 * @param context
	 * @param monitor
	 * @return
	 */
	protected abstract R create(ProgressMonitor monitor);
	
	protected void configure(ProgressMonitor monitor) {
		Context resourceContext = EObjectAdaptable.getResourceContext(modelElement);
		String text = resourceContext.getString("label");
		label.setText(text == null ? nameToLabel() : text);
		
		String icon = getAnnotation("icon");
		if (!Util.isBlank(icon)) {
			label.setIcon(icon);		
		}

		String ca = getAnnotation("color");
		if (ca != null) {
			label.setColor(Color.valueOf(ca.trim()).label);
		}

		String outlineAnnotation = getAnnotation("outline");
		label.setOutline(outlineAnnotation != null && "true".equals(outlineAnnotation.trim()));
	}
	
	public ENamedElementLabelSupplier(T eNamedElement) {
		super(eNamedElement);
	}	

	/**
	 * Converts model element name to label text. This implementation breaks the name by camel case,
	 * capitalizes the first word and lowsercases the rest.
	 * @return
	 */
	protected String nameToLabel() {
		String[] cca = StringUtils.splitByCharacterTypeCamelCase(modelElement.getName());
		cca[0] = StringUtils.capitalize(cca[0]);
		for (int i=1; i<cca.length; ++i) {
			cca[i] = cca[i].toLowerCase();
		}
		return StringUtils.join(cca, " ");
	}
		
}
