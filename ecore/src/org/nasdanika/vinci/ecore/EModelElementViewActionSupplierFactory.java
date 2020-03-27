package org.nasdanika.vinci.ecore;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.emf.EObjectViewActionSupplierFactory;
import org.nasdanika.vinci.emf.ViewActionSupplierFactory;

public class EModelElementViewActionSupplierFactory<T extends EModelElement> extends EObjectViewActionSupplierFactory<T> {
	
	public static final String ICONS_BASE = "https://www.nasdanika.org/resources/images/ecore/";
		
	/**
	 * Descriptions shorter than this value are put on the top of the tabs, longer
	 * ones end up in their own tab. 
	 */
	protected int descriptionTabLengthThreshold = 2500; 
		
	public EModelElementViewActionSupplierFactory(T value) {
		super(value);		
	}
	
	@Override
	protected org.nasdanika.vinci.app.Action create(Context context, ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(context, progressMonitor);
		
		action.setIcon(ICONS_BASE+eObject.eClass().getName()+".gif");
		// Configuration here
		
		return action;
	}
	
//	protected Function<EClassifier, String> eClassifierLinkResolver = eClassifier -> {
//		ViewAction viewAction = EObjectAdaptable.adaptTo(eClassifier, ViewAction.class);
//		if (viewAction == null) {
//			return null;
//		}
//		
//		ActionActivator activator = viewAction.getActivator();
//		return activator instanceof NavigationActionActivator  ? ((NavigationActionActivator) activator).getUrl() : null;
//	};
//	
//	protected Function<EModelElement, String> eModelElementFirstDocSentenceProvider = eModelElement -> EObjectAdaptable.adaptTo(eModelElement, ViewAction.class).getTooltip();
//
//	/**
//	 * Sorting by text.
//	 */
//	@Override
//	public List<Action> getChildren() {
//		return super.getChildren().stream().sorted((a1,a2) -> a1.getText().compareTo(a2.getText())).collect(Collectors.toList());
//	}
		
	/**
	 * In situations where classes referencing this class are known this method can be overridden. 
	 * @return
	 */	
	protected Collection<EClass> getReferrers(EClass eClass) {
		TreeIterator<?> acit;
		Resource eResource = eClass.eResource();
		if (eResource == null) {
			EPackage ePackage = eClass.getEPackage();
			if (ePackage == null) {
				return Collections.emptySet();
			}
			acit = ePackage.eAllContents();
		} else {
			ResourceSet resourceSet = eResource.getResourceSet();
			acit = resourceSet == null ? eResource.getAllContents() : eResource.getAllContents();
		}
		Set<EClass> ret = new HashSet<>();
		acit.forEachRemaining(obj -> {
			if (obj instanceof EReference && ((EReference) obj).getEReferenceType() == eClass) {
				ret.add(((EReference) obj).getEContainingClass());
			}
		});
		return ret;
	}
	
	protected static String cardinality(ETypedElement typedElement) {
		int lowerBound = typedElement.getLowerBound();
		int upperBound = typedElement.getUpperBound();
		String cardinality;
		if (lowerBound == upperBound) {
			cardinality = String.valueOf(lowerBound);
		} else {
			cardinality = lowerBound + ".." + (upperBound == -1 ? "*" : String.valueOf(upperBound));
		}
		if (typedElement instanceof EReference && ((EReference) typedElement).isContainment()) {
			cardinality = "<B>"+cardinality+"</B>";
		}
		return cardinality;
	}
	
	// --- Handling generic types in action text --- 
	// TODO - a way to provide links in addition to plain text

	protected String computeLabel(EGenericType genericType, Context context, ProgressMonitor monitor) throws Exception {
		EObject container = genericType.eContainer();
		EClassifier rawType = genericType.getERawType();
		ViewActionSupplierFactory rawTypeViewActionSupplierFactory = EObjectAdaptable.adaptTo(rawType, ViewActionSupplierFactory.class);
		String rawTypeText = rawTypeViewActionSupplierFactory == null ? rawType.getName() : rawTypeViewActionSupplierFactory.create(context).execute(monitor).getText();
		if (container == null || !container.eIsSet(genericType.eContainingFeature())) {
			return rawTypeText;
		}
		
		StringBuilder label = new StringBuilder();
		if (genericType.getEClassifier() != null) {
			label.append(rawTypeText);

			if (!genericType.getETypeArguments().isEmpty()) {
				label.append("&lt;");
				for (Iterator<EGenericType> i = genericType.getETypeArguments().iterator(); i.hasNext();) {
					EGenericType typeArgument = i.next();
					label.append(computeLabel(typeArgument, context, monitor));
					if (i.hasNext()) {
						label.append(", ");
					}
				}
				label.append("&gt;");
			}
		} else {
			ETypeParameter typeParameter = genericType.getETypeParameter();
			String name = typeParameter != null ? typeParameter.getName() : "?";
			label.append(name);

			if (genericType.getELowerBound() != null) {
				label.append(" super ");
				label.append(computeLabel(genericType.getELowerBound(), context, monitor));
			} else if (genericType.getEUpperBound() != null) {
				label.append(" extends ");
				label.append(computeLabel(genericType.getEUpperBound(), context, monitor));
			}
		}
		return label.toString();
	}

}
