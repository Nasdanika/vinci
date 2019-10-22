/**
 */
package org.nasdanika.vinci.bootstrap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT__TITLE = HtmlPackage.HTML_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT__DESCRIPTION = HtmlPackage.HTML_ELEMENT__DESCRIPTION;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TITLE = BOOTSTRAP_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = BOOTSTRAP_ELEMENT__DESCRIPTION;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__TITLE = BOOTSTRAP_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__DESCRIPTION = BOOTSTRAP_ELEMENT__DESCRIPTION;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TITLE = BOOTSTRAP_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DESCRIPTION = BOOTSTRAP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CONTENT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TITLE = BOOTSTRAP_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__DESCRIPTION = BOOTSTRAP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__HEADER = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__BODY = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__FOOTER = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.TagImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__TITLE = HtmlPackage.TAG__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DESCRIPTION = HtmlPackage.TAG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__CONTENT = HtmlPackage.TAG__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = HtmlPackage.TAG__NAME;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = HtmlPackage.TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = HtmlPackage.TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.DivImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__TITLE = TAG__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__DESCRIPTION = TAG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__CONTENT = TAG__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__NAME = TAG__NAME;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = TAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.AlertImpl <em>Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.AlertImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getAlert()
	 * @generated
	 */
	int ALERT = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__TITLE = DIV__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__DESCRIPTION = DIV__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__CONTENT = DIV__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__NAME = DIV__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__COLOR = DIV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_FEATURE_COUNT = DIV_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_OPERATION_COUNT = DIV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.BadgeImpl <em>Badge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.BadgeImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getBadge()
	 * @generated
	 */
	int BADGE = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__TITLE = DIV__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__DESCRIPTION = DIV__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__CONTENT = DIV__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__NAME = DIV__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__COLOR = DIV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Badge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_FEATURE_COUNT = DIV_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Badge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_OPERATION_COUNT = DIV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ButtonImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TITLE = DIV__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__DESCRIPTION = DIV__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CONTENT = DIV__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = DIV__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__COLOR = DIV_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__OUTLINE = DIV_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = DIV_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = DIV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ButtonGroupImpl <em>Button Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ButtonGroupImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getButtonGroup()
	 * @generated
	 */
	int BUTTON_GROUP = 10;

	/**
	 * The number of structural features of the '<em>Button Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Button Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ButtonToolbarImpl <em>Button Toolbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ButtonToolbarImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getButtonToolbar()
	 * @generated
	 */
	int BUTTON_TOOLBAR = 11;

	/**
	 * The number of structural features of the '<em>Button Toolbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TOOLBAR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Button Toolbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_TOOLBAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.DropdownImpl <em>Dropdown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.DropdownImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getDropdown()
	 * @generated
	 */
	int DROPDOWN = 12;

	/**
	 * The number of structural features of the '<em>Dropdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dropdown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPDOWN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ActionGroupImpl <em>Action Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ActionGroupImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getActionGroup()
	 * @generated
	 */
	int ACTION_GROUP = 13;

	/**
	 * The number of structural features of the '<em>Action Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.BreadcrumbsImpl <em>Breadcrumbs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.BreadcrumbsImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getBreadcrumbs()
	 * @generated
	 */
	int BREADCRUMBS = 14;

	/**
	 * The number of structural features of the '<em>Breadcrumbs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Breadcrumbs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.FormImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 15;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ListGroupImpl <em>List Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ListGroupImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getListGroup()
	 * @generated
	 */
	int LIST_GROUP = 16;

	/**
	 * The number of structural features of the '<em>List Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>List Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.NavsImpl <em>Navs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.NavsImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getNavs()
	 * @generated
	 */
	int NAVS = 17;

	/**
	 * The number of structural features of the '<em>Navs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Navs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.NavbarImpl <em>Navbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.NavbarImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getNavbar()
	 * @generated
	 */
	int NAVBAR = 18;

	/**
	 * The number of structural features of the '<em>Navbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Navbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVBAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.TableImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 19;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.TableRowImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 20;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.TableColumnImpl <em>Table Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.TableColumnImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTableColumn()
	 * @generated
	 */
	int TABLE_COLUMN = 21;

	/**
	 * The number of structural features of the '<em>Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.TooltipImpl <em>Tooltip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.TooltipImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTooltip()
	 * @generated
	 */
	int TOOLTIP = 22;

	/**
	 * The number of structural features of the '<em>Tooltip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tooltip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.InputGroupImpl <em>Input Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.InputGroupImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getInputGroup()
	 * @generated
	 */
	int INPUT_GROUP = 23;

	/**
	 * The number of structural features of the '<em>Input Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Input Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.FormGroupImpl <em>Form Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.FormGroupImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getFormGroup()
	 * @generated
	 */
	int FORM_GROUP = 24;

	/**
	 * The number of structural features of the '<em>Form Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Form Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.CollapseImpl <em>Collapse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.CollapseImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getCollapse()
	 * @generated
	 */
	int COLLAPSE = 25;

	/**
	 * The number of structural features of the '<em>Collapse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Collapse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLAPSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ModalImpl <em>Modal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ModalImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getModal()
	 * @generated
	 */
	int MODAL = 26;

	/**
	 * The number of structural features of the '<em>Modal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Modal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.AccordionImpl <em>Accordion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.AccordionImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getAccordion()
	 * @generated
	 */
	int ACCORDION = 27;

	/**
	 * The number of structural features of the '<em>Accordion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Accordion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCORDION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>IBootstrap Element</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.bootstrap.BootstrapElement
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getIBootstrapElement()
	 * @generated
	 */
	int IBOOTSTRAP_ELEMENT = 28;


	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.bootstrap.Color
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 29;


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
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.bootstrap.Card#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
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
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.bootstrap.Card#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Card#getFooter()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Footer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Alert <em>Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Alert
	 * @generated
	 */
	EClass getAlert();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Alert#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Alert#getColor()
	 * @see #getAlert()
	 * @generated
	 */
	EAttribute getAlert_Color();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Badge <em>Badge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Badge</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Badge
	 * @generated
	 */
	EClass getBadge();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Badge#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Badge#getColor()
	 * @see #getBadge()
	 * @generated
	 */
	EAttribute getBadge_Color();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Button#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Button#getColor()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Button#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Button#isOutline()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Outline();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.ButtonGroup <em>Button Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Group</em>'.
	 * @see org.nasdanika.vinci.bootstrap.ButtonGroup
	 * @generated
	 */
	EClass getButtonGroup();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.ButtonToolbar <em>Button Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Toolbar</em>'.
	 * @see org.nasdanika.vinci.bootstrap.ButtonToolbar
	 * @generated
	 */
	EClass getButtonToolbar();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Dropdown <em>Dropdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dropdown</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Dropdown
	 * @generated
	 */
	EClass getDropdown();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.ActionGroup <em>Action Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Group</em>'.
	 * @see org.nasdanika.vinci.bootstrap.ActionGroup
	 * @generated
	 */
	EClass getActionGroup();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Breadcrumbs <em>Breadcrumbs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breadcrumbs</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Breadcrumbs
	 * @generated
	 */
	EClass getBreadcrumbs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.ListGroup <em>List Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Group</em>'.
	 * @see org.nasdanika.vinci.bootstrap.ListGroup
	 * @generated
	 */
	EClass getListGroup();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Navs <em>Navs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navs</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Navs
	 * @generated
	 */
	EClass getNavs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Navbar <em>Navbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navbar</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Navbar
	 * @generated
	 */
	EClass getNavbar();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.TableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Column</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableColumn
	 * @generated
	 */
	EClass getTableColumn();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Tooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tooltip</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Tooltip
	 * @generated
	 */
	EClass getTooltip();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.InputGroup <em>Input Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Group</em>'.
	 * @see org.nasdanika.vinci.bootstrap.InputGroup
	 * @generated
	 */
	EClass getInputGroup();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.FormGroup <em>Form Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Group</em>'.
	 * @see org.nasdanika.vinci.bootstrap.FormGroup
	 * @generated
	 */
	EClass getFormGroup();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Collapse <em>Collapse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collapse</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Collapse
	 * @generated
	 */
	EClass getCollapse();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Modal <em>Modal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modal</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Modal
	 * @generated
	 */
	EClass getModal();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Accordion <em>Accordion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accordion</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Accordion
	 * @generated
	 */
	EClass getAccordion();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.html.bootstrap.BootstrapElement <em>IBootstrap Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IBootstrap Element</em>'.
	 * @see org.nasdanika.html.bootstrap.BootstrapElement
	 * @model instanceClass="org.nasdanika.html.bootstrap.BootstrapElement"
	 * @generated
	 */
	EDataType getIBootstrapElement();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.html.bootstrap.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Footer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__FOOTER = eINSTANCE.getCard_Footer();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.TagImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.DivImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.AlertImpl <em>Alert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.AlertImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getAlert()
		 * @generated
		 */
		EClass ALERT = eINSTANCE.getAlert();
		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALERT__COLOR = eINSTANCE.getAlert_Color();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.BadgeImpl <em>Badge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.BadgeImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getBadge()
		 * @generated
		 */
		EClass BADGE = eINSTANCE.getBadge();
		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE__COLOR = eINSTANCE.getBadge_Color();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.ButtonImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();
		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__COLOR = eINSTANCE.getButton_Color();
		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__OUTLINE = eINSTANCE.getButton_Outline();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.ButtonGroupImpl <em>Button Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.ButtonGroupImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getButtonGroup()
		 * @generated
		 */
		EClass BUTTON_GROUP = eINSTANCE.getButtonGroup();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.ButtonToolbarImpl <em>Button Toolbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.ButtonToolbarImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getButtonToolbar()
		 * @generated
		 */
		EClass BUTTON_TOOLBAR = eINSTANCE.getButtonToolbar();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.DropdownImpl <em>Dropdown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.DropdownImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getDropdown()
		 * @generated
		 */
		EClass DROPDOWN = eINSTANCE.getDropdown();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.ActionGroupImpl <em>Action Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.ActionGroupImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getActionGroup()
		 * @generated
		 */
		EClass ACTION_GROUP = eINSTANCE.getActionGroup();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.BreadcrumbsImpl <em>Breadcrumbs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.BreadcrumbsImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getBreadcrumbs()
		 * @generated
		 */
		EClass BREADCRUMBS = eINSTANCE.getBreadcrumbs();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.FormImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.ListGroupImpl <em>List Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.ListGroupImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getListGroup()
		 * @generated
		 */
		EClass LIST_GROUP = eINSTANCE.getListGroup();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.NavsImpl <em>Navs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.NavsImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getNavs()
		 * @generated
		 */
		EClass NAVS = eINSTANCE.getNavs();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.NavbarImpl <em>Navbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.NavbarImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getNavbar()
		 * @generated
		 */
		EClass NAVBAR = eINSTANCE.getNavbar();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.TableImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.TableRowImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.TableColumnImpl <em>Table Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.TableColumnImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTableColumn()
		 * @generated
		 */
		EClass TABLE_COLUMN = eINSTANCE.getTableColumn();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.TooltipImpl <em>Tooltip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.TooltipImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTooltip()
		 * @generated
		 */
		EClass TOOLTIP = eINSTANCE.getTooltip();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.InputGroupImpl <em>Input Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.InputGroupImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getInputGroup()
		 * @generated
		 */
		EClass INPUT_GROUP = eINSTANCE.getInputGroup();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.FormGroupImpl <em>Form Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.FormGroupImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getFormGroup()
		 * @generated
		 */
		EClass FORM_GROUP = eINSTANCE.getFormGroup();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.CollapseImpl <em>Collapse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.CollapseImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getCollapse()
		 * @generated
		 */
		EClass COLLAPSE = eINSTANCE.getCollapse();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.ModalImpl <em>Modal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.ModalImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getModal()
		 * @generated
		 */
		EClass MODAL = eINSTANCE.getModal();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.AccordionImpl <em>Accordion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.AccordionImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getAccordion()
		 * @generated
		 */
		EClass ACCORDION = eINSTANCE.getAccordion();
		/**
		 * The meta object literal for the '<em>IBootstrap Element</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.bootstrap.BootstrapElement
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getIBootstrapElement()
		 * @generated
		 */
		EDataType IBOOTSTRAP_ELEMENT = eINSTANCE.getIBootstrapElement();
		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.bootstrap.Color
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

	}

} //BootstrapPackage
