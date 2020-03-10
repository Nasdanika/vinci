package org.nasdanika.vinci.presentation.cli;

import org.nasdanika.cli.CommandBase;

import picocli.CommandLine.Command;

@Command(
		description = "Generates a web application (Web site) from a Vinci action model",
		name = "application",
		versionProvider = VinciBundleVersionProvider.class)
public class GenerateApplicationCommand extends CommandBase {

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
