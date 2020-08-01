package org.nasdanika.vinci.html.gen;

import java.net.URL;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.emf.EmfUtil;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.TagName;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.ViewPart;
import org.nasdanika.vinci.html.ScriptResource;

public class ScriptResourceSupplierFactory implements SupplierFactory<ViewPart> {
	
	private ScriptResource target;
	
	public ScriptResourceSupplierFactory(ScriptResource target) {
		this.target = target;
	}

	@Override
	public Supplier<ViewPart> create(Context context) throws Exception {
		return Supplier.<ViewPart>fromCallable(() -> {
			URL url = EmfUtil.resolveReference(target.eResource(), context.interpolate(target.getLocation()));
			
			return new ViewPart() {
				
				@Override
				public Object generate(ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
					return viewGenerator.get(HTMLFactory.class).tag(TagName.script, System.lineSeparator(), url, System.lineSeparator()); 
				}
				
			};
		}, target.getTitle(), 1);
	}
	
}
