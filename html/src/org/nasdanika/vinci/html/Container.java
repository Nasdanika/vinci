/**
 */
package org.nasdanika.vinci.html;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.ncore.NcoreFactory;
import org.nasdanika.ncore.Value;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container of content such as text and HTML markup.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.html.Container#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.vinci.html.Container#getMarkdownContent <em>Markdown Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.html.HtmlPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container content. 
	 * 
	 * Content elements are adapted to ${javadoc/org.nasdanika.common.SupplierFactory} for generation of HTML content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.nasdanika.vinci.html.HtmlPackage#getContainer_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getContent();

	/**
	 * Returns the value of the '<em><b>Markdown Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [Markdown](https://en.wikipedia.org/wiki/Markdown) text. If this attribute contains text, the text is converted to HTML, interpolated and used as the first content element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Markdown Content</em>' attribute.
	 * @see #setMarkdownContent(String)
	 * @see org.nasdanika.vinci.html.HtmlPackage#getContainer_MarkdownContent()
	 * @model annotation="urn:org.nasdanika content-type='text/markdown'"
	 * @generated
	 */
	String getMarkdownContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.html.Container#getMarkdownContent <em>Markdown Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Markdown Content</em>' attribute.
	 * @see #getMarkdownContent()
	 * @generated
	 */
	void setMarkdownContent(String value);
	
	static SupplierFactory<List<ViewPart>> wrap(List<SupplierFactory<Object>> objectsSupplierFactory) {
		ListCompoundSupplierFactory<ViewPart> contentSupplierFactory = new ListCompoundSupplierFactory<>("Content");
				
		FunctionFactory<Object,ViewPart> wrapper = new FunctionFactory<Object, ViewPart>() {
			
			@Override
			public Function<Object, ViewPart> create(Context arg) throws Exception {
				return Function.fromBiFunction((o,pm) -> ViewPart.fromValue(o), "Wrapper", 1);
			}
			
		};
				
		for (SupplierFactory<Object> content: objectsSupplierFactory) {
			contentSupplierFactory.add(content.then(wrapper));
		}
		
		return contentSupplierFactory;
		
	}
	
	/**
	 * Creates a compound supplier factory with markdown content supplier factory first, if markdown content is not blank, and the rest of the content following.
	 * @return
	 */
	@SuppressWarnings("unchecked")
	default SupplierFactory<List<ViewPart>> createContentSupplierFactory() throws NasdanikaException {
		ListCompoundSupplierFactory<ViewPart> contentSupplierFactory = new ListCompoundSupplierFactory<>("Content");
				
		String markdown = getMarkdownContent();
		if (!Util.isBlank(markdown)) {
			SupplierFactory<ViewPart> markdownSupplierFactory = SupplierFactory.from((context, progressMonidor) -> {
				return ViewPart.fromValue(context.interpolate(MarkdownHelper.INSTANCE.markdownToHtml(markdown).trim()));				
			},  "Markdown content", 1);
						
			contentSupplierFactory.add(markdownSupplierFactory);
		}
		
		FunctionFactory<Object,ViewPart> wrapper = new FunctionFactory<Object, ViewPart>() {
			
			@Override
			public Function<Object, ViewPart> create(Context arg) throws Exception {
				return Function.fromBiFunction((o,pm) -> ViewPart.fromValue(o), "Wrapper", 1);
			}
			
		};
				
		for (EObject content: getContent()) {
			SupplierFactory<Object> sf = EObjectAdaptable.adaptTo(content, SupplierFactory.class);
			if (sf == null) {
				throw new NasdanikaException("Cannot adapt " + content + " to " + SupplierFactory.class);
			}
			contentSupplierFactory.add(sf.then(wrapper));
		}
		
		return contentSupplierFactory;
	}
	
	/**
	 * Convenience method for adding content as {@link Value}
	 * @param content
	 */
	default void addContent(String content) {
		if (!Util.isBlank(content)) {
			Value value = NcoreFactory.eINSTANCE.createValue();
			value.setValue(content);
			getContent().add(value);
		}		
	}	

} // Container
