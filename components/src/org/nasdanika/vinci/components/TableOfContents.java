/**
 */
package org.nasdanika.vinci.components;

import org.nasdanika.vinci.bootstrap.TableConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Of Contents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Containing action content rendered in a table.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.TableOfContents#isDescriptions <em>Descriptions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.components.ComponentsPackage#getTableOfContents()
 * @model
 * @generated
 */
public interface TableOfContents extends TableOfContentsBase, TableConfiguration {

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If selected, action descriptions are shown in the table of contents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Descriptions</em>' attribute.
	 * @see #setDescriptions(boolean)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getTableOfContents_Descriptions()
	 * @model default="false"
	 * @generated
	 */
	boolean isDescriptions();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.TableOfContents#isDescriptions <em>Descriptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptions</em>' attribute.
	 * @see #isDescriptions()
	 * @generated
	 */
	void setDescriptions(boolean value);
} // TableOfContents
