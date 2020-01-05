/**
 */
package org.nasdanika.vinci.components.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.html.HTMLElement;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.ncore.impl.ModelElementImpl;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionReference;
import org.nasdanika.vinci.app.impl.ActionFacade;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.components.ActionLink;
import org.nasdanika.vinci.components.ComponentsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.components.impl.ActionLinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.vinci.components.impl.ActionLinkImpl#getAppearance <em>Appearance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionLinkImpl extends ModelElementImpl implements ActionLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.ACTION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractAction getTarget() {
		return (AbstractAction)eDynamicGet(ComponentsPackage.ACTION_LINK__TARGET, ComponentsPackage.Literals.ACTION_LINK__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction basicGetTarget() {
		return (AbstractAction)eDynamicGet(ComponentsPackage.ACTION_LINK__TARGET, ComponentsPackage.Literals.ACTION_LINK__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(AbstractAction newTarget) {
		eDynamicSet(ComponentsPackage.ACTION_LINK__TARGET, ComponentsPackage.Literals.ACTION_LINK__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appearance getAppearance() {
		return (Appearance)eDynamicGet(ComponentsPackage.ACTION_LINK__APPEARANCE, ComponentsPackage.Literals.ACTION_LINK__APPEARANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearance(Appearance newAppearance, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAppearance, ComponentsPackage.ACTION_LINK__APPEARANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppearance(Appearance newAppearance) {
		eDynamicSet(ComponentsPackage.ACTION_LINK__APPEARANCE, ComponentsPackage.Literals.ACTION_LINK__APPEARANCE, newAppearance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.ACTION_LINK__APPEARANCE:
				return basicSetAppearance(null, msgs);
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
			case ComponentsPackage.ACTION_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ComponentsPackage.ACTION_LINK__APPEARANCE:
				return getAppearance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentsPackage.ACTION_LINK__TARGET:
				setTarget((AbstractAction)newValue);
				return;
			case ComponentsPackage.ACTION_LINK__APPEARANCE:
				setAppearance((Appearance)newValue);
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
			case ComponentsPackage.ACTION_LINK__TARGET:
				setTarget((AbstractAction)null);
				return;
			case ComponentsPackage.ACTION_LINK__APPEARANCE:
				setAppearance((Appearance)null);
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
			case ComponentsPackage.ACTION_LINK__TARGET:
				return basicGetTarget() != null;
			case ComponentsPackage.ACTION_LINK__APPEARANCE:
				return getAppearance() != null;
		}
		return super.eIsSet(featureID);
	}
		
	private ActionBase unwrap(AbstractAction target) {
		if (target instanceof ActionBase) {
			return (ActionBase) target;
		}
		
		if (target instanceof ActionReference) {
			return unwrap(((ActionReference) target).getAction());
		}
		
		throw new UnsupportedOperationException("Unwrapping of " + target + " is not supported (yet)");
	}		
	
	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		ActionFacade actionFacade = new ActionFacade(context, unwrap(getTarget()));

		Supplier<ViewPart> ret = Supplier.fromCallable(() -> {
			return new ViewPart() {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					return viewGenerator.link(actionFacade);
				}
				
				@Override
				public String toString() {
					return "Action link view part "+super.toString();
				}
				
			};
		}, getTitle(), 1);
				
		Appearance appearance = getAppearance();
		if (appearance == null) {
			return ret;
		}
		
		return ret.then(appearance.create(context).asFunction()).then(bs -> new ViewPart() {

			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {				
				return bs.getFirst().then(bs.getSecond());
			}
			
		});
		
	}

} //ActionLinkImpl