package org.nasdanika.vinci.presentation.cli;

import org.nasdanika.cli.CommandGroup;

import picocli.CommandLine.Command;

@Command(
		description = "Vinci generation commands",
		name = "generate",
		versionProvider = VinciBundleVersionProvider.class,
		subcommands = {
				GenerateApplicationCommand.class
		})
public class VinciGenerateCommandGroup extends CommandGroup {

}
