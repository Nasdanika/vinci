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
			"24c99d24-3e80-4da9-815d-6d46b77e39ea"	
		};
		for (String id: ids) {
			execute("app/bootstrap-container-action-application", Context.singleton("active-action", id)).writeFile(id+".html", new PrintStreamProgressMonitor());
		}
	}
	
}
