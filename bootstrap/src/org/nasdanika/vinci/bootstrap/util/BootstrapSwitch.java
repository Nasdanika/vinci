/**
 */
package org.nasdanika.vinci.bootstrap.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;
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
import org.nasdanika.vinci.bootstrap.ColumnWidth;
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
import org.nasdanika.vinci.html.HtmlElement;
import org.nasdanika.vinci.html.Page;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.vinci.bootstrap.BootstrapPackage
 * @generated
 */
public class BootstrapSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BootstrapPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapSwitch() {
		if (modelPackage == null) {
			modelPackage = BootstrapPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BootstrapPackage.BOOTSTRAP_PAGE: {
				BootstrapPage bootstrapPage = (BootstrapPage)theEObject;
				T1 result = caseBootstrapPage(bootstrapPage);
				if (result == null) result = casePage(bootstrapPage);
				if (result == null) result = caseNamedElement(bootstrapPage);
				if (result == null) result = caseISupplierFactory(bootstrapPage);
				if (result == null) result = caseModelElement(bootstrapPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.APPEARANCE: {
				Appearance appearance = (Appearance)theEObject;
				T1 result = caseAppearance(appearance);
				if (result == null) result = caseIConsumerFactory(appearance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.BORDER: {
				Border border = (Border)theEObject;
				T1 result = caseBorder(border);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.SPACING: {
				Spacing spacing = (Spacing)theEObject;
				T1 result = caseSpacing(spacing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TEXT: {
				Text text = (Text)theEObject;
				T1 result = caseText(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.FLOAT: {
				org.nasdanika.vinci.bootstrap.Float float_ = (org.nasdanika.vinci.bootstrap.Float)theEObject;
				T1 result = caseFloat(float_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.BOOTSTRAP_ELEMENT: {
				BootstrapElement bootstrapElement = (BootstrapElement)theEObject;
				T1 result = caseBootstrapElement(bootstrapElement);
				if (result == null) result = caseHtmlElement(bootstrapElement);
				if (result == null) result = caseModelElement(bootstrapElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T1 result = caseTag(tag);
				if (result == null) result = caseHtml_Tag(tag);
				if (result == null) result = caseBootstrapElement(tag);
				if (result == null) result = caseHtmlElement(tag);
				if (result == null) result = caseISupplierFactory(tag);
				if (result == null) result = caseModelElement(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.DIV: {
				Div div = (Div)theEObject;
				T1 result = caseDiv(div);
				if (result == null) result = caseTag(div);
				if (result == null) result = caseHtml_Tag(div);
				if (result == null) result = caseBootstrapElement(div);
				if (result == null) result = caseHtmlElement(div);
				if (result == null) result = caseISupplierFactory(div);
				if (result == null) result = caseModelElement(div);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ITEM: {
				Item item = (Item)theEObject;
				T1 result = caseItem(item);
				if (result == null) result = caseModelElement(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ACTION_GROUP_ITEM: {
				ActionGroupItem actionGroupItem = (ActionGroupItem)theEObject;
				T1 result = caseActionGroupItem(actionGroupItem);
				if (result == null) result = caseItem(actionGroupItem);
				if (result == null) result = caseIConsumerFactory(actionGroupItem);
				if (result == null) result = caseModelElement(actionGroupItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.LINK_ACTION_GROUP_ITEM: {
				LinkActionGroupItem linkActionGroupItem = (LinkActionGroupItem)theEObject;
				T1 result = caseLinkActionGroupItem(linkActionGroupItem);
				if (result == null) result = caseActionGroupItem(linkActionGroupItem);
				if (result == null) result = caseItem(linkActionGroupItem);
				if (result == null) result = caseIConsumerFactory(linkActionGroupItem);
				if (result == null) result = caseModelElement(linkActionGroupItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.CONTENT_ACTION_GROUP_ITEM: {
				ContentActionGroupItem contentActionGroupItem = (ContentActionGroupItem)theEObject;
				T1 result = caseContentActionGroupItem(contentActionGroupItem);
				if (result == null) result = caseActionGroupItem(contentActionGroupItem);
				if (result == null) result = caseHtml_Container(contentActionGroupItem);
				if (result == null) result = caseItem(contentActionGroupItem);
				if (result == null) result = caseIConsumerFactory(contentActionGroupItem);
				if (result == null) result = caseModelElement(contentActionGroupItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ACTION_GROUP: {
				ActionGroup actionGroup = (ActionGroup)theEObject;
				T1 result = caseActionGroup(actionGroup);
				if (result == null) result = caseDiv(actionGroup);
				if (result == null) result = caseTag(actionGroup);
				if (result == null) result = caseHtml_Tag(actionGroup);
				if (result == null) result = caseBootstrapElement(actionGroup);
				if (result == null) result = caseHtmlElement(actionGroup);
				if (result == null) result = caseISupplierFactory(actionGroup);
				if (result == null) result = caseModelElement(actionGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ALERT: {
				Alert alert = (Alert)theEObject;
				T1 result = caseAlert(alert);
				if (result == null) result = caseDiv(alert);
				if (result == null) result = caseTag(alert);
				if (result == null) result = caseHtml_Tag(alert);
				if (result == null) result = caseBootstrapElement(alert);
				if (result == null) result = caseHtmlElement(alert);
				if (result == null) result = caseISupplierFactory(alert);
				if (result == null) result = caseModelElement(alert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.BADGE: {
				Badge badge = (Badge)theEObject;
				T1 result = caseBadge(badge);
				if (result == null) result = caseDiv(badge);
				if (result == null) result = caseTag(badge);
				if (result == null) result = caseHtml_Tag(badge);
				if (result == null) result = caseBootstrapElement(badge);
				if (result == null) result = caseHtmlElement(badge);
				if (result == null) result = caseISupplierFactory(badge);
				if (result == null) result = caseModelElement(badge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.BREADCRUMBS: {
				Breadcrumbs breadcrumbs = (Breadcrumbs)theEObject;
				T1 result = caseBreadcrumbs(breadcrumbs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.BUTTON: {
				Button button = (Button)theEObject;
				T1 result = caseButton(button);
				if (result == null) result = caseDiv(button);
				if (result == null) result = caseTag(button);
				if (result == null) result = caseHtml_Tag(button);
				if (result == null) result = caseBootstrapElement(button);
				if (result == null) result = caseHtmlElement(button);
				if (result == null) result = caseISupplierFactory(button);
				if (result == null) result = caseModelElement(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.BUTTON_GROUP: {
				ButtonGroup buttonGroup = (ButtonGroup)theEObject;
				T1 result = caseButtonGroup(buttonGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.BUTTON_TOOLBAR: {
				ButtonToolbar buttonToolbar = (ButtonToolbar)theEObject;
				T1 result = caseButtonToolbar(buttonToolbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T1 result = caseContainer(container);
				if (result == null) result = caseBootstrapElement(container);
				if (result == null) result = caseISupplierFactory(container);
				if (result == null) result = caseHtmlElement(container);
				if (result == null) result = caseModelElement(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ROW: {
				Row row = (Row)theEObject;
				T1 result = caseRow(row);
				if (result == null) result = caseBootstrapElement(row);
				if (result == null) result = caseHtmlElement(row);
				if (result == null) result = caseModelElement(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.COLUMN_WIDTH: {
				ColumnWidth columnWidth = (ColumnWidth)theEObject;
				T1 result = caseColumnWidth(columnWidth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.COLUMN: {
				Column column = (Column)theEObject;
				T1 result = caseColumn(column);
				if (result == null) result = caseBootstrapElement(column);
				if (result == null) result = caseHtml_Container(column);
				if (result == null) result = caseHtmlElement(column);
				if (result == null) result = caseModelElement(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.CARD: {
				Card card = (Card)theEObject;
				T1 result = caseCard(card);
				if (result == null) result = caseDiv(card);
				if (result == null) result = caseTag(card);
				if (result == null) result = caseHtml_Tag(card);
				if (result == null) result = caseBootstrapElement(card);
				if (result == null) result = caseHtmlElement(card);
				if (result == null) result = caseISupplierFactory(card);
				if (result == null) result = caseModelElement(card);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.DROPDOWN: {
				Dropdown dropdown = (Dropdown)theEObject;
				T1 result = caseDropdown(dropdown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.FORM: {
				Form form = (Form)theEObject;
				T1 result = caseForm(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.LIST_GROUP: {
				ListGroup listGroup = (ListGroup)theEObject;
				T1 result = caseListGroup(listGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.NAVS: {
				Navs navs = (Navs)theEObject;
				T1 result = caseNavs(navs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.NAVBAR: {
				Navbar navbar = (Navbar)theEObject;
				T1 result = caseNavbar(navbar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TABLE: {
				Table table = (Table)theEObject;
				T1 result = caseTable(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TABLE_ROW: {
				TableRow tableRow = (TableRow)theEObject;
				T1 result = caseTableRow(tableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TABLE_COLUMN: {
				TableColumn tableColumn = (TableColumn)theEObject;
				T1 result = caseTableColumn(tableColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.TOOLTIP: {
				Tooltip tooltip = (Tooltip)theEObject;
				T1 result = caseTooltip(tooltip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.INPUT_GROUP: {
				InputGroup inputGroup = (InputGroup)theEObject;
				T1 result = caseInputGroup(inputGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.FORM_GROUP: {
				FormGroup formGroup = (FormGroup)theEObject;
				T1 result = caseFormGroup(formGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.COLLAPSE: {
				Collapse collapse = (Collapse)theEObject;
				T1 result = caseCollapse(collapse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.MODAL: {
				Modal modal = (Modal)theEObject;
				T1 result = caseModal(modal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BootstrapPackage.ACCORDION: {
				Accordion accordion = (Accordion)theEObject;
				T1 result = caseAccordion(accordion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBootstrapPage(BootstrapPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appearance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appearance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAppearance(Appearance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBorder(Border object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spacing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spacing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSpacing(Spacing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFloat(org.nasdanika.vinci.bootstrap.Float object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBootstrapElement(BootstrapElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Width</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Width</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseColumnWidth(ColumnWidth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCard(Card object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDiv(Div object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Group Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Group Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActionGroupItem(ActionGroupItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Action Group Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Action Group Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLinkActionGroupItem(LinkActionGroupItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Action Group Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Action Group Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContentActionGroupItem(ContentActionGroupItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAlert(Alert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Badge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Badge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBadge(Badge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseButtonGroup(ButtonGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Toolbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Toolbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseButtonToolbar(ButtonToolbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dropdown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dropdown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDropdown(Dropdown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActionGroup(ActionGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breadcrumbs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breadcrumbs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBreadcrumbs(Breadcrumbs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseListGroup(ListGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNavs(Navs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navbar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navbar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNavbar(Navbar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTableRow(TableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTableColumn(TableColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tooltip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tooltip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTooltip(Tooltip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInputGroup(InputGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFormGroup(FormGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collapse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collapse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCollapse(Collapse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModal(Modal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accordion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accordion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAccordion(Accordion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISupplier Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISupplier Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseISupplierFactory(SupplierFactory<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHtml_Container(org.nasdanika.vinci.html.Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHtml_Tag(org.nasdanika.vinci.html.Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHtmlElement(HtmlElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IConsumer Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IConsumer Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseIConsumerFactory(ConsumerFactory<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //BootstrapSwitch
