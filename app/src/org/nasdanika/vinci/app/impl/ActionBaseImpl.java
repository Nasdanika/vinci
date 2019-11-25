/**
 */
package org.nasdanika.vinci.app.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jsoup.Jsoup;
import org.nasdanika.common.CompoundExecutionParticipant;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;
import org.nasdanika.common.ExecutionParticipant;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.MapCompoundSupplierFactory;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.NullProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLElement;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.ApplicationBuilder;
import org.nasdanika.html.app.Decorator;
import org.nasdanika.html.app.NavigationActionActivator;
import org.nasdanika.html.app.ScriptActionActivator;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.ActionApplicationBuilder;
import org.nasdanika.html.app.impl.ActionImpl;
import org.nasdanika.html.bootstrap.BootstrapElement;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionCategory;
import org.nasdanika.vinci.app.ActionElement;
import org.nasdanika.vinci.app.ActionMapping;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.app.ActivatorType;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder;
import org.nasdanika.vinci.app.SectionStyle;
import org.nasdanika.vinci.bootstrap.Appearance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getActionMappings <em>Action Mappings</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getLinkedElements <em>Linked Elements</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getSectionStyle <em>Section Style</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getSectionColumns <em>Section Columns</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getActivator <em>Activator</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getActivatorType <em>Activator Type</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getConfirmation <em>Confirmation</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#isFloatRight <em>Float Right</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#isEmbedded <em>Embedded</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionBaseImpl extends LabelImpl implements ActionBase {
	private static final String ELEMENTS_KEY = "Elements";

	private static final String CONTENT_KEY = "Content";

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final ActionRole ROLE_EDEFAULT = ActionRole.NAVIGATION;

	/**
	 * The default value of the '{@link #getSectionStyle() <em>Section Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionStyle()
	 * @generated
	 * @ordered
	 */
	protected static final SectionStyle SECTION_STYLE_EDEFAULT = SectionStyle.PARAGRAPH;

	/**
	 * The default value of the '{@link #getSectionColumns() <em>Section Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int SECTION_COLUMNS_EDEFAULT = 1;

	/**
	 * The default value of the '{@link #getActivator() <em>Activator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivator()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVATOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getActivatorType() <em>Activator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatorType()
	 * @generated
	 * @ordered
	 */
	protected static final ActivatorType ACTIVATOR_TYPE_EDEFAULT = ActivatorType.REFERENCE;

	/**
	 * The default value of the '{@link #getConfirmation() <em>Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmation()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIRMATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isFloatRight() <em>Float Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFloatRight()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLOAT_RIGHT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isEmbedded() <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBEDDED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.ACTION_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActionElement> getElements() {
		return (EList<ActionElement>)eDynamicGet(AppPackage.ACTION_BASE__ELEMENTS, AppPackage.Literals.CONTAINER__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActionElement> getLinkedElements() {
		return (EList<ActionElement>)eDynamicGet(AppPackage.ACTION_BASE__LINKED_ELEMENTS, AppPackage.Literals.CONTAINER__LINKED_ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActionMapping> getActionMappings() {
		return (EList<ActionMapping>)eDynamicGet(AppPackage.ACTION_BASE__ACTION_MAPPINGS, AppPackage.Literals.ABSTRACT_ACTION__ACTION_MAPPINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionRole getRole() {
		return (ActionRole)eDynamicGet(AppPackage.ACTION_BASE__ROLE, AppPackage.Literals.ACTION_BASE__ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(ActionRole newRole) {
		eDynamicSet(AppPackage.ACTION_BASE__ROLE, AppPackage.Literals.ACTION_BASE__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionStyle getSectionStyle() {
		return (SectionStyle)eDynamicGet(AppPackage.ACTION_BASE__SECTION_STYLE, AppPackage.Literals.ACTION_BASE__SECTION_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSectionStyle(SectionStyle newSectionStyle) {
		eDynamicSet(AppPackage.ACTION_BASE__SECTION_STYLE, AppPackage.Literals.ACTION_BASE__SECTION_STYLE, newSectionStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSectionColumns() {
		return (Integer)eDynamicGet(AppPackage.ACTION_BASE__SECTION_COLUMNS, AppPackage.Literals.ACTION_BASE__SECTION_COLUMNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSectionColumns(int newSectionColumns) {
		eDynamicSet(AppPackage.ACTION_BASE__SECTION_COLUMNS, AppPackage.Literals.ACTION_BASE__SECTION_COLUMNS, newSectionColumns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActivator() {
		return (String)eDynamicGet(AppPackage.ACTION_BASE__ACTIVATOR, AppPackage.Literals.ACTION_BASE__ACTIVATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivator(String newActivator) {
		eDynamicSet(AppPackage.ACTION_BASE__ACTIVATOR, AppPackage.Literals.ACTION_BASE__ACTIVATOR, newActivator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivatorType getActivatorType() {
		return (ActivatorType)eDynamicGet(AppPackage.ACTION_BASE__ACTIVATOR_TYPE, AppPackage.Literals.ACTION_BASE__ACTIVATOR_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivatorType(ActivatorType newActivatorType) {
		eDynamicSet(AppPackage.ACTION_BASE__ACTIVATOR_TYPE, AppPackage.Literals.ACTION_BASE__ACTIVATOR_TYPE, newActivatorType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfirmation() {
		return (String)eDynamicGet(AppPackage.ACTION_BASE__CONFIRMATION, AppPackage.Literals.ACTION_BASE__CONFIRMATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmation(String newConfirmation) {
		eDynamicSet(AppPackage.ACTION_BASE__CONFIRMATION, AppPackage.Literals.ACTION_BASE__CONFIRMATION, newConfirmation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisabled() {
		return (Boolean)eDynamicGet(AppPackage.ACTION_BASE__DISABLED, AppPackage.Literals.ACTION_BASE__DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisabled(boolean newDisabled) {
		eDynamicSet(AppPackage.ACTION_BASE__DISABLED, AppPackage.Literals.ACTION_BASE__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFloatRight() {
		return (Boolean)eDynamicGet(AppPackage.ACTION_BASE__FLOAT_RIGHT, AppPackage.Literals.ACTION_BASE__FLOAT_RIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFloatRight(boolean newFloatRight) {
		eDynamicSet(AppPackage.ACTION_BASE__FLOAT_RIGHT, AppPackage.Literals.ACTION_BASE__FLOAT_RIGHT, newFloatRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEmbedded() {
		return (Boolean)eDynamicGet(AppPackage.ACTION_BASE__EMBEDDED, AppPackage.Literals.ACTION_BASE__EMBEDDED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmbedded(boolean newEmbedded) {
		eDynamicSet(AppPackage.ACTION_BASE__EMBEDDED, AppPackage.Literals.ACTION_BASE__EMBEDDED, newEmbedded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SupplierFactory<Object>> getContent() {
		return (EList<SupplierFactory<Object>>)eDynamicGet(AppPackage.ACTION_BASE__CONTENT, AppPackage.Literals.ACTION_BASE__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Consumer<Object> createConsumer(Context context) throws Exception {
		Supplier<Object> actionSupplier = create(context);
		class Generator extends CompoundExecutionParticipant<ExecutionParticipant> implements Consumer<Object> {

			protected Generator(String name) {
				super(name);
			}
			
			@Override
			public double size() {
				return super.size() + 1;
			}
			
			private Action findById(Action action, String id) {
				if (action != null && id.equals(action.getId())) {
					return action;
				}
				for (Action child: action.getChildren()) {
					Action found = findById(child, id);
					if (found != null) {
						return found;
					}
				}
				return null;
			}

			@Override
			public void execute(Object arg, ProgressMonitor progressMonitor) throws Exception {
				Object action = actionSupplier.splitAndExecute(progressMonitor);
				Action rootAction = (Action) action;
				List<Action> navChildren = rootAction.getNavigationChildren();
				Action principalAction = navChildren.isEmpty() ? null : navChildren.get(0); 
				List<? extends Action> navigationPanelActions = principalAction == null ? Collections.emptyList() : principalAction.getNavigationChildren(); 

				Action activeAction = rootAction;
				String activeActionId = context.getString("active-action");
				if (!Util.isBlank(activeActionId)) {
					Action found = findById(rootAction, activeActionId);
					if (found != null) {
						activeAction = found;
					}
				}

				ApplicationBuilder  applicationBuilder = new ActionApplicationBuilder(rootAction, principalAction, navigationPanelActions, activeAction); 				
				applicationBuilder.build((Application) arg, progressMonitor.split("Building application", 1));				
			}

			@Override
			protected List<ExecutionParticipant> getElements() {
				return Collections.singletonList(actionSupplier);
			}
			
		}		
		
		return new Generator(getTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.ACTION_BASE__ACTION_MAPPINGS:
				return ((InternalEList<?>)getActionMappings()).basicRemove(otherEnd, msgs);
			case AppPackage.ACTION_BASE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case AppPackage.ACTION_BASE__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
			case AppPackage.ACTION_BASE__ACTION_MAPPINGS:
				return getActionMappings();
			case AppPackage.ACTION_BASE__ELEMENTS:
				return getElements();
			case AppPackage.ACTION_BASE__LINKED_ELEMENTS:
				return getLinkedElements();
			case AppPackage.ACTION_BASE__ROLE:
				return getRole();
			case AppPackage.ACTION_BASE__SECTION_STYLE:
				return getSectionStyle();
			case AppPackage.ACTION_BASE__SECTION_COLUMNS:
				return getSectionColumns();
			case AppPackage.ACTION_BASE__ACTIVATOR:
				return getActivator();
			case AppPackage.ACTION_BASE__ACTIVATOR_TYPE:
				return getActivatorType();
			case AppPackage.ACTION_BASE__CONFIRMATION:
				return getConfirmation();
			case AppPackage.ACTION_BASE__DISABLED:
				return isDisabled();
			case AppPackage.ACTION_BASE__FLOAT_RIGHT:
				return isFloatRight();
			case AppPackage.ACTION_BASE__EMBEDDED:
				return isEmbedded();
			case AppPackage.ACTION_BASE__CONTENT:
				return getContent();
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
			case AppPackage.ACTION_BASE__ACTION_MAPPINGS:
				getActionMappings().clear();
				getActionMappings().addAll((Collection<? extends ActionMapping>)newValue);
				return;
			case AppPackage.ACTION_BASE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case AppPackage.ACTION_BASE__LINKED_ELEMENTS:
				getLinkedElements().clear();
				getLinkedElements().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case AppPackage.ACTION_BASE__ROLE:
				setRole((ActionRole)newValue);
				return;
			case AppPackage.ACTION_BASE__SECTION_STYLE:
				setSectionStyle((SectionStyle)newValue);
				return;
			case AppPackage.ACTION_BASE__SECTION_COLUMNS:
				setSectionColumns((Integer)newValue);
				return;
			case AppPackage.ACTION_BASE__ACTIVATOR:
				setActivator((String)newValue);
				return;
			case AppPackage.ACTION_BASE__ACTIVATOR_TYPE:
				setActivatorType((ActivatorType)newValue);
				return;
			case AppPackage.ACTION_BASE__CONFIRMATION:
				setConfirmation((String)newValue);
				return;
			case AppPackage.ACTION_BASE__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case AppPackage.ACTION_BASE__FLOAT_RIGHT:
				setFloatRight((Boolean)newValue);
				return;
			case AppPackage.ACTION_BASE__EMBEDDED:
				setEmbedded((Boolean)newValue);
				return;
			case AppPackage.ACTION_BASE__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends SupplierFactory<Object>>)newValue);
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
			case AppPackage.ACTION_BASE__ACTION_MAPPINGS:
				getActionMappings().clear();
				return;
			case AppPackage.ACTION_BASE__ELEMENTS:
				getElements().clear();
				return;
			case AppPackage.ACTION_BASE__LINKED_ELEMENTS:
				getLinkedElements().clear();
				return;
			case AppPackage.ACTION_BASE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case AppPackage.ACTION_BASE__SECTION_STYLE:
				setSectionStyle(SECTION_STYLE_EDEFAULT);
				return;
			case AppPackage.ACTION_BASE__SECTION_COLUMNS:
				setSectionColumns(SECTION_COLUMNS_EDEFAULT);
				return;
			case AppPackage.ACTION_BASE__ACTIVATOR:
				setActivator(ACTIVATOR_EDEFAULT);
				return;
			case AppPackage.ACTION_BASE__ACTIVATOR_TYPE:
				setActivatorType(ACTIVATOR_TYPE_EDEFAULT);
				return;
			case AppPackage.ACTION_BASE__CONFIRMATION:
				setConfirmation(CONFIRMATION_EDEFAULT);
				return;
			case AppPackage.ACTION_BASE__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case AppPackage.ACTION_BASE__FLOAT_RIGHT:
				setFloatRight(FLOAT_RIGHT_EDEFAULT);
				return;
			case AppPackage.ACTION_BASE__EMBEDDED:
				setEmbedded(EMBEDDED_EDEFAULT);
				return;
			case AppPackage.ACTION_BASE__CONTENT:
				getContent().clear();
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
			case AppPackage.ACTION_BASE__ACTION_MAPPINGS:
				return !getActionMappings().isEmpty();
			case AppPackage.ACTION_BASE__ELEMENTS:
				return !getElements().isEmpty();
			case AppPackage.ACTION_BASE__LINKED_ELEMENTS:
				return !getLinkedElements().isEmpty();
			case AppPackage.ACTION_BASE__ROLE:
				return getRole() != ROLE_EDEFAULT;
			case AppPackage.ACTION_BASE__SECTION_STYLE:
				return getSectionStyle() != SECTION_STYLE_EDEFAULT;
			case AppPackage.ACTION_BASE__SECTION_COLUMNS:
				return getSectionColumns() != SECTION_COLUMNS_EDEFAULT;
			case AppPackage.ACTION_BASE__ACTIVATOR:
				return ACTIVATOR_EDEFAULT == null ? getActivator() != null : !ACTIVATOR_EDEFAULT.equals(getActivator());
			case AppPackage.ACTION_BASE__ACTIVATOR_TYPE:
				return getActivatorType() != ACTIVATOR_TYPE_EDEFAULT;
			case AppPackage.ACTION_BASE__CONFIRMATION:
				return CONFIRMATION_EDEFAULT == null ? getConfirmation() != null : !CONFIRMATION_EDEFAULT.equals(getConfirmation());
			case AppPackage.ACTION_BASE__DISABLED:
				return isDisabled() != DISABLED_EDEFAULT;
			case AppPackage.ACTION_BASE__FLOAT_RIGHT:
				return isFloatRight() != FLOAT_RIGHT_EDEFAULT;
			case AppPackage.ACTION_BASE__EMBEDDED:
				return isEmbedded() != EMBEDDED_EDEFAULT;
			case AppPackage.ACTION_BASE__CONTENT:
				return !getContent().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BootstrapContainerApplicationBuilder.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ActionElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractAction.class) {
			switch (derivedFeatureID) {
				case AppPackage.ACTION_BASE__ACTION_MAPPINGS: return AppPackage.ABSTRACT_ACTION__ACTION_MAPPINGS;
				default: return -1;
			}
		}
		if (baseClass == org.nasdanika.vinci.app.Container.class) {
			switch (derivedFeatureID) {
				case AppPackage.ACTION_BASE__ELEMENTS: return AppPackage.CONTAINER__ELEMENTS;
				case AppPackage.ACTION_BASE__LINKED_ELEMENTS: return AppPackage.CONTAINER__LINKED_ELEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BootstrapContainerApplicationBuilder.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ActionElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractAction.class) {
			switch (baseFeatureID) {
				case AppPackage.ABSTRACT_ACTION__ACTION_MAPPINGS: return AppPackage.ACTION_BASE__ACTION_MAPPINGS;
				default: return -1;
			}
		}
		if (baseClass == org.nasdanika.vinci.app.Container.class) {
			switch (baseFeatureID) {
				case AppPackage.CONTAINER__ELEMENTS: return AppPackage.ACTION_BASE__ELEMENTS;
				case AppPackage.CONTAINER__LINKED_ELEMENTS: return AppPackage.ACTION_BASE__LINKED_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == BootstrapContainerApplicationBuilder.class) {
			switch (baseOperationID) {
				case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_BUILDER___CREATE_CONSUMER__CONTEXT: return AppPackage.ACTION_BASE___CREATE_CONSUMER__CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == ActionElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractAction.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == org.nasdanika.vinci.app.Container.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AppPackage.ACTION_BASE___CREATE_CONSUMER__CONTEXT:
				try {
					return createConsumer((Context)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public Supplier<Object> create(Context context) throws Exception {
		ListCompoundSupplierFactory<Object> contentFactory = new ListCompoundSupplierFactory<Object>(CONTENT_KEY, getContent());
		ListCompoundSupplierFactory<Object> elementsFactory = new ListCompoundSupplierFactory<Object>(ELEMENTS_KEY);

		// Removing all elements which are linked from other objects.
		List<ActionElement> elements = new ArrayList<>(getElements());
		Resource resource = eResource();		
		if (resource != null) {
			ResourceSet resourceSet = resource.getResourceSet();
			TreeIterator<?> cit;
			if (resourceSet == null) {
				cit = resource.getAllContents();
			} else {
				cit = resourceSet.getAllContents();
			}
			while (cit.hasNext()) {
				Object next = cit.next();
				if (next instanceof org.nasdanika.vinci.app.Container) {
					elements.removeAll(((org.nasdanika.vinci.app.Container<?>) next).getLinkedElements());
				}
			}
		}
		
		for (ActionElement e: elements) {
			if (e instanceof AbstractAction) {
				elementsFactory.add((AbstractAction) e); 
			} else {
				for (AbstractAction ce: ((ActionCategory) e).getElements()) {
					elementsFactory.add(ce);
				}
				for (AbstractAction ce: ((ActionCategory) e).getLinkedElements()) {
					elementsFactory.add(ce);
				}
			}
		}
		for (ActionElement e: getLinkedElements()) {
			if (e instanceof AbstractAction) {
				elementsFactory.add((AbstractAction) e);; 
			} else {
				ActionCategory actionCategory = (ActionCategory) e;
				List<AbstractAction> actionCategoryElements = new ArrayList<>(actionCategory.getElements());
				// Removing all elements which are linked from other objects.
				if (resource != null) {
					ResourceSet resourceSet = resource.getResourceSet();
					TreeIterator<?> cit;
					if (resourceSet == null) {
						cit = resource.getAllContents();
					} else {
						cit = resourceSet.getAllContents();
					}
					while (cit.hasNext()) {
						Object next = cit.next();
						if (next instanceof org.nasdanika.vinci.app.Container) {
							actionCategoryElements.removeAll(((org.nasdanika.vinci.app.Container<?>) next).getLinkedElements());
						}
					}
				}
				
				for (AbstractAction ce: actionCategoryElements) {
					elementsFactory.add(ce);
				}
				for (AbstractAction ce: actionCategory.getLinkedElements()) {
					elementsFactory.add(ce);
				}
			}
		}
		MapCompoundSupplierFactory<String, List<Object>> mcs = new MapCompoundSupplierFactory<>("Action");
		mcs.put(CONTENT_KEY, contentFactory);
		mcs.put(ELEMENTS_KEY, elementsFactory);
		
		Appearance appearance = getAppearance();
		@SuppressWarnings("resource")
		Consumer<Object> decorator = appearance == null ? null : appearance.create(context);		
						
		class ActionFacade extends org.nasdanika.html.app.impl.ActionImpl implements Decorator {
			
			private List<Object> content;

			public ActionFacade(Map<String,List<Object>> config) {
				setText(context.interpolate(ActionBaseImpl.this.getText()));
				setId(context.interpolate(ActionBaseImpl.this.getId()));
				setIcon(context.interpolate(ActionBaseImpl.this.getIcon()));
				String color = ActionBaseImpl.this.getColor();
				if (!Util.isBlank(color)) {
					setColor(Color.valueOf(color));
				}
				setOutline(ActionBaseImpl.this.isOutline());
				setNotification(context.interpolate(ActionBaseImpl.this.getNotification()));
				setDisabled(ActionBaseImpl.this.isDisabled());
				setConfirmation(context.interpolate(ActionBaseImpl.this.getConfirmation()));
				setFloatRight(ActionBaseImpl.this.isFloatRight());
				// description
				String mDescription = ActionBaseImpl.this.getDescription();
				String mTooltip = ActionBaseImpl.this.getTooltip();
				if (!Util.isBlank(mDescription)) {
					MarkdownHelper mHelper = new MarkdownHelper();
					setDescription(mHelper.markdownToHtml(mDescription));
					if (Util.isBlank(mTooltip)) {
						String textDoc = Jsoup.parse(getDescription()).text();
						setTooltip(mHelper.firstSentence(textDoc));					

					}
				}
				// tooltip
				if (!Util.isBlank(mTooltip)) {
					setTooltip(mTooltip);
				}
				// activator
				String activator = ActionBaseImpl.this.getActivator();
				
				switch (ActionBaseImpl.this.getActivatorType()) {
				case NONE:
					// No activator
					break;
				case BIND:
					throw new UnsupportedOperationException("Not implemented yet");
				case REFERENCE:
					if (Util.isBlank(activator) && !Util.isBlank(ActionBaseImpl.this.getId())) {
						activator = ActionBaseImpl.this.getId() + ".html";
					}
					String url = context.interpolate(activator);
					if (Util.isBlank(url)) {
						throw new IllegalArgumentException("Activator type is reference and activator URL is blank");
					}
					setActivator(new NavigationActionActivator() {
						
						@Override
						public String getUrl() {
							return url;
						}
						
					});
					break;
				case SCRIPT:
					String code = context.interpolate(activator);
					if (Util.isBlank(code)) {
						throw new IllegalArgumentException("Activator type is script and activator code is blank");
					}
					setActivator(new ScriptActionActivator() {
						
						@Override
						public String getCode() {
							return code;
						}
						
					});
					break;					
				default:
					throw new IllegalArgumentException();
				}
				
				// category - TODO
				
				switch (ActionBaseImpl.this.getRole()) {
				case CONTEXT:
					getRoles().add(Action.Role.CONTEXT);
					break;
				case EDIT:
					getRoles().add(Action.Role.EDIT);
					break;
				case NAVIGATION:
					getRoles().add(Action.Role.NAVIGATION);
					break;
				case SECTION:
					getRoles().add(Action.Role.SECTION);
					break;
				case VIEW:
					getRoles().add(Action.Role.VIEW);
					break;
				default:
					getRoles().add(ActionBaseImpl.this.getRole().name());
					break;				
				}
				
				content = config.get(CONTENT_KEY);
				
				for (Object child: config.get(ELEMENTS_KEY)) {
					ActionImpl childAction = (org.nasdanika.html.app.impl.ActionImpl) child;
					getChildren().add(childAction);
					childAction.setParent(this);					
				}
			}
			
			@Override
			public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				Fragment ret = viewGenerator.get(HTMLFactory.class, HTMLFactory.INSTANCE).fragment();
				content.forEach(ret);
				return ret;
			}

			@Override
			public void decorate(Object target, ViewGenerator viewGenerator) {
				if (decorator != null) {
					try {
						if (target instanceof BootstrapElement) {
								decorator.execute(target, new NullProgressMonitor());
						} else if (target instanceof HTMLElement) {
							decorator.execute(viewGenerator.get(BootstrapFactory.class, BootstrapFactory.INSTANCE).wrap((HTMLElement<?>) target), new NullProgressMonitor());
						}
					} catch (Exception e) {
						e.printStackTrace(); // TODO - improve handling, but shall not happen.
					}
				}
			}
			
		};
		
		return mcs.create(context).then(ActionFacade::new);
	}

} //ActionBaseImpl
