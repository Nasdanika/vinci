package org.nasdanika.vinci.design;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.nasdanika.sirius.CommonServices;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionElement;
import org.nasdanika.vinci.app.ActionRole;

/**
 * The services class used by VSM.
 */
public class Services extends CommonServices {
        
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
    
	public boolean isVinciResource(EObject self) {
		return isResourceExtension(self, "vinci");
	}		

}
