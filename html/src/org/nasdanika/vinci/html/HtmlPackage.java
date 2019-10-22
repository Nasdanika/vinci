/**
 */
package org.nasdanika.vinci.html;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.ncore.NcorePackage;

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
 * HTML model
 * <!-- end-model-doc -->
 * @see org.nasdanika.vinci.html.HtmlFactory
 * @model kind="package"
 * @generated
 */
public interface HtmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "html";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.vinci.html";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.vinci.html";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HtmlPackage eINSTANCE = org.nasdanika.vinci.html.impl.HtmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.html.impl.HtmlElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.html.impl.HtmlElementImpl
	 * @see org.nasdanika.vinci.html.impl.HtmlPackageImpl#getHtmlElement()
	 * @generated
	 */
	int HTML_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT_FEATURE_COUNT = NcorePackage.COMMAND_FACTORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT_OPERATION_COUNT = NcorePackage.COMMAND_FACTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.html.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.html.impl.ContainerImpl
	 * @see org.nasdanika.vinci.html.impl.HtmlPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.html.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.html.impl.TagImpl
	 * @see org.nasdanika.vinci.html.impl.HtmlPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__CONTENT = HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = HTML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = HTML_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.html.HtmlElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.nasdanika.vinci.html.HtmlElement
	 * @generated
	 */
	EClass getHtmlElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.html.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.nasdanika.vinci.html.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.html.Container#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.nasdanika.vinci.html.Container#getContent()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.html.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.nasdanika.vinci.html.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HtmlFactory getHtmlFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.vinci.html.impl.HtmlElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.html.impl.HtmlElementImpl
		 * @see org.nasdanika.vinci.html.impl.HtmlPackageImpl#getHtmlElement()
		 * @generated
		 */
		EClass HTML_ELEMENT = eINSTANCE.getHtmlElement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.html.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.html.impl.ContainerImpl
		 * @see org.nasdanika.vinci.html.impl.HtmlPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTENT = eINSTANCE.getContainer_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.html.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.html.impl.TagImpl
		 * @see org.nasdanika.vinci.html.impl.HtmlPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

	}

} //HtmlPackage
