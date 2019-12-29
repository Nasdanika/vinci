/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Context;
import org.nasdanika.common.ListCompoundSupplier;
import org.nasdanika.common.MapCompoundSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.Column;
import org.nasdanika.vinci.bootstrap.Row;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.RowImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RowImpl extends BootstrapElementImpl implements Row {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Column> getColumns() {
		return (EList<Column>)eDynamicGet(BootstrapPackage.ROW__COLUMNS, BootstrapPackage.Literals.ROW__COLUMNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.ROW__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
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
			case BootstrapPackage.ROW__COLUMNS:
				return getColumns();
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
			case BootstrapPackage.ROW__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
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
			case BootstrapPackage.ROW__COLUMNS:
				getColumns().clear();
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
			case BootstrapPackage.ROW__COLUMNS:
				return !getColumns().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Supplier<ViewBuilder> create(Context context) throws Exception {
		@SuppressWarnings("resource")
		MapCompoundSupplier<String,Object> builderSuppliers = new MapCompoundSupplier<>("Builders");
		Appearance appearance = getAppearance();
		if (appearance != null) {
			builderSuppliers.put("Appearance", (Supplier) appearance.create(context));
		}
		ListCompoundSupplier<ViewBuilder> colBuilders = new ListCompoundSupplier<>("Cols");
		for (Column col: getColumns()) {
			colBuilders.add(col.create(context));
		}
		builderSuppliers.put("Cols", (Supplier) colBuilders);
		
		return builderSuppliers.then(builders -> new ViewBuilder() {
				
			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				org.nasdanika.html.bootstrap.Container.Row row = (org.nasdanika.html.bootstrap.Container.Row) target; 
				Object appearanceBuilder = builders.get("Appearance");
				if (appearanceBuilder instanceof ViewBuilder) {
					((ViewBuilder) appearanceBuilder).build(row, viewGenerator, progressMonitor);
				}
				
				for (ViewBuilder colBuilder: (List<ViewBuilder>) builders.get("Cols")) {
					colBuilder.build(row.col(), viewGenerator, progressMonitor);
				}
			}
				
		});
		
	}

} //RowImpl
