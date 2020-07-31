/**
 */
package org.nasdanika.vinci.app;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.Context;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.DecoratorProvider;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionApplicationBuilder;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;
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
		interface Factory extends SupplierFactory<Supplier> {
			
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
	
	/**
	 */
	@Override
	default org.nasdanika.common.Supplier<Object> createApplicationBuilderSupplier(Context context) throws Exception {
		
		// Returns application builder
		return create(context).then(action -> {
			
			Action rootAction = (Action) action;
			List<Action> navChildren = rootAction.getNavigationChildren();
			Action principalAction = navChildren.isEmpty() ? null : navChildren.get(0); 
			List<Action> navigationPanelActions = principalAction == null ? Collections.emptyList() : principalAction.getNavigationChildren(); 

			Action activeAction = rootAction;
			String activeActionId = context.getString("active-action");
			if (!Util.isBlank(activeActionId)) {
				Action found = rootAction.findById(activeActionId);
				if (found != null) {
					activeAction = found;
				}
			}

			return new ActionApplicationBuilder(rootAction, principalAction, navigationPanelActions, activeAction) {
				
				@Override
				protected ViewGenerator createViewGenerator(
						Application application,
						java.util.function.Consumer<?> headContentConsumer,
						java.util.function.Consumer<?> bodyContentConsumer) {

					Context appBuilderContext = context;
					if (application instanceof DecoratorProvider) {
						appBuilderContext = context.compose(Context.singleton(DecoratorProvider.class, (DecoratorProvider) application));
					}
					return new ViewGeneratorImpl(appBuilderContext, headContentConsumer, bodyContentConsumer);
				}
				
			}; 				
			
		});
		
	}

} // AbstractAction
