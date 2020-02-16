package org.nasdanika.vinci.design;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.properties.EditSupport;
import org.nasdanika.common.Util;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionElement;
import org.nasdanika.vinci.app.ActionRole;

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
    
	public boolean isCode(EObject self, EStructuralFeature feature) {
		EAnnotation nann = feature.getEAnnotation("urn:org.nasdanika");
		if (nann == null) {
			return false;    	
		}
		String contentType = nann.getDetails().get("content-type");
		return !Util.isBlank(contentType) && "text/code".equalsIgnoreCase(contentType.trim());
	}    
    
    public boolean isDescription(EObject self, EStructuralFeature feature) {
    	return feature == NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION;
    }
    
    public boolean hasVinciRule(EObject self, EStructuralFeature feature) {
    	return isCode(self, feature) 
    			|| isDescription(self, feature) 
    			|| isHtml(self, feature) 
    			|| isMarkdown(self, feature);
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
    
    public boolean hasCode(EObject self) {
    	for (EStructuralFeature f: self.eClass().getEAllStructuralFeatures()) {
    		if (isCode(self,f)) {
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
        
    /**
     * 
     * @param self
     * @return true if target role is navigation
     */
    public boolean isNavigation(EObject self, DEdge view) {
    	EdgeTarget targetNode = view.getTargetNode();
    	if (targetNode instanceof DNode) {
    		EList<EObject> semanticElements = ((DNode) targetNode).getSemanticElements();
			if (semanticElements.size() == 1) {
    			EObject target = semanticElements.get(0);
    			if (target instanceof ActionBase) {
    				String role = ((ActionBase) target).getRole();
    				return ActionRole.NAVIGATION.label.equals(role);
    			}
			}
    	}
    	return false;
    }
    
	/**
	 * 
	 * @param self
	 * @return true if target role is navigation
	 */
	public boolean isContext(EObject self, DEdge view) {
		EdgeTarget targetNode = view.getTargetNode();
		if (targetNode instanceof DNode) {
			EList<EObject> semanticElements = ((DNode) targetNode).getSemanticElements();
			if (semanticElements.size() == 1) {
				EObject target = semanticElements.get(0);
				if (target instanceof ActionBase) {
					String role = ((ActionBase) target).getRole();
					return ActionRole.CONTEXT.label.equals(role);
				}
			}
		}
		return false;
	}
    
    /**
     * @param self
     * @return true if the target is the first navigation child.
     */
	public boolean isPrincipalNavigation(EObject self, DEdge view, Object container) {
		if (self == container && self instanceof ActionBase) {
	    	EdgeTarget targetNode = view.getTargetNode();
	    	if (targetNode instanceof DNode) {
	    		EList<EObject> semanticElements = ((DNode) targetNode).getSemanticElements();
				if (semanticElements.size() == 1) {
	    			EObject target = semanticElements.get(0);
	    			if (target instanceof ActionBase) {
	    				String role = ((ActionBase) target).getRole();
	    				if (ActionRole.NAVIGATION.label.equals(role)) {
	    					for (ActionElement e: ((ActionBase) self).getEffectiveElements()) {
	    						if (e instanceof ActionBase && ActionRole.NAVIGATION.label.equals(((ActionBase) e).getRole())) {
	    							return e == target; 
	    						}
	    					}	    					
	    				}
	    			}
				}
	    	}
		}
		return false;
	}

}
