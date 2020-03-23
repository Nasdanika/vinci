package org.nasdanika.vinci.presentation.cli;

import org.nasdanika.cli.CommandGroup;

import picocli.CommandLine.Command;

@Command(
		description = "Group of commands exposing Vinci functionality.",
		name = "vinci",
		versionProvider = VinciBundleVersionProvider.class,
		subcommands = {
				VinciGenerateCommandGroup.class
		})
public class VinciCommandGroup extends CommandGroup {

}