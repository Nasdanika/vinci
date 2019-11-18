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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.ncore.NcoreFactory;
import org.nasdanika.vinci.app.AppFactory;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.Category;
import org.nasdanika.vinci.bootstrap.BootstrapFactory;
import org.nasdanika.vinci.html.HtmlFactory;

/**
 * This is the item provider adapter for a {@link org.nasdanika.vinci.app.Category} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CategoryItemProvider extends LabelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(AppPackage.Literals.CONTAINER__ELEMENTS);
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
	 * This returns Category.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Category"));
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
		String label = ((Category<?>)object).getText();
		return label == null || label.length() == 0 ?
			getString("_UI_Category_type") :
			getString("_UI_Category_type") + " " + label;
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

		switch (notification.getFeatureID(Category.class)) {
			case AppPackage.CATEGORY__ELEMENTS:
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
				 AppFactory.eINSTANCE.createBootstrapContainerApplication()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 AppFactory.eINSTANCE.createBootstrapContainerApplicationSection()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createBootstrapPage()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createAppearance()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createBorder()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createSpacing()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createFloat()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createLinkActionGroupItem()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createContentActionGroupItem()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createActionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createAlert()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createBadge()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createBreadcrumbs()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createButtonGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createButtonToolbar()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createCard()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createDropdown()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createListGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createNavs()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createNavbar()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createTableRow()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createTableColumn()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createTooltip()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createInputGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createFormGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createCollapse()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createModal()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 BootstrapFactory.eINSTANCE.createAccordion()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 HtmlFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 HtmlFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 HtmlFactory.eINSTANCE.createContentTag()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.CONTAINER__ELEMENTS,
				 HtmlFactory.eINSTANCE.createPage()));

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
				 NcoreFactory.eINSTANCE.createSupplier()));

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
				 NcoreFactory.eINSTANCE.createSupplierEntry()));

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
			childFeature == AppPackage.Literals.LABEL__APPEARANCE ||
			childFeature == AppPackage.Literals.CONTAINER__ELEMENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
