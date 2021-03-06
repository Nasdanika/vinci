/**
 */
package org.nasdanika.vinci.app;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.Context;
import org.nasdanika.common.FilterExecutionParticipant;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.ncore.Configurable;
import org.nasdanika.ncore.ModelElement;


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
public interface AbstractAction extends ActionElement, ModelElement, Configurable {
		
	/**
	 * Binding of org.nasdanika.Supplier to {@link AbstractAction}
	 * @author Pavel
	 *
	 */
	interface Supplier extends org.nasdanika.common.Supplier<AbstractAction> {
		
		/**
		 * Wraps generic supplier in this strongly typed one.
		 * @param generic
		 */
		static Supplier from(org.nasdanika.common.Supplier<AbstractAction> generic) {
			class SupplierImpl extends FilterExecutionParticipant<org.nasdanika.common.Supplier<AbstractAction>> implements Supplier {
	
				public SupplierImpl(org.nasdanika.common.Supplier<AbstractAction> target) {
					super(target);
				}
	
				@Override
				public AbstractAction execute(ProgressMonitor progressMonitor) throws Exception {
					return target.execute(progressMonitor);
				}
				
			}
			return new SupplierImpl(generic);			
		}
		
		/**
		 * Binding of {@link SupplierFactory} to {@link Supplier}
		 * @author Pavel
		 *
		 */
		interface Factory extends SupplierFactory<AbstractAction> {
			
			@Override
			Supplier create(Context context) throws Exception;
			
			/**
			 * Wraps generic {@link SupplierFactory} in this strongly typed {@link Factory}
			 * @param generic
			 * @return
			 */
			static Factory from(SupplierFactory<AbstractAction> generic) {
				return new Factory() {
	
					@Override
					public Supplier create(Context context) throws Exception {
						return Supplier.from(generic.create(context));
					}
					
				};
			}
			
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
