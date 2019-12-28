package org.nasdanika.vinci.design;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.properties.EditSupport;
import org.nasdanika.common.Util;
import org.nasdanika.ncore.NcorePackage;

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
    
    public boolean isHtml(EObject self, EditSupport editSupport, EStructuralFeature feature) {
    	EAnnotation nann = feature.getEAnnotation("urn:org.nasdanika");
    	if (nann == null) {
    		return false;    	
    	}
    	String contentType = nann.getDetails().get("content-type");
    	return !Util.isBlank(contentType) && "text/html".equalsIgnoreCase(contentType.trim());
    }
        
    public boolean isMarkdown(EObject self, EditSupport editSupport, EStructuralFeature feature) {
    	EAnnotation nann = feature.getEAnnotation("urn:org.nasdanika");
    	if (nann == null) {
    		return false;    	
    	}
    	String contentType = nann.getDetails().get("content-type");
    	return !Util.isBlank(contentType) && "text/markdown".equalsIgnoreCase(contentType.trim());
    }    
    
    public boolean isDescription(EObject self, EditSupport editSupport, EStructuralFeature feature) {
    	return feature == NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION;
    }

}
