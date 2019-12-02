package org.nasdanika.vinci.design;

import org.eclipse.emf.ecore.EObject;

/**
 * The services class used by VSM.
 */
public class Services {

	/**
	 * See
	 * http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24
	 * for documentation on how to write service methods.
	 */
	public EObject myService(EObject self, String arg) {
		System.out.println(arg);
		// TODO Auto-generated code
		return self;
	}

	/**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public boolean hasChoicess(EObject self, Object editService, Object ref) {
    	System.out.println(editService);
    	System.out.println(ref);
    	return true;
    }

}
