package org.nasdanika.vinci.tests.app;

import org.junit.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.vinci.tests.TestsBase;

/**
 * @author Pavel
 *
 */
public class BootstrapContainerApplicationTests extends TestsBase {
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testBootstrapContainerApplication() throws Exception {
		execute("app/bootstrap-container-application").writeFile("index.html", new PrintStreamProgressMonitor()); 		
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testBootstrapContainerActionApplication() throws Exception {
		execute("app/bootstrap-container-action-application").writeFile("index.html", new PrintStreamProgressMonitor());
		String[] ids = {
			"24c99d24-3e80-4da9-815d-6d46b77e39ea", // Savings
			"b6b8ce55-9330-4070-b5c0-5d8b45cdf23c"  // Credit card
		};
		for (String id: ids) {
			execute("app/bootstrap-container-action-application", Context.singleton("active-action", id)).writeFile(id+".html", new PrintStreamProgressMonitor());
		}
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testBankOfNasdanika() throws Exception {
		execute("app/bank-of-nasdanika").writeFile("index.html", new PrintStreamProgressMonitor()); 		
		
		String[] ids = {
				"2dd49b89-b498-461b-8bf8-01c2c1e81476", // Savings
				"b24142d2-b17a-4357-86ae-9717644db759"  // Credit card
			};
			for (String id: ids) {
				execute("app/bank-of-nasdanika", Context.singleton("active-action", id)).writeFile(id+".html", new PrintStreamProgressMonitor());
			}
	}
		
	/**
	 * @throws Exception
	 */
	@Test
	public void testBankOfNasdanikaAdvanced() throws Exception {
		String path = "app/bank-of-nasdanika-advanced";
		execute(path).writeFile("index.html", new PrintStreamProgressMonitor()); 		
		
		String[] ids = {
				"2dd49b89-b498-461b-8bf8-01c2c1e81476", // Savings
				"b24142d2-b17a-4357-86ae-9717644db759"  // Credit card
			};
			for (String id: ids) {
				execute(path, Context.singleton("active-action", id)).writeFile(id+".html", new PrintStreamProgressMonitor());
			}
	}
		
}
