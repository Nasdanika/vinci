/**
 */
package org.nasdanika.vinci.app.impl;

import static org.nasdanika.vinci.app.AppPackage.CONTAINER;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.AbstractActionParent;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionCategory;
import org.nasdanika.vinci.app.ActionElement;
import org.nasdanika.vinci.app.ActionLink;
import org.nasdanika.vinci.app.ActionMapping;
import org.nasdanika.vinci.app.ActionReference;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.app.ActionSpec;
import org.nasdanika.vinci.app.ActivatorType;
import org.nasdanika.vinci.app.AppFactory;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.Category;
import org.nasdanika.vinci.app.Label;
import org.nasdanika.vinci.app.LabelSpec;
import org.nasdanika.vinci.app.MapElement;
import org.nasdanika.vinci.app.Partition;
import org.nasdanika.vinci.app.SectionStyle;

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
	private EClass mapElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractActionParentEClass = null;

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
	private EClass labelSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionSpecEClass = null;

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
	private EDataType colorEDataType = null;

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
		CodegenPackage.eINSTANCE.eClass();

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
	public EAttribute getActionLink_Description() {
		return (EAttribute)actionLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionLink_Ref() {
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
	public EAttribute getActionReference_Description() {
		return (EAttribute)actionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionReference_Action() {
		return (EReference)actionReferenceEClass.getEStructuralFeatures().get(1);
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
	public EClass getMapElement() {
		return mapElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapElement_Parent() {
		return (EReference)mapElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractActionParent() {
		return abstractActionParentEClass;
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
	public EReference getActionBase_ActionMappings() {
		return (EReference)actionBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_Role() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_SectionStyle() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_SectionColumns() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_Activator() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_ActivatorType() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_Confirmation() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_Disabled() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_FloatRight() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionBase_Embedded() {
		return (EAttribute)actionBaseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionBase_Content() {
		return (EReference)actionBaseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelSpec() {
		return labelSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionSpec() {
		return actionSpecEClass;
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
	public EDataType getColor() {
		return colorEDataType;
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
		labelSpecEClass = createEClass(LABEL_SPEC);

		actionSpecEClass = createEClass(ACTION_SPEC);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__ELEMENTS);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__COLOR);
		createEAttribute(labelEClass, LABEL__ID);
		createEAttribute(labelEClass, LABEL__TEXT);
		createEAttribute(labelEClass, LABEL__ICON);
		createEAttribute(labelEClass, LABEL__TOOLTIP);
		createEAttribute(labelEClass, LABEL__OUTLINE);
		createEAttribute(labelEClass, LABEL__NOTIFICATION);

		categoryEClass = createEClass(CATEGORY);

		mapElementEClass = createEClass(MAP_ELEMENT);
		createEReference(mapElementEClass, MAP_ELEMENT__PARENT);

		abstractActionParentEClass = createEClass(ABSTRACT_ACTION_PARENT);

		actionElementEClass = createEClass(ACTION_ELEMENT);

		abstractActionEClass = createEClass(ABSTRACT_ACTION);

		actionCategoryEClass = createEClass(ACTION_CATEGORY);

		actionBaseEClass = createEClass(ACTION_BASE);
		createEReference(actionBaseEClass, ACTION_BASE__ACTION_MAPPINGS);
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
		createEAttribute(actionLinkEClass, ACTION_LINK__DESCRIPTION);
		createEAttribute(actionLinkEClass, ACTION_LINK__REF);

		actionReferenceEClass = createEClass(ACTION_REFERENCE);
		createEAttribute(actionReferenceEClass, ACTION_REFERENCE__DESCRIPTION);
		createEReference(actionReferenceEClass, ACTION_REFERENCE__ACTION);

		actionEClass = createEClass(ACTION);

		partitionEClass = createEClass(PARTITION);

		// Create enums
		actionRoleEEnum = createEEnum(ACTION_ROLE);
		sectionStyleEEnum = createEEnum(SECTION_STYLE);
		activatorTypeEEnum = createEEnum(ACTIVATOR_TYPE);

		// Create data types
		colorEDataType = createEDataType(COLOR);
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
		CodegenPackage theCodegenPackage = (CodegenPackage)EPackage.Registry.INSTANCE.getEPackage(CodegenPackage.eNS_URI);

		// Create type parameters
		ETypeParameter containerEClass_E = addETypeParameter(containerEClass, "E");
		ETypeParameter labelEClass_T = addETypeParameter(labelEClass, "T");
		ETypeParameter categoryEClass_E = addETypeParameter(categoryEClass, "E");
		ETypeParameter mapElementEClass_P = addETypeParameter(mapElementEClass, "P");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getLabelSpec());
		labelEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		actionSpecEClass.getESuperTypes().add(this.getLabelSpec());
		g1 = createEGenericType(theCodegenPackage.getGenerator());
		EGenericType g2 = createEGenericType(labelEClass_T);
		g1.getETypeArguments().add(g2);
		labelEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLabel());
		g2 = createEGenericType(this.getLabelSpec());
		g1.getETypeArguments().add(g2);
		categoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainer());
		g2 = createEGenericType(categoryEClass_E);
		g1.getETypeArguments().add(g2);
		categoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActionElement());
		abstractActionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMapElement());
		g2 = createEGenericType(this.getAbstractActionParent());
		g1.getETypeArguments().add(g2);
		abstractActionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCategory());
		g2 = createEGenericType(this.getAbstractAction());
		g1.getETypeArguments().add(g2);
		actionCategoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMapElement());
		g2 = createEGenericType(this.getActionBase());
		g1.getETypeArguments().add(g2);
		actionCategoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getActionElement());
		actionCategoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractActionParent());
		actionCategoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLabel());
		g2 = createEGenericType(this.getActionSpec());
		g1.getETypeArguments().add(g2);
		actionBaseEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractAction());
		actionBaseEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractActionParent());
		actionBaseEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainer());
		g2 = createEGenericType(this.getActionElement());
		g1.getETypeArguments().add(g2);
		actionBaseEClass.getEGenericSuperTypes().add(g1);
		actionLinkEClass.getESuperTypes().add(this.getAbstractAction());
		actionReferenceEClass.getESuperTypes().add(this.getAbstractAction());
		actionEClass.getESuperTypes().add(this.getActionBase());
		partitionEClass.getESuperTypes().add(this.getActionBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(labelSpecEClass, LabelSpec.class, "LabelSpec", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionSpecEClass, ActionSpec.class, "ActionSpec", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerEClass, org.nasdanika.vinci.app.Container.class, "Container", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(containerEClass_E);
		initEReference(getContainer_Elements(), g1, null, "elements", null, 0, -1, org.nasdanika.vinci.app.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Color(), this.getColor(), "color", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Id(), ecorePackage.getEString(), "id", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Text(), ecorePackage.getEString(), "text", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Tooltip(), ecorePackage.getEString(), "tooltip", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Outline(), ecorePackage.getEBoolean(), "outline", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Notification(), ecorePackage.getEString(), "notification", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mapElementEClass, MapElement.class, "MapElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(mapElementEClass_P);
		initEReference(getMapElement_Parent(), g1, null, "parent", null, 0, 1, MapElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractActionParentEClass, AbstractActionParent.class, "AbstractActionParent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionElementEClass, ActionElement.class, "ActionElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractActionEClass, AbstractAction.class, "AbstractAction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionCategoryEClass, ActionCategory.class, "ActionCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionBaseEClass, ActionBase.class, "ActionBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionBase_ActionMappings(), this.getActionMapping(), null, "actionMappings", null, 0, -1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_Role(), this.getActionRole(), "role", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_SectionStyle(), this.getSectionStyle(), "sectionStyle", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_SectionColumns(), ecorePackage.getEInt(), "sectionColumns", "1", 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_Activator(), ecorePackage.getEString(), "activator", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_ActivatorType(), this.getActivatorType(), "activatorType", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_Confirmation(), ecorePackage.getEString(), "confirmation", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_Disabled(), ecorePackage.getEBoolean(), "disabled", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_FloatRight(), ecorePackage.getEBoolean(), "floatRight", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionBase_Embedded(), ecorePackage.getEBoolean(), "embedded", null, 0, 1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theCodegenPackage.getWorkFactory());
		g2 = createEGenericType(theCodegenPackage.getList());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(ecorePackage.getEString());
		g2.getETypeArguments().add(g3);
		initEReference(getActionBase_Content(), g1, null, "content", null, 0, -1, ActionBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionMappingEClass, ActionMapping.class, "ActionMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionMapping_Alias(), ecorePackage.getEString(), "alias", null, 1, 1, ActionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionMapping_Target(), this.getAbstractAction(), null, "target", null, 1, 1, ActionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionMapping_Description(), ecorePackage.getEString(), "description", null, 0, 1, ActionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionLinkEClass, ActionLink.class, "ActionLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionLink_Description(), ecorePackage.getEString(), "description", null, 0, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionLink_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, ActionLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionReferenceEClass, ActionReference.class, "ActionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionReference_Description(), ecorePackage.getEString(), "description", null, 0, 1, ActionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionReference_Action(), this.getAbstractAction(), null, "action", null, 0, 1, ActionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partitionEClass, Partition.class, "Partition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		// Initialize data types
		initEDataType(colorEDataType, Color.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AppPackageImpl
