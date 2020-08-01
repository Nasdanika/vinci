package org.nasdanika.vinci.app.gen;

import org.nasdanika.common.Util;
import org.nasdanika.html.bootstrap.Breakpoint;
import org.nasdanika.html.bootstrap.Container.Row.Col;
import org.nasdanika.html.bootstrap.Size;
import org.nasdanika.vinci.app.BootstrapContainerApplicationPanel;
import org.nasdanika.vinci.bootstrap.ColumnWidth;

public class BootstrapContainerApplicationPanelViewBuilderSupplierFactory extends BootstrapContainerApplicationSectionViewBuilderSupplierFactory<BootstrapContainerApplicationPanel> {
			
	public BootstrapContainerApplicationPanelViewBuilderSupplierFactory(BootstrapContainerApplicationPanel target) {
		super(target);
	}

	@Override
	protected void configureCol(Col col) {
		for (ColumnWidth width: target.getWidth()) {
			String bStr = width.getBreakpoint();
			Breakpoint breakpoint = Util.isBlank(bStr) ? Breakpoint.DEFAULT : Breakpoint.fromLabel(bStr);
			
			String widthStr = width.getWidth();
			Size size = Util.isBlank(widthStr) ? Size.NONE : Size.fromCode(widthStr);
			
			col.width(breakpoint, size);
		}
	}	

}
