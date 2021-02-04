package org.nasdanika.vinci.cli;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.nasdanika.cli.ContextBuilder;
import org.nasdanika.cli.ext.ConfigurableContextBuildersMixIn;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.ModelCommand;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;

import picocli.CommandLine.Command;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.Option;

@Command(
		description = "Generates element content",
		name = "content",
		versionProvider = VinciBundleVersionProvider.class)
public class GenerateContentCommand<T extends EObject & SupplierFactory<Object>> extends ModelCommand<T> {
	
	@Option(names = {"-o", "--output"}, description = "Output file.")
	private File outputFile;	

	@Override
	protected ConsumerFactory<T> getConsumerFactory() {
		return new ConsumerFactory<T>() {

			@Override
			public Consumer<T> create(Context context) throws Exception {
				return new Consumer<T>() {

					@Override
					public double size() {
						return 1;
					}

					@Override
					public String name() {
						return "Generate content";
					}

					@Override
					public void execute(T element, ProgressMonitor progressMonitor) throws Exception {
						GenerateContentCommand.this.execute(element, context, progressMonitor);
					}
					
				};
			}
		};
	}
		
	@Mixin
	private ConfigurableContextBuildersMixIn configurableContextBuildersMixIn;	
	
	@Override
	protected Collection<ContextBuilder> getContextBuilders() {
		Collection<ContextBuilder> ret = super.getContextBuilders();
		ret.add(configurableContextBuildersMixIn);
		return ret;
	}
		
	protected void execute(T element, Context context, ProgressMonitor monitor) throws Exception {
		try (Supplier<Object> work = element.create(context)) {
			monitor.setWorkRemaining(work.size() * 2 + 1);
			org.nasdanika.common.Diagnostic diagnostic = work.splitAndDiagnose(monitor);
			if (diagnostic.getStatus() == org.nasdanika.common.Status.ERROR) {
				throw new org.nasdanika.common.DiagnosticException("Diagnostic failed", diagnostic);
			}
		
			Object content = work.splitAndExecute(monitor);
			try (ProgressMonitor wrapMonitor = monitor.split("Wrapping", 1)) {
				content = wrap(content, element, context, wrapMonitor);
			}
			
			if (outputFile == null) {
				System.out.println(content);				
			} else {
				try (BufferedInputStream bin = new BufferedInputStream(DefaultConverter.INSTANCE.convert(String.valueOf(content), InputStream.class)); BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(outputFile))) {
					int b;
					while ((b = bin.read()) != -1) {
						bout.write(b);
					}
				}
			}
		}				
	}

	/**
	 * Override to wrap result in, say Bootstrap page.
	 * @param result
	 * @return
	 */
	protected Object wrap(Object result, T element, Context context, ProgressMonitor progressMonitor) throws Exception {
		return new ViewGeneratorImpl(context, null, null).processViewPart(result, progressMonitor); 
	}
	
	/**
	 * Creates a {@link ResourceSet} with all known packages registered and with {@link XMIResourceFactoryImpl}
	 * @return
	 */
	@Override
	protected ResourceSet createEmptyResourceSet() {		
		ResourceSet resourceSet = super.createEmptyResourceSet();
		org.nasdanika.emf.ext.Activator.registerGlobalComposedFactory(resourceSet);
		return resourceSet;
	}		

}
