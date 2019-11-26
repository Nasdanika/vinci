/**
 */
package org.nasdanika.vinci.app.util;

import java.util.Arrays;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.common.Util;
import org.nasdanika.emf.DiagnosticHelper;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.vinci.app.AbstractAction;
import org.nasdanika.vinci.app.Action;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.ActionCategory;
import org.nasdanika.vinci.app.ActionElement;
import org.nasdanika.vinci.app.ActionLink;
import org.nasdanika.vinci.app.ActionMapping;
import org.nasdanika.vinci.app.ActionReference;
import org.nasdanika.vinci.app.ActionRole;
import org.nasdanika.vinci.app.ActivatorType;
import org.nasdanika.vinci.app.AppPackage;
import org.nasdanika.vinci.app.BootstrapContainerApplication;
import org.nasdanika.vinci.app.BootstrapContainerApplicationBuilder;
import org.nasdanika.vinci.app.BootstrapContainerApplicationPanel;
import org.nasdanika.vinci.app.BootstrapContainerApplicationSection;
import org.nasdanika.vinci.app.Category;
import org.nasdanika.vinci.app.Container;
import org.nasdanika.vinci.app.Label;
import org.nasdanika.vinci.app.Partition;
import org.nasdanika.vinci.app.SectionStyle;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.vinci.app.AppPackage
 * @generated
 */
public class AppValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AppValidator INSTANCE = new AppValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.nasdanika.vinci.app";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AppPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AppPackage.CONTAINER:
				return validateContainer((Container<?>)value, diagnostics, context);
			case AppPackage.LABEL:
				return validateLabel((Label)value, diagnostics, context);
			case AppPackage.CATEGORY:
				return validateCategory((Category<?>)value, diagnostics, context);
			case AppPackage.ACTION_ELEMENT:
				return validateActionElement((ActionElement)value, diagnostics, context);
			case AppPackage.ABSTRACT_ACTION:
				return validateAbstractAction((AbstractAction)value, diagnostics, context);
			case AppPackage.ACTION_CATEGORY:
				return validateActionCategory((ActionCategory)value, diagnostics, context);
			case AppPackage.ACTION_BASE:
				return validateActionBase((ActionBase)value, diagnostics, context);
			case AppPackage.ACTION_MAPPING:
				return validateActionMapping((ActionMapping)value, diagnostics, context);
			case AppPackage.ACTION_LINK:
				return validateActionLink((ActionLink)value, diagnostics, context);
			case AppPackage.ACTION_REFERENCE:
				return validateActionReference((ActionReference)value, diagnostics, context);
			case AppPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case AppPackage.PARTITION:
				return validatePartition((Partition)value, diagnostics, context);
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION:
				return validateBootstrapContainerApplication((BootstrapContainerApplication)value, diagnostics, context);
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_SECTION:
				return validateBootstrapContainerApplicationSection((BootstrapContainerApplicationSection)value, diagnostics, context);
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_PANEL:
				return validateBootstrapContainerApplicationPanel((BootstrapContainerApplicationPanel)value, diagnostics, context);
			case AppPackage.BOOTSTRAP_CONTAINER_APPLICATION_BUILDER:
				return validateBootstrapContainerApplicationBuilder((BootstrapContainerApplicationBuilder)value, diagnostics, context);
			case AppPackage.ACTION_ROLE:
				return validateActionRole((ActionRole)value, diagnostics, context);
			case AppPackage.SECTION_STYLE:
				return validateSectionStyle((SectionStyle)value, diagnostics, context);
			case AppPackage.ACTIVATOR_TYPE:
				return validateActivatorType((ActivatorType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container<?> container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(container, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabel(Label label, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(label, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(label, diagnostics, context);
		if (result || diagnostics != null) result &= validateLabel_color(label, diagnostics, context);
		return result;
	}

	/**
	 * Validates the color constraint of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLabel_color(Label label, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null && !Util.isBlank(label.getColor())) {			
			DiagnosticHelper helper = new DiagnosticHelper(diagnostics, DIAGNOSTIC_SOURCE, 0, label);
			try {
				Color.valueOf(label.getColor());				
			} catch (Exception e) {
				helper.error("Invalid color: "+label.getColor()+", shall be one of Color enum constants: " + Arrays.toString(Color.values()), AppPackage.Literals.LABEL__COLOR);
			}
			return helper.isSuccess();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory(Category<?> category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(category, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= validateLabel_color(category, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionElement(ActionElement actionElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractAction(AbstractAction abstractAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionCategory(ActionCategory actionCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actionCategory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actionCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actionCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actionCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actionCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actionCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actionCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actionCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actionCategory, diagnostics, context);
		if (result || diagnostics != null) result &= validateLabel_color(actionCategory, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionBase(ActionBase actionBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actionBase, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actionBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actionBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actionBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actionBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actionBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actionBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actionBase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actionBase, diagnostics, context);
		if (result || diagnostics != null) result &= validateLabel_color(actionBase, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionMapping(ActionMapping actionMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionLink(ActionLink actionLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionReference(ActionReference actionReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(action, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validateLabel_color(action, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartition(Partition partition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(partition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(partition, diagnostics, context);
		if (result || diagnostics != null) result &= validateLabel_color(partition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBootstrapContainerApplication(BootstrapContainerApplication bootstrapContainerApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bootstrapContainerApplication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBootstrapContainerApplicationSection(BootstrapContainerApplicationSection bootstrapContainerApplicationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bootstrapContainerApplicationSection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBootstrapContainerApplicationPanel(BootstrapContainerApplicationPanel bootstrapContainerApplicationPanel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bootstrapContainerApplicationPanel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBootstrapContainerApplicationBuilder(BootstrapContainerApplicationBuilder bootstrapContainerApplicationBuilder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bootstrapContainerApplicationBuilder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRole(ActionRole actionRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionStyle(SectionStyle sectionStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivatorType(ActivatorType activatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AppValidator
