package org.nasdanika.vinci.tests.app;

import org.junit.Test;
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
	public void testBootstrapPage() throws Exception {
		execute("app/bootstrap-container-application").writeFile("index.html", new PrintStreamProgressMonitor()); 		
	}
	
}