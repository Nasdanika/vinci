/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.Context;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.ncore.Configurable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for different types of actions - action, action link, and action reference.
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
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractAction extends ActionElement, Configurable {
	
	/**
	 * Binding of org.nasdanika.Supplier to {@link AbstractAction}
	 * @author Pavel
	 *
	 */
	interface Supplier extends org.nasdanika.common.Supplier<AbstractAction> {
		
		/**
		 * Binding of {@link SupplierFactory} to {@link Supplier}
		 * @author Pavel
		 *
		 */
		interface Factory extends SupplierFactory<AbstractAction> {
			
			@Override
			Supplier create(Context context) throws Exception;
			
		}
		
	}			

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
