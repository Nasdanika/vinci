/**
 */
package org.nasdanika.vinci.components;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;

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
	 * The meta object id for the '{@link org.nasdanika.vinci.components.impl.ActionLinkImpl <em>Action Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.components.impl.ActionLinkImpl
	 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getActionLink()
	 * @generated
	 */
	int ACTION_LINK = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__TITLE = NcorePackage.MODEL_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__TARGET = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__APPEARANCE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.components.impl.TableOfContentsBaseImpl <em>Table Of Contents Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.components.impl.TableOfContentsBaseImpl
	 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getTableOfContentsBase()
	 * @generated
	 */
	int TABLE_OF_CONTENTS_BASE = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_BASE__TITLE = BootstrapPackage.BOOTSTRAP_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_BASE__DESCRIPTION = BootstrapPackage.BOOTSTRAP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_BASE__APPEARANCE = BootstrapPackage.BOOTSTRAP_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_BASE__HEADER = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_BASE__ROLE = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_BASE__DEPTH = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table Of Contents Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_BASE_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>As View Builder Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_BASE___AS_VIEW_BUILDER_SUPPLIER__CONTEXT = BootstrapPackage.BOOTSTRAP_ELEMENT___AS_VIEW_BUILDER_SUPPLIER__CONTEXT;

	/**
	 * The number of operations of the '<em>Table Of Contents Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_BASE_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.components.impl.TableOfContentsImpl <em>Table Of Contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.components.impl.TableOfContentsImpl
	 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getTableOfContents()
	 * @generated
	 */
	int TABLE_OF_CONTENTS = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__TITLE = TABLE_OF_CONTENTS_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__DESCRIPTION = TABLE_OF_CONTENTS_BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__APPEARANCE = TABLE_OF_CONTENTS_BASE__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__HEADER = TABLE_OF_CONTENTS_BASE__HEADER;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__ROLE = TABLE_OF_CONTENTS_BASE__ROLE;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__DEPTH = TABLE_OF_CONTENTS_BASE__DEPTH;

	/**
	 * The feature id for the '<em><b>Dark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__DARK = TABLE_OF_CONTENTS_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Striped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__STRIPED = TABLE_OF_CONTENTS_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__BORDERED = TABLE_OF_CONTENTS_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Borderless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__BORDERLESS = TABLE_OF_CONTENTS_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__HOVER = TABLE_OF_CONTENTS_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Small</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__SMALL = TABLE_OF_CONTENTS_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__DESCRIPTIONS = TABLE_OF_CONTENTS_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tooltips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS__TOOLTIPS = TABLE_OF_CONTENTS_BASE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Table Of Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_FEATURE_COUNT = TABLE_OF_CONTENTS_BASE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>As View Builder Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS___AS_VIEW_BUILDER_SUPPLIER__CONTEXT = TABLE_OF_CONTENTS_BASE___AS_VIEW_BUILDER_SUPPLIER__CONTEXT;

	/**
	 * The number of operations of the '<em>Table Of Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_CONTENTS_OPERATION_COUNT = TABLE_OF_CONTENTS_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.components.impl.ListOfContentsImpl <em>List Of Contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.components.impl.ListOfContentsImpl
	 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getListOfContents()
	 * @generated
	 */
	int LIST_OF_CONTENTS = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_CONTENTS__TITLE = TABLE_OF_CONTENTS_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_CONTENTS__DESCRIPTION = TABLE_OF_CONTENTS_BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_CONTENTS__APPEARANCE = TABLE_OF_CONTENTS_BASE__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_CONTENTS__HEADER = TABLE_OF_CONTENTS_BASE__HEADER;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_CONTENTS__ROLE = TABLE_OF_CONTENTS_BASE__ROLE;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_CONTENTS__DEPTH = TABLE_OF_CONTENTS_BASE__DEPTH;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_CONTENTS__ORDERING = TABLE_OF_CONTENTS_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tooltips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_CONTENTS__TOOLTIPS = TABLE_OF_CONTENTS_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Of Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_CONTENTS_FEATURE_COUNT = TABLE_OF_CONTENTS_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>As View Builder Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_CONTENTS___AS_VIEW_BUILDER_SUPPLIER__CONTEXT = TABLE_OF_CONTENTS_BASE___AS_VIEW_BUILDER_SUPPLIER__CONTEXT;

	/**
	 * The number of operations of the '<em>List Of Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_CONTENTS_OPERATION_COUNT = TABLE_OF_CONTENTS_BASE_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link org.nasdanika.vinci.components.ActionLink <em>Action Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Link</em>'.
	 * @see org.nasdanika.vinci.components.ActionLink
	 * @generated
	 */
	EClass getActionLink();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.vinci.components.ActionLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.vinci.components.ActionLink#getTarget()
	 * @see #getActionLink()
	 * @generated
	 */
	EReference getActionLink_Target();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.components.ActionLink#getAppearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance</em>'.
	 * @see org.nasdanika.vinci.components.ActionLink#getAppearance()
	 * @see #getActionLink()
	 * @generated
	 */
	EReference getActionLink_Appearance();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.components.TableOfContentsBase <em>Table Of Contents Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Of Contents Base</em>'.
	 * @see org.nasdanika.vinci.components.TableOfContentsBase
	 * @generated
	 */
	EClass getTableOfContentsBase();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.TableOfContentsBase#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see org.nasdanika.vinci.components.TableOfContentsBase#getHeader()
	 * @see #getTableOfContentsBase()
	 * @generated
	 */
	EAttribute getTableOfContentsBase_Header();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.TableOfContentsBase#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.nasdanika.vinci.components.TableOfContentsBase#getRole()
	 * @see #getTableOfContentsBase()
	 * @generated
	 */
	EAttribute getTableOfContentsBase_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.TableOfContentsBase#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see org.nasdanika.vinci.components.TableOfContentsBase#getDepth()
	 * @see #getTableOfContentsBase()
	 * @generated
	 */
	EAttribute getTableOfContentsBase_Depth();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.components.TableOfContents <em>Table Of Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Of Contents</em>'.
	 * @see org.nasdanika.vinci.components.TableOfContents
	 * @generated
	 */
	EClass getTableOfContents();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.TableOfContents#isDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descriptions</em>'.
	 * @see org.nasdanika.vinci.components.TableOfContents#isDescriptions()
	 * @see #getTableOfContents()
	 * @generated
	 */
	EAttribute getTableOfContents_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.TableOfContents#isTooltips <em>Tooltips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltips</em>'.
	 * @see org.nasdanika.vinci.components.TableOfContents#isTooltips()
	 * @see #getTableOfContents()
	 * @generated
	 */
	EAttribute getTableOfContents_Tooltips();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.components.ListOfContents <em>List Of Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Contents</em>'.
	 * @see org.nasdanika.vinci.components.ListOfContents
	 * @generated
	 */
	EClass getListOfContents();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.ListOfContents#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see org.nasdanika.vinci.components.ListOfContents#getOrdering()
	 * @see #getListOfContents()
	 * @generated
	 */
	EAttribute getListOfContents_Ordering();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.ListOfContents#isTooltips <em>Tooltips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltips</em>'.
	 * @see org.nasdanika.vinci.components.ListOfContents#isTooltips()
	 * @see #getListOfContents()
	 * @generated
	 */
	EAttribute getListOfContents_Tooltips();

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
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.components.impl.ActionLinkImpl <em>Action Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.components.impl.ActionLinkImpl
		 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getActionLink()
		 * @generated
		 */
		EClass ACTION_LINK = eINSTANCE.getActionLink();
		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_LINK__TARGET = eINSTANCE.getActionLink_Target();
		/**
		 * The meta object literal for the '<em><b>Appearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_LINK__APPEARANCE = eINSTANCE.getActionLink_Appearance();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.components.impl.TableOfContentsBaseImpl <em>Table Of Contents Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.components.impl.TableOfContentsBaseImpl
		 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getTableOfContentsBase()
		 * @generated
		 */
		EClass TABLE_OF_CONTENTS_BASE = eINSTANCE.getTableOfContentsBase();
		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OF_CONTENTS_BASE__HEADER = eINSTANCE.getTableOfContentsBase_Header();
		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OF_CONTENTS_BASE__ROLE = eINSTANCE.getTableOfContentsBase_Role();
		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OF_CONTENTS_BASE__DEPTH = eINSTANCE.getTableOfContentsBase_Depth();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.components.impl.TableOfContentsImpl <em>Table Of Contents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.components.impl.TableOfContentsImpl
		 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getTableOfContents()
		 * @generated
		 */
		EClass TABLE_OF_CONTENTS = eINSTANCE.getTableOfContents();
		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OF_CONTENTS__DESCRIPTIONS = eINSTANCE.getTableOfContents_Descriptions();
		/**
		 * The meta object literal for the '<em><b>Tooltips</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_OF_CONTENTS__TOOLTIPS = eINSTANCE.getTableOfContents_Tooltips();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.components.impl.ListOfContentsImpl <em>List Of Contents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.components.impl.ListOfContentsImpl
		 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getListOfContents()
		 * @generated
		 */
		EClass LIST_OF_CONTENTS = eINSTANCE.getListOfContents();
		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_OF_CONTENTS__ORDERING = eINSTANCE.getListOfContents_Ordering();
		/**
		 * The meta object literal for the '<em><b>Tooltips</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_OF_CONTENTS__TOOLTIPS = eINSTANCE.getListOfContents_Tooltips();

	}

} //ComponentsPackage
