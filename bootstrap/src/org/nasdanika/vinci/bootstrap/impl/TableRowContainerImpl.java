/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Context;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.RowContainer;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.TableRow;
import org.nasdanika.vinci.bootstrap.TableRowContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Row Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.TableRowContainerImpl#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TableRowContainerImpl extends BootstrapElementImpl implements TableRowContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableRowContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.TABLE_ROW_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TableRow> getRows() {
		return (EList<TableRow>)eDynamicGet(BootstrapPackage.TABLE_ROW_CONTAINER__ROWS, BootstrapPackage.Literals.TABLE_ROW_CONTAINER__ROWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.TABLE_ROW_CONTAINER__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.TABLE_ROW_CONTAINER__ROWS:
				return getRows();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BootstrapPackage.TABLE_ROW_CONTAINER__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends TableRow>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BootstrapPackage.TABLE_ROW_CONTAINER__ROWS:
				getRows().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BootstrapPackage.TABLE_ROW_CONTAINER__ROWS:
				return !getRows().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	protected Supplier<ViewBuilder> createRowsBuilderSupplier(Context context) throws Exception {
		Supplier<List<ViewBuilder>> rowBuilderSuppliers = new ListCompoundSupplierFactory<ViewBuilder>("Rows", new ArrayList<>(getRows())).create(context);
		
		Supplier<ViewBuilder> rowsBuilderSupplier = rowBuilderSuppliers.then(rowBuilders -> new ViewBuilder() {

			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				RowContainer<?,?> rowContainer = (RowContainer<?,?>) target;
				for (ViewBuilder rb: rowBuilders) {
					rb.build(rowContainer.row(), viewGenerator, progressMonitor);
				}
			}
			
		});
		return rowsBuilderSupplier;
	}	

} //TableRowContainerImpl
