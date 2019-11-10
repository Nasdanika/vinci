/**
 */
package org.nasdanika.vinci.app.impl;

import java.util.List;
import java.util.concurrent.Executor;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.common.CompoundWork;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reference;
import org.nasdanika.common.Work;
import org.nasdanika.common.WorkFactory;
import org.nasdanika.html.HTMLPage;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.BootstrapContainerApplication;
import org.nasdanika.vinci.app.BootstrapContainerApplicationSection;
import org.nasdanika.vinci.bootstrap.impl.BootstrapElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bootstrap Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationImpl#isFluid <em>Fluid</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationImpl#isRouter <em>Router</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationImpl#getNavigationBar <em>Navigation Bar</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationImpl#getNavigationPanel <em>Navigation Panel</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationImpl#getContentPanel <em>Content Panel</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationImpl#getFooter <em>Footer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BootstrapContainerApplicationImpl extends BootstrapElementImpl implements BootstrapContainerApplication {
	/**
	 * The default value of the '{@link #isFluid() <em>Fluid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFluid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLUID_EDEFAULT = false;
	/**
	 * The default value of the '{@link #isRouter() <em>Router</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRouter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROUTER_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BootstrapContainerApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFluid() {
		return (Boolean)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FLUID, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__FLUID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFluid(boolean newFluid) {
		eDynamicSet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FLUID, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__FLUID, newFluid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRouter() {
		return (Boolean)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__ROUTER, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__ROUTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouter(boolean newRouter) {
		eDynamicSet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__ROUTER, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__ROUTER, newRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BootstrapContainerApplicationSection getHeader() {
		return (BootstrapContainerApplicationSection)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__HEADER, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(BootstrapContainerApplicationSection newHeader, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newHeader, AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__HEADER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(BootstrapContainerApplicationSection newHeader) {
		eDynamicSet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__HEADER, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BootstrapContainerApplicationSection getNavigationBar() {
		return (BootstrapContainerApplicationSection)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigationBar(BootstrapContainerApplicationSection newNavigationBar, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newNavigationBar, AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNavigationBar(BootstrapContainerApplicationSection newNavigationBar) {
		eDynamicSet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR, newNavigationBar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BootstrapContainerApplicationSection getNavigationPanel() {
		return (BootstrapContainerApplicationSection)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigationPanel(BootstrapContainerApplicationSection newNavigationPanel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newNavigationPanel, AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNavigationPanel(BootstrapContainerApplicationSection newNavigationPanel) {
		eDynamicSet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL, newNavigationPanel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BootstrapContainerApplicationSection getContentPanel() {
		return (BootstrapContainerApplicationSection)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentPanel(BootstrapContainerApplicationSection newContentPanel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newContentPanel, AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentPanel(BootstrapContainerApplicationSection newContentPanel) {
		eDynamicSet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL, newContentPanel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BootstrapContainerApplicationSection getFooter() {
		return (BootstrapContainerApplicationSection)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFooter(BootstrapContainerApplicationSection newFooter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newFooter, AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFooter(BootstrapContainerApplicationSection newFooter) {
		eDynamicSet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER, newFooter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__HEADER:
				return basicSetHeader(null, msgs);
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR:
				return basicSetNavigationBar(null, msgs);
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL:
				return basicSetNavigationPanel(null, msgs);
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL:
				return basicSetContentPanel(null, msgs);
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER:
				return basicSetFooter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FLUID:
				return isFluid();
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__ROUTER:
				return isRouter();
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__HEADER:
				return getHeader();
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR:
				return getNavigationBar();
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL:
				return getNavigationPanel();
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL:
				return getContentPanel();
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER:
				return getFooter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FLUID:
				setFluid((Boolean)newValue);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__ROUTER:
				setRouter((Boolean)newValue);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__HEADER:
				setHeader((BootstrapContainerApplicationSection)newValue);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR:
				setNavigationBar((BootstrapContainerApplicationSection)newValue);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL:
				setNavigationPanel((BootstrapContainerApplicationSection)newValue);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL:
				setContentPanel((BootstrapContainerApplicationSection)newValue);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER:
				setFooter((BootstrapContainerApplicationSection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FLUID:
				setFluid(FLUID_EDEFAULT);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__ROUTER:
				setRouter(ROUTER_EDEFAULT);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__HEADER:
				setHeader((BootstrapContainerApplicationSection)null);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR:
				setNavigationBar((BootstrapContainerApplicationSection)null);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL:
				setNavigationPanel((BootstrapContainerApplicationSection)null);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL:
				setContentPanel((BootstrapContainerApplicationSection)null);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER:
				setFooter((BootstrapContainerApplicationSection)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FLUID:
				return isFluid() != FLUID_EDEFAULT;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__ROUTER:
				return isRouter() != ROUTER_EDEFAULT;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__HEADER:
				return getHeader() != null;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_BAR:
				return getNavigationBar() != null;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL:
				return getNavigationPanel() != null;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL:
				return getContentPanel() != null;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER:
				return getFooter() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public WorkFactory<Object> create(WorkFactory<Object> arg) throws Exception {		
		/* 
		 * Steps:
		 * 
		 * 1. Arg
		 * 2. Create BootstrapContainerApp
		 * 3. Call builders on sections.
		 */

		Reference<Object> headerReference = new Reference<>();		
		BootstrapContainerApplicationSection header = getHeader();
		WorkFactory<Object> headerWorkFactory = header == null ? null : header.asBuilder().create(WorkFactory.fromSupplier(headerReference, "Header", 0));
		
		Reference<Object> navBarReference = new Reference<>();		
		BootstrapContainerApplicationSection navBar = getNavigationBar();
		WorkFactory<Object> navBarWorkFactory = navBar == null ? null : navBar.asBuilder().create(WorkFactory.fromSupplier(navBarReference, "Navigation Bar", 0));
		
		Reference<Object> navigationPanelReference = new Reference<>();		
		BootstrapContainerApplicationSection navigationPanel = getNavigationPanel();
		WorkFactory<Object> navigationPanelWorkFactory = navigationPanel == null ? null : navigationPanel.asBuilder().create(WorkFactory.fromSupplier(navigationPanelReference, "Navigation Panel", 0));
		
		Reference<Object> contentPanelReference = new Reference<>();		
		BootstrapContainerApplicationSection contentPanel = getContentPanel();
		WorkFactory<Object> contentPanelWorkFactory = contentPanel == null ? null : contentPanel.asBuilder().create(WorkFactory.fromSupplier(contentPanelReference, "Content Panel", 0));
		
		Reference<Object> footerReference = new Reference<>();		
		BootstrapContainerApplicationSection footer = getFooter();
		WorkFactory<Object> footerWorkFactory = footer == null ? null : footer.asBuilder().create(WorkFactory.fromSupplier(footerReference, "Footer", 0));		
		
		// TODO - apply super.asBuilder to container.
		// super.asBuilder();
		
		return new WorkFactory<Object>() {

			@Override
			public Work<Object> create(Context context) throws Exception {
				
				// Sequential - arg, create page, section
				CompoundWork<Object, Object> ret = new CompoundWork<Object, Object>(BootstrapContainerApplicationImpl.this.getTitle(), null) {
					
					@Override
					protected Object combine(List<Object> results, ProgressMonitor progressMonitor) throws Exception {
						return results.get(0);
					}
					
				};

				Reference<Object> pageReference = new Reference<>();
				
				Work<Object> argWork = arg.create(context).adapt(page -> {
					pageReference.set(page);
					return page;
				});
				ret.add(argWork);
				
				Work<Object> applicationWork = new Work<Object>() {

					@Override
					public Object execute(ProgressMonitor progressMonitor) throws Exception {
						if (isRouter()) {
							return new org.nasdanika.html.app.impl.BootstrapContainerRouterApplication(
									context.get(BootstrapFactory.class, BootstrapFactory.INSTANCE),
									(HTMLPage) pageReference.get(),
									isFluid()) {
								
								protected void configureContainer(org.nasdanika.html.bootstrap.Container container) {
									// TODO - own config.
								};								
								
								protected void configureHeader(org.nasdanika.html.bootstrap.Container.Row.Col header) {
									headerReference.set(header);
								};
								
								protected void configureNavigationBar(org.nasdanika.html.bootstrap.Container.Row.Col navigationBar) {
									navBarReference.set(navigationBar);
								};
								
								protected void configureContentRow(org.nasdanika.html.bootstrap.Container.Row contentRow) {
									// TODO - min height
								};
								
								protected void configureNavigationPanel(org.nasdanika.html.bootstrap.Container.Row.Col navigationPanel) {
									navigationPanelReference.set(navigationPanel);
								};
								
								protected void configureConentPanel(org.nasdanika.html.bootstrap.Container.Row.Col contentPanel) {
									contentPanelReference.set(contentPanel);
								};
								
								protected void configureFooter(org.nasdanika.html.bootstrap.Container.Row.Col footer) {
									footerReference.set(footer);
								};								
								
							};							
						}
						
						return new org.nasdanika.html.app.impl.BootstrapContainerApplication(
								context.get(BootstrapFactory.class, BootstrapFactory.INSTANCE),
								(HTMLPage) pageReference.get(),
								isFluid()) {
							
							protected void configureContainer(org.nasdanika.html.bootstrap.Container container) {
								// TODO - own config.
							};
							
							protected void configureHeader(org.nasdanika.html.bootstrap.Container.Row.Col header) {
								headerReference.set(header);
							};
							
							protected void configureNavigationBar(org.nasdanika.html.bootstrap.Container.Row.Col navigationBar) {
								navBarReference.set(navigationBar);
							};
							
							protected void configureContentRow(org.nasdanika.html.bootstrap.Container.Row contentRow) {
								// TODO - min height
							};
							
							protected void configureNavigationPanel(org.nasdanika.html.bootstrap.Container.Row.Col navigationPanel) {
								navigationPanelReference.set(navigationPanel);
							};
							
							protected void configureConentPanel(org.nasdanika.html.bootstrap.Container.Row.Col contentPanel) {
								contentPanelReference.set(contentPanel);
							};
							
							protected void configureFooter(org.nasdanika.html.bootstrap.Container.Row.Col footer) {
								footerReference.set(footer);
							};								
							
						};
					}

					@Override
					public double size() {
						return 1;
					}

					@Override
					public String getName() {
						return "Application";
					}
					
				};
				ret.add(applicationWork);
				
				// Section work can be executed in parallel.
				CompoundWork<Object, Object> sectionWork = new CompoundWork<Object, Object>("Sections", context.get(Executor.class)) {

					@Override
					protected Object combine(List<Object> results, ProgressMonitor progressMonitor) throws Exception {
						return null;
					}
					
				};
				
				if (headerWorkFactory != null) {
					sectionWork.add(headerWorkFactory.create(context));
				}
				
				if (navBarWorkFactory != null) {
					sectionWork.add(navBarWorkFactory.create(context));
				}
				
				if (navigationPanelWorkFactory != null) {
					sectionWork.add(navigationPanelWorkFactory.create(context));
				}
				
				if (contentPanelWorkFactory != null) {
					sectionWork.add(contentPanelWorkFactory.create(context));
				}
				
				if (footerWorkFactory != null) {
					sectionWork.add(footerWorkFactory.create(context));
				}
				
				ret.add(sectionWork);
				
				return ret;
			}
		};
		
	}

} //BootstrapContainerApplicationImpl
