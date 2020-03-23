package org.nasdanika.vinci.presentation.cli;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.eclipse.emf.ecore.EObject;
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

}
