/**
 */
package org.nasdanika.vinci.components.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.Context;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.app.viewparts.TableOfActionsViewPart;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.impl.ActionFacade;
import org.nasdanika.vinci.components.ComponentsPackage;
import org.nasdanika.vinci.components.TableOfActions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Of Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.impl.TableOfActionsImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableOfActionsImpl extends TableOfContentsImpl implements TableOfActions {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableOfActionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.TABLE_OF_ACTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractAction> getActions() {
		return (EList<AbstractAction>)eDynamicGet(ComponentsPackage.TABLE_OF_ACTIONS__ACTIONS, ComponentsPackage.Literals.TABLE_OF_ACTIONS__ACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.TABLE_OF_ACTIONS__ACTIONS:
				return getActions();
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
			case ComponentsPackage.TABLE_OF_ACTIONS__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends AbstractAction>)newValue);
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
			case ComponentsPackage.TABLE_OF_ACTIONS__ACTIONS:
				getActions().clear();
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
			case ComponentsPackage.TABLE_OF_ACTIONS__ACTIONS:
				return !getActions().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	protected Supplier<ViewPart> createTableOfContents(Context context) throws Exception {
		List<org.nasdanika.html.app.Action> actionFacades = new ArrayList<>();
		for (AbstractAction action: getActions()) {
			actionFacades.add(new ActionFacade(context, ActionLinkImpl.unwrap(action)));
		}
		
		TableOfActionsViewPart tableOfActionsViewPart = new TableOfActionsViewPart(
				actionFacades, 
				context.interpolate(getHeader()), 
				isDescriptions(), 
				isTooltips(),
				getDepth());
		
		tableOfActionsViewPart.setBordered(isBordered());
		tableOfActionsViewPart.setBorderless(isBorderless());
		tableOfActionsViewPart.setDark(isDark());
		tableOfActionsViewPart.setHover(isHover());
		tableOfActionsViewPart.setSmall(isSmall());
		tableOfActionsViewPart.setStriped(isStriped());
		
		return Supplier.from(tableOfActionsViewPart, getTitle());
	}

} //TableOfActionsImpl
