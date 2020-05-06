/**
 */
package org.nasdanika.vinci.components.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.components.ActionLink;
import org.nasdanika.vinci.components.ComponentsFactory;
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
import org.nasdanika.vinci.html.HtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentsPackageImpl extends EPackageImpl implements ComponentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markdownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markdownTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markdownResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableOfContentsBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableOfContentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfContentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableOfActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textToSpeechEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textToSpeechTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textToSpeechResourceEClass = null;

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
	 * @see org.nasdanika.vinci.components.ComponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentsPackageImpl() {
		super(eNS_URI, ComponentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentsPackage init() {
		if (isInited) return (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredComponentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ComponentsPackageImpl theComponentsPackage = registeredComponentsPackage instanceof ComponentsPackageImpl ? (ComponentsPackageImpl)registeredComponentsPackage : new ComponentsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AppPackage.eINSTANCE.eClass();
		BootstrapPackage.eINSTANCE.eClass();
		HtmlPackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentsPackage.createPackageContents();

		// Initialize created meta-data
		theComponentsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentsPackage.eNS_URI, theComponentsPackage);
		return theComponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkdown() {
		return markdownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarkdown_Style() {
		return (EAttribute)markdownEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarkdown_Interpolate() {
		return (EAttribute)markdownEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarkdown_Appearance() {
		return (EReference)markdownEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkdownText() {
		return markdownTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarkdownText_Markdown() {
		return (EAttribute)markdownTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkdownResource() {
		return markdownResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarkdownResource_Location() {
		return (EAttribute)markdownResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionLink() {
		return actionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionLink_Text() {
		return (EAttribute)actionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionLink_Target() {
		return (EReference)actionLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionLink_Appearance() {
		return (EReference)actionLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableOfContentsBase() {
		return tableOfContentsBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOfContentsBase_Header() {
		return (EAttribute)tableOfContentsBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOfContentsBase_Role() {
		return (EAttribute)tableOfContentsBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOfContentsBase_Depth() {
		return (EAttribute)tableOfContentsBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableOfContents() {
		return tableOfContentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOfContents_Descriptions() {
		return (EAttribute)tableOfContentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableOfContents_Tooltips() {
		return (EAttribute)tableOfContentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListOfContents() {
		return listOfContentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListOfContents_Ordering() {
		return (EAttribute)listOfContentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListOfContents_Tooltips() {
		return (EAttribute)listOfContentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListOfActions() {
		return listOfActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListOfActions_Actions() {
		return (EReference)listOfActionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableOfActions() {
		return tableOfActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableOfActions_Actions() {
		return (EReference)tableOfActionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextToSpeech() {
		return textToSpeechEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextToSpeech_Language() {
		return (EAttribute)textToSpeechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextToSpeech_Voice() {
		return (EAttribute)textToSpeechEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextToSpeech_Format() {
		return (EAttribute)textToSpeechEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextToSpeech_Interpolate() {
		return (EAttribute)textToSpeechEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextToSpeech_Appearance() {
		return (EReference)textToSpeechEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextToSpeech_Path() {
		return (EAttribute)textToSpeechEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextToSpeech_Embed() {
		return (EAttribute)textToSpeechEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Content() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Caption() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImage_Appearance() {
		return (EReference)imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImage_Target() {
		return (EReference)imageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Height() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImage_Width() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImage__CaptureScreen() {
		return imageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextToSpeechText() {
		return textToSpeechTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextToSpeechText_Text() {
		return (EAttribute)textToSpeechTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextToSpeechResource() {
		return textToSpeechResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextToSpeechResource_Location() {
		return (EAttribute)textToSpeechResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentsFactory getComponentsFactory() {
		return (ComponentsFactory)getEFactoryInstance();
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
		markdownEClass = createEClass(MARKDOWN);
		createEAttribute(markdownEClass, MARKDOWN__STYLE);
		createEAttribute(markdownEClass, MARKDOWN__INTERPOLATE);
		createEReference(markdownEClass, MARKDOWN__APPEARANCE);

		markdownTextEClass = createEClass(MARKDOWN_TEXT);
		createEAttribute(markdownTextEClass, MARKDOWN_TEXT__MARKDOWN);

		markdownResourceEClass = createEClass(MARKDOWN_RESOURCE);
		createEAttribute(markdownResourceEClass, MARKDOWN_RESOURCE__LOCATION);

		actionLinkEClass = createEClass(ACTION_LINK);
		createEAttribute(actionLinkEClass, ACTION_LINK__TEXT);
		createEReference(actionLinkEClass, ACTION_LINK__TARGET);
		createEReference(actionLinkEClass, ACTION_LINK__APPEARANCE);

		tableOfContentsBaseEClass = createEClass(TABLE_OF_CONTENTS_BASE);
		createEAttribute(tableOfContentsBaseEClass, TABLE_OF_CONTENTS_BASE__HEADER);
		createEAttribute(tableOfContentsBaseEClass, TABLE_OF_CONTENTS_BASE__ROLE);
		createEAttribute(tableOfContentsBaseEClass, TABLE_OF_CONTENTS_BASE__DEPTH);

		tableOfContentsEClass = createEClass(TABLE_OF_CONTENTS);
		createEAttribute(tableOfContentsEClass, TABLE_OF_CONTENTS__DESCRIPTIONS);
		createEAttribute(tableOfContentsEClass, TABLE_OF_CONTENTS__TOOLTIPS);

		listOfContentsEClass = createEClass(LIST_OF_CONTENTS);
		createEAttribute(listOfContentsEClass, LIST_OF_CONTENTS__ORDERING);
		createEAttribute(listOfContentsEClass, LIST_OF_CONTENTS__TOOLTIPS);

		listOfActionsEClass = createEClass(LIST_OF_ACTIONS);
		createEReference(listOfActionsEClass, LIST_OF_ACTIONS__ACTIONS);

		tableOfActionsEClass = createEClass(TABLE_OF_ACTIONS);
		createEReference(tableOfActionsEClass, TABLE_OF_ACTIONS__ACTIONS);

		textToSpeechEClass = createEClass(TEXT_TO_SPEECH);
		createEAttribute(textToSpeechEClass, TEXT_TO_SPEECH__LANGUAGE);
		createEAttribute(textToSpeechEClass, TEXT_TO_SPEECH__VOICE);
		createEAttribute(textToSpeechEClass, TEXT_TO_SPEECH__FORMAT);
		createEAttribute(textToSpeechEClass, TEXT_TO_SPEECH__INTERPOLATE);
		createEReference(textToSpeechEClass, TEXT_TO_SPEECH__APPEARANCE);
		createEAttribute(textToSpeechEClass, TEXT_TO_SPEECH__PATH);
		createEAttribute(textToSpeechEClass, TEXT_TO_SPEECH__EMBED);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__CONTENT);
		createEAttribute(imageEClass, IMAGE__CAPTION);
		createEReference(imageEClass, IMAGE__APPEARANCE);
		createEReference(imageEClass, IMAGE__TARGET);
		createEAttribute(imageEClass, IMAGE__HEIGHT);
		createEAttribute(imageEClass, IMAGE__WIDTH);
		createEOperation(imageEClass, IMAGE___CAPTURE_SCREEN);

		textToSpeechTextEClass = createEClass(TEXT_TO_SPEECH_TEXT);
		createEAttribute(textToSpeechTextEClass, TEXT_TO_SPEECH_TEXT__TEXT);

		textToSpeechResourceEClass = createEClass(TEXT_TO_SPEECH_RESOURCE);
		createEAttribute(textToSpeechResourceEClass, TEXT_TO_SPEECH_RESOURCE__LOCATION);
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
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);
		HtmlPackage theHtmlPackage = (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);
		BootstrapPackage theBootstrapPackage = (BootstrapPackage)EPackage.Registry.INSTANCE.getEPackage(BootstrapPackage.eNS_URI);
		AppPackage theAppPackage = (AppPackage)EPackage.Registry.INSTANCE.getEPackage(AppPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theNcorePackage.getModelElement());
		markdownEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		EGenericType g2 = createEGenericType(theHtmlPackage.getViewPart());
		g1.getETypeArguments().add(g2);
		markdownEClass.getEGenericSuperTypes().add(g1);
		markdownTextEClass.getESuperTypes().add(this.getMarkdown());
		markdownResourceEClass.getESuperTypes().add(this.getMarkdown());
		g1 = createEGenericType(theNcorePackage.getModelElement());
		actionLinkEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(theHtmlPackage.getViewPart());
		g1.getETypeArguments().add(g2);
		actionLinkEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBootstrapPackage.getBootstrapElement());
		tableOfContentsBaseEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(theHtmlPackage.getViewPart());
		g1.getETypeArguments().add(g2);
		tableOfContentsBaseEClass.getEGenericSuperTypes().add(g1);
		tableOfContentsEClass.getESuperTypes().add(this.getTableOfContentsBase());
		tableOfContentsEClass.getESuperTypes().add(theBootstrapPackage.getTableConfiguration());
		listOfContentsEClass.getESuperTypes().add(this.getTableOfContentsBase());
		listOfActionsEClass.getESuperTypes().add(this.getListOfContents());
		tableOfActionsEClass.getESuperTypes().add(this.getTableOfContents());
		g1 = createEGenericType(theNcorePackage.getModelElement());
		textToSpeechEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(theHtmlPackage.getViewPart());
		g1.getETypeArguments().add(g2);
		textToSpeechEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getModelElement());
		imageEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(theHtmlPackage.getViewPart());
		g1.getETypeArguments().add(g2);
		imageEClass.getEGenericSuperTypes().add(g1);
		textToSpeechTextEClass.getESuperTypes().add(this.getTextToSpeech());
		textToSpeechResourceEClass.getESuperTypes().add(this.getTextToSpeech());

		// Initialize classes, features, and operations; add parameters
		initEClass(markdownEClass, Markdown.class, "Markdown", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkdown_Style(), ecorePackage.getEBoolean(), "style", null, 0, 1, Markdown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarkdown_Interpolate(), ecorePackage.getEBoolean(), "interpolate", null, 0, 1, Markdown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarkdown_Appearance(), theBootstrapPackage.getAppearance(), null, "appearance", null, 0, 1, Markdown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markdownTextEClass, MarkdownText.class, "MarkdownText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkdownText_Markdown(), ecorePackage.getEString(), "markdown", null, 1, 1, MarkdownText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markdownResourceEClass, MarkdownResource.class, "MarkdownResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkdownResource_Location(), ecorePackage.getEString(), "location", null, 1, 1, MarkdownResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionLinkEClass, ActionLink.class, "ActionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionLink_Text(), ecorePackage.getEString(), "text", null, 0, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionLink_Target(), theAppPackage.getAbstractAction(), null, "target", null, 1, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionLink_Appearance(), theBootstrapPackage.getAppearance(), null, "appearance", null, 0, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableOfContentsBaseEClass, TableOfContentsBase.class, "TableOfContentsBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableOfContentsBase_Header(), ecorePackage.getEString(), "header", "", 0, 1, TableOfContentsBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOfContentsBase_Role(), ecorePackage.getEString(), "role", "", 0, 1, TableOfContentsBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOfContentsBase_Depth(), ecorePackage.getEInt(), "depth", "3", 0, 1, TableOfContentsBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableOfContentsEClass, TableOfContents.class, "TableOfContents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableOfContents_Descriptions(), ecorePackage.getEBoolean(), "descriptions", "false", 0, 1, TableOfContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableOfContents_Tooltips(), ecorePackage.getEBoolean(), "tooltips", "false", 0, 1, TableOfContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listOfContentsEClass, ListOfContents.class, "ListOfContents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListOfContents_Ordering(), ecorePackage.getEString(), "ordering", "", 0, 1, ListOfContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListOfContents_Tooltips(), ecorePackage.getEBoolean(), "tooltips", "false", 0, 1, ListOfContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listOfActionsEClass, ListOfActions.class, "ListOfActions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListOfActions_Actions(), theAppPackage.getAbstractAction(), null, "actions", null, 0, -1, ListOfActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableOfActionsEClass, TableOfActions.class, "TableOfActions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableOfActions_Actions(), theAppPackage.getAbstractAction(), null, "actions", null, 0, -1, TableOfActions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textToSpeechEClass, TextToSpeech.class, "TextToSpeech", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextToSpeech_Language(), ecorePackage.getEString(), "language", null, 0, 1, TextToSpeech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextToSpeech_Voice(), ecorePackage.getEString(), "voice", null, 0, 1, TextToSpeech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextToSpeech_Format(), ecorePackage.getEString(), "format", "Text", 0, 1, TextToSpeech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextToSpeech_Interpolate(), ecorePackage.getEBoolean(), "interpolate", null, 0, 1, TextToSpeech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextToSpeech_Appearance(), theBootstrapPackage.getAppearance(), null, "appearance", null, 0, 1, TextToSpeech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextToSpeech_Path(), ecorePackage.getEString(), "path", null, 0, 1, TextToSpeech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextToSpeech_Embed(), ecorePackage.getEBoolean(), "embed", null, 0, 1, TextToSpeech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Content(), ecorePackage.getEByteArray(), "content", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Caption(), ecorePackage.getEString(), "caption", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImage_Appearance(), theBootstrapPackage.getAppearance(), null, "appearance", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImage_Target(), theAppPackage.getAbstractAction(), null, "target", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Height(), ecorePackage.getEString(), "height", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Width(), ecorePackage.getEString(), "width", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getImage__CaptureScreen(), null, "captureScreen", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(textToSpeechTextEClass, TextToSpeechText.class, "TextToSpeechText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextToSpeechText_Text(), ecorePackage.getEString(), "text", null, 1, 1, TextToSpeechText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textToSpeechResourceEClass, TextToSpeechResource.class, "TextToSpeechResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextToSpeechResource_Location(), ecorePackage.getEString(), "location", null, 1, 1, TextToSpeechResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// urn:org.nasdanika
		createUrnorgAnnotations();
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
			   "documentation", "Miscellaneous components."
		   });
		addAnnotation
		  (markdownEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for generation of HTML from [Markdown](https://en.wikipedia.org/wiki/Markdown)."
		   });
		addAnnotation
		  (getMarkdown_Style(),
		   source,
		   new String[] {
			   "documentation", "If this attribute is set to true the generated markdown is placed in a ``div`` with ``markdown-body`` class in order to be styled by the GitHub Markdown CSS. For this the page shall have \"Github Markdown CSS\" attribute set to true or add a stylesheet explicitly."
		   });
		addAnnotation
		  (getMarkdown_Interpolate(),
		   source,
		   new String[] {
			   "documentation", "If true, HTML generated from the markdown is interpolated."
		   });
		addAnnotation
		  (getMarkdown_Appearance(),
		   source,
		   new String[] {
			   "documentation", "Appearance to apply to the generated HTML."
		   });
		addAnnotation
		  (markdownTextEClass,
		   source,
		   new String[] {
			   "documentation", "Generates HTML from [Markdown](https://en.wikipedia.org/wiki/Markdown) text."
		   });
		addAnnotation
		  (getMarkdownText_Markdown(),
		   source,
		   new String[] {
			   "documentation", "Markdown text."
		   });
		addAnnotation
		  (markdownResourceEClass,
		   source,
		   new String[] {
			   "documentation", "Generates HTML from [Markdown](https://en.wikipedia.org/wiki/Markdown) resource."
		   });
		addAnnotation
		  (getMarkdownResource_Location(),
		   source,
		   new String[] {
			   "documentation", "Markdown resource location. The resource location is resolved relative to the model resource."
		   });
		addAnnotation
		  (actionLinkEClass,
		   source,
		   new String[] {
			   "documentation", "Generates a link to the target action."
		   });
		addAnnotation
		  (getActionLink_Text(),
		   source,
		   new String[] {
			   "documentation", "Link text. If blank, the action text is used."
		   });
		addAnnotation
		  (getActionLink_Target(),
		   source,
		   new String[] {
			   "documentation", "Action to link to."
		   });
		addAnnotation
		  (getActionLink_Appearance(),
		   source,
		   new String[] {
			   "documentation", "Appearance to apply to the generated HTML."
		   });
		addAnnotation
		  (tableOfContentsBaseEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for tables of content."
		   });
		addAnnotation
		  (getTableOfContentsBase_Header(),
		   source,
		   new String[] {
			   "documentation", "Table of contents header"
		   });
		addAnnotation
		  (getTableOfContentsBase_Role(),
		   source,
		   new String[] {
			   "documentation", "Table of contents includes action children in the specified role - navigation or section."
		   });
		addAnnotation
		  (getTableOfContentsBase_Depth(),
		   source,
		   new String[] {
			   "documentation", "Table of contents depth."
		   });
		addAnnotation
		  (tableOfContentsEClass,
		   source,
		   new String[] {
			   "documentation", "Containing action content rendered in a table."
		   });
		addAnnotation
		  (getTableOfContents_Descriptions(),
		   source,
		   new String[] {
			   "documentation", "If selected, action descriptions are shown in the table of contents."
		   });
		addAnnotation
		  (getTableOfContents_Tooltips(),
		   source,
		   new String[] {
			   "documentation", "If selected and \"descriptions\" is not selected, action tooltips are shown in the table of contents."
		   });
		addAnnotation
		  (listOfContentsEClass,
		   source,
		   new String[] {
			   "documentation", "Containing action content rendered in a list."
		   });
		addAnnotation
		  (getListOfContents_Ordering(),
		   source,
		   new String[] {
			   "documentation", "Ordering style. \n\"Auto\" means starting with numbers and going over all available styles with each additional level."
		   });
		addAnnotation
		  (getListOfContents_Tooltips(),
		   source,
		   new String[] {
			   "documentation", "If selected, action tooltips are shown in the list."
		   });
		addAnnotation
		  (listOfActionsEClass,
		   source,
		   new String[] {
			   "documentation", "Renders referenced actions as a list."
		   });
		addAnnotation
		  (getListOfActions_Actions(),
		   source,
		   new String[] {
			   "documentation", "Root actions to include in the list."
		   });
		addAnnotation
		  (tableOfActionsEClass,
		   source,
		   new String[] {
			   "documentation", "Containing action content rendered in a table."
		   });
		addAnnotation
		  (getTableOfActions_Actions(),
		   source,
		   new String[] {
			   "documentation", "Root actions to include in the list."
		   });
		addAnnotation
		  (textToSpeechEClass,
		   source,
		   new String[] {
			   "documentation", "Uses [Google Text-to-Speech](https://cloud.google.com/text-to-speech) to synthesize \nvoice from text or [SSML](https://cloud.google.com/text-to-speech/docs/ssml). \nVoice is output to an mp3 file. File name is defined by the ``path`` attribute if it is not blank. \nIn this case path is resolved relative to the containing action. \nIf ``path`` attribute is blank then the file name is computed as a digest of the sound bytes.\n\nGenerates audio tag which plays the synthesized speech.\n\nUse of text to speech requires ``GOOGLE_APPLICATION_CREDENTIALS`` environment variable to be set to the location of the private key JSON file.\nSee https://developers.google.com/accounts/docs/application-default-credentials for more information.\n   "
		   });
		addAnnotation
		  (getTextToSpeech_Language(),
		   source,
		   new String[] {
			   "documentation", "Language and locale code, e.g. ``en-US``. If blank, then the contextual language and locale are used - hardcoded in the UI and configurable in the CLI. \nSee [Supported voices and languages](https://cloud.google.com/text-to-speech/docs/voices) for a list of locales and voices."
		   });
		addAnnotation
		  (getTextToSpeech_Voice(),
		   source,
		   new String[] {
			   "documentation", "Voice name, e.g. ``en-US-Wavenet-D``. If blank, then the contextual voice is used - hardcoded in the UI and configurable in the CLI. \nSee [Supported voices and languages](https://cloud.google.com/text-to-speech/docs/voices) for a list of locales and voices."
		   });
		addAnnotation
		  (getTextToSpeech_Format(),
		   source,
		   new String[] {
			   "documentation", "Text format - ``Text`` or ``SSML``."
		   });
		addAnnotation
		  (getTextToSpeech_Interpolate(),
		   source,
		   new String[] {
			   "documentation", "If true, text/ssml is interpolated before speech generation."
		   });
		addAnnotation
		  (getTextToSpeech_Appearance(),
		   source,
		   new String[] {
			   "documentation", "Appearance to apply to the generated audio tag."
		   });
		addAnnotation
		  (getTextToSpeech_Path(),
		   source,
		   new String[] {
			   "documentation", "MP3 resource location (file name) relative to the containing action context URI.\nIf this attribute is blank then the file name is computed as a digest of the sound bytes."
		   });
		addAnnotation
		  (getTextToSpeech_Embed(),
		   source,
		   new String[] {
			   "documentation", "If true, audio data is not stored to a file, but is embedded into the page using ``data:`` URI."
		   });
		addAnnotation
		  (imageEClass,
		   source,
		   new String[] {
			   "documentation", "Embedded image which can be loaded from a file or taken as a screenshot."
		   });
		addAnnotation
		  (getImage__CaptureScreen(),
		   source,
		   new String[] {
			   "documentation", "Opens a window for taking a screenshot."
		   });
		addAnnotation
		  (getImage_Content(),
		   source,
		   new String[] {
			   "documentation", "Image bytes."
		   });
		addAnnotation
		  (getImage_Caption(),
		   source,
		   new String[] {
			   "documentation", "If not blank, image caption is shown below the image."
		   });
		addAnnotation
		  (getImage_Appearance(),
		   source,
		   new String[] {
			   "documentation", "Appearance to apply to the image. E.g. border or float."
		   });
		addAnnotation
		  (getImage_Target(),
		   source,
		   new String[] {
			   "documentation", "If target is set, then click on the image activates the target action. For example, a click on a screensot may open a dialog with a screen recording positioned at the time the screenshot was taken."
		   });
		addAnnotation
		  (getImage_Height(),
		   source,
		   new String[] {
			   "documentation", "Image height"
		   });
		addAnnotation
		  (getImage_Width(),
		   source,
		   new String[] {
			   "documentation", "Image width"
		   });
		addAnnotation
		  (textToSpeechTextEClass,
		   source,
		   new String[] {
			   "documentation", "Speaks ``text`` attribute."
		   });
		addAnnotation
		  (getTextToSpeechText_Text(),
		   source,
		   new String[] {
			   "documentation", "Text to speak, in case of  [SSML](https://cloud.google.com/text-to-speech/docs/ssml) format ``<speak>`` and  ``</speak>`` opening and closing tags are implied."
		   });
		addAnnotation
		  (textToSpeechResourceEClass,
		   source,
		   new String[] {
			   "documentation", "Speaks resource specified in the ``location`` attribute."
		   });
		addAnnotation
		  (getTextToSpeechResource_Location(),
		   source,
		   new String[] {
			   "documentation", "Markdown resource location. The resource location is resolved relative to the model resource."
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation
		  (getMarkdownText_Markdown(),
		   source,
		   new String[] {
			   "content-type", "text/markdown"
		   });
		addAnnotation
		  (getImage_Content(),
		   source,
		   new String[] {
			   "content-type", "image/png"
		   });
	}

} //ComponentsPackageImpl
