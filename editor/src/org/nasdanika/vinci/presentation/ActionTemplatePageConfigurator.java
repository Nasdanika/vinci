package org.nasdanika.vinci.presentation;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.nasdanika.vinci.app.ActionBase;
import org.nasdanika.vinci.app.AppPackage;


public class ActionTemplatePageConfigurator implements InitialObjectConfigurator {

	@Override
	public void addParameter(String name, String value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean accept(EObject eObject) {
		return AppPackage.Literals.ACTION_BASE.isInstance(eObject);
	}

	@Override
	public String getLabel() {
		return "Page Template";
	}

	@Override
	public EObject configure(EObject initialModel) {
		((ActionBase) initialModel).setPageTemplate("platform:/plugin/org.nasdanika.vinci.templates/pages/"+getTemplateURI());
		return initialModel;
	}

	@Override
	public Control createControl(Composite parent, EObject initialModel) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		
		Set<String> themes = new TreeSet<>();
		for (Template template: TEMPLATES) {
			themes.add(template.theme);
		}
		
		Label lblTheme = new Label(composite, SWT.NONE);
		lblTheme.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTheme.setText("Theme:");

		Combo themeCombo = new Combo(composite, SWT.READ_ONLY);
		themeCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		themes.forEach(themeCombo::add);
		
		Label lblHeader = new Label(composite, SWT.NONE);
		lblHeader.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblHeader.setText("Header:");
		
		Combo headerCombo = new Combo(composite, SWT.READ_ONLY);
		headerCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		new Label(composite, SWT.NONE);
		
		Group grpNavbar = new Group(composite, SWT.NONE);
		grpNavbar.setText("Navbar");
		grpNavbar.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Button btnLight = new Button(grpNavbar, SWT.RADIO);
		btnLight.setSelection(true);
		btnLight.setText("Light");
		
		Button btnDark = new Button(grpNavbar, SWT.RADIO);
		btnDark.setText("Dark");
		new Label(composite, SWT.NONE);
		
		Button btnFluid = new Button(composite, SWT.CHECK);
		btnFluid.setText("Fluid");
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
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
		
		return composite;
	}
	
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
	
	static Template[] TEMPLATES = {
			
		new Template("Default", "Primary", false, false, "default/primary.vinci"),
		new Template("Default", "Primary", false, true, "default/primary-fluid.vinci"),
		
		new Template("Cerulean", "Primary", false, false, "cerulean/primary.vinci"),
		new Template("Cerulean", "Primary", false, true, "cerulean/primary-fluid.vinci"),
		new Template("Cerulean", "Primary", true, false, "cerulean/primary-dark.vinci"),
		new Template("Cerulean", "Primary", true, true, "cerulean/primary-dark-fluid.vinci"),
		
		new Template("Cerulean", "Dark", false, false, "cerulean/dark.vinci"),
		new Template("Cerulean", "Dark", false, true, "cerulean/dark-fluid.vinci"),
		
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
	
}
