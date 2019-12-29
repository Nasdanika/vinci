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
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.Row;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.ContainerImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.ContainerImpl#isFluid <em>Fluid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends BootstrapElementImpl implements org.nasdanika.vinci.bootstrap.Container {
	/**
	 * The default value of the '{@link #isFluid() <em>Fluid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFluid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLUID_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Row> getRows() {
		return (EList<Row>)eDynamicGet(BootstrapPackage.CONTAINER__ROWS, BootstrapPackage.Literals.CONTAINER__ROWS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFluid() {
		return (Boolean)eDynamicGet(BootstrapPackage.CONTAINER__FLUID, BootstrapPackage.Literals.CONTAINER__FLUID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFluid(boolean newFluid) {
		eDynamicSet(BootstrapPackage.CONTAINER__FLUID, BootstrapPackage.Literals.CONTAINER__FLUID, newFluid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.CONTAINER__ROWS:
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
			case BootstrapPackage.CONTAINER__ROWS:
				return getRows();
			case BootstrapPackage.CONTAINER__FLUID:
				return isFluid();
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
			case BootstrapPackage.CONTAINER__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends Row>)newValue);
				return;
			case BootstrapPackage.CONTAINER__FLUID:
				setFluid((Boolean)newValue);
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
			case BootstrapPackage.CONTAINER__ROWS:
				getRows().clear();
				return;
			case BootstrapPackage.CONTAINER__FLUID:
				setFluid(FLUID_EDEFAULT);
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
			case BootstrapPackage.CONTAINER__ROWS:
				return !getRows().isEmpty();
			case BootstrapPackage.CONTAINER__FLUID:
				return isFluid() != FLUID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		@SuppressWarnings("resource")
		MapCompoundSupplier<String,Object> builderSuppliers = new MapCompoundSupplier<>("Builders");
		Appearance appearance = getAppearance();
		if (appearance != null) {
			builderSuppliers.put("Appearance", (Supplier) appearance.create(context));
		}
		ListCompoundSupplier<ViewBuilder> rowBuilders = new ListCompoundSupplier<>("Rows");
		for (Row row: getRows()) {
			rowBuilders.add(row.create(context));
		}
		builderSuppliers.put("Rows", (Supplier) rowBuilders);
		
		return builderSuppliers.then(builders -> new ViewPart() {
				
			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				BootstrapFactory bootstrapFactory = viewGenerator.get(BootstrapFactory.class);
				org.nasdanika.html.bootstrap.Container container = isFluid() ? bootstrapFactory.fluidContainer() : bootstrapFactory.container();
				Object appearanceBuilder = builders.get("Appearance");
				if (appearanceBuilder instanceof ViewBuilder) {
					((ViewBuilder) appearanceBuilder).build(container, viewGenerator, progressMonitor);
				}
				
				for (ViewBuilder rowBuilder: (List<ViewBuilder>) builders.get("Rows")) {
					rowBuilder.build(container.row(), viewGenerator, progressMonitor);
				}
				
				return container;				
			}
				
		});				
	}

} //ContainerImpl
