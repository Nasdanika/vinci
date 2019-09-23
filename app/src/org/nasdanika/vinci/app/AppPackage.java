/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.codegen.CodegenPackage;

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
	int LABEL = 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.CategoryImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 4;

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
	int ACTION_MAPPING = 11;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.ActionLinkImpl <em>Action Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.ActionLinkImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionLink()
	 * @generated
	 */
	int ACTION_LINK = 12;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.ActionReferenceImpl <em>Action Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.ActionReferenceImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionReference()
	 * @generated
	 */
	int ACTION_REFERENCE = 13;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.MapElement <em>Map Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.MapElement
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getMapElement()
	 * @generated
	 */
	int MAP_ELEMENT = 5;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.AbstractActionParent <em>Abstract Action Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.AbstractActionParent
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getAbstractActionParent()
	 * @generated
	 */
	int ABSTRACT_ACTION_PARENT = 6;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.ActionElement <em>Action Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.ActionElement
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionElement()
	 * @generated
	 */
	int ACTION_ELEMENT = 7;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.AbstractAction <em>Abstract Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.AbstractAction
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getAbstractAction()
	 * @generated
	 */
	int ABSTRACT_ACTION = 8;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.impl.ActionCategoryImpl <em>Action Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.impl.ActionCategoryImpl
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionCategory()
	 * @generated
	 */
	int ACTION_CATEGORY = 9;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.LabelSpec <em>Label Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.LabelSpec
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getLabelSpec()
	 * @generated
	 */
	int LABEL_SPEC = 0;

	/**
	 * The number of structural features of the '<em>Label Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SPEC_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Label Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.ActionSpec <em>Action Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.ActionSpec
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionSpec()
	 * @generated
	 */
	int ACTION_SPEC = 1;

	/**
	 * The number of structural features of the '<em>Action Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC_FEATURE_COUNT = LABEL_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SPEC_OPERATION_COUNT = LABEL_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.Container <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.Container
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ELEMENTS = 0;

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
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COLOR = CodegenPackage.WORK_FACTORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID = CodegenPackage.WORK_FACTORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NOTIFICATION = CodegenPackage.WORK_FACTORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = CodegenPackage.WORK_FACTORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__DESCRIPTION = CodegenPackage.WORK_FACTORY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TOOLTIP = CodegenPackage.WORK_FACTORY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__OUTLINE = CodegenPackage.WORK_FACTORY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = CodegenPackage.WORK_FACTORY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = CodegenPackage.WORK_FACTORY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__COLOR = LABEL__COLOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ID = LABEL__ID;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NOTIFICATION = LABEL__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TEXT = LABEL__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTION = LABEL__DESCRIPTION;

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
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ELEMENTS = LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = LABEL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__PARENT = 0;

	/**
	 * The number of structural features of the '<em>Map Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Map Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Abstract Action Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_PARENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Action Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_PARENT_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__PARENT = ACTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_FEATURE_COUNT = ACTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_OPERATION_COUNT = ACTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__COLOR = CATEGORY__COLOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__ID = CATEGORY__ID;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__NOTIFICATION = CATEGORY__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__TEXT = CATEGORY__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__DESCRIPTION = CATEGORY__DESCRIPTION;

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
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__ELEMENTS = CATEGORY__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__PARENT = CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY_OPERATION_COUNT = CATEGORY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__COLOR = LABEL__COLOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = LABEL__ID;

	/**
	 * The feature id for the '<em><b>Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NOTIFICATION = LABEL__NOTIFICATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TEXT = LABEL__TEXT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = LABEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TOOLTIP = LABEL__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTLINE = LABEL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARENT = LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ELEMENTS = LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_MAPPINGS = LABEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ROLE = LABEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Section Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SECTION_STYLE = LABEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Activator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIVATOR = LABEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Activator Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIVATOR_TYPE = LABEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Confirmation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONFIRMATION = LABEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DISABLED = LABEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Float Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FLOAT_RIGHT = LABEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__EMBEDDED = LABEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTENT = LABEL_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = LABEL_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = LABEL_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__PARENT = ABSTRACT_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__DESCRIPTION = ABSTRACT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK__REF = ABSTRACT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK_FEATURE_COUNT = ABSTRACT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LINK_OPERATION_COUNT = ABSTRACT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE__PARENT = ABSTRACT_ACTION__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE__DESCRIPTION = ABSTRACT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE__ACTION = ABSTRACT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE_FEATURE_COUNT = ABSTRACT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REFERENCE_OPERATION_COUNT = ABSTRACT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.ActionRole <em>Action Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.ActionRole
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionRole()
	 * @generated
	 */
	int ACTION_ROLE = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.SectionStyle <em>Section Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.SectionStyle
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getSectionStyle()
	 * @generated
	 */
	int SECTION_STYLE = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.app.ActivatorType <em>Activator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.app.ActivatorType
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActivatorType()
	 * @generated
	 */
	int ACTIVATOR_TYPE = 16;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.bootstrap.Color
	 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 17;


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
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Label#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.vinci.app.Label#getId()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Id();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Label#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.vinci.app.Label#getDescription()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Description();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.app.Action#getActionMappings <em>Action Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Mappings</em>'.
	 * @see org.nasdanika.vinci.app.Action#getActionMappings()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ActionMappings();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Action#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.nasdanika.vinci.app.Action#getRole()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Action#getSectionStyle <em>Section Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Style</em>'.
	 * @see org.nasdanika.vinci.app.Action#getSectionStyle()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_SectionStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Action#getActivator <em>Activator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activator</em>'.
	 * @see org.nasdanika.vinci.app.Action#getActivator()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Activator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Action#getActivatorType <em>Activator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activator Type</em>'.
	 * @see org.nasdanika.vinci.app.Action#getActivatorType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActivatorType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Action#getConfirmation <em>Confirmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirmation</em>'.
	 * @see org.nasdanika.vinci.app.Action#getConfirmation()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Confirmation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Action#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.vinci.app.Action#isDisabled()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Action#isFloatRight <em>Float Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float Right</em>'.
	 * @see org.nasdanika.vinci.app.Action#isFloatRight()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_FloatRight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.app.Action#isEmbedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embedded</em>'.
	 * @see org.nasdanika.vinci.app.Action#isEmbedded()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Embedded();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.app.Action#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.nasdanika.vinci.app.Action#getContent()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Content();

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
	 * Returns the meta object for enum '{@link org.nasdanika.vinci.app.SectionStyle <em>Section Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Section Style</em>'.
	 * @see org.nasdanika.vinci.app.SectionStyle
	 * @generated
	 */
	EEnum getSectionStyle();

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
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.MapElement <em>Map Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Element</em>'.
	 * @see org.nasdanika.vinci.app.MapElement
	 * @generated
	 */
	EClass getMapElement();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.vinci.app.MapElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.nasdanika.vinci.app.MapElement#getParent()
	 * @see #getMapElement()
	 * @generated
	 */
	EReference getMapElement_Parent();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.AbstractActionParent <em>Abstract Action Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Action Parent</em>'.
	 * @see org.nasdanika.vinci.app.AbstractActionParent
	 * @generated
	 */
	EClass getAbstractActionParent();

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
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.ActionCategory <em>Action Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Category</em>'.
	 * @see org.nasdanika.vinci.app.ActionCategory
	 * @generated
	 */
	EClass getActionCategory();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.LabelSpec <em>Label Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Spec</em>'.
	 * @see org.nasdanika.vinci.app.LabelSpec
	 * @model instanceClass="org.nasdanika.vinci.app.LabelSpec"
	 * @generated
	 */
	EClass getLabelSpec();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.app.ActionSpec <em>Action Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Spec</em>'.
	 * @see org.nasdanika.vinci.app.ActionSpec
	 * @model instanceClass="org.nasdanika.vinci.app.ActionSpec" superTypes="org.nasdanika.vinci.app.LabelSpec"
	 * @generated
	 */
	EClass getActionSpec();

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
	 * Returns the meta object for data type '{@link org.nasdanika.html.bootstrap.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bootstrap color.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see org.nasdanika.html.bootstrap.Color
	 * @model instanceClass="org.nasdanika.html.bootstrap.Color"
	 * @generated
	 */
	EDataType getColor();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__ID = eINSTANCE.getLabel_Id();

		/**
		 * The meta object literal for the '<em><b>Notification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__NOTIFICATION = eINSTANCE.getLabel_Notification();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT = eINSTANCE.getLabel_Text();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__DESCRIPTION = eINSTANCE.getLabel_Description();

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
		 * The meta object literal for the '<em><b>Action Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTION_MAPPINGS = eINSTANCE.getAction_ActionMappings();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ROLE = eINSTANCE.getAction_Role();

		/**
		 * The meta object literal for the '<em><b>Section Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__SECTION_STYLE = eINSTANCE.getAction_SectionStyle();

		/**
		 * The meta object literal for the '<em><b>Activator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTIVATOR = eINSTANCE.getAction_Activator();

		/**
		 * The meta object literal for the '<em><b>Activator Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTIVATOR_TYPE = eINSTANCE.getAction_ActivatorType();

		/**
		 * The meta object literal for the '<em><b>Confirmation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__CONFIRMATION = eINSTANCE.getAction_Confirmation();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DISABLED = eINSTANCE.getAction_Disabled();

		/**
		 * The meta object literal for the '<em><b>Float Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__FLOAT_RIGHT = eINSTANCE.getAction_FloatRight();

		/**
		 * The meta object literal for the '<em><b>Embedded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__EMBEDDED = eINSTANCE.getAction_Embedded();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CONTENT = eINSTANCE.getAction_Content();

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
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.SectionStyle <em>Section Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.SectionStyle
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getSectionStyle()
		 * @generated
		 */
		EEnum SECTION_STYLE = eINSTANCE.getSectionStyle();

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
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.MapElement <em>Map Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.MapElement
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getMapElement()
		 * @generated
		 */
		EClass MAP_ELEMENT = eINSTANCE.getMapElement();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ELEMENT__PARENT = eINSTANCE.getMapElement_Parent();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.AbstractActionParent <em>Abstract Action Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.AbstractActionParent
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getAbstractActionParent()
		 * @generated
		 */
		EClass ABSTRACT_ACTION_PARENT = eINSTANCE.getAbstractActionParent();

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
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.impl.ActionCategoryImpl <em>Action Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.impl.ActionCategoryImpl
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionCategory()
		 * @generated
		 */
		EClass ACTION_CATEGORY = eINSTANCE.getActionCategory();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.LabelSpec <em>Label Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.LabelSpec
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getLabelSpec()
		 * @generated
		 */
		EClass LABEL_SPEC = eINSTANCE.getLabelSpec();

		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.app.ActionSpec <em>Action Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.app.ActionSpec
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getActionSpec()
		 * @generated
		 */
		EClass ACTION_SPEC = eINSTANCE.getActionSpec();

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
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.bootstrap.Color
		 * @see org.nasdanika.vinci.app.impl.AppPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

	}

} //AppPackage
