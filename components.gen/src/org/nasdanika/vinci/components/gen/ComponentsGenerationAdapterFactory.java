package org.nasdanika.vinci.components.gen;

import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.vinci.components.ActionLink;
import org.nasdanika.vinci.components.ComponentsPackage;
import org.nasdanika.vinci.components.ListOfActions;
import org.nasdanika.vinci.components.ListOfContents;
import org.nasdanika.vinci.components.MarkdownResource;
import org.nasdanika.vinci.components.MarkdownText;
import org.nasdanika.vinci.components.TableOfActions;
import org.nasdanika.vinci.components.TableOfContents;
import org.nasdanika.vinci.components.TextToSpeechResource;
import org.nasdanika.vinci.components.TextToSpeechText;
import org.nasdanika.vinci.components.Image;

/**
 * Generation adapter factory for Vinci components.
 * @author Pavel
 *
 */
public class ComponentsGenerationAdapterFactory extends ComposedAdapterFactory {
	
	@SuppressWarnings("rawtypes")
	public ComponentsGenerationAdapterFactory() {
		// Registering adapter factories.
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, ActionLink>(
				ComponentsPackage.Literals.ACTION_LINK, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				ActionLinkSupplierFactory::new));
				
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, MarkdownResource>(
					ComponentsPackage.Literals.MARKDOWN_RESOURCE, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					MarkdownResourceSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, MarkdownText>(
					ComponentsPackage.Literals.MARKDOWN_TEXT, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					MarkdownTextSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, ListOfContents>(
					ComponentsPackage.Literals.LIST_OF_CONTENTS, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ListOfContentsSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, ListOfActions>(
					ComponentsPackage.Literals.LIST_OF_ACTIONS, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ListOfActionsSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, TableOfContents>(
					ComponentsPackage.Literals.TABLE_OF_CONTENTS, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					TableOfContentsSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, TableOfActions>(
					ComponentsPackage.Literals.TABLE_OF_ACTIONS, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					TableOfActionsSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, TextToSpeechResource>(
					ComponentsPackage.Literals.TEXT_TO_SPEECH_RESOURCE, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					TextToSpeechResourceSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, TextToSpeechText>(
					ComponentsPackage.Literals.TEXT_TO_SPEECH_TEXT, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					TextToSpeechTextSupplierFactory::new));
		
		registerAdapterFactory(
				new FunctionAdapterFactory<SupplierFactory, Image>(
					ComponentsPackage.Literals.IMAGE, 
					SupplierFactory.class, 
					this.getClass().getClassLoader(),
					ImageSupplierFactory::new));
					
//		registerAdapterFactory(
//			new FunctionAdapterFactory<ViewActionSupplier, EPackage>(
//				EcorePackage.Literals.EPACKAGE, 
//				ViewActionSupplier.class, 
//				this.getClass().getClassLoader(), 
//				e -> new EPackageViewActionSupplier(e,context)));	
//
//		registerAdapterFactory(
//			new FunctionAdapterFactory<ViewActionSupplier, EClass>(
//				EcorePackage.Literals.ECLASS, 
//				ViewActionSupplier.class, 
//				this.getClass().getClassLoader(), 
//				e -> new EClassViewActionSupplier(e,context)));		
//
//		registerAdapterFactory(
//			new FunctionAdapterFactory<ViewActionSupplier, EDataType>(
//				EcorePackage.Literals.EDATA_TYPE, 
//				ViewActionSupplier.class, 
//				this.getClass().getClassLoader(), 
//				e -> new EDataTypeViewActionSupplierFactory(e,context)));		
//
//		registerAdapterFactory(
//			new FunctionAdapterFactory<ViewActionSupplier, EEnum>(
//				EcorePackage.Literals.EENUM, 
//				ViewActionSupplier.class, 
//				this.getClass().getClassLoader(), 
//				e -> new EEnumViewActionSupplier(e,context)));		
//
//		registerAdapterFactory(
//			new FunctionAdapterFactory<ViewActionSupplier, EEnumLiteral>(
//				EcorePackage.Literals.EENUM_LITERAL, 
//				ViewActionSupplier.class, 
//				this.getClass().getClassLoader(), 
//				e -> new EEnumLiteralViewActionSupplier(e,context)));		
//
//		registerAdapterFactory(
//			new FunctionAdapterFactory<ViewActionSupplier, EAttribute>(
//				EcorePackage.Literals.EATTRIBUTE, 
//				ViewActionSupplier.class, 
//				this.getClass().getClassLoader(), 
//				e -> new EAttributeViewActionSupplier(e,context)));		
//
//		registerAdapterFactory(
//			new FunctionAdapterFactory<ViewActionSupplier, EReference>(
//				EcorePackage.Literals.EREFERENCE, 
//				ViewActionSupplier.class, 
//				this.getClass().getClassLoader(), 
//				e -> new EReferenceViewActionSupplier(e,context)));		
//
//		registerAdapterFactory(
//			new FunctionAdapterFactory<ViewActionSupplier, EOperation>(
//				EcorePackage.Literals.EOPERATION, 
//				ViewActionSupplier.class, 
//				this.getClass().getClassLoader(), 
//				e -> new EOperationViewActionSupplier(e,context)));		
//
//		registerAdapterFactory(
//			new FunctionAdapterFactory<ViewActionSupplier, EParameter>(
//				EcorePackage.Literals.EPARAMETER, 
//				ViewActionSupplier.class, 
//				this.getClass().getClassLoader(), 
//				e -> new EParameterViewActionSupplier(e,context)));	
	}

}