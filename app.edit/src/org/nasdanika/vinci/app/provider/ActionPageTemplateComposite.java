package org.nasdanika.vinci.app.provider;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

public class ActionPageTemplateComposite extends Composite {
	
	static class Template {
		
		String theme;
		String headerColor;
		boolean darkNavbar;
		boolean fluid;
		String uri;
		
		public Template(String theme, String headerColor, boolean darkNavbar, boolean fluid, String uri) {
			super();
			this.theme = theme;
			this.headerColor = headerColor;
			this.darkNavbar = darkNavbar;
			this.fluid = fluid;
			this.uri = uri;
		}
		
	}
	
	public static final Template[] TEMPLATES = {
			
		new Template("Default", "Primary", false, false, "platform:/plugin/org.nasdanika.vinci.templates/pages/default/primary.vinci"),
		new Template("Default", "Primary", false, true, "platform:/plugin/org.nasdanika.vinci.templates/pages/default/primary-fluid.vinci"),
		
		new Template("Cerulean", "Primary", false, false, "platform:/plugin/org.nasdanika.vinci.templates/pages/cerulean/primary.vinci"),
		new Template("Cerulean", "Primary", false, true, "platform:/plugin/org.nasdanika.vinci.templates/pages/cerulean/primary-fluid.vinci"),
		new Template("Cerulean", "Primary", true, false, "platform:/plugin/org.nasdanika.vinci.templates/pages/cerulean/primary-dark.vinci"),
		new Template("Cerulean", "Primary", true, true, "platform:/plugin/org.nasdanika.vinci.templates/pages/cerulean/primary-dark-fluid.vinci"),
		
		new Template("Cerulean", "Dark", false, false, "platform:/plugin/org.nasdanika.vinci.templates/pages/cerulean/dark.vinci"),
		new Template("Cerulean", "Dark", false, true, "platform:/plugin/org.nasdanika.vinci.templates/pages/cerulean/dark-fluid.vinci"),
		
	};
	
	private Predicate<Template> predicate;
	
	public String getTemplateURI() {
		for (Template template: TEMPLATES) {
			if (predicate == null || predicate.test(template)) {
				return template.uri;
			}
		}
		return TEMPLATES[0].uri;
	}

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ActionPageTemplateComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));
		
		Set<String> themes = new TreeSet<>();
		for (Template template: TEMPLATES) {
			themes.add(template.theme);
		}
		
		Label lblTheme = new Label(this, SWT.NONE);
		lblTheme.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTheme.setText("Theme:");

		Combo themeCombo = new Combo(this, SWT.READ_ONLY);
		themeCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		themes.forEach(themeCombo::add);
		
		Label lblHeader = new Label(this, SWT.NONE);
		lblHeader.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblHeader.setText("Header:");
		
		Combo headerCombo = new Combo(this, SWT.READ_ONLY);
		headerCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		new Label(this, SWT.NONE);
		
		Group grpNavbar = new Group(this, SWT.NONE);
		grpNavbar.setText("Navbar");
		grpNavbar.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Button btnLight = new Button(grpNavbar, SWT.RADIO);
		btnLight.setSelection(true);
		btnLight.setText("Light");
		
		Button btnDark = new Button(grpNavbar, SWT.RADIO);
		btnDark.setText("Dark");
		new Label(this, SWT.NONE);
		
		Button btnFluid = new Button(this, SWT.CHECK);
		btnFluid.setText("Fluid");
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		// --- Master-detail ---
		themeCombo.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				Set<String> headers = new TreeSet<>();
				for (Template template: TEMPLATES) {
					if (template.theme.equals(themeCombo.getText())) {
						headers.add(template.headerColor);
					}
				}
				String hv = headerCombo.getText();
				headerCombo.removeAll();
				for (String h: headers) {
					headerCombo.add(h);
					if (h.equals(hv)) {
						headerCombo.select(headerCombo.getItemCount() - 1);
					}
				}
				if (headerCombo.getSelectionIndex() == -1) {
					headerCombo.select(0);
				}				
			}
		});
		
		headerCombo.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				boolean isDark = btnDark.getSelection();
				boolean hasDark = false;
				boolean hasLight = false;
				for (Template template: TEMPLATES) {
					if (template.theme.equals(themeCombo.getText()) && template.headerColor.equals(headerCombo.getText())) {
						if (template.darkNavbar) {
							hasDark = true;
						} else {
							hasLight = true;
						}
					}					
				}
				btnDark.setEnabled(hasDark);
				btnDark.setSelection(hasDark && isDark);
				
				btnLight.setEnabled(hasLight);
				btnLight.setSelection(hasLight && (!isDark || !hasDark));
				
			}
			
		});

		// --- Set data ---
		themeCombo.select(1);
		
		predicate = template -> template.theme.equals(themeCombo.getText()) 
				&& template.headerColor.equals(headerCombo.getText()) 
				&& template.darkNavbar == btnDark.getSelection() 
				&& template.fluid == btnFluid.getSelection();
		
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
