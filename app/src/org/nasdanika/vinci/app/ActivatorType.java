/**
 */
package org.nasdanika.vinci.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Activator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Type of action activator.
 * <!-- end-model-doc -->
 * @see org.nasdanika.vinci.app.AppPackage#getActivatorType()
 * @model
 * @generated
 */
public enum ActivatorType implements Enumerator {
	/**
	 * The '<em><b>Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activator is a URL.
	 * <!-- end-model-doc -->
	 * @see #REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE(0, "Reference", "Reference"),

	/**
	 * The '<em><b>Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activator is a script.
	 * <!-- end-model-doc -->
	 * @see #SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	SCRIPT(1, "Script", "Script"),

	/**
	 * The '<em><b>Bind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activator is a script executed to bind action to its activator, e.g. set knockoutjs data-bind attribute.
	 * <!-- end-model-doc -->
	 * @see #BIND_VALUE
	 * @generated
	 * @ordered
	 */
	BIND(2, "Bind", "Bind"), /**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No activator, e.g. for a grouping action.
	 * <!-- end-model-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(3, "None", "None");

	/**
	 * The '<em><b>Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activator is a URL.
	 * <!-- end-model-doc -->
	 * @see #REFERENCE
	 * @model name="Reference"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_VALUE = 0;

	/**
	 * The '<em><b>Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activator is a script.
	 * <!-- end-model-doc -->
	 * @see #SCRIPT
	 * @model name="Script"
	 * @generated
	 * @ordered
	 */
	public static final int SCRIPT_VALUE = 1;

	/**
	 * The '<em><b>Bind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activator is a script executed to bind action to its activator, e.g. set knockoutjs data-bind attribute.
	 * <!-- end-model-doc -->
	 * @see #BIND
	 * @model name="Bind"
	 * @generated
	 * @ordered
	 */
	public static final int BIND_VALUE = 2;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No activator, e.g. for a grouping action.
	 * <!-- end-model-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Activator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActivatorType[] VALUES_ARRAY =
		new ActivatorType[] {
			REFERENCE,
			SCRIPT,
			BIND,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Activator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActivatorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Activator Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivatorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivatorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivatorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activator Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivatorType get(int value) {
		switch (value) {
			case REFERENCE_VALUE: return REFERENCE;
			case SCRIPT_VALUE: return SCRIPT;
			case BIND_VALUE: return BIND;
			case NONE_VALUE: return NONE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActivatorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ActivatorType
