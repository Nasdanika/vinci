/**
 */
package org.nasdanika.vinci.bootstrap;

import org.nasdanika.common.SupplierFactory;

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
 *   <li>{@link org.nasdanika.vinci.bootstrap.Table#isDark <em>Dark</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Table#isStriped <em>Striped</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Table#isBordered <em>Bordered</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Table#isBorderless <em>Borderless</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Table#isHover <em>Hover</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Table#isSmall <em>Small</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTable()
 * @model superTypes="org.nasdanika.vinci.bootstrap.TableRowContainer org.nasdanika.ncore.ISupplierFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;"
 * @generated
 */
public interface Table extends TableRowContainer, SupplierFactory<Object> {

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

	/**
	 * Returns the value of the '<em><b>Dark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dark</em>' attribute.
	 * @see #setDark(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTable_Dark()
	 * @model
	 * @generated
	 */
	boolean isDark();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Table#isDark <em>Dark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dark</em>' attribute.
	 * @see #isDark()
	 * @generated
	 */
	void setDark(boolean value);

	/**
	 * Returns the value of the '<em><b>Striped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Striped</em>' attribute.
	 * @see #setStriped(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTable_Striped()
	 * @model
	 * @generated
	 */
	boolean isStriped();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Table#isStriped <em>Striped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Striped</em>' attribute.
	 * @see #isStriped()
	 * @generated
	 */
	void setStriped(boolean value);

	/**
	 * Returns the value of the '<em><b>Bordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bordered</em>' attribute.
	 * @see #setBordered(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTable_Bordered()
	 * @model
	 * @generated
	 */
	boolean isBordered();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Table#isBordered <em>Bordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bordered</em>' attribute.
	 * @see #isBordered()
	 * @generated
	 */
	void setBordered(boolean value);

	/**
	 * Returns the value of the '<em><b>Borderless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borderless</em>' attribute.
	 * @see #setBorderless(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTable_Borderless()
	 * @model
	 * @generated
	 */
	boolean isBorderless();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Table#isBorderless <em>Borderless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Borderless</em>' attribute.
	 * @see #isBorderless()
	 * @generated
	 */
	void setBorderless(boolean value);

	/**
	 * Returns the value of the '<em><b>Hover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hover</em>' attribute.
	 * @see #setHover(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTable_Hover()
	 * @model
	 * @generated
	 */
	boolean isHover();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Table#isHover <em>Hover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hover</em>' attribute.
	 * @see #isHover()
	 * @generated
	 */
	void setHover(boolean value);

	/**
	 * Returns the value of the '<em><b>Small</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small</em>' attribute.
	 * @see #setSmall(boolean)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getTable_Small()
	 * @model
	 * @generated
	 */
	boolean isSmall();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Table#isSmall <em>Small</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small</em>' attribute.
	 * @see #isSmall()
	 * @generated
	 */
	void setSmall(boolean value);
} // Table
