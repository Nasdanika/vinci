/**
 */
package org.nasdanika.vinci.components;

import org.eclipse.emf.ecore.EAttribute;
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
 * Miscellaneous components.
 * <!-- end-model-doc -->
 * @see org.nasdanika.vinci.components.ComponentsFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "components";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.vinci.components";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.vinci.components";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentsPackage eINSTANCE = org.nasdanika.vinci.components.impl.ComponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.components.impl.MarkdownImpl <em>Markdown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.components.impl.MarkdownImpl
	 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getMarkdown()
	 * @generated
	 */
	int MARKDOWN = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__TITLE = NcorePackage.MODEL_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__STYLE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__INTERPOLATE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN__APPEARANCE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Markdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Markdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.components.impl.MarkdownTextImpl <em>Markdown Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.components.impl.MarkdownTextImpl
	 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getMarkdownText()
	 * @generated
	 */
	int MARKDOWN_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_TEXT__TITLE = MARKDOWN__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_TEXT__DESCRIPTION = MARKDOWN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_TEXT__STYLE = MARKDOWN__STYLE;

	/**
	 * The feature id for the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_TEXT__INTERPOLATE = MARKDOWN__INTERPOLATE;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_TEXT__APPEARANCE = MARKDOWN__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Markdown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_TEXT__MARKDOWN = MARKDOWN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Markdown Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_TEXT_FEATURE_COUNT = MARKDOWN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Markdown Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_TEXT_OPERATION_COUNT = MARKDOWN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.components.impl.MarkdownResourceImpl <em>Markdown Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.components.impl.MarkdownResourceImpl
	 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getMarkdownResource()
	 * @generated
	 */
	int MARKDOWN_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_RESOURCE__TITLE = MARKDOWN__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_RESOURCE__DESCRIPTION = MARKDOWN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_RESOURCE__STYLE = MARKDOWN__STYLE;

	/**
	 * The feature id for the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_RESOURCE__INTERPOLATE = MARKDOWN__INTERPOLATE;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_RESOURCE__APPEARANCE = MARKDOWN__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_RESOURCE__LOCATION = MARKDOWN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Markdown Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_RESOURCE_FEATURE_COUNT = MARKDOWN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Markdown Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_RESOURCE_OPERATION_COUNT = MARKDOWN_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.components.Markdown <em>Markdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markdown</em>'.
	 * @see org.nasdanika.vinci.components.Markdown
	 * @generated
	 */
	EClass getMarkdown();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.Markdown#isStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.nasdanika.vinci.components.Markdown#isStyle()
	 * @see #getMarkdown()
	 * @generated
	 */
	EAttribute getMarkdown_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.Markdown#isInterpolate <em>Interpolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolate</em>'.
	 * @see org.nasdanika.vinci.components.Markdown#isInterpolate()
	 * @see #getMarkdown()
	 * @generated
	 */
	EAttribute getMarkdown_Interpolate();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.components.Markdown#getAppearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance</em>'.
	 * @see org.nasdanika.vinci.components.Markdown#getAppearance()
	 * @see #getMarkdown()
	 * @generated
	 */
	EReference getMarkdown_Appearance();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.components.MarkdownText <em>Markdown Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markdown Text</em>'.
	 * @see org.nasdanika.vinci.components.MarkdownText
	 * @generated
	 */
	EClass getMarkdownText();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.MarkdownText#getMarkdown <em>Markdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Markdown</em>'.
	 * @see org.nasdanika.vinci.components.MarkdownText#getMarkdown()
	 * @see #getMarkdownText()
	 * @generated
	 */
	EAttribute getMarkdownText_Markdown();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.components.MarkdownResource <em>Markdown Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markdown Resource</em>'.
	 * @see org.nasdanika.vinci.components.MarkdownResource
	 * @generated
	 */
	EClass getMarkdownResource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.MarkdownResource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.vinci.components.MarkdownResource#getLocation()
	 * @see #getMarkdownResource()
	 * @generated
	 */
	EAttribute getMarkdownResource_Location();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentsFactory getComponentsFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.vinci.components.impl.MarkdownImpl <em>Markdown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.components.impl.MarkdownImpl
		 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getMarkdown()
		 * @generated
		 */
		EClass MARKDOWN = eINSTANCE.getMarkdown();
		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKDOWN__STYLE = eINSTANCE.getMarkdown_Style();
		/**
		 * The meta object literal for the '<em><b>Interpolate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKDOWN__INTERPOLATE = eINSTANCE.getMarkdown_Interpolate();
		/**
		 * The meta object literal for the '<em><b>Appearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKDOWN__APPEARANCE = eINSTANCE.getMarkdown_Appearance();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.components.impl.MarkdownTextImpl <em>Markdown Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.components.impl.MarkdownTextImpl
		 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getMarkdownText()
		 * @generated
		 */
		EClass MARKDOWN_TEXT = eINSTANCE.getMarkdownText();
		/**
		 * The meta object literal for the '<em><b>Markdown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKDOWN_TEXT__MARKDOWN = eINSTANCE.getMarkdownText_Markdown();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.components.impl.MarkdownResourceImpl <em>Markdown Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.components.impl.MarkdownResourceImpl
		 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getMarkdownResource()
		 * @generated
		 */
		EClass MARKDOWN_RESOURCE = eINSTANCE.getMarkdownResource();
		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKDOWN_RESOURCE__LOCATION = eINSTANCE.getMarkdownResource_Location();

	}

} //ComponentsPackage
