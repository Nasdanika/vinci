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
import org.nasdanika.common.CompoundConsumer;
import org.nasdanika.common.Consumer;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.html.bootstrap.Breakpoint;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Placement;
import org.nasdanika.html.bootstrap.Size;
import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.Border;
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
	 * The default value of the '{@link #getAttributes() <em>Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTES_EDEFAULT = null;

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
	@Override
	public String getAttributes() {
		return (String)eDynamicGet(BootstrapPackage.APPEARANCE__ATTRIBUTES, BootstrapPackage.Literals.APPEARANCE__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributes(String newAttributes) {
		eDynamicSet(BootstrapPackage.APPEARANCE__ATTRIBUTES, BootstrapPackage.Literals.APPEARANCE__ATTRIBUTES, newAttributes);
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
	public EList<Text> getText() {
		return (EList<Text>)eDynamicGet(BootstrapPackage.APPEARANCE__TEXT, BootstrapPackage.Literals.APPEARANCE__TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Text> getFloat() {
		return (EList<Text>)eDynamicGet(BootstrapPackage.APPEARANCE__FLOAT, BootstrapPackage.Literals.APPEARANCE__FLOAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.APPEARANCE__BORDER:
				return ((InternalEList<?>)getBorder()).basicRemove(otherEnd, msgs);
			case BootstrapPackage.APPEARANCE__MARGIN:
				return ((InternalEList<?>)getMargin()).basicRemove(otherEnd, msgs);
			case BootstrapPackage.APPEARANCE__PADDING:
				return ((InternalEList<?>)getPadding()).basicRemove(otherEnd, msgs);
			case BootstrapPackage.APPEARANCE__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
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
				setAttributes((String)newValue);
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
				getText().clear();
				getText().addAll((Collection<? extends Text>)newValue);
				return;
			case BootstrapPackage.APPEARANCE__FLOAT:
				getFloat().clear();
				getFloat().addAll((Collection<? extends Text>)newValue);
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
				setAttributes(ATTRIBUTES_EDEFAULT);
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
				getText().clear();
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
				return ATTRIBUTES_EDEFAULT == null ? getAttributes() != null : !ATTRIBUTES_EDEFAULT.equals(getAttributes());
			case BootstrapPackage.APPEARANCE__BORDER:
				return !getBorder().isEmpty();
			case BootstrapPackage.APPEARANCE__MARGIN:
				return !getMargin().isEmpty();
			case BootstrapPackage.APPEARANCE__PADDING:
				return !getPadding().isEmpty();
			case BootstrapPackage.APPEARANCE__TEXT:
				return !getText().isEmpty();
			case BootstrapPackage.APPEARANCE__FLOAT:
				return !getFloat().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Consumer<Object> create(Context context) throws Exception {
		Consumer<Object> backGroundConsumer = new Consumer<Object>() {

			@Override
			public double size() {
				return 1;
			}

			@Override
			public String name() {
				return "Background";
			}

			@Override
			public void execute(Object arg, ProgressMonitor progressMonitor) throws Exception {
				String bgStr = getBackground();
				if (!Util.isBlank(bgStr)) {
					((org.nasdanika.html.bootstrap.BootstrapElement<?,?>) arg).background(org.nasdanika.html.bootstrap.Color.valueOf(bgStr));
				}				
			}
			
		};
		
		Consumer<Object> borderConsumer = new Consumer<Object>() {

			@Override
			public double size() {
				return 1;
			}

			@Override
			public String name() {
				return "Border";
			}

			@Override
			public void execute(Object arg, ProgressMonitor progressMonitor) throws Exception {
				org.nasdanika.html.bootstrap.BootstrapElement<?,?> bootstrapElement = (org.nasdanika.html.bootstrap.BootstrapElement<?,?>) arg;
				for (Border border: getBorder()) {
					Color color = org.nasdanika.html.bootstrap.Color.valueOf(border.getColor());
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
					bootstrapElement.background(org.nasdanika.html.bootstrap.Color.valueOf(bgStr));
				}				
			}
			
		};

		Consumer<Object> spacingConsumer = new Consumer<Object>() {

			@Override
			public double size() {
				return 1;
			}

			@Override
			public String name() {
				return "Spacing";
			}

			@Override
			public void execute(Object arg, ProgressMonitor progressMonitor) throws Exception {
				org.nasdanika.html.bootstrap.BootstrapElement<?,?> bootstrapElement = (org.nasdanika.html.bootstrap.BootstrapElement<?,?>) arg;
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
		
		
		return new CompoundConsumer<Object>(
				"Appearance", 
				backGroundConsumer, 
				borderConsumer,
				spacingConsumer);
	}

} //AppearanceImpl
