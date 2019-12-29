/**
 */
package org.nasdanika.vinci.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Actions may play different roles in their container.
 * <!-- end-model-doc -->
 * @see org.nasdanika.vinci.app.AppPackage#getActionRole()
 * @model
 * @generated
 */
public enum ActionRole implements Enumerator {
	/**
	 * The '<em><b>Navigation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Navigation actions are displayed as action children in the navigation panel. For the root action the first navigation child is the principal action and the rest is displayed in the right-top navs in the header.
	 * <!-- end-model-doc -->
	 * @see #NAVIGATION_VALUE
	 * @generated
	 * @ordered
	 */
	NAVIGATION(0, "Navigation", "Navigation"),

	/**
	 * The '<em><b>Context</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Context actions are displayed in the navbar for the principal action, in the context menu in jsTree, and in the right navs in the content panel.
	 * <!-- end-model-doc -->
	 * @see #CONTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTEXT(1, "Context", "Context"),

	/**
	 * The '<em><b>Section</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Section actions are displayed as content sections - paragraphs, tabs, etc. depending on sections style.
	 * <!-- end-model-doc -->
	 * @see #SECTION_VALUE
	 * @generated
	 * @ordered
	 */
	SECTION(2, "Section", "Section"),

	/**
	 * The '<em><b>View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions to display during viewing. Applicable to property and property source actions. 
	 * <!-- end-model-doc -->
	 * @see #VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	VIEW(3, "View", "View"),

	/**
	 * The '<em><b>Edit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions to display during editing. Applicable to property and property source actions. 
	 * <!-- end-model-doc -->
	 * @see #EDIT_VALUE
	 * @generated
	 * @ordered
	 */
	EDIT(4, "Edit", "Edit"), /**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that an action is not assigned any role and as such shall be explicitly linked to the generated code by using action components, e.g. Action card.
	 * <!-- end-model-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(5, "None", "None");

	/**
	 * The '<em><b>Navigation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Navigation actions are displayed as action children in the navigation panel. For the root action the first navigation child is the principal action and the rest is displayed in the right-top navs in the header.
	 * <!-- end-model-doc -->
	 * @see #NAVIGATION
	 * @model name="Navigation"
	 * @generated
	 * @ordered
	 */
	public static final int NAVIGATION_VALUE = 0;

	/**
	 * The '<em><b>Context</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Context actions are displayed in the navbar for the principal action, in the context menu in jsTree, and in the right navs in the content panel.
	 * <!-- end-model-doc -->
	 * @see #CONTEXT
	 * @model name="Context"
	 * @generated
	 * @ordered
	 */
	public static final int CONTEXT_VALUE = 1;

	/**
	 * The '<em><b>Section</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Section actions are displayed as content sections - paragraphs, tabs, etc. depending on sections style.
	 * <!-- end-model-doc -->
	 * @see #SECTION
	 * @model name="Section"
	 * @generated
	 * @ordered
	 */
	public static final int SECTION_VALUE = 2;

	/**
	 * The '<em><b>View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions to display during viewing. Applicable to property and property source actions. 
	 * <!-- end-model-doc -->
	 * @see #VIEW
	 * @model name="View"
	 * @generated
	 * @ordered
	 */
	public static final int VIEW_VALUE = 3;

	/**
	 * The '<em><b>Edit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions to display during editing. Applicable to property and property source actions. 
	 * <!-- end-model-doc -->
	 * @see #EDIT
	 * @model name="Edit"
	 * @generated
	 * @ordered
	 */
	public static final int EDIT_VALUE = 4;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that an action is not assigned any role and as such shall be explicitly linked to the generated code by using action components, e.g. Action card.
	 * <!-- end-model-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Action Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActionRole[] VALUES_ARRAY =
		new ActionRole[] {
			NAVIGATION,
			CONTEXT,
			SECTION,
			VIEW,
			EDIT,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Action Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActionRole> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionRole get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionRole result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionRole getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionRole result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionRole get(int value) {
		switch (value) {
			case NAVIGATION_VALUE: return NAVIGATION;
			case CONTEXT_VALUE: return CONTEXT;
			case SECTION_VALUE: return SECTION;
			case VIEW_VALUE: return VIEW;
			case EDIT_VALUE: return EDIT;
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
	private ActionRole(int value, String name, String literal) {
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
	
} //ActionRole
