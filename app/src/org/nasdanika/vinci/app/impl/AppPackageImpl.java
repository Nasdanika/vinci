/**
 */
package org.nasdanika.vinci.app.impl;

import static org.nasdanika.vinci.app.AppPackage.CONTAINER;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionCategory;
import org.nasdanika.vinci.app.ActionElement;
import org.nasdanika.vinci.app.ActionLink;
import org.nasdanika.vinci.app.ActionMapping;
import org.nasdanika.vinci.app.ActionReference;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.app.ActivatorType;
import org.nasdanika.vinci.app.AppFactory;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.BootstrapContainerApplication;
import org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder;
import org.nasdanika.vinci.app.BootstrapContainerApplicationPanel;
import org.nasdanika.vinci.app.BootstrapContainerApplicationSection;
import org.nasdanika.vinci.app.Category;
import org.nasdanika.vinci.app.Label;
import org.nasdanika.vinci.app.Partition;
import org.nasdanika.vinci.app.SectionStyle;
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
	private EClass bootstrapContainerApplicationBuilderEClass = null;

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
	private EEnum actionRoleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sectionStyleEEnum = null;

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
		HtmlPackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAppPackage.createPackageContents();

		// Initialize created meta-data
		theAppPackage.initializePackageContents();

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
	public EAttribute getLabel_Id() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Notification() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabel_Appearance() {
		return (EReference)labelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Text() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Icon() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Tooltip() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Outline() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(5);
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
	public EClass getBootstrapContainerApplicationBuilder() {
		return bootstrapContainerApplicationBuilderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBootstrapContainerApplicationBuilder__CreateConsumer__Context() {
		return bootstrapContainerApplicationBuilderEClass.getEOperations().get(0);
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
	public EAttribute getActionLink_Title() {
		return (EAttribute)actionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionLink_Description() {
		return (EAttribute)actionLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionLink_Ref() {
		return (EAttribute)actionLinkEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getActionReference_Title() {
		return (EAttribute)actionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionReference_Description() {
		return (EAttribute)actionReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionReference_Action() {
		return (EReference)actionReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionRole() {
		return actionRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSectionStyle() {
		return sectionStyleEEnum;
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
	public EAttribute getActionBase_FloatRight() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_Embedded() {
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
		createEAttribute(labelEClass, LABEL__ID);
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
		createEAttribute(actionBaseEClass, ACTION_BASE__FLOAT_RIGHT);
		createEAttribute(actionBaseEClass, ACTION_BASE__EMBEDDED);
		createEReference(actionBaseEClass, ACTION_BASE__CONTENT);

		actionMappingEClass = createEClass(ACTION_MAPPING);
		createEAttribute(actionMappingEClass, ACTION_MAPPING__ALIAS);
		createEReference(actionMappingEClass, ACTION_MAPPING__TARGET);
		createEAttribute(actionMappingEClass, ACTION_MAPPING__DESCRIPTION);

		actionLinkEClass = createEClass(ACTION_LINK);
		createEAttribute(actionLinkEClass, ACTION_LINK__TITLE);
		createEAttribute(actionLinkEClass, ACTION_LINK__DESCRIPTION);
		createEAttribute(actionLinkEClass, ACTION_LINK__REF);

		actionReferenceEClass = createEClass(ACTION_REFERENCE);
		createEAttribute(actionReferenceEClass, ACTION_REFERENCE__TITLE);
		createEAttribute(actionReferenceEClass, ACTION_REFERENCE__DESCRIPTION);
		createEReference(actionReferenceEClass, ACTION_REFERENCE__ACTION);

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

		bootstrapContainerApplicationBuilderEClass = createEClass(BOOTSTRAP_CONTAINER_APPLICATION_BUILDER);
		createEOperation(bootstrapContainerApplicationBuilderEClass, BOOTSTRAP_CONTAINER_APPLICATION_BUILDER___CREATE_CONSUMER__CONTEXT);

		// Create enums
		actionRoleEEnum = createEEnum(ACTION_ROLE);
		sectionStyleEEnum = createEEnum(SECTION_STYLE);
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
		HtmlPackage theHtmlPackage = (HtmlPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlPackage.eNS_URI);

		// Create type parameters
		ETypeParameter containerEClass_E = addETypeParameter(containerEClass, "E");
		ETypeParameter categoryEClass_E = addETypeParameter(categoryEClass, "E");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theNcorePackage.getModelElement());
		labelEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		labelEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLabel());
		categoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainer());
		g2 = createEGenericType(categoryEClass_E);
		g1.getETypeArguments().add(g2);
		categoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBootstrapContainerApplicationBuilder());
		abstractActionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActionElement());
		abstractActionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		abstractActionEClass.getEGenericSuperTypes().add(g1);
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
		actionLinkEClass.getESuperTypes().add(this.getAbstractAction());
		actionReferenceEClass.getESuperTypes().add(this.getAbstractAction());
		actionEClass.getESuperTypes().add(this.getActionBase());
		partitionEClass.getESuperTypes().add(this.getActionBase());
		g1 = createEGenericType(theBootstrapPackage.getBootstrapElement());
		bootstrapContainerApplicationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getIConsumerFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		bootstrapContainerApplicationEClass.getEGenericSuperTypes().add(g1);
		bootstrapContainerApplicationSectionEClass.getESuperTypes().add(theBootstrapPackage.getBootstrapElement());
		bootstrapContainerApplicationSectionEClass.getESuperTypes().add(theHtmlPackage.getContainer());
		bootstrapContainerApplicationPanelEClass.getESuperTypes().add(this.getBootstrapContainerApplicationSection());

		// Initialize classes, features, and operations; add parameters
		initEClass(containerEClass, org.nasdanika.vinci.app.Container.class, "Container", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(containerEClass_E);
		initEReference(getContainer_Elements(), g1, null, "elements", null, 0, -1, org.nasdanika.vinci.app.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(containerEClass_E);
		initEReference(getContainer_LinkedElements(), g1, null, "linkedElements", null, 0, -1, org.nasdanika.vinci.app.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Color(), ecorePackage.getEString(), "color", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Id(), ecorePackage.getEString(), "id", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getActionBase_Role(), this.getActionRole(), "role", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_SectionStyle(), this.getSectionStyle(), "sectionStyle", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_SectionColumns(), ecorePackage.getEInt(), "sectionColumns", "1", 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_Activator(), ecorePackage.getEString(), "activator", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_ActivatorType(), this.getActivatorType(), "activatorType", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_Confirmation(), ecorePackage.getEString(), "confirmation", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_Disabled(), ecorePackage.getEBoolean(), "disabled", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_FloatRight(), ecorePackage.getEBoolean(), "floatRight", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_Embedded(), ecorePackage.getEBoolean(), "embedded", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theNcorePackage.getISupplierFactory());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEReference(getActionBase_Content(), g1, null, "content", null, 0, -1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionMappingEClass, ActionMapping.class, "ActionMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionMapping_Alias(), ecorePackage.getEString(), "alias", null, 1, 1, ActionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionMapping_Target(), this.getAbstractAction(), null, "target", null, 1, 1, ActionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionMapping_Description(), ecorePackage.getEString(), "description", null, 0, 1, ActionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionLinkEClass, ActionLink.class, "ActionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionLink_Title(), ecorePackage.getEString(), "title", null, 0, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionLink_Description(), ecorePackage.getEString(), "description", null, 0, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionLink_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionReferenceEClass, ActionReference.class, "ActionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionReference_Title(), ecorePackage.getEString(), "title", null, 0, 1, ActionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionReference_Description(), ecorePackage.getEString(), "description", null, 0, 1, ActionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionReference_Action(), this.getAbstractAction(), null, "action", null, 0, 1, ActionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getBootstrapContainerApplication_Builders(), this.getBootstrapContainerApplicationBuilder(), null, "builders", null, 0, -1, BootstrapContainerApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bootstrapContainerApplicationSectionEClass, BootstrapContainerApplicationSection.class, "BootstrapContainerApplicationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bootstrapContainerApplicationPanelEClass, BootstrapContainerApplicationPanel.class, "BootstrapContainerApplicationPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBootstrapContainerApplicationPanel_Width(), theBootstrapPackage.getColumnWidth(), null, "width", null, 0, -1, BootstrapContainerApplicationPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bootstrapContainerApplicationBuilderEClass, BootstrapContainerApplicationBuilder.class, "BootstrapContainerApplicationBuilder", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getBootstrapContainerApplicationBuilder__CreateConsumer__Context(), null, "createConsumer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theNcorePackage.getIContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theNcorePackage.getException());
		g1 = createEGenericType(theNcorePackage.getIConsumer());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		// Initialize enums and add enum literals
		initEEnum(actionRoleEEnum, ActionRole.class, "ActionRole");
		addEEnumLiteral(actionRoleEEnum, ActionRole.NAVIGATION);
		addEEnumLiteral(actionRoleEEnum, ActionRole.CONTEXT);
		addEEnumLiteral(actionRoleEEnum, ActionRole.SECTION);
		addEEnumLiteral(actionRoleEEnum, ActionRole.VIEW);
		addEEnumLiteral(actionRoleEEnum, ActionRole.EDIT);

		initEEnum(sectionStyleEEnum, SectionStyle.class, "SectionStyle");
		addEEnumLiteral(sectionStyleEEnum, SectionStyle.PARAGRAPH);
		addEEnumLiteral(sectionStyleEEnum, SectionStyle.TAB);
		addEEnumLiteral(sectionStyleEEnum, SectionStyle.PILL);
		addEEnumLiteral(sectionStyleEEnum, SectionStyle.VERTICAL_PILL);
		addEEnumLiteral(sectionStyleEEnum, SectionStyle.ACTION_GROUP);
		addEEnumLiteral(sectionStyleEEnum, SectionStyle.CARD);

		initEEnum(activatorTypeEEnum, ActivatorType.class, "ActivatorType");
		addEEnumLiteral(activatorTypeEEnum, ActivatorType.REFERENCE);
		addEEnumLiteral(activatorTypeEEnum, ActivatorType.SCRIPT);
		addEEnumLiteral(activatorTypeEEnum, ActivatorType.BIND);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
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
			   "documentation", "Container of elements"
		   });
		addAnnotation
		  (getContainer_Elements(),
		   source,
		   new String[] {
			   "documentation", "Container elements"
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
			   "documentation", ""
		   });
		addAnnotation
		  (getLabel_Color(),
		   source,
		   new String[] {
			   "documentation", ""
		   });
		addAnnotation
		  (getLabel_Id(),
		   source,
		   new String[] {
			   "documentation", ""
		   });
		addAnnotation
		  (getLabel_Text(),
		   source,
		   new String[] {
			   "documentation", ""
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
			   "documentation", ""
		   });
		addAnnotation
		  (getLabel_Outline(),
		   source,
		   new String[] {
			   "documentation", ""
		   });
		addAnnotation
		  (getLabel_Notification(),
		   source,
		   new String[] {
			   "documentation", ""
		   });
		addAnnotation
		  (getLabel_Appearance(),
		   source,
		   new String[] {
			   "documentation", "Can be used for cusomization of label appearance in addition to label appearance attributes - color and outline."
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
			   "documentation", "A collection of mappings of action logical names to target actions. Aliases are inherited by action children."
		   });
		addAnnotation
		  (actionCategoryEClass,
		   source,
		   new String[] {
			   "documentation", ""
		   });
		addAnnotation
		  (actionBaseEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for concrete action classes - Action and Partition. These sub-classes are semantically equivalent and differ only in diagram representation - Action is represented by a node, Partition by a container node.\nAction can be a child of another action or of an action category. It may contain content and action elements - abstract actions and action categories. It may also contain action aliases - logical names of actions referenced by this action\'s content."
		   });
		addAnnotation
		  (getActionBase_Role(),
		   source,
		   new String[] {
			   "documentation", "Actions may play different roles in their container."
		   });
		addAnnotation
		  (getActionBase_SectionColumns(),
		   source,
		   new String[] {
			   "documentation", "Applicable to section style \"Card\". Defines how many columns shall be in a row of section cards."
		   });
		addAnnotation
		  (getActionBase_Confirmation(),
		   source,
		   new String[] {
			   "documentation", "Confirmation to display in a confirmation dialog before action execution to give the user an opportunity to cancel the action. E.g. confirmation of deletion."
		   });
		addAnnotation
		  (getActionBase_Disabled(),
		   source,
		   new String[] {
			   "documentation", "If true, then action is displayed as disabled. "
		   });
		addAnnotation
		  (getActionBase_FloatRight(),
		   source,
		   new String[] {
			   "documentation", "This attribute is applicable for actions displayed in a navbar. If true, then action is displayed on the right."
		   });
		addAnnotation
		  (getActionBase_Embedded(),
		   source,
		   new String[] {
			   "documentation", "If true, then action content is displayed instead of action label. For example, a login form action or a search action can be embedded into a navbar."
		   });
		addAnnotation
		  (getActionBase_Content(),
		   source,
		   new String[] {
			   "documentation", "Action content generator(s)."
		   });
		addAnnotation
		  (actionMappingEClass,
		   source,
		   new String[] {
			   "documentation", "Action mapping provides a logical name (alias) for another (abstract) action for convenient linking/referencing from action\'s content."
		   });
		addAnnotation
		  (getActionMapping_Alias(),
		   source,
		   new String[] {
			   "documentation", "Logical name of the target action."
		   });
		addAnnotation
		  (actionLinkEClass,
		   source,
		   new String[] {
			   "documentation", "A link to an external action specification in JSON or YAML format."
		   });
		addAnnotation
		  (getActionLink_Ref(),
		   source,
		   new String[] {
			   "documentation", "Action specification URL relsolved relative to the model location."
		   });
		addAnnotation
		  (actionReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "Action reference allows to \"mount\" an existing action as a child of another action."
		   });
		addAnnotation
		  (getActionReference_Action(),
		   source,
		   new String[] {
			   "documentation", "Referenced/mounted action."
		   });
		addAnnotation
		  (actionRoleEEnum,
		   source,
		   new String[] {
			   "documentation", "Actions may play different roles in their container."
		   });
		addAnnotation
		  (actionRoleEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Navigation actions are displayed as action children in the navigation panel. For the root action the first navigation child is the principal action and the rest is displayed in the right-top navs in the header."
		   });
		addAnnotation
		  (actionRoleEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Context actions are displayed in the navbar for the principal action, in the context menu in jsTree, and in the right navs in the content panel."
		   });
		addAnnotation
		  (actionRoleEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Section actions are displayed as content sections - paragraphs, tabs, etc. depending on sections style."
		   });
		addAnnotation
		  (actionRoleEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Actions to display during viewing. Applicable to property and property source actions. "
		   });
		addAnnotation
		  (actionRoleEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Actions to display during editing. Applicable to property and property source actions. "
		   });
		addAnnotation
		  (sectionStyleEEnum,
		   source,
		   new String[] {
			   "documentation", "Defines how section child actions shall be displayed."
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
			   "documentation", "Bootstrap container application is a page builder which structures a page into 5 areas:\n\n* Header\n* Navigation bar\n* Navigation pane\n* Content pane\n* Footer\n\nPage structuring is performed with Bootstrap container, rows and columns. \n\nAppearance of the top-level container can be customized using Appearance child element. Appearance of the row containing navigation and content panels can be customized using ``children/content-row`` attributes section.\n\nE.g. \n\n```yaml\nchildren:\n    content-row:\n        style:\n            min-height: 15rem\n```\n\n[Overview video](https://www.youtube.com/watch?v=W-hGbnM9wNM) in Russian.\n\n\n"
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
		  (getBootstrapContainerApplication_Builders(),
		   source,
		   new String[] {
			   "documentation", "Builders operate on an instance of ``org.nasdanika.html.app.impl.BootstrapContainerRouterApplication``\npassed to them by this model element during generation."
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
		  (bootstrapContainerApplicationBuilderEClass,
		   source,
		   new String[] {
			   "documentation", "Contributes to building BootstrapContainerApplication"
		   });
		addAnnotation
		  (getBootstrapContainerApplicationBuilder__CreateConsumer__Context(),
		   source,
		   new String[] {
			   "documentation", "Wraps element into a Consumer to be used as an application builder."
		   });
	}

} //AppPackageImpl
