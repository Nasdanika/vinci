package org.nasdanika.vinci.app;

public enum ActionRole {
	
	NONE(null, "None"),
	NAVIGATION(org.nasdanika.html.app.Action.Role.NAVIGATION, "Navigation"),
	CONTEXT(org.nasdanika.html.app.Action.Role.CONTEXT, "Context"),
	SECTION(org.nasdanika.html.app.Action.Role.SECTION, "Section"),
	CONTENT_LEFT(org.nasdanika.html.app.Action.Role.CONTENT_LEFT, "Content left"),
	CONTENT_RIGHT(org.nasdanika.html.app.Action.Role.CONTENT_RIGHT, "Content right"),
	VIEW(org.nasdanika.html.app.Action.Role.VIEW, "View"),
	EDIT(org.nasdanika.html.app.Action.Role.EDIT, "Edit");
	
	ActionRole(String code, String label) {
		this.code = code;
		this.label = label;
	}
	
	final public String code;
	final public String label;
	
	public static ActionRole fromLabel(String label) {
		for (ActionRole actionRole: values()) {
			if (actionRole.label.equals(label)) {
				return actionRole;
			}
		}
		throw new IllegalArgumentException("No action role value for label "+label);
	}
	
	
}
