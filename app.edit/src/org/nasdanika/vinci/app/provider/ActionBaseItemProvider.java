/**
 */
package org.nasdanika.vinci.app.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.emf.edit.EReferenceItemProvider;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionRole;
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
			addMarkdownContentPropertyDescriptor(object);
			addPageTemplatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Linked Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addLinkedElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Container_linkedElements_feature"),
				 AppPackage.Literals.CONTAINER__LINKED_ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_ActionBase_role_feature"),
				 AppPackage.Literals.ACTION_BASE__ROLE,
				 true,
				 false,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 enumChoices(ActionRole.class, false, ar -> ar.label)));
	}

	/**
	 * This adds a property descriptor for the Section Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSectionStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_ActionBase_sectionStyle_feature"),
				 AppPackage.Literals.ACTION_BASE__SECTION_STYLE,
				 true,
				 false,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 enumChoices(SectionStyle.class, false, ss -> ss.label)));
	}

	/**
	 * This adds a property descriptor for the Section Columns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSectionColumnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_ActionBase_sectionColumns_feature"),
				 AppPackage.Literals.ACTION_BASE__SECTION_COLUMNS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addActivatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_ActionBase_activator_feature"),
				 AppPackage.Literals.ACTION_BASE__ACTIVATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activator Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addActivatorTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_ActionBase_activatorType_feature"),
				 AppPackage.Literals.ACTION_BASE__ACTIVATOR_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Confirmation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addConfirmationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_ActionBase_confirmation_feature"),
				 AppPackage.Literals.ACTION_BASE__CONFIRMATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addDisabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_ActionBase_disabled_feature"),
				 AppPackage.Literals.ACTION_BASE__DISABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}
	
	/**
	 * This adds a property descriptor for the Markdown Content feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addMarkdownContentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_ActionBase_markdownContent_feature"),
				 AppPackage.Literals.ACTION_BASE__MARKDOWN_CONTENT,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Page Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addPageTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_ActionBase_pageTemplate_feature"),
				 AppPackage.Literals.ACTION_BASE__PAGE_TEMPLATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
			children.add(new EReferenceItemProvider(this, (EObject) object, AppPackage.Literals.CONTAINER__LINKED_ELEMENTS));
			children.add(new EReferenceItemProvider(this, (EObject) object, AppPackage.Literals.ACTION_BASE__CONTENT)); 
			children.add(new EReferenceItemProvider(this, (EObject) object, AppPackage.Literals.ABSTRACT_ACTION__ACTION_MAPPINGS)); 
			children.add(new EReferenceItemProvider(this, (EObject) object, AppPackage.Literals.ACTION_BASE__WIDGETS)); 
			children.add(new EReferenceItemProvider(this, (EObject) object, NcorePackage.Literals.CONFIGURABLE__CONFIGURATION)); 
		}
		Collection<Object> ret = new ArrayList<>(children);
		ret.addAll(super.getChildren(object));
		return ret;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			// These children are added as EReferenceItemProvider's 
//			childrenFeatures.add(AppPackage.Literals.ABSTRACT_ACTION__ACTION_MAPPINGS);
//			childrenFeatures.add(AppPackage.Literals.CONTAINER__ELEMENTS);
//			childrenFeatures.add(AppPackage.Literals.ACTION_BASE__CONTENT);
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
			case AppPackage.ACTION_BASE__LINKED_ELEMENTS:
			case AppPackage.ACTION_BASE__ROLE:
			case AppPackage.ACTION_BASE__SECTION_STYLE:
			case AppPackage.ACTION_BASE__SECTION_COLUMNS:
			case AppPackage.ACTION_BASE__ACTIVATOR:
			case AppPackage.ACTION_BASE__ACTIVATOR_TYPE:
			case AppPackage.ACTION_BASE__CONFIRMATION:
			case AppPackage.ACTION_BASE__DISABLED:
			case AppPackage.ACTION_BASE__MARKDOWN_CONTENT:
			case AppPackage.ACTION_BASE__PAGE_TEMPLATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AppPackage.ACTION_BASE__CONFIGURATION:
			case AppPackage.ACTION_BASE__ACTION_MAPPINGS:
			case AppPackage.ACTION_BASE__ELEMENTS:
			case AppPackage.ACTION_BASE__CONTENT:
			case AppPackage.ACTION_BASE__WIDGETS:
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
		
		// --- Configuration ---		
		for (EObject expr: org.nasdanika.ncore.util.Activator.NAMED_EXPRESSIONS_PALETTE.getElements()) {
			newChildDescriptors.add(createChildParameter(NcorePackage.Literals.CONFIGURABLE__CONFIGURATION, expr));						
		}		
				
		// --- Content ---
		for (EObject expr: org.nasdanika.ncore.util.Activator.EXPRESSIONS_PALETTE.getElements()) {
			newChildDescriptors.add(createChildParameter(AppPackage.Literals.ACTION_BASE__CONTENT, expr));						
		}
		for (EObject expr: org.nasdanika.vinci.html.util.Activator.HTML_CONTENT_PALETTE.getElements()) {
			newChildDescriptors.add(createChildParameter(AppPackage.Literals.ACTION_BASE__CONTENT, expr));						
		}

		// --- Mappings ---		
		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ABSTRACT_ACTION__ACTION_MAPPINGS,
				 AppFactory.eINSTANCE.createActionMapping()));

		// --- Elements ---		
		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 AppFactory.eINSTANCE.createActionCategory()));

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
		
		// --- Widgets ---

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.ACTION_BASE__WIDGETS,
				 AppFactory.eINSTANCE.createWidget()));
		
	}
	
	/**
	 * Used to filter reference candidates
	 */
	@Override
	public boolean accept(EObject source, EReference eReference, EObject target, boolean direct) {
		if (eReference == AppPackage.Literals.ACTION_BASE__CONTENT) {
			return org.nasdanika.ncore.util.Activator.EXPRESSIONS_PALETTE.accept(source, eReference, target, direct) || org.nasdanika.vinci.html.util.Activator.HTML_CONTENT_PALETTE.accept(source, eReference, target, direct);
		}		
		return super.accept(source, eReference, target, direct);
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		return super.getCreateChildText(owner, feature, child, selection);
	}
	
}
