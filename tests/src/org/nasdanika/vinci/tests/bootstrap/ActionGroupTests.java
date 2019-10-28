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
		execute("bootstrap/action-group-content").writeThemedPage("index.html", "Bootstrap action group", new PrintStreamProgressMonitor()); 		
	}
	
}
