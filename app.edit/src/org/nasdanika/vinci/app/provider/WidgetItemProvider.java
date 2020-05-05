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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.ncore.NcoreFactory;

import org.nasdanika.ncore.provider.NamedElementItemProvider;

import org.nasdanika.vinci.app.AppFactory;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.Widget;

import org.nasdanika.vinci.bootstrap.BootstrapFactory;

import org.nasdanika.vinci.html.HtmlFactory;

/**
 * This is the item provider adapter for a {@link org.nasdanika.vinci.app.Widget} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WidgetItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(AppPackage.Literals.WIDGET__CONTENT);
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
	 * This returns Widget.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Widget"));
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
		String label = ((Widget)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Widget_type") :
			getString("_UI_Widget_type") + " " + label;
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

		switch (notification.getFeatureID(Widget.class)) {
			case AppPackage.WIDGET__CONTENT:
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
				(AppPackage.Literals.WIDGET__CONTENT,
				 AppFactory.eINSTANCE.createActionCategory()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 AppFactory.eINSTANCE.createActionLink()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 AppFactory.eINSTANCE.createActionReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 AppFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 AppFactory.eINSTANCE.createPartition()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 AppFactory.eINSTANCE.createBootstrapContainerApplication()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createBootstrapPage()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createAppearance()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createContentTag()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createLinkActionGroupItem()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createContentActionGroupItem()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createActionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createRow()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createTableSection()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createTableHeader()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createTableRow()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createTableCell()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createCard()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createAlert()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createBadge()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 BootstrapFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 HtmlFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 HtmlFactory.eINSTANCE.createContentTag()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 HtmlFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 HtmlFactory.eINSTANCE.createStylesheet()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 HtmlFactory.eINSTANCE.createStylesheetResource()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 HtmlFactory.eINSTANCE.createStylesheetReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 HtmlFactory.eINSTANCE.createScript()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 HtmlFactory.eINSTANCE.createScriptResource()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 HtmlFactory.eINSTANCE.createScriptReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createSupplierFactoryReference()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createTypedElement()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createSupplier()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createNull()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createTypedEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createSupplierEntry()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createMap()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createObject()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createHttpCall()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createRestOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createRestFunction()));

		newChildDescriptors.add
			(createChildParameter
				(AppPackage.Literals.WIDGET__CONTENT,
				 NcoreFactory.eINSTANCE.createHtml()));
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
