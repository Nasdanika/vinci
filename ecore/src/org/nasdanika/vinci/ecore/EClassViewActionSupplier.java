package org.nasdanika.vinci.ecore;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.emf.PlantUmlTextGenerator;
import org.nasdanika.emf.PlantUmlTextGenerator.RelationshipDirection;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.ncore.NcoreFactory;
import org.nasdanika.ncore.Property;
import org.nasdanika.ncore.Value;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionCategory;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.app.AppFactory;
import org.nasdanika.vinci.components.ComponentsFactory;
import org.nasdanika.vinci.components.ListOfContents;
import org.nasdanika.vinci.emf.ViewActionSupplier;
import org.nasdanika.vinci.html.ContentTag;
import org.nasdanika.vinci.html.HtmlFactory;

import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;

public class EClassViewActionSupplier extends EClassifierViewActionSupplier<EClass> {

	public EClassViewActionSupplier(EClass value) {
		super(value);
	}
	
	@Override
	protected Action create(ProgressMonitor progressMonitor) throws Exception {
		Action action = super.create(progressMonitor);
		action.setSectionStyle(SectionStyle.DEFAULT.label);
		
		if (!eObject.getEAttributes().isEmpty()) {
			ActionCategory attrsCategory = AppFactory.eINSTANCE.createActionCategory();
			attrsCategory.setText("Attributes");
			action.getElements().add(attrsCategory);
			for (EStructuralFeature sf: eObject.getEAttributes().stream().sorted((a,b) ->  a.getName().compareTo(b.getName())).collect(Collectors.toList())) {
				ViewActionSupplier sfvasf = EObjectAdaptable.adaptTo(sf, ViewActionSupplier.class);
				attrsCategory.getElements().add(sfvasf.getAction(progressMonitor));
			}
		}
		
		if (!eObject.getEReferences().isEmpty()) {
			ActionCategory refsCategory = AppFactory.eINSTANCE.createActionCategory();
			refsCategory.setText("References");
			action.getElements().add(refsCategory);
			for (EStructuralFeature sf: eObject.getEReferences().stream().sorted((a,b) ->  a.getName().compareTo(b.getName())).collect(Collectors.toList())) {
				ViewActionSupplier sfvasf = EObjectAdaptable.adaptTo(sf, ViewActionSupplier.class);
				refsCategory.getElements().add(sfvasf.getAction(progressMonitor));
			}
		}
		
		if (!eObject.getEOperations().isEmpty()) {
			ActionCategory opsCategory = AppFactory.eINSTANCE.createActionCategory();
			opsCategory.setText("Operations");
			action.getElements().add(opsCategory);
			for (EOperation eOp: eObject.getEOperations().stream().sorted((a,b) ->  a.getName().compareTo(b.getName())).collect(Collectors.toList())) {
				ViewActionSupplier eovasf = EObjectAdaptable.adaptTo(eOp, ViewActionSupplier.class);
				opsCategory.getElements().add(eovasf.getAction(progressMonitor));			
			}
		}
		
		return action;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	protected void configure(ProgressMonitor monitor) throws Exception {
		super.configure(monitor);

		// Diagram
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		String diagramCMap = generateDiagram(false, null, 1, RelationshipDirection.both, true, true, baos);
		baos.close();
		ContentTag imageTag = HtmlFactory.eINSTANCE.createContentTag();
		imageTag.setName("img");
		
		Property srcAttribute = NcoreFactory.eINSTANCE.createProperty();
		srcAttribute.setName("src");
		srcAttribute.setValue("data:image/png;base64, " + Base64.getEncoder().encodeToString(baos.toByteArray()));
		imageTag.getAttributes().add(srcAttribute);
		
		Property useMapAttribute = NcoreFactory.eINSTANCE.createProperty();
		useMapAttribute.setName("usemap");
		useMapAttribute.setValue("#plantuml_map");
		imageTag.getAttributes().add(useMapAttribute);
		
		action.getContent().add((SupplierFactory) imageTag);
		
		Value cMapValue = NcoreFactory.eINSTANCE.createValue();
		cMapValue.setValue(diagramCMap);
		action.getContent().add(cMapValue);
				
		// Supertypes
		
		// Subtypes
		
		ListOfContents loc = ComponentsFactory.eINSTANCE.createListOfContents();
		loc.setDepth(1);
		loc.setTooltips(true);
		loc.setHeader("EClassifiers");
		loc.setRole(ActionRole.SECTION.label);
		action.getContent().add((SupplierFactory) loc);		
		
	}
	
	protected String generateDiagram(
			boolean leftToRightDirection, 
			String width, 
			int depth, 
			PlantUmlTextGenerator.RelationshipDirection relationshipDirection,
			boolean appendAttributes,
			boolean appendOperations,
			OutputStream out) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		PlantUmlTextGenerator gen = new PlantUmlTextGenerator(sb, ec -> EClassifierViewActionSupplier.id(ec)+".html", EModelElementViewActionSupplier::getEModelElementFirstDocSentence) {
			
			@Override
			protected Collection<EClass> getSubTypes(EClass eClass) {
				return EClassViewActionSupplier.this.getSubTypes(eClass);
			}
			
			@Override
			protected Collection<EClass> getReferrers(EClass eClass) {
				return EClassViewActionSupplier.this.getReferrers(eClass);
			}
			
			@Override
			protected boolean isAppendAttributes(EClass eClass) {
				return appendAttributes;
			}
			
			@Override
			protected boolean isAppendOperations(EClass eClass) {
				return appendOperations;
			}
			
		};
		gen.appendStartUml();
		
		if (leftToRightDirection) {
			sb.append("left to right direction").append(System.lineSeparator());
		}
		
		if (width != null) {
			sb.append("scale ").append(width).append(" width").append(System.lineSeparator());
		}
						
		gen.appendWithRelationships(Collections.singleton(eObject), relationshipDirection, depth);
		
		gen.appendEndUml();
		SourceStringReader reader = new SourceStringReader(sb.toString());
		
		FileFormatOption fileFormatOption = new FileFormatOption(FileFormat.PNG);
		reader.outputImage(out, 0, fileFormatOption);
		
		return reader.getCMapData(0, fileFormatOption);
	}
		
	/**
	 * Override to return a list of sub-types of given EClass. 
	 * This implementation returns all sub-types found in the resource set. 
	 * @param eClass
	 * @return
	 */
	protected Collection<EClass> getSubTypes(EClass eClass) {
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
			if (obj instanceof EClass && ((EClass) obj).getESuperTypes().contains(eClass)) {
				ret.add((EClass) obj);
			}
		});
		return ret;
	}
	
//	@SuppressWarnings("unchecked")
//	@Override
//	public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
//		BootstrapFactory bootstrapFactory = viewGenerator.get(BootstrapFactory.class);
//		Container contentContainer = bootstrapFactory.fluidContainer();
//		contentContainer.text().alignment(Alignment.LEFT);
//		if (target.isAbstract()) {
//			contentContainer.row().col(target.isInterface() ? getResourceContext().getString(PropertyKeys.UI_INTERFACE, "Interface") : getResourceContext().getString(PropertyKeys.UI_ABSTRACT, "Abstract"))
//			.width(Breakpoint.DEFAULT, Size.NONE)
//			.padding().bottom(Breakpoint.DEFAULT, Size.S3);
//		}
//		String description = getDescription();
//		if (!Util.isBlank(description) && description.length() < descriptionTabLengthThreshold) {
//			contentContainer.row().col(description).width(Breakpoint.DEFAULT, Size.NONE);
//		}
//		
//		Navs tabs = bootstrapFactory.navs().tabs();
//		contentContainer.row().col(tabs).width(Breakpoint.DEFAULT, Size.NONE);
//		
//		if (!Util.isBlank(description) && description.length() >= descriptionTabLengthThreshold) {
//			tabs.item(getResourceContext().getString(PropertyKeys.UI_DESCRIPTION, "Description"), description);
//		}		
//
//		ByteArrayOutputStream baos = new ByteArrayOutputStream();
//		try (ProgressMonitor imageMonitor = progressMonitor.split("Writing class diagram for "+target.getName(), 100, target)) {
//			String diagramCMap = generateDiagram(false, null, 1, RelationshipDirection.both, true, true, baos);
//			baos.close();
//			org.nasdanika.common.resources.Container<Object> resourceContainer = viewGenerator.get(org.nasdanika.common.resources.Container.class);
//			String imagePath = getId()+".png";
//			resourceContainer.put(imagePath, baos.toByteArray(), imageMonitor);
//			HTMLFactory htmlFactory = viewGenerator.get(HTMLFactory.class);
//			Tag diagramImage = htmlFactory.tag(TagName.img).attribute("src", viewGenerator.get("image-path", "")+imagePath).attribute("usemap", "#plantuml_map");
//			tabs.item(getResourceContext().getString(PropertyKeys.UI_DIAGRAM, "Diagram"), htmlFactory.fragment(diagramImage, diagramCMap));				
//		} catch (IOException e) {
//			tabs.item(getResourceContext().getString(PropertyKeys.UI_DIAGRAM, "Diagram"), bootstrapFactory.alert(Color.DANGER, "Error generating class diagram: "+e));
//			e.printStackTrace();
//		}
//		
//		List<Action> children = getChildren();
//		if (!children.isEmpty()) {
//			Table table = bootstrapFactory.table().bordered();
//			TableHeader header = table.header();
//			header.headerRow(
//					getResourceContext().getString(PropertyKeys.UI_NAME, "Name"), 
//					getResourceContext().getString(PropertyKeys.UI_TYPE, "Type"), 
//					getResourceContext().getString(PropertyKeys.UI_CARDINALITY, "Cardinality"), 
//					getResourceContext().getString(PropertyKeys.UI_SUMMARY, "Summary"));
//			TableBody body = table.body();
//			children.forEach(child -> {
//				ETypedElement typedElement = child.adaptTo(ETypedElement.class);
//				EClassifier type = typedElement.getEType();
//				ViewAction typeViewAction = EObjectAdaptable.adaptTo(type, ViewAction.class);
//				body.row(viewGenerator.link(child), typeViewAction == null ?  type.getName() : viewGenerator.link(typeViewAction), cardinality(typedElement), child.getTooltip());			
//			});
//			tabs.item(getResourceContext().getString(PropertyKeys.UI_CONTENTS, "Contents"), table);
//		}
//		
//		EList<EClass> st = target.getESuperTypes();
//		if (!st.isEmpty()) {
//			Table superTypesTable = bootstrapFactory.table().bordered();
//			superTypesTable.header().headerRow(
//					getResourceContext().getString(PropertyKeys.UI_NAME, "Name"), 
//					getResourceContext().getString(PropertyKeys.UI_SUMMARY, "Summary"));
//			TableBody superTypesTableBody = superTypesTable.body();
//			st.forEach(superType -> {
//				Action viewAction = EObjectAdaptable.adaptTo(superType, ViewAction.class);
//				if (viewAction != null) {
//					superTypesTableBody.row(viewGenerator.link(viewAction), viewAction.getTooltip());
//				}
//			});
//			tabs.item(getResourceContext().getString(PropertyKeys.UI_SUPERTYPES, "Supertypes"), superTypesTable);							
//		}
//		
//		List<EClass> sbt = getSubTypes(target).stream().sorted((a,b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
//		if (!sbt.isEmpty()) {
//			Table subTypesTable = bootstrapFactory.table().bordered();
//			subTypesTable.header().headerRow(
//					getResourceContext().getString(PropertyKeys.UI_NAME, "Name"), 
//					getResourceContext().getString(PropertyKeys.UI_SUMMARY, "Summary"));
//			TableBody subTypesTableBody = subTypesTable.body();
//			sbt.forEach(subType -> {
//				Action viewAction = EObjectAdaptable.adaptTo(subType, ViewAction.class);
//				if (viewAction != null) {
//					subTypesTableBody.row(viewGenerator.link(viewAction), viewAction.getTooltip());
//				}
//			});
//			tabs.item(getResourceContext().getString(PropertyKeys.UI_SUBTYPES, "Subtypes"), subTypesTable);				
//			
//		}
//		
//		return contentContainer;
//	}
//	
//	@Override
//	protected List<EStructuralFeature> getChildFeatures() {
//		List<EStructuralFeature> ret = new ArrayList<>();
//		ret.add(EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES);
//		ret.add(EcorePackage.Literals.ECLASS__EOPERATIONS);
//		return ret;
//	}
//		
//	@Override
//	public List<Action> getChildren() {
//		List<Action> ret = new ArrayList<>();
//		
//		for (EStructuralFeature feature: target.getEStructuralFeatures()) {			
//			Action featureAction = adaptTo(feature, ViewAction.class);
//			if (featureAction != null) {
//				ret.add(filterChildAction(featureAction, Action.Role.NAVIGATION, null));
//			}
//		}
//		
//		for (EOperation operation: target.getEOperations()) {			
//			Action operationAction = adaptTo(operation, ViewAction.class);
//			if (operationAction != null) {
//				ret.add(filterChildAction(operationAction, Action.Role.NAVIGATION, null));
//			}
//		}
//		
//		// features before operations.
//		Comparator<? super Action> comparator = (a,b) -> {
//			int nameCmp = a.getText().compareTo(b.getText());
//			if (a instanceof EStructuralFeatureViewAction) {
//				return b instanceof EStructuralFeatureViewAction ? nameCmp : -1;
//			} 
//			
//			if (b instanceof EStructuralFeatureViewAction) {
//				return a instanceof EStructuralFeatureViewAction ? nameCmp : 1;
//			}
//			
//			return nameCmp;			
//		};
//		return ret.stream().sorted(comparator).collect(Collectors.toList());
//	}
//

}
