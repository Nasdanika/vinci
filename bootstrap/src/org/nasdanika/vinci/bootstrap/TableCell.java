/**
 */
package org.nasdanika.vinci.bootstrap;

import org.nasdanika.common.ConsumerFactory;

import org.nasdanika.vinci.html.Container;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.TableCell#isHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.TableCell#getColSpan <em>Col Span</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.TableCell#getRowSpan <em>Row Span</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.TableCell#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.TableCell#getBackground <em>Background</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.TableCell#getMarkdownContent <em>Markdown Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTableCell()
 * @model superTypes="org.nasdanika.vinci.html.Container org.nasdanika.vinci.bootstrap.BootstrapElement org.nasdanika.ncore.IConsumerFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;"
 * @generated
 */
public interface TableCell extends Container, BootstrapElement, ConsumerFactory<Object> {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, table cell is generated as ``<th>`` instead of the default ``<td>``.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTableCell_Header()
	 * @model
	 * @generated
	 */
	boolean isHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.TableCell#isHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #isHeader()
	 * @generated
	 */
	void setHeader(boolean value);

	/**
	 * Returns the value of the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Span</em>' attribute.
	 * @see #setColSpan(int)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTableCell_ColSpan()
	 * @model
	 * @generated
	 */
	int getColSpan();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.TableCell#getColSpan <em>Col Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Span</em>' attribute.
	 * @see #getColSpan()
	 * @generated
	 */
	void setColSpan(int value);

	/**
	 * Returns the value of the '<em><b>Row Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Span</em>' attribute.
	 * @see #setRowSpan(int)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTableCell_RowSpan()
	 * @model
	 * @generated
	 */
	int getRowSpan();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.TableCell#getRowSpan <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Span</em>' attribute.
	 * @see #getRowSpan()
	 * @generated
	 */
	void setRowSpan(int value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTableCell_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.TableCell#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(String)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTableCell_Background()
	 * @model
	 * @generated
	 */
	String getBackground();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.TableCell#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(String value);

	/**
	 * Returns the value of the '<em><b>Markdown Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this attribute is not blank it is used as the first content element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Markdown Content</em>' attribute.
	 * @see #setMarkdownContent(String)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTableCell_MarkdownContent()
	 * @model
	 * @generated
	 */
	String getMarkdownContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.TableCell#getMarkdownContent <em>Markdown Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Markdown Content</em>' attribute.
	 * @see #getMarkdownContent()
	 * @generated
	 */
	void setMarkdownContent(String value);

} // TableCell
