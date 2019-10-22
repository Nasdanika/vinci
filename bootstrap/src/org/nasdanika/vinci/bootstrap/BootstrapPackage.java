/**
 */
package org.nasdanika.vinci.bootstrap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.nasdanika.vinci.html.HtmlPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Model of Bootstrap elements.
 * <!-- end-model-doc -->
 * @see org.nasdanika.vinci.bootstrap.BootstrapFactory
 * @model kind="package"
 * @generated
 */
public interface BootstrapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bootstrap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.vinci.bootstrap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.vinci.bootstrap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BootstrapPackage eINSTANCE = org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.BootstrapElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapElementImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getBootstrapElement()
	 * @generated
	 */
	int BOOTSTRAP_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT_FEATURE_COUNT = HtmlPackage.HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT_OPERATION_COUNT = HtmlPackage.HTML_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ContainerImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ROWS = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.RowImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__COLUMNS = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ColumnImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 3;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.CardImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 4;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__BODY = 1;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__FOOTER = 2;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.BootstrapElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapElement
	 * @generated
	 */
	EClass getBootstrapElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.bootstrap.Container#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Container#getRows()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Rows();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.bootstrap.Row#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Row#getColumns()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Columns();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.bootstrap.Card#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Header</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Card#getHeader()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.bootstrap.Card#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Card#getBody()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.bootstrap.Card#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Footer</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Card#getFooter()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Footer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BootstrapFactory getBootstrapFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.BootstrapElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapElementImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getBootstrapElement()
		 * @generated
		 */
		EClass BOOTSTRAP_ELEMENT = eINSTANCE.getBootstrapElement();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.ContainerImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();
		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ROWS = eINSTANCE.getContainer_Rows();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.RowImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();
		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__COLUMNS = eINSTANCE.getRow_Columns();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.ColumnImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.CardImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();
		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__HEADER = eINSTANCE.getCard_Header();
		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__BODY = eINSTANCE.getCard_Body();
		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__FOOTER = eINSTANCE.getCard_Footer();

	}

} //BootstrapPackage
