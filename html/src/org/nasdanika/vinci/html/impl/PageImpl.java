/**
 */
package org.nasdanika.vinci.html.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Context;
import org.nasdanika.common.Function;
import org.nasdanika.common.FunctionFactory;
import org.nasdanika.common.ListCompoundSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.StringMapCompoundSupplier;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLPage;
import org.nasdanika.ncore.impl.NamedElementImpl;
import org.nasdanika.vinci.html.HtmlPackage;
import org.nasdanika.vinci.html.Page;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.html.impl.PageImpl#getHead <em>Head</em>}</li>
 *   <li>{@link org.nasdanika.vinci.html.impl.PageImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.vinci.html.impl.PageImpl#getBuilders <em>Builders</em>}</li>
 *   <li>{@link org.nasdanika.vinci.html.impl.PageImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.vinci.html.impl.PageImpl#getStylesheets <em>Stylesheets</em>}</li>
 *   <li>{@link org.nasdanika.vinci.html.impl.PageImpl#getScripts <em>Scripts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends NamedElementImpl implements Page {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SupplierFactory<Object>> getHead() {
		return (EList<SupplierFactory<Object>>)eDynamicGet(HtmlPackage.PAGE__HEAD, HtmlPackage.Literals.PAGE__HEAD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SupplierFactory<Object>> getBody() {
		return (EList<SupplierFactory<Object>>)eDynamicGet(HtmlPackage.PAGE__BODY, HtmlPackage.Literals.PAGE__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FunctionFactory<Object, Object>> getBuilders() {
		return (EList<FunctionFactory<Object, Object>>)eDynamicGet(HtmlPackage.PAGE__BUILDERS, HtmlPackage.Literals.PAGE__BUILDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return (String)eDynamicGet(HtmlPackage.PAGE__LANGUAGE, HtmlPackage.Literals.PAGE__LANGUAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		eDynamicSet(HtmlPackage.PAGE__LANGUAGE, HtmlPackage.Literals.PAGE__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getStylesheets() {
		return (EList<String>)eDynamicGet(HtmlPackage.PAGE__STYLESHEETS, HtmlPackage.Literals.PAGE__STYLESHEETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getScripts() {
		return (EList<String>)eDynamicGet(HtmlPackage.PAGE__SCRIPTS, HtmlPackage.Literals.PAGE__SCRIPTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlPackage.PAGE__HEAD:
				return ((InternalEList<?>)getHead()).basicRemove(otherEnd, msgs);
			case HtmlPackage.PAGE__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
			case HtmlPackage.PAGE__BUILDERS:
				return ((InternalEList<?>)getBuilders()).basicRemove(otherEnd, msgs);
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
			case HtmlPackage.PAGE__HEAD:
				return getHead();
			case HtmlPackage.PAGE__BODY:
				return getBody();
			case HtmlPackage.PAGE__BUILDERS:
				return getBuilders();
			case HtmlPackage.PAGE__LANGUAGE:
				return getLanguage();
			case HtmlPackage.PAGE__STYLESHEETS:
				return getStylesheets();
			case HtmlPackage.PAGE__SCRIPTS:
				return getScripts();
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
			case HtmlPackage.PAGE__HEAD:
				getHead().clear();
				getHead().addAll((Collection<? extends SupplierFactory<Object>>)newValue);
				return;
			case HtmlPackage.PAGE__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends SupplierFactory<Object>>)newValue);
				return;
			case HtmlPackage.PAGE__BUILDERS:
				getBuilders().clear();
				getBuilders().addAll((Collection<? extends FunctionFactory<Object, Object>>)newValue);
				return;
			case HtmlPackage.PAGE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case HtmlPackage.PAGE__STYLESHEETS:
				getStylesheets().clear();
				getStylesheets().addAll((Collection<? extends String>)newValue);
				return;
			case HtmlPackage.PAGE__SCRIPTS:
				getScripts().clear();
				getScripts().addAll((Collection<? extends String>)newValue);
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
			case HtmlPackage.PAGE__HEAD:
				getHead().clear();
				return;
			case HtmlPackage.PAGE__BODY:
				getBody().clear();
				return;
			case HtmlPackage.PAGE__BUILDERS:
				getBuilders().clear();
				return;
			case HtmlPackage.PAGE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case HtmlPackage.PAGE__STYLESHEETS:
				getStylesheets().clear();
				return;
			case HtmlPackage.PAGE__SCRIPTS:
				getScripts().clear();
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
			case HtmlPackage.PAGE__HEAD:
				return !getHead().isEmpty();
			case HtmlPackage.PAGE__BODY:
				return !getBody().isEmpty();
			case HtmlPackage.PAGE__BUILDERS:
				return !getBuilders().isEmpty();
			case HtmlPackage.PAGE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? getLanguage() != null : !LANGUAGE_EDEFAULT.equals(getLanguage());
			case HtmlPackage.PAGE__STYLESHEETS:
				return !getStylesheets().isEmpty();
			case HtmlPackage.PAGE__SCRIPTS:
				return !getScripts().isEmpty();
		}
		return super.eIsSet(featureID);
	}
		
	protected Supplier<List<Object>> createHeadSupplier(Context context) throws Exception {
		ListCompoundSupplier<Object> ret = new ListCompoundSupplier<Object>("Head");		
		for (SupplierFactory<Object> ce: getHead()) {
			ret.add(ce.create(context));
		}
		
		return ret;
	}
	
	protected Supplier<List<Object>> createBodySupplier(Context context) throws Exception {
		ListCompoundSupplier<Object> ret = new ListCompoundSupplier<Object>("Body");		
		for (SupplierFactory<Object> ce: getBody()) {
			ret.add(ce.create(context));
		}
		
		return ret;
	}
	
	/**
	 * Override in sub-classes to create a specialized page.
	 * @param context
	 * @return
	 */
	protected HTMLPage createPage(Context context) {
		return context.get(HTMLFactory.class, HTMLFactory.INSTANCE).page();
	}
	
	@Override
	public Supplier<Object> create(Context context) throws Exception {
		StringMapCompoundSupplier<List<Object>> partsSupplier = new StringMapCompoundSupplier<>(getTitle());
		partsSupplier.put(createHeadSupplier(context));
		partsSupplier.put(createBodySupplier(context));

		Function<Map<String,List<Object>>,Object> pageBuilder = new Function<Map<String,List<Object>>,Object>() {

			@Override
			public double size() {
				return 1;
			}

			@Override
			public String name() {
				return "Page";
			}

			@Override
			public Object execute(Map<String, List<Object>> arg, ProgressMonitor progressMonitor) throws Exception {
				HTMLPage page = createPage(context);
				
				for (Object c: arg.get("Head")) {
					page.head(c);
				}
				
				for (Object c: arg.get("Body")) {
					page.body(c);
				}
				
				for (String script: getScripts()) {
					if (!Util.isBlank(script)) {
						page.script(context.interpolate(script));						
					}
				}

				for (String stylesheet: getStylesheets()) {
					if (!Util.isBlank(stylesheet)) {
						page.stylesheet(context.interpolate(stylesheet));						
					}
				}

				String name = context.interpolate(PageImpl.this.getName());
				if (!Util.isBlank(name)) {
					page.title(name);
				}
				
				return page;
			}
		}; 
		
		Supplier<Object> ret = partsSupplier.then(pageBuilder);
		
		for (FunctionFactory<Object, Object> builder: getBuilders()) {
			ret = ret.then(builder.create(context));
		}
				
		return ret;
	}

} //PageImpl
