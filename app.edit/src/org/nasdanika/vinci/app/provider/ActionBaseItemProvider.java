/**
 */
package org.nasdanika.vinci.app.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.codegen.CodegenFactory;
import org.nasdanika.codegen.CodegenPackage;

import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.AppFactory;
import org.nasdanika.vinci.app.AppPackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.vinci.app.ActionBase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionBaseItemProvider extends LabelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBaseItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLinkedElementsPropertyDescriptor(object);
			addRolePropertyDescriptor(object);
			addSectionStylePropertyDescriptor(object);
			addSectionColumnsPropertyDescriptor(object);
			addActivatorPropertyDescriptor(object);
			addActivatorTypePropertyDescriptor(object);
			addConfirmationPropertyDescriptor(object);
			addDisabledPropertyDescriptor(object);
			addFloatRightPropertyDescriptor(object);
			addEmbeddedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Linked Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkedElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_linkedElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_linkedElements_feature", "_UI_Container_type"),
				 AppPackage.Literals.CONTAINER__LINKED_ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionBase_role_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionBase_role_feature", "_UI_ActionBase_type"),
				 AppPackage.Literals.ACTION_BASE__ROLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Section Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSectionStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionBase_sectionStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionBase_sectionStyle_feature", "_UI_ActionBase_type"),
				 AppPackage.Literals.ACTION_BASE__SECTION_STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Section Columns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSectionColumnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionBase_sectionColumns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionBase_sectionColumns_feature", "_UI_ActionBase_type"),
				 AppPackage.Literals.ACTION_BASE__SECTION_COLUMNS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionBase_activator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionBase_activator_feature", "_UI_ActionBase_type"),
				 AppPackage.Literals.ACTION_BASE__ACTIVATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activator Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivatorTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionBase_activatorType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionBase_activatorType_feature", "_UI_ActionBase_type"),
				 AppPackage.Literals.ACTION_BASE__ACTIVATOR_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Confirmation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfirmationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionBase_confirmation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionBase_confirmation_feature", "_UI_ActionBase_type"),
				 AppPackage.Literals.ACTION_BASE__CONFIRMATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionBase_disabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionBase_disabled_feature", "_UI_ActionBase_type"),
				 AppPackage.Literals.ACTION_BASE__DISABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Float Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFloatRightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionBase_floatRight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionBase_floatRight_feature", "_UI_ActionBase_type"),
				 AppPackage.Literals.ACTION_BASE__FLOAT_RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Embedded feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmbeddedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionBase_embedded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionBase_embedded_feature", "_UI_ActionBase_type"),
				 AppPackage.Literals.ACTION_BASE__EMBEDDED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AppPackage.Literals.ABSTRACT_ACTION__ACTION_MAPPINGS);
			childrenFeatures.add(AppPackage.Literals.CONTAINER__ELEMENTS);
			childrenFeatures.add(AppPackage.Literals.ACTION_BASE__CONTENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActionBase)object).getTitle();
		if (isBlank(label)) {
			label = ((ActionBase)object).getText();
		}
		return label == null || label.length() == 0 ? getString("_UI_ActionBase_type") : getString("_UI_ActionBase_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ActionBase.class)) {
			case AppPackage.ACTION_BASE__ROLE:
			case AppPackage.ACTION_BASE__SECTION_STYLE:
			case AppPackage.ACTION_BASE__SECTION_COLUMNS:
			case AppPackage.ACTION_BASE__ACTIVATOR:
			case AppPackage.ACTION_BASE__ACTIVATOR_TYPE:
			case AppPackage.ACTION_BASE__CONFIRMATION:
			case AppPackage.ACTION_BASE__DISABLED:
			case AppPackage.ACTION_BASE__FLOAT_RIGHT:
			case AppPackage.ACTION_BASE__EMBEDDED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AppPackage.ACTION_BASE__ACTION_MAPPINGS:
			case AppPackage.ACTION_BASE__ELEMENTS:
			case AppPackage.ACTION_BASE__CONTENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ABSTRACT_ACTION__ACTION_MAPPINGS,
				 AppFactory.eINSTANCE.createActionMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 AppFactory.eINSTANCE.createActionCategory()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 AppFactory.eINSTANCE.createActionMapping()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 AppFactory.eINSTANCE.createActionLink()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 AppFactory.eINSTANCE.createActionReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 AppFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 AppFactory.eINSTANCE.createPartition()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createNamedGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createBinaryFile()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createTextFile()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createStaticText()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createStaticBytes()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createFreeMarkerGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createECoreModelGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createTextToStreamConverter()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createStreamToTextConverter()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createInterpolator()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createJavaTextFilter()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createJavaStreamFilter()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createJavaTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createJavaStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createJavaResourceGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createTextContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createStreamContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createMustache()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createZipArchive()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createTextGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createTextGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createStreamGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createResourceGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createHttpCall()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createBundleResourceCollection()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createZipResourceCollection()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createPropertyDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createServiceDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 CodegenFactory.eINSTANCE.createDescriptorSet()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 AppFactory.eINSTANCE.createActionCategory()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 AppFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 AppFactory.eINSTANCE.createPartition()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createNamedGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createBinaryFile()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createTextFile()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createResourceGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createStaticText()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createStaticBytes()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createFreeMarkerGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createECoreModelGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createTextToStreamConverter()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createStreamToTextConverter()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createInterpolator()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createJavaTextFilter()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createJavaStreamFilter()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createJavaTextGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createJavaStreamGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createJavaResourceGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createTextContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createStreamContentReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createMustache()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createZipArchive()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createTextGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createTextGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createStreamGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createResourceGeneratorReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createHttpCall()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createBundleResourceCollection()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 CodegenFactory.eINSTANCE.createZipResourceCollection()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CodegenPackage.Literals.GENERATOR__NAMED_GENERATORS ||
			childFeature == AppPackage.Literals.CONTAINER__ELEMENTS ||
			childFeature == AppPackage.Literals.ACTION_BASE__CONTENT ||
			childFeature == CodegenPackage.Literals.GENERATOR__DESCRIPTORS ||
			childFeature == AppPackage.Literals.ABSTRACT_ACTION__ACTION_MAPPINGS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
