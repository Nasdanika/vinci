/**
 */
package org.nasdanika.vinci.bootstrap.provider;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.common.Util;
import org.nasdanika.emf.edit.NasdanikaItemProviderAdapter;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.Border;

/**
 * This is the item provider adapter for a {@link org.nasdanika.vinci.bootstrap.Border} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BorderItemProvider 
	extends NasdanikaItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderItemProvider(AdapterFactory adapterFactory) {
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

			addColorPropertyDescriptor(object);
			addTopPropertyDescriptor(object);
			addBottomPropertyDescriptor(object);
			addLeftPropertyDescriptor(object);
			addRightPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Border_color_feature"),
				 BootstrapPackage.Literals.BORDER__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 Arrays.stream(Color.values()).map(Color::name).collect(Collectors.toList())));
	}

	/**
	 * This adds a property descriptor for the Top feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Border_top_feature"),
				 BootstrapPackage.Literals.BORDER__TOP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addLeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Border_left_feature"),
				 BootstrapPackage.Literals.BORDER__LEFT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addRightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Border_right_feature"),
				 BootstrapPackage.Literals.BORDER__RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bottom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addBottomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Border_bottom_feature"),
				 BootstrapPackage.Literals.BORDER__BOTTOM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Border.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Border.png"));
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
		Border border = (Border)object;
		StringBuilder label = new StringBuilder();
		String color = border.getColor();
		if (!Util.isBlank(color)) {
			label.append(color);
		}
		if (!border.isBottom() || !border.isLeft() || !border.isRight() || !border.isTop()) {
			if (border.isTop()) {
				label.append(" Top");
			}
			if (border.isBottom()) {
				label.append(" Bottom");
			}
			if (border.isLeft()) {
				label.append(" Left");
			}
			if (border.isRight()) {
				label.append(" Right");
			}
		}
		return label == null || label.length() == 0 ?
			getString("_UI_Border_type") :
			getString("_UI_Border_type") + " " + label;
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

		switch (notification.getFeatureID(Border.class)) {
			case BootstrapPackage.BORDER__COLOR:
			case BootstrapPackage.BORDER__TOP:
			case BootstrapPackage.BORDER__BOTTOM:
			case BootstrapPackage.BORDER__LEFT:
			case BootstrapPackage.BORDER__RIGHT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BootstrapEditPlugin.INSTANCE;
	}

}
