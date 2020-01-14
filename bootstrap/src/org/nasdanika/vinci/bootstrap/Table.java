/**
 */
package org.nasdanika.vinci.bootstrap;

import org.nasdanika.common.SupplierFactory;
import org.nasdanika.html.app.ViewPart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [Bootstrap table](https://getbootstrap.com/docs/4.0/content/tables/)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Table#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Table#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Table#getFooter <em>Footer</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTable()
 * @model superTypes="org.nasdanika.vinci.bootstrap.TableRowContainer org.nasdanika.ncore.ISupplierFactory&lt;org.nasdanika.vinci.html.ViewPart&gt; org.nasdanika.vinci.bootstrap.TableConfiguration"
 * @generated
 */
public interface Table extends TableRowContainer, SupplierFactory<ViewPart>, TableConfiguration {

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Table header.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(TableHeader)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTable_Header()
	 * @model containment="true"
	 * @generated
	 */
	TableHeader getHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Table#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(TableHeader value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Table body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(TableSection)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTable_Body()
	 * @model containment="true"
	 * @generated
	 */
	TableSection getBody();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Table#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(TableSection value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Table footer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference.
	 * @see #setFooter(TableSection)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTable_Footer()
	 * @model containment="true"
	 * @generated
	 */
	TableSection getFooter();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Table#getFooter <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' containment reference.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(TableSection value);
} // Table
