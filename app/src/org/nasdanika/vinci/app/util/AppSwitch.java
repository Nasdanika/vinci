/**
 */
package org.nasdanika.vinci.app.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.ncore.Configurable;
import org.nasdanika.ncore.Entity;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NamedElement;
import org.nasdanika.vinci.app.*;
import org.nasdanika.vinci.bootstrap.BootstrapElement;
import org.nasdanika.vinci.html.HtmlElement;

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
 * @see org.nasdanika.vinci.app.AppPackage
 * @generated
 */
public class AppSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AppPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppSwitch() {
		if (modelPackage == null) {
			modelPackage = AppPackage.eINSTANCE;
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AppPackage.CONTAINER: {
				Container<?> container = (Container<?>)theEObject;
				T result = caseContainer(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseEntity(label);
				if (result == null) result = caseModelElement(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.CATEGORY: {
				Category<?> category = (Category<?>)theEObject;
				T result = caseCategory(category);
				if (result == null) result = caseLabel(category);
				if (result == null) result = caseContainer(category);
				if (result == null) result = caseEntity(category);
				if (result == null) result = caseModelElement(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION_ELEMENT: {
				ActionElement actionElement = (ActionElement)theEObject;
				T result = caseActionElement(actionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ABSTRACT_ACTION: {
				AbstractAction abstractAction = (AbstractAction)theEObject;
				T result = caseAbstractAction(abstractAction);
				if (result == null) result = caseActionElement(abstractAction);
				if (result == null) result = caseConfigurable(abstractAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION_CATEGORY: {
				ActionCategory actionCategory = (ActionCategory)theEObject;
				T result = caseActionCategory(actionCategory);
				if (result == null) result = caseCategory(actionCategory);
				if (result == null) result = caseActionElement(actionCategory);
				if (result == null) result = caseLabel(actionCategory);
				if (result == null) result = caseContainer(actionCategory);
				if (result == null) result = caseEntity(actionCategory);
				if (result == null) result = caseModelElement(actionCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION_BASE: {
				ActionBase actionBase = (ActionBase)theEObject;
				T result = caseActionBase(actionBase);
				if (result == null) result = caseLabel(actionBase);
				if (result == null) result = caseAbstractAction(actionBase);
				if (result == null) result = caseContainer(actionBase);
				if (result == null) result = caseEntity(actionBase);
				if (result == null) result = caseActionElement(actionBase);
				if (result == null) result = caseConfigurable(actionBase);
				if (result == null) result = caseModelElement(actionBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION_MAPPING: {
				ActionMapping actionMapping = (ActionMapping)theEObject;
				T result = caseActionMapping(actionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION_LINK: {
				ActionLink actionLink = (ActionLink)theEObject;
				T result = caseActionLink(actionLink);
				if (result == null) result = caseAbstractAction(actionLink);
				if (result == null) result = caseActionElement(actionLink);
				if (result == null) result = caseConfigurable(actionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION_REFERENCE: {
				ActionReference actionReference = (ActionReference)theEObject;
				T result = caseActionReference(actionReference);
				if (result == null) result = caseAbstractAction(actionReference);
				if (result == null) result = caseActionElement(actionReference);
				if (result == null) result = caseConfigurable(actionReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseActionBase(action);
				if (result == null) result = caseLabel(action);
				if (result == null) result = caseAbstractAction(action);
				if (result == null) result = caseContainer(action);
				if (result == null) result = caseEntity(action);
				if (result == null) result = caseActionElement(action);
				if (result == null) result = caseConfigurable(action);
				if (result == null) result = caseModelElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.PARTITION: {
				Partition partition = (Partition)theEObject;
				T result = casePartition(partition);
				if (result == null) result = caseActionBase(partition);
				if (result == null) result = caseLabel(partition);
				if (result == null) result = caseAbstractAction(partition);
				if (result == null) result = caseContainer(partition);
				if (result == null) result = caseEntity(partition);
				if (result == null) result = caseActionElement(partition);
				if (result == null) result = caseConfigurable(partition);
				if (result == null) result = caseModelElement(partition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION: {
				BootstrapContainerApplication bootstrapContainerApplication = (BootstrapContainerApplication)theEObject;
				T result = caseBootstrapContainerApplication(bootstrapContainerApplication);
				if (result == null) result = caseBootstrapElement(bootstrapContainerApplication);
				if (result == null) result = caseHtmlElement(bootstrapContainerApplication);
				if (result == null) result = caseModelElement(bootstrapContainerApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION: {
				BootstrapContainerApplicationSection bootstrapContainerApplicationSection = (BootstrapContainerApplicationSection)theEObject;
				T result = caseBootstrapContainerApplicationSection(bootstrapContainerApplicationSection);
				if (result == null) result = caseBootstrapElement(bootstrapContainerApplicationSection);
				if (result == null) result = caseHtml_Container(bootstrapContainerApplicationSection);
				if (result == null) result = caseHtmlElement(bootstrapContainerApplicationSection);
				if (result == null) result = caseModelElement(bootstrapContainerApplicationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_PANEL: {
				BootstrapContainerApplicationPanel bootstrapContainerApplicationPanel = (BootstrapContainerApplicationPanel)theEObject;
				T result = caseBootstrapContainerApplicationPanel(bootstrapContainerApplicationPanel);
				if (result == null) result = caseBootstrapContainerApplicationSection(bootstrapContainerApplicationPanel);
				if (result == null) result = caseBootstrapElement(bootstrapContainerApplicationPanel);
				if (result == null) result = caseHtml_Container(bootstrapContainerApplicationPanel);
				if (result == null) result = caseHtmlElement(bootstrapContainerApplicationPanel);
				if (result == null) result = caseModelElement(bootstrapContainerApplicationPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				T result = caseWidget(widget);
				if (result == null) result = caseNamedElement(widget);
				if (result == null) result = caseHtml_Container(widget);
				if (result == null) result = caseModelElement(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <E> T caseCategory(Category<E> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartition(Partition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bootstrap Container Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bootstrap Container Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBootstrapContainerApplication(BootstrapContainerApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bootstrap Container Application Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bootstrap Container Application Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBootstrapContainerApplicationSection(BootstrapContainerApplicationSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bootstrap Container Application Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bootstrap Container Application Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBootstrapContainerApplicationPanel(BootstrapContainerApplicationPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidget(Widget object) {
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
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurable(Configurable object) {
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
	public T caseHtmlElement(HtmlElement object) {
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
	public T caseBootstrapElement(BootstrapElement object) {
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
	public T caseHtml_Container(org.nasdanika.vinci.html.Container object) {
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
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionMapping(ActionMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionLink(ActionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionReference(ActionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionElement(ActionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAction(AbstractAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionCategory(ActionCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionBase(ActionBase object) {
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
	public <E> T caseContainer(Container<E> object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //AppSwitch
