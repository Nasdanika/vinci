/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.common.Context;
import org.nasdanika.common.MapCompoundSupplier;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Supplier;
import org.nasdanika.common.Util;
import org.nasdanika.html.HTMLElement;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.app.ViewBuilder;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.bootstrap.BootstrapFactory;
import org.nasdanika.html.bootstrap.Breakpoint;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Placement;
import org.nasdanika.html.bootstrap.Size;
import org.nasdanika.ncore.Entry;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.Border;
import org.nasdanika.vinci.bootstrap.Float;
import org.nasdanika.vinci.bootstrap.Spacing;
import org.nasdanika.vinci.bootstrap.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appearance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.AppearanceImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.AppearanceImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.AppearanceImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.AppearanceImpl#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.AppearanceImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.AppearanceImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.AppearanceImpl#getFloat <em>Float</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppearanceImpl extends MinimalEObjectImpl.Container implements Appearance {
	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppearanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.APPEARANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackground() {
		return (String)eDynamicGet(BootstrapPackage.APPEARANCE__BACKGROUND, BootstrapPackage.Literals.APPEARANCE__BACKGROUND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackground(String newBackground) {
		eDynamicSet(BootstrapPackage.APPEARANCE__BACKGROUND, BootstrapPackage.Literals.APPEARANCE__BACKGROUND, newBackground);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Entry<Object>> getAttributes() {
		return (EList<Entry<Object>>)eDynamicGet(BootstrapPackage.APPEARANCE__ATTRIBUTES, BootstrapPackage.Literals.APPEARANCE__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Border> getBorder() {
		return (EList<Border>)eDynamicGet(BootstrapPackage.APPEARANCE__BORDER, BootstrapPackage.Literals.APPEARANCE__BORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Spacing> getMargin() {
		return (EList<Spacing>)eDynamicGet(BootstrapPackage.APPEARANCE__MARGIN, BootstrapPackage.Literals.APPEARANCE__MARGIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Spacing> getPadding() {
		return (EList<Spacing>)eDynamicGet(BootstrapPackage.APPEARANCE__PADDING, BootstrapPackage.Literals.APPEARANCE__PADDING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Text getText() {
		return (Text)eDynamicGet(BootstrapPackage.APPEARANCE__TEXT, BootstrapPackage.Literals.APPEARANCE__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(Text newText, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newText, BootstrapPackage.APPEARANCE__TEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(Text newText) {
		eDynamicSet(BootstrapPackage.APPEARANCE__TEXT, BootstrapPackage.Literals.APPEARANCE__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.vinci.bootstrap.Float> getFloat() {
		return (EList<org.nasdanika.vinci.bootstrap.Float>)eDynamicGet(BootstrapPackage.APPEARANCE__FLOAT, BootstrapPackage.Literals.APPEARANCE__FLOAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.APPEARANCE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case BootstrapPackage.APPEARANCE__BORDER:
				return ((InternalEList<?>)getBorder()).basicRemove(otherEnd, msgs);
			case BootstrapPackage.APPEARANCE__MARGIN:
				return ((InternalEList<?>)getMargin()).basicRemove(otherEnd, msgs);
			case BootstrapPackage.APPEARANCE__PADDING:
				return ((InternalEList<?>)getPadding()).basicRemove(otherEnd, msgs);
			case BootstrapPackage.APPEARANCE__TEXT:
				return basicSetText(null, msgs);
			case BootstrapPackage.APPEARANCE__FLOAT:
				return ((InternalEList<?>)getFloat()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BootstrapPackage.APPEARANCE__BACKGROUND:
				return getBackground();
			case BootstrapPackage.APPEARANCE__ATTRIBUTES:
				return getAttributes();
			case BootstrapPackage.APPEARANCE__BORDER:
				return getBorder();
			case BootstrapPackage.APPEARANCE__MARGIN:
				return getMargin();
			case BootstrapPackage.APPEARANCE__PADDING:
				return getPadding();
			case BootstrapPackage.APPEARANCE__TEXT:
				return getText();
			case BootstrapPackage.APPEARANCE__FLOAT:
				return getFloat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BootstrapPackage.APPEARANCE__BACKGROUND:
				setBackground((String)newValue);
				return;
			case BootstrapPackage.APPEARANCE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Entry<Object>>)newValue);
				return;
			case BootstrapPackage.APPEARANCE__BORDER:
				getBorder().clear();
				getBorder().addAll((Collection<? extends Border>)newValue);
				return;
			case BootstrapPackage.APPEARANCE__MARGIN:
				getMargin().clear();
				getMargin().addAll((Collection<? extends Spacing>)newValue);
				return;
			case BootstrapPackage.APPEARANCE__PADDING:
				getPadding().clear();
				getPadding().addAll((Collection<? extends Spacing>)newValue);
				return;
			case BootstrapPackage.APPEARANCE__TEXT:
				setText((Text)newValue);
				return;
			case BootstrapPackage.APPEARANCE__FLOAT:
				getFloat().clear();
				getFloat().addAll((Collection<? extends org.nasdanika.vinci.bootstrap.Float>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BootstrapPackage.APPEARANCE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case BootstrapPackage.APPEARANCE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case BootstrapPackage.APPEARANCE__BORDER:
				getBorder().clear();
				return;
			case BootstrapPackage.APPEARANCE__MARGIN:
				getMargin().clear();
				return;
			case BootstrapPackage.APPEARANCE__PADDING:
				getPadding().clear();
				return;
			case BootstrapPackage.APPEARANCE__TEXT:
				setText((Text)null);
				return;
			case BootstrapPackage.APPEARANCE__FLOAT:
				getFloat().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BootstrapPackage.APPEARANCE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? getBackground() != null : !BACKGROUND_EDEFAULT.equals(getBackground());
			case BootstrapPackage.APPEARANCE__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case BootstrapPackage.APPEARANCE__BORDER:
				return !getBorder().isEmpty();
			case BootstrapPackage.APPEARANCE__MARGIN:
				return !getMargin().isEmpty();
			case BootstrapPackage.APPEARANCE__PADDING:
				return !getPadding().isEmpty();
			case BootstrapPackage.APPEARANCE__TEXT:
				return getText() != null;
			case BootstrapPackage.APPEARANCE__FLOAT:
				return !getFloat().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Supplier<ViewBuilder> create(Context context) throws Exception {
		ViewBuilder backgroundBuilder = new ViewBuilder() {
			
			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor monitor) {
				String bgStr = getBackground();
				if (!Util.isBlank(bgStr)) {
					((org.nasdanika.html.bootstrap.BootstrapElement<?,?>) target).background(org.nasdanika.html.bootstrap.Color.fromLabel(bgStr));
				}				
			}
			
		};
		
		ViewBuilder borderBuilder = new ViewBuilder() {
			
			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor monitor) {
				org.nasdanika.html.bootstrap.BootstrapElement<?,?> bootstrapElement = (org.nasdanika.html.bootstrap.BootstrapElement<?,?>) target;
				for (Border border: getBorder()) {
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
				String bgStr = getBackground();
				if (!Util.isBlank(bgStr)) {
					bootstrapElement.background(org.nasdanika.html.bootstrap.Color.fromLabel(bgStr));
				}				
			}
			
		};

		ViewBuilder spacingBuilder = new ViewBuilder() {
			
			@Override
			public void build(Object target, ViewGenerator viewGenerator, ProgressMonitor monitor) {
				org.nasdanika.html.bootstrap.BootstrapElement<?,?> bootstrapElement = (org.nasdanika.html.bootstrap.BootstrapElement<?,?>) target;
				for (Spacing margin : getMargin()) {
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

				for (Spacing padding : getPadding()) {
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
				Text text = getText();
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
				for (Float _float: getFloat()) {
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
		
		if (getAttributes().isEmpty()) {		
			return appearanceSupplier;
		}
		
		@SuppressWarnings("resource")
		MapCompoundSupplier<String,Object> attrsSupplier = new MapCompoundSupplier<>("Attributes");
		
		for (Entry<Object> e: getAttributes()) {
			if (e.isEnabled()) {
				attrsSupplier.put(e.getName(), e.create(context));
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

} //AppearanceImpl
