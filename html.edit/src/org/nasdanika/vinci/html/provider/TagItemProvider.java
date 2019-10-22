/**
 */
package org.nasdanika.vinci.html.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.html.TagName;
import org.nasdanika.ncore.NcoreFactory;
import org.nasdanika.vinci.html.HtmlFactory;
import org.nasdanika.vinci.html.HtmlPackage;
import org.nasdanika.vinci.html.Tag;

/**
 * This is the item provider adapter for a {@link org.nasdanika.vinci.html.Tag} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TagItemProvider extends HtmlElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tag_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tag_name_feature", "_UI_Tag_type"),
				 HtmlPackage.Literals.TAG__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(HtmlPackage.Literals.CONTAINER__CONTENT);
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
	 * This returns Tag.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Tag"));
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
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TagName labelValue = ((Tag)object).getName();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Tag_type") :
			getString("_UI_Tag_type") + " " + label;
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

		switch (notification.getFeatureID(Tag.class)) {
			case HtmlPackage.TAG__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HtmlPackage.TAG__CONTENT:
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
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 HtmlFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createTypedElement()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createProvider()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createNull()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createTypedEntry()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createProviderEntry()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createMap()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createHttpCall()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createRestOperation()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 NcoreFactory.eINSTANCE.createRestFunction()));
	}

}
