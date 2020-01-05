/**
 */
package org.nasdanika.vinci.app.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Context;
import org.nasdanika.common.ElementIdentityMapCompoundSupplier;
import org.nasdanika.common.ListCompoundSupplier;
import org.nasdanika.common.MapCompoundSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reference;
import org.nasdanika.common.StringMapCompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.HTMLElement;
import org.nasdanika.html.HTMLPage;
import org.nasdanika.html.app.ApplicationBuilder;
import org.nasdanika.html.app.Decorator;
import org.nasdanika.html.app.DecoratorProvider;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapElement;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Breakpoint;
import org.nasdanika.html.bootstrap.Size;
import org.nasdanika.ncore.Entry;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.BootstrapContainerApplication;
import org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder;
import org.nasdanika.vinci.app.BootstrapContainerApplicationPanel;
import org.nasdanika.vinci.app.BootstrapContainerApplicationSection;
import org.nasdanika.vinci.bootstrap.Appearance;
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
 *   <li>{@link org.nasdanika.vinci.app.impl.BootstrapContainerApplicationImpl#getBuilders <em>Builders</em>}</li>
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
	public BootstrapContainerApplicationPanel getNavigationPanel() {
		return (BootstrapContainerApplicationPanel)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigationPanel(BootstrapContainerApplicationPanel newNavigationPanel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newNavigationPanel, AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNavigationPanel(BootstrapContainerApplicationPanel newNavigationPanel) {
		eDynamicSet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__NAVIGATION_PANEL, newNavigationPanel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BootstrapContainerApplicationPanel getContentPanel() {
		return (BootstrapContainerApplicationPanel)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentPanel(BootstrapContainerApplicationPanel newContentPanel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newContentPanel, AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentPanel(BootstrapContainerApplicationPanel newContentPanel) {
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<BootstrapContainerApplicationBuilder> getBuilders() {
		return (EList<BootstrapContainerApplicationBuilder>)eDynamicGet(AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS, AppPackage.Literals.BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS, true, true);
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS:
				return ((InternalEList<?>)getBuilders()).basicRemove(otherEnd, msgs);
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS:
				return getBuilders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
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
				setNavigationPanel((BootstrapContainerApplicationPanel)newValue);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL:
				setContentPanel((BootstrapContainerApplicationPanel)newValue);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER:
				setFooter((BootstrapContainerApplicationSection)newValue);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS:
				getBuilders().clear();
				getBuilders().addAll((Collection<? extends BootstrapContainerApplicationBuilder>)newValue);
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
				setNavigationPanel((BootstrapContainerApplicationPanel)null);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL:
				setContentPanel((BootstrapContainerApplicationPanel)null);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__FOOTER:
				setFooter((BootstrapContainerApplicationSection)null);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS:
				getBuilders().clear();
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
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__BUILDERS:
				return !getBuilders().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	private enum Section {
		Container,
		Header,
		NavigationBar,
		NavigationPanel,
		ContentPanel,
		Footer
	}
	
	static Supplier<Decorator> getChildDecorator(org.nasdanika.vinci.bootstrap.BootstrapElement bootstrapElement, Context context, String name) throws Exception {
		Appearance appearance = bootstrapElement.getAppearance();
		if (appearance == null) {
			return null;
		}
		for (Entry<?> attr: appearance.getAttributes()) {
			if (attr.isEnabled() && "children".equals(attr.getName()) && attr instanceof org.nasdanika.ncore.Object) {	
				for (Entry<?> childAttribute: ((org.nasdanika.ncore.Object) attr).getEntries()) {
					if (childAttribute.isEnabled() && name.equals(childAttribute.getName()) && childAttribute instanceof org.nasdanika.ncore.Object) {	
						return ((org.nasdanika.ncore.Object) childAttribute).create(context).then(childrenAttributes -> new Decorator() {
		
							@Override
							public void decorate(Object target, ViewGenerator viewGenerator) {
								if (target instanceof BootstrapElement) {
									target = ((BootstrapElement<?,?>) target).toHTMLElement();
								}
								if (target instanceof HTMLElement) {
									((HTMLElement<?>) target).attributes((Map<String, Object>) childrenAttributes);
								}
							}
							
						});
					}
				}
			}
		}
		return null;
	}
			
	@SuppressWarnings({ "resource", "unchecked", "rawtypes" })
	@Override
	public Supplier<ViewBuilder> create(Context context) throws Exception {				
		ElementIdentityMapCompoundSupplier<Object> resultsSupplier = new ElementIdentityMapCompoundSupplier<Object>(getTitle());
		
		Reference<Supplier<Map<String,Object>>> appearanceChildrenAttributesSupplierReference = new Reference<>();
		
		Appearance appearance = getAppearance();
		if (appearance != null) {
			for (Entry<?> attr: appearance.getAttributes()) {
				if (attr.isEnabled() && "children".equals(attr.getName()) && attr instanceof org.nasdanika.ncore.Object) {
					Supplier<Map<String, Object>> aSupplier = ((org.nasdanika.ncore.Object) attr).create(context);
					resultsSupplier.put((Supplier) aSupplier);
					appearanceChildrenAttributesSupplierReference.set(aSupplier);
					break;
				}
			}
		}		

		StringMapCompoundSupplier<Decorator> decoratorsSupplier = new StringMapCompoundSupplier<>("Decorators");		
		resultsSupplier.put((Supplier) decoratorsSupplier);
		
		MapCompoundSupplier<Section, ViewBuilder> sectionBuilderSuppliers = new MapCompoundSupplier<>(getTitle());
		resultsSupplier.put((Supplier) sectionBuilderSuppliers);

		sectionBuilderSuppliers.put(Section.Container, super.asViewBuilderSupplier(context));
		
		BootstrapContainerApplicationSection header = getHeader();
		if (header != null) {
			sectionBuilderSuppliers.put(Section.Header, header.asViewBuilderSupplier(context));
			Supplier<Decorator> titleDecorator = getChildDecorator(header, context, "title");
			if (titleDecorator != null) {
				decoratorsSupplier.put("application/header/title", titleDecorator);
			}
			Supplier<Decorator> navsDecorator = getChildDecorator(header, context, "navs");
			if (navsDecorator != null) {
				decoratorsSupplier.put("application/header/navs", navsDecorator);
			}
		}
		
		BootstrapContainerApplicationSection navBar = getNavigationBar();
		if (navBar != null) {
			sectionBuilderSuppliers.put(Section.NavigationBar, navBar.asViewBuilderSupplier(context));
		}
		
		BootstrapContainerApplicationSection navPanel = getNavigationPanel();
		if (navPanel != null) {
			sectionBuilderSuppliers.put(Section.NavigationPanel, navPanel.asViewBuilderSupplier(context));
		}
		
		BootstrapContainerApplicationSection contentPanel = getContentPanel();
		if (contentPanel != null) {
			sectionBuilderSuppliers.put(Section.ContentPanel, contentPanel.asViewBuilderSupplier(context));
		}
		
		BootstrapContainerApplicationSection footer = getFooter();
		if (footer != null) {
			sectionBuilderSuppliers.put(Section.Footer, footer.asViewBuilderSupplier(context));
		}
		
		ListCompoundSupplier<Object> buildersSupplier = new ListCompoundSupplier<>("Builders");
		resultsSupplier.put((Supplier) buildersSupplier);
		
		for (BootstrapContainerApplicationBuilder builder: getBuilders()) {
			buildersSupplier.add(builder.createApplicationBuilderSupplier(context));
		}
						
		return resultsSupplier.then(results -> new ViewBuilder() {
			
			/**
			 * Convenience method for retrieving results.
			 * @param <R>
			 * @param supplier
			 * @return
			 */
			private <R> R getResult(Supplier<R> supplier) {
				return (R) results.apply((Supplier) supplier);
			}

			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				Map<Section, ViewBuilder> sectionBuilders = getResult(sectionBuilderSuppliers);
				Map<String, Decorator> decorators = getResult(decoratorsSupplier);
				Supplier<Map<String, Object>> aSupplier = appearanceChildrenAttributesSupplierReference.get();
				Map<String, Object> appearanceChidlrenAttributes = aSupplier == null ? Collections.emptyMap() : getResult(aSupplier);
				
				// Takes a page and builds it
				
				org.nasdanika.html.app.Application app;
				if (isRouter()) {
					
					class DecoratingRoutingApplication extends org.nasdanika.html.app.impl.BootstrapContainerRouterApplication implements DecoratorProvider {
						
						DecoratingRoutingApplication() {
							super(context.get(BootstrapFactory.class, BootstrapFactory.INSTANCE),
									(HTMLPage) target,
									isFluid());
						}
						
						protected void configureContainer(org.nasdanika.html.bootstrap.Container container) {
							ViewBuilder containerBuilder = sectionBuilders.get(Section.Container);
							if (containerBuilder != null) {
								containerBuilder.build(container, viewGenerator, progressMonitor);
							}
						};								
						
						protected void configureHeader(org.nasdanika.html.bootstrap.Container.Row.Col header) {
							header.width(Breakpoint.DEFAULT, Size.NONE);
							ViewBuilder headerBuilder = sectionBuilders.get(Section.Header);
							if (headerBuilder != null) {
								headerBuilder.build(header, viewGenerator, progressMonitor);
							}
						};
						
						protected void configureNavigationBar(org.nasdanika.html.bootstrap.Container.Row.Col navigationBar) {
							navigationBar.width(Breakpoint.DEFAULT, Size.NONE);
							ViewBuilder navBarBuilder = sectionBuilders.get(Section.NavigationBar);
							if (navBarBuilder != null) {
								navBarBuilder.build(navigationBar, viewGenerator, progressMonitor);
							}
						};
						
						protected void configureContentRow(org.nasdanika.html.bootstrap.Container.Row contentRow) {
							Object contentRowAttributes = appearanceChidlrenAttributes.get("content-row");
							if (contentRowAttributes instanceof Map) {
								contentRow.toHTMLElement().attributes((Map<String,Object>) contentRowAttributes);
							}
						};
						
						protected void configureNavigationPanel(org.nasdanika.html.bootstrap.Container.Row.Col navigationPanel) {
							ViewBuilder navPanelBuilder = sectionBuilders.get(Section.NavigationPanel);
							if (navPanelBuilder != null) {
								navPanelBuilder.build(navigationPanel, viewGenerator, progressMonitor);
							}
						};
						
						protected void configureConentPanel(org.nasdanika.html.bootstrap.Container.Row.Col contentPanel) {
							ViewBuilder contentPanelBuilder = sectionBuilders.get(Section.ContentPanel);
							if (contentPanelBuilder != null) {
								contentPanelBuilder.build(contentPanel, viewGenerator, progressMonitor);
							}
						};
						
						protected void configureFooter(org.nasdanika.html.bootstrap.Container.Row.Col footer) {
							footer.width(Breakpoint.DEFAULT, Size.NONE);
							ViewBuilder footerBuilder = sectionBuilders.get(Section.Footer);
							if (footerBuilder != null) {
								footerBuilder.build(footer, viewGenerator, progressMonitor);
							}
						}

						@Override
						public Decorator getDecorator(String name) {
							return decorators.get(name);
						};								
						
					};	
					
					app = new DecoratingRoutingApplication();
				} else {
					
					class DecoratingApplication extends org.nasdanika.html.app.impl.BootstrapContainerApplication implements DecoratorProvider {
						
						public DecoratingApplication() {
							super(context.get(BootstrapFactory.class, BootstrapFactory.INSTANCE),
							(HTMLPage) target,
							isFluid());							
						}

						@Override
						public Decorator getDecorator(String name) {
							return decorators.get(name);
						}						
						
						protected void configureContainer(org.nasdanika.html.bootstrap.Container container) {
							ViewBuilder containerBuilder = sectionBuilders.get(Section.Container);
							if (containerBuilder != null) {
								containerBuilder.build(container, viewGenerator, progressMonitor);
							}
						};								
						
						protected void configureHeader(org.nasdanika.html.bootstrap.Container.Row.Col header) {
							header.width(Breakpoint.DEFAULT, Size.NONE);
							ViewBuilder headerBuilder = sectionBuilders.get(Section.Header);
							if (headerBuilder != null) {
								headerBuilder.build(header, viewGenerator, progressMonitor);
							}
						};
						
						protected void configureNavigationBar(org.nasdanika.html.bootstrap.Container.Row.Col navigationBar) {
							navigationBar.width(Breakpoint.DEFAULT, Size.NONE);
							ViewBuilder navBarBuilder = sectionBuilders.get(Section.NavigationBar);
							if (navBarBuilder != null) {
								navBarBuilder.build(navigationBar, viewGenerator, progressMonitor);
							}
						};
						
						@SuppressWarnings("unchecked")
						protected void configureContentRow(org.nasdanika.html.bootstrap.Container.Row contentRow) {
							Object contentRowAttributes = appearanceChidlrenAttributes.get("content-row");
							if (contentRowAttributes instanceof Map) {
								contentRow.toHTMLElement().attributes((Map<String,Object>) contentRowAttributes);
							}
						};
						
						protected void configureNavigationPanel(org.nasdanika.html.bootstrap.Container.Row.Col navigationPanel) {
							ViewBuilder navPanelBuilder = sectionBuilders.get(Section.NavigationPanel);
							if (navPanelBuilder != null) {
								navPanelBuilder.build(navigationPanel, viewGenerator, progressMonitor);
							}
						};
						
						protected void configureConentPanel(org.nasdanika.html.bootstrap.Container.Row.Col contentPanel) {
							ViewBuilder contentPanelBuilder = sectionBuilders.get(Section.ContentPanel);
							if (contentPanelBuilder != null) {
								contentPanelBuilder.build(contentPanel, viewGenerator, progressMonitor);
							}
						};
						
						protected void configureFooter(org.nasdanika.html.bootstrap.Container.Row.Col footer) {
							footer.width(Breakpoint.DEFAULT, Size.NONE);
							ViewBuilder footerBuilder = sectionBuilders.get(Section.Footer);
							if (footerBuilder != null) {
								footerBuilder.build(footer, viewGenerator, progressMonitor);
							}
						};								
						
					};
					app = new DecoratingApplication();
				}
				
				ApplicationBuilder contextApplicationBuilder = context.get(ApplicationBuilder.class);				
				if (contextApplicationBuilder != null) {
					contextApplicationBuilder.build(app, progressMonitor);
				}
				
				for (Object builder: getResult(buildersSupplier)) {
					((ApplicationBuilder) builder).build(app, progressMonitor);
				}
				
			}
			
		});
		
	}
	
//	@Override
//	public Consumer<Object> asConsumer(Context context) throws Exception {
//		return create(context);
//	}
	
} //BootstrapContainerApplicationImpl
