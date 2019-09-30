/**
 */
package org.nasdanika.vinci.app.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.codegen.CodegenFactory;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.vinci.app.AppFactory;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.Category;

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
			childFeature == AppPackage.Literals.CONTAINER__ELEMENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
