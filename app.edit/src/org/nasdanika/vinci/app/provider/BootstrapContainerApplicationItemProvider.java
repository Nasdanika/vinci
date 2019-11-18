/**
 */
package org.nasdanika.vinci.app.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.vinci.app.AppFactory;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.BootstrapContainerApplication;
import org.nasdanika.vinci.bootstrap.provider.BootstrapElementItemProvider;

/**
 * This is the item provider adapter for a {@link org.nasdanika.vinci.app.BootstrapContainerApplication} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BootstrapContainerApplicationItemProvider 
	extends BootstrapElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BootstrapContainerApplicationItemProvider(AdapterFactory adapterFactory) {
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

			addFluidPropertyDescriptor(object);
			addRouterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Fluid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFluidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_BootstrapContainerApplication_fluid_feature"),
				 AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__FLUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Router feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addRouterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_BootstrapContainerApplication_router_feature"),
				 AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__ROUTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__HEADER);
			childrenFeatures.add(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR);
			childrenFeatures.add(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL);
			childrenFeatures.add(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL);
			childrenFeatures.add(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER);
			childrenFeatures.add(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS);
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
	 * This returns BootstrapContainerApplication.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BootstrapContainerApplication"));
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
		String label = ((BootstrapContainerApplication)object).getTitle();
		return label == null || label.length() == 0 ?
			getString("_UI_BootstrapContainerApplication_type") :
			getString("_UI_BootstrapContainerApplication_type") + " " + label;
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

		switch (notification.getFeatureID(BootstrapContainerApplication.class)) {
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FLUID:
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__ROUTER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__HEADER:
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR:
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL:
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL:
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER:
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS:
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
				(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__HEADER,
				 AppFactory.eINSTANCE.createBootstrapContainerApplicationSection()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR,
				 AppFactory.eINSTANCE.createBootstrapContainerApplicationSection()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL,
				 AppFactory.eINSTANCE.createBootstrapContainerApplicationSection()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL,
				 AppFactory.eINSTANCE.createBootstrapContainerApplicationSection()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER,
				 AppFactory.eINSTANCE.createBootstrapContainerApplicationSection()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS,
				 AppFactory.eINSTANCE.createActionLink()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS,
				 AppFactory.eINSTANCE.createActionReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS,
				 AppFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS,
				 AppFactory.eINSTANCE.createPartition()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		if (feature == AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__HEADER) {
			return getString("_UI_BootstrapContainerApplication_header_feature");
		}
		if (feature == AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR) {
			return getString("_UI_BootstrapContainerApplication_navigationBar_feature");
		}
		if (feature == AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL) {
			return getString("_UI_BootstrapContainerApplication_navigationPanel_feature");
		}
		if (feature == AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL) {
			return getString("_UI_BootstrapContainerApplication_contentPanel_feature");
		}
		if (feature == AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER) {
			return getString("_UI_BootstrapContainerApplication_footer_feature");
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AppEditPlugin.INSTANCE;
	}

}
