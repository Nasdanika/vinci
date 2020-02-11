/**
 */
package org.nasdanika.vinci.presentation;


import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.query.ViewpointQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;


/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VinciModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS =
		Collections.unmodifiableList(Arrays.asList(VinciEditorPlugin.INSTANCE.getString("_UI_AppEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS =
		VinciEditorPlugin.INSTANCE.getString("_UI_AppEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialObjectCreationPage initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;

	protected InitialObjectConfigurationPage initialObjectConfigurationPage;

	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(VinciEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(VinciEditorPlugin.INSTANCE.getImage("full/wizban/NewApp")));
	}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							// Create a resource set
							//
							ResourceSet resourceSet = new ResourceSetImpl();

							// Get the URI of the model file.
							//
							URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

							// Create a resource for this file.
							//
							Resource resource = resourceSet.createResource(fileURI);

							// Add the initial model object to the contents.
							//
							EObject rootObject = initialObjectConfigurationPage.getInitialModel();
							if (rootObject != null) {
								resource.getContents().add(rootObject);
							}

							// Save the contents of the resource to the file system.
							//
							Map<Object, Object> options = new HashMap<Object, Object>();
							options.put(XMLResource.OPTION_ENCODING, StandardCharsets.UTF_8.name());
							resource.save(options);
						} catch (Exception exception) {
							// TODO - open error dialog.
							VinciEditorPlugin.INSTANCE.log(exception);
						} finally {
							progressMonitor.done();
						}
					}
				};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec
					(new Runnable() {
						 @Override
						 public void run() {
							 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
						 }
					 });
			}

			IProject project = modelFile.getProject();			
			ModelingProject modelingProject = (ModelingProject) project.getNature(ModelingProject.NATURE_ID);
			if (modelingProject == null) {								
				// Open an editor on the new file.
				//
				try {
					page.openEditor
						(new FileEditorInput(modelFile),
						 workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());					 	 
				} catch (PartInitException exception) {
					MessageDialog.openError(workbenchWindow.getShell(), VinciEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
					return false;
				}
			} else {
				// Add Vinci viewpoint, create tree representation and open it.
				WorkspaceModifyOperation createRepresentationOperation =
						new WorkspaceModifyOperation() {
							@Override
							protected void execute(IProgressMonitor progressMonitor) {
								try {									
									SubMonitor monitor = SubMonitor.convert(progressMonitor, 100);
									Session session = modelingProject.getSession();
									
									Option<URI> uriOpt = modelingProject.getMainRepresentationsFileURI(monitor.split(10));	
									URI mainRepresentationFileURI = uriOpt == null ? null : uriOpt.get();
									if (session == null && mainRepresentationFileURI != null) {
										session = SessionManager.INSTANCE.getSession(mainRepresentationFileURI, progressMonitor);
									}
									
									if (session != null && mainRepresentationFileURI != null) {
										// Add semantic resource and viewpoint
										progressMonitor.subTask("prepare vinci project...");
										CompoundCommand cc = new CompoundCommand("Prepare Vinci Project");
										URI modelFileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
										cc.append(new AddSemanticResourceCommand(session, modelFileURI, monitor.split(10)));
										
										Collection<Viewpoint> alreadySelectedViewpoints = session.getSelectedViewpoints(true);
										Set<Viewpoint> selectedViewpoints = new HashSet<>();
								        ViewpointRegistry registry = ViewpointRegistry.getInstance();
								        for (Viewpoint viewpoint: registry.getViewpoints()) {
						                    if (!alreadySelectedViewpoints.contains(viewpoint) && new ViewpointQuery(viewpoint).handlesSemanticModelExtension("vinci")) {
						                        selectedViewpoints.add(viewpoint);
						                    }
								        }
										
										cc.append(new ChangeViewpointSelectionCommand(
												session, 
												new ViewpointSelectionCallback(), 
												selectedViewpoints,
												Collections.<Viewpoint>emptySet(), 
												monitor.split(10)));

										Collection<DRepresentation> createdRepresentations = new ArrayList<>();
										
										Session theSession = session;
										cc.append(new RecordingCommand(session.getTransactionalEditingDomain()) {
											
											@Override
											protected void doExecute() {
												for (Resource res: theSession.getSemanticResources()) {
													if (res.getURI().equals(modelFileURI)) {
														for (EObject root: res.getContents()) {
															for (RepresentationDescription representationDescription: DialectManager.INSTANCE.getAvailableRepresentationDescriptions(theSession.getSelectedViewpoints(true), root)) {
																if ("vinciAdapterFactoryTree".equals(representationDescription.getName())) {
																	DRepresentation created = DialectManager.INSTANCE.createRepresentation(root.eClass().getName() + " tree", root, representationDescription, theSession, monitor);
																	if (created != null) {
																		createdRepresentations.add(created);
																	}
																}
															}													
														}
													}
												}
											}
										});
										

										monitor.subTask("link the created models..."); 
										session.getTransactionalEditingDomain().getCommandStack().execute(cc);
										monitor.worked(10);

										session.save(monitor);
										monitor.worked(10);		
										
										BasicNewResourceWizard.selectAndReveal(modelFile, workbench.getActiveWorkbenchWindow());
										EclipseUIUtil.expand(modelFile, workbench.getActiveWorkbenchWindow());
																																																	
										for (DRepresentation created: createdRepresentations) {
											DialectUIManager.INSTANCE.openEditor(session, created, monitor.split(10));											
										}						
									}									
									
								} catch (Exception exception) {
									// TODO - open error dialog.
									VinciEditorPlugin.INSTANCE.log(exception);
								} finally {
									progressMonitor.done();
								}
							}
						};

					getContainer().run(false, false, createRepresentationOperation);
			}
			
			return true;
		}
		catch (Exception exception) {
			VinciEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class AppModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public AppModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions" : "_WARN_FilenameExtension";
					setErrorMessage(VinciEditorPlugin.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
					return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}
	}

	/**
	 * The framework calls this to create the contents of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
		@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new AppModelWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle(VinciEditorPlugin.INSTANCE.getString("_UI_AppModelWizard_label"));
		newFileCreationPage.setDescription(VinciEditorPlugin.INSTANCE.getString("_UI_AppModelWizard_description"));
		newFileCreationPage.setFileName(VinciEditorPlugin.INSTANCE.getString("_UI_AppEditorFilenameDefaultBase") + "." + FILE_EXTENSIONS.get(0));
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource)selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = VinciEditorPlugin.INSTANCE.getString("_UI_AppEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		initialObjectCreationPage = new InitialObjectCreationPage("initial-object-creation");
		initialObjectCreationPage.setTitle(VinciEditorPlugin.INSTANCE.getString("_UI_AppModelWizard_label"));
		initialObjectCreationPage.setDescription(VinciEditorPlugin.INSTANCE.getString("_UI_Wizard_initial_object_description"));
		addPage(initialObjectCreationPage);
		
		initialObjectConfigurationPage = new InitialObjectConfigurationPage("initial-object-configuration", initialObjectCreationPage);
		initialObjectConfigurationPage.setTitle(VinciEditorPlugin.INSTANCE.getString("_UI_AppModelWizard_label"));
		initialObjectConfigurationPage.setDescription(VinciEditorPlugin.INSTANCE.getString("_UI_Wizard_initial_object_configuration_description"));
		addPage(initialObjectConfigurationPage);
		
	}

	/**
	 * Get the file from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

}
