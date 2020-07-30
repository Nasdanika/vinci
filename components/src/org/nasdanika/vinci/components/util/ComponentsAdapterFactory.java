/**
 */
package org.nasdanika.vinci.components.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.vinci.components.ComponentsPackage
 * @generated
 */
public class ComponentsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentsSwitch<Adapter> modelSwitch =
		new ComponentsSwitch<Adapter>() {
			@Override
			public Adapter caseMarkdown(Markdown object) {
				return createMarkdownAdapter();
			}
			@Override
			public Adapter caseMarkdownText(MarkdownText object) {
				return createMarkdownTextAdapter();
			}
			@Override
			public Adapter caseMarkdownResource(MarkdownResource object) {
				return createMarkdownResourceAdapter();
			}
			@Override
			public Adapter caseActionLink(ActionLink object) {
				return createActionLinkAdapter();
			}
			@Override
			public Adapter caseTableOfContentsBase(TableOfContentsBase object) {
				return createTableOfContentsBaseAdapter();
			}
			@Override
			public Adapter caseTableOfContents(TableOfContents object) {
				return createTableOfContentsAdapter();
			}
			@Override
			public Adapter caseListOfContents(ListOfContents object) {
				return createListOfContentsAdapter();
			}
			@Override
			public Adapter caseListOfActions(ListOfActions object) {
				return createListOfActionsAdapter();
			}
			@Override
			public Adapter caseTableOfActions(TableOfActions object) {
				return createTableOfActionsAdapter();
			}
			@Override
			public Adapter caseTextToSpeech(TextToSpeech object) {
				return createTextToSpeechAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseTextToSpeechText(TextToSpeechText object) {
				return createTextToSpeechTextAdapter();
			}
			@Override
			public Adapter caseTextToSpeechResource(TextToSpeechResource object) {
				return createTextToSpeechResourceAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseHtmlElement(HtmlElement object) {
				return createHtmlElementAdapter();
			}
			@Override
			public Adapter caseBootstrapElement(BootstrapElement object) {
				return createBootstrapElementAdapter();
			}
			@Override
			public Adapter caseTableConfiguration(TableConfiguration object) {
				return createTableConfigurationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.components.Markdown <em>Markdown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.components.Markdown
	 * @generated
	 */
	public Adapter createMarkdownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.components.MarkdownText <em>Markdown Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.components.MarkdownText
	 * @generated
	 */
	public Adapter createMarkdownTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.components.MarkdownResource <em>Markdown Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.components.MarkdownResource
	 * @generated
	 */
	public Adapter createMarkdownResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.components.ActionLink <em>Action Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.components.ActionLink
	 * @generated
	 */
	public Adapter createActionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.components.TableOfContentsBase <em>Table Of Contents Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.components.TableOfContentsBase
	 * @generated
	 */
	public Adapter createTableOfContentsBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.components.TableOfContents <em>Table Of Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.components.TableOfContents
	 * @generated
	 */
	public Adapter createTableOfContentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.components.ListOfContents <em>List Of Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.components.ListOfContents
	 * @generated
	 */
	public Adapter createListOfContentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.components.ListOfActions <em>List Of Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.components.ListOfActions
	 * @generated
	 */
	public Adapter createListOfActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.components.TableOfActions <em>Table Of Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.components.TableOfActions
	 * @generated
	 */
	public Adapter createTableOfActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.components.TextToSpeech <em>Text To Speech</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.components.TextToSpeech
	 * @generated
	 */
	public Adapter createTextToSpeechAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.components.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.components.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.components.TextToSpeechText <em>Text To Speech Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.components.TextToSpeechText
	 * @generated
	 */
	public Adapter createTextToSpeechTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.components.TextToSpeechResource <em>Text To Speech Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.components.TextToSpeechResource
	 * @generated
	 */
	public Adapter createTextToSpeechResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ncore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ncore.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.html.HtmlElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.html.HtmlElement
	 * @generated
	 */
	public Adapter createHtmlElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.bootstrap.BootstrapElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.bootstrap.BootstrapElement
	 * @generated
	 */
	public Adapter createBootstrapElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.vinci.bootstrap.TableConfiguration <em>Table Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.vinci.bootstrap.TableConfiguration
	 * @generated
	 */
	public Adapter createTableConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ComponentsAdapterFactory
