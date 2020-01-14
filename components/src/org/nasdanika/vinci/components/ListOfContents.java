/**
 */
package org.nasdanika.vinci.components;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Contents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Containing action content rendered in a list.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.ListOfContents#getOrdering <em>Ordering</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.components.ComponentsPackage#getListOfContents()
 * @model
 * @generated
 */
public interface ListOfContents extends TableOfContentsBase {
	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordering style. 
	 * "Auto" means starting with numbers and going over all available styles with each additional level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see #setOrdering(String)
	 * @see org.nasdanika.vinci.components.ComponentsPackage#getListOfContents_Ordering()
	 * @model default=""
	 * @generated
	 */
	String getOrdering();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.components.ListOfContents#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(String value);

} // ListOfContents
