package org.nasdanika.vinci.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.nasdanika.vinci.tests.bootstrap.BootstrapTests;

@RunWith(Suite.class)
@SuiteClasses({
	GenerateModelDocumentation.class,
	BootstrapTests.class
})
public class VinciTests {
	
}
