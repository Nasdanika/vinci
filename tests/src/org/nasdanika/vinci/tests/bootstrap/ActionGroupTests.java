package org.nasdanika.vinci.tests.bootstrap;

import org.junit.Test;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.vinci.tests.TestsBase;

/**
 * Tests of {@link StaticText}.
 * @author Pavel
 *
 */
public class ActionGroupTests extends TestsBase {
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testContentItems() throws Exception {
		execute("bootstrap/action-group-content").writeThemedPage("index.html", "Bootstrap action group with content items", new PrintStreamProgressMonitor()); 		
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testLinkItems() throws Exception {
		execute("bootstrap/action-group-link").writeThemedPage("index.html", "Bootstrap action group with link items", new PrintStreamProgressMonitor()); 		
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testMixedItems() throws Exception {
		execute("bootstrap/action-group-mixed").writeThemedPage("index.html", "Bootstrap action group with mixed items", new PrintStreamProgressMonitor()); 		
	}
	
}
