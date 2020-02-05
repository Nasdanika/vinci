package org.nasdanika.vinci.presentation;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.nasdanika.common.Util;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Theme;

/**
 * Generates page template from inputs
 * @author Pavel
 *
 */
public class PageTemplateComposite extends Composite {

	protected Combo themeCombo;
	protected Combo headerCombo;
	protected Button btnLight;
	protected Button btnDark;
	protected Button btnFluid;
	protected Button btnTemplate;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public PageTemplateComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		new Label(this, SWT.NONE);
		btnTemplate = new Button(this, SWT.CHECK);
		btnTemplate.setText("Template");
		
		Label lblTheme = new Label(this, SWT.NONE);
		lblTheme.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTheme.setText("Theme:");

		themeCombo = new Combo(this, SWT.READ_ONLY);
		themeCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		for (Theme theme: Theme.values()) {
			themeCombo.add(theme.name());
		}
		
		Label lblHeader = new Label(this, SWT.NONE);
		lblHeader.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblHeader.setText("Header:");
		
		headerCombo = new Combo(this, SWT.READ_ONLY);
		headerCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		for (Color color: Color.values()) {
			if (!Util.isBlank(color.label)) {
				headerCombo.add(color.label);
			}
		}
		
		new Label(this, SWT.NONE);
		
		Group grpNavbar = new Group(this, SWT.NONE);
		grpNavbar.setText("Navbar");
		grpNavbar.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		btnLight = new Button(grpNavbar, SWT.RADIO);
		btnLight.setSelection(true);
		btnLight.setText("Light");
		
		btnDark = new Button(grpNavbar, SWT.RADIO);
		btnDark.setText("Dark");
		new Label(this, SWT.NONE);
		
		btnFluid = new Button(this, SWT.CHECK);
		btnFluid.setText("Fluid");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		// --- Set data ---
		themeCombo.select(0);
		headerCombo.select(0);
		
		headerCombo.setEnabled(btnTemplate.getSelection());
		themeCombo.setEnabled(btnTemplate.getSelection());
		btnLight.setEnabled(btnTemplate.getSelection());
		btnDark.setEnabled(btnTemplate.getSelection());
		btnFluid.setEnabled(btnTemplate.getSelection());						
		
		// --- Enable/disable ---
		btnTemplate.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				headerCombo.setEnabled(btnTemplate.getSelection());
				themeCombo.setEnabled(btnTemplate.getSelection());
				btnLight.setEnabled(btnTemplate.getSelection());
				btnDark.setEnabled(btnTemplate.getSelection());
				btnFluid.setEnabled(btnTemplate.getSelection());				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);				
			}
		});
	
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	public Theme getTheme() {
		return Theme.valueOf(themeCombo.getText());
	}
	
	public Color getHeaderColor() {
		return Color.fromLabel(headerCombo.getText());
	}
	
	public boolean isDarkNavbar() {
		return btnDark.getSelection();
	}
	
	public boolean isFluid() {
		return btnFluid.getSelection();
	}
	
	public boolean isTemplate() {
		return btnTemplate.getSelection();		
	}

}
