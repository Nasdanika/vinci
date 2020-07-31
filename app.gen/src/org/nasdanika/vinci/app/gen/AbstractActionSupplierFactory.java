package org.nasdanika.vinci.app.gen;

import java.util.Collections;
import java.util.List;

import org.nasdanika.common.Context;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.ncore.gen.ConfigurableAdapter;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.html.Container;

import org.nasdanika.common.Util;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.DecoratorProvider;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionApplicationBuilder;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;

/**
 * Base class for adapters for subclasses of {@link Container}. 
 * @author Pavel
 *
 * @param <T>
 */
public abstract class AbstractActionSupplierFactory<T extends AbstractAction> extends ConfigurableAdapter<T> implements SupplierFactory<Object> {
	
	protected AbstractActionSupplierFactory(T target) {
		super(target);
	}
		
	protected org.nasdanika.common.Supplier<Object> createApplicationBuilderSupplier(Context context) throws Exception {
		
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
	
}
