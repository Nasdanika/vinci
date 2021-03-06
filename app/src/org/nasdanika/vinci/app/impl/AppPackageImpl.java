/**
 */
package org.nasdanika.vinci.app.impl;

import static org.nasdanika.vinci.app.AppPackage.CONTAINER;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.party.PartyPackage;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionAdapter;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionCategory;
import org.nasdanika.vinci.app.ActionElement;
import org.nasdanika.vinci.app.ActionLink;
import org.nasdanika.vinci.app.ActionMapping;
import org.nasdanika.vinci.app.ActionReference;
import org.nasdanika.vinci.app.ActivatorType;
import org.nasdanika.vinci.app.AppFactory;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.BootstrapContainerApplication;
import org.nasdanika.vinci.app.BootstrapContainerApplicationPanel;
import org.nasdanika.vinci.app.BootstrapContainerApplicationSection;
import org.nasdanika.vinci.app.Category;
import org.nasdanika.vinci.app.Label;
import org.nasdanika.vinci.app.Partition;
import org.nasdanika.vinci.app.Widget;
import org.nasdanika.vinci.app.util.AppValidator;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.html.HtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppPackageImpl extends EPackageImpl implements AppPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bootstrapContainerApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bootstrapContainerApplicationSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bootstrapContainerApplicationPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionMappingEClass = null;

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
	private EClass actionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

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
	 * @see org.nasdanika.vinci.app.AppPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AppPackageImpl() {
		super(eNS_URI, AppFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AppPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AppPackage init() {
		if (isInited) return (AppPackage)EPackage.Registry.INSTANCE.getEPackage(AppPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAppPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AppPackageImpl theAppPackage = registeredAppPackage instanceof AppPackageImpl ? (AppPackageImpl)registeredAppPackage : new AppPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BootstrapPackage.eINSTANCE.eClass();
		EngineeringPackage.eINSTANCE.eClass();
		HtmlPackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();
		PartyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAppPackage.createPackageContents();

		// Initialize created meta-data
		theAppPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAppPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return AppValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAppPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AppPackage.eNS_URI, theAppPackage);
		return theAppPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Color() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Notification() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabel_Appearance() {
		return (EReference)labelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Text() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Icon() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Tooltip() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Outline() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartition() {
		return partitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBootstrapContainerApplication() {
		return bootstrapContainerApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstrapContainerApplication_Fluid() {
		return (EAttribute)bootstrapContainerApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBootstrapContainerApplication_Router() {
		return (EAttribute)bootstrapContainerApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBootstrapContainerApplication_Header() {
		return (EReference)bootstrapContainerApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBootstrapContainerApplication_NavigationBar() {
		return (EReference)bootstrapContainerApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBootstrapContainerApplication_NavigationPanel() {
		return (EReference)bootstrapContainerApplicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBootstrapContainerApplication_ContentPanel() {
		return (EReference)bootstrapContainerApplicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBootstrapContainerApplication_Footer() {
		return (EReference)bootstrapContainerApplicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBootstrapContainerApplication_Builders() {
		return (EReference)bootstrapContainerApplicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBootstrapContainerApplicationSection() {
		return bootstrapContainerApplicationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBootstrapContainerApplicationPanel() {
		return bootstrapContainerApplicationPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBootstrapContainerApplicationPanel_Width() {
		return (EReference)bootstrapContainerApplicationPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionMapping() {
		return actionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionMapping_Alias() {
		return (EAttribute)actionMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionMapping_Target() {
		return (EReference)actionMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionMapping_Description() {
		return (EAttribute)actionMappingEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getActionLink_Ref() {
		return (EAttribute)actionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionLink_Path() {
		return (EAttribute)actionLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionReference() {
		return actionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionReference_Action() {
		return (EReference)actionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionReference_Path() {
		return (EAttribute)actionReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionAdapter() {
		return actionAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionAdapter_Factory() {
		return (EAttribute)actionAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionAdapter_Path() {
		return (EAttribute)actionAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActivatorType() {
		return activatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionElement() {
		return actionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractAction() {
		return abstractActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractAction_ActionMappings() {
		return (EReference)abstractActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionCategory() {
		return actionCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionBase() {
		return actionBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_Role() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_SectionStyle() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_SectionColumns() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_Activator() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_ActivatorType() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_Confirmation() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_Disabled() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_MarkdownContent() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_PageTemplate() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionBase_Content() {
		return (EReference)actionBaseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionBase_Widgets() {
		return (EReference)actionBaseEClass.getEStructuralFeatures().get(10);
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
	public EReference getContainer_Elements() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_LinkedElements() {
		return (EReference)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppFactory getAppFactory() {
		return (AppFactory)getEFactoryInstance();
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
		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__ELEMENTS);
		createEReference(containerEClass, CONTAINER__LINKED_ELEMENTS);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__COLOR);
		createEAttribute(labelEClass, LABEL__TEXT);
		createEAttribute(labelEClass, LABEL__ICON);
		createEAttribute(labelEClass, LABEL__TOOLTIP);
		createEAttribute(labelEClass, LABEL__OUTLINE);
		createEAttribute(labelEClass, LABEL__NOTIFICATION);
		createEReference(labelEClass, LABEL__APPEARANCE);

		categoryEClass = createEClass(CATEGORY);

		actionElementEClass = createEClass(ACTION_ELEMENT);

		abstractActionEClass = createEClass(ABSTRACT_ACTION);
		createEReference(abstractActionEClass, ABSTRACT_ACTION__ACTION_MAPPINGS);

		actionCategoryEClass = createEClass(ACTION_CATEGORY);

		actionBaseEClass = createEClass(ACTION_BASE);
		createEAttribute(actionBaseEClass, ACTION_BASE__ROLE);
		createEAttribute(actionBaseEClass, ACTION_BASE__SECTION_STYLE);
		createEAttribute(actionBaseEClass, ACTION_BASE__SECTION_COLUMNS);
		createEAttribute(actionBaseEClass, ACTION_BASE__ACTIVATOR);
		createEAttribute(actionBaseEClass, ACTION_BASE__ACTIVATOR_TYPE);
		createEAttribute(actionBaseEClass, ACTION_BASE__CONFIRMATION);
		createEAttribute(actionBaseEClass, ACTION_BASE__DISABLED);
		createEAttribute(actionBaseEClass, ACTION_BASE__MARKDOWN_CONTENT);
		createEAttribute(actionBaseEClass, ACTION_BASE__PAGE_TEMPLATE);
		createEReference(actionBaseEClass, ACTION_BASE__CONTENT);
		createEReference(actionBaseEClass, ACTION_BASE__WIDGETS);

		actionMappingEClass = createEClass(ACTION_MAPPING);
		createEAttribute(actionMappingEClass, ACTION_MAPPING__ALIAS);
		createEReference(actionMappingEClass, ACTION_MAPPING__TARGET);
		createEAttribute(actionMappingEClass, ACTION_MAPPING__DESCRIPTION);

		actionLinkEClass = createEClass(ACTION_LINK);
		createEAttribute(actionLinkEClass, ACTION_LINK__REF);
		createEAttribute(actionLinkEClass, ACTION_LINK__PATH);

		actionReferenceEClass = createEClass(ACTION_REFERENCE);
		createEReference(actionReferenceEClass, ACTION_REFERENCE__ACTION);
		createEAttribute(actionReferenceEClass, ACTION_REFERENCE__PATH);

		actionAdapterEClass = createEClass(ACTION_ADAPTER);
		createEAttribute(actionAdapterEClass, ACTION_ADAPTER__FACTORY);
		createEAttribute(actionAdapterEClass, ACTION_ADAPTER__PATH);

		actionEClass = createEClass(ACTION);

		partitionEClass = createEClass(PARTITION);

		bootstrapContainerApplicationEClass = createEClass(BOOTSTRAP_CONTAINER_APPLICATION);
		createEAttribute(bootstrapContainerApplicationEClass, BOOTSTRAP_CONTAINER_APPLICATION__FLUID);
		createEAttribute(bootstrapContainerApplicationEClass, BOOTSTRAP_CONTAINER_APPLICATION__ROUTER);
		createEReference(bootstrapContainerApplicationEClass, BOOTSTRAP_CONTAINER_APPLICATION__HEADER);
		createEReference(bootstrapContainerApplicationEClass, BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR);
		createEReference(bootstrapContainerApplicationEClass, BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL);
		createEReference(bootstrapContainerApplicationEClass, BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL);
		createEReference(bootstrapContainerApplicationEClass, BOOTSTRAP_CONTAINER_APPLICATION__FOOTER);
		createEReference(bootstrapContainerApplicationEClass, BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS);

		bootstrapContainerApplicationSectionEClass = createEClass(BOOTSTRAP_CONTAINER_APPLICATION_SECTION);

		bootstrapContainerApplicationPanelEClass = createEClass(BOOTSTRAP_CONTAINER_APPLICATION_PANEL);
		createEReference(bootstrapContainerApplicationPanelEClass, BOOTSTRAP_CONTAINER_APPLICATION_PANEL__WIDTH);

		widgetEClass = createEClass(WIDGET);

		// Create enums
		activatorTypeEEnum = createEEnum(ACTIVATOR_TYPE);
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
		BootstrapPackage theBootstrapPackage = (BootstrapPackage)EPackage.Registry.INSTANCE.getEPackage(BootstrapPackage.eNS_URI);
		EngineeringPackage theEngineeringPackage = (EngineeringPackage)EPackage.Registry.INSTANCE.getEPackage(EngineeringPackage.eNS_URI);
		HtmlPackage theHtmlPackage = (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);

		// Create type parameters
		ETypeParameter containerEClass_E = addETypeParameter(containerEClass, "E");
		ETypeParameter categoryEClass_E = addETypeParameter(categoryEClass, "E");

		// Set bounds for type parameters

		// Add supertypes to classes
		labelEClass.getESuperTypes().add(theNcorePackage.getEntity());
		EGenericType g1 = createEGenericType(this.getLabel());
		categoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainer());
		EGenericType g2 = createEGenericType(categoryEClass_E);
		g1.getETypeArguments().add(g2);
		categoryEClass.getEGenericSuperTypes().add(g1);
		abstractActionEClass.getESuperTypes().add(this.getActionElement());
		abstractActionEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		abstractActionEClass.getESuperTypes().add(theNcorePackage.getConfigurable());
		g1 = createEGenericType(this.getCategory());
		g2 = createEGenericType(this.getAbstractAction());
		g1.getETypeArguments().add(g2);
		actionCategoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActionElement());
		actionCategoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLabel());
		actionBaseEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractAction());
		actionBaseEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainer());
		g2 = createEGenericType(this.getActionElement());
		g1.getETypeArguments().add(g2);
		actionBaseEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theEngineeringPackage.getAbstractComponent());
		actionBaseEClass.getEGenericSuperTypes().add(g1);
		actionLinkEClass.getESuperTypes().add(this.getAbstractAction());
		actionReferenceEClass.getESuperTypes().add(this.getAbstractAction());
		actionAdapterEClass.getESuperTypes().add(this.getAbstractAction());
		actionEClass.getESuperTypes().add(this.getActionBase());
		partitionEClass.getESuperTypes().add(this.getActionBase());
		bootstrapContainerApplicationEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		bootstrapContainerApplicationSectionEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		bootstrapContainerApplicationSectionEClass.getESuperTypes().add(theHtmlPackage.getContainer());
		bootstrapContainerApplicationPanelEClass.getESuperTypes().add(this.getBootstrapContainerApplicationSection());
		widgetEClass.getESuperTypes().add(theNcorePackage.getNamedElement());
		widgetEClass.getESuperTypes().add(theHtmlPackage.getContainer());

		// Initialize classes, features, and operations; add parameters
		initEClass(containerEClass, org.nasdanika.vinci.app.Container.class, "Container", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(containerEClass_E);
		initEReference(getContainer_Elements(), g1, null, "elements", null, 0, -1, org.nasdanika.vinci.app.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(containerEClass_E);
		initEReference(getContainer_LinkedElements(), g1, null, "linkedElements", null, 0, -1, org.nasdanika.vinci.app.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Color(), ecorePackage.getEString(), "color", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Text(), ecorePackage.getEString(), "text", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Tooltip(), ecorePackage.getEString(), "tooltip", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Outline(), ecorePackage.getEBoolean(), "outline", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Notification(), ecorePackage.getEString(), "notification", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabel_Appearance(), theBootstrapPackage.getAppearance(), null, "appearance", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionElementEClass, ActionElement.class, "ActionElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractActionEClass, AbstractAction.class, "AbstractAction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractAction_ActionMappings(), this.getActionMapping(), null, "actionMappings", null, 0, -1, AbstractAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionCategoryEClass, ActionCategory.class, "ActionCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionBaseEClass, ActionBase.class, "ActionBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionBase_Role(), ecorePackage.getEString(), "role", "Navigation", 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_SectionStyle(), ecorePackage.getEString(), "sectionStyle", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_SectionColumns(), ecorePackage.getEInt(), "sectionColumns", "3", 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_Activator(), ecorePackage.getEString(), "activator", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_ActivatorType(), this.getActivatorType(), "activatorType", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_Confirmation(), ecorePackage.getEString(), "confirmation", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_Disabled(), ecorePackage.getEBoolean(), "disabled", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_MarkdownContent(), ecorePackage.getEString(), "markdownContent", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_PageTemplate(), ecorePackage.getEString(), "pageTemplate", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionBase_Content(), ecorePackage.getEObject(), null, "content", null, 0, -1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionBase_Widgets(), this.getWidget(), null, "widgets", null, 0, -1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionMappingEClass, ActionMapping.class, "ActionMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionMapping_Alias(), ecorePackage.getEString(), "alias", null, 1, 1, ActionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionMapping_Target(), this.getAbstractAction(), null, "target", null, 1, 1, ActionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionMapping_Description(), ecorePackage.getEString(), "description", null, 0, 1, ActionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionLinkEClass, ActionLink.class, "ActionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionLink_Ref(), ecorePackage.getEString(), "ref", null, 1, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionLink_Path(), ecorePackage.getEString(), "path", null, 0, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionReferenceEClass, ActionReference.class, "ActionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionReference_Action(), this.getAbstractAction(), null, "action", null, 1, 1, ActionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionReference_Path(), ecorePackage.getEString(), "path", null, 0, 1, ActionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionAdapterEClass, ActionAdapter.class, "ActionAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionAdapter_Factory(), ecorePackage.getEString(), "factory", null, 1, 1, ActionAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionAdapter_Path(), ecorePackage.getEString(), "path", null, 0, 1, ActionAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partitionEClass, Partition.class, "Partition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bootstrapContainerApplicationEClass, BootstrapContainerApplication.class, "BootstrapContainerApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBootstrapContainerApplication_Fluid(), ecorePackage.getEBoolean(), "fluid", null, 0, 1, BootstrapContainerApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBootstrapContainerApplication_Router(), ecorePackage.getEBoolean(), "router", null, 0, 1, BootstrapContainerApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBootstrapContainerApplication_Header(), this.getBootstrapContainerApplicationSection(), null, "header", null, 0, 1, BootstrapContainerApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBootstrapContainerApplication_NavigationBar(), this.getBootstrapContainerApplicationSection(), null, "navigationBar", null, 0, 1, BootstrapContainerApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBootstrapContainerApplication_NavigationPanel(), this.getBootstrapContainerApplicationPanel(), null, "navigationPanel", null, 0, 1, BootstrapContainerApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBootstrapContainerApplication_ContentPanel(), this.getBootstrapContainerApplicationPanel(), null, "contentPanel", null, 0, 1, BootstrapContainerApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBootstrapContainerApplication_Footer(), this.getBootstrapContainerApplicationSection(), null, "footer", null, 0, 1, BootstrapContainerApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBootstrapContainerApplication_Builders(), this.getAbstractAction(), null, "builders", null, 0, -1, BootstrapContainerApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bootstrapContainerApplicationSectionEClass, BootstrapContainerApplicationSection.class, "BootstrapContainerApplicationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bootstrapContainerApplicationPanelEClass, BootstrapContainerApplicationPanel.class, "BootstrapContainerApplicationPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBootstrapContainerApplicationPanel_Width(), theBootstrapPackage.getColumnWidth(), null, "width", null, 0, -1, BootstrapContainerApplicationPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(activatorTypeEEnum, ActivatorType.class, "ActivatorType");
		addEEnumLiteral(activatorTypeEEnum, ActivatorType.REFERENCE);
		addEEnumLiteral(activatorTypeEEnum, ActivatorType.SCRIPT);
		addEEnumLiteral(activatorTypeEEnum, ActivatorType.BIND);
		addEEnumLiteral(activatorTypeEEnum, ActivatorType.INLINE);
		addEEnumLiteral(activatorTypeEEnum, ActivatorType.NONE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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
			   "documentation", "Application model."
		   });
		addAnnotation
		  (containerEClass,
		   source,
		   new String[] {
			   "documentation", "Container of elements."
		   });
		addAnnotation
		  (getContainer_Elements(),
		   source,
		   new String[] {
			   "documentation", "Container elements."
		   });
		addAnnotation
		  (getContainer_LinkedElements(),
		   source,
		   new String[] {
			   "documentation", "Elements contained by another objects and logically linked to this container."
		   });
		addAnnotation
		  (labelEClass,
		   source,
		   new String[] {
			   "documentation", "Label is a base class for actions and categories."
		   });
		addAnnotation
		  (getLabel_Color(),
		   source,
		   new String[] {
			   "documentation", "Label bootstrap color."
		   });
		addAnnotation
		  (getLabel_Text(),
		   source,
		   new String[] {
			   "documentation", "Label text."
		   });
		addAnnotation
		  (getLabel_Icon(),
		   source,
		   new String[] {
			   "documentation", "Label icon. Treated as URL if contains ``/`` or as a CSS class otherwise. E.g. ``fas fa-wrench`` would be treated as a CSS class."
		   });
		addAnnotation
		  (getLabel_Tooltip(),
		   source,
		   new String[] {
			   "documentation", "Label tooltip."
		   });
		addAnnotation
		  (getLabel_Outline(),
		   source,
		   new String[] {
			   "documentation", "For some label representations specifies that the label shall be displayed as an outline instead of a solid fill."
		   });
		addAnnotation
		  (getLabel_Notification(),
		   source,
		   new String[] {
			   "documentation", "Notification to display next to the label. E.g. a number of new messages in an inbox."
		   });
		addAnnotation
		  (getLabel_Appearance(),
		   source,
		   new String[] {
			   "documentation", "Can be used for cusomization of label appearance in addition to \"built-in\" label appearance attributes - color and outline."
		   });
		addAnnotation
		  (categoryEClass,
		   source,
		   new String[] {
			   "documentation", "Categories are used for grouping of its elements such as actions or properties. "
		   });
		addAnnotation
		  (actionElementEClass,
		   source,
		   new String[] {
			   "documentation", "An element which can be contained by an action - action category or abstract action."
		   });
		addAnnotation
		  (abstractActionEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for different types of actions - action, action link, and action reference."
		   });
		addAnnotation
		  (getAbstractAction_ActionMappings(),
		   source,
		   new String[] {
			   "documentation", "A collection of mappings of action logical names to target actions. Action mappings are inherited by action children."
		   });
		addAnnotation
		  (actionCategoryEClass,
		   source,
		   new String[] {
			   "documentation", "Grouping of actions."
		   });
		addAnnotation
		  (actionBaseEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for concrete action classes - Action and Partition. These sub-classes are semantically equivalent and differ only in diagram representation - Action is represented by a node, Partition by a container node.\nAction can be a child of another action or of an action category. It may contain content and action elements - abstract actions and action categories. It may also contain action mappings - logical names of actions referenced by this action\'s content."
		   });
		addAnnotation
		  (getActionBase_Role(),
		   source,
		   new String[] {
			   "documentation", "Action roles are used in \"wiring\" of actions into the generated Web UI.\n\nFor the root action its children are displayed depending on their rolw as follows:\n\n* Navigation: \n    * The first navigation child is called \"Principal\" and is displayed in the navbar brand. \n    * The remaining navigation children are displayed in navs on the right in the header.\n* Context children are displayed in the footer.\n\nFor the principal action (the first navigation child of the root action):\n\n* Navigation actions are displayed in the navigation panel on the left.\n* Context actions are displayed in the navbar.\n\nFor other non-section actions navigation children are displayed in the navigation panel and context children are displayed in right-floating navs on the top of the content panel.\n\nSection actions are displayed as part of the content panel body of their parent. Their navigation children are treated as sections and display of their context children depends on the section style.\n\nContent left and Content right acitons are displayed on the left and right of the content body respectively.\n\nView and Edit actions are applicable for properties and property sources."
		   });
		addAnnotation
		  (getActionBase_SectionStyle(),
		   source,
		   new String[] {
			   "documentation", "Defines how to generate section children."
		   });
		addAnnotation
		  (getActionBase_SectionColumns(),
		   source,
		   new String[] {
			   "documentation", "Applicable to section style \"Card\". Defines how many columns shall be in a row of section cards."
		   });
		addAnnotation
		  (getActionBase_Activator(),
		   source,
		   new String[] {
			   "documentation", "Activator is either a URL if the activator type is Reference, or a script if the activator type is Script or Bind.\n\nThe application generator generates a page for an action only if the activator type is Reference, the URL does not start with ``./`` and when resolved is relative to the base URI and below it. \nUsing ``./`` is a way to reference externally generated content. For example, create a hierarchy/federation of sites.\n\nFor the reference activator type activator URL is resolved against the first ancestor action which also has reference activator type. If there is no such action, the URL is resolved against the base URI.\nDuring generation action URL is de-resolved against the base URI to produce a relative resource/file path. \n\n``${{{base-uri}}}`` token can be used in the activator to define the uri relative to the base generation URI (output folder) instead of the parent URI. It might be useful it the parent URI is an absolute external URI.\n``${{{base-uri}}}`` ends with a slash, so there is no need to add a slash. E.g. ``${{{base-uri}}}index.html``."
		   });
		addAnnotation
		  (getActionBase_ActivatorType(),
		   source,
		   new String[] {
			   "documentation", "Action activator type. Actions may have no activators. Activator and activator type settings are not used for actions in Section role."
		   });
		addAnnotation
		  (getActionBase_Confirmation(),
		   source,
		   new String[] {
			   "documentation", "Confirmation to display in a confirmation dialog before action activation to give the user an opportunity to cancel the action. E.g. confirmation of deletion."
		   });
		addAnnotation
		  (getActionBase_Disabled(),
		   source,
		   new String[] {
			   "documentation", "If true, then action is displayed as disabled. "
		   });
		addAnnotation
		  (getActionBase_MarkdownContent(),
		   source,
		   new String[] {
			   "documentation", "[Markdown](https://en.wikipedia.org/wiki/Markdown) text. If this attribute contains text, the text is converted to HTML, interpolated and used as the first content element.\nThe primary purpose of this attribute is rapid development/prototyping of web applications/sites. "
		   });
		addAnnotation
		  (getActionBase_PageTemplate(),
		   source,
		   new String[] {
			   "documentation", "URI of the page template to use for generation of a Web Application. The URI is resolved relative to the action\'s containing resource.\nDefaults to ``platform:/plugin/org.nasdanika.vinci.templates/pages/default/primary.vinci`` built-in template.\n\n## Built-in page templates\n\n``org.nasdanika.vinci.templates`` plugin, which is part of the Vinci distribution, provides the following page templates (organized by theme and header color):\n\n* Default\n    * Primary\n        * ``platform:/plugin/org.nasdanika.vinci.templates/pages/default/primary.vinci``\n        * ``platform:/plugin/org.nasdanika.vinci.templates/pages/default/primary-fluid.vinci`` - fluid container.\n* Cerulean\n    * Primary\n        * ``platform:/plugin/org.nasdanika.vinci.templates/pages/cerulean/primary.vinci``\n        * ``platform:/plugin/org.nasdanika.vinci.templates/pages/cerulean/primary-fluid.vinci`` - fluid container.\n        * ``platform:/plugin/org.nasdanika.vinci.templates/pages/cerulean/primary-dark.vinci`` - dark navigation bar.\n        * ``platform:/plugin/org.nasdanika.vinci.templates/pages/cerulean/primary-dark-fluid.vinci`` - dark navigation bar, fluid container.\n    * Dark \n        * ``platform:/plugin/org.nasdanika.vinci.templates/pages/cerulean/dark.vinci``\n        * ``platform:/plugin/org.nasdanika.vinci.templates/pages/cerulean/dark-fluid.vinci`` - fluid container.\n    "
		   });
		addAnnotation
		  (getActionBase_Content(),
		   source,
		   new String[] {
			   "documentation", "Action content."
		   });
		addAnnotation
		  (getActionBase_Widgets(),
		   source,
		   new String[] {
			   "documentation", "Action widgets. Widgets are inherited by action children."
		   });
		addAnnotation
		  (actionMappingEClass,
		   source,
		   new String[] {
			   "documentation", "Action mapping provides a logical name (alias) for another (abstract) action for convenient linking/referencing from action\'s content.\n\nAction mapping target is injected into the context under ``action-mappings/<mapping name>`` key. When retrieved as a String, e.g. during interpolation, the mapping is converted to a link. \nI.e. in ``This is my mapping ${action-mappings/my-mapping}!`` ``${action-mappings/my-mapping}`` will be interpolated into a link to the mapped action.\n\nIn the above case, when aciton mapping is retrieved as a String without a sub-key, it is possible to provide alternative text for the mapping link by separating it from the mapping by a space.\nFor example, ``${action-mappings/my-mapping alternative text here}`` will be interpolated as a link to the target action with \"alternative text here\" link text.\nAs a consequence, action aliases cannot have spaces in them.\n\nAction mapping also supports ``text``, ``icon``, and ``url`` sub-keys computing to action text and action url for actions with reference activator. \nFor example:\n\n* ``${action-mappings/my-mapping/text}`` will interpolate to the mapped action text.\n* ``${action-mappings/my-mapping/icon}`` will interpolate to the mapped action icon.\n* ``${action-mappings/my-mapping/url}`` will interpolate to the mapped action url.\n\nMappings are inherited by children. Lower level mappings hide higher level mappings. Action reference mappings are passed to the reference target. "
		   });
		addAnnotation
		  (getActionMapping_Alias(),
		   source,
		   new String[] {
			   "documentation", "Logical name of the target action."
		   });
		addAnnotation
		  (getActionMapping_Target(),
		   source,
		   new String[] {
			   "documentation", "Mapping target."
		   });
		addAnnotation
		  (getActionMapping_Description(),
		   source,
		   new String[] {
			   "documentation", "Mapping description."
		   });
		addAnnotation
		  (actionLinkEClass,
		   source,
		   new String[] {
			   "documentation", "A link to an action stored in a resource which may or may not be loaded as part of the editing resource set. \nThe model and action specificed in the action link\'s reference (``ref``) is loaded only during the generation. \nThis way it is different [ActionReference](ActionReference.html) which references an action available in the editing resource set - models in the same modeling project or loaded with \"Load resource\" context menu.\nFor example, action link reference may point to a dynamically generated model or may contain interpolation tokens and different actions can be linked based on generation configuration.\n\nThe linked action inherits this action link context. As such the same linked action linked by different action links may behave differently depending\non the action link context/configuration. \nI.e. a link may create a different \"instance\" of linked action. \nIn this case the linked action activator shall also be context dependent - otherwise different instances of the same action will point to the same resource/url.\n\nIf ``ref`` ends with ``.yml``, action link loads YAML action specifications using [ComposedLoader](${base-uri}reference/knowledge-base/html/app/factories/index.html). "
		   });
		addAnnotation
		  (getActionLink_Ref(),
		   source,
		   new String[] {
			   "documentation", "Action specification URL interpolated and then relsolved relative to the model location.\nThe URL consists of the target model URL and optional action ID fragment separated from the model URL part by ``#``.\nIn the absence of the fragment part the URL is resolved to the root action of the target model file.\n\n##### Example\n\nIn [Nasdanika Tool Suite Documentation Bundle](https://github.com/Nasdanika/release/tree/master/tool-suite/doc)\n``models/documentation.vinci`` links the root action of ``models/guides/vinci/vinci.vinci``. \n``ref`` value of that link is ``guides/vinci/vinci.vinci`` because the reference is to the root action and therefore there is no action id fragment.\n\nReferencing a non-root action would require a fragment part with action id, e.g. ``guides/vinci/vinci.vinci#860cba03-eca8-4893-8b84-21ae0bfb1bc9``."
		   });
		addAnnotation
		  (getActionLink_Path(),
		   source,
		   new String[] {
			   "documentation", "If path is not blank then it is resolved against the context URI to produce a new context URI for the linked action.\nIt can be used to organize generated content into folders in order to avoid name clashes or semantic references, e.g. ``index.html`` generated by one action overwriting ``index.html`` generated by another.\n\nFor example, if the linked action activator is ``click-me.html`` and the path is blank, then the linked action  will be generated in the same folder as the parent of the action link. \nIf the path is ``click-me-demo`` then the linked action content will be generated to ``click-me-demo/click.html``.\n\n``${base-uri}`` token can be used to define the uri relative to the base generation URI (output folder) instead of the parent URI. It might be useful it the parent URI is an absolute external URI.\n``${base-uri}`` ends with a slash, so there is no need to add a slash. E.g. ``${base-uri}click-me-demo``."
		   });
		addAnnotation
		  (actionReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "Action reference allows to \"mount\" an existing action as a child of another action. \nUsing action references a single \"logical\" aciton hierarchy may be assembled from multiple model resources.\n\nThe referenced action inherits this action reference context. As such the same referenced action referenced by different action references may behave differently depending\non the action reference context/configuration. I.e. a reference may create a different \"instance\" of referenced action. \nIn this case the referenced action activator shall also be context dependent - otherwise different instances of the same action will point to the same resource/url."
		   });
		addAnnotation
		  (getActionReference_Action(),
		   source,
		   new String[] {
			   "documentation", "Referenced/mounted action."
		   });
		addAnnotation
		  (getActionReference_Path(),
		   source,
		   new String[] {
			   "documentation", "If path is not blank then it is resolved against the context URI to produce a new context URI for the referenced action.\nIt can be used to organize generated content into folders in order to avoid name clashes or semantic references, e.g. ``index.html`` generated by one action overwriting ``index.html`` generated by another.\n\nFor example, if the referenced action activator is ``click-me.html`` and the path is blank, then the action will be generated in the same folder as the parent of the action reference. \nIf the path is ``click-me-demo`` then the referenced action content will be generated to ``click-me-demo/click.html``.\n\n``${base-uri}`` token can be used to define the uri relative to the base generation URI (output folder) instead of the parent URI. It might be useful it the parent URI is an absolute external URI.\n``${base-uri}`` ends with a slash, so there is no need to add a slash. E.g. ``${base-uri}click-me-demo``."
		   });
		addAnnotation
		  (actionAdapterEClass,
		   source,
		   new String[] {
			   "documentation", "Action adapter uses a named adapter factory to generate HTML action. \nThe factory shall be for ${javadoc/org.nasdanika.html.app.Action$Supplier$Factory} type.\n"
		   });
		addAnnotation
		  (getActionAdapter_Factory(),
		   source,
		   new String[] {
			   "documentation", "Named adapter factory."
		   });
		addAnnotation
		  (getActionAdapter_Path(),
		   source,
		   new String[] {
			   "documentation", "If path is not blank then it is resolved against the context URI to produce a new context URI for the linked action.\nIt can be used to organize generated content into folders in order to avoid name clashes or semantic references, e.g. ``index.html`` generated by one action overwriting ``index.html`` generated by another.\n\nFor example, if the linked action activator is ``click-me.html`` and the path is blank, then the linked action  will be generated in the same folder as the parent of the action link. \nIf the path is ``click-me-demo`` then the linked action content will be generated to ``click-me-demo/click.html``.\n\n``${base-uri}`` token can be used to define the uri relative to the base generation URI (output folder) instead of the parent URI. It might be useful it the parent URI is an absolute external URI.\n``${base-uri}`` ends with a slash, so there is no need to add a slash. E.g. ``${base-uri}click-me-demo``."
		   });
		addAnnotation
		  (activatorTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Type of action activator."
		   });
		addAnnotation
		  (activatorTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Activator is a URL."
		   });
		addAnnotation
		  (activatorTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Activator is a script."
		   });
		addAnnotation
		  (activatorTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Activator is a script executed to bind action to its activator, e.g. set knockoutjs data-bind attribute."
		   });
		addAnnotation
		  (activatorTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Content of actions with inline activator type is displayed instead of the action text and icon - the action is \"activated\" by inlining its content where it is possible. \nIn this case activator value is ignored. \nWhen content inlining is not possible the action is considered to have a Reference activator, i.e. a click on the action navigates to a page with action content.\n\nAn example of inline action would be a search or log-in form. Such a form can be displayed in a card, drop-down, or navbar. \nHowever, it cannot be displayed in a tree - in this case it would be treated as having Reference activator type."
		   });
		addAnnotation
		  (activatorTypeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "No activator, e.g. for a grouping action."
		   });
		addAnnotation
		  (actionEClass,
		   source,
		   new String[] {
			   "documentation", "Concrete action."
		   });
		addAnnotation
		  (partitionEClass,
		   source,
		   new String[] {
			   "documentation", "Concrete action class represented as a container node on a diagram containing actions and other partitions."
		   });
		addAnnotation
		  (bootstrapContainerApplicationEClass,
		   source,
		   new String[] {
			   "documentation", "Bootstrap container application is a page builder which structures a page into 5 areas:\n\n* Header\n* Navigation bar\n* Navigation pane\n* Content pane\n* Footer\n\nPage structuring is performed with Bootstrap container, rows and columns. \n\nAppearance of the top-level container can be customized using Appearance child element. Appearance of the row containing navigation and content panels can be customized using ``children/content-row`` attributes section.\n\nE.g. \n\n```yaml\nchildren:\n    content-row:\n        style:\n            min-height: 15rem\n```\n\nAlso application can be customized by providing a stylesheet or script. Script can be used to implement \"rules inheritance\" which is not supported by CSS. \nBelow is a sample script demonstrating the approach:\n\n```\n$(document).ready( function() {\n  $(\'.nsd-root-action\').css([\'.display-4\']);\n}\n```\n\n[Overview video](https://www.youtube.com/watch?v=W-hGbnM9wNM) in Russian.\n\n\n"
		   });
		addAnnotation
		  (getBootstrapContainerApplication_Fluid(),
		   source,
		   new String[] {
			   "documentation", "If true the application takes the whole width of the page."
		   });
		addAnnotation
		  (getBootstrapContainerApplication_Router(),
		   source,
		   new String[] {
			   "documentation", "If true, a Backbone router code is generated in the header, which allows to build single-page applications. Such applications typically deliver better user experience, but don\'t work over the file protocol, i.e. when files are opened from disk."
		   });
		addAnnotation
		  (getBootstrapContainerApplication_Header(),
		   source,
		   new String[] {
			   "documentation", "Application header.\n\nThe header may contribute to appearance of its content provided by application builders by specifiying ``title`` and ``navs`` keys under the ``children`` pseudo-attribute of its appearance.\n\nThe ``title`` key defines appearance of the header title - the link of the root action. The ``navs`` key defines appearance of the navigation bar build from the root\'s navigation \nchildren after the first one (the principal action).\n\nExample:\n\n```yaml\nchildren:\n    title:\n        class:\n            display: 4\n            text: light\n        style:\n            text-decoration: none\n    title:\n        class:\n            text: light\n```\n"
		   });
		addAnnotation
		  (getBootstrapContainerApplication_NavigationBar(),
		   source,
		   new String[] {
			   "documentation", "Navigation bar."
		   });
		addAnnotation
		  (getBootstrapContainerApplication_NavigationPanel(),
		   source,
		   new String[] {
			   "documentation", "Left navigation panel."
		   });
		addAnnotation
		  (getBootstrapContainerApplication_ContentPanel(),
		   source,
		   new String[] {
			   "documentation", "Content panel on the right of the navigation panel."
		   });
		addAnnotation
		  (getBootstrapContainerApplication_Footer(),
		   source,
		   new String[] {
			   "documentation", "Application footer.\n\nThe footer may contribute to appearance of its content provided by application builders by specifiying ``action`` key under the ``children`` pseudo-attribute of its appearance.\n\nThe ``action`` key defines appearance of the context children of the root action.\n\nExample:\n\n```yaml\nchildren:\n    action:\n        class:\n            text: light\n```\n"
		   });
		addAnnotation
		  (getBootstrapContainerApplication_Builders(),
		   source,
		   new String[] {
			   "documentation", "Builders operate on an instance of ``org.nasdanika.html.app.impl.BootstrapContainerApplication`` or ``org.nasdanika.html.app.impl.BootstrapContainerRouterApplication``\npassed to them by this model element during generation."
		   });
		addAnnotation
		  (bootstrapContainerApplicationSectionEClass,
		   source,
		   new String[] {
			   "documentation", "Bootstrap container application section - header, navigation bar, and footer."
		   });
		addAnnotation
		  (bootstrapContainerApplicationPanelEClass,
		   source,
		   new String[] {
			   "documentation", "Bootstrap container application panel - a section with width spec - navigation panel and content panel."
		   });
		addAnnotation
		  (getBootstrapContainerApplicationPanel_Width(),
		   source,
		   new String[] {
			   "documentation", "Columnt widths for different breakpoints."
		   });
		addAnnotation
		  (widgetEClass,
		   source,
		   new String[] {
			   "documentation", "Named content which is injected into the generated context under ``widgets/<widget name>`` and can be referenced from, say, markdown. This allows to combine the simplicity and ease of use of markdown with advanced functionality of components, e.g. the image component."
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
		  (labelEClass,
		   source,
		   new String[] {
			   "constraints", "color"
		   });
		addAnnotation
		  (actionCategoryEClass,
		   source,
		   new String[] {
			   "constraints", "elements"
		   });
		addAnnotation
		  (actionBaseEClass,
		   source,
		   new String[] {
			   "constraints", "sectionStyle"
		   });
		addAnnotation
		  (actionReferenceEClass,
		   source,
		   new String[] {
			   "constraints", "action"
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
		  (getActionBase_MarkdownContent(),
		   source,
		   new String[] {
			   "content-type", "text/markdown"
		   });
	}

} //AppPackageImpl
