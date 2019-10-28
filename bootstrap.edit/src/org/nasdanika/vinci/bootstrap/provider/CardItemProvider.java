/**
 */
package org.nasdanika.vinci.bootstrap.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.html.TagName;
import org.nasdanika.vinci.bootstrap.BootstrapFactory;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.Card;

/**
 * This is the item provider adapter for a {@link org.nasdanika.vinci.bootstrap.Card} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CardItemProvider 
	extends DivItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BootstrapPackage.Literals.CARD__HEADER);
			childrenFeatures.add(BootstrapPackage.Literals.CARD__BODY);
			childrenFeatures.add(BootstrapPackage.Literals.CARD__FOOTER);
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
	 * This returns Card.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Card"));
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
		TagName labelValue = ((Card)object).getName();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Card_type") :
			getString("_UI_Card_type") + " " + label;
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

		switch (notification.getFeatureID(Card.class)) {
			case BootstrapPackage.CARD__HEADER:
			case BootstrapPackage.CARD__BODY:
			case BootstrapPackage.CARD__FOOTER:
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
				(BootstrapPackage.Literals.CARD__HEADER,
				 BootstrapFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__HEADER,
				 BootstrapFactory.eINSTANCE.createActionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__HEADER,
				 BootstrapFactory.eINSTANCE.createAlert()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__HEADER,
				 BootstrapFactory.eINSTANCE.createBadge()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__HEADER,
				 BootstrapFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__HEADER,
				 BootstrapFactory.eINSTANCE.createCard()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__BODY,
				 BootstrapFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__BODY,
				 BootstrapFactory.eINSTANCE.createActionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__BODY,
				 BootstrapFactory.eINSTANCE.createAlert()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__BODY,
				 BootstrapFactory.eINSTANCE.createBadge()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__BODY,
				 BootstrapFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__BODY,
				 BootstrapFactory.eINSTANCE.createCard()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__FOOTER,
				 BootstrapFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__FOOTER,
				 BootstrapFactory.eINSTANCE.createActionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__FOOTER,
				 BootstrapFactory.eINSTANCE.createAlert()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__FOOTER,
				 BootstrapFactory.eINSTANCE.createBadge()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__FOOTER,
				 BootstrapFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(BootstrapPackage.Literals.CARD__FOOTER,
				 BootstrapFactory.eINSTANCE.createCard()));
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
			childFeature == BootstrapPackage.Literals.CARD__HEADER ||
			childFeature == BootstrapPackage.Literals.CARD__BODY ||
			childFeature == BootstrapPackage.Literals.CARD__FOOTER;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
