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
	 * The '<em><b>Paragraph</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH_VALUE
	 * @generated
	 * @ordered
	 */
	PARAGRAPH(0, "Paragraph", "Paragraph"), /**
	 * The '<em><b>Tab</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAB_VALUE
	 * @generated
	 * @ordered
	 */
	TAB(1, "Tab", "Tab"), /**
	 * The '<em><b>Pill</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PILL_VALUE
	 * @generated
	 * @ordered
	 */
	PILL(2, "Pill", "Pill"), /**
	 * The '<em><b>Vertical Pill</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_PILL_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICAL_PILL(3, "VerticalPill", "Vertical Pills"), /**
	 * The '<em><b>Action Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION_GROUP(4, "ActionGroup", "Action Group"), /**
	 * The '<em><b>Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARD_VALUE
	 * @generated
	 * @ordered
	 */
	CARD(5, "Card", "Card");

	/**
	 * The '<em><b>Paragraph</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAGRAPH
	 * @model name="Paragraph"
	 * @generated
	 * @ordered
	 */
	public static final int PARAGRAPH_VALUE = 0;

	/**
	 * The '<em><b>Tab</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAB
	 * @model name="Tab"
	 * @generated
	 * @ordered
	 */
	public static final int TAB_VALUE = 1;

	/**
	 * The '<em><b>Pill</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PILL
	 * @model name="Pill"
	 * @generated
	 * @ordered
	 */
	public static final int PILL_VALUE = 2;

	/**
	 * The '<em><b>Vertical Pill</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_PILL
	 * @model name="VerticalPill" literal="Vertical Pills"
	 * @generated
	 * @ordered
	 */
	public static final int VERTICAL_PILL_VALUE = 3;

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
	 * The '<em><b>Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARD
	 * @model name="Card"
	 * @generated
	 * @ordered
	 */
	public static final int CARD_VALUE = 5;

	/**
	 * An array of all the '<em><b>Section Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SectionStyle[] VALUES_ARRAY =
		new SectionStyle[] {
			PARAGRAPH,
			TAB,
			PILL,
			VERTICAL_PILL,
			ACTION_GROUP,
			CARD,
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
			case PARAGRAPH_VALUE: return PARAGRAPH;
			case TAB_VALUE: return TAB;
			case PILL_VALUE: return PILL;
			case VERTICAL_PILL_VALUE: return VERTICAL_PILL;
			case ACTION_GROUP_VALUE: return ACTION_GROUP;
			case CARD_VALUE: return CARD;
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
