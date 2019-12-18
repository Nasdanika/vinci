/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.CompoundConsumer;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.TableRow;
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

	@Override
	public Consumer<Object> create(Context context) throws Exception {
		CompoundConsumer<Object> consumer = new CompoundConsumer<Object>(getTitle());
		Appearance appearance = getAppearance();
		if (appearance != null) {
			consumer.add(appearance.create(context));
		}
		
		for (TableRow row: getRows()) {
			Function<Object,Object> rowFunction = Function.fromBiFunction(
					(obj,progressMonitor) -> ((org.nasdanika.html.bootstrap.RowContainer<?,?>) obj).row(),
					"Column", 
					1);
			consumer.add(rowFunction.then(row.create(context)));
		}
		return consumer;
	}

} //TableSectionImpl
