package org.nasdanika.vinci.design;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.ui.tools.api.views.ViewHelper;
import org.eclipse.sirius.ui.tools.internal.views.ViewHelperImpl;
import org.eclipse.sirius.ui.tools.internal.views.modelexplorer.extension.IContextMenuActionProvider;
import org.eclipse.sirius.ui.tools.internal.views.modelexplorer.extension.ISessionViewExtension;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.edit.EReferenceItemProvider;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.bootstrap.BootstrapPage;
import org.nasdanika.vinci.presentation.GenerateApplicationAction;
import org.nasdanika.vinci.presentation.GenerateBootstrapPageAction;
import org.nasdanika.vinci.presentation.GenerateContentAction;
import org.nasdanika.vinci.presentation.GenerateTemplatedApplicationAction;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
@SuppressWarnings("restriction")
public class Activator extends AbstractUIPlugin {
	// The plug-in ID
	public static final String PLUGIN_ID = "org.nasdanika.vinci.design";

	// The shared instance
	private static Activator plugin;

	private static Set<Viewpoint> viewpoints;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		viewpoints = new HashSet<Viewpoint>();
		viewpoints.addAll(ViewpointRegistry.getInstance().registerFromPlugin(PLUGIN_ID + "/description/vinci.odesign"));

		ViewHelper viewHelper = ViewHelper.INSTANCE;
		if (viewHelper instanceof ViewHelperImpl) {
			((ViewHelperImpl) viewHelper).addExtension(new ISessionViewExtension() {
				
				@Override
				public IContextMenuActionProvider getContextMenuActionProvider() {
					return new IContextMenuActionProvider() {
						
						@Override
						@SuppressWarnings({ "unchecked", "rawtypes" })
						public Iterable<IContributionItem> getContextualMenuContributionItems(ISelection selection) {
							if (!selection.isEmpty() && selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() == 1) {
								MenuManager generateMenuManager = new MenuManager("Generate");
								Object selectedElement = ((IStructuredSelection) selection).getFirstElement();
								
								if (selectedElement instanceof BootstrapPage) {
									BootstrapPage page = (BootstrapPage) selectedElement;
									if (!page.getBuilders().isEmpty()) {
										generateMenuManager.add(new GenerateApplicationAction<BootstrapPage>("Application", page, null));
									}
									generateMenuManager.add(new GenerateContentAction("Content", (EObject) selectedElement, null));		
								} else if (selectedElement instanceof AbstractAction) {
									// TODO - multiple templates, categorize.
									generateMenuManager.add(new GenerateTemplatedApplicationAction("Application", (AbstractAction) selectedElement, null));						
								} else if (selectedElement instanceof SupplierFactory) {
									generateMenuManager.add(new GenerateContentAction("Content", (EObject) selectedElement, null));			
									generateMenuManager.add(new GenerateBootstrapPageAction("Bootstrap page", (EObject) selectedElement, null));			
								}
								return Collections.singleton(generateMenuManager);
							}
							return Collections.emptySet();
						}
						
						@Override
						public Iterable<IAction> getContextMenuActions(ISelection selection) {
							return Collections.emptySet();
						}
						
					};
				}
				
				@Override
				public ITreeContentProvider getContentProvider() {
					return new ITreeContentProvider() {
						
						@Override
						public boolean hasChildren(Object element) {
							if (element instanceof EReferenceItemProvider) {
								EReferenceItemProvider erip = (EReferenceItemProvider) element;
								return erip.hasChildren(erip.getTarget());
							}
							return false;
						}
						
						@Override
						public Object getParent(Object element) {
							if (element instanceof EReferenceItemProvider) {
								EReferenceItemProvider erip = (EReferenceItemProvider) element;
								return erip.getParent(erip.getTarget());
							}
							return new Object[0];
						}
						
						@Override
						public Object[] getElements(Object element) {
							if (element instanceof EReferenceItemProvider) {
								EReferenceItemProvider erip = (EReferenceItemProvider) element;
								Collection<?> elements = erip.getElements(erip.getTarget());
								return elements == null ? null : elements.toArray();
							}
							return new Object[0];
						}
						
						@Override
						public Object[] getChildren(Object element) {
							if (element instanceof EReferenceItemProvider) {
								EReferenceItemProvider erip = (EReferenceItemProvider) element;
								Collection<?> children = erip.getChildren(erip.getTarget());
								return children == null ? null : children.toArray();
							}
							return new Object[0];
						}
					};
				}
				
			});
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		if (viewpoints != null) {
			for (final Viewpoint viewpoint : viewpoints) {
				ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
			}
			viewpoints.clear();
			viewpoints = null;
		}
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
}
