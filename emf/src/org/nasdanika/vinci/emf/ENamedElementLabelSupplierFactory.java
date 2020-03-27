package org.nasdanika.vinci.emf;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.emf.AnnotationSource;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.app.impl.Util;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.vinci.app.Label;
import org.nasdanika.vinci.app.LabelSupplierFactory;


/**
 * Base class for labels and actions representing {@link ENamedElement}s. 
 * This class implements getText() method by splitting element name by camel case, capitalizing the first word and lower-casing the rest.
 * It also implements getDescription() and getTooltip() (TODO).
 * @author Pavel Vlasov
 *
 */
public abstract class ENamedElementLabelSupplierFactory<T extends ENamedElement, R extends Label> extends AnnotationSource<T> implements LabelSupplierFactory<R> {
	
	@Override
	public Supplier<R> create(Context context) throws Exception {
		return new Supplier<R>() {
			
			@Override
			public double size() {
				return 1;
			}
			
			@Override
			public String name() {
				return "Label supplier";
			}
			
			@Override
			public R execute(ProgressMonitor progressMonitor) throws Exception {
				R ret = create(context, progressMonitor);
				configure(ret, context, progressMonitor);
				return ret;
			}
		};
	}
	
	/**
	 * Creates a new instance of Label subtype.
	 * @param context
	 * @param monitor
	 * @return
	 */
	protected abstract R create(Context context, ProgressMonitor monitor);
	
	protected void configure(R label, Context context, ProgressMonitor monitor) {
		String text = EObjectAdaptable.getResourceContext(modelElement).getString("label");
		label.setText(text == null ? nameToLabel() : text);
		
		String icon = getAnnotation("icon");
		if (!Util.isBlank(icon)) {
			label.setIcon(icon);		
		}
		
		String markdown = EObjectAdaptable.getResourceContext(modelElement).getString("documentation", EcoreUtil.getDocumentation(modelElement));

		if (!Util.isBlank(markdown)) {
			label.setDescription(HTMLFactory.INSTANCE.div(markdownToHtml(markdown)).addClass("markdown-body").toString());				
			label.setTooltip(firstSentence(label.getDescription()));
		}

		String ca = getAnnotation("color");
		if (ca != null) {
			label.setColor(Color.valueOf(ca.trim()).label);
		}

		String outlineAnnotation = getAnnotation("outline");
		label.setOutline(outlineAnnotation != null && "true".equals(outlineAnnotation.trim()));
	}
	
	public ENamedElementLabelSupplierFactory(T eNamedElement) {
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
