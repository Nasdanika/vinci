/**
 */
package org.nasdanika.vinci.app.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.CompoundExecutionParticipant;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;
import org.nasdanika.common.ExecutionParticipant;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.MapCompoundSupplierFactory;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reference;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.html.app.Action;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.ApplicationBuilder;
import org.nasdanika.html.app.impl.ActionApplicationBuilder;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionCategory;
import org.nasdanika.vinci.app.ActionElement;
import org.nasdanika.vinci.app.ActionMapping;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.app.ActivatorType;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.components.ComponentsFactory;
import org.nasdanika.vinci.components.MarkdownText;

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
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#isEmbedded <em>Embedded</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getMarkdownContent <em>Markdown Content</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionBaseImpl extends LabelImpl implements ActionBase {

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
	protected static final String SECTION_STYLE_EDEFAULT = null;

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
	 * The default value of the '{@link #isEmbedded() <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBEDDED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getMarkdownContent() <em>Markdown Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkdownContent()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKDOWN_CONTENT_EDEFAULT = null;

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
	public String getSectionStyle() {
		return (String)eDynamicGet(AppPackage.ACTION_BASE__SECTION_STYLE, AppPackage.Literals.ACTION_BASE__SECTION_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSectionStyle(String newSectionStyle) {
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
	@Override
	public String getMarkdownContent() {
		return (String)eDynamicGet(AppPackage.ACTION_BASE__MARKDOWN_CONTENT, AppPackage.Literals.ACTION_BASE__MARKDOWN_CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkdownContent(String newMarkdownContent) {
		eDynamicSet(AppPackage.ACTION_BASE__MARKDOWN_CONTENT, AppPackage.Literals.ACTION_BASE__MARKDOWN_CONTENT, newMarkdownContent);
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
				List<Action> navigationPanelActions = principalAction == null ? Collections.emptyList() : principalAction.getNavigationChildren(); 

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
			case AppPackage.ACTION_BASE__EMBEDDED:
				return isEmbedded();
			case AppPackage.ACTION_BASE__MARKDOWN_CONTENT:
				return getMarkdownContent();
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
				setSectionStyle((String)newValue);
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
			case AppPackage.ACTION_BASE__EMBEDDED:
				setEmbedded((Boolean)newValue);
				return;
			case AppPackage.ACTION_BASE__MARKDOWN_CONTENT:
				setMarkdownContent((String)newValue);
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
			case AppPackage.ACTION_BASE__EMBEDDED:
				setEmbedded(EMBEDDED_EDEFAULT);
				return;
			case AppPackage.ACTION_BASE__MARKDOWN_CONTENT:
				setMarkdownContent(MARKDOWN_CONTENT_EDEFAULT);
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
				return SECTION_STYLE_EDEFAULT == null ? getSectionStyle() != null : !SECTION_STYLE_EDEFAULT.equals(getSectionStyle());
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
			case AppPackage.ACTION_BASE__EMBEDDED:
				return isEmbedded() != EMBEDDED_EDEFAULT;
			case AppPackage.ACTION_BASE__MARKDOWN_CONTENT:
				return MARKDOWN_CONTENT_EDEFAULT == null ? getMarkdownContent() != null : !MARKDOWN_CONTENT_EDEFAULT.equals(getMarkdownContent());
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
		
		MutableContext actionContext = context.fork();
		new ActionMappingsPropertyComputer("action-mappings", getActionMappings()).put(actionContext);

		String ELEMENTS_KEY = "Elements";		
		String CONTENT_KEY = "Content";			
		
		List<SupplierFactory<Object>> content = new ArrayList<>();		
		
		if (!Util.isBlank(getMarkdownContent())) {
			MarkdownText markdownText = ComponentsFactory.eINSTANCE.createMarkdownText();
			markdownText.setStyle(true);
			markdownText.setInterpolate(true);
			markdownText.setMarkdown(getMarkdownContent());
			content.add(markdownText);
		}
		
		content.addAll(getContent());
		
		ListCompoundSupplierFactory<Object> contentFactory = new ListCompoundSupplierFactory<Object>(CONTENT_KEY, content);
		
		ListCompoundSupplierFactory<Object> elementsFactory = new ListCompoundSupplierFactory<Object>(ELEMENTS_KEY);

		// Removing all elements which are linked from other objects.
		List<ActionElement> elements = new ArrayList<>(getElements());
		Resource resource = eResource();	
		Reference<EObject> parentRef = new Reference<>(eContainer());
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
					EList<?> nLinkedElements = ((org.nasdanika.vinci.app.Container<?>) next).getLinkedElements();
					elements.removeAll(nLinkedElements);
					if (nLinkedElements.contains(this)) {
						parentRef.set((EObject) next);
					}
				}
			}
		}
		
		for (ActionElement e: elements) {
			if (e instanceof AbstractAction) {
				elementsFactory.add((AbstractAction) e); 
			} else { // ActionCategory
				for (ActionElement ce: ((ActionCategory) e).getElements()) {
					if (ce instanceof AbstractAction) {
						elementsFactory.add((AbstractAction) ce);
					}
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
		Consumer<Object> decorator = appearance == null ? null : appearance.create(actionContext);								
		
		return mcs.create(actionContext).then(config -> new ActionFacade(
				actionContext, 
				ActionBaseImpl.this, 
				parentRef.get(), 
				decorator, 
				config.get(CONTENT_KEY), 
				config.get(ELEMENTS_KEY)));
	}

} //ActionBaseImpl
