package org.nasdanika.vinci.cli;

import org.nasdanika.cli.CommandGroup;

import picocli.CommandLine.Command;

@Command(
		description = "Vinci generation commands",
		name = "generate",
		versionProvider = VinciBundleVersionProvider.class,
		subcommands = {
				GenerateTemplatedApplicationCommand.class,
				GenerateContentCommand.class,
				GenerateBootstrapPageCommand.class,
				GenerateEclipseHelpCommand.class
		})
public class VinciGenerateCommandGroup extends CommandGroup {

}
