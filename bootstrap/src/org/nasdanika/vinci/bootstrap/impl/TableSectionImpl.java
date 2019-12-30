/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.StringMapCompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.TableSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TableSectionImpl extends TableRowContainerImpl implements TableSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.TABLE_SECTION;
	}

	@SuppressWarnings("resource")
	@Override
	public Supplier<ViewBuilder> create(Context context) throws Exception {		
		StringMapCompoundSupplier<ViewBuilder> parts = new StringMapCompoundSupplier<>(getTitle());
		
		Appearance appearance = getAppearance();
		if (appearance != null) {
			parts.put("Appearance", appearance.create(context));
		}
		parts.put("Rows", createRowsBuilderSupplier(context));
		
		return parts.then(partsMap -> new ViewBuilder() {
			
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				org.nasdanika.html.bootstrap.RowContainer<?,?> rowContainer = (org.nasdanika.html.bootstrap.RowContainer<?,?>) target;
				
				ViewBuilder appearanceBuilder = partsMap.get("Appearance");
				if (appearanceBuilder != null) {
					appearanceBuilder.build(rowContainer, viewGenerator, progressMonitor);
				}
				
				ViewBuilder rowsBuilder = partsMap.get("Rows");
				if (rowsBuilder != null) {
					rowsBuilder.build(rowContainer, viewGenerator, progressMonitor);
				}
			}

		});
		
	}

} //TableSectionImpl
