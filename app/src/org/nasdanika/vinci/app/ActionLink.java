/**
 */
package org.nasdanika.vinci.app;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link to an action stored in a resource which may or may not be loaded as part of the editing resource set. 
 * The model and action specificed in the action link's reference (``ref``) is loaded only during the generation. 
 * This way it is different [ActionReference](ActionReference.html) which references an action available in the editing resource set - models in the same modeling project or loaded with "Load resource" context menu.
 * For example, action link reference may point to a dynamically generated model or may contain interpolation tokens and different actions can be linked based on generation configuration.
 * 
 * The linked action inherits this action link context. As such the same linked action linked by different action links may behave differently depending
 * on the action link context/configuration. 
 * I.e. a link may create a different "instance" of linked action. 
 * In this case the linked action activator shall also be context dependent - otherwise different instances of the same action will point to the same resource/url.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.app.ActionLink#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionLink#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionLink#getRef <em>Ref</em>}</li>
 *   <li>{@link org.nasdanika.vinci.app.ActionLink#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.vinci.app.AppPackage#getActionLink()
 * @model
 * @generated
 */
public interface ActionLink extends AbstractAction {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link title to display in the editor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionLink_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionLink#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionLink_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionLink#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action specification URL interpolated and then relsolved relative to the model location.
	 * The URL consists of the target model URL and optional action ID fragment separated from the model URL part by ``#``.
	 * In the absence of the fragment part the URL is resolved to the root action of the target model file.
	 * 
	 * ##### Example
	 * 
	 * In [Nasdanika Tool Suite Documentation Bundle](https://github.com/Nasdanika/release/tree/master/tool-suite/doc)
	 * ``models/documentation.vinci`` links the root action of ``models/guides/vinci/vinci.vinci``. 
	 * ``ref`` value of that link is ``guides/vinci/vinci.vinci`` because the reference is to the root action and therefore there is no action id fragment.
	 * 
	 * Referencing a non-root action would require a fragment part with action id, e.g. ``guides/vinci/vinci.vinci#860cba03-eca8-4893-8b84-21ae0bfb1bc9``.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionLink_Ref()
	 * @model required="true"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionLink#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If path is not blank then it is resolved against the context URI to produce a new context URI for the linked action.
	 * It can be used to organize generated content into folders in order to avoid name clashes or semantic references, e.g. ``index.html`` generated by one action overwriting ``index.html`` generated by another.
	 * 
	 * For example, if the linked action activator is ``click-me.html`` and the path is blank, then the linked action  will be generated in the same folder as the parent of the action link. 
	 * If the path is ``click-me-demo`` then the linked action content will be generated to ``click-me-demo/click.html``.
	 * 
	 * ``${base-uri}`` token can be used to define the uri relative to the base generation URI (output folder) instead of the parent URI. It might be useful it the parent URI is an absolute external URI.
	 * ``${base-uri}`` ends with a slash, so there is no need to add a slash. E.g. ``${base-uri}click-me-demo``.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.nasdanika.vinci.app.AppPackage#getActionLink_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.vinci.app.ActionLink#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // ActionLink
