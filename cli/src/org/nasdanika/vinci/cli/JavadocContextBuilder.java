package org.nasdanika.vinci.cli;

import org.nasdanika.cli.ContextBuilder;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;

/**
 * 
 * @author Pavel
 *
 */
public class JavadocContextBuilder implements ContextBuilder {


	@Override
	public Context build(Object config, Context context, ProgressMonitor progressMonitor) {
		System.out.println(config);
		return Context.EMPTY_CONTEXT;
	}

}
