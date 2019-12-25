/**
 */
package org.nasdanika.vinci.bootstrap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.nasdanika.ncore.NcorePackage;
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
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.BootstrapPageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPageImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getBootstrapPage()
	 * @generated
	 */
	int BOOTSTRAP_PAGE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE__TITLE = HtmlPackage.PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE__DESCRIPTION = HtmlPackage.PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE__NAME = HtmlPackage.PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE__HEAD = HtmlPackage.PAGE__HEAD;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE__BODY = HtmlPackage.PAGE__BODY;

	/**
	 * The feature id for the '<em><b>Builders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE__BUILDERS = HtmlPackage.PAGE__BUILDERS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE__LANGUAGE = HtmlPackage.PAGE__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Stylesheets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE__STYLESHEETS = HtmlPackage.PAGE__STYLESHEETS;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE__SCRIPTS = HtmlPackage.PAGE__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Font Awesome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE__FONT_AWESOME = HtmlPackage.PAGE__FONT_AWESOME;

	/**
	 * The feature id for the '<em><b>Js Tree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE__JS_TREE = HtmlPackage.PAGE__JS_TREE;

	/**
	 * The feature id for the '<em><b>Github Markdown Css</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE__GITHUB_MARKDOWN_CSS = HtmlPackage.PAGE__GITHUB_MARKDOWN_CSS;

	/**
	 * The feature id for the '<em><b>Cdn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE__CDN = HtmlPackage.PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE__THEME = HtmlPackage.PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE_FEATURE_COUNT = HtmlPackage.PAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_PAGE_OPERATION_COUNT = HtmlPackage.PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.AppearanceImpl <em>Appearance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.AppearanceImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getAppearance()
	 * @generated
	 */
	int APPEARANCE = 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__BACKGROUND = NcorePackage.ICONSUMER_FACTORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__ATTRIBUTES = NcorePackage.ICONSUMER_FACTORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Border</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__BORDER = NcorePackage.ICONSUMER_FACTORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__MARGIN = NcorePackage.ICONSUMER_FACTORY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__PADDING = NcorePackage.ICONSUMER_FACTORY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__TEXT = NcorePackage.ICONSUMER_FACTORY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__FLOAT = NcorePackage.ICONSUMER_FACTORY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Appearance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_FEATURE_COUNT = NcorePackage.ICONSUMER_FACTORY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Appearance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_OPERATION_COUNT = NcorePackage.ICONSUMER_FACTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.BorderImpl <em>Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.BorderImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getBorder()
	 * @generated
	 */
	int BORDER = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__TOP = 1;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__BOTTOM = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__LEFT = 3;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER__RIGHT = 4;

	/**
	 * The number of structural features of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.SpacingImpl <em>Spacing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.SpacingImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getSpacing()
	 * @generated
	 */
	int SPACING = 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Breakpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__BREAKPOINT = 1;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__TOP = 2;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__BOTTOM = 3;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__LEFT = 4;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__RIGHT = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__X = 6;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING__Y = 7;

	/**
	 * The number of structural features of the '<em>Spacing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Spacing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.TextImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 4;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ALIGNMENT = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TRANSFORM = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__WEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Monospace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__MONOSPACE = 4;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ITALIC = 5;

	/**
	 * The feature id for the '<em><b>Nowrap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NOWRAP = 6;

	/**
	 * The feature id for the '<em><b>Truncate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TRUNCATE = 7;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.FloatImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 5;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__SIDE = 0;

	/**
	 * The feature id for the '<em><b>Breakpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__BREAKPOINT = 1;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.BootstrapElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapElementImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getBootstrapElement()
	 * @generated
	 */
	int BOOTSTRAP_ELEMENT = 6;

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
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT__APPEARANCE = HtmlPackage.HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT_FEATURE_COUNT = HtmlPackage.HTML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAP_ELEMENT___AS_CONSUMER__CONTEXT = HtmlPackage.HTML_ELEMENT___AS_CONSUMER__CONTEXT;

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
	int CONTAINER = 21;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.RowImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 22;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ColumnImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 24;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.CardImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 25;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.TagImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 7;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = HtmlPackage.TAG__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__APPEARANCE = HtmlPackage.TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = HtmlPackage.TAG_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___AS_CONSUMER__CONTEXT = HtmlPackage.TAG___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = HtmlPackage.TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ContentTagImpl <em>Content Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ContentTagImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getContentTag()
	 * @generated
	 */
	int CONTENT_TAG = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TAG__TITLE = HtmlPackage.CONTENT_TAG__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TAG__DESCRIPTION = HtmlPackage.CONTENT_TAG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TAG__NAME = HtmlPackage.CONTENT_TAG__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TAG__CONTENT = HtmlPackage.CONTENT_TAG__CONTENT;

	/**
	 * The feature id for the '<em><b>Markdown Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TAG__MARKDOWN_CONTENT = HtmlPackage.CONTENT_TAG__MARKDOWN_CONTENT;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TAG__APPEARANCE = HtmlPackage.CONTENT_TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TAG_FEATURE_COUNT = HtmlPackage.CONTENT_TAG_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TAG___AS_CONSUMER__CONTEXT = HtmlPackage.CONTENT_TAG___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Content Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TAG_OPERATION_COUNT = HtmlPackage.CONTENT_TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.DivImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 9;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__NAME = TAG__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__APPEARANCE = TAG__APPEARANCE;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = TAG_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV___AS_CONSUMER__CONTEXT = TAG___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ItemImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TITLE = NcorePackage.MODEL_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DESCRIPTION = NcorePackage.MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ACTIVE = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DISABLED = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__COLOR = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = NcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = NcorePackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ActionGroupItemImpl <em>Action Group Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ActionGroupItemImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getActionGroupItem()
	 * @generated
	 */
	int ACTION_GROUP_ITEM = 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__TITLE = ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__DESCRIPTION = ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__ACTIVE = ITEM__ACTIVE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__DISABLED = ITEM__DISABLED;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__COLOR = ITEM__COLOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM__NAME = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Group Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action Group Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.LinkActionGroupItemImpl <em>Link Action Group Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.LinkActionGroupItemImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getLinkActionGroupItem()
	 * @generated
	 */
	int LINK_ACTION_GROUP_ITEM = 12;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__TITLE = ACTION_GROUP_ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__DESCRIPTION = ACTION_GROUP_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__ACTIVE = ACTION_GROUP_ITEM__ACTIVE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__DISABLED = ACTION_GROUP_ITEM__DISABLED;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__COLOR = ACTION_GROUP_ITEM__COLOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__NAME = ACTION_GROUP_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM__URL = ACTION_GROUP_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link Action Group Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM_FEATURE_COUNT = ACTION_GROUP_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link Action Group Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_GROUP_ITEM_OPERATION_COUNT = ACTION_GROUP_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ContentActionGroupItemImpl <em>Content Action Group Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ContentActionGroupItemImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getContentActionGroupItem()
	 * @generated
	 */
	int CONTENT_ACTION_GROUP_ITEM = 13;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__TITLE = ACTION_GROUP_ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__DESCRIPTION = ACTION_GROUP_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__ACTIVE = ACTION_GROUP_ITEM__ACTIVE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__DISABLED = ACTION_GROUP_ITEM__DISABLED;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__COLOR = ACTION_GROUP_ITEM__COLOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__NAME = ACTION_GROUP_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__CONTENT = ACTION_GROUP_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markdown Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM__MARKDOWN_CONTENT = ACTION_GROUP_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Content Action Group Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM_FEATURE_COUNT = ACTION_GROUP_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Content Action Group Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ACTION_GROUP_ITEM_OPERATION_COUNT = ACTION_GROUP_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.AlertImpl <em>Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.AlertImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getAlert()
	 * @generated
	 */
	int ALERT = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.BadgeImpl <em>Badge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.BadgeImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getBadge()
	 * @generated
	 */
	int BADGE = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ButtonImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ButtonGroupImpl <em>Button Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ButtonGroupImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getButtonGroup()
	 * @generated
	 */
	int BUTTON_GROUP = 19;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ButtonToolbarImpl <em>Button Toolbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ButtonToolbarImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getButtonToolbar()
	 * @generated
	 */
	int BUTTON_TOOLBAR = 20;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.DropdownImpl <em>Dropdown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.DropdownImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getDropdown()
	 * @generated
	 */
	int DROPDOWN = 26;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ActionGroupImpl <em>Action Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ActionGroupImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getActionGroup()
	 * @generated
	 */
	int ACTION_GROUP = 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__TITLE = DIV__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__DESCRIPTION = DIV__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__NAME = DIV__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__APPEARANCE = DIV__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Flush</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__FLUSH = DIV_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP__ITEMS = DIV_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_FEATURE_COUNT = DIV_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP___AS_CONSUMER__CONTEXT = DIV___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Action Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_GROUP_OPERATION_COUNT = DIV_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__NAME = DIV__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT__APPEARANCE = DIV__APPEARANCE;

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
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT___AS_CONSUMER__CONTEXT = DIV___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_OPERATION_COUNT = DIV_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__NAME = DIV__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE__APPEARANCE = DIV__APPEARANCE;

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
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE___AS_CONSUMER__CONTEXT = DIV___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Badge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_OPERATION_COUNT = DIV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.BreadcrumbsImpl <em>Breadcrumbs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.BreadcrumbsImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getBreadcrumbs()
	 * @generated
	 */
	int BREADCRUMBS = 17;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = DIV__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__APPEARANCE = DIV__APPEARANCE;

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
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON___AS_CONSUMER__CONTEXT = DIV___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = DIV_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__APPEARANCE = BOOTSTRAP_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ROWS = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fluid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FLUID = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___AS_CONSUMER__CONTEXT = BOOTSTRAP_ELEMENT___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__APPEARANCE = BOOTSTRAP_ELEMENT__APPEARANCE;

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
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW___AS_CONSUMER__CONTEXT = BOOTSTRAP_ELEMENT___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.ColumnWidthImpl <em>Column Width</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.ColumnWidthImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getColumnWidth()
	 * @generated
	 */
	int COLUMN_WIDTH = 23;

	/**
	 * The feature id for the '<em><b>Breakpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_WIDTH__BREAKPOINT = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_WIDTH__WIDTH = 1;

	/**
	 * The number of structural features of the '<em>Column Width</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_WIDTH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column Width</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_WIDTH_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__APPEARANCE = BOOTSTRAP_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CONTENT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markdown Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__MARKDOWN_CONTENT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__WIDTH = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN___AS_CONSUMER__CONTEXT = BOOTSTRAP_ELEMENT___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TITLE = DIV__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__DESCRIPTION = DIV__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__NAME = DIV__NAME;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__APPEARANCE = DIV__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__HEADER = DIV_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__BODY = DIV_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__FOOTER = DIV_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = DIV_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD___AS_CONSUMER__CONTEXT = DIV___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = DIV_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.FormImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 27;

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
	int LIST_GROUP = 28;

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
	int NAVS = 29;

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
	int NAVBAR = 30;

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
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.TableRowContainerImpl <em>Table Row Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.TableRowContainerImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTableRowContainer()
	 * @generated
	 */
	int TABLE_ROW_CONTAINER = 31;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER__TITLE = BOOTSTRAP_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER__DESCRIPTION = BOOTSTRAP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER__APPEARANCE = BOOTSTRAP_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER__ROWS = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Row Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER___AS_CONSUMER__CONTEXT = BOOTSTRAP_ELEMENT___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Table Row Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_CONTAINER_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.TableSectionImpl <em>Table Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.TableSectionImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTableSection()
	 * @generated
	 */
	int TABLE_SECTION = 32;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__TITLE = TABLE_ROW_CONTAINER__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__DESCRIPTION = TABLE_ROW_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__APPEARANCE = TABLE_ROW_CONTAINER__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__ROWS = TABLE_ROW_CONTAINER__ROWS;

	/**
	 * The number of structural features of the '<em>Table Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION_FEATURE_COUNT = TABLE_ROW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION___AS_CONSUMER__CONTEXT = TABLE_ROW_CONTAINER___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Table Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION_OPERATION_COUNT = TABLE_ROW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.TableHeaderImpl <em>Table Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.TableHeaderImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTableHeader()
	 * @generated
	 */
	int TABLE_HEADER = 33;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__TITLE = TABLE_SECTION__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__DESCRIPTION = TABLE_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__APPEARANCE = TABLE_SECTION__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__ROWS = TABLE_SECTION__ROWS;

	/**
	 * The feature id for the '<em><b>Dark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__DARK = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER__LIGHT = TABLE_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER___AS_CONSUMER__CONTEXT = TABLE_SECTION___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Table Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEADER_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.TableImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 34;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TITLE = TABLE_ROW_CONTAINER__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DESCRIPTION = TABLE_ROW_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__APPEARANCE = TABLE_ROW_CONTAINER__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROWS = TABLE_ROW_CONTAINER__ROWS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HEADER = TABLE_ROW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BODY = TABLE_ROW_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FOOTER = TABLE_ROW_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DARK = TABLE_ROW_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Striped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__STRIPED = TABLE_ROW_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BORDERED = TABLE_ROW_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Borderless</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__BORDERLESS = TABLE_ROW_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HOVER = TABLE_ROW_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Small</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SMALL = TABLE_ROW_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = TABLE_ROW_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE___AS_CONSUMER__CONTEXT = TABLE_ROW_CONTAINER___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = TABLE_ROW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.TableRowImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 35;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__TITLE = BOOTSTRAP_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__DESCRIPTION = BOOTSTRAP_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__APPEARANCE = BOOTSTRAP_ELEMENT__APPEARANCE;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__CELLS = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__COLOR = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__BACKGROUND = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = BOOTSTRAP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW___AS_CONSUMER__CONTEXT = BOOTSTRAP_ELEMENT___AS_CONSUMER__CONTEXT;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = BOOTSTRAP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.TableCellImpl <em>Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.TableCellImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTableCell()
	 * @generated
	 */
	int TABLE_CELL = 36;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__CONTENT = HtmlPackage.CONTAINER__CONTENT;

	/**
	 * The feature id for the '<em><b>Markdown Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__MARKDOWN_CONTENT = HtmlPackage.CONTAINER__MARKDOWN_CONTENT;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__TITLE = HtmlPackage.CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__DESCRIPTION = HtmlPackage.CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__APPEARANCE = HtmlPackage.CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__HEADER = HtmlPackage.CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Col Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__COL_SPAN = HtmlPackage.CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Row Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ROW_SPAN = HtmlPackage.CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__COLOR = HtmlPackage.CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__BACKGROUND = HtmlPackage.CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_FEATURE_COUNT = HtmlPackage.CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>As Consumer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL___AS_CONSUMER__CONTEXT = HtmlPackage.CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_OPERATION_COUNT = HtmlPackage.CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.vinci.bootstrap.impl.TooltipImpl <em>Tooltip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.vinci.bootstrap.impl.TooltipImpl
	 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTooltip()
	 * @generated
	 */
	int TOOLTIP = 37;

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
	int INPUT_GROUP = 38;

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
	int FORM_GROUP = 39;

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
	int COLLAPSE = 40;

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
	int MODAL = 41;

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
	int ACCORDION = 42;

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
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.BootstrapPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPage
	 * @generated
	 */
	EClass getBootstrapPage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.BootstrapPage#isCdn <em>Cdn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cdn</em>'.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPage#isCdn()
	 * @see #getBootstrapPage()
	 * @generated
	 */
	EAttribute getBootstrapPage_Cdn();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.BootstrapPage#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theme</em>'.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPage#getTheme()
	 * @see #getBootstrapPage()
	 * @generated
	 */
	EAttribute getBootstrapPage_Theme();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Appearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appearance</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Appearance
	 * @generated
	 */
	EClass getAppearance();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Appearance#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Appearance#getBackground()
	 * @see #getAppearance()
	 * @generated
	 */
	EAttribute getAppearance_Background();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Appearance#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Appearance#getAttributes()
	 * @see #getAppearance()
	 * @generated
	 */
	EAttribute getAppearance_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.bootstrap.Appearance#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Border</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Appearance#getBorder()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_Border();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.bootstrap.Appearance#getMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Margin</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Appearance#getMargin()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_Margin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.bootstrap.Appearance#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Padding</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Appearance#getPadding()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_Padding();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.bootstrap.Appearance#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Appearance#getText()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.bootstrap.Appearance#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Appearance#getFloat()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_Float();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Border
	 * @generated
	 */
	EClass getBorder();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Border#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Border#getColor()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Border#isTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Border#isTop()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_Top();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Border#isLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Border#isLeft()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_Left();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Border#isRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Border#isRight()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_Right();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Spacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacing</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Spacing
	 * @generated
	 */
	EClass getSpacing();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Spacing#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Spacing#getSize()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Spacing#getBreakpoint <em>Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breakpoint</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Spacing#getBreakpoint()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_Breakpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Spacing#isTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Spacing#isTop()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_Top();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Spacing#isBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Spacing#isBottom()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_Bottom();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Spacing#isLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Spacing#isLeft()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_Left();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Spacing#isRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Spacing#isRight()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_Right();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Spacing#isX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Spacing#isX()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_X();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Spacing#isY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Spacing#isY()
	 * @see #getSpacing()
	 * @generated
	 */
	EAttribute getSpacing_Y();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Text#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Text#getAlignment()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Text#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Text#getColor()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Text#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Text#getTransform()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Transform();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Text#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Text#getWeight()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Weight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Text#isMonospace <em>Monospace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monospace</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Text#isMonospace()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Monospace();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Text#isItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Text#isItalic()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Italic();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Text#isNowrap <em>Nowrap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nowrap</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Text#isNowrap()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Nowrap();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Text#isTruncate <em>Truncate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Truncate</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Text#isTruncate()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Truncate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Float#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Float#getSide()
	 * @see #getFloat()
	 * @generated
	 */
	EAttribute getFloat_Side();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Float#getBreakpoint <em>Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breakpoint</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Float#getBreakpoint()
	 * @see #getFloat()
	 * @generated
	 */
	EAttribute getFloat_Breakpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Border#isBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Border#isBottom()
	 * @see #getBorder()
	 * @generated
	 */
	EAttribute getBorder_Bottom();

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
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.bootstrap.BootstrapElement#getAppearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance</em>'.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapElement#getAppearance()
	 * @see #getBootstrapElement()
	 * @generated
	 */
	EReference getBootstrapElement_Appearance();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Container#isFluid <em>Fluid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fluid</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Container#isFluid()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Fluid();

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
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.ColumnWidth <em>Column Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Width</em>'.
	 * @see org.nasdanika.vinci.bootstrap.ColumnWidth
	 * @generated
	 */
	EClass getColumnWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.ColumnWidth#getBreakpoint <em>Breakpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breakpoint</em>'.
	 * @see org.nasdanika.vinci.bootstrap.ColumnWidth#getBreakpoint()
	 * @see #getColumnWidth()
	 * @generated
	 */
	EAttribute getColumnWidth_Breakpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.ColumnWidth#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.vinci.bootstrap.ColumnWidth#getWidth()
	 * @see #getColumnWidth()
	 * @generated
	 */
	EAttribute getColumnWidth_Width();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.bootstrap.Column#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Width</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Column#getWidth()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Width();

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
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.ContentTag <em>Content Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Tag</em>'.
	 * @see org.nasdanika.vinci.bootstrap.ContentTag
	 * @generated
	 */
	EClass getContentTag();

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
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Item#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Item#isActive()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Active();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Item#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Item#isDisabled()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Item#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Item#getColor()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Color();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.ActionGroupItem <em>Action Group Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Group Item</em>'.
	 * @see org.nasdanika.vinci.bootstrap.ActionGroupItem
	 * @generated
	 */
	EClass getActionGroupItem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.bootstrap.ActionGroupItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name</em>'.
	 * @see org.nasdanika.vinci.bootstrap.ActionGroupItem#getName()
	 * @see #getActionGroupItem()
	 * @generated
	 */
	EReference getActionGroupItem_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.LinkActionGroupItem <em>Link Action Group Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Action Group Item</em>'.
	 * @see org.nasdanika.vinci.bootstrap.LinkActionGroupItem
	 * @generated
	 */
	EClass getLinkActionGroupItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.LinkActionGroupItem#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.vinci.bootstrap.LinkActionGroupItem#getUrl()
	 * @see #getLinkActionGroupItem()
	 * @generated
	 */
	EAttribute getLinkActionGroupItem_Url();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.ContentActionGroupItem <em>Content Action Group Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Action Group Item</em>'.
	 * @see org.nasdanika.vinci.bootstrap.ContentActionGroupItem
	 * @generated
	 */
	EClass getContentActionGroupItem();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.ActionGroup#isFlush <em>Flush</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flush</em>'.
	 * @see org.nasdanika.vinci.bootstrap.ActionGroup#isFlush()
	 * @see #getActionGroup()
	 * @generated
	 */
	EAttribute getActionGroup_Flush();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.bootstrap.ActionGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.nasdanika.vinci.bootstrap.ActionGroup#getItems()
	 * @see #getActionGroup()
	 * @generated
	 */
	EReference getActionGroup_Items();

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
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.TableRowContainer <em>Table Row Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row Container</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableRowContainer
	 * @generated
	 */
	EClass getTableRowContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.bootstrap.TableRowContainer#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableRowContainer#getRows()
	 * @see #getTableRowContainer()
	 * @generated
	 */
	EReference getTableRowContainer_Rows();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.TableSection <em>Table Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Section</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableSection
	 * @generated
	 */
	EClass getTableSection();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.TableHeader <em>Table Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Header</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableHeader
	 * @generated
	 */
	EClass getTableHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.TableHeader#isDark <em>Dark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dark</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableHeader#isDark()
	 * @see #getTableHeader()
	 * @generated
	 */
	EAttribute getTableHeader_Dark();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.TableHeader#isLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableHeader#isLight()
	 * @see #getTableHeader()
	 * @generated
	 */
	EAttribute getTableHeader_Light();

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
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.bootstrap.Table#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Table#getHeader()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.bootstrap.Table#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Table#getBody()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.vinci.bootstrap.Table#getFooter <em>Footer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footer</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Table#getFooter()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Footer();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Table#isDark <em>Dark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dark</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Table#isDark()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Dark();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Table#isStriped <em>Striped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Striped</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Table#isStriped()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Striped();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Table#isBordered <em>Bordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bordered</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Table#isBordered()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Bordered();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Table#isBorderless <em>Borderless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Borderless</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Table#isBorderless()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Borderless();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Table#isHover <em>Hover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hover</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Table#isHover()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Hover();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.Table#isSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small</em>'.
	 * @see org.nasdanika.vinci.bootstrap.Table#isSmall()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Small();

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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.vinci.bootstrap.TableRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableRow#getCells()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Cells();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.TableRow#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableRow#getColor()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.TableRow#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableRow#getBackground()
	 * @see #getTableRow()
	 * @generated
	 */
	EAttribute getTableRow_Background();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.vinci.bootstrap.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Cell</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableCell
	 * @generated
	 */
	EClass getTableCell();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.TableCell#isHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableCell#isHeader()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Header();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.TableCell#getColSpan <em>Col Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col Span</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableCell#getColSpan()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_ColSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.TableCell#getRowSpan <em>Row Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Span</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableCell#getRowSpan()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_RowSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.TableCell#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableCell#getColor()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.vinci.bootstrap.TableCell#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see org.nasdanika.vinci.bootstrap.TableCell#getBackground()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Background();

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
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.BootstrapPageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPageImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getBootstrapPage()
		 * @generated
		 */
		EClass BOOTSTRAP_PAGE = eINSTANCE.getBootstrapPage();
		/**
		 * The meta object literal for the '<em><b>Cdn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAP_PAGE__CDN = eINSTANCE.getBootstrapPage_Cdn();
		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAP_PAGE__THEME = eINSTANCE.getBootstrapPage_Theme();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.AppearanceImpl <em>Appearance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.AppearanceImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getAppearance()
		 * @generated
		 */
		EClass APPEARANCE = eINSTANCE.getAppearance();
		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE__BACKGROUND = eINSTANCE.getAppearance_Background();
		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE__ATTRIBUTES = eINSTANCE.getAppearance_Attributes();
		/**
		 * The meta object literal for the '<em><b>Border</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__BORDER = eINSTANCE.getAppearance_Border();
		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__MARGIN = eINSTANCE.getAppearance_Margin();
		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__PADDING = eINSTANCE.getAppearance_Padding();
		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__TEXT = eINSTANCE.getAppearance_Text();
		/**
		 * The meta object literal for the '<em><b>Float</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__FLOAT = eINSTANCE.getAppearance_Float();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.BorderImpl <em>Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.BorderImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getBorder()
		 * @generated
		 */
		EClass BORDER = eINSTANCE.getBorder();
		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__COLOR = eINSTANCE.getBorder_Color();
		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__TOP = eINSTANCE.getBorder_Top();
		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__LEFT = eINSTANCE.getBorder_Left();
		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__RIGHT = eINSTANCE.getBorder_Right();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.SpacingImpl <em>Spacing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.SpacingImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getSpacing()
		 * @generated
		 */
		EClass SPACING = eINSTANCE.getSpacing();
		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__SIZE = eINSTANCE.getSpacing_Size();
		/**
		 * The meta object literal for the '<em><b>Breakpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__BREAKPOINT = eINSTANCE.getSpacing_Breakpoint();
		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__TOP = eINSTANCE.getSpacing_Top();
		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__BOTTOM = eINSTANCE.getSpacing_Bottom();
		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__LEFT = eINSTANCE.getSpacing_Left();
		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__RIGHT = eINSTANCE.getSpacing_Right();
		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__X = eINSTANCE.getSpacing_X();
		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACING__Y = eINSTANCE.getSpacing_Y();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.TextImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();
		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__ALIGNMENT = eINSTANCE.getText_Alignment();
		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__COLOR = eINSTANCE.getText_Color();
		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TRANSFORM = eINSTANCE.getText_Transform();
		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__WEIGHT = eINSTANCE.getText_Weight();
		/**
		 * The meta object literal for the '<em><b>Monospace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__MONOSPACE = eINSTANCE.getText_Monospace();
		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__ITALIC = eINSTANCE.getText_Italic();
		/**
		 * The meta object literal for the '<em><b>Nowrap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__NOWRAP = eINSTANCE.getText_Nowrap();
		/**
		 * The meta object literal for the '<em><b>Truncate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TRUNCATE = eINSTANCE.getText_Truncate();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.FloatImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();
		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT__SIDE = eINSTANCE.getFloat_Side();
		/**
		 * The meta object literal for the '<em><b>Breakpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT__BREAKPOINT = eINSTANCE.getFloat_Breakpoint();
		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER__BOTTOM = eINSTANCE.getBorder_Bottom();
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
		 * The meta object literal for the '<em><b>Appearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOTSTRAP_ELEMENT__APPEARANCE = eINSTANCE.getBootstrapElement_Appearance();
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
		 * The meta object literal for the '<em><b>Fluid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__FLUID = eINSTANCE.getContainer_Fluid();
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
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.ColumnWidthImpl <em>Column Width</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.ColumnWidthImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getColumnWidth()
		 * @generated
		 */
		EClass COLUMN_WIDTH = eINSTANCE.getColumnWidth();
		/**
		 * The meta object literal for the '<em><b>Breakpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_WIDTH__BREAKPOINT = eINSTANCE.getColumnWidth_Breakpoint();
		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_WIDTH__WIDTH = eINSTANCE.getColumnWidth_Width();
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
		 * The meta object literal for the '<em><b>Width</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__WIDTH = eINSTANCE.getColumn_Width();
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
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.ContentTagImpl <em>Content Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.ContentTagImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getContentTag()
		 * @generated
		 */
		EClass CONTENT_TAG = eINSTANCE.getContentTag();
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
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.ItemImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();
		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ACTIVE = eINSTANCE.getItem_Active();
		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__DISABLED = eINSTANCE.getItem_Disabled();
		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__COLOR = eINSTANCE.getItem_Color();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.ActionGroupItemImpl <em>Action Group Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.ActionGroupItemImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getActionGroupItem()
		 * @generated
		 */
		EClass ACTION_GROUP_ITEM = eINSTANCE.getActionGroupItem();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUP_ITEM__NAME = eINSTANCE.getActionGroupItem_Name();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.LinkActionGroupItemImpl <em>Link Action Group Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.LinkActionGroupItemImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getLinkActionGroupItem()
		 * @generated
		 */
		EClass LINK_ACTION_GROUP_ITEM = eINSTANCE.getLinkActionGroupItem();
		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_ACTION_GROUP_ITEM__URL = eINSTANCE.getLinkActionGroupItem_Url();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.ContentActionGroupItemImpl <em>Content Action Group Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.ContentActionGroupItemImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getContentActionGroupItem()
		 * @generated
		 */
		EClass CONTENT_ACTION_GROUP_ITEM = eINSTANCE.getContentActionGroupItem();
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
		 * The meta object literal for the '<em><b>Flush</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_GROUP__FLUSH = eINSTANCE.getActionGroup_Flush();
		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_GROUP__ITEMS = eINSTANCE.getActionGroup_Items();
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
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.TableRowContainerImpl <em>Table Row Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.TableRowContainerImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTableRowContainer()
		 * @generated
		 */
		EClass TABLE_ROW_CONTAINER = eINSTANCE.getTableRowContainer();
		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW_CONTAINER__ROWS = eINSTANCE.getTableRowContainer_Rows();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.TableSectionImpl <em>Table Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.TableSectionImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTableSection()
		 * @generated
		 */
		EClass TABLE_SECTION = eINSTANCE.getTableSection();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.TableHeaderImpl <em>Table Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.TableHeaderImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTableHeader()
		 * @generated
		 */
		EClass TABLE_HEADER = eINSTANCE.getTableHeader();
		/**
		 * The meta object literal for the '<em><b>Dark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_HEADER__DARK = eINSTANCE.getTableHeader_Dark();
		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_HEADER__LIGHT = eINSTANCE.getTableHeader_Light();
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
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__HEADER = eINSTANCE.getTable_Header();
		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__BODY = eINSTANCE.getTable_Body();
		/**
		 * The meta object literal for the '<em><b>Footer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__FOOTER = eINSTANCE.getTable_Footer();
		/**
		 * The meta object literal for the '<em><b>Dark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__DARK = eINSTANCE.getTable_Dark();
		/**
		 * The meta object literal for the '<em><b>Striped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__STRIPED = eINSTANCE.getTable_Striped();
		/**
		 * The meta object literal for the '<em><b>Bordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__BORDERED = eINSTANCE.getTable_Bordered();
		/**
		 * The meta object literal for the '<em><b>Borderless</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__BORDERLESS = eINSTANCE.getTable_Borderless();
		/**
		 * The meta object literal for the '<em><b>Hover</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__HOVER = eINSTANCE.getTable_Hover();
		/**
		 * The meta object literal for the '<em><b>Small</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__SMALL = eINSTANCE.getTable_Small();
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
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__CELLS = eINSTANCE.getTableRow_Cells();
		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__COLOR = eINSTANCE.getTableRow_Color();
		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_ROW__BACKGROUND = eINSTANCE.getTableRow_Background();
		/**
		 * The meta object literal for the '{@link org.nasdanika.vinci.bootstrap.impl.TableCellImpl <em>Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.vinci.bootstrap.impl.TableCellImpl
		 * @see org.nasdanika.vinci.bootstrap.impl.BootstrapPackageImpl#getTableCell()
		 * @generated
		 */
		EClass TABLE_CELL = eINSTANCE.getTableCell();
		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__HEADER = eINSTANCE.getTableCell_Header();
		/**
		 * The meta object literal for the '<em><b>Col Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__COL_SPAN = eINSTANCE.getTableCell_ColSpan();
		/**
		 * The meta object literal for the '<em><b>Row Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__ROW_SPAN = eINSTANCE.getTableCell_RowSpan();
		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__COLOR = eINSTANCE.getTableCell_Color();
		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__BACKGROUND = eINSTANCE.getTableCell_Background();
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

	}

} //BootstrapPackage
