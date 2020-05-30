/**
 */
package org.nasdanika.vinci.bootstrap.provider;


import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
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
import org.nasdanika.vinci.bootstrap.Text;

/**
 * This is the item provider adapter for a {@link org.nasdanika.vinci.bootstrap.Text} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TextItemProvider 
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
	public TextItemProvider(AdapterFactory adapterFactory) {
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

			addAlignmentPropertyDescriptor(object);
			addColorPropertyDescriptor(object);
			addTransformPropertyDescriptor(object);
			addWeightPropertyDescriptor(object);
			addMonospacePropertyDescriptor(object);
			addItalicPropertyDescriptor(object);
			addNowrapPropertyDescriptor(object);
			addTruncatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Alignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAlignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Text_alignment_feature"),
				 BootstrapPackage.Literals.TEXT__ALIGNMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 enumChoices(org.nasdanika.html.bootstrap.Text.Alignment.class, true, a -> StringUtils.capitalize(a.name().toLowerCase()))));
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
				 getString("_UI_Text_color_feature"),
				 BootstrapPackage.Literals.TEXT__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 Color.Applicability.TEXT.colorLabels()));
	}

	/**
	 * This adds a property descriptor for the Transform feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTransformPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Text_transform_feature"),
				 BootstrapPackage.Literals.TEXT__TRANSFORM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 enumChoices(org.nasdanika.html.bootstrap.Text.Transform.class, true, t -> StringUtils.capitalize(t.name().toLowerCase()))));
	}

	/**
	 * This adds a property descriptor for the Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Text_weight_feature"),
				 BootstrapPackage.Literals.TEXT__WEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 enumChoices(org.nasdanika.html.bootstrap.Text.Weight.class, true, w -> StringUtils.capitalize(w.name().toLowerCase()))));
	}

	/**
	 * This adds a property descriptor for the Monospace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addMonospacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Text_monospace_feature"),
				 BootstrapPackage.Literals.TEXT__MONOSPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Italic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addItalicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Text_italic_feature"),
				 BootstrapPackage.Literals.TEXT__ITALIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nowrap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addNowrapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Text_nowrap_feature"),
				 BootstrapPackage.Literals.TEXT__NOWRAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Truncate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTruncatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Text_truncate_feature"),
				 BootstrapPackage.Literals.TEXT__TRUNCATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Text.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Text.png"));
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
		Text text = (Text)object;
		String label = Util.isBlank(text.getColor()) ? "" : text.getColor();

		if (!Util.isBlank(text.getAlignment())) {
			if (!Util.isBlank(label)) {
				label += " ";
			}
			label += text.getAlignment();
		}
		if (!Util.isBlank(text.getWeight())) {
			if (!Util.isBlank(label)) {
				label += " ";
			}
			label += text.getWeight();
		}
		if (!Util.isBlank(text.getTransform())) {
			if (!Util.isBlank(label)) {
				label += " ";
			}
			label += text.getTransform();
		}
		if (text.isMonospace()) {
			if (!Util.isBlank(label)) {
				label += " ";
			}
			label += "monospace";
		}
		if (text.isItalic()) {
			if (!Util.isBlank(label)) {
				label += " ";
			}
			label += "italic";
		}
		if (text.isNowrap()) {
			if (!Util.isBlank(label)) {
				label += " ";
			}
			label += "nowrap";
		}
		if (text.isTruncate()) {
			if (!Util.isBlank(label)) {
				label += " ";
			}
			label += "truncate";
		}
		return label == null || label.length() == 0 ?
			getString("_UI_Text_type") :
			getString("_UI_Text_type") + " " + label;
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

		switch (notification.getFeatureID(Text.class)) {
			case BootstrapPackage.TEXT__ALIGNMENT:
			case BootstrapPackage.TEXT__COLOR:
			case BootstrapPackage.TEXT__TRANSFORM:
			case BootstrapPackage.TEXT__WEIGHT:
			case BootstrapPackage.TEXT__MONOSPACE:
			case BootstrapPackage.TEXT__ITALIC:
			case BootstrapPackage.TEXT__NOWRAP:
			case BootstrapPackage.TEXT__TRUNCATE:
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
