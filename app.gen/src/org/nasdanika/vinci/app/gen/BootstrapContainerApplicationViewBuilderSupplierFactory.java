package org.nasdanika.vinci.app.gen;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

import org.nasdanika.common.Context;
import org.nasdanika.common.ElementIdentityMapCompoundSupplier;
import org.nasdanika.common.ListCompoundSupplier;
import org.nasdanika.common.MapCompoundSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reference;
import org.nasdanika.common.StringMapCompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.emf.EObjectAdaptable;
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
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.BootstrapContainerApplication;
import org.nasdanika.vinci.app.BootstrapContainerApplicationSection;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.gen.BootstrapElementViewBuilderSupplierFactory;

public class BootstrapContainerApplicationViewBuilderSupplierFactory extends BootstrapElementViewBuilderSupplierFactory<BootstrapContainerApplication> {
	
	public BootstrapContainerApplicationViewBuilderSupplierFactory(BootstrapContainerApplication target) {
		super(target);
	}
	
	private enum Section {
		Container,
		Header,
		NavigationBar,
		NavigationPanel,
		ContentPanel,
		Footer
	}
	
	/*
	 * TODO - Adapt builders to ApplicationBuilder.Supplier.Factory. Create adapter for AbstractAction
	 */
	
	static Supplier<Decorator> getChildDecorator(org.nasdanika.vinci.bootstrap.BootstrapElement bootstrapElement, Context context, String name) throws Exception {
		Appearance appearance = bootstrapElement.getAppearance();
		if (appearance == null) {
			return null;
		}
		for (Entry attr: appearance.getAttributes()) {
			if (attr.isEnabled() && "children".equals(attr.getName()) && attr instanceof org.nasdanika.ncore.Object) {	
				for (Entry childAttribute: ((org.nasdanika.ncore.Object) attr).getEntries()) {
					if (childAttribute.isEnabled() && name.equals(childAttribute.getName()) && childAttribute instanceof org.nasdanika.ncore.Object) {	
						return EObjectAdaptable.adaptToSupplierFactory((org.nasdanika.ncore.Object) childAttribute, Object.class).create(context).then(childrenAttributes -> new Decorator() {
		
							@SuppressWarnings("unchecked")
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
	public ViewBuilder.Supplier create(Context context) throws Exception {				
		ElementIdentityMapCompoundSupplier<Object> resultsSupplier = new ElementIdentityMapCompoundSupplier<Object>(target.getTitle());
		
		Reference<Supplier<Map<String,Object>>> appearanceChildrenAttributesSupplierReference = new Reference<>();
		
		Appearance appearance = target.getAppearance();
		if (appearance != null) {
			for (Entry attr: appearance.getAttributes()) {
				if (attr.isEnabled() && "children".equals(attr.getName()) && attr instanceof org.nasdanika.ncore.Object) {
					Supplier<Map<String, Object>> aSupplier = (Supplier) EObjectAdaptable.adaptToSupplierFactory((org.nasdanika.ncore.Object) attr, Map.class).create(context);
					resultsSupplier.put((Supplier) aSupplier);
					appearanceChildrenAttributesSupplierReference.set(aSupplier);
					break;
				}
			}
		}		

		StringMapCompoundSupplier<Decorator> decoratorsSupplier = new StringMapCompoundSupplier<>("Decorators");		
		resultsSupplier.put((Supplier) decoratorsSupplier);
		
		MapCompoundSupplier<Section, ViewBuilder> sectionBuilderSuppliers = new MapCompoundSupplier<>(target.getTitle());
		resultsSupplier.put((Supplier) sectionBuilderSuppliers);

		sectionBuilderSuppliers.put(Section.Container, super.create(context));
		
		BootstrapContainerApplicationSection header = target.getHeader();
		if (header != null) {
			sectionBuilderSuppliers.put(Section.Header, EObjectAdaptable.adaptTo(header, ViewBuilder.Supplier.Factory.class).create(context));
			Supplier<Decorator> titleDecorator = getChildDecorator(header, context, "title");
			if (titleDecorator != null) {
				decoratorsSupplier.put("application/header/title", titleDecorator);
			}
			Supplier<Decorator> navsDecorator = getChildDecorator(header, context, "navs");
			if (navsDecorator != null) {
				decoratorsSupplier.put("application/header/navs", navsDecorator);
			}
		}
		
		BootstrapContainerApplicationSection navBar = target.getNavigationBar();
		if (navBar != null) {
			sectionBuilderSuppliers.put(Section.NavigationBar, EObjectAdaptable.adaptTo(navBar, ViewBuilder.Supplier.Factory.class).create(context));
		}
		
		BootstrapContainerApplicationSection navPanel = target.getNavigationPanel();
		if (navPanel != null) {
			sectionBuilderSuppliers.put(Section.NavigationPanel, EObjectAdaptable.adaptTo(navPanel, ViewBuilder.Supplier.Factory.class).create(context));
		}
		
		BootstrapContainerApplicationSection contentPanel = target.getContentPanel();
		if (contentPanel != null) {
			sectionBuilderSuppliers.put(Section.ContentPanel, EObjectAdaptable.adaptTo(contentPanel, ViewBuilder.Supplier.Factory.class).create(context));
		}
		
		BootstrapContainerApplicationSection footer = target.getFooter();
		if (footer != null) {
			sectionBuilderSuppliers.put(Section.Footer, EObjectAdaptable.adaptTo(footer, ViewBuilder.Supplier.Factory.class).create(context));
		}
		
		ListCompoundSupplier<Object> buildersSupplier = new ListCompoundSupplier<>("Builders");
		resultsSupplier.put((Supplier) buildersSupplier);
		
		for (AbstractAction builder: target.getBuilders()) {			
			buildersSupplier.add((Supplier) EObjectAdaptable.adaptTo(builder, ApplicationBuilder.Supplier.Factory.class).create(context));
		}
						
		Function<Function<org.nasdanika.common.Supplier<Object>, Object>, ViewBuilder> composer = results -> new ViewBuilder() {
			
			/**
			 * Convenience method for retrieving results.
			 * @param <R>
			 * @param supplier
			 * @return
			 */
			private <R> R getResult(org.nasdanika.common.Supplier<R> supplier) {
				return (R) results.apply((org.nasdanika.common.Supplier) supplier);
			}

			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				Map<Section, ViewBuilder> sectionBuilders = getResult(sectionBuilderSuppliers);
				Map<String, Decorator> decorators = getResult(decoratorsSupplier);
				org.nasdanika.common.Supplier<Map<String, Object>> aSupplier = appearanceChildrenAttributesSupplierReference.get();
				Map<String, Object> appearanceChidlrenAttributes = aSupplier == null ? Collections.emptyMap() : getResult(aSupplier);
				
				// Takes a page and builds it
				
				org.nasdanika.html.app.Application app;
				if (BootstrapContainerApplicationViewBuilderSupplierFactory.this.target.isRouter()) {
					
					class DecoratingRoutingApplication extends org.nasdanika.html.app.impl.BootstrapContainerRouterApplication implements DecoratorProvider {
						
						DecoratingRoutingApplication() {
							super(context.get(BootstrapFactory.class, BootstrapFactory.INSTANCE),
									(HTMLPage) target,
									BootstrapContainerApplicationViewBuilderSupplierFactory.this.target.isFluid());
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
							BootstrapContainerApplicationViewBuilderSupplierFactory.this.target.isFluid());							
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
				
				ApplicationBuilder contextApplicationBuilder = context.computingContext().get(ApplicationBuilder.class);				
				if (contextApplicationBuilder != null) {
					contextApplicationBuilder.build(app, progressMonitor);
				}
				
				for (Object builder: getResult(buildersSupplier)) {
					((ApplicationBuilder) builder).build(app, progressMonitor);
				}
				
			}
			
		};
		return ViewBuilder.Supplier.from(resultsSupplier.then(composer));
		
	}
	
}
