/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * Application model.
 * <!-- end-model-doc -->
 * @see org.nasdanika.vinci.app.AppFactory
 * @model kind="package"
 * @generated
 */
public interface AppPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "app";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.vinci.app";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.vinci.app";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppPackage eINSTANCE = org.nasdanika.vinci.app.impl.AppPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.LabelImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.CategoryImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.ActionImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 10;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.ActionMappingImpl <em>Action Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.ActionMappingImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionMapping()
	 * @generated
	 */
	int ACTION_MAPPING = 7;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.ActionLinkImpl <em>Action Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.ActionLinkImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionLink()
	 * @generated
	 */
	int ACTION_LINK = 8;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.ActionReferenceImpl <em>Action Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.ActionReferenceImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionReference()
	 * @generated
	 */
	int ACTION_REFERENCE = 9;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.ActionElement <em>Action Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.ActionElement
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionElement()
	 * @generated
	 */
	int ACTION_ELEMENT = 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.AbstractAction <em>Abstract Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.AbstractAction
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getAbstractAction()
	 * @generated
	 */
	int ABSTRACT_ACTION = 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.ActionCategoryImpl <em>Action Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.ActionCategoryImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionCategory()
	 * @generated
	 */
	int ACTION_CATEGORY = 5;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.Container <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.Container
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Linked Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LINKED_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TITLE = NcorePackage.ENTITY__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__DESCRIPTION = NcorePackage.ENTITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID = NcorePackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COLOR = NcorePackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = NcorePackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ICON = NcorePackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TOOLTIP = NcorePackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__OUTLINE = NcorePackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NOTIFICATION = NcorePackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__APPEARANCE = NcorePackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = NcorePackage.ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = NcorePackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TITLE = LABEL__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTION = LABEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ID = LABEL__ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__COLOR = LABEL__COLOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TEXT = LABEL__TEXT;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ICON = LABEL__ICON;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TOOLTIP = LABEL__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__OUTLINE = LABEL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NOTIFICATION = LABEL__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__APPEARANCE = LABEL__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ELEMENTS = LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linked Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__LINKED_ELEMENTS = LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = LABEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = LABEL_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder <em>Bootstrap Container Application Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getBootstrapContainerApplicationBuilder()
	 * @generated
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_BUILDER = 15;

	/**
	 * The number of structural features of the '<em>Bootstrap Container Application Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_BUILDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Application Builder Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_BUILDER___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT = 0;

	/**
	 * The number of operations of the '<em>Bootstrap Container Application Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_BUILDER_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__CONFIGURATION = BOOTSTRAP_CONTAINER_APPLICATION_BUILDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__ACTION_MAPPINGS = BOOTSTRAP_CONTAINER_APPLICATION_BUILDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_FEATURE_COUNT = BOOTSTRAP_CONTAINER_APPLICATION_BUILDER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Application Builder Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT = BOOTSTRAP_CONTAINER_APPLICATION_BUILDER___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT;

	/**
	 * The number of operations of the '<em>Abstract Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_OPERATION_COUNT = BOOTSTRAP_CONTAINER_APPLICATION_BUILDER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__TITLE = CATEGORY__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__DESCRIPTION = CATEGORY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__ID = CATEGORY__ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__COLOR = CATEGORY__COLOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__TEXT = CATEGORY__TEXT;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__ICON = CATEGORY__ICON;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__TOOLTIP = CATEGORY__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__OUTLINE = CATEGORY__OUTLINE;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__NOTIFICATION = CATEGORY__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__APPEARANCE = CATEGORY__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__ELEMENTS = CATEGORY__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Linked Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__LINKED_ELEMENTS = CATEGORY__LINKED_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Action Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY_OPERATION_COUNT = CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.ActionBaseImpl <em>Action Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.ActionBaseImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionBase()
	 * @generated
	 */
	int ACTION_BASE = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__TITLE = LABEL__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__DESCRIPTION = LABEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__ID = LABEL__ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__COLOR = LABEL__COLOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__TEXT = LABEL__TEXT;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__ICON = LABEL__ICON;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__TOOLTIP = LABEL__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__OUTLINE = LABEL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__NOTIFICATION = LABEL__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__APPEARANCE = LABEL__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__CONFIGURATION = LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__ACTION_MAPPINGS = LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__ELEMENTS = LABEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Linked Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__LINKED_ELEMENTS = LABEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__ROLE = LABEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Section Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__SECTION_STYLE = LABEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Section Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__SECTION_COLUMNS = LABEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Activator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__ACTIVATOR = LABEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Activator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__ACTIVATOR_TYPE = LABEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Confirmation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__CONFIRMATION = LABEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__DISABLED = LABEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__EMBEDDED = LABEL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Markdown Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__MARKDOWN_CONTENT = LABEL_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE__CONTENT = LABEL_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Action Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE_FEATURE_COUNT = LABEL_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Create Application Builder Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT = LABEL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASE_OPERATION_COUNT = LABEL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.PartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.PartitionImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getPartition()
	 * @generated
	 */
	int PARTITION = 11;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MAPPING__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MAPPING__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MAPPING__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Action Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__CONFIGURATION = ABSTRACT_ACTION__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Action Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__ACTION_MAPPINGS = ABSTRACT_ACTION__ACTION_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__TITLE = ABSTRACT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__DESCRIPTION = ABSTRACT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__REF = ABSTRACT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK_FEATURE_COUNT = ABSTRACT_ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create Application Builder Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT = ABSTRACT_ACTION___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT;

	/**
	 * The number of operations of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK_OPERATION_COUNT = ABSTRACT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE__CONFIGURATION = ABSTRACT_ACTION__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Action Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE__ACTION_MAPPINGS = ABSTRACT_ACTION__ACTION_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE__TITLE = ABSTRACT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE__DESCRIPTION = ABSTRACT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE__ACTION = ABSTRACT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE_FEATURE_COUNT = ABSTRACT_ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create Application Builder Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT = ABSTRACT_ACTION___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT;

	/**
	 * The number of operations of the '<em>Action Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE_OPERATION_COUNT = ABSTRACT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TITLE = ACTION_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = ACTION_BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = ACTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__COLOR = ACTION_BASE__COLOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TEXT = ACTION_BASE__TEXT;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ICON = ACTION_BASE__ICON;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TOOLTIP = ACTION_BASE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTLINE = ACTION_BASE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NOTIFICATION = ACTION_BASE__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__APPEARANCE = ACTION_BASE__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONFIGURATION = ACTION_BASE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Action Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_MAPPINGS = ACTION_BASE__ACTION_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ELEMENTS = ACTION_BASE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Linked Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LINKED_ELEMENTS = ACTION_BASE__LINKED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ROLE = ACTION_BASE__ROLE;

	/**
	 * The feature id for the '<em><b>Section Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SECTION_STYLE = ACTION_BASE__SECTION_STYLE;

	/**
	 * The feature id for the '<em><b>Section Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SECTION_COLUMNS = ACTION_BASE__SECTION_COLUMNS;

	/**
	 * The feature id for the '<em><b>Activator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIVATOR = ACTION_BASE__ACTIVATOR;

	/**
	 * The feature id for the '<em><b>Activator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIVATOR_TYPE = ACTION_BASE__ACTIVATOR_TYPE;

	/**
	 * The feature id for the '<em><b>Confirmation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONFIRMATION = ACTION_BASE__CONFIRMATION;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DISABLED = ACTION_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__EMBEDDED = ACTION_BASE__EMBEDDED;

	/**
	 * The feature id for the '<em><b>Markdown Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__MARKDOWN_CONTENT = ACTION_BASE__MARKDOWN_CONTENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTENT = ACTION_BASE__CONTENT;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ACTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Application Builder Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT = ACTION_BASE___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = ACTION_BASE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__TITLE = ACTION_BASE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__DESCRIPTION = ACTION_BASE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ID = ACTION_BASE__ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__COLOR = ACTION_BASE__COLOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__TEXT = ACTION_BASE__TEXT;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ICON = ACTION_BASE__ICON;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__TOOLTIP = ACTION_BASE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__OUTLINE = ACTION_BASE__OUTLINE;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__NOTIFICATION = ACTION_BASE__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__APPEARANCE = ACTION_BASE__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__CONFIGURATION = ACTION_BASE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Action Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ACTION_MAPPINGS = ACTION_BASE__ACTION_MAPPINGS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ELEMENTS = ACTION_BASE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Linked Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__LINKED_ELEMENTS = ACTION_BASE__LINKED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ROLE = ACTION_BASE__ROLE;

	/**
	 * The feature id for the '<em><b>Section Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__SECTION_STYLE = ACTION_BASE__SECTION_STYLE;

	/**
	 * The feature id for the '<em><b>Section Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__SECTION_COLUMNS = ACTION_BASE__SECTION_COLUMNS;

	/**
	 * The feature id for the '<em><b>Activator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ACTIVATOR = ACTION_BASE__ACTIVATOR;

	/**
	 * The feature id for the '<em><b>Activator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ACTIVATOR_TYPE = ACTION_BASE__ACTIVATOR_TYPE;

	/**
	 * The feature id for the '<em><b>Confirmation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__CONFIRMATION = ACTION_BASE__CONFIRMATION;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__DISABLED = ACTION_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__EMBEDDED = ACTION_BASE__EMBEDDED;

	/**
	 * The feature id for the '<em><b>Markdown Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__MARKDOWN_CONTENT = ACTION_BASE__MARKDOWN_CONTENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__CONTENT = ACTION_BASE__CONTENT;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_FEATURE_COUNT = ACTION_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Application Builder Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT = ACTION_BASE___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT;

	/**
	 * The number of operations of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATION_COUNT = ACTION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationImpl <em>Bootstrap Container Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.BootstrapContainerApplicationImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getBootstrapContainerApplication()
	 * @generated
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION__TITLE = BootstrapPackage.BOOTSTRAP_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION__DESCRIPTION = BootstrapPackage.BOOTSTRAP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION__APPEARANCE = BootstrapPackage.BOOTSTRAP_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Fluid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION__FLUID = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Router</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION__ROUTER = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION__HEADER = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Navigation Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Navigation Panel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content Panel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION__FOOTER = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Bootstrap Container Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>As View Builder Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION___AS_VIEW_BUILDER_SUPPLIER__CONTEXT = BootstrapPackage.BOOTSTRAP_ELEMENT___AS_VIEW_BUILDER_SUPPLIER__CONTEXT;

	/**
	 * The number of operations of the '<em>Bootstrap Container Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationSectionImpl <em>Bootstrap Container Application Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.BootstrapContainerApplicationSectionImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getBootstrapContainerApplicationSection()
	 * @generated
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_SECTION = 13;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_SECTION__TITLE = BootstrapPackage.BOOTSTRAP_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_SECTION__DESCRIPTION = BootstrapPackage.BOOTSTRAP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_SECTION__APPEARANCE = BootstrapPackage.BOOTSTRAP_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_SECTION__CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markdown Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_SECTION__MARKDOWN_CONTENT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bootstrap Container Application Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_SECTION_FEATURE_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>As View Builder Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_SECTION___AS_VIEW_BUILDER_SUPPLIER__CONTEXT = BootstrapPackage.BOOTSTRAP_ELEMENT___AS_VIEW_BUILDER_SUPPLIER__CONTEXT;

	/**
	 * The number of operations of the '<em>Bootstrap Container Application Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_SECTION_OPERATION_COUNT = BootstrapPackage.BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationPanelImpl <em>Bootstrap Container Application Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.BootstrapContainerApplicationPanelImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getBootstrapContainerApplicationPanel()
	 * @generated
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_PANEL = 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_PANEL__TITLE = BOOTSTRAP_CONTAINER_APPLICATION_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_PANEL__DESCRIPTION = BOOTSTRAP_CONTAINER_APPLICATION_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_PANEL__APPEARANCE = BOOTSTRAP_CONTAINER_APPLICATION_SECTION__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_PANEL__CONTENT = BOOTSTRAP_CONTAINER_APPLICATION_SECTION__CONTENT;

	/**
	 * The feature id for the '<em><b>Markdown Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_PANEL__MARKDOWN_CONTENT = BOOTSTRAP_CONTAINER_APPLICATION_SECTION__MARKDOWN_CONTENT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_PANEL__WIDTH = BOOTSTRAP_CONTAINER_APPLICATION_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bootstrap Container Application Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_PANEL_FEATURE_COUNT = BOOTSTRAP_CONTAINER_APPLICATION_SECTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>As View Builder Supplier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_PANEL___AS_VIEW_BUILDER_SUPPLIER__CONTEXT = BOOTSTRAP_CONTAINER_APPLICATION_SECTION___AS_VIEW_BUILDER_SUPPLIER__CONTEXT;

	/**
	 * The number of operations of the '<em>Bootstrap Container Application Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_CONTAINER_APPLICATION_PANEL_OPERATION_COUNT = BOOTSTRAP_CONTAINER_APPLICATION_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.ActionRole <em>Action Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.ActionRole
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionRole()
	 * @generated
	 */
	int ACTION_ROLE = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.ActivatorType <em>Activator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.ActivatorType
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActivatorType()
	 * @generated
	 */
	int ACTIVATOR_TYPE = 17;

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.nasdanika.vinci.app.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Label#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.vinci.app.Label#getColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Label#getNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification</em>'.
	 * @see org.nasdanika.vinci.app.Label#getNotification()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Notification();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.app.Label#getAppearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance</em>'.
	 * @see org.nasdanika.vinci.app.Label#getAppearance()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Appearance();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Label#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.nasdanika.vinci.app.Label#getText()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Label#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.nasdanika.vinci.app.Label#getIcon()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Label#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see org.nasdanika.vinci.app.Label#getTooltip()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Label#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see org.nasdanika.vinci.app.Label#isOutline()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Outline();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.nasdanika.vinci.app.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.nasdanika.vinci.app.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see org.nasdanika.vinci.app.Partition
	 * @generated
	 */
	EClass getPartition();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.BootstrapContainerApplication <em>Bootstrap Container Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bootstrap Container Application</em>'.
	 * @see org.nasdanika.vinci.app.BootstrapContainerApplication
	 * @generated
	 */
	EClass getBootstrapContainerApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#isFluid <em>Fluid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fluid</em>'.
	 * @see org.nasdanika.vinci.app.BootstrapContainerApplication#isFluid()
	 * @see #getBootstrapContainerApplication()
	 * @generated
	 */
	EAttribute getBootstrapContainerApplication_Fluid();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#isRouter <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Router</em>'.
	 * @see org.nasdanika.vinci.app.BootstrapContainerApplication#isRouter()
	 * @see #getBootstrapContainerApplication()
	 * @generated
	 */
	EAttribute getBootstrapContainerApplication_Router();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.nasdanika.vinci.app.BootstrapContainerApplication#getHeader()
	 * @see #getBootstrapContainerApplication()
	 * @generated
	 */
	EReference getBootstrapContainerApplication_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getNavigationBar <em>Navigation Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Navigation Bar</em>'.
	 * @see org.nasdanika.vinci.app.BootstrapContainerApplication#getNavigationBar()
	 * @see #getBootstrapContainerApplication()
	 * @generated
	 */
	EReference getBootstrapContainerApplication_NavigationBar();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getNavigationPanel <em>Navigation Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Navigation Panel</em>'.
	 * @see org.nasdanika.vinci.app.BootstrapContainerApplication#getNavigationPanel()
	 * @see #getBootstrapContainerApplication()
	 * @generated
	 */
	EReference getBootstrapContainerApplication_NavigationPanel();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getContentPanel <em>Content Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Panel</em>'.
	 * @see org.nasdanika.vinci.app.BootstrapContainerApplication#getContentPanel()
	 * @see #getBootstrapContainerApplication()
	 * @generated
	 */
	EReference getBootstrapContainerApplication_ContentPanel();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer</em>'.
	 * @see org.nasdanika.vinci.app.BootstrapContainerApplication#getFooter()
	 * @see #getBootstrapContainerApplication()
	 * @generated
	 */
	EReference getBootstrapContainerApplication_Footer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getBuilders <em>Builders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Builders</em>'.
	 * @see org.nasdanika.vinci.app.BootstrapContainerApplication#getBuilders()
	 * @see #getBootstrapContainerApplication()
	 * @generated
	 */
	EReference getBootstrapContainerApplication_Builders();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.BootstrapContainerApplicationSection <em>Bootstrap Container Application Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bootstrap Container Application Section</em>'.
	 * @see org.nasdanika.vinci.app.BootstrapContainerApplicationSection
	 * @generated
	 */
	EClass getBootstrapContainerApplicationSection();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.BootstrapContainerApplicationPanel <em>Bootstrap Container Application Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bootstrap Container Application Panel</em>'.
	 * @see org.nasdanika.vinci.app.BootstrapContainerApplicationPanel
	 * @generated
	 */
	EClass getBootstrapContainerApplicationPanel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.app.BootstrapContainerApplicationPanel#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Width</em>'.
	 * @see org.nasdanika.vinci.app.BootstrapContainerApplicationPanel#getWidth()
	 * @see #getBootstrapContainerApplicationPanel()
	 * @generated
	 */
	EReference getBootstrapContainerApplicationPanel_Width();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder <em>Bootstrap Container Application Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bootstrap Container Application Builder</em>'.
	 * @see org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder
	 * @generated
	 */
	EClass getBootstrapContainerApplicationBuilder();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder#createApplicationBuilderSupplier(org.nasdanika.common.Context) <em>Create Application Builder Supplier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Application Builder Supplier</em>' operation.
	 * @see org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder#createApplicationBuilderSupplier(org.nasdanika.common.Context)
	 * @generated
	 */
	EOperation getBootstrapContainerApplicationBuilder__CreateApplicationBuilderSupplier__Context();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.ActionMapping <em>Action Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Mapping</em>'.
	 * @see org.nasdanika.vinci.app.ActionMapping
	 * @generated
	 */
	EClass getActionMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionMapping#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.nasdanika.vinci.app.ActionMapping#getAlias()
	 * @see #getActionMapping()
	 * @generated
	 */
	EAttribute getActionMapping_Alias();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.vinci.app.ActionMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.vinci.app.ActionMapping#getTarget()
	 * @see #getActionMapping()
	 * @generated
	 */
	EReference getActionMapping_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionMapping#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.vinci.app.ActionMapping#getDescription()
	 * @see #getActionMapping()
	 * @generated
	 */
	EAttribute getActionMapping_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.ActionLink <em>Action Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Link</em>'.
	 * @see org.nasdanika.vinci.app.ActionLink
	 * @generated
	 */
	EClass getActionLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionLink#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.vinci.app.ActionLink#getTitle()
	 * @see #getActionLink()
	 * @generated
	 */
	EAttribute getActionLink_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionLink#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.vinci.app.ActionLink#getDescription()
	 * @see #getActionLink()
	 * @generated
	 */
	EAttribute getActionLink_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionLink#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.nasdanika.vinci.app.ActionLink#getRef()
	 * @see #getActionLink()
	 * @generated
	 */
	EAttribute getActionLink_Ref();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.ActionReference <em>Action Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Reference</em>'.
	 * @see org.nasdanika.vinci.app.ActionReference
	 * @generated
	 */
	EClass getActionReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionReference#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.vinci.app.ActionReference#getTitle()
	 * @see #getActionReference()
	 * @generated
	 */
	EAttribute getActionReference_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionReference#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.vinci.app.ActionReference#getDescription()
	 * @see #getActionReference()
	 * @generated
	 */
	EAttribute getActionReference_Description();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.vinci.app.ActionReference#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see org.nasdanika.vinci.app.ActionReference#getAction()
	 * @see #getActionReference()
	 * @generated
	 */
	EReference getActionReference_Action();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.vinci.app.ActionRole <em>Action Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Role</em>'.
	 * @see org.nasdanika.vinci.app.ActionRole
	 * @generated
	 */
	EEnum getActionRole();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.vinci.app.ActivatorType <em>Activator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activator Type</em>'.
	 * @see org.nasdanika.vinci.app.ActivatorType
	 * @generated
	 */
	EEnum getActivatorType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.ActionElement <em>Action Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Element</em>'.
	 * @see org.nasdanika.vinci.app.ActionElement
	 * @generated
	 */
	EClass getActionElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.AbstractAction <em>Abstract Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Action</em>'.
	 * @see org.nasdanika.vinci.app.AbstractAction
	 * @generated
	 */
	EClass getAbstractAction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.app.AbstractAction#getActionMappings <em>Action Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Mappings</em>'.
	 * @see org.nasdanika.vinci.app.AbstractAction#getActionMappings()
	 * @see #getAbstractAction()
	 * @generated
	 */
	EReference getAbstractAction_ActionMappings();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.ActionCategory <em>Action Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Category</em>'.
	 * @see org.nasdanika.vinci.app.ActionCategory
	 * @generated
	 */
	EClass getActionCategory();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.ActionBase <em>Action Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Base</em>'.
	 * @see org.nasdanika.vinci.app.ActionBase
	 * @generated
	 */
	EClass getActionBase();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionBase#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.nasdanika.vinci.app.ActionBase#getRole()
	 * @see #getActionBase()
	 * @generated
	 */
	EAttribute getActionBase_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionBase#getSectionStyle <em>Section Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Style</em>'.
	 * @see org.nasdanika.vinci.app.ActionBase#getSectionStyle()
	 * @see #getActionBase()
	 * @generated
	 */
	EAttribute getActionBase_SectionStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionBase#getSectionColumns <em>Section Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Columns</em>'.
	 * @see org.nasdanika.vinci.app.ActionBase#getSectionColumns()
	 * @see #getActionBase()
	 * @generated
	 */
	EAttribute getActionBase_SectionColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionBase#getActivator <em>Activator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activator</em>'.
	 * @see org.nasdanika.vinci.app.ActionBase#getActivator()
	 * @see #getActionBase()
	 * @generated
	 */
	EAttribute getActionBase_Activator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionBase#getActivatorType <em>Activator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activator Type</em>'.
	 * @see org.nasdanika.vinci.app.ActionBase#getActivatorType()
	 * @see #getActionBase()
	 * @generated
	 */
	EAttribute getActionBase_ActivatorType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionBase#getConfirmation <em>Confirmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirmation</em>'.
	 * @see org.nasdanika.vinci.app.ActionBase#getConfirmation()
	 * @see #getActionBase()
	 * @generated
	 */
	EAttribute getActionBase_Confirmation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionBase#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.vinci.app.ActionBase#isDisabled()
	 * @see #getActionBase()
	 * @generated
	 */
	EAttribute getActionBase_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionBase#isEmbedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embedded</em>'.
	 * @see org.nasdanika.vinci.app.ActionBase#isEmbedded()
	 * @see #getActionBase()
	 * @generated
	 */
	EAttribute getActionBase_Embedded();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.ActionBase#getMarkdownContent <em>Markdown Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Markdown Content</em>'.
	 * @see org.nasdanika.vinci.app.ActionBase#getMarkdownContent()
	 * @see #getActionBase()
	 * @generated
	 */
	EAttribute getActionBase_MarkdownContent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.app.ActionBase#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.nasdanika.vinci.app.ActionBase#getContent()
	 * @see #getActionBase()
	 * @generated
	 */
	EReference getActionBase_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.nasdanika.vinci.app.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.app.Container#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.vinci.app.Container#getElements()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Elements();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.vinci.app.Container#getLinkedElements <em>Linked Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Elements</em>'.
	 * @see org.nasdanika.vinci.app.Container#getLinkedElements()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_LinkedElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AppFactory getAppFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.impl.LabelImpl
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__COLOR = eINSTANCE.getLabel_Color();

		/**
		 * The meta object literal for the '<em><b>Notification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__NOTIFICATION = eINSTANCE.getLabel_Notification();

		/**
		 * The meta object literal for the '<em><b>Appearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__APPEARANCE = eINSTANCE.getLabel_Appearance();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT = eINSTANCE.getLabel_Text();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__ICON = eINSTANCE.getLabel_Icon();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TOOLTIP = eINSTANCE.getLabel_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__OUTLINE = eINSTANCE.getLabel_Outline();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.impl.CategoryImpl
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.impl.ActionImpl
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.impl.PartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.impl.PartitionImpl
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getPartition()
		 * @generated
		 */
		EClass PARTITION = eINSTANCE.getPartition();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationImpl <em>Bootstrap Container Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.impl.BootstrapContainerApplicationImpl
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getBootstrapContainerApplication()
		 * @generated
		 */
		EClass BOOTSTRAP_CONTAINER_APPLICATION = eINSTANCE.getBootstrapContainerApplication();

		/**
		 * The meta object literal for the '<em><b>Fluid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAP_CONTAINER_APPLICATION__FLUID = eINSTANCE.getBootstrapContainerApplication_Fluid();

		/**
		 * The meta object literal for the '<em><b>Router</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAP_CONTAINER_APPLICATION__ROUTER = eINSTANCE.getBootstrapContainerApplication_Router();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOTSTRAP_CONTAINER_APPLICATION__HEADER = eINSTANCE.getBootstrapContainerApplication_Header();

		/**
		 * The meta object literal for the '<em><b>Navigation Bar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR = eINSTANCE.getBootstrapContainerApplication_NavigationBar();

		/**
		 * The meta object literal for the '<em><b>Navigation Panel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL = eINSTANCE.getBootstrapContainerApplication_NavigationPanel();

		/**
		 * The meta object literal for the '<em><b>Content Panel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL = eINSTANCE.getBootstrapContainerApplication_ContentPanel();

		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOTSTRAP_CONTAINER_APPLICATION__FOOTER = eINSTANCE.getBootstrapContainerApplication_Footer();

		/**
		 * The meta object literal for the '<em><b>Builders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS = eINSTANCE.getBootstrapContainerApplication_Builders();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationSectionImpl <em>Bootstrap Container Application Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.impl.BootstrapContainerApplicationSectionImpl
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getBootstrapContainerApplicationSection()
		 * @generated
		 */
		EClass BOOTSTRAP_CONTAINER_APPLICATION_SECTION = eINSTANCE.getBootstrapContainerApplicationSection();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationPanelImpl <em>Bootstrap Container Application Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.impl.BootstrapContainerApplicationPanelImpl
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getBootstrapContainerApplicationPanel()
		 * @generated
		 */
		EClass BOOTSTRAP_CONTAINER_APPLICATION_PANEL = eINSTANCE.getBootstrapContainerApplicationPanel();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOTSTRAP_CONTAINER_APPLICATION_PANEL__WIDTH = eINSTANCE.getBootstrapContainerApplicationPanel_Width();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder <em>Bootstrap Container Application Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getBootstrapContainerApplicationBuilder()
		 * @generated
		 */
		EClass BOOTSTRAP_CONTAINER_APPLICATION_BUILDER = eINSTANCE.getBootstrapContainerApplicationBuilder();

		/**
		 * The meta object literal for the '<em><b>Create Application Builder Supplier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOTSTRAP_CONTAINER_APPLICATION_BUILDER___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT = eINSTANCE.getBootstrapContainerApplicationBuilder__CreateApplicationBuilderSupplier__Context();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.impl.ActionMappingImpl <em>Action Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.impl.ActionMappingImpl
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionMapping()
		 * @generated
		 */
		EClass ACTION_MAPPING = eINSTANCE.getActionMapping();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_MAPPING__ALIAS = eINSTANCE.getActionMapping_Alias();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_MAPPING__TARGET = eINSTANCE.getActionMapping_Target();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_MAPPING__DESCRIPTION = eINSTANCE.getActionMapping_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.impl.ActionLinkImpl <em>Action Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.impl.ActionLinkImpl
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionLink()
		 * @generated
		 */
		EClass ACTION_LINK = eINSTANCE.getActionLink();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_LINK__TITLE = eINSTANCE.getActionLink_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_LINK__DESCRIPTION = eINSTANCE.getActionLink_Description();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_LINK__REF = eINSTANCE.getActionLink_Ref();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.impl.ActionReferenceImpl <em>Action Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.impl.ActionReferenceImpl
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionReference()
		 * @generated
		 */
		EClass ACTION_REFERENCE = eINSTANCE.getActionReference();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_REFERENCE__TITLE = eINSTANCE.getActionReference_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_REFERENCE__DESCRIPTION = eINSTANCE.getActionReference_Description();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_REFERENCE__ACTION = eINSTANCE.getActionReference_Action();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.ActionRole <em>Action Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.ActionRole
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionRole()
		 * @generated
		 */
		EEnum ACTION_ROLE = eINSTANCE.getActionRole();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.ActivatorType <em>Activator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.ActivatorType
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActivatorType()
		 * @generated
		 */
		EEnum ACTIVATOR_TYPE = eINSTANCE.getActivatorType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.ActionElement <em>Action Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.ActionElement
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionElement()
		 * @generated
		 */
		EClass ACTION_ELEMENT = eINSTANCE.getActionElement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.AbstractAction <em>Abstract Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.AbstractAction
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getAbstractAction()
		 * @generated
		 */
		EClass ABSTRACT_ACTION = eINSTANCE.getAbstractAction();

		/**
		 * The meta object literal for the '<em><b>Action Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTION__ACTION_MAPPINGS = eINSTANCE.getAbstractAction_ActionMappings();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.impl.ActionCategoryImpl <em>Action Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.impl.ActionCategoryImpl
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionCategory()
		 * @generated
		 */
		EClass ACTION_CATEGORY = eINSTANCE.getActionCategory();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.impl.ActionBaseImpl <em>Action Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.impl.ActionBaseImpl
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionBase()
		 * @generated
		 */
		EClass ACTION_BASE = eINSTANCE.getActionBase();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BASE__ROLE = eINSTANCE.getActionBase_Role();

		/**
		 * The meta object literal for the '<em><b>Section Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BASE__SECTION_STYLE = eINSTANCE.getActionBase_SectionStyle();

		/**
		 * The meta object literal for the '<em><b>Section Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BASE__SECTION_COLUMNS = eINSTANCE.getActionBase_SectionColumns();

		/**
		 * The meta object literal for the '<em><b>Activator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BASE__ACTIVATOR = eINSTANCE.getActionBase_Activator();

		/**
		 * The meta object literal for the '<em><b>Activator Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BASE__ACTIVATOR_TYPE = eINSTANCE.getActionBase_ActivatorType();

		/**
		 * The meta object literal for the '<em><b>Confirmation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BASE__CONFIRMATION = eINSTANCE.getActionBase_Confirmation();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BASE__DISABLED = eINSTANCE.getActionBase_Disabled();

		/**
		 * The meta object literal for the '<em><b>Embedded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BASE__EMBEDDED = eINSTANCE.getActionBase_Embedded();

		/**
		 * The meta object literal for the '<em><b>Markdown Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BASE__MARKDOWN_CONTENT = eINSTANCE.getActionBase_MarkdownContent();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BASE__CONTENT = eINSTANCE.getActionBase_Content();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.Container <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.Container
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ELEMENTS = eINSTANCE.getContainer_Elements();

		/**
		 * The meta object literal for the '<em><b>Linked Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__LINKED_ELEMENTS = eINSTANCE.getContainer_LinkedElements();

	}

} //AppPackage
