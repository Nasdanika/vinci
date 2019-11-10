package org.nasdanika.vinci.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.nasdanika.vinci.tests.app.ApplicationTests;
import org.nasdanika.vinci.tests.bootstrap.BootstrapTests;
import org.nasdanika.vinci.tests.html.HtmlTests;

@RunWith(Suite.class)
@SuiteClasses({
	GenerateModelDocumentation.class,
	HtmlTests.class,
	BootstrapTests.class,
	ApplicationTests.class
})
public class VinciTests {
	
}
