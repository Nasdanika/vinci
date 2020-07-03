package org.nasdanika.vinci.cli;

import org.nasdanika.cli.CommandGroup;

import picocli.CommandLine.Command;

@Command(
		description = "Vinci documentation generation commands",
		name = "documentation",
		versionProvider = VinciBundleVersionProvider.class,
		subcommands = {
				VinciGenerateCliDocumentationCommand.class
		})
public class VinciGenerateDocumentationCommandGroup extends CommandGroup {

}
