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
import org.nasdanika.common.StringMapCompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.Util;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.TableCell;
import org.nasdanika.vinci.bootstrap.TableRow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.TableRowImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.TableRowImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.TableRowImpl#getBackground <em>Background</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableRowImpl extends BootstrapElementImpl implements TableRow {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.TABLE_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TableCell> getCells() {
		return (EList<TableCell>)eDynamicGet(BootstrapPackage.TABLE_ROW__CELLS, BootstrapPackage.Literals.TABLE_ROW__CELLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return (String)eDynamicGet(BootstrapPackage.TABLE_ROW__COLOR, BootstrapPackage.Literals.TABLE_ROW__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		eDynamicSet(BootstrapPackage.TABLE_ROW__COLOR, BootstrapPackage.Literals.TABLE_ROW__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackground() {
		return (String)eDynamicGet(BootstrapPackage.TABLE_ROW__BACKGROUND, BootstrapPackage.Literals.TABLE_ROW__BACKGROUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackground(String newBackground) {
		eDynamicSet(BootstrapPackage.TABLE_ROW__BACKGROUND, BootstrapPackage.Literals.TABLE_ROW__BACKGROUND, newBackground);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.TABLE_ROW__CELLS:
				return ((InternalEList<?>)getCells()).basicRemove(otherEnd, msgs);
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
			case BootstrapPackage.TABLE_ROW__CELLS:
				return getCells();
			case BootstrapPackage.TABLE_ROW__COLOR:
				return getColor();
			case BootstrapPackage.TABLE_ROW__BACKGROUND:
				return getBackground();
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
			case BootstrapPackage.TABLE_ROW__CELLS:
				getCells().clear();
				getCells().addAll((Collection<? extends TableCell>)newValue);
				return;
			case BootstrapPackage.TABLE_ROW__COLOR:
				setColor((String)newValue);
				return;
			case BootstrapPackage.TABLE_ROW__BACKGROUND:
				setBackground((String)newValue);
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
			case BootstrapPackage.TABLE_ROW__CELLS:
				getCells().clear();
				return;
			case BootstrapPackage.TABLE_ROW__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case BootstrapPackage.TABLE_ROW__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
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
			case BootstrapPackage.TABLE_ROW__CELLS:
				return !getCells().isEmpty();
			case BootstrapPackage.TABLE_ROW__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case BootstrapPackage.TABLE_ROW__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? getBackground() != null : !BACKGROUND_EDEFAULT.equals(getBackground());
		}
		return super.eIsSet(featureID);
	}
		
	protected Supplier<ViewBuilder> createCellsBuilderSupplier(Context context) throws Exception {
		Supplier<List<ViewBuilder>> cellBuilderSuppliers = new ListCompoundSupplierFactory<ViewBuilder>("Cells", new ArrayList<>(getCells())).create(context);
		
		Supplier<ViewBuilder> cellsBuilderSupplier = cellBuilderSuppliers.then(cellBuilders -> new ViewBuilder() {

			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				org.nasdanika.html.bootstrap.RowContainer.Row row = (org.nasdanika.html.bootstrap.RowContainer.Row) target;
				for (ViewBuilder cb: cellBuilders) {
					cb.build(row, viewGenerator, progressMonitor);
				}
			}
			
		});
		return cellsBuilderSupplier;
	}		


	@SuppressWarnings("resource")
	@Override
	public Supplier<ViewBuilder> create(Context context) throws Exception {		
		StringMapCompoundSupplier<ViewBuilder> parts = new StringMapCompoundSupplier<>(getTitle());
		
		Appearance appearance = getAppearance();
		if (appearance != null) {
			parts.put("Appearance", appearance.create(context));
		}
		parts.put("Cells", createCellsBuilderSupplier(context));
		
		return parts.then(partsMap -> new ViewBuilder() {
			
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				org.nasdanika.html.bootstrap.RowContainer.Row row = (org.nasdanika.html.bootstrap.RowContainer.Row) target;

				if (!Util.isBlank(getBackground())) {
					row.background(Color.fromLabel(getBackground()));
				}
				if (!Util.isBlank(getColor())) {
					row.color(Color.fromLabel(getColor()));
				}
				
				ViewBuilder appearanceBuilder = partsMap.get("Appearance");
				if (appearanceBuilder != null) {
					appearanceBuilder.build(row, viewGenerator, progressMonitor);
				}
				
				ViewBuilder cellsBuilder = partsMap.get("Cells");
				if (cellsBuilder != null) {
					cellsBuilder.build(row, viewGenerator, progressMonitor);
				}
			}

		});
		
	}

} //TableRowImpl
