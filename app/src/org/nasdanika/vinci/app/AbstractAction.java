/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.ncore.Configurable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for different types of actions - action, action link, and action reference.
 * 
 * # Customizing action page template
 * 
 * When an HTML application is generated from an action model with "Generate action" it uses a built-in page template by default. 
 * The page template can be customized by setting ``page-template`` configuration property. 
 * The value of the property shall be a page template model URI relative to the action's resource (model file).
 * 
 * The default value of the property is ``platform:/plugin/org.nasdanika.vinci.templates/pages/default/primary.vinci``.
 * 
 * ## Built-in page templates
 * 
 * ``org.nasdanika.vinci.templates`` plugin, which is part of the Vinci distribution, provides the following page templates (organized by theme and header color):
 * 
 * * Default
 *     * Primary
 *         * ``platform:/plugin/org.nasdanika.vinci.templates/pages/default/primary.vinci``
 *         * ``platform:/plugin/org.nasdanika.vinci.templates/pages/default/primary-fluid.vinci`` - fluid container.
 * * Cerulean
 *     * Primary
 *         * ``platform:/plugin/org.nasdanika.vinci.templates/pages/cerulean/primary.vinci``
 *         * ``platform:/plugin/org.nasdanika.vinci.templates/pages/cerulean/primary-fluid.vinci`` - fluid container.
 * 
 * 
 *     
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.AbstractAction#getActionMappings <em>Action Mappings</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.app.AppPackage#getAbstractAction()
 * @model interface="true" abstract="true" superTypes="org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder org.nasdanika.vinci.app.ActionElement org.nasdanika.ncore.Configurable org.nasdanika.ncore.ISupplierFactory&lt;org.eclipse.emf.ecore.EJavaObject&gt;"
 * @generated
 */
public interface AbstractAction extends BootstrapContainerApplicationBuilder, ActionElement, Configurable, SupplierFactory<Object> {

	/**
	 * Returns the value of the '<em><b>Action Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.vinci.app.ActionMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of mappings of action logical names to target actions. Action mappings are inherited by action children.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Mappings</em>' containment reference list.
	 * @see org.nasdanika.vinci.app.AppPackage#getAbstractAction_ActionMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionMapping> getActionMappings();
} // AbstractAction
