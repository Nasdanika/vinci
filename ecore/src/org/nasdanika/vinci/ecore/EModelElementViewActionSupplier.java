package org.nasdanika.vinci.ecore;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.Context;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.html.app.impl.Util;
import org.nasdanika.ncore.NcoreFactory;
import org.nasdanika.ncore.Value;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.components.ActionLink;
import org.nasdanika.vinci.components.ComponentsFactory;
import org.nasdanika.vinci.emf.EObjectViewActionSupplier;
import org.nasdanika.vinci.emf.ViewActionSupplier;

public class EModelElementViewActionSupplier<T extends EModelElement> extends EObjectViewActionSupplier<T> {
	
	public static final String ICONS_BASE = "https://www.nasdanika.org/resources/images/ecore/";
		
	/**
	 * Descriptions shorter than this value are put on the top of the tabs, longer
	 * ones end up in their own tab. 
	 */
	protected int descriptionTabLengthThreshold = 2500;

	protected Context context; 
		
	public EModelElementViewActionSupplier(T value, Context context) {
		super(value);		
		this.context = context;
	}
	
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(progressMonitor);
		
		action.setIcon(ICONS_BASE+eObject.eClass().getName()+".gif");
		
		String markdown = EObjectAdaptable.getResourceContext(eObject).getString("documentation", EcoreUtil.getDocumentation(eObject));
		if (Util.isBlank(markdown)) {
			markdown = EmfUtil.getDocumentation(eObject);
		}
		action.setMarkdownContent(markdown);
		if (!Util.isBlank(markdown)) {
			action.setTooltip(MarkdownHelper.INSTANCE.firstPlainTextSentence(markdown));
		}
		
		return action;
	}
	
	protected static String getEModelElementFirstDocSentence(EModelElement modelElement) {
		String markdown = EObjectAdaptable.getResourceContext(modelElement).getString("documentation", EcoreUtil.getDocumentation(modelElement));
		if (Util.isBlank(markdown)) {
			markdown = EmfUtil.getDocumentation(modelElement);
		}
		return Util.isBlank(markdown) ? null : MarkdownHelper.INSTANCE.firstPlainTextSentence(markdown);
	}
		
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
			acit = resourceSet == null ? eResource.getAllContents() : resourceSet.getAllContents();
		}
		Set<EClass> ret = new HashSet<>();
		acit.forEachRemaining(obj -> {
			if (obj instanceof EReference && ((EReference) obj).getEReferenceType() == eClass) {
				ret.add(((EReference) obj).getEContainingClass());
			}
		});
		return ret;
	}
	
	/**
	 * Finds all type uses in the resourceset. 
	 * @return
	 */
	protected Collection<EClass> getUses(EClassifier eClassifier) {
		TreeIterator<?> acit;
		Resource eResource = eClassifier.eResource();
		if (eResource == null) {
			EPackage ePackage = eClassifier.getEPackage();
			if (ePackage == null) {
				return Collections.emptySet();
			}
			acit = ePackage.eAllContents();
		} else {
			ResourceSet resourceSet = eResource.getResourceSet();
			acit = resourceSet == null ? eResource.getAllContents() : resourceSet.getAllContents();
		}
		Set<EClass> ret = new HashSet<>();
		acit.forEachRemaining(obj -> {
			if (obj instanceof EClass && (org.nasdanika.emf.EmfUtil.collectTypeDependencies((EClass) obj).contains(eClassifier))) {
				ret.add((EClass) obj);
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

	protected String computeLabel(EGenericType genericType, ProgressMonitor monitor) throws Exception {
		EObject container = genericType.eContainer();
		EClassifier rawType = genericType.getERawType();
		String rawTypeText = rawType.getName(); // rawTypeViewActionSupplierFactory == null ? rawType.getName() : rawTypeViewActionSupplierFactory.create(context).execute(monitor).getText();
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
					label.append(computeLabel(typeArgument, monitor));
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
				label.append(computeLabel(genericType.getELowerBound(),  monitor));
			} else if (genericType.getEUpperBound() != null) {
				label.append(" extends ");
				label.append(computeLabel(genericType.getEUpperBound(), monitor));
			}
		}
		return label.toString();
	}
	
	// --- Generics ---
	
	/**
	 * @param eClassifier
	 * @return Type parameters string.
	 */
	protected String typeParameters(EClassifier eClassifier) {
		if (eClassifier.getETypeParameters().isEmpty()) {
			return "";
		}
		StringBuilder typeParameters = new StringBuilder();
		for (ETypeParameter typeParameter: eClassifier.getETypeParameters()) {
			if (typeParameters.length() > 0) {
				typeParameters.append(",");
			}
			typeParameters.append(genericName(typeParameter));
		}		
		
		return "&lt;" + typeParameters +"&gt;";
	}	
	
	protected String genericName(ETypeParameter typeParameter) {
		StringBuilder ret = new StringBuilder(typeParameter.getName());
		for (EGenericType bound : typeParameter.getEBounds()) {
			if (bound.getEUpperBound() != null) {
				ret.append(" extends ").append(genericName(bound.getEUpperBound()));
			}
			if (bound.getELowerBound() != null) {
				ret.append(" super ").append(genericName(bound.getELowerBound()));
			}
		}
		
		return ret.toString();
	}
	
	protected String genericName(EGenericType eGenericType) {
		StringBuilder ret = new StringBuilder();
		if (eGenericType.getETypeParameter() != null) {
			ret.append(eGenericType.getETypeParameter().getName());
		} else if (eGenericType.getEClassifier() != null) {
			ret.append(eGenericType.getEClassifier().getName());			
		}
		ret.append(genericTypeArguments(eGenericType));
		return ret.toString();
	}

	protected String genericTypeArguments(EGenericType eGenericType) {
		StringBuilder ret = new StringBuilder();
		Iterator<EGenericType> it = eGenericType.getETypeArguments().iterator();
		if (it.hasNext()) {
			ret.append("<");
			while (it.hasNext()) {
				ret.append(genericName(it.next()));
				if (it.hasNext()) {
					ret.append(",");
				}
			}
			ret.append(">");
		}
		return ret.toString();
	}
	
	public static Value wrap(String str) {
		Value ret = NcoreFactory.eINSTANCE.createValue();
		ret.setValue(str);
		return ret;		
	}

	/**
	 * Generates generic type text with links to classifiers.
	 * @param eGenericType
	 * @param accumulator
	 * @throws Exception 
	 */
	protected void genericType(EGenericType eGenericType, List<EObject> accumulator, ProgressMonitor monitor) throws Exception {
		if (eGenericType.getETypeParameter() != null) {
			accumulator.add(wrap(eGenericType.getETypeParameter().getName()));
		} else if (eGenericType.getEClassifier() != null) {
			EClassifier eClassifier = eGenericType.getEClassifier();
			ViewActionSupplier ecvas = EObjectAdaptable.adaptTo(eClassifier, ViewActionSupplier.class);
			if (ecvas == null) {
				accumulator.add(wrap(eClassifier.getName()));
			} else {
				Action eClassifierAction = ecvas.getAction(monitor);
				ActionLink link = ComponentsFactory.eINSTANCE.createActionLink();
				link.setTarget(eClassifierAction);
				link.setText(eClassifier.getName());
				accumulator.add(link);
			}
			genericTypeArguments(eGenericType, accumulator, monitor);
		}		
	}

	protected void genericTypeArguments(EGenericType eGenericType, List<EObject> accumulator, ProgressMonitor monitor) throws Exception {
		Iterator<EGenericType> it = eGenericType.getETypeArguments().iterator();
		if (it.hasNext()) {
			accumulator.add(wrap("&lt;"));
			while (it.hasNext()) {
				genericType(it.next(), accumulator, monitor);
				if (it.hasNext()) {
					accumulator.add(wrap(","));
				}
			}
			accumulator.add(wrap("&gt;"));
		}
	}
	
}
