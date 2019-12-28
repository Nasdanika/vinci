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
    
    public boolean isHtml(EObject self, EStructuralFeature feature) {
    	EAnnotation nann = feature.getEAnnotation("urn:org.nasdanika");
    	if (nann == null) {
    		return false;    	
    	}
    	String contentType = nann.getDetails().get("content-type");
    	return !Util.isBlank(contentType) && "text/html".equalsIgnoreCase(contentType.trim());
    }
        
    public boolean isMarkdown(EObject self, EStructuralFeature feature) {
    	EAnnotation nann = feature.getEAnnotation("urn:org.nasdanika");
    	if (nann == null) {
    		return false;    	
    	}
    	String contentType = nann.getDetails().get("content-type");
    	return !Util.isBlank(contentType) && "text/markdown".equalsIgnoreCase(contentType.trim());
    }    
    
    public boolean isDescription(EObject self, EStructuralFeature feature) {
    	return feature == NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION;
    }
        
    public boolean hasHtml(EObject self) {
    	for (EStructuralFeature f: self.eClass().getEAllStructuralFeatures()) {
    		if (isHtml(self,f)) {
    			return true;
    		}
    	}
    	return false;
    }
        
    public boolean hasMarkdown(EObject self) {
    	for (EStructuralFeature f: self.eClass().getEAllStructuralFeatures()) {
    		if (isMarkdown(self,f)) {
    			return true;
    		}
    	}
    	return false;
    }    
    
    public boolean hasDescription(EObject self) {
    	for (EStructuralFeature f: self.eClass().getEAllStructuralFeatures()) {
    		if (isDescription(self,f)) {
    			return true;
    		}
    	}
    	return false;
    }
    

}
