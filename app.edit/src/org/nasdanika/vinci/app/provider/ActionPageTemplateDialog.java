package org.nasdanika.vinci.app.provider;

import java.util.Collections;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionDialog;

public class ActionPageTemplateDialog extends SelectionDialog {

	private ActionPageTemplateComposite actionPageTemplateComposite;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public ActionPageTemplateDialog(Shell parent) {
		super(parent);
		setTitle("Page template");
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Control control = super.createDialogArea(parent);
		actionPageTemplateComposite = new ActionPageTemplateComposite((Composite) control, SWT.NONE);
		return control;
	}
	
	@Override
	protected void okPressed() {
		setResult(Collections.singletonList(actionPageTemplateComposite.getTemplateURI()));
		super.okPressed();
	}

}
