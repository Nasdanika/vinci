/**
 */
package org.nasdanika.vinci.html;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;

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
 *   <li>{@link org.nasdanika.vinci.html.Container#getHtmlContent <em>Html Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.html.HtmlPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.common.SupplierFactory}<code>&lt;java.lang.Object&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.nasdanika.vinci.html.HtmlPackage#getContainer_Content()
	 * @model type="org.nasdanika.ncore.ISupplierFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;" containment="true"
	 * @generated
	 */
	EList<SupplierFactory<Object>> getContent();

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
	 * @model
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
	
	/**
	 * Returns the value of the '<em><b>Html Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTML text, interpolated and used as the first content element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Html Content</em>' attribute.
	 * @see #setHtmlContent(String)
	 * @see org.nasdanika.vinci.html.HtmlPackage#getContainer_HtmlContent()
	 * @model annotation="urn:org.nasdanika content-type='text/html'"
	 * @generated
	 */
	String getHtmlContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.html.Container#getHtmlContent <em>Html Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html Content</em>' attribute.
	 * @see #getHtmlContent()
	 * @generated
	 */
	void setHtmlContent(String value);

	/**
	 * Creates a compound supplier factory with markdown content supplier factory first, if markdown content is not blank, and the rest of the content following.
	 * @return
	 */
	default SupplierFactory<List<Object>> createContentSupplierFactory() {
		ListCompoundSupplierFactory<Object> contentSupplierFactory = new ListCompoundSupplierFactory<Object>("Content");
				
		String markdown = getMarkdownContent();
		if (!Util.isBlank(markdown)) {
			SupplierFactory<Object> markdownSupplierFactory = SupplierFactory.from((context, progressMonidor) -> {
				MarkdownHelper markdownHelper = new MarkdownHelper();
				return context.interpolate(markdownHelper.markdownToHtml(markdown).trim());				
			},  "Markdown content", 1);
						
			contentSupplierFactory.add(markdownSupplierFactory);
		}
				
		String html = getHtmlContent();
		if (!Util.isBlank(html)) {
			SupplierFactory<Object> htmlSupplierFactory = SupplierFactory.from((ctx, progressMonidor) -> {
				return ctx.interpolate(html);				
			},  "HTML content", 1);
			contentSupplierFactory.add(htmlSupplierFactory);
		}		
				
		for (SupplierFactory<Object> content: getContent()) {
			contentSupplierFactory.add(content);
		}
		
		return contentSupplierFactory;
	}

} // Container
