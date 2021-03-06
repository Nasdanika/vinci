/**
 */
package org.nasdanika.vinci.components.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.vinci.bootstrap.BootstrapElement;
import org.nasdanika.vinci.bootstrap.TableConfiguration;
import org.nasdanika.vinci.components.ActionLink;
import org.nasdanika.vinci.components.ComponentsPackage;
import org.nasdanika.vinci.components.Image;
import org.nasdanika.vinci.components.ListOfActions;
import org.nasdanika.vinci.components.ListOfContents;
import org.nasdanika.vinci.components.Markdown;
import org.nasdanika.vinci.components.MarkdownResource;
import org.nasdanika.vinci.components.MarkdownText;
import org.nasdanika.vinci.components.TableOfActions;
import org.nasdanika.vinci.components.TableOfContents;
import org.nasdanika.vinci.components.TableOfContentsBase;
import org.nasdanika.vinci.components.TextToSpeech;
import org.nasdanika.vinci.components.TextToSpeechResource;
import org.nasdanika.vinci.components.TextToSpeechText;
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
 * @see org.nasdanika.vinci.components.ComponentsPackage
 * @generated
 */
public class ComponentsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsSwitch() {
		if (modelPackage == null) {
			modelPackage = ComponentsPackage.eINSTANCE;
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
			case ComponentsPackage.MARKDOWN: {
				Markdown markdown = (Markdown)theEObject;
				T result = caseMarkdown(markdown);
				if (result == null) result = caseModelElement(markdown);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.MARKDOWN_TEXT: {
				MarkdownText markdownText = (MarkdownText)theEObject;
				T result = caseMarkdownText(markdownText);
				if (result == null) result = caseMarkdown(markdownText);
				if (result == null) result = caseModelElement(markdownText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.MARKDOWN_RESOURCE: {
				MarkdownResource markdownResource = (MarkdownResource)theEObject;
				T result = caseMarkdownResource(markdownResource);
				if (result == null) result = caseMarkdown(markdownResource);
				if (result == null) result = caseModelElement(markdownResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.ACTION_LINK: {
				ActionLink actionLink = (ActionLink)theEObject;
				T result = caseActionLink(actionLink);
				if (result == null) result = caseModelElement(actionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.TABLE_OF_CONTENTS_BASE: {
				TableOfContentsBase tableOfContentsBase = (TableOfContentsBase)theEObject;
				T result = caseTableOfContentsBase(tableOfContentsBase);
				if (result == null) result = caseBootstrapElement(tableOfContentsBase);
				if (result == null) result = caseHtmlElement(tableOfContentsBase);
				if (result == null) result = caseModelElement(tableOfContentsBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.TABLE_OF_CONTENTS: {
				TableOfContents tableOfContents = (TableOfContents)theEObject;
				T result = caseTableOfContents(tableOfContents);
				if (result == null) result = caseTableOfContentsBase(tableOfContents);
				if (result == null) result = caseTableConfiguration(tableOfContents);
				if (result == null) result = caseBootstrapElement(tableOfContents);
				if (result == null) result = caseHtmlElement(tableOfContents);
				if (result == null) result = caseModelElement(tableOfContents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.LIST_OF_CONTENTS: {
				ListOfContents listOfContents = (ListOfContents)theEObject;
				T result = caseListOfContents(listOfContents);
				if (result == null) result = caseTableOfContentsBase(listOfContents);
				if (result == null) result = caseBootstrapElement(listOfContents);
				if (result == null) result = caseHtmlElement(listOfContents);
				if (result == null) result = caseModelElement(listOfContents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.LIST_OF_ACTIONS: {
				ListOfActions listOfActions = (ListOfActions)theEObject;
				T result = caseListOfActions(listOfActions);
				if (result == null) result = caseListOfContents(listOfActions);
				if (result == null) result = caseTableOfContentsBase(listOfActions);
				if (result == null) result = caseBootstrapElement(listOfActions);
				if (result == null) result = caseHtmlElement(listOfActions);
				if (result == null) result = caseModelElement(listOfActions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.TABLE_OF_ACTIONS: {
				TableOfActions tableOfActions = (TableOfActions)theEObject;
				T result = caseTableOfActions(tableOfActions);
				if (result == null) result = caseTableOfContents(tableOfActions);
				if (result == null) result = caseTableOfContentsBase(tableOfActions);
				if (result == null) result = caseTableConfiguration(tableOfActions);
				if (result == null) result = caseBootstrapElement(tableOfActions);
				if (result == null) result = caseHtmlElement(tableOfActions);
				if (result == null) result = caseModelElement(tableOfActions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.TEXT_TO_SPEECH: {
				TextToSpeech textToSpeech = (TextToSpeech)theEObject;
				T result = caseTextToSpeech(textToSpeech);
				if (result == null) result = caseModelElement(textToSpeech);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseModelElement(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.TEXT_TO_SPEECH_TEXT: {
				TextToSpeechText textToSpeechText = (TextToSpeechText)theEObject;
				T result = caseTextToSpeechText(textToSpeechText);
				if (result == null) result = caseTextToSpeech(textToSpeechText);
				if (result == null) result = caseModelElement(textToSpeechText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.TEXT_TO_SPEECH_RESOURCE: {
				TextToSpeechResource textToSpeechResource = (TextToSpeechResource)theEObject;
				T result = caseTextToSpeechResource(textToSpeechResource);
				if (result == null) result = caseTextToSpeech(textToSpeechResource);
				if (result == null) result = caseModelElement(textToSpeechResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markdown</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markdown</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkdown(Markdown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markdown Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markdown Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkdownText(MarkdownText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markdown Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markdown Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkdownResource(MarkdownResource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Table Of Contents Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Of Contents Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableOfContentsBase(TableOfContentsBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Of Contents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Of Contents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableOfContents(TableOfContents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Contents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Contents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfContents(ListOfContents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Of Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Of Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOfActions(ListOfActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Of Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Of Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableOfActions(TableOfActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text To Speech</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text To Speech</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextToSpeech(TextToSpeech object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text To Speech Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text To Speech Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextToSpeechText(TextToSpeechText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text To Speech Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text To Speech Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextToSpeechResource(TextToSpeechResource object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Table Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableConfiguration(TableConfiguration object) {
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

} //ComponentsSwitch
