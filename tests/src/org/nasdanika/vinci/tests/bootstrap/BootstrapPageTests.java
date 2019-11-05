package org.nasdanika.vinci.tests.bootstrap;

import org.junit.Test;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.vinci.tests.TestsBase;

/**
 * Tests of {@link StaticText}.
 * @author Pavel
 *
 */
public class BootstrapPageTests extends TestsBase {
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testBootstrapPage() throws Exception {
		execute("bootstrap/bootstrap-page").writeFile("index.html", new PrintStreamProgressMonitor()); 		
	}
	
}
