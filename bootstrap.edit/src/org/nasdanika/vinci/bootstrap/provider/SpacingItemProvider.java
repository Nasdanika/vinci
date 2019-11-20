/**
 */
package org.nasdanika.vinci.bootstrap.provider;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EReference;
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
import org.nasdanika.html.bootstrap.Breakpoint;
import org.nasdanika.html.bootstrap.Size;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.Spacing;

/**
 * This is the item provider adapter for a {@link org.nasdanika.vinci.bootstrap.Spacing} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpacingItemProvider 
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
	public SpacingItemProvider(AdapterFactory adapterFactory) {
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

			addSizePropertyDescriptor(object);
			addBreakpointPropertyDescriptor(object);
			addTopPropertyDescriptor(object);
			addBottomPropertyDescriptor(object);
			addLeftPropertyDescriptor(object);
			addRightPropertyDescriptor(object);
			addXPropertyDescriptor(object);
			addYPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Spacing_size_feature"),
				 BootstrapPackage.Literals.SPACING__SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 Arrays.stream(Size.values()).map((Function<Size, String>) s -> s.code).collect(Collectors.toList())));
	}

	/**
	 * This adds a property descriptor for the Breakpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addBreakpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Spacing_breakpoint_feature"),
				 BootstrapPackage.Literals.SPACING__BREAKPOINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 Arrays.stream(Breakpoint.values()).map((Function<Breakpoint, String>) b -> b.label).collect(Collectors.toList())));
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
				 getString("_UI_Spacing_top_feature"),
				 BootstrapPackage.Literals.SPACING__TOP,
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
				 getString("_UI_Spacing_bottom_feature"),
				 BootstrapPackage.Literals.SPACING__BOTTOM,
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
				 getString("_UI_Spacing_left_feature"),
				 BootstrapPackage.Literals.SPACING__LEFT,
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
				 getString("_UI_Spacing_right_feature"),
				 BootstrapPackage.Literals.SPACING__RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Spacing_x_feature"),
				 BootstrapPackage.Literals.SPACING__X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Spacing_y_feature"),
				 BootstrapPackage.Literals.SPACING__Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Spacing.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Spacing.png"));
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
		Spacing spacing = (Spacing) object;
		EReference cf = spacing.eContainmentFeature();
		StringBuilder label = new StringBuilder();
		if (cf == BootstrapPackage.Literals.APPEARANCE__MARGIN) {
			label.append(getString("_UI_Appearance_margin_feature"));
		} else if (cf == BootstrapPackage.Literals.APPEARANCE__PADDING) {
			label.append(getString("_UI_Appearance_padding_feature"));
		} else {
			label.append(getString("_UI_Spacing_type"));
		}
		label.append(" ");
		
		String size = spacing.getSize();
		if (!Util.isBlank(size)) {
			label.append(size);
		}
		if (!spacing.isBottom() || !spacing.isLeft() || !spacing.isRight() || !spacing.isTop()) {
			if (spacing.isTop()) {
				label.append(" Top");
			}
			if (spacing.isBottom()) {
				label.append(" Bottom");
			}
			if (spacing.isLeft()) {
				label.append(" Left");
			}
			if (spacing.isRight()) {
				label.append(" Right");
			}
		}
		if (!spacing.isX() || !spacing.isY()) {
			if (spacing.isX()) {
				label.append(" X");
			}
			if (spacing.isY()) {
				label.append(" Y");
			}
		}
		
		return label.toString();
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

		switch (notification.getFeatureID(Spacing.class)) {
			case BootstrapPackage.SPACING__SIZE:
			case BootstrapPackage.SPACING__BREAKPOINT:
			case BootstrapPackage.SPACING__TOP:
			case BootstrapPackage.SPACING__BOTTOM:
			case BootstrapPackage.SPACING__LEFT:
			case BootstrapPackage.SPACING__RIGHT:
			case BootstrapPackage.SPACING__X:
			case BootstrapPackage.SPACING__Y:
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
