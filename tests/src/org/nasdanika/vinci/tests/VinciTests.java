package org.nasdanika.codegen.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	BundleResourceCollectionTests.class,
	GenerateModelDocumentation.class,
	HttpCallTests.class,
	StaticTextTests.class,
	TextFileTests.class,
	TextGroupTests.class,
	ZipResourceCollectionTests.class
})
public class VinciTests {
	
}
