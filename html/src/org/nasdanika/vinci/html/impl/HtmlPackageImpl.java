/**
 */
package org.nasdanika.vinci.html.impl;

import static org.nasdanika.vinci.html.HtmlPackage.CONTAINER;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.vinci.html.ContentTag;
import org.nasdanika.vinci.html.HtmlElement;
import org.nasdanika.vinci.html.HtmlFactory;
import org.nasdanika.vinci.html.HtmlPackage;
import org.nasdanika.vinci.html.Page;
import org.nasdanika.vinci.html.Script;
import org.nasdanika.vinci.html.ScriptReference;
import org.nasdanika.vinci.html.ScriptResource;
import org.nasdanika.vinci.html.Stylesheet;
import org.nasdanika.vinci.html.StylesheetReference;
import org.nasdanika.vinci.html.StylesheetResource;
import org.nasdanika.vinci.html.Tag;
import org.nasdanika.vinci.html.util.HtmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HtmlPackageImpl extends EPackageImpl implements HtmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewBuilderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlElementEClass = null;

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
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stylesheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stylesheetResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stylesheetReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tagNameEDataType = null;

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
	 * @see org.nasdanika.vinci.html.HtmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HtmlPackageImpl() {
		super(eNS_URI, HtmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HtmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HtmlPackage init() {
		if (isInited) return (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHtmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HtmlPackageImpl theHtmlPackage = registeredHtmlPackage instanceof HtmlPackageImpl ? (HtmlPackageImpl)registeredHtmlPackage : new HtmlPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHtmlPackage.createPackageContents();

		// Initialize created meta-data
		theHtmlPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theHtmlPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return HtmlValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theHtmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HtmlPackage.eNS_URI, theHtmlPackage);
		return theHtmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewPart() {
		return viewPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewBuilder() {
		return viewBuilderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHtmlElement() {
		return htmlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getHtmlElement__AsViewBuilderSupplier__Context() {
		return htmlElementEClass.getEOperations().get(0);
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
	public EReference getContainer_Content() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_MarkdownContent() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getTag_Name() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTag_Attributes() {
		return (EReference)tagEClass.getEStructuralFeatures().get(1);
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
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_Head() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_Body() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_Builders() {
		return (EReference)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_Language() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_FontAwesome() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_JsTree() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPage_GithubMarkdownCss() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStylesheet() {
		return stylesheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStylesheet_Code() {
		return (EAttribute)stylesheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStylesheetResource() {
		return stylesheetResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStylesheetResource_Location() {
		return (EAttribute)stylesheetResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStylesheetReference() {
		return stylesheetReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStylesheetReference_Href() {
		return (EAttribute)stylesheetReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScript_Code() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScriptResource() {
		return scriptResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScriptResource_Location() {
		return (EAttribute)scriptResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScriptReference() {
		return scriptReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScriptReference_Src() {
		return (EAttribute)scriptReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTagName() {
		return tagNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HtmlFactory getHtmlFactory() {
		return (HtmlFactory)getEFactoryInstance();
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
		viewPartEClass = createEClass(VIEW_PART);

		viewBuilderEClass = createEClass(VIEW_BUILDER);

		htmlElementEClass = createEClass(HTML_ELEMENT);
		createEOperation(htmlElementEClass, HTML_ELEMENT___AS_VIEW_BUILDER_SUPPLIER__CONTEXT);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CONTENT);
		createEAttribute(containerEClass, CONTAINER__MARKDOWN_CONTENT);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);
		createEReference(tagEClass, TAG__ATTRIBUTES);

		contentTagEClass = createEClass(CONTENT_TAG);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__HEAD);
		createEReference(pageEClass, PAGE__BODY);
		createEReference(pageEClass, PAGE__BUILDERS);
		createEAttribute(pageEClass, PAGE__LANGUAGE);
		createEAttribute(pageEClass, PAGE__FONT_AWESOME);
		createEAttribute(pageEClass, PAGE__JS_TREE);
		createEAttribute(pageEClass, PAGE__GITHUB_MARKDOWN_CSS);

		stylesheetEClass = createEClass(STYLESHEET);
		createEAttribute(stylesheetEClass, STYLESHEET__CODE);

		stylesheetResourceEClass = createEClass(STYLESHEET_RESOURCE);
		createEAttribute(stylesheetResourceEClass, STYLESHEET_RESOURCE__LOCATION);

		stylesheetReferenceEClass = createEClass(STYLESHEET_REFERENCE);
		createEAttribute(stylesheetReferenceEClass, STYLESHEET_REFERENCE__HREF);

		scriptEClass = createEClass(SCRIPT);
		createEAttribute(scriptEClass, SCRIPT__CODE);

		scriptResourceEClass = createEClass(SCRIPT_RESOURCE);
		createEAttribute(scriptResourceEClass, SCRIPT_RESOURCE__LOCATION);

		scriptReferenceEClass = createEClass(SCRIPT_REFERENCE);
		createEAttribute(scriptReferenceEClass, SCRIPT_REFERENCE__SRC);

		// Create data types
		tagNameEDataType = createEDataType(TAG_NAME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		htmlElementEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		EGenericType g1 = createEGenericType(this.getHtmlElement());
		tagEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		EGenericType g2 = createEGenericType(this.getViewPart());
		g1.getETypeArguments().add(g2);
		tagEClass.getEGenericSuperTypes().add(g1);
		contentTagEClass.getESuperTypes().add(this.getTag());
		contentTagEClass.getESuperTypes().add(this.getContainer());
		g1 = createEGenericType(theNcorePackage.getNamedElement());
		pageEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		pageEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getModelElement());
		stylesheetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		stylesheetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getModelElement());
		stylesheetResourceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		stylesheetResourceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getModelElement());
		stylesheetReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		stylesheetReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getModelElement());
		scriptEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		scriptEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getModelElement());
		scriptResourceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		scriptResourceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getModelElement());
		scriptReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		scriptReferenceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(viewPartEClass, ViewPart.class, "ViewPart", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewBuilderEClass, ViewBuilder.class, "ViewBuilder", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(htmlElementEClass, HtmlElement.class, "HtmlElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getHtmlElement__AsViewBuilderSupplier__Context(), null, "asViewBuilderSupplier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theNcorePackage.getIContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theNcorePackage.getException());
		g1 = createEGenericType(theNcorePackage.getISupplier());
		g2 = createEGenericType(this.getViewBuilder());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(containerEClass, org.nasdanika.vinci.html.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEReference(getContainer_Content(), g1, null, "content", null, 0, -1, org.nasdanika.vinci.html.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_MarkdownContent(), ecorePackage.getEString(), "markdownContent", null, 0, 1, org.nasdanika.vinci.html.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theNcorePackage.getEntry());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEReference(getTag_Attributes(), g1, null, "attributes", null, 0, -1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentTagEClass, ContentTag.class, "ContentTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEReference(getPage_Head(), g1, null, "head", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEReference(getPage_Body(), g1, null, "body", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(this.getViewBuilder());
		g1.getETypeArguments().add(g2);
		initEReference(getPage_Builders(), g1, null, "builders", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Language(), ecorePackage.getEString(), "language", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_FontAwesome(), ecorePackage.getEBoolean(), "fontAwesome", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_JsTree(), ecorePackage.getEBoolean(), "jsTree", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_GithubMarkdownCss(), ecorePackage.getEBoolean(), "githubMarkdownCss", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stylesheetEClass, Stylesheet.class, "Stylesheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStylesheet_Code(), ecorePackage.getEString(), "code", null, 1, 1, Stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stylesheetResourceEClass, StylesheetResource.class, "StylesheetResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStylesheetResource_Location(), ecorePackage.getEString(), "location", null, 1, 1, StylesheetResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stylesheetReferenceEClass, StylesheetReference.class, "StylesheetReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStylesheetReference_Href(), ecorePackage.getEString(), "href", null, 1, 1, StylesheetReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScript_Code(), ecorePackage.getEString(), "code", null, 1, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptResourceEClass, ScriptResource.class, "ScriptResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScriptResource_Location(), ecorePackage.getEString(), "location", null, 1, 1, ScriptResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptReferenceEClass, ScriptReference.class, "ScriptReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScriptReference_Src(), ecorePackage.getEString(), "src", null, 1, 1, ScriptReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(tagNameEDataType, TagName.class, "TagName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// urn:org.nasdanika
		createUrnorgAnnotations();
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
			   "documentation", "HTML model"
		   });
		addAnnotation
		  (viewPartEClass,
		   source,
		   new String[] {
			   "documentation", "Consumer takes an argument of type T and creates a void work factory. The work factory creates work a given context. When the work is executed with a progress monitor it operates on the consumer argument and returns null."
		   });
		addAnnotation
		  (viewBuilderEClass,
		   source,
		   new String[] {
			   "documentation", "Consumer takes an argument of type T and creates a void work factory. The work factory creates work a given context. When the work is executed with a progress monitor it operates on the consumer argument and returns null."
		   });
		addAnnotation
		  (htmlElementEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for other HTML and bootstrap elements. "
		   });
		addAnnotation
		  (getHtmlElement__AsViewBuilderSupplier__Context(),
		   source,
		   new String[] {
			   "documentation", "Wraps element into a view builder - an existing object can be passed to HTML element\'s function and it will \"build\" it by applying styles, attriutes, etc."
		   });
		addAnnotation
		  (containerEClass,
		   source,
		   new String[] {
			   "documentation", "Container of content such as text and HTML markup."
		   });
		addAnnotation
		  (getContainer_MarkdownContent(),
		   source,
		   new String[] {
			   "documentation", "[Markdown](https://en.wikipedia.org/wiki/Markdown) text. If this attribute contains text, the text is converted to HTML, interpolated and used as the first content element."
		   });
		addAnnotation
		  (tagEClass,
		   source,
		   new String[] {
			   "documentation", "HTML Tag"
		   });
		addAnnotation
		  (getTag_Name(),
		   source,
		   new String[] {
			   "documentation", "Tag name."
		   });
		addAnnotation
		  (pageEClass,
		   source,
		   new String[] {
			   "documentation", "HTML page. The name attribute is output as ``<TITLE>`` in the head.\n\n[Overview video](https://www.youtube.com/watch?v=S28UszI-2g8) - in Russian."
		   });
		addAnnotation
		  (getPage_Head(),
		   source,
		   new String[] {
			   "documentation", "Head content."
		   });
		addAnnotation
		  (getPage_Body(),
		   source,
		   new String[] {
			   "documentation", "Body content."
		   });
		addAnnotation
		  (getPage_Builders(),
		   source,
		   new String[] {
			   "documentation", "Builders operate on an instance of ``org.nasdanika.html.HTMLPage`` created by the the page element."
		   });
		addAnnotation
		  (getPage_Language(),
		   source,
		   new String[] {
			   "documentation", "Page language - ``lang`` attribute."
		   });
		addAnnotation
		  (getPage_FontAwesome(),
		   source,
		   new String[] {
			   "documentation", "If this attribute is set to true [Font Awesome](https://fontawesome.com/) CDN stylesheet reference is added to the head."
		   });
		addAnnotation
		  (getPage_JsTree(),
		   source,
		   new String[] {
			   "documentation", "If this attribute is set to true [jsTree](https://www.jstree.com/) CDN script and stylesheet references are added to the head."
		   });
		addAnnotation
		  (getPage_GithubMarkdownCss(),
		   source,
		   new String[] {
			   "documentation", "If this attribute is set to true [GitHub Markdown CSS](https://github.com/sindresorhus/github-markdown-css) CDN stylesheet reference is added to the head."
		   });
		addAnnotation
		  (getStylesheet_Code(),
		   source,
		   new String[] {
			   "documentation", "Stylesheet code."
		   });
		addAnnotation
		  (getStylesheetResource_Location(),
		   source,
		   new String[] {
			   "documentation", "Stylesheet code location relative to the model resource location."
		   });
		addAnnotation
		  (getStylesheetReference_Href(),
		   source,
		   new String[] {
			   "documentation", "Stylesheet URL."
		   });
		addAnnotation
		  (getScript_Code(),
		   source,
		   new String[] {
			   "documentation", "Script code."
		   });
		addAnnotation
		  (getScriptResource_Location(),
		   source,
		   new String[] {
			   "documentation", "Script code location relative to the model resource location."
		   });
		addAnnotation
		  (getScriptReference_Src(),
		   source,
		   new String[] {
			   "documentation", "Script URL."
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
		  (getContainer_MarkdownContent(),
		   source,
		   new String[] {
			   "content-type", "text/markdown"
		   });
		addAnnotation
		  (getStylesheet_Code(),
		   source,
		   new String[] {
			   "content-type", "text/code"
		   });
		addAnnotation
		  (getScript_Code(),
		   source,
		   new String[] {
			   "content-type", "text/code"
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
		  (tagEClass,
		   source,
		   new String[] {
			   "constraints", "attributes"
		   });
	}

} //HtmlPackageImpl
