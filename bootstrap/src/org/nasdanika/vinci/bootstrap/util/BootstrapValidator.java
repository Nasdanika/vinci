/**
 */
package org.nasdanika.vinci.bootstrap.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.common.Util;
import org.nasdanika.emf.DiagnosticHelper;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Theme;
import org.nasdanika.vinci.bootstrap.Accordion;
import org.nasdanika.vinci.bootstrap.ActionGroup;
import org.nasdanika.vinci.bootstrap.ActionGroupItem;
import org.nasdanika.vinci.bootstrap.Alert;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.Badge;
import org.nasdanika.vinci.bootstrap.BootstrapElement;
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
import org.nasdanika.vinci.bootstrap.Container;
import org.nasdanika.vinci.bootstrap.ContentActionGroupItem;
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
import org.nasdanika.vinci.bootstrap.TableColumn;
import org.nasdanika.vinci.bootstrap.TableRow;
import org.nasdanika.vinci.bootstrap.Tag;
import org.nasdanika.vinci.bootstrap.Text;
import org.nasdanika.vinci.bootstrap.Tooltip;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage
 * @generated
 */
public class BootstrapValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BootstrapValidator INSTANCE = new BootstrapValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.nasdanika.vinci.bootstrap";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return BootstrapPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case BootstrapPackage.BOOTSTRAP_PAGE:
				return validateBootstrapPage((BootstrapPage)value, diagnostics, context);
			case BootstrapPackage.APPEARANCE:
				return validateAppearance((Appearance)value, diagnostics, context);
			case BootstrapPackage.BORDER:
				return validateBorder((Border)value, diagnostics, context);
			case BootstrapPackage.SPACING:
				return validateSpacing((Spacing)value, diagnostics, context);
			case BootstrapPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case BootstrapPackage.FLOAT:
				return validateFloat((org.nasdanika.vinci.bootstrap.Float)value, diagnostics, context);
			case BootstrapPackage.BOOTSTRAP_ELEMENT:
				return validateBootstrapElement((BootstrapElement)value, diagnostics, context);
			case BootstrapPackage.TAG:
				return validateTag((Tag)value, diagnostics, context);
			case BootstrapPackage.DIV:
				return validateDiv((Div)value, diagnostics, context);
			case BootstrapPackage.ITEM:
				return validateItem((Item)value, diagnostics, context);
			case BootstrapPackage.ACTION_GROUP_ITEM:
				return validateActionGroupItem((ActionGroupItem)value, diagnostics, context);
			case BootstrapPackage.LINK_ACTION_GROUP_ITEM:
				return validateLinkActionGroupItem((LinkActionGroupItem)value, diagnostics, context);
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM:
				return validateContentActionGroupItem((ContentActionGroupItem)value, diagnostics, context);
			case BootstrapPackage.ACTION_GROUP:
				return validateActionGroup((ActionGroup)value, diagnostics, context);
			case BootstrapPackage.ALERT:
				return validateAlert((Alert)value, diagnostics, context);
			case BootstrapPackage.BADGE:
				return validateBadge((Badge)value, diagnostics, context);
			case BootstrapPackage.BREADCRUMBS:
				return validateBreadcrumbs((Breadcrumbs)value, diagnostics, context);
			case BootstrapPackage.BUTTON:
				return validateButton((Button)value, diagnostics, context);
			case BootstrapPackage.BUTTON_GROUP:
				return validateButtonGroup((ButtonGroup)value, diagnostics, context);
			case BootstrapPackage.BUTTON_TOOLBAR:
				return validateButtonToolbar((ButtonToolbar)value, diagnostics, context);
			case BootstrapPackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case BootstrapPackage.ROW:
				return validateRow((Row)value, diagnostics, context);
			case BootstrapPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case BootstrapPackage.CARD:
				return validateCard((Card)value, diagnostics, context);
			case BootstrapPackage.DROPDOWN:
				return validateDropdown((Dropdown)value, diagnostics, context);
			case BootstrapPackage.FORM:
				return validateForm((Form)value, diagnostics, context);
			case BootstrapPackage.LIST_GROUP:
				return validateListGroup((ListGroup)value, diagnostics, context);
			case BootstrapPackage.NAVS:
				return validateNavs((Navs)value, diagnostics, context);
			case BootstrapPackage.NAVBAR:
				return validateNavbar((Navbar)value, diagnostics, context);
			case BootstrapPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case BootstrapPackage.TABLE_ROW:
				return validateTableRow((TableRow)value, diagnostics, context);
			case BootstrapPackage.TABLE_COLUMN:
				return validateTableColumn((TableColumn)value, diagnostics, context);
			case BootstrapPackage.TOOLTIP:
				return validateTooltip((Tooltip)value, diagnostics, context);
			case BootstrapPackage.INPUT_GROUP:
				return validateInputGroup((InputGroup)value, diagnostics, context);
			case BootstrapPackage.FORM_GROUP:
				return validateFormGroup((FormGroup)value, diagnostics, context);
			case BootstrapPackage.COLLAPSE:
				return validateCollapse((Collapse)value, diagnostics, context);
			case BootstrapPackage.MODAL:
				return validateModal((Modal)value, diagnostics, context);
			case BootstrapPackage.ACCORDION:
				return validateAccordion((Accordion)value, diagnostics, context);
			case BootstrapPackage.COLOR:
				return validateColor((Color)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBootstrapPage(BootstrapPage bootstrapPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bootstrapPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bootstrapPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bootstrapPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bootstrapPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bootstrapPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bootstrapPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bootstrapPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bootstrapPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bootstrapPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateBootstrapPage_theme(bootstrapPage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the theme constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBootstrapPage_theme(BootstrapPage bootstrapPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null && !Util.isBlank(bootstrapPage.getTheme())) {			
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, bootstrapPage);
			try {
				Theme.valueOf(bootstrapPage.getTheme());				
			} catch (Exception e) {
				helper.error("Invalid theme: "+bootstrapPage.getTheme()+", shall be one of the Theme enum constants: " + Arrays.toString(Theme.values()), BootstrapPackage.Literals.BOOTSTRAP_PAGE__THEME);
			}
			return helper.isSuccess();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppearance(Appearance appearance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(appearance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(appearance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(appearance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(appearance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(appearance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(appearance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(appearance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(appearance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(appearance, diagnostics, context);
		if (result || diagnostics != null) result &= validateAppearance_border_overlap(appearance, diagnostics, context);
		if (result || diagnostics != null) result &= validateAppearance_background(appearance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the border_overlap constraint of '<em>Appearance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAppearance_border_overlap(Appearance appearance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {			
			Set<String> colors = new HashSet<>();
			boolean topDefined = false;
			boolean bottomDefined = false;
			boolean leftDefined = false;
			boolean rightDefined = false;
			for (Border border: appearance.getBorder()) {
				DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, appearance);
				if (!colors.add(border.getColor())) {
					helper.warning("Duplicate border color: "+border.getColor(), BootstrapPackage.Literals.BORDER__COLOR);
				}
				if (border.isTop()) {
					if (topDefined) {
						helper.warning("Duplicate top border definition", BootstrapPackage.Literals.BORDER__TOP);						
					}
					topDefined = true;
				}
				if (border.isBottom()) {
					if (bottomDefined) {
						helper.warning("Duplicate bottom border definition", BootstrapPackage.Literals.BORDER__BOTTOM);						
					}
					bottomDefined = true;
				}
				if (border.isLeft()) {
					if (leftDefined) {
						helper.warning("Duplicate left border definition", BootstrapPackage.Literals.BORDER__LEFT);						
					}
					leftDefined = true;
				}
				if (border.isRight()) {
					if (rightDefined) {
						helper.warning("Duplicate right border definition", BootstrapPackage.Literals.BORDER__RIGHT);						
					}
					rightDefined = true;
				}
			}
		}
		return true;
	}

	/**
	 * Validates the background constraint of '<em>Appearance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAppearance_background(Appearance appearance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null && !Util.isBlank(appearance.getBackground())) {			
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, appearance);
			try {
				Color.valueOf(appearance.getBackground());				
			} catch (Exception e) {
				helper.error("Invalid color: "+appearance.getBackground()+", shall be one of Color enum constants: " + Arrays.toString(Color.values()), BootstrapPackage.Literals.APPEARANCE__BACKGROUND);
			}
			return helper.isSuccess();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBorder(Border border, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(border, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(border, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(border, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(border, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(border, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(border, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(border, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(border, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(border, diagnostics, context);
		if (result || diagnostics != null) result &= validateBorder_placement(border, diagnostics, context);
		if (result || diagnostics != null) result &= validateBorder_color(border, diagnostics, context);
		return result;
	}

	/**
	 * Validates the placement constraint of '<em>Border</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBorder_placement(Border border, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null && !border.isBottom() && !border.isLeft() && !border.isRight() && !border.isTop()) {			
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, border);
			helper.error("At least one of top, bottom, left, or right shall be selected");
			return helper.isSuccess();
		}
		return true;
	}

	/**
	 * Validates the color constraint of '<em>Border</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBorder_color(Border border, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {			
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, border);
			if (Util.isBlank(border.getColor())) {
//				 helper.error("Color is mandatory", BootstrapPackage.Literals.BORDER__COLOR);				
			} else {
				try {
					Color.valueOf(border.getColor());				
				} catch (Exception e) {
					helper.error("Invalid color: "+border.getColor()+", shall be one of Color enum constants: " + Arrays.toString(Color.values()), BootstrapPackage.Literals.BORDER__COLOR);
				}
			}
			return helper.isSuccess();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpacing(Spacing spacing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(spacing, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(spacing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(spacing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(spacing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(spacing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(spacing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(spacing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(spacing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(spacing, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpacing_size(spacing, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpacing_breakpoint(spacing, diagnostics, context);
		return result;
	}

	/**
	 * Validates the size constraint of '<em>Spacing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSpacing_size(Spacing spacing, DiagnosticChain diagnostics, Map<Object, Object> context) {
//		if (diagnostics != null && !Util.isBlank(spacing.getColor())) {			
//			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, item);
//			try {
//				Color.valueOf(item.getColor());				
//			} catch (Exception e) {
//				helper.error("Invalid color: "+item.getColor()+", shall be one of Color enum constants: " + Arrays.toString(Color.values()), BootstrapPackage.Literals.ITEM__COLOR);
//			}
//			return helper.isSuccess();
//		}
		return true;
	}

	/**
	 * Validates the breakpoint constraint of '<em>Spacing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpacing_breakpoint(Spacing spacing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "breakpoint", getObjectLabel(spacing, context) },
						 new Object[] { spacing },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(text, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat(org.nasdanika.vinci.bootstrap.Float float_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBootstrapElement(BootstrapElement bootstrapElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bootstrapElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTag(Tag tag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiv(Div div, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(div, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(item, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_color(item, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_activeAndDisabled(item, diagnostics, context);
		return result;
	}

	/**
	 * Validates the color constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateItem_color(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null && !Util.isBlank(item.getColor())) {			
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, item);
			try {
				Color.valueOf(item.getColor());				
			} catch (Exception e) {
				helper.error("Invalid color: "+item.getColor()+", shall be one of Color enum constants: " + Arrays.toString(Color.values()), BootstrapPackage.Literals.ITEM__COLOR);
			}
			return helper.isSuccess();
		}
		return true;
	}

	/**
	 * Validates the activeAndDisabled constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateItem_activeAndDisabled(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null && item.isActive() && item.isDisabled()) {
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, item);
			helper.warning("Item is active and disabled at the same time");
			return helper.isSuccess();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionGroupItem(ActionGroupItem actionGroupItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actionGroupItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_color(actionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_activeAndDisabled(actionGroupItem, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkActionGroupItem(LinkActionGroupItem linkActionGroupItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkActionGroupItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_color(linkActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_activeAndDisabled(linkActionGroupItem, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentActionGroupItem(ContentActionGroupItem contentActionGroupItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contentActionGroupItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(contentActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(contentActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(contentActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(contentActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(contentActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(contentActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(contentActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(contentActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_color(contentActionGroupItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_activeAndDisabled(contentActionGroupItem, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionGroup(ActionGroup actionGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlert(Alert alert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alert, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBadge(Badge badge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(badge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBreadcrumbs(Breadcrumbs breadcrumbs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(breadcrumbs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButton(Button button, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(button, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButtonGroup(ButtonGroup buttonGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buttonGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButtonToolbar(ButtonToolbar buttonToolbar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buttonToolbar, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(container, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRow(Row row, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(row, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(column, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCard(Card card, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(card, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropdown(Dropdown dropdown, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropdown, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(form, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListGroup(ListGroup listGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavs(Navs navs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(navs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavbar(Navbar navbar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(navbar, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(table, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableRow(TableRow tableRow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableRow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableColumn(TableColumn tableColumn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableColumn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTooltip(Tooltip tooltip, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tooltip, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputGroup(InputGroup inputGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormGroup(FormGroup formGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollapse(Collapse collapse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collapse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModal(Modal modal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccordion(Accordion accordion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accordion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor(Color color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BootstrapValidator
