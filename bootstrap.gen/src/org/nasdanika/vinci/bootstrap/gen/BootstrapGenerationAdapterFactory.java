package org.nasdanika.vinci.bootstrap.gen;

import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.ComposedAdapterFactory;
import org.nasdanika.emf.FunctionAdapterFactory;
import org.nasdanika.vinci.bootstrap.ActionGroup;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.BootstrapPage;
import org.nasdanika.vinci.bootstrap.Card;
import org.nasdanika.vinci.bootstrap.Column;
import org.nasdanika.vinci.bootstrap.Container;
import org.nasdanika.vinci.bootstrap.ContentActionGroupItem;
import org.nasdanika.vinci.bootstrap.ContentTag;
import org.nasdanika.vinci.bootstrap.LinkActionGroupItem;
import org.nasdanika.vinci.bootstrap.Row;
import org.nasdanika.vinci.bootstrap.Table;
import org.nasdanika.vinci.bootstrap.TableCell;
import org.nasdanika.vinci.bootstrap.TableHeader;
import org.nasdanika.vinci.bootstrap.TableRow;
import org.nasdanika.vinci.bootstrap.TableSection;

/**
 * Generation adapter factory for Vinci bootstrap elements.
 * @author Pavel
 *
 */
public class BootstrapGenerationAdapterFactory extends ComposedAdapterFactory {
	
	@SuppressWarnings("rawtypes")
	public BootstrapGenerationAdapterFactory() {
		// Registering adapter factories.
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, Appearance>(
				BootstrapPackage.Literals.APPEARANCE, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				AppearanceSupplierFactory::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, ActionGroup>(
				BootstrapPackage.Literals.ACTION_GROUP, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				ActionGroupSupplierFactory::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, BootstrapPage>(
				BootstrapPackage.Literals.BOOTSTRAP_PAGE, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				BootstrapPageSupplierFactory::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, Card>(
				BootstrapPackage.Literals.CARD, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				CardSupplierFactory::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, Column>(
				BootstrapPackage.Literals.COLUMN, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				ColumnSupplierFactory::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, Container>(
				BootstrapPackage.Literals.CONTAINER, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				ContainerSupplierFactory::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, ContentActionGroupItem>(
				BootstrapPackage.Literals.CONTENT_ACTION_GROUP_ITEM, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				ContentActionGroupItemSupplierFactory::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, ContentTag>(
				BootstrapPackage.Literals.CONTENT_TAG, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				ContentTagSupplierFactory::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, LinkActionGroupItem>(
				BootstrapPackage.Literals.LINK_ACTION_GROUP_ITEM, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				LinkActionGroupItemSupplierFactory::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, Row>(
				BootstrapPackage.Literals.ROW, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				RowSupplierFactory::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, TableCell>(
				BootstrapPackage.Literals.TABLE_CELL, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				TableCellSupplierFactory::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, TableHeader>(
				BootstrapPackage.Literals.TABLE_HEADER, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				TableHeaderSupplierFactory::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, Table>(
				BootstrapPackage.Literals.TABLE, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				TableSupplierFactory::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, TableRow>(
				BootstrapPackage.Literals.TABLE_ROW, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				TableRowSupplierFactory::new));
		
		registerAdapterFactory(
			new FunctionAdapterFactory<SupplierFactory, TableSection>(
				BootstrapPackage.Literals.TABLE_SECTION, 
				SupplierFactory.class, 
				this.getClass().getClassLoader(),
				TableSectionSupplierFactory::new));
		
	}

}
