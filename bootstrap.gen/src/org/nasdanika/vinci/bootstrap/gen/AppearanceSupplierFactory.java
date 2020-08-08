package org.nasdanika.vinci.bootstrap.gen;

import org.nasdanika.common.Context;
import org.nasdanika.common.MapCompoundSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.SupplierFactory;
import org.nasdanika.common.Util;
import org.nasdanika.emf.EObjectAdaptable;
import org.nasdanika.html.HTMLElement;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Breakpoint;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Placement;
import org.nasdanika.html.bootstrap.Size;
import org.nasdanika.ncore.AbstractEntry;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.Border;
import org.nasdanika.vinci.bootstrap.Float;
import org.nasdanika.vinci.bootstrap.Spacing;
import org.nasdanika.vinci.bootstrap.Text;

public class AppearanceSupplierFactory implements SupplierFactory<ViewBuilder> {
	
	private Appearance target;

	public AppearanceSupplierFactory(Appearance target) {
		this.target = target;
	}
	
	@Override
	public Supplier<ViewBuilder> create(Context context) throws Exception {
		ViewBuilder backgroundBuilder = new ViewBuilder() {
			
			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor monitor) {
				String bgStr = AppearanceSupplierFactory.this.target.getBackground();
				if (!Util.isBlank(bgStr)) {
					((org.nasdanika.html.bootstrap.BootstrapElement<?,?>) target).background(org.nasdanika.html.bootstrap.Color.fromLabel(bgStr));
				}				
			}
			
		};
		
		ViewBuilder borderBuilder = new ViewBuilder() {
			
			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor monitor) {
				org.nasdanika.html.bootstrap.BootstrapElement<?,?> bootstrapElement = (org.nasdanika.html.bootstrap.BootstrapElement<?,?>) target;
				for (Border border: AppearanceSupplierFactory.this.target.getBorder()) {
					Color color = org.nasdanika.html.bootstrap.Color.fromLabel(border.getColor());
					if (border.isBottom() && border.isLeft() && border.isRight() && border.isTop()) {
						bootstrapElement.border(color);
					} else {
						if (border.isBottom()) {
							bootstrapElement.border(color, Placement.BOTTOM);
						}
						if (border.isTop()) {
							bootstrapElement.border(color, Placement.TOP);
						}
						if (border.isLeft()) {
							bootstrapElement.border(color, Placement.LEFT);
						}
						if (border.isRight()) {
							bootstrapElement.border(color, Placement.RIGHT);
						}
					}
					
				}
				String bgStr = AppearanceSupplierFactory.this.target.getBackground();
				if (!Util.isBlank(bgStr)) {
					bootstrapElement.background(org.nasdanika.html.bootstrap.Color.fromLabel(bgStr));
				}				
			}
			
		};

		ViewBuilder spacingBuilder = new ViewBuilder() {
			
			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor monitor) {
				org.nasdanika.html.bootstrap.BootstrapElement<?,?> bootstrapElement = (org.nasdanika.html.bootstrap.BootstrapElement<?,?>) target;
				for (Spacing margin : AppearanceSupplierFactory.this.target.getMargin()) {
					Size size = org.nasdanika.html.bootstrap.Size.fromCode(margin.getSize());
					String bpStr = margin.getBreakpoint();
					Breakpoint breakpoint = Util.isBlank(bpStr) ? Breakpoint.DEFAULT : Breakpoint.fromLabel(bpStr);
					
					if ((margin.isBottom() && margin.isLeft() && margin.isRight() && margin.isTop()) || (margin.isX() && margin.isY())) {
						bootstrapElement.margin().all(breakpoint, size);
					} else {
						if (margin.isBottom()) {
							bootstrapElement.margin().bottom(breakpoint, size);
						}
						if (margin.isTop()) {
							bootstrapElement.margin().top(breakpoint, size);
						}
						if (margin.isLeft()) {
							bootstrapElement.margin().left(breakpoint, size);
						}
						if (margin.isRight()) {
							bootstrapElement.margin().right(breakpoint, size);
						}
						
						if (margin.isX()) {
							bootstrapElement.margin().x(breakpoint, size);
						}
						if (margin.isY()) {
							bootstrapElement.margin().y(breakpoint, size);
						}						
					}					
				}

				for (Spacing padding : AppearanceSupplierFactory.this.target.getPadding()) {
					Size size = org.nasdanika.html.bootstrap.Size.fromCode(padding.getSize());
					String bpStr = padding.getBreakpoint();
					Breakpoint breakpoint = Util.isBlank(bpStr) ? Breakpoint.DEFAULT : Breakpoint.fromLabel(bpStr);
					if (!Util.isBlank(bpStr)) {
						for (Breakpoint candidate: Breakpoint.values()) {
							if (candidate.label.equals(bpStr)) {
								breakpoint = candidate;
								break;
							}
						}
					}
					
					if ((padding.isBottom() && padding.isLeft() && padding.isRight() && padding.isTop()) || (padding.isX() && padding.isY())) {
						bootstrapElement.padding().all(breakpoint, size);
					} else {
						if (padding.isBottom()) {
							bootstrapElement.padding().bottom(breakpoint, size);
						}
						if (padding.isTop()) {
							bootstrapElement.padding().top(breakpoint, size);
						}
						if (padding.isLeft()) {
							bootstrapElement.padding().left(breakpoint, size);
						}
						if (padding.isRight()) {
							bootstrapElement.padding().right(breakpoint, size);
						}
						
						if (padding.isX()) {
							bootstrapElement.padding().x(breakpoint, size);
						}
						if (padding.isY()) {
							bootstrapElement.padding().y(breakpoint, size);
						}						
					}					
				}
				
			}
			
		};
		
		ViewBuilder textBuilder = new ViewBuilder() {
			
			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor monitor) {
				org.nasdanika.html.bootstrap.BootstrapElement<?,?> bootstrapElement = (org.nasdanika.html.bootstrap.BootstrapElement<?,?>) target;
				Text text = AppearanceSupplierFactory.this.target.getText();
				if (text != null) {
					org.nasdanika.html.bootstrap.Text<?> bsText = bootstrapElement.text();

					String colorStr = text.getColor();
					if (!Util.isBlank(colorStr)) {						
						bsText.color(org.nasdanika.html.bootstrap.Color.fromLabel(colorStr));
					}
					
					String alignmentStr = text.getAlignment();
					if (!Util.isBlank(alignmentStr)) {						
						bsText.alignment(org.nasdanika.html.bootstrap.Text.Alignment.valueOf(alignmentStr.toUpperCase()));
					}				

					String transformStr = text.getTransform();
					if (!Util.isBlank(transformStr)) {						
						bsText.transform(org.nasdanika.html.bootstrap.Text.Transform.valueOf(transformStr.toUpperCase()));
					}				

					String weightStr = text.getWeight();
					if (!Util.isBlank(weightStr)) {						
						bsText.weight(org.nasdanika.html.bootstrap.Text.Weight.valueOf(weightStr.toUpperCase()));
					}				
					
					bsText.monospace(text.isMonospace());
					bsText.italic(text.isItalic());
					bsText.nowrap(text.isNowrap());
					bsText.truncate(text.isTruncate());
					
				}
			}
			
		};
				
		ViewBuilder floatBuilder = new ViewBuilder() {
			
			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor monitor) {
				org.nasdanika.html.bootstrap.BootstrapElement<?,?> bootstrapElement = (org.nasdanika.html.bootstrap.BootstrapElement<?,?>) target;
				for (Float _float: AppearanceSupplierFactory.this.target.getFloat()) {
					org.nasdanika.html.bootstrap.Float<?> bsFloat = bootstrapElement._float();
					Breakpoint breakpoint = Breakpoint.fromLabel(_float.getBreakpoint());
					switch (_float.getSide()) {
					case "Left":
						bsFloat.left(breakpoint);
						break;
					case "Right":
						bsFloat.right(breakpoint);
						break;
					case "None":
						bsFloat.none(breakpoint);
						break;
					default:
						throw new IllegalArgumentException("Invalid float side: "+_float.getSide()+", shall be Left, Right, or None");
					}
				}
			}
			
		};
		
		java.util.function.Function<Object, Object> wrapper = target -> {
			if (target instanceof org.nasdanika.html.bootstrap.BootstrapElement) {
				return (org.nasdanika.html.bootstrap.BootstrapElement<?,?>) target;
			} 
			if (target instanceof HTMLElement) {
				return BootstrapFactory.INSTANCE.wrap((HTMLElement<?>) target);
			} 
			return BootstrapFactory.INSTANCE.wrap(HTMLFactory.INSTANCE.span(target));									
		};
		
		ViewBuilder composedBuilder = backgroundBuilder
				.compose(borderBuilder)
				.compose(spacingBuilder)
				.compose(textBuilder)
				.compose(floatBuilder).before(wrapper);

		Supplier<ViewBuilder> appearanceSupplier = Supplier.from(composedBuilder, "Appearance");
		
		if (AppearanceSupplierFactory.this.target.getAttributes().isEmpty()) {		
			return appearanceSupplier;
		}
		
		@SuppressWarnings("resource")
		MapCompoundSupplier<String,Object> attrsSupplier = new MapCompoundSupplier<>("Attributes");
		
		for (AbstractEntry e: AppearanceSupplierFactory.this.target.getAttributes()) {
			if (e.isEnabled()) {
				attrsSupplier.put(e.getName(), EObjectAdaptable.adaptToSupplierFactory(e, Object.class).create(context));
			}
		}
		
		return appearanceSupplier.then(attrsSupplier.asFunction()).then(bs -> new ViewBuilder() {

			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor progressMonitor) {
				bs.getFirst().build(target, viewGenerator, progressMonitor);
				org.nasdanika.html.HTMLElement<?> htmlElement;
				if (target instanceof org.nasdanika.html.bootstrap.BootstrapElement<?,?>) {
					htmlElement = ((org.nasdanika.html.bootstrap.BootstrapElement<?,?>) target).toHTMLElement();  
				} else if (target instanceof org.nasdanika.html.HTMLElement) {
					htmlElement = (org.nasdanika.html.HTMLElement<?>) target;
				} else {
					htmlElement = target == null || target instanceof String && Util.isBlank((String) target) ? null : viewGenerator.get(HTMLFactory.class).span(target);
				}
				if (htmlElement != null) {
					htmlElement.attributes(bs.getSecond());
				}
			}
			
		});
				
	}		
	
}
