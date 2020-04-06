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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
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
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.SectionStyle;
import org.nasdanika.ncore.NcoreFactory;
import org.nasdanika.ncore.Property;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionCategory;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.app.AppFactory;
import org.nasdanika.vinci.bootstrap.BootstrapFactory;
import org.nasdanika.vinci.bootstrap.ContentTag;
import org.nasdanika.vinci.components.ComponentsFactory;
import org.nasdanika.vinci.components.ListOfActions;
import org.nasdanika.vinci.components.ListOfContents;
import org.nasdanika.vinci.emf.ViewActionSupplier;

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
				attrsCategory.getElements().add(adaptChild(sf).getAction(progressMonitor));
			}
		}
		
		if (!eObject.getEReferences().isEmpty()) {
			ActionCategory refsCategory = AppFactory.eINSTANCE.createActionCategory();
			refsCategory.setText("References");
			action.getElements().add(refsCategory);
			for (EStructuralFeature sf: eObject.getEReferences().stream().sorted((a,b) ->  a.getName().compareTo(b.getName())).collect(Collectors.toList())) {
				refsCategory.getElements().add(adaptChild(sf).getAction(progressMonitor));
			}
		}
		
		if (!eObject.getEOperations().isEmpty()) {
			ActionCategory opsCategory = AppFactory.eINSTANCE.createActionCategory();
			opsCategory.setText("Operations");
			action.getElements().add(opsCategory);
			for (EOperation eOp: eObject.getEOperations().stream().sorted((a,b) ->  a.getName().compareTo(b.getName())).collect(Collectors.toList())) {
				opsCategory.getElements().add(adaptChild(eOp).getAction(progressMonitor));			
			}
		}
		
		return action;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void configure(ProgressMonitor monitor) throws Exception {
		super.configure(monitor);

		// Diagram
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		String diagramCMap = generateDiagram(false, null, 1, RelationshipDirection.both, true, true, baos);
		baos.close();
		ContentTag imageTag = BootstrapFactory.eINSTANCE.createContentTag();
		imageTag.setName(TagName.img.name());
		
		Property srcAttribute = NcoreFactory.eINSTANCE.createProperty();
		srcAttribute.setName("src");
		srcAttribute.setValue("data:image/png;base64, " + Base64.getEncoder().encodeToString(baos.toByteArray()));
		imageTag.getAttributes().add(srcAttribute);
		
		Property useMapAttribute = NcoreFactory.eINSTANCE.createProperty();
		useMapAttribute.setName("usemap");
		useMapAttribute.setValue("#plantuml_map");
		imageTag.getAttributes().add(useMapAttribute);
		
		action.getContent().add((SupplierFactory) imageTag);
		
		action.addContent(diagramCMap);
				
		// Generic supertypes
		EList<EGenericType> eGenericSuperTypes = eObject.getEGenericSuperTypes();
		if (!eGenericSuperTypes.isEmpty()) {
			ContentTag header = BootstrapFactory.eINSTANCE.createContentTag();
			header.setName(TagName.h3.name());
			header.addContent("Supertypes");
			action.getContent().add((SupplierFactory) header);
			
			ContentTag list = BootstrapFactory.eINSTANCE.createContentTag();
			list.setName(TagName.ul.name());
			action.getContent().add((SupplierFactory) list);
			
			for (EGenericType superType: eGenericSuperTypes) {
				ContentTag listItem = BootstrapFactory.eINSTANCE.createContentTag();
				listItem.setName(TagName.li.name());
				list.getContent().add((SupplierFactory) listItem);
				genericType(superType, listItem.getContent(), monitor);
			}
		}
		
		// Subtypes
		Collection<EClass> eSubTypes = getSubTypes(eObject);
		if (!eSubTypes.isEmpty()) {
			ListOfActions subTypesList = ComponentsFactory.eINSTANCE.createListOfActions();
			action.getContent().add((SupplierFactory) subTypesList);
			subTypesList.setDepth(1);
			subTypesList.setTooltips(true);
			subTypesList.setHeader("Subtypes");
			for (EClass subType: eSubTypes) {
				ViewActionSupplier stvas = EObjectAdaptable.adaptTo(subType, ViewActionSupplier.class);
				if (stvas != null) {
					subTypesList.getActions().add(stvas.getAction(monitor));
				}
			}
		}
		
		ListOfContents loc = ComponentsFactory.eINSTANCE.createListOfContents();
		loc.setDepth(1);
		loc.setHeader("Members");
		loc.setTooltips(true);
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
			acit = resourceSet == null ? eResource.getAllContents() : resourceSet.getAllContents();
		}
		Set<EClass> ret = new HashSet<>();
		acit.forEachRemaining(obj -> {
			if (obj instanceof EClass && ((EClass) obj).getESuperTypes().contains(eClass)) {
				ret.add((EClass) obj);
			}
		});
		return ret;
	}

}
