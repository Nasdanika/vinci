/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.vinci.bootstrap.BootstrapElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bootstrap Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bootstrap container application is a page builder which structures a page into 5 areas:
 * 
 * * Header
 * * Navigation bar
 * * Navigation pane
 * * Content pane
 * * Footer
 * 
 * Page structuring is performed with Bootstrap container, rows and columns. 
 * 
 * Appearance of the top-level container can be customized using Appearance child element. Appearance of the row containing navigation and content panels can be customized using ``children/content-row`` attributes section.
 * 
 * E.g. 
 * 
 * ```yaml
 * children:
 *     content-row:
 *         style:
 *             min-height: 15rem
 * ```
 * 
 * Also application can be customized by providing a stylesheet or script. Script can be used to implement "rules inheritance" which is not supported by CSS. 
 * Below is a sample script demonstrating the approach:
 * 
 * ```
 * $(document).ready( function() {
 *   $('.nsd-root-action').css(['.display-4']);
 * }
 * ```
 * 
 * [Overview video](https://www.youtube.com/watch?v=W-hGbnM9wNM) in Russian.
 * 
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.BootstrapContainerApplication#isFluid <em>Fluid</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.BootstrapContainerApplication#isRouter <em>Router</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getNavigationBar <em>Navigation Bar</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getNavigationPanel <em>Navigation Panel</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getContentPanel <em>Content Panel</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getBuilders <em>Builders</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.app.AppPackage#getBootstrapContainerApplication()
 * @model superTypes="org.nasdanika.vinci.bootstrap.BootstrapElement org.nasdanika.ncore.ISupplierFactory&lt;org.nasdanika.vinci.html.ViewBuilder&gt;"
 * @generated
 */
public interface BootstrapContainerApplication extends BootstrapElement, SupplierFactory<ViewBuilder> {

	/**
	 * Returns the value of the '<em><b>Fluid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true the application takes the whole width of the page.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fluid</em>' attribute.
	 * @see #setFluid(boolean)
	 * @see org.nasdanika.vinci.app.AppPackage#getBootstrapContainerApplication_Fluid()
	 * @model
	 * @generated
	 */
	boolean isFluid();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#isFluid <em>Fluid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fluid</em>' attribute.
	 * @see #isFluid()
	 * @generated
	 */
	void setFluid(boolean value);

	/**
	 * Returns the value of the '<em><b>Router</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, a Backbone router code is generated in the header, which allows to build single-page applications. Such applications typically deliver better user experience, but don't work over the file protocol, i.e. when files are opened from disk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Router</em>' attribute.
	 * @see #setRouter(boolean)
	 * @see org.nasdanika.vinci.app.AppPackage#getBootstrapContainerApplication_Router()
	 * @model
	 * @generated
	 */
	boolean isRouter();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#isRouter <em>Router</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router</em>' attribute.
	 * @see #isRouter()
	 * @generated
	 */
	void setRouter(boolean value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Application header.
	 * 
	 * The header may contribute to appearance of its content provided by application builders by specifiying ``title`` and ``navs`` keys under the ``children`` pseudo-attribute of its appearance.
	 * 
	 * The ``title`` key defines appearance of the header title - the link of the root action. The ``navs`` key defines appearance of the navigation bar build from the root's navigation 
	 * children after the first one (the principal action).
	 * 
	 * Example:
	 * 
	 * ```yaml
	 * children:
	 *     title:
	 *         class:
	 *             display: 4
	 *             text: light
	 *         style:
	 *             text-decoration: none
	 *     title:
	 *         class:
	 *             text: light
	 * ```
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(BootstrapContainerApplicationSection)
	 * @see org.nasdanika.vinci.app.AppPackage#getBootstrapContainerApplication_Header()
	 * @model containment="true"
	 * @generated
	 */
	BootstrapContainerApplicationSection getHeader();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(BootstrapContainerApplicationSection value);

	/**
	 * Returns the value of the '<em><b>Navigation Bar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Navigation bar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Navigation Bar</em>' containment reference.
	 * @see #setNavigationBar(BootstrapContainerApplicationSection)
	 * @see org.nasdanika.vinci.app.AppPackage#getBootstrapContainerApplication_NavigationBar()
	 * @model containment="true"
	 * @generated
	 */
	BootstrapContainerApplicationSection getNavigationBar();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getNavigationBar <em>Navigation Bar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Bar</em>' containment reference.
	 * @see #getNavigationBar()
	 * @generated
	 */
	void setNavigationBar(BootstrapContainerApplicationSection value);

	/**
	 * Returns the value of the '<em><b>Navigation Panel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Left navigation panel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Navigation Panel</em>' containment reference.
	 * @see #setNavigationPanel(BootstrapContainerApplicationPanel)
	 * @see org.nasdanika.vinci.app.AppPackage#getBootstrapContainerApplication_NavigationPanel()
	 * @model containment="true"
	 * @generated
	 */
	BootstrapContainerApplicationPanel getNavigationPanel();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getNavigationPanel <em>Navigation Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Panel</em>' containment reference.
	 * @see #getNavigationPanel()
	 * @generated
	 */
	void setNavigationPanel(BootstrapContainerApplicationPanel value);

	/**
	 * Returns the value of the '<em><b>Content Panel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content panel on the right of the navigation panel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Panel</em>' containment reference.
	 * @see #setContentPanel(BootstrapContainerApplicationPanel)
	 * @see org.nasdanika.vinci.app.AppPackage#getBootstrapContainerApplication_ContentPanel()
	 * @model containment="true"
	 * @generated
	 */
	BootstrapContainerApplicationPanel getContentPanel();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getContentPanel <em>Content Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Panel</em>' containment reference.
	 * @see #getContentPanel()
	 * @generated
	 */
	void setContentPanel(BootstrapContainerApplicationPanel value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Application footer.
	 * 
	 * The footer may contribute to appearance of its content provided by application builders by specifiying ``action`` key under the ``children`` pseudo-attribute of its appearance.
	 * 
	 * The ``action`` key defines appearance of the context children of the root action.
	 * 
	 * Example:
	 * 
	 * ```yaml
	 * children:
	 *     action:
	 *         class:
	 *             text: light
	 * ```
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Footer</em>' containment reference.
	 * @see #setFooter(BootstrapContainerApplicationSection)
	 * @see org.nasdanika.vinci.app.AppPackage#getBootstrapContainerApplication_Footer()
	 * @model containment="true"
	 * @generated
	 */
	BootstrapContainerApplicationSection getFooter();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getFooter <em>Footer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' containment reference.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(BootstrapContainerApplicationSection value);

	/**
	 * Returns the value of the '<em><b>Builders</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Builders operate on an instance of ``org.nasdanika.html.app.impl.BootstrapContainerApplication`` or ``org.nasdanika.html.app.impl.BootstrapContainerRouterApplication``
	 * passed to them by this model element during generation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Builders</em>' containment reference list.
	 * @see org.nasdanika.vinci.app.AppPackage#getBootstrapContainerApplication_Builders()
	 * @model containment="true"
	 * @generated
	 */
	EList<BootstrapContainerApplicationBuilder> getBuilders();
} // BootstrapContainerApplication
