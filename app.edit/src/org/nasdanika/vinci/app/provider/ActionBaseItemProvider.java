/**
 */
package org.nasdanika.vinci.app.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.emf.edit.EReferenceItemProvider;
import org.nasdanika.ncore.NcoreFactory;
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
	
	@Override
	public Collection<?> getChildren(Object object) {
		List<EReferenceItemProvider> children = eReferenceItemProviders.get(object);
		if (children == null) {
			children = new ArrayList<>();
			eReferenceItemProviders.put(object, children);
			children.add(new EReferenceItemProvider(this, (EObject) object, AppPackage.Literals.CONTAINER__ELEMENTS));
			children.add(new EReferenceItemProvider(this, (EObject) object, AppPackage.Literals.ABSTRACT_ACTION__ACTION_MAPPINGS)); 
			children.add(new EReferenceItemProvider(this, (EObject) object, AppPackage.Literals.ACTION_BASE__CONTENT)); 
		}
		return children;
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
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
		
		collectEReferenceChildDescriptors(object, newChildDescriptors, AppPackage.Literals.ACTION_BASE__CONTENT);

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
				 NcoreFactory.eINSTANCE.createContactMethod()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createEMail()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createPhone()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createPostalAddress()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createWebAddress()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createTypedElement()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createProvider()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createNull()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createTypedEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createProviderEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createMap()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createHttpCall()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createRestOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 NcoreFactory.eINSTANCE.createRestFunction()));

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
				 NcoreFactory.eINSTANCE.createTypedElement()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createProvider()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createNull()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createTypedEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createProviderEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createMap()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createHttpCall()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createRestOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__CONTENT,
				 NcoreFactory.eINSTANCE.createRestFunction()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
//		Object childFeature = feature;
//		Object childObject = child;
//
//		boolean qualify =
//			childFeature == AppPackage.Literals.ABSTRACT_ACTION__ACTION_MAPPINGS ||
//			childFeature == AppPackage.Literals.CONTAINER__ELEMENTS ||
//			childFeature == AppPackage.Literals.ACTION_BASE__CONTENT;
//
//		if (qualify) {
//			return getString
//				("_UI_CreateChild_text2",
//				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
//		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
