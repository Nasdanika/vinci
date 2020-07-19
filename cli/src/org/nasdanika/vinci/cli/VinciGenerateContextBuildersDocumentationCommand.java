package org.nasdanika.vinci.cli;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.nasdanika.cli.Application;
import org.nasdanika.cli.CommandBase;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.app.AppFactory;
import org.nasdanika.vinci.components.ComponentsFactory;
import org.nasdanika.vinci.components.ListOfContents;
import org.nasdanika.vinci.components.MarkdownResource;

import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Option;
import picocli.CommandLine.Spec;

@Command(
		description = "Outputs documentation for for all registred context builders to console or file as a Vinci model",
		name = "context-builders",
		versionProvider = VinciBundleVersionProvider.class)
public class VinciGenerateContextBuildersDocumentationCommand extends CommandBase {
	
	@Spec
	private CommandSpec spec;
	
	@Option(names = {"-o", "--output"}, description = "Output file")
	private File output;
	
	@Option(names = {"-s", "--section"}, description = "Use section role for context builder actions")
	private boolean section;
	
	/**
	 * @return {@link EPackage}'s to register with the resource set for loading the model.
	 * This implementation returns all registered packages.
	 */
	protected Collection<EPackage> getEPackages() {
		Registry registry = EPackage.Registry.INSTANCE;
		return new ArrayList<String>(registry.keySet()).stream().map(nsURI -> registry.getEPackage(nsURI)).collect(Collectors.toList());
	}
	
	protected Action createAction() throws Exception {
		return AppFactory.eINSTANCE.createAction();
	}
		
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Integer call() throws Exception {
		// Context builders node with general help from context builders - markdown reference.
		
		// For all registered - bundles as categories. Sort first.
		// bundle (category) -> actions.
		Map<String, List<Action>> docActions = new TreeMap<>();
		for (IConfigurationElement ce: Platform.getExtensionRegistry().getConfigurationElementsFor(Application.CLI_EXTENSION_POINT_ID)) {
			String ceId = ce.getAttribute("id");
			if ("context-builder".equals(ce.getName()) && !Util.isBlank(ceId)) {
				String bundle = ce.getContributor().getName();
				Action builderAction = createAction();
				builderAction.setText(ceId);
				String docResource = ce.getAttribute("documentation");
				if (!Util.isBlank(docResource)) {
					MarkdownResource markdownResource = ComponentsFactory.eINSTANCE.createMarkdownResource();
					markdownResource.setLocation("platform:/plugin/" + bundle + "/" + docResource);
					markdownResource.setInterpolate(true);
					markdownResource.setStyle(true);
					builderAction.getContent().add((SupplierFactory) markdownResource);
				}
				String description = ce.getAttribute("description");
				if (!Util.isBlank(description)) {
					builderAction.setTooltip(description);
				}

				if (section) {
					builderAction.setRole(ActionRole.SECTION.label);
				} else {
					builderAction.setActivator(ceId + ".html");
				}
				
				docActions.computeIfAbsent(bundle, key -> new ArrayList<>()).add(builderAction);
			}
		}
		
		Action root = createAction();
		root.setText("Context Builders");
		root.setActivator("index.html");
		
		MarkdownResource markdownResource = ComponentsFactory.eINSTANCE.createMarkdownResource();
		markdownResource.setLocation("platform:/plugin/org.nasdanika.cli/doc/context-builders.md");
		markdownResource.setInterpolate(true);
		markdownResource.setStyle(true);
		root.getContent().add((SupplierFactory) markdownResource);
		
		ListOfContents loc = ComponentsFactory.eINSTANCE.createListOfContents();
		loc.setHeader("Registered Context Builders");
		loc.setTooltips(true);
		loc.setRole(ActionRole.NAVIGATION.label);
		root.getContent().add((SupplierFactory) loc);
		

		// TODO - list of contents
		
		for (Entry<String, List<Action>> be: docActions.entrySet()) {
			Action bundleAction = AppFactory.eINSTANCE.createAction();
			bundleAction.setText(be.getKey());
			bundleAction.setActivator(be.getKey() + "/index.html" );
			root.getElements().add(bundleAction);
			
			List<Action> al = be.getValue();
			al.sort((a,b) -> a.getText().compareTo(b.getText()));
			for (Action cba: al) {
				bundleAction.getElements().add(cba);
			}
			
			ListOfContents bloc = ComponentsFactory.eINSTANCE.createListOfContents();
			bloc.setRole(ActionRole.NAVIGATION.label);
			bloc.setTooltips(true);
			bundleAction.getContent().add((SupplierFactory) bloc);
		}				
		
		Resource resource = new XMLResourceImpl();
		resource.getContents().add(root);		
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
