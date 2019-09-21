/**
 */
package org.nasdanika.vinci.app.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.codegen.Generator;
import org.nasdanika.common.WorkFactory;
import org.nasdanika.vinci.app.*;

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
			case AppPackage.LABEL_SPEC: {
				LabelSpec labelSpec = (LabelSpec)theEObject;
				T1 result = caseLabelSpec(labelSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION_SPEC: {
				ActionSpec actionSpec = (ActionSpec)theEObject;
				T1 result = caseActionSpec(actionSpec);
				if (result == null) result = caseLabelSpec(actionSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.CONTAINER: {
				Container<?> container = (Container<?>)theEObject;
				T1 result = caseContainer(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.LABEL: {
				Label<?> label = (Label<?>)theEObject;
				T1 result = caseLabel(label);
				if (result == null) result = caseGenerator(label);
				if (result == null) result = caseWorkFactory(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.CATEGORY: {
				Category<?> category = (Category<?>)theEObject;
				T1 result = caseCategory(category);
				if (result == null) result = caseLabel(category);
				if (result == null) result = caseContainer(category);
				if (result == null) result = caseGenerator(category);
				if (result == null) result = caseWorkFactory(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.MAP_ELEMENT: {
				MapElement<?> mapElement = (MapElement<?>)theEObject;
				T1 result = caseMapElement(mapElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ABSTRACT_ACTION_PARENT: {
				AbstractActionParent abstractActionParent = (AbstractActionParent)theEObject;
				T1 result = caseAbstractActionParent(abstractActionParent);
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
				if (result == null) result = caseMapElement(abstractAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION_CATEGORY: {
				ActionCategory actionCategory = (ActionCategory)theEObject;
				T1 result = caseActionCategory(actionCategory);
				if (result == null) result = caseCategory(actionCategory);
				if (result == null) result = caseMapElement(actionCategory);
				if (result == null) result = caseActionElement(actionCategory);
				if (result == null) result = caseAbstractActionParent(actionCategory);
				if (result == null) result = caseLabel(actionCategory);
				if (result == null) result = caseContainer(actionCategory);
				if (result == null) result = caseGenerator(actionCategory);
				if (result == null) result = caseWorkFactory(actionCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION: {
				Action action = (Action)theEObject;
				T1 result = caseAction(action);
				if (result == null) result = caseLabel(action);
				if (result == null) result = caseAbstractAction(action);
				if (result == null) result = caseAbstractActionParent(action);
				if (result == null) result = caseContainer(action);
				if (result == null) result = caseGenerator(action);
				if (result == null) result = caseActionElement(action);
				if (result == null) result = caseMapElement(action);
				if (result == null) result = caseWorkFactory(action);
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
				if (result == null) result = caseMapElement(actionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.ACTION_REFERENCE: {
				ActionReference actionReference = (ActionReference)theEObject;
				T1 result = caseActionReference(actionReference);
				if (result == null) result = caseAbstractAction(actionReference);
				if (result == null) result = caseActionElement(actionReference);
				if (result == null) result = caseMapElement(actionReference);
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
	public <T extends LabelSpec> T1 caseLabel(Label<T> object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Map Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <P> T1 caseMapElement(MapElement<P> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Action Parent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Action Parent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractActionParent(AbstractActionParent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Label Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLabelSpec(LabelSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseActionSpec(ActionSpec object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseGenerator(Generator<T> object) {
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
