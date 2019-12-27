/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import static org.nasdanika.vinci.bootstrap.BootstrapPackage.CONTAINER;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.vinci.bootstrap.Accordion;
import org.nasdanika.vinci.bootstrap.ActionGroup;
import org.nasdanika.vinci.bootstrap.ActionGroupItem;
import org.nasdanika.vinci.bootstrap.Alert;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.Badge;
import org.nasdanika.vinci.bootstrap.BootstrapElement;
import org.nasdanika.vinci.bootstrap.BootstrapFactory;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.BootstrapPage;
import org.nasdanika.vinci.bootstrap.Border;
import org.nasdanika.vinci.bootstrap.Breadcrumbs;
import org.nasdanika.vinci.bootstrap.Button;
import org.nasdanika.vinci.bootstrap.ButtonGroup;
import org.nasdanika.vinci.bootstrap.ButtonToolbar;
import org.nasdanika.vinci.bootstrap.Card;
import org.nasdanika.vinci.bootstrap.Collapse;
import org.nasdanika.vinci.bootstrap.Column;
import org.nasdanika.vinci.bootstrap.ColumnWidth;
import org.nasdanika.vinci.bootstrap.ContentActionGroupItem;
import org.nasdanika.vinci.bootstrap.ContentTag;
import org.nasdanika.vinci.bootstrap.Div;
import org.nasdanika.vinci.bootstrap.Dropdown;
import org.nasdanika.vinci.bootstrap.Form;
import org.nasdanika.vinci.bootstrap.FormGroup;
import org.nasdanika.vinci.bootstrap.InputGroup;
import org.nasdanika.vinci.bootstrap.Item;
import org.nasdanika.vinci.bootstrap.LinkActionGroupItem;
import org.nasdanika.vinci.bootstrap.ListGroup;
import org.nasdanika.vinci.bootstrap.Modal;
import org.nasdanika.vinci.bootstrap.Navbar;
import org.nasdanika.vinci.bootstrap.Navs;
import org.nasdanika.vinci.bootstrap.Row;
import org.nasdanika.vinci.bootstrap.Spacing;
import org.nasdanika.vinci.bootstrap.Table;
import org.nasdanika.vinci.bootstrap.TableCell;
import org.nasdanika.vinci.bootstrap.TableHeader;
import org.nasdanika.vinci.bootstrap.TableRow;
import org.nasdanika.vinci.bootstrap.TableRowContainer;
import org.nasdanika.vinci.bootstrap.TableSection;
import org.nasdanika.vinci.bootstrap.Tag;
import org.nasdanika.vinci.bootstrap.Text;
import org.nasdanika.vinci.bootstrap.Tooltip;
import org.nasdanika.vinci.bootstrap.util.BootstrapValidator;
import org.nasdanika.vinci.html.HtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BootstrapPackageImpl extends EPackageImpl implements BootstrapPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bootstrapPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appearanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass borderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bootstrapElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnWidthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionGroupItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkActionGroupItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentActionGroupItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass badgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonToolbarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropdownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breadcrumbsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navbarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableRowContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tooltipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collapseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accordionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BootstrapPackageImpl() {
		super(eNS_URI, BootstrapFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BootstrapPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BootstrapPackage init() {
		if (isInited) return (BootstrapPackage)EPackage.Registry.INSTANCE.getEPackage(BootstrapPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBootstrapPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BootstrapPackageImpl theBootstrapPackage = registeredBootstrapPackage instanceof BootstrapPackageImpl ? (BootstrapPackageImpl)registeredBootstrapPackage : new BootstrapPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		HtmlPackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBootstrapPackage.createPackageContents();

		// Initialize created meta-data
		theBootstrapPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBootstrapPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return BootstrapValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBootstrapPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BootstrapPackage.eNS_URI, theBootstrapPackage);
		return theBootstrapPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBootstrapPage() {
		return bootstrapPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstrapPage_Cdn() {
		return (EAttribute)bootstrapPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstrapPage_Theme() {
		return (EAttribute)bootstrapPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppearance() {
		return appearanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppearance_Background() {
		return (EAttribute)appearanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppearance_Attributes() {
		return (EAttribute)appearanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppearance_Border() {
		return (EReference)appearanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppearance_Margin() {
		return (EReference)appearanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppearance_Padding() {
		return (EReference)appearanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppearance_Text() {
		return (EReference)appearanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppearance_Float() {
		return (EReference)appearanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBorder() {
		return borderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBorder_Color() {
		return (EAttribute)borderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBorder_Top() {
		return (EAttribute)borderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBorder_Left() {
		return (EAttribute)borderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBorder_Right() {
		return (EAttribute)borderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpacing() {
		return spacingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpacing_Size() {
		return (EAttribute)spacingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpacing_Breakpoint() {
		return (EAttribute)spacingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpacing_Top() {
		return (EAttribute)spacingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpacing_Bottom() {
		return (EAttribute)spacingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpacing_Left() {
		return (EAttribute)spacingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpacing_Right() {
		return (EAttribute)spacingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpacing_X() {
		return (EAttribute)spacingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpacing_Y() {
		return (EAttribute)spacingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Alignment() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Color() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Transform() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Weight() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Monospace() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Italic() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Nowrap() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_Truncate() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFloat() {
		return floatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFloat_Side() {
		return (EAttribute)floatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFloat_Breakpoint() {
		return (EAttribute)floatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBorder_Bottom() {
		return (EAttribute)borderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBootstrapElement() {
		return bootstrapElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBootstrapElement_Appearance() {
		return (EReference)bootstrapElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Rows() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_Fluid() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRow_Columns() {
		return (EReference)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColumnWidth() {
		return columnWidthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnWidth_Breakpoint() {
		return (EAttribute)columnWidthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnWidth_Width() {
		return (EAttribute)columnWidthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColumn_Width() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCard() {
		return cardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCard_Header() {
		return (EReference)cardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCard_Body() {
		return (EReference)cardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCard_Footer() {
		return (EReference)cardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentTag() {
		return contentTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiv() {
		return divEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_Active() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_Disabled() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_Color() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionGroupItem() {
		return actionGroupItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionGroupItem_Name() {
		return (EReference)actionGroupItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkActionGroupItem() {
		return linkActionGroupItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkActionGroupItem_Url() {
		return (EAttribute)linkActionGroupItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentActionGroupItem() {
		return contentActionGroupItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlert() {
		return alertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlert_Color() {
		return (EAttribute)alertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBadge() {
		return badgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBadge_Color() {
		return (EAttribute)badgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getButton_Color() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getButton_Outline() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButtonGroup() {
		return buttonGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButtonToolbar() {
		return buttonToolbarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDropdown() {
		return dropdownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionGroup() {
		return actionGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionGroup_Flush() {
		return (EAttribute)actionGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionGroup_Items() {
		return (EReference)actionGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBreadcrumbs() {
		return breadcrumbsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListGroup() {
		return listGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavs() {
		return navsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavbar() {
		return navbarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableRowContainer() {
		return tableRowContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableRowContainer_Rows() {
		return (EReference)tableRowContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableSection() {
		return tableSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableHeader() {
		return tableHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableHeader_Dark() {
		return (EAttribute)tableHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableHeader_Light() {
		return (EAttribute)tableHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Header() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Body() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Footer() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_Dark() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_Striped() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_Bordered() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_Borderless() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_Hover() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_Small() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableRow() {
		return tableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableRow_Cells() {
		return (EReference)tableRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableRow_Color() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableRow_Background() {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableCell() {
		return tableCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableCell_Header() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableCell_ColSpan() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableCell_RowSpan() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableCell_Color() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableCell_Background() {
		return (EAttribute)tableCellEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTooltip() {
		return tooltipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputGroup() {
		return inputGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormGroup() {
		return formGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollapse() {
		return collapseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModal() {
		return modalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccordion() {
		return accordionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BootstrapFactory getBootstrapFactory() {
		return (BootstrapFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bootstrapPageEClass = createEClass(BOOTSTRAP_PAGE);
		createEAttribute(bootstrapPageEClass, BOOTSTRAP_PAGE__CDN);
		createEAttribute(bootstrapPageEClass, BOOTSTRAP_PAGE__THEME);

		appearanceEClass = createEClass(APPEARANCE);
		createEAttribute(appearanceEClass, APPEARANCE__BACKGROUND);
		createEAttribute(appearanceEClass, APPEARANCE__ATTRIBUTES);
		createEReference(appearanceEClass, APPEARANCE__BORDER);
		createEReference(appearanceEClass, APPEARANCE__MARGIN);
		createEReference(appearanceEClass, APPEARANCE__PADDING);
		createEReference(appearanceEClass, APPEARANCE__TEXT);
		createEReference(appearanceEClass, APPEARANCE__FLOAT);

		borderEClass = createEClass(BORDER);
		createEAttribute(borderEClass, BORDER__COLOR);
		createEAttribute(borderEClass, BORDER__TOP);
		createEAttribute(borderEClass, BORDER__BOTTOM);
		createEAttribute(borderEClass, BORDER__LEFT);
		createEAttribute(borderEClass, BORDER__RIGHT);

		spacingEClass = createEClass(SPACING);
		createEAttribute(spacingEClass, SPACING__SIZE);
		createEAttribute(spacingEClass, SPACING__BREAKPOINT);
		createEAttribute(spacingEClass, SPACING__TOP);
		createEAttribute(spacingEClass, SPACING__BOTTOM);
		createEAttribute(spacingEClass, SPACING__LEFT);
		createEAttribute(spacingEClass, SPACING__RIGHT);
		createEAttribute(spacingEClass, SPACING__X);
		createEAttribute(spacingEClass, SPACING__Y);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__ALIGNMENT);
		createEAttribute(textEClass, TEXT__COLOR);
		createEAttribute(textEClass, TEXT__TRANSFORM);
		createEAttribute(textEClass, TEXT__WEIGHT);
		createEAttribute(textEClass, TEXT__MONOSPACE);
		createEAttribute(textEClass, TEXT__ITALIC);
		createEAttribute(textEClass, TEXT__NOWRAP);
		createEAttribute(textEClass, TEXT__TRUNCATE);

		floatEClass = createEClass(FLOAT);
		createEAttribute(floatEClass, FLOAT__SIDE);
		createEAttribute(floatEClass, FLOAT__BREAKPOINT);

		bootstrapElementEClass = createEClass(BOOTSTRAP_ELEMENT);
		createEReference(bootstrapElementEClass, BOOTSTRAP_ELEMENT__APPEARANCE);

		tagEClass = createEClass(TAG);

		contentTagEClass = createEClass(CONTENT_TAG);

		divEClass = createEClass(DIV);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__ACTIVE);
		createEAttribute(itemEClass, ITEM__DISABLED);
		createEAttribute(itemEClass, ITEM__COLOR);

		actionGroupItemEClass = createEClass(ACTION_GROUP_ITEM);
		createEReference(actionGroupItemEClass, ACTION_GROUP_ITEM__NAME);

		linkActionGroupItemEClass = createEClass(LINK_ACTION_GROUP_ITEM);
		createEAttribute(linkActionGroupItemEClass, LINK_ACTION_GROUP_ITEM__URL);

		contentActionGroupItemEClass = createEClass(CONTENT_ACTION_GROUP_ITEM);

		actionGroupEClass = createEClass(ACTION_GROUP);
		createEAttribute(actionGroupEClass, ACTION_GROUP__FLUSH);
		createEReference(actionGroupEClass, ACTION_GROUP__ITEMS);

		alertEClass = createEClass(ALERT);
		createEAttribute(alertEClass, ALERT__COLOR);

		badgeEClass = createEClass(BADGE);
		createEAttribute(badgeEClass, BADGE__COLOR);

		breadcrumbsEClass = createEClass(BREADCRUMBS);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__COLOR);
		createEAttribute(buttonEClass, BUTTON__OUTLINE);

		buttonGroupEClass = createEClass(BUTTON_GROUP);

		buttonToolbarEClass = createEClass(BUTTON_TOOLBAR);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__ROWS);
		createEAttribute(containerEClass, CONTAINER__FLUID);

		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__COLUMNS);

		columnWidthEClass = createEClass(COLUMN_WIDTH);
		createEAttribute(columnWidthEClass, COLUMN_WIDTH__BREAKPOINT);
		createEAttribute(columnWidthEClass, COLUMN_WIDTH__WIDTH);

		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__WIDTH);

		cardEClass = createEClass(CARD);
		createEReference(cardEClass, CARD__HEADER);
		createEReference(cardEClass, CARD__BODY);
		createEReference(cardEClass, CARD__FOOTER);

		dropdownEClass = createEClass(DROPDOWN);

		formEClass = createEClass(FORM);

		listGroupEClass = createEClass(LIST_GROUP);

		navsEClass = createEClass(NAVS);

		navbarEClass = createEClass(NAVBAR);

		tableRowContainerEClass = createEClass(TABLE_ROW_CONTAINER);
		createEReference(tableRowContainerEClass, TABLE_ROW_CONTAINER__ROWS);

		tableSectionEClass = createEClass(TABLE_SECTION);

		tableHeaderEClass = createEClass(TABLE_HEADER);
		createEAttribute(tableHeaderEClass, TABLE_HEADER__DARK);
		createEAttribute(tableHeaderEClass, TABLE_HEADER__LIGHT);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__HEADER);
		createEReference(tableEClass, TABLE__BODY);
		createEReference(tableEClass, TABLE__FOOTER);
		createEAttribute(tableEClass, TABLE__DARK);
		createEAttribute(tableEClass, TABLE__STRIPED);
		createEAttribute(tableEClass, TABLE__BORDERED);
		createEAttribute(tableEClass, TABLE__BORDERLESS);
		createEAttribute(tableEClass, TABLE__HOVER);
		createEAttribute(tableEClass, TABLE__SMALL);

		tableRowEClass = createEClass(TABLE_ROW);
		createEReference(tableRowEClass, TABLE_ROW__CELLS);
		createEAttribute(tableRowEClass, TABLE_ROW__COLOR);
		createEAttribute(tableRowEClass, TABLE_ROW__BACKGROUND);

		tableCellEClass = createEClass(TABLE_CELL);
		createEAttribute(tableCellEClass, TABLE_CELL__HEADER);
		createEAttribute(tableCellEClass, TABLE_CELL__COL_SPAN);
		createEAttribute(tableCellEClass, TABLE_CELL__ROW_SPAN);
		createEAttribute(tableCellEClass, TABLE_CELL__COLOR);
		createEAttribute(tableCellEClass, TABLE_CELL__BACKGROUND);

		tooltipEClass = createEClass(TOOLTIP);

		inputGroupEClass = createEClass(INPUT_GROUP);

		formGroupEClass = createEClass(FORM_GROUP);

		collapseEClass = createEClass(COLLAPSE);

		modalEClass = createEClass(MODAL);

		accordionEClass = createEClass(ACCORDION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		HtmlPackage theHtmlPackage = (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bootstrapPageEClass.getESuperTypes().add(theHtmlPackage.getPage());
		EGenericType g1 = createEGenericType(theNcorePackage.getIConsumerFactory());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		appearanceEClass.getEGenericSuperTypes().add(g1);
		bootstrapElementEClass.getESuperTypes().add(theHtmlPackage.getHtmlElement());
		tagEClass.getESuperTypes().add(theHtmlPackage.getTag());
		tagEClass.getESuperTypes().add(this.getBootstrapElement());
		contentTagEClass.getESuperTypes().add(theHtmlPackage.getContentTag());
		contentTagEClass.getESuperTypes().add(this.getBootstrapElement());
		divEClass.getESuperTypes().add(this.getTag());
		itemEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		g1 = createEGenericType(this.getItem());
		actionGroupItemEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getIConsumerFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		actionGroupItemEClass.getEGenericSuperTypes().add(g1);
		linkActionGroupItemEClass.getESuperTypes().add(this.getActionGroupItem());
		contentActionGroupItemEClass.getESuperTypes().add(this.getActionGroupItem());
		contentActionGroupItemEClass.getESuperTypes().add(theHtmlPackage.getContainer());
		actionGroupEClass.getESuperTypes().add(this.getDiv());
		alertEClass.getESuperTypes().add(this.getDiv());
		badgeEClass.getESuperTypes().add(this.getDiv());
		buttonEClass.getESuperTypes().add(this.getDiv());
		g1 = createEGenericType(this.getBootstrapElement());
		containerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		containerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBootstrapElement());
		rowEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getIConsumerFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		rowEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBootstrapElement());
		columnEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theHtmlPackage.getContainer());
		columnEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getIConsumerFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		columnEClass.getEGenericSuperTypes().add(g1);
		cardEClass.getESuperTypes().add(this.getDiv());
		tableRowContainerEClass.getESuperTypes().add(this.getBootstrapElement());
		g1 = createEGenericType(this.getTableRowContainer());
		tableSectionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getIConsumerFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		tableSectionEClass.getEGenericSuperTypes().add(g1);
		tableHeaderEClass.getESuperTypes().add(this.getTableSection());
		g1 = createEGenericType(this.getTableRowContainer());
		tableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		tableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBootstrapElement());
		tableRowEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getIConsumerFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		tableRowEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theHtmlPackage.getContainer());
		tableCellEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBootstrapElement());
		tableCellEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getIConsumerFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		tableCellEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(bootstrapPageEClass, BootstrapPage.class, "BootstrapPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBootstrapPage_Cdn(), ecorePackage.getEBoolean(), "cdn", "true", 0, 1, BootstrapPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstrapPage_Theme(), ecorePackage.getEString(), "theme", null, 0, 1, BootstrapPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appearanceEClass, Appearance.class, "Appearance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppearance_Background(), ecorePackage.getEString(), "background", null, 0, 1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppearance_Attributes(), ecorePackage.getEString(), "attributes", null, 0, 1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppearance_Border(), this.getBorder(), null, "border", null, 0, 4, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppearance_Margin(), this.getSpacing(), null, "margin", null, 0, -1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppearance_Padding(), this.getSpacing(), null, "padding", null, 0, -1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppearance_Text(), this.getText(), null, "text", null, 0, 1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppearance_Float(), this.getFloat(), null, "Float", null, 0, -1, Appearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(borderEClass, Border.class, "Border", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBorder_Color(), ecorePackage.getEString(), "color", null, 1, 1, Border.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBorder_Top(), ecorePackage.getEBoolean(), "top", "true", 0, 1, Border.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBorder_Bottom(), ecorePackage.getEBoolean(), "bottom", "true", 0, 1, Border.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBorder_Left(), ecorePackage.getEBoolean(), "left", "true", 0, 1, Border.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBorder_Right(), ecorePackage.getEBoolean(), "right", "true", 0, 1, Border.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spacingEClass, Spacing.class, "Spacing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpacing_Size(), ecorePackage.getEString(), "size", null, 1, 1, Spacing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacing_Breakpoint(), ecorePackage.getEString(), "breakpoint", null, 0, 1, Spacing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacing_Top(), ecorePackage.getEBoolean(), "top", "true", 0, 1, Spacing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacing_Bottom(), ecorePackage.getEBoolean(), "bottom", "true", 0, 1, Spacing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacing_Left(), ecorePackage.getEBoolean(), "left", "true", 0, 1, Spacing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacing_Right(), ecorePackage.getEBoolean(), "right", "true", 0, 1, Spacing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacing_X(), ecorePackage.getEBoolean(), "x", "false", 0, 1, Spacing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacing_Y(), ecorePackage.getEBoolean(), "y", "false", 0, 1, Spacing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Alignment(), ecorePackage.getEString(), "alignment", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Color(), ecorePackage.getEString(), "color", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Transform(), ecorePackage.getEString(), "transform", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Weight(), ecorePackage.getEString(), "weight", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Monospace(), ecorePackage.getEBoolean(), "monospace", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Italic(), ecorePackage.getEBoolean(), "italic", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Nowrap(), ecorePackage.getEBoolean(), "nowrap", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getText_Truncate(), ecorePackage.getEBoolean(), "truncate", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatEClass, org.nasdanika.vinci.bootstrap.Float.class, "Float", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloat_Side(), ecorePackage.getEString(), "side", null, 1, 1, org.nasdanika.vinci.bootstrap.Float.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat_Breakpoint(), ecorePackage.getEString(), "breakpoint", null, 0, 1, org.nasdanika.vinci.bootstrap.Float.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bootstrapElementEClass, BootstrapElement.class, "BootstrapElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBootstrapElement_Appearance(), this.getAppearance(), null, "appearance", null, 0, 1, BootstrapElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentTagEClass, ContentTag.class, "ContentTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemEClass, Item.class, "Item", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Disabled(), ecorePackage.getEBoolean(), "disabled", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Color(), ecorePackage.getEString(), "color", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionGroupItemEClass, ActionGroupItem.class, "ActionGroupItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEReference(getActionGroupItem_Name(), g1, null, "name", null, 0, -1, ActionGroupItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkActionGroupItemEClass, LinkActionGroupItem.class, "LinkActionGroupItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkActionGroupItem_Url(), ecorePackage.getEString(), "url", null, 1, 1, LinkActionGroupItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentActionGroupItemEClass, ContentActionGroupItem.class, "ContentActionGroupItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionGroupEClass, ActionGroup.class, "ActionGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionGroup_Flush(), ecorePackage.getEBoolean(), "flush", null, 0, 1, ActionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionGroup_Items(), this.getActionGroupItem(), null, "items", null, 0, -1, ActionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alertEClass, Alert.class, "Alert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlert_Color(), ecorePackage.getEString(), "color", null, 0, 1, Alert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(badgeEClass, Badge.class, "Badge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBadge_Color(), ecorePackage.getEString(), "color", null, 0, 1, Badge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breadcrumbsEClass, Breadcrumbs.class, "Breadcrumbs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_Color(), ecorePackage.getEString(), "color", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButton_Outline(), ecorePackage.getEBoolean(), "outline", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonGroupEClass, ButtonGroup.class, "ButtonGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonToolbarEClass, ButtonToolbar.class, "ButtonToolbar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerEClass, org.nasdanika.vinci.bootstrap.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Rows(), this.getRow(), null, "rows", null, 0, -1, org.nasdanika.vinci.bootstrap.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_Fluid(), ecorePackage.getEBoolean(), "fluid", null, 0, 1, org.nasdanika.vinci.bootstrap.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRow_Columns(), this.getColumn(), null, "columns", null, 0, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnWidthEClass, ColumnWidth.class, "ColumnWidth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnWidth_Breakpoint(), ecorePackage.getEString(), "breakpoint", null, 0, 1, ColumnWidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnWidth_Width(), ecorePackage.getEString(), "width", null, 0, 1, ColumnWidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_Width(), this.getColumnWidth(), null, "width", null, 0, -1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardEClass, Card.class, "Card", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCard_Header(), this.getDiv(), null, "header", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Body(), this.getDiv(), null, "body", null, 0, -1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Footer(), this.getDiv(), null, "footer", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropdownEClass, Dropdown.class, "Dropdown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listGroupEClass, ListGroup.class, "ListGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navsEClass, Navs.class, "Navs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navbarEClass, Navbar.class, "Navbar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableRowContainerEClass, TableRowContainer.class, "TableRowContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableRowContainer_Rows(), this.getTableRow(), null, "rows", null, 0, -1, TableRowContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableSectionEClass, TableSection.class, "TableSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableHeaderEClass, TableHeader.class, "TableHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableHeader_Dark(), ecorePackage.getEBoolean(), "dark", null, 0, 1, TableHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableHeader_Light(), ecorePackage.getEBoolean(), "light", null, 0, 1, TableHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Header(), this.getTableHeader(), null, "header", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Body(), this.getTableSection(), null, "body", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Footer(), this.getTableSection(), null, "footer", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Dark(), ecorePackage.getEBoolean(), "dark", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Striped(), ecorePackage.getEBoolean(), "striped", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Bordered(), ecorePackage.getEBoolean(), "bordered", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Borderless(), ecorePackage.getEBoolean(), "borderless", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Hover(), ecorePackage.getEBoolean(), "hover", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Small(), ecorePackage.getEBoolean(), "small", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableRowEClass, TableRow.class, "TableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableRow_Cells(), this.getTableCell(), null, "cells", null, 0, -1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_Color(), ecorePackage.getEString(), "color", null, 0, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableRow_Background(), ecorePackage.getEString(), "background", null, 0, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableCellEClass, TableCell.class, "TableCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableCell_Header(), ecorePackage.getEBoolean(), "header", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableCell_ColSpan(), ecorePackage.getEInt(), "colSpan", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableCell_RowSpan(), ecorePackage.getEInt(), "rowSpan", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableCell_Color(), ecorePackage.getEString(), "color", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableCell_Background(), ecorePackage.getEString(), "background", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tooltipEClass, Tooltip.class, "Tooltip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputGroupEClass, InputGroup.class, "InputGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formGroupEClass, FormGroup.class, "FormGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collapseEClass, Collapse.class, "Collapse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modalEClass, Modal.class, "Modal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accordionEClass, Accordion.class, "Accordion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "Model of Bootstrap elements."
		   });
		addAnnotation
		  (bootstrapPageEClass,
		   source,
		   new String[] {
			   "documentation", "HTML page with bootstrap elements in the head - meta, stylesheets, and scripts.\n\n[Overview video](https://www.youtube.com/watch?v=Q6u6hL10xXA) in Russian."
		   });
		addAnnotation
		  (getBootstrapPage_Cdn(),
		   source,
		   new String[] {
			   "documentation", "If this attribute is true (default) then a generated page contains stylesheet and script elements pointing to Bootstrap CDN (Content Delivery Network)."
		   });
		addAnnotation
		  (getBootstrapPage_Theme(),
		   source,
		   new String[] {
			   "documentation", "Bootstrap [theme](https://www.nasdanika.org/master/products/html/apidocs/org.nasdanika.html.bootstrap/apidocs/org/nasdanika/html/bootstrap/Theme.html). This attribute is applicable only if CDN is set to true. In this case Bootstrap stylesheets added to the page point to a specific theme."
		   });
		addAnnotation
		  (appearanceEClass,
		   source,
		   new String[] {
			   "documentation", "This class is used for configuring common aspects of HTML and Bootstrap elements such as background, spacing, text, etc."
		   });
		addAnnotation
		  (getAppearance_Background(),
		   source,
		   new String[] {
			   "documentation", "Bootstrap color for background."
		   });
		addAnnotation
		  (getAppearance_Attributes(),
		   source,
		   new String[] {
			   "documentation", "HTML attributes in [YAML](https://en.wikipedia.org/wiki/YAML) format. YAML is used because it:\n\n* Provides a convenient way of definining structured/hierarchical attributes such as ``class``, ``style``, and ``data-*``. These attributes are treated in a special way as explained below.\n* Comments improve maintainability.\n* Allows to define a hierarchy of element configurations with ``children`` pesudo-attribute which is not output to HTML.\n\n## Interpolation\n\nAttribute values are interpolated, i.e. tokens in the form of ``${token name[|default value]}`` are replaced with the contextual values or default values, if any. Examples:\n\n* ``${my-style}`` - Token without a default value.\n* ``${font-weight|bold}`` - Token with a default value.\n\n## Regular attributes\n\nFor all top-level keys except ``class``, ``style``, and ``data`` attribute value is produced by converting the value to string for scalars and to JSON string for lists and maps. \nFor attributes which do not start with ``data-`` a warning is issued if the value is not a scalar, i.e. a list or a map.\n\n### Example\n\n```yaml\ntitle: Hello\nhref: \"https://www.nasdanika.org\"\ndata-toggle: \"#mybutton\"\n```\n\n## Class\n\nFor class attribute its value is formed by concantenating elements using space as a separator. If elements are hierarchical then class name is formed by concatenation with a dash (``-``) as a separator.\n\n### Examples\n\nAll these examples yield the same HTML output, which one to use is a question of preference.\n\n#### String value\n\n```yaml\nclass: d-none d-lg-block d-print-block\n```\n\n#### List\n\n```yaml\nclass: \n    - d-none \n    - d-lg-block \n    - d-print-block\n ```\n\n#### Map and List\n\n```yaml\nclass: \n    - d:\n        - none \n        - lg-block \n        - print-block\n ```\n\n#### Map\n\n```yaml\nclass: \n    d:\n        none: true # Boolean values are not concatenated into the class name, they serve as flags. In this case true is needed because none is part of a map, not a list\n        lg: block\n        print: block\n ```\n\n## Data\n\nIf value of ``data`` attbibute is a map then keys of that map get concatenated with ``data`` using dash (``-``) as a separator, them same applies to nested maps. Non-map values become attribute values - scalars are converted to string, lists are converted to JSON string.\n\n### Example\n\n```yaml\ndata:\n    toggle: collapse\n    target: \"#collapseexample\"\n```\n\n## Style\n\nStyle can be defined as a string, list or map. If style is defined as a list, all list values are concatenated with a space as a separator - it is a convent way for long unstructured definitions.\n\nIf style value is a map then the value and its contained map values are processed in the following fashion:\n\n* Keys are concatenated with dash as a separator.\n* List values are contcatenated wtih space as a separator.\n\n### Example\n\n```yaml\nstyle:\n    text:\n        decoration: none\n        color: blue\n        align: center\n        shadow:\n            - 2px\n            - 3px\n            - red\n    border: 1px solid black\n```\n"
		   });
		addAnnotation
		  (getBorder_Color(),
		   source,
		   new String[] {
			   "documentation", "Border bootstrap color."
		   });
		addAnnotation
		  (getBorder_Top(),
		   source,
		   new String[] {
			   "documentation", "Top border."
		   });
		addAnnotation
		  (getBorder_Bottom(),
		   source,
		   new String[] {
			   "documentation", "Bottom border."
		   });
		addAnnotation
		  (getBorder_Left(),
		   source,
		   new String[] {
			   "documentation", "Left border."
		   });
		addAnnotation
		  (getBorder_Right(),
		   source,
		   new String[] {
			   "documentation", "Righ border."
		   });
		addAnnotation
		  (getSpacing_Size(),
		   source,
		   new String[] {
			   "documentation", "Border bootstrap color."
		   });
		addAnnotation
		  (getSpacing_Breakpoint(),
		   source,
		   new String[] {
			   "documentation", "Border bootstrap color."
		   });
		addAnnotation
		  (getSpacing_Top(),
		   source,
		   new String[] {
			   "documentation", "Top spacing."
		   });
		addAnnotation
		  (getSpacing_Bottom(),
		   source,
		   new String[] {
			   "documentation", "Bottom spacing."
		   });
		addAnnotation
		  (getSpacing_Left(),
		   source,
		   new String[] {
			   "documentation", "Left spacing."
		   });
		addAnnotation
		  (getSpacing_Right(),
		   source,
		   new String[] {
			   "documentation", "Righ spacing."
		   });
		addAnnotation
		  (getSpacing_X(),
		   source,
		   new String[] {
			   "documentation", "Horizontal spacing."
		   });
		addAnnotation
		  (getSpacing_Y(),
		   source,
		   new String[] {
			   "documentation", "Vertical spacing."
		   });
		addAnnotation
		  (getText_Alignment(),
		   source,
		   new String[] {
			   "documentation", "Border bootstrap color."
		   });
		addAnnotation
		  (getText_Color(),
		   source,
		   new String[] {
			   "documentation", "Border bootstrap color."
		   });
		addAnnotation
		  (getText_Transform(),
		   source,
		   new String[] {
			   "documentation", "Border bootstrap color."
		   });
		addAnnotation
		  (getText_Weight(),
		   source,
		   new String[] {
			   "documentation", "Border bootstrap color."
		   });
		addAnnotation
		  (getText_Monospace(),
		   source,
		   new String[] {
			   "documentation", "Border bootstrap color."
		   });
		addAnnotation
		  (getText_Italic(),
		   source,
		   new String[] {
			   "documentation", "Border bootstrap color."
		   });
		addAnnotation
		  (getText_Nowrap(),
		   source,
		   new String[] {
			   "documentation", "Border bootstrap color."
		   });
		addAnnotation
		  (getText_Truncate(),
		   source,
		   new String[] {
			   "documentation", "Border bootstrap color."
		   });
		addAnnotation
		  (tagEClass,
		   source,
		   new String[] {
			   "documentation", "HTML tag with Bootstrap appearance"
		   });
		addAnnotation
		  (contentTagEClass,
		   source,
		   new String[] {
			   "documentation", "HTML tag with content and Bootstrap appearance"
		   });
		addAnnotation
		  (divEClass,
		   source,
		   new String[] {
			   "documentation", "HTML DIV with bootstrap styling"
		   });
		addAnnotation
		  (itemEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for model elements which can be active, disabled, and have color."
		   });
		addAnnotation
		  (getItem_Color(),
		   source,
		   new String[] {
			   "documentation", "Bootstrap color."
		   });
		addAnnotation
		  (actionGroupItemEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for action group items"
		   });
		addAnnotation
		  (getActionGroupItem_Name(),
		   source,
		   new String[] {
			   "documentation", "Item name"
		   });
		addAnnotation
		  (linkActionGroupItemEClass,
		   source,
		   new String[] {
			   "documentation", "Click on the item navigates to the link URL."
		   });
		addAnnotation
		  (getLinkActionGroupItem_Url(),
		   source,
		   new String[] {
			   "documentation", "Link URL."
		   });
		addAnnotation
		  (contentActionGroupItemEClass,
		   source,
		   new String[] {
			   "documentation", "Action Group Item with content. Click on the item shows the content in the content container."
		   });
		addAnnotation
		  (actionGroupEClass,
		   source,
		   new String[] {
			   "documentation", "[List group](https://getbootstrap.com/docs/4.0/components/list-group/) with actions (links). "
		   });
		addAnnotation
		  (getActionGroup_Flush(),
		   source,
		   new String[] {
			   "documentation", "Removes borders to render action group items edge-to-edge in a parent container."
		   });
		addAnnotation
		  (getActionGroup_Items(),
		   source,
		   new String[] {
			   "documentation", "Group items."
		   });
		addAnnotation
		  (buttonEClass,
		   source,
		   new String[] {
			   "documentation", "TODO - size - enum? Block, active, disabled."
		   });
		addAnnotation
		  (containerEClass,
		   source,
		   new String[] {
			   "documentation", "[Bootstrap layout](https://getbootstrap.com/docs/4.3/layout/overview/) container contains rows which in turn contain columns."
		   });
		addAnnotation
		  (getContainer_Fluid(),
		   source,
		   new String[] {
			   "documentation", "Fluid container spans the entire width of the viewport."
		   });
		addAnnotation
		  (columnWidthEClass,
		   source,
		   new String[] {
			   "documentation", "Column width"
		   });
		addAnnotation
		  (getColumnWidth_Breakpoint(),
		   source,
		   new String[] {
			   "documentation", "Breakpoint."
		   });
		addAnnotation
		  (getColumnWidth_Width(),
		   source,
		   new String[] {
			   "documentation", "Column width."
		   });
		addAnnotation
		  (tableEClass,
		   source,
		   new String[] {
			   "documentation", "[Bootstrap table](https://getbootstrap.com/docs/4.0/content/tables/)"
		   });
		addAnnotation
		  (getTableCell_Header(),
		   source,
		   new String[] {
			   "documentation", "If true, table cell is generated as ``<th>`` instead of the default ``<td>``."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (bootstrapPageEClass,
		   source,
		   new String[] {
			   "constraints", "theme"
		   });
		addAnnotation
		  (appearanceEClass,
		   source,
		   new String[] {
			   "constraints", "border_overlap background attributes"
		   });
		addAnnotation
		  (borderEClass,
		   source,
		   new String[] {
			   "constraints", "placement color"
		   });
		addAnnotation
		  (spacingEClass,
		   source,
		   new String[] {
			   "constraints", "size breakpoint"
		   });
		addAnnotation
		  (textEClass,
		   source,
		   new String[] {
			   "constraints", "attributes"
		   });
		addAnnotation
		  (floatEClass,
		   source,
		   new String[] {
			   "constraints", "attributes"
		   });
		addAnnotation
		  (itemEClass,
		   source,
		   new String[] {
			   "constraints", "color activeAndDisabled"
		   });
		addAnnotation
		  (actionGroupEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (columnWidthEClass,
		   source,
		   new String[] {
			   "constraints", "breakpoint width"
		   });
	}

} //BootstrapPackageImpl
