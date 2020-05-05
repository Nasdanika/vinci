/**
 */
package org.nasdanika.vinci.app.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Context;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.ListCompoundSupplierFactory;
import org.nasdanika.common.MapCompoundSupplierFactory;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reference;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.ncore.Configurable;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionCategory;
import org.nasdanika.vinci.app.ActionElement;
import org.nasdanika.vinci.app.ActionMapping;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.app.ActivatorType;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder;
import org.nasdanika.vinci.app.Widget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getConfiguration <em>Configuration</em>}</li>
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
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getPageTemplate <em>Page Template</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.impl.ActionBaseImpl#getWidgets <em>Widgets</em>}</li>
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
	protected static final String ROLE_EDEFAULT = "Navigation";

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
	protected static final int SECTION_COLUMNS_EDEFAULT = 3;

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
	 * The default value of the '{@link #getPageTemplate() <em>Page Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_TEMPLATE_EDEFAULT = null;

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
	public EList<SupplierFactory<Object>> getConfiguration() {
		return (EList<SupplierFactory<Object>>)eDynamicGet(AppPackage.ACTION_BASE__CONFIGURATION, NcorePackage.Literals.CONFIGURABLE__CONFIGURATION, true, true);
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
	public String getRole() {
		return (String)eDynamicGet(AppPackage.ACTION_BASE__ROLE, AppPackage.Literals.ACTION_BASE__ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
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
	@Override
	public String getPageTemplate() {
		return (String)eDynamicGet(AppPackage.ACTION_BASE__PAGE_TEMPLATE, AppPackage.Literals.ACTION_BASE__PAGE_TEMPLATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageTemplate(String newPageTemplate) {
		eDynamicSet(AppPackage.ACTION_BASE__PAGE_TEMPLATE, AppPackage.Literals.ACTION_BASE__PAGE_TEMPLATE, newPageTemplate);
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Widget> getWidgets() {
		return (EList<Widget>)eDynamicGet(AppPackage.ACTION_BASE__WIDGETS, AppPackage.Literals.ACTION_BASE__WIDGETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Supplier<Object> createApplicationBuilderSupplier(Context context) throws Exception {
		return ActionBase.super.createApplicationBuilderSupplier(context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.ACTION_BASE__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
			case AppPackage.ACTION_BASE__ACTION_MAPPINGS:
				return ((InternalEList<?>)getActionMappings()).basicRemove(otherEnd, msgs);
			case AppPackage.ACTION_BASE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case AppPackage.ACTION_BASE__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case AppPackage.ACTION_BASE__WIDGETS:
				return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
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
			case AppPackage.ACTION_BASE__CONFIGURATION:
				return getConfiguration();
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
			case AppPackage.ACTION_BASE__PAGE_TEMPLATE:
				return getPageTemplate();
			case AppPackage.ACTION_BASE__CONTENT:
				return getContent();
			case AppPackage.ACTION_BASE__WIDGETS:
				return getWidgets();
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
			case AppPackage.ACTION_BASE__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends SupplierFactory<Object>>)newValue);
				return;
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
				setRole((String)newValue);
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
			case AppPackage.ACTION_BASE__PAGE_TEMPLATE:
				setPageTemplate((String)newValue);
				return;
			case AppPackage.ACTION_BASE__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends SupplierFactory<Object>>)newValue);
				return;
			case AppPackage.ACTION_BASE__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends Widget>)newValue);
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
			case AppPackage.ACTION_BASE__CONFIGURATION:
				getConfiguration().clear();
				return;
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
			case AppPackage.ACTION_BASE__PAGE_TEMPLATE:
				setPageTemplate(PAGE_TEMPLATE_EDEFAULT);
				return;
			case AppPackage.ACTION_BASE__CONTENT:
				getContent().clear();
				return;
			case AppPackage.ACTION_BASE__WIDGETS:
				getWidgets().clear();
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
			case AppPackage.ACTION_BASE__CONFIGURATION:
				return !getConfiguration().isEmpty();
			case AppPackage.ACTION_BASE__ACTION_MAPPINGS:
				return !getActionMappings().isEmpty();
			case AppPackage.ACTION_BASE__ELEMENTS:
				return !getElements().isEmpty();
			case AppPackage.ACTION_BASE__LINKED_ELEMENTS:
				return !getLinkedElements().isEmpty();
			case AppPackage.ACTION_BASE__ROLE:
				return ROLE_EDEFAULT == null ? getRole() != null : !ROLE_EDEFAULT.equals(getRole());
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
			case AppPackage.ACTION_BASE__PAGE_TEMPLATE:
				return PAGE_TEMPLATE_EDEFAULT == null ? getPageTemplate() != null : !PAGE_TEMPLATE_EDEFAULT.equals(getPageTemplate());
			case AppPackage.ACTION_BASE__CONTENT:
				return !getContent().isEmpty();
			case AppPackage.ACTION_BASE__WIDGETS:
				return !getWidgets().isEmpty();
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
		if (baseClass == Configurable.class) {
			switch (derivedFeatureID) {
				case AppPackage.ACTION_BASE__CONFIGURATION: return NcorePackage.CONFIGURABLE__CONFIGURATION;
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
		if (baseClass == Configurable.class) {
			switch (baseFeatureID) {
				case NcorePackage.CONFIGURABLE__CONFIGURATION: return AppPackage.ACTION_BASE__CONFIGURATION;
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
				case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_BUILDER___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT: return AppPackage.ACTION_BASE___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == ActionElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Configurable.class) {
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
			case AppPackage.ACTION_BASE___CREATE_APPLICATION_BUILDER_SUPPLIER__CONTEXT:
				try {
					return createApplicationBuilderSupplier((Context)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public Supplier<Object> create(Context context) throws Exception {
		
		String ELEMENTS_KEY = "Elements";		
		String CONTENT_KEY = "Content";			
		
		// Effective parent.
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
					if (((org.nasdanika.vinci.app.Container<?>) next).getLinkedElements().contains(this)) {
						parentRef.set((EObject) next);
					}
				}
			}
		}
		
		ListCompoundSupplierFactory<Object> elementsFactory = new ListCompoundSupplierFactory<Object>(ELEMENTS_KEY);

		for (ActionElement e: getEffectiveElements()) {
			if (e instanceof AbstractAction) {
				elementsFactory.add((AbstractAction) e); 
			} else { // ActionCategory
				for (ActionElement ce: ((ActionCategory) e).getEffectiveElements()) {
					if (ce instanceof AbstractAction) {
						elementsFactory.add((AbstractAction) ce);
					}
				}
			}
		}
		
		MapCompoundSupplierFactory<String, List<Object>> mcs = new MapCompoundSupplierFactory<>("Action");		
		
		List<SupplierFactory<Object>> content = new ArrayList<>();		
		
		String markdown = getMarkdownContent();
		if (!Util.isBlank(markdown)) {
			SupplierFactory<Object> markdownSupplierFactory = SupplierFactory.from((ctx, progressMonidor) -> new ViewPart() {

				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					String html = ctx.interpolate(MarkdownHelper.INSTANCE.markdownToHtml(markdown).trim());
					return TagName.div.create(viewGenerator.interpolate(html)).addClass("markdown-body"); // Double interpolation for mapping expansion
				}
				
			},  "Markdown content", 1);
			content.add(markdownSupplierFactory);
		}
				
		content.addAll(getContent());		
		mcs.put(CONTENT_KEY, new ListCompoundSupplierFactory<Object>(CONTENT_KEY, content));
		
		mcs.put(ELEMENTS_KEY, elementsFactory);
				
		URI navigationActivatorURI = getNavigationActivatorURI(context);		
		
		FunctionFactory<Map<String, List<Object>>, Object> actionFacadeFactory = new FunctionFactory<Map<String,List<Object>>, Object>() {
			
			@Override
			public org.nasdanika.common.Function<Map<String, List<Object>>, Object> create(Context functionContext) throws Exception {
					BiFunction<Map<String, List<Object>>, ProgressMonitor, Object> ret = (config, progressMonitor) -> {
					try { 
						return new ActionFacade(
							functionContext, 
							ActionBaseImpl.this, 
							navigationActivatorURI,
							parentRef.get(), 
							config.get(CONTENT_KEY), 
							config.get(ELEMENTS_KEY));
					} catch (Exception e) {
						throw new NasdanikaException(e);
					}
				};
				return org.nasdanika.common.Function.fromBiFunction(ret, "Action facade", 1);
			}
		};
				
		MutableContext actionContext = context.fork();
		if (navigationActivatorURI != null) {
			actionContext.register(URI.class, navigationActivatorURI);
		}		
		
		new ActionMappingsPropertyComputer(context, "action-mappings", getActionMappings()).put(actionContext);
		
		return configure(mcs.then(actionFacadeFactory)).create(actionContext);
	}
		
	/**
	 * If action role is reference resolves its activator to URI. Returns null otherwise.
	 * @param context
	 * @return
	 */
	private URI getNavigationActivatorURI(Context context) {
		// Context URI service - used by the Action facade and by child elements.
		if (getActivatorType() != ActivatorType.REFERENCE) {
			return null;
		}
			String activator = getActivator();
			if (Util.isBlank(activator) && !Util.isBlank(getId())) {
				activator = getId() + ".html";
				if (ActionRole.SECTION.label.equals(getRole())) {
					activator += "#" + getId();
				}
			}
			String activatorStr = context.interpolate(activator);
			if (Util.isBlank(activatorStr)) {
				throw new IllegalArgumentException("Activator type is reference and activator URL is blank");
			}
			
			URI actionURI = URI.createURI(activatorStr);
			URI contextURI = context.get(URI.class);
			return contextURI == null || !contextURI.isHierarchical() || contextURI.isRelative() ? actionURI : actionURI.resolve(contextURI);
	}
	

} //ActionBaseImpl
