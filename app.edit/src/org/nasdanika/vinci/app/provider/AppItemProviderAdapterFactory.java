/**
 */
package org.nasdanika.vinci.app.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.nasdanika.emf.EReferencePredicate;
import org.nasdanika.vinci.app.util.AppAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AppItemProviderAdapterFactory extends AppAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AppItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(EReferencePredicate.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.vinci.app.ActionCategory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionCategoryItemProvider actionCategoryItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.vinci.app.ActionCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionCategoryAdapter() {
		if (actionCategoryItemProvider == null) {
			actionCategoryItemProvider = new ActionCategoryItemProvider(this);
		}

		return actionCategoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.vinci.app.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.vinci.app.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.vinci.app.Partition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionItemProvider partitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.vinci.app.Partition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartitionAdapter() {
		if (partitionItemProvider == null) {
			partitionItemProvider = new PartitionItemProvider(this);
		}

		return partitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.vinci.app.BootstrapContainerApplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BootstrapContainerApplicationItemProvider bootstrapContainerApplicationItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.vinci.app.BootstrapContainerApplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBootstrapContainerApplicationAdapter() {
		if (bootstrapContainerApplicationItemProvider == null) {
			bootstrapContainerApplicationItemProvider = new BootstrapContainerApplicationItemProvider(this);
		}

		return bootstrapContainerApplicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.vinci.app.BootstrapContainerApplicationSection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BootstrapContainerApplicationSectionItemProvider bootstrapContainerApplicationSectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.vinci.app.BootstrapContainerApplicationSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBootstrapContainerApplicationSectionAdapter() {
		if (bootstrapContainerApplicationSectionItemProvider == null) {
			bootstrapContainerApplicationSectionItemProvider = new BootstrapContainerApplicationSectionItemProvider(this);
		}

		return bootstrapContainerApplicationSectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.vinci.app.BootstrapContainerApplicationPanel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BootstrapContainerApplicationPanelItemProvider bootstrapContainerApplicationPanelItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.vinci.app.BootstrapContainerApplicationPanel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBootstrapContainerApplicationPanelAdapter() {
		if (bootstrapContainerApplicationPanelItemProvider == null) {
			bootstrapContainerApplicationPanelItemProvider = new BootstrapContainerApplicationPanelItemProvider(this);
		}

		return bootstrapContainerApplicationPanelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.vinci.app.Widget} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetItemProvider widgetItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.vinci.app.Widget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWidgetAdapter() {
		if (widgetItemProvider == null) {
			widgetItemProvider = new WidgetItemProvider(this);
		}

		return widgetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.vinci.app.ActionMapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionMappingItemProvider actionMappingItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.vinci.app.ActionMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionMappingAdapter() {
		if (actionMappingItemProvider == null) {
			actionMappingItemProvider = new ActionMappingItemProvider(this);
		}

		return actionMappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.vinci.app.ActionLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionLinkItemProvider actionLinkItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.vinci.app.ActionLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionLinkAdapter() {
		if (actionLinkItemProvider == null) {
			actionLinkItemProvider = new ActionLinkItemProvider(this);
		}

		return actionLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.vinci.app.ActionReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionReferenceItemProvider actionReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.vinci.app.ActionReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionReferenceAdapter() {
		if (actionReferenceItemProvider == null) {
			actionReferenceItemProvider = new ActionReferenceItemProvider(this);
		}

		return actionReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.vinci.app.ActionAdapter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionAdapterItemProvider actionAdapterItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.vinci.app.ActionAdapter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapterAdapter() {
		if (actionAdapterItemProvider == null) {
			actionAdapterItemProvider = new ActionAdapterItemProvider(this);
		}

		return actionAdapterItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (actionCategoryItemProvider != null) actionCategoryItemProvider.dispose();
		if (actionMappingItemProvider != null) actionMappingItemProvider.dispose();
		if (actionLinkItemProvider != null) actionLinkItemProvider.dispose();
		if (actionReferenceItemProvider != null) actionReferenceItemProvider.dispose();
		if (actionAdapterItemProvider != null) actionAdapterItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
		if (partitionItemProvider != null) partitionItemProvider.dispose();
		if (bootstrapContainerApplicationItemProvider != null) bootstrapContainerApplicationItemProvider.dispose();
		if (bootstrapContainerApplicationSectionItemProvider != null) bootstrapContainerApplicationSectionItemProvider.dispose();
		if (bootstrapContainerApplicationPanelItemProvider != null) bootstrapContainerApplicationPanelItemProvider.dispose();
		if (widgetItemProvider != null) widgetItemProvider.dispose();
	}

}
