package org.nasdanika.vinci.presentation.cli;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.fusesource.jansi.HtmlAnsiOutputStream;
import org.nasdanika.cli.CommandBase;
import org.nasdanika.cli.Description;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.ncore.Value;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.bootstrap.ContentTag;
import org.nasdanika.vinci.bootstrap.Table;
import org.nasdanika.vinci.components.ComponentsFactory;
import org.nasdanika.vinci.components.ListOfContents;
import org.nasdanika.vinci.components.MarkdownText;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Help;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Model.UsageMessageSpec;
import picocli.CommandLine.Option;
import picocli.CommandLine.Spec;

@Command(
		description = "Outputs usage for all registred commands to console or file as a Vinci model",
		name = "help",
		versionProvider = VinciBundleVersionProvider.class)
public class VinciHelpCommand extends CommandBase {
	
	private static final URI HELP_ACTION_TEMPLATE = URI.createPlatformPluginURI("/org.nasdanika.vinci.templates/cli-help-action.vinci", true);	
	
	@Spec
	private CommandSpec spec;
	
	@Option(names = {"-o", "--output"}, description = "Output file")
	private File output;
	
	@Option(names = {"-s", "--section"}, description = "Use section role for action commands")
	private boolean section;
	
	/**
	 * @return {@link EPackage}'s to register with the resource set for loading the model.
	 * This implementation returns all registered packages.
	 */
	protected Collection<EPackage> getEPackages() {
		Registry registry = EPackage.Registry.INSTANCE;
		return new ArrayList<String>(registry.keySet()).stream().map(nsURI -> registry.getEPackage(nsURI)).collect(Collectors.toList());
	}
	
	protected Action createActionTemplate() throws Exception {
		// Creating a resource set
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		for (EPackage ePackage: getEPackages()) {
			resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		}

		return  (Action) resourceSet.getResource(HELP_ACTION_TEMPLATE, true).getContents().get(0);
	}	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Action usage(CommandSpec commandSpec, Action template) throws IOException {		
		Action ret = EcoreUtil.copy(template);
		ret.setId(UUID.randomUUID().toString());
		
		if (section) {
			ret.setRole(ActionRole.SECTION.label);
		} else {
			CommandSpec parent = commandSpec.parent();		
			ret.setActivator((parent == null ? commandSpec.name() : parent.name() + "/" + commandSpec.name()) + ".html");
		}

		ret.setText(commandSpec.name());

		StringBuilder versionBuilder = new StringBuilder();
		for (String vs: commandSpec.version()) {
			if (versionBuilder.length() > 0) {
				versionBuilder.append("<br/>");
			}
			versionBuilder.append(vs);
		}

		((Value) ((Table) (Object) ret.getContent().get(0)).getBody().getRows().get(0).getCells().get(1).getContent().get(0)).setValue(versionBuilder.toString());
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try (HtmlAnsiOutputStream haos = new HtmlAnsiOutputStream(baos)) {
			try (PrintStream ps = new PrintStream(haos)) {
				commandSpec.commandLine().usage(ps, Help.Ansi.ON);
			}
			haos.flush();
		}
		String help = DefaultConverter.INSTANCE.convert(baos.toByteArray(), String.class);
		((Value) ((ContentTag) (Object) ret.getContent().get(1)).getContent().get(0)).setValue(help);		

		// Description 
		Object userObject = commandSpec.userObject();
		if (userObject == null) {
			ret.getContent().remove(2);
		} else {
			Class<? extends Object> clazz = userObject.getClass();
			Description description = clazz.getAnnotation(Description.class);
			if (description == null) {
				ret.getContent().remove(2);
			} else {
				String dResource = description.value();
				if (Util.isBlank(dResource)) {
					dResource = clazz.getName().substring(clazz.getName().lastIndexOf('.') + 1) + ".md";						
				}
				InputStream dStream = clazz.getResourceAsStream(dResource);
				if (dStream != null) {
					((MarkdownText) (Object) ret.getContent().get(2)).setMarkdown(DefaultConverter.INSTANCE.toString(dStream));
				}
				if (!Util.isBlank(description.icon())) {
					ret.setIcon(description.icon());
				}
				if (!Util.isBlank(description.tooltip())) {
					ret.setTooltip(description.tooltip());
				}
			}
		}
		
		// Tooltip from usage
		if (Util.isBlank(ret.getTooltip())) {
			UsageMessageSpec usageMessage = commandSpec.usageMessage();
			if (usageMessage != null && usageMessage.description() != null && usageMessage.description().length > 0) {
				ret.setTooltip(MarkdownHelper.INSTANCE.firstSentence(usageMessage.description()[0]));
			}
		}
		
		for (CommandLine subCommand: commandSpec.subcommands().values().stream().sorted((a,b) -> a.getCommandName().compareTo(b.getCommandName())).collect(Collectors.toList())) {
			ret.getElements().add(usage(subCommand.getCommandSpec(), template));
		}
		
		if (!ret.getElements().isEmpty()) {
			ListOfContents loc = ComponentsFactory.eINSTANCE.createListOfContents();
			loc.setDepth(1);
			loc.setTooltips(true);
			loc.setHeader("Subcommands");
			ret.getContent().add((SupplierFactory) loc);					
		}
		
		return ret;
	}
	
	@Override
	public Integer call() throws Exception {
		CommandSpec root = spec;
		while (root.parent() != null) {
			root = root.parent();
		}
		Resource resource = new XMLResourceImpl();
		resource.getContents().add(usage(root, createActionTemplate()));		
		if (output == null) {
			resource.save(System.out, null);
		} else {
			try (OutputStream os = new FileOutputStream(output)) {
				resource.save(os, null);
			}
		}
		return 0;
	}

}
