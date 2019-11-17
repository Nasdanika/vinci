/**
 */
package org.nasdanika.vinci.app;

import org.nasdanika.common.ConsumerFactory;
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
 * [Overview video](https://www.youtube.com/watch?v=W-hGbnM9wNM) in Russian.
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
 * </ul>
 *
 * @see org.nasdanika.vinci.app.AppPackage#getBootstrapContainerApplication()
 * @model superTypes="org.nasdanika.vinci.bootstrap.BootstrapElement org.nasdanika.ncore.ConsumerFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;"
 * @generated
 */
public interface BootstrapContainerApplication extends BootstrapElement, ConsumerFactory<Object> {

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
	 * @return the value of the '<em>Navigation Panel</em>' containment reference.
	 * @see #setNavigationPanel(BootstrapContainerApplicationSection)
	 * @see org.nasdanika.vinci.app.AppPackage#getBootstrapContainerApplication_NavigationPanel()
	 * @model containment="true"
	 * @generated
	 */
	BootstrapContainerApplicationSection getNavigationPanel();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getNavigationPanel <em>Navigation Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Panel</em>' containment reference.
	 * @see #getNavigationPanel()
	 * @generated
	 */
	void setNavigationPanel(BootstrapContainerApplicationSection value);

	/**
	 * Returns the value of the '<em><b>Content Panel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Panel</em>' containment reference.
	 * @see #setContentPanel(BootstrapContainerApplicationSection)
	 * @see org.nasdanika.vinci.app.AppPackage#getBootstrapContainerApplication_ContentPanel()
	 * @model containment="true"
	 * @generated
	 */
	BootstrapContainerApplicationSection getContentPanel();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.BootstrapContainerApplication#getContentPanel <em>Content Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Panel</em>' containment reference.
	 * @see #getContentPanel()
	 * @generated
	 */
	void setContentPanel(BootstrapContainerApplicationSection value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
} // BootstrapContainerApplication
