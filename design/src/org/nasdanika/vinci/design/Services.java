package org.nasdanika.vinci.design;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.properties.EditSupport;

/**
 * The services class used by VSM.
 */
public class Services {
    
    public boolean isSelect(EObject self, EditSupport editSupport, EStructuralFeature feature) {
    	try {
    		return editSupport.getChoiceOfValues(feature) != null;
    	} catch (NullPointerException e) {
    		// Edit support throws an exception if choices are null.
    		return false;
    	}
    }
    

}
