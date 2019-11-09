/**
 */
package org.nasdanika.vinci.app.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.WorkFactory;
import org.nasdanika.ncore.ModelElement;
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
public class AppSwitch<T1> extends Switch<T1> {
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AppPackage.CONTAINER: {
				Container<?> container = (Container<?>)theEObject;
				T1 result = caseContainer(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.LABEL: {
				Label label = (Label)theEObject;
				T1 result = caseLabel(label);
				if (result == null) result = caseModelElement(label);
				if (result == null) result = caseWorkFactory(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.CATEGORY: {
				Category<?> category = (Category<?>)theEObject;
				T1 result = caseCategory(category);
				if (result == null) result = caseLabel(category);
				if (result == null) result = caseContainer(category);
				if (result == null) result = caseModelElement(category);
				if (result == null) result = caseWorkFactory(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION_ELEMENT: {
				ActionElement actionElement = (ActionElement)theEObject;
				T1 result = caseActionElement(actionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ABSTRACT_ACTION: {
				AbstractAction abstractAction = (AbstractAction)theEObject;
				T1 result = caseAbstractAction(abstractAction);
				if (result == null) result = caseActionElement(abstractAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION_CATEGORY: {
				ActionCategory actionCategory = (ActionCategory)theEObject;
				T1 result = caseActionCategory(actionCategory);
				if (result == null) result = caseCategory(actionCategory);
				if (result == null) result = caseActionElement(actionCategory);
				if (result == null) result = caseLabel(actionCategory);
				if (result == null) result = caseContainer(actionCategory);
				if (result == null) result = caseModelElement(actionCategory);
				if (result == null) result = caseWorkFactory(actionCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION_BASE: {
				ActionBase actionBase = (ActionBase)theEObject;
				T1 result = caseActionBase(actionBase);
				if (result == null) result = caseLabel(actionBase);
				if (result == null) result = caseAbstractAction(actionBase);
				if (result == null) result = caseContainer(actionBase);
				if (result == null) result = caseModelElement(actionBase);
				if (result == null) result = caseWorkFactory(actionBase);
				if (result == null) result = caseActionElement(actionBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION_MAPPING: {
				ActionMapping actionMapping = (ActionMapping)theEObject;
				T1 result = caseActionMapping(actionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION_LINK: {
				ActionLink actionLink = (ActionLink)theEObject;
				T1 result = caseActionLink(actionLink);
				if (result == null) result = caseAbstractAction(actionLink);
				if (result == null) result = caseActionElement(actionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION_REFERENCE: {
				ActionReference actionReference = (ActionReference)theEObject;
				T1 result = caseActionReference(actionReference);
				if (result == null) result = caseAbstractAction(actionReference);
				if (result == null) result = caseActionElement(actionReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION: {
				Action action = (Action)theEObject;
				T1 result = caseAction(action);
				if (result == null) result = caseActionBase(action);
				if (result == null) result = caseLabel(action);
				if (result == null) result = caseAbstractAction(action);
				if (result == null) result = caseContainer(action);
				if (result == null) result = caseModelElement(action);
				if (result == null) result = caseWorkFactory(action);
				if (result == null) result = caseActionElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.PARTITION: {
				Partition partition = (Partition)theEObject;
				T1 result = casePartition(partition);
				if (result == null) result = caseActionBase(partition);
				if (result == null) result = caseLabel(partition);
				if (result == null) result = caseAbstractAction(partition);
				if (result == null) result = caseContainer(partition);
				if (result == null) result = caseModelElement(partition);
				if (result == null) result = caseWorkFactory(partition);
				if (result == null) result = caseActionElement(partition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION: {
				BootstrapContainerApplication bootstrapContainerApplication = (BootstrapContainerApplication)theEObject;
				T1 result = caseBootstrapContainerApplication(bootstrapContainerApplication);
				if (result == null) result = caseBootstrapElement(bootstrapContainerApplication);
				if (result == null) result = caseConsumer(bootstrapContainerApplication);
				if (result == null) result = caseHtmlElement(bootstrapContainerApplication);
				if (result == null) result = caseModelElement(bootstrapContainerApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION: {
				BootstrapContainerApplicationSection bootstrapContainerApplicationSection = (BootstrapContainerApplicationSection)theEObject;
				T1 result = caseBootstrapContainerApplicationSection(bootstrapContainerApplicationSection);
				if (result == null) result = caseBootstrapElement(bootstrapContainerApplicationSection);
				if (result == null) result = caseHtml_Container(bootstrapContainerApplicationSection);
				if (result == null) result = caseHtmlElement(bootstrapContainerApplicationSection);
				if (result == null) result = caseModelElement(bootstrapContainerApplicationSection);
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
	public T1 caseLabel(Label object) {
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
	public <E> T1 caseCategory(Category<E> object) {
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
	public T1 caseAction(Action object) {
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
	public T1 casePartition(Partition object) {
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
	public T1 caseBootstrapContainerApplication(BootstrapContainerApplication object) {
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
	public T1 caseBootstrapContainerApplicationSection(BootstrapContainerApplicationSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Work Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseWorkFactory(WorkFactory<T> object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseConsumer(Consumer<T> object) {
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
	public T1 caseActionMapping(ActionMapping object) {
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
	public T1 caseActionLink(ActionLink object) {
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
	public T1 caseActionReference(ActionReference object) {
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
	public T1 caseActionElement(ActionElement object) {
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
	public T1 caseAbstractAction(AbstractAction object) {
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
	public T1 caseActionCategory(ActionCategory object) {
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
	public T1 caseActionBase(ActionBase object) {
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
	public <E> T1 caseContainer(Container<E> object) {
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

} //AppSwitch
