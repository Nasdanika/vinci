/**
 */
package org.nasdanika.vinci.bootstrap.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.ncore.NcorePackage;

import org.nasdanika.vinci.bootstrap.BootstrapFactory;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.TableCell;

import org.nasdanika.vinci.html.HtmlPackage;

import org.nasdanika.vinci.html.provider.ContainerItemProvider;

/**
 * This is the item provider adapter for a {@link org.nasdanika.vinci.bootstrap.TableCell} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TableCellItemProvider extends ContainerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCellItemProvider(AdapterFactory adapterFactory) {
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

			addTitlePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addHeaderPropertyDescriptor(object);
			addColSpanPropertyDescriptor(object);
			addRowSpanPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_title_feature", "_UI_ModelElement_type"),
				 NcorePackage.Literals.MODEL_ELEMENT__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelElement_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_description_feature", "_UI_ModelElement_type"),
				 NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Header feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableCell_header_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableCell_header_feature", "_UI_TableCell_type"),
				 BootstrapPackage.Literals.TABLE_CELL__HEADER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Col Span feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColSpanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableCell_colSpan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableCell_colSpan_feature", "_UI_TableCell_type"),
				 BootstrapPackage.Literals.TABLE_CELL__COL_SPAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Row Span feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowSpanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TableCell_rowSpan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TableCell_rowSpan_feature", "_UI_TableCell_type"),
				 BootstrapPackage.Literals.TABLE_CELL__ROW_SPAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(BootstrapPackage.Literals.BOOTSTRAP_ELEMENT__APPEARANCE);
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
	 * This returns TableCell.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TableCell.png"));
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
		String label = ((TableCell)object).getTitle();
		return label == null || label.length() == 0 ? getString("_UI_TableCell_type") : label;
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

		switch (notification.getFeatureID(TableCell.class)) {
			case BootstrapPackage.TABLE_CELL__TITLE:
			case BootstrapPackage.TABLE_CELL__DESCRIPTION:
			case BootstrapPackage.TABLE_CELL__HEADER:
			case BootstrapPackage.TABLE_CELL__COL_SPAN:
			case BootstrapPackage.TABLE_CELL__ROW_SPAN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BootstrapPackage.TABLE_CELL__APPEARANCE:
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
				 BootstrapFactory.eINSTANCE.createBootstrapPage()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 BootstrapFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 BootstrapFactory.eINSTANCE.createContentTag()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 BootstrapFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 BootstrapFactory.eINSTANCE.createActionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 BootstrapFactory.eINSTANCE.createAlert()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 BootstrapFactory.eINSTANCE.createBadge()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 BootstrapFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 BootstrapFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 BootstrapFactory.eINSTANCE.createCard()));

		newChildDescriptors.add
			(createChildParameter
				(HtmlPackage.Literals.CONTAINER__CONTENT,
				 BootstrapFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.BOOTSTRAP_ELEMENT__APPEARANCE,
				 BootstrapFactory.eINSTANCE.createAppearance()));
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
