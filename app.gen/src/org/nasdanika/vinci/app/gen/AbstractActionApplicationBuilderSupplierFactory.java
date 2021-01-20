package org.nasdanika.vinci.app.gen;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.ApplicationBuilder;
import org.nasdanika.html.app.DecoratorProvider;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionApplicationBuilder;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;
import org.nasdanika.vinci.app.AbstractAction;

/**
 * Adapts {@link AbstractAction} to {@link ApplicationBuilder.Supplier.Factory} 
 * @author Pavel
 *
 * @param <T>
 */
public class AbstractActionApplicationBuilderSupplierFactory implements ApplicationBuilder.Supplier.Factory {
	
	private AbstractAction target;

	public AbstractActionApplicationBuilderSupplierFactory(AbstractAction target) {
		this.target = target;
	}
		
	public ApplicationBuilder.Supplier create(Context context) throws Exception {
		Supplier<Action> actionSupplier = EObjectAdaptable.adaptToSupplierFactory(target, Action.class).create(context);
		
		
		// Returns application builder
		Function<Action, ApplicationBuilder> actionToBuilder = action -> {
			
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
						java.util.function.Consumer<Object> headContentConsumer,
						java.util.function.Consumer<Object> bodyContentConsumer) {

					Context appBuilderContext = context;
					if (application instanceof DecoratorProvider) {
						appBuilderContext = context.compose(Context.singleton(DecoratorProvider.class, (DecoratorProvider) application));
					}
					return new ViewGeneratorImpl(appBuilderContext, headContentConsumer, bodyContentConsumer);
				}
				
			}; 				
			
		};
		return ApplicationBuilder.Supplier.from(actionSupplier.then(actionToBuilder));
		
	}	
	
}
