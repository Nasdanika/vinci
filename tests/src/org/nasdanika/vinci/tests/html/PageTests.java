package org.nasdanika.vinci.tests.html;

import org.junit.Test;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.vinci.tests.TestsBase;

/**
 * Tests of {@link StaticText}.
 * @author Pavel
 *
 */
public class PageTests extends TestsBase {
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testPage() throws Exception {
		execute("html/page").writeFile("index.html", new PrintStreamProgressMonitor()); 		
	}
	
}
