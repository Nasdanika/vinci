/**
 */
package org.nasdanika.vinci.app.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Command;
import org.nasdanika.common.CompoundConsumer;
import org.nasdanika.common.CompoundExecutionParticipant;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.Util;
import org.nasdanika.html.HTMLPage;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.BootstrapContainerApplication;
import org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder;
import org.nasdanika.vinci.app.BootstrapContainerApplicationSection;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.impl.BootstrapElementImpl;
import org.yaml.snakeyaml.Yaml;

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
				setNavigationPanel((BootstrapContainerApplicationSection)newValue);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL:
				setContentPanel((BootstrapContainerApplicationSection)newValue);
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
				setNavigationPanel((BootstrapContainerApplicationSection)null);
				return;
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION__CONTENT_PANEL:
				setContentPanel((BootstrapContainerApplicationSection)null);
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
			
	@SuppressWarnings("resource")
	@Override
	public Consumer<Object> create(Context context) throws Exception {
		
		Map<Section, Consumer<Object>> sections = new LinkedHashMap<>();

		sections.put(Section.Container, super.asConsumer(context));
		
		BootstrapContainerApplicationSection header = getHeader();
		if (header != null) {
			sections.put(Section.Header, header.asConsumer(context));
		}
		
		BootstrapContainerApplicationSection navBar = getNavigationBar();
		if (navBar != null) {
			sections.put(Section.NavigationBar, navBar.asConsumer(context));
		}
		
		BootstrapContainerApplicationSection navPanel = getNavigationPanel();
		if (navPanel != null) {
			sections.put(Section.NavigationPanel, navPanel.asConsumer(context));
		}
		
		BootstrapContainerApplicationSection contentPanel = getContentPanel();
		if (contentPanel != null) {
			sections.put(Section.ContentPanel, contentPanel.asConsumer(context));
		}
		
		BootstrapContainerApplicationSection footer = getFooter();
		if (footer != null) {
			sections.put(Section.Footer, footer.asConsumer(context));
		}
				
		class Generator extends CompoundExecutionParticipant<Consumer<Object>> implements Function<Object, Object> {

			protected Generator(String name) {
				super(name);
			}
			
			List<Command> sectionBuilders = new ArrayList<>();

			@Override
			public Object execute(Object arg, ProgressMonitor progressMonitor) throws Exception {
				progressMonitor.setWorkRemaining(size());
				
				Object app;
				if (isRouter()) {
					app = new org.nasdanika.html.app.impl.BootstrapContainerRouterApplication(
							context.get(BootstrapFactory.class, BootstrapFactory.INSTANCE),
							(HTMLPage) arg,
							isFluid()) {
						
						protected void configureContainer(org.nasdanika.html.bootstrap.Container container) {
							Consumer<Object> containerConsumer = sections.get(Section.Container);
							if (containerConsumer != null) {
								sectionBuilders.add(Supplier.from(container, "Container").then(containerConsumer));
							}
						};								
						
						protected void configureHeader(org.nasdanika.html.bootstrap.Container.Row.Col header) {
							Consumer<Object> headerConsumer = sections.get(Section.Header);
							if (headerConsumer != null) {
								sectionBuilders.add(Supplier.from(header, "Header").then(headerConsumer));
							}
						};
						
						protected void configureNavigationBar(org.nasdanika.html.bootstrap.Container.Row.Col navigationBar) {
							Consumer<Object> navBarConsumer = sections.get(Section.NavigationBar);
							if (navBarConsumer != null) {
								sectionBuilders.add(Supplier.from(navigationBar, "Navigation Bar").then(navBarConsumer));
							}
						};
						
						@SuppressWarnings("unchecked")
						protected void configureContentRow(org.nasdanika.html.bootstrap.Container.Row contentRow) {
							Appearance appearance = getAppearance();
							if (appearance != null) {
								String attributesStr = appearance.getAttributes();
								if (!Util.isBlank(attributesStr)) {
									Yaml yaml = new Yaml();
									Map<String,Object> attributes = yaml.load(attributesStr);
									Object children = attributes.get("children");
									if (children instanceof Map) {
										Object contentRowAttributes = ((Map<?,?>) children).get("content-row");
										if (contentRowAttributes instanceof Map) {
											contentRow.toHTMLElement().attributes(context.interpolate((Map<String,Object>) contentRowAttributes));
										}
									}
								}
							}
						};
						
						protected void configureNavigationPanel(org.nasdanika.html.bootstrap.Container.Row.Col navigationPanel) {
							Consumer<Object> navPanelConsumer = sections.get(Section.NavigationPanel);
							if (navPanelConsumer != null) {
								sectionBuilders.add(Supplier.from(navigationPanel, "Container").then(navPanelConsumer));
							}
						};
						
						protected void configureConentPanel(org.nasdanika.html.bootstrap.Container.Row.Col contentPanel) {
							Consumer<Object> contentPanelConsumer = sections.get(Section.ContentPanel);
							if (contentPanelConsumer != null) {
								sectionBuilders.add(Supplier.from(contentPanel, "Content Panel").then(contentPanelConsumer));
							}
						};
						
						protected void configureFooter(org.nasdanika.html.bootstrap.Container.Row.Col footer) {
							Consumer<Object> footerConsumer = sections.get(Section.Footer);
							if (footerConsumer != null) {
								sectionBuilders.add(Supplier.from(footer, "Footer").then(footerConsumer));
							}
						};								
						
					};							
				} else {				
					app = new org.nasdanika.html.app.impl.BootstrapContainerApplication(
							context.get(BootstrapFactory.class, BootstrapFactory.INSTANCE),
							(HTMLPage) arg,
							isFluid()) {
						
						
						protected void configureContainer(org.nasdanika.html.bootstrap.Container container) {
							Consumer<Object> containerConsumer = sections.get(Section.Container);
							if (containerConsumer != null) {
								sectionBuilders.add(Supplier.from(container, "Container").then(containerConsumer));
							}
						};								
						
						protected void configureHeader(org.nasdanika.html.bootstrap.Container.Row.Col header) {
							Consumer<Object> headerConsumer = sections.get(Section.Header);
							if (headerConsumer != null) {
								sectionBuilders.add(Supplier.from(header, "Header").then(headerConsumer));
							}
						};
						
						protected void configureNavigationBar(org.nasdanika.html.bootstrap.Container.Row.Col navigationBar) {
							Consumer<Object> navBarConsumer = sections.get(Section.NavigationBar);
							if (navBarConsumer != null) {
								sectionBuilders.add(Supplier.from(navigationBar, "Navigation Bar").then(navBarConsumer));
							}
						};
						
						@SuppressWarnings("unchecked")
						protected void configureContentRow(org.nasdanika.html.bootstrap.Container.Row contentRow) {
							Appearance appearance = getAppearance();
							if (appearance != null) {
								String attributesStr = appearance.getAttributes();
								if (!Util.isBlank(attributesStr)) {
									Yaml yaml = new Yaml();
									Map<String,Object> attributes = yaml.load(attributesStr);
									Object children = attributes.get("children");
									if (children instanceof Map) {
										Object contentRowAttributes = ((Map<?,?>) children).get("content-row");
										if (contentRowAttributes instanceof Map) {
											contentRow.toHTMLElement().attributes(context.interpolate((Map<String,Object>) contentRowAttributes));
										}
									}
								}
							}
						};
						
						protected void configureNavigationPanel(org.nasdanika.html.bootstrap.Container.Row.Col navigationPanel) {
							Consumer<Object> navPanelConsumer = sections.get(Section.NavigationPanel);
							if (navPanelConsumer != null) {
								sectionBuilders.add(Supplier.from(navigationPanel, "Container").then(navPanelConsumer));
							}
						};
						
						protected void configureConentPanel(org.nasdanika.html.bootstrap.Container.Row.Col contentPanel) {
							Consumer<Object> contentPanelConsumer = sections.get(Section.ContentPanel);
							if (contentPanelConsumer != null) {
								sectionBuilders.add(Supplier.from(contentPanel, "Content Panel").then(contentPanelConsumer));
							}
						};
						
						protected void configureFooter(org.nasdanika.html.bootstrap.Container.Row.Col footer) {
							Consumer<Object> footerConsumer = sections.get(Section.Footer);
							if (footerConsumer != null) {
								sectionBuilders.add(Supplier.from(footer, "Footer").then(footerConsumer));
							}
						};								
						
					};
				}
				
				for (Command sectionBuilder: sectionBuilders) {
					sectionBuilder.splitAndExecute(progressMonitor);
				}
				
				return app;
			}

			@Override
			protected List<Consumer<Object>> getElements() {
				return new ArrayList<>(sections.values());
			}
			
		}
		
		Generator generator = new Generator(getTitle());
		
		EList<BootstrapContainerApplicationBuilder> builders = getBuilders();
		if (builders.isEmpty()) {
			return generator.then(Consumer.nop());
		} 
		
		if (builders.size() == 1) {
			return generator.then(builders.get(0).createConsumer(context));
		}
		
		List<Consumer<Object>> bc = new ArrayList<>(); 
		for (BootstrapContainerApplicationBuilder b: builders) {
			bc.add(b.createConsumer(context));
		}
		return generator.then(new CompoundConsumer<Object>("Builders", bc));
	}
	
	@Override
	public Consumer<Object> asConsumer(Context context) throws Exception {
		return create(context);
	}
} //BootstrapContainerApplicationImpl
