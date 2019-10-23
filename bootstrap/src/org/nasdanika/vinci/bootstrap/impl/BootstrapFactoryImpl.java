/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.vinci.bootstrap.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BootstrapFactoryImpl extends EFactoryImpl implements BootstrapFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BootstrapFactory init() {
		try {
			BootstrapFactory theBootstrapFactory = (BootstrapFactory)EPackage.Registry.INSTANCE.getEFactory(BootstrapPackage.eNS_URI);
			if (theBootstrapFactory != null) {
				return theBootstrapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BootstrapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BootstrapPackage.BOOTSTRAP_ELEMENT: return createBootstrapElement();
			case BootstrapPackage.CONTAINER: return createContainer();
			case BootstrapPackage.ROW: return createRow();
			case BootstrapPackage.COLUMN: return createColumn();
			case BootstrapPackage.CARD: return createCard();
			case BootstrapPackage.TAG: return createTag();
			case BootstrapPackage.DIV: return createDiv();
			case BootstrapPackage.ALERT: return createAlert();
			case BootstrapPackage.BADGE: return createBadge();
			case BootstrapPackage.BUTTON: return createButton();
			case BootstrapPackage.BUTTON_GROUP: return createButtonGroup();
			case BootstrapPackage.BUTTON_TOOLBAR: return createButtonToolbar();
			case BootstrapPackage.DROPDOWN: return createDropdown();
			case BootstrapPackage.ACTION_GROUP: return createActionGroup();
			case BootstrapPackage.BREADCRUMBS: return createBreadcrumbs();
			case BootstrapPackage.FORM: return createForm();
			case BootstrapPackage.LIST_GROUP: return createListGroup();
			case BootstrapPackage.NAVS: return createNavs();
			case BootstrapPackage.NAVBAR: return createNavbar();
			case BootstrapPackage.TABLE: return createTable();
			case BootstrapPackage.TABLE_ROW: return createTableRow();
			case BootstrapPackage.TABLE_COLUMN: return createTableColumn();
			case BootstrapPackage.TOOLTIP: return createTooltip();
			case BootstrapPackage.INPUT_GROUP: return createInputGroup();
			case BootstrapPackage.FORM_GROUP: return createFormGroup();
			case BootstrapPackage.COLLAPSE: return createCollapse();
			case BootstrapPackage.MODAL: return createModal();
			case BootstrapPackage.ACCORDION: return createAccordion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BootstrapPackage.IBOOTSTRAP_ELEMENT:
				return createIBootstrapElementFromString(eDataType, initialValue);
			case BootstrapPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BootstrapPackage.IBOOTSTRAP_ELEMENT:
				return convertIBootstrapElementToString(eDataType, instanceValue);
			case BootstrapPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BootstrapElement createBootstrapElement() {
		BootstrapElementImpl bootstrapElement = new BootstrapElementImpl();
		return bootstrapElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.vinci.bootstrap.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Card createCard() {
		CardImpl card = new CardImpl();
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Alert createAlert() {
		AlertImpl alert = new AlertImpl();
		return alert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Badge createBadge() {
		BadgeImpl badge = new BadgeImpl();
		return badge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ButtonGroup createButtonGroup() {
		ButtonGroupImpl buttonGroup = new ButtonGroupImpl();
		return buttonGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ButtonToolbar createButtonToolbar() {
		ButtonToolbarImpl buttonToolbar = new ButtonToolbarImpl();
		return buttonToolbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dropdown createDropdown() {
		DropdownImpl dropdown = new DropdownImpl();
		return dropdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionGroup createActionGroup() {
		ActionGroupImpl actionGroup = new ActionGroupImpl();
		return actionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Breadcrumbs createBreadcrumbs() {
		BreadcrumbsImpl breadcrumbs = new BreadcrumbsImpl();
		return breadcrumbs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListGroup createListGroup() {
		ListGroupImpl listGroup = new ListGroupImpl();
		return listGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Navs createNavs() {
		NavsImpl navs = new NavsImpl();
		return navs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Navbar createNavbar() {
		NavbarImpl navbar = new NavbarImpl();
		return navbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableRow createTableRow() {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableColumn createTableColumn() {
		TableColumnImpl tableColumn = new TableColumnImpl();
		return tableColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tooltip createTooltip() {
		TooltipImpl tooltip = new TooltipImpl();
		return tooltip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputGroup createInputGroup() {
		InputGroupImpl inputGroup = new InputGroupImpl();
		return inputGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormGroup createFormGroup() {
		FormGroupImpl formGroup = new FormGroupImpl();
		return formGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collapse createCollapse() {
		CollapseImpl collapse = new CollapseImpl();
		return collapse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modal createModal() {
		ModalImpl modal = new ModalImpl();
		return modal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Accordion createAccordion() {
		AccordionImpl accordion = new AccordionImpl();
		return accordion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.html.bootstrap.BootstrapElement createIBootstrapElementFromString(EDataType eDataType, String initialValue) {
		return (org.nasdanika.html.bootstrap.BootstrapElement)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIBootstrapElementToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		return (Color)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertColor(Color it) {
		return it.name();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return convertColor((Color)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BootstrapPackage getBootstrapPackage() {
		return (BootstrapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BootstrapPackage getPackage() {
		return BootstrapPackage.eINSTANCE;
	}

} //BootstrapFactoryImpl
