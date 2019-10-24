/**
 */
package org.nasdanika.vinci.bootstrap;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.WorkFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Card#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Card#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.Card#getFooter <em>Footer</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getCard()
 * @model superTypes="org.nasdanika.vinci.bootstrap.BootstrapElement org.nasdanika.ncore.WorkFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;"
 * @generated
 */
public interface Card extends BootstrapElement, WorkFactory<Object> {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(Div)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getCard_Header()
	 * @model containment="true"
	 * @generated
	 */
	Div getHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Card#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(Div value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.bootstrap.Div}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getCard_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<Div> getBody();

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference.
	 * @see #setFooter(Div)
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#getCard_Footer()
	 * @model containment="true"
	 * @generated
	 */
	Div getFooter();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.bootstrap.Card#getFooter <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' containment reference.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(Div value);

} // Card
