/**
 */
package org.nasdanika.vinci.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Section Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines how section child actions shall be displayed.
 * <!-- end-model-doc -->
 * @see org.nasdanika.vinci.app.AppPackage#getSectionStyle()
 * @model
 * @generated
 */
public enum SectionStyle implements Enumerator {
	/**
	 * The '<em><b>Paragraphs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPHS_VALUE
	 * @generated
	 * @ordered
	 */
	PARAGRAPHS(0, "Paragraphs", "Paragraphs"),

	/**
	 * The '<em><b>Tabs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABS_VALUE
	 * @generated
	 * @ordered
	 */
	TABS(1, "Tabs", "Tabs"),

	/**
	 * The '<em><b>Pills</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PILLS_VALUE
	 * @generated
	 * @ordered
	 */
	PILLS(2, "Pills", "Pills"),

	/**
	 * The '<em><b>Vertical Pills</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_PILLS_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICAL_PILLS(3, "VerticalPills", "Vertical Pills"),

	/**
	 * The '<em><b>Action Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION_GROUP(4, "ActionGroup", "Action Group");

	/**
	 * The '<em><b>Paragraphs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPHS
	 * @model name="Paragraphs"
	 * @generated
	 * @ordered
	 */
	public static final int PARAGRAPHS_VALUE = 0;

	/**
	 * The '<em><b>Tabs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABS
	 * @model name="Tabs"
	 * @generated
	 * @ordered
	 */
	public static final int TABS_VALUE = 1;

	/**
	 * The '<em><b>Pills</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PILLS
	 * @model name="Pills"
	 * @generated
	 * @ordered
	 */
	public static final int PILLS_VALUE = 2;

	/**
	 * The '<em><b>Vertical Pills</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_PILLS
	 * @model name="VerticalPills" literal="Vertical Pills"
	 * @generated
	 * @ordered
	 */
	public static final int VERTICAL_PILLS_VALUE = 3;

	/**
	 * The '<em><b>Action Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_GROUP
	 * @model name="ActionGroup" literal="Action Group"
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_GROUP_VALUE = 4;

	/**
	 * An array of all the '<em><b>Section Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SectionStyle[] VALUES_ARRAY =
		new SectionStyle[] {
			PARAGRAPHS,
			TABS,
			PILLS,
			VERTICAL_PILLS,
			ACTION_GROUP,
		};

	/**
	 * A public read-only list of all the '<em><b>Section Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SectionStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Section Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SectionStyle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SectionStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Section Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SectionStyle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SectionStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Section Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SectionStyle get(int value) {
		switch (value) {
			case PARAGRAPHS_VALUE: return PARAGRAPHS;
			case TABS_VALUE: return TABS;
			case PILLS_VALUE: return PILLS;
			case VERTICAL_PILLS_VALUE: return VERTICAL_PILLS;
			case ACTION_GROUP_VALUE: return ACTION_GROUP;
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
	private SectionStyle(int value, String name, String literal) {
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
	
} //SectionStyle
