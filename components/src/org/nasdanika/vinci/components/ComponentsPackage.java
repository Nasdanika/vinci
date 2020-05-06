/**
 */
package org.nasdanika.vinci.components;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__TEXT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__TARGET = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__APPEARANCE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link org.nasdanika.vinci.components.impl.ListOfActionsImpl <em>List Of Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.components.impl.ListOfActionsImpl
	 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getListOfActions()
	 * @generated
	 */
	int LIST_OF_ACTIONS = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ACTIONS__TITLE = LIST_OF_CONTENTS__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ACTIONS__DESCRIPTION = LIST_OF_CONTENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ACTIONS__APPEARANCE = LIST_OF_CONTENTS__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ACTIONS__HEADER = LIST_OF_CONTENTS__HEADER;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ACTIONS__ROLE = LIST_OF_CONTENTS__ROLE;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ACTIONS__DEPTH = LIST_OF_CONTENTS__DEPTH;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ACTIONS__ORDERING = LIST_OF_CONTENTS__ORDERING;

	/**
	 * The feature id for the '<em><b>Tooltips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ACTIONS__TOOLTIPS = LIST_OF_CONTENTS__TOOLTIPS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ACTIONS__ACTIONS = LIST_OF_CONTENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Of Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ACTIONS_FEATURE_COUNT = LIST_OF_CONTENTS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>As View Builder Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ACTIONS___AS_VIEW_BUILDER_SUPPLIER__CONTEXT = LIST_OF_CONTENTS___AS_VIEW_BUILDER_SUPPLIER__CONTEXT;

	/**
	 * The number of operations of the '<em>List Of Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_ACTIONS_OPERATION_COUNT = LIST_OF_CONTENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.components.impl.TableOfActionsImpl <em>Table Of Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.components.impl.TableOfActionsImpl
	 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getTableOfActions()
	 * @generated
	 */
	int TABLE_OF_ACTIONS = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS__TITLE = TABLE_OF_CONTENTS__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS__DESCRIPTION = TABLE_OF_CONTENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS__APPEARANCE = TABLE_OF_CONTENTS__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS__HEADER = TABLE_OF_CONTENTS__HEADER;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS__ROLE = TABLE_OF_CONTENTS__ROLE;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS__DEPTH = TABLE_OF_CONTENTS__DEPTH;

	/**
	 * The feature id for the '<em><b>Dark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS__DARK = TABLE_OF_CONTENTS__DARK;

	/**
	 * The feature id for the '<em><b>Striped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS__STRIPED = TABLE_OF_CONTENTS__STRIPED;

	/**
	 * The feature id for the '<em><b>Bordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS__BORDERED = TABLE_OF_CONTENTS__BORDERED;

	/**
	 * The feature id for the '<em><b>Borderless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS__BORDERLESS = TABLE_OF_CONTENTS__BORDERLESS;

	/**
	 * The feature id for the '<em><b>Hover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS__HOVER = TABLE_OF_CONTENTS__HOVER;

	/**
	 * The feature id for the '<em><b>Small</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS__SMALL = TABLE_OF_CONTENTS__SMALL;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS__DESCRIPTIONS = TABLE_OF_CONTENTS__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Tooltips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS__TOOLTIPS = TABLE_OF_CONTENTS__TOOLTIPS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS__ACTIONS = TABLE_OF_CONTENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Of Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS_FEATURE_COUNT = TABLE_OF_CONTENTS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>As View Builder Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS___AS_VIEW_BUILDER_SUPPLIER__CONTEXT = TABLE_OF_CONTENTS___AS_VIEW_BUILDER_SUPPLIER__CONTEXT;

	/**
	 * The number of operations of the '<em>Table Of Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OF_ACTIONS_OPERATION_COUNT = TABLE_OF_CONTENTS_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.components.impl.TextToSpeechImpl <em>Text To Speech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.components.impl.TextToSpeechImpl
	 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getTextToSpeech()
	 * @generated
	 */
	int TEXT_TO_SPEECH = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH__TITLE = NcorePackage.MODEL_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH__LANGUAGE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH__VOICE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH__FORMAT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH__INTERPOLATE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH__APPEARANCE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH__PATH = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Embed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH__EMBED = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Text To Speech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Text To Speech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.components.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.components.impl.ImageImpl
	 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TITLE = NcorePackage.MODEL_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CONTENT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CAPTION = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__APPEARANCE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TARGET = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Capture Screen</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___CAPTURE_SCREEN = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.components.impl.TextToSpeechTextImpl <em>Text To Speech Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.components.impl.TextToSpeechTextImpl
	 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getTextToSpeechText()
	 * @generated
	 */
	int TEXT_TO_SPEECH_TEXT = 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_TEXT__TITLE = TEXT_TO_SPEECH__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_TEXT__DESCRIPTION = TEXT_TO_SPEECH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_TEXT__LANGUAGE = TEXT_TO_SPEECH__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_TEXT__VOICE = TEXT_TO_SPEECH__VOICE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_TEXT__FORMAT = TEXT_TO_SPEECH__FORMAT;

	/**
	 * The feature id for the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_TEXT__INTERPOLATE = TEXT_TO_SPEECH__INTERPOLATE;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_TEXT__APPEARANCE = TEXT_TO_SPEECH__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_TEXT__PATH = TEXT_TO_SPEECH__PATH;

	/**
	 * The feature id for the '<em><b>Embed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_TEXT__EMBED = TEXT_TO_SPEECH__EMBED;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_TEXT__TEXT = TEXT_TO_SPEECH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text To Speech Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_TEXT_FEATURE_COUNT = TEXT_TO_SPEECH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text To Speech Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_TEXT_OPERATION_COUNT = TEXT_TO_SPEECH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.components.impl.TextToSpeechResourceImpl <em>Text To Speech Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.components.impl.TextToSpeechResourceImpl
	 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getTextToSpeechResource()
	 * @generated
	 */
	int TEXT_TO_SPEECH_RESOURCE = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_RESOURCE__TITLE = TEXT_TO_SPEECH__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_RESOURCE__DESCRIPTION = TEXT_TO_SPEECH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_RESOURCE__LANGUAGE = TEXT_TO_SPEECH__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_RESOURCE__VOICE = TEXT_TO_SPEECH__VOICE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_RESOURCE__FORMAT = TEXT_TO_SPEECH__FORMAT;

	/**
	 * The feature id for the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_RESOURCE__INTERPOLATE = TEXT_TO_SPEECH__INTERPOLATE;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_RESOURCE__APPEARANCE = TEXT_TO_SPEECH__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_RESOURCE__PATH = TEXT_TO_SPEECH__PATH;

	/**
	 * The feature id for the '<em><b>Embed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_RESOURCE__EMBED = TEXT_TO_SPEECH__EMBED;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_RESOURCE__LOCATION = TEXT_TO_SPEECH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text To Speech Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_RESOURCE_FEATURE_COUNT = TEXT_TO_SPEECH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text To Speech Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TO_SPEECH_RESOURCE_OPERATION_COUNT = TEXT_TO_SPEECH_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.ActionLink#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.vinci.components.ActionLink#getText()
	 * @see #getActionLink()
	 * @generated
	 */
	EAttribute getActionLink_Text();

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
	 * Returns the meta object for class '{@link org.nasdanika.vinci.components.ListOfActions <em>List Of Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Actions</em>'.
	 * @see org.nasdanika.vinci.components.ListOfActions
	 * @generated
	 */
	EClass getListOfActions();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.vinci.components.ListOfActions#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see org.nasdanika.vinci.components.ListOfActions#getActions()
	 * @see #getListOfActions()
	 * @generated
	 */
	EReference getListOfActions_Actions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.components.TableOfActions <em>Table Of Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Of Actions</em>'.
	 * @see org.nasdanika.vinci.components.TableOfActions
	 * @generated
	 */
	EClass getTableOfActions();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.vinci.components.TableOfActions#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see org.nasdanika.vinci.components.TableOfActions#getActions()
	 * @see #getTableOfActions()
	 * @generated
	 */
	EReference getTableOfActions_Actions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.components.TextToSpeech <em>Text To Speech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text To Speech</em>'.
	 * @see org.nasdanika.vinci.components.TextToSpeech
	 * @generated
	 */
	EClass getTextToSpeech();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.TextToSpeech#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.nasdanika.vinci.components.TextToSpeech#getLanguage()
	 * @see #getTextToSpeech()
	 * @generated
	 */
	EAttribute getTextToSpeech_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.TextToSpeech#getVoice <em>Voice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voice</em>'.
	 * @see org.nasdanika.vinci.components.TextToSpeech#getVoice()
	 * @see #getTextToSpeech()
	 * @generated
	 */
	EAttribute getTextToSpeech_Voice();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.TextToSpeech#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.nasdanika.vinci.components.TextToSpeech#getFormat()
	 * @see #getTextToSpeech()
	 * @generated
	 */
	EAttribute getTextToSpeech_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.TextToSpeech#isInterpolate <em>Interpolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolate</em>'.
	 * @see org.nasdanika.vinci.components.TextToSpeech#isInterpolate()
	 * @see #getTextToSpeech()
	 * @generated
	 */
	EAttribute getTextToSpeech_Interpolate();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.components.TextToSpeech#getAppearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance</em>'.
	 * @see org.nasdanika.vinci.components.TextToSpeech#getAppearance()
	 * @see #getTextToSpeech()
	 * @generated
	 */
	EReference getTextToSpeech_Appearance();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.TextToSpeech#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.nasdanika.vinci.components.TextToSpeech#getPath()
	 * @see #getTextToSpeech()
	 * @generated
	 */
	EAttribute getTextToSpeech_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.TextToSpeech#isEmbed <em>Embed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embed</em>'.
	 * @see org.nasdanika.vinci.components.TextToSpeech#isEmbed()
	 * @see #getTextToSpeech()
	 * @generated
	 */
	EAttribute getTextToSpeech_Embed();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.components.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.nasdanika.vinci.components.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.Image#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.vinci.components.Image#getContent()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.Image#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption</em>'.
	 * @see org.nasdanika.vinci.components.Image#getCaption()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Caption();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.components.Image#getAppearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance</em>'.
	 * @see org.nasdanika.vinci.components.Image#getAppearance()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Appearance();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.vinci.components.Image#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.vinci.components.Image#getTarget()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Target();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.vinci.components.Image#captureScreen() <em>Capture Screen</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Capture Screen</em>' operation.
	 * @see org.nasdanika.vinci.components.Image#captureScreen()
	 * @generated
	 */
	EOperation getImage__CaptureScreen();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.components.TextToSpeechText <em>Text To Speech Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text To Speech Text</em>'.
	 * @see org.nasdanika.vinci.components.TextToSpeechText
	 * @generated
	 */
	EClass getTextToSpeechText();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.TextToSpeechText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.vinci.components.TextToSpeechText#getText()
	 * @see #getTextToSpeechText()
	 * @generated
	 */
	EAttribute getTextToSpeechText_Text();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.components.TextToSpeechResource <em>Text To Speech Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text To Speech Resource</em>'.
	 * @see org.nasdanika.vinci.components.TextToSpeechResource
	 * @generated
	 */
	EClass getTextToSpeechResource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.components.TextToSpeechResource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.vinci.components.TextToSpeechResource#getLocation()
	 * @see #getTextToSpeechResource()
	 * @generated
	 */
	EAttribute getTextToSpeechResource_Location();

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
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_LINK__TEXT = eINSTANCE.getActionLink_Text();
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
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.components.impl.ListOfActionsImpl <em>List Of Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.components.impl.ListOfActionsImpl
		 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getListOfActions()
		 * @generated
		 */
		EClass LIST_OF_ACTIONS = eINSTANCE.getListOfActions();
		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_ACTIONS__ACTIONS = eINSTANCE.getListOfActions_Actions();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.components.impl.TableOfActionsImpl <em>Table Of Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.components.impl.TableOfActionsImpl
		 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getTableOfActions()
		 * @generated
		 */
		EClass TABLE_OF_ACTIONS = eINSTANCE.getTableOfActions();
		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_OF_ACTIONS__ACTIONS = eINSTANCE.getTableOfActions_Actions();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.components.impl.TextToSpeechImpl <em>Text To Speech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.components.impl.TextToSpeechImpl
		 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getTextToSpeech()
		 * @generated
		 */
		EClass TEXT_TO_SPEECH = eINSTANCE.getTextToSpeech();
		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TO_SPEECH__LANGUAGE = eINSTANCE.getTextToSpeech_Language();
		/**
		 * The meta object literal for the '<em><b>Voice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TO_SPEECH__VOICE = eINSTANCE.getTextToSpeech_Voice();
		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TO_SPEECH__FORMAT = eINSTANCE.getTextToSpeech_Format();
		/**
		 * The meta object literal for the '<em><b>Interpolate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TO_SPEECH__INTERPOLATE = eINSTANCE.getTextToSpeech_Interpolate();
		/**
		 * The meta object literal for the '<em><b>Appearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_TO_SPEECH__APPEARANCE = eINSTANCE.getTextToSpeech_Appearance();
		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TO_SPEECH__PATH = eINSTANCE.getTextToSpeech_Path();
		/**
		 * The meta object literal for the '<em><b>Embed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TO_SPEECH__EMBED = eINSTANCE.getTextToSpeech_Embed();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.components.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.components.impl.ImageImpl
		 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();
		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__CONTENT = eINSTANCE.getImage_Content();
		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__CAPTION = eINSTANCE.getImage_Caption();
		/**
		 * The meta object literal for the '<em><b>Appearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__APPEARANCE = eINSTANCE.getImage_Appearance();
		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__TARGET = eINSTANCE.getImage_Target();
		/**
		 * The meta object literal for the '<em><b>Capture Screen</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE___CAPTURE_SCREEN = eINSTANCE.getImage__CaptureScreen();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.components.impl.TextToSpeechTextImpl <em>Text To Speech Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.components.impl.TextToSpeechTextImpl
		 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getTextToSpeechText()
		 * @generated
		 */
		EClass TEXT_TO_SPEECH_TEXT = eINSTANCE.getTextToSpeechText();
		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TO_SPEECH_TEXT__TEXT = eINSTANCE.getTextToSpeechText_Text();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.components.impl.TextToSpeechResourceImpl <em>Text To Speech Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.components.impl.TextToSpeechResourceImpl
		 * @see org.nasdanika.vinci.components.impl.ComponentsPackageImpl#getTextToSpeechResource()
		 * @generated
		 */
		EClass TEXT_TO_SPEECH_RESOURCE = eINSTANCE.getTextToSpeechResource();
		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TO_SPEECH_RESOURCE__LOCATION = eINSTANCE.getTextToSpeechResource_Location();

	}

} //ComponentsPackage
