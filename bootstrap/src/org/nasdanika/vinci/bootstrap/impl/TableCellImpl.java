/**
 */
package org.nasdanika.vinci.bootstrap.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.common.Consumer;
import org.nasdanika.common.ConsumerFactory;
import org.nasdanika.common.Context;

import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NcorePackage;

import org.nasdanika.vinci.bootstrap.Appearance;
import org.nasdanika.vinci.bootstrap.BootstrapElement;
import org.nasdanika.vinci.bootstrap.BootstrapPackage;
import org.nasdanika.vinci.bootstrap.TableCell;

import org.nasdanika.vinci.html.HtmlElement;
import org.nasdanika.vinci.html.HtmlPackage;

import org.nasdanika.vinci.html.impl.ContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.TableCellImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.TableCellImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.TableCellImpl#getAppearance <em>Appearance</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.TableCellImpl#isHeader <em>Header</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.TableCellImpl#getColSpan <em>Col Span</em>}</li>
 *   <li>{@link org.nasdanika.vinci.bootstrap.impl.TableCellImpl#getRowSpan <em>Row Span</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableCellImpl extends ContainerImpl implements TableCell {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEADER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getColSpan() <em>Col Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int COL_SPAN_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getRowSpan() <em>Row Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowSpan()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_SPAN_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BootstrapPackage.Literals.TABLE_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(BootstrapPackage.TABLE_CELL__TITLE, NcorePackage.Literals.MODEL_ELEMENT__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(BootstrapPackage.TABLE_CELL__TITLE, NcorePackage.Literals.MODEL_ELEMENT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(BootstrapPackage.TABLE_CELL__DESCRIPTION, NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(BootstrapPackage.TABLE_CELL__DESCRIPTION, NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Appearance getAppearance() {
		return (Appearance)eDynamicGet(BootstrapPackage.TABLE_CELL__APPEARANCE, BootstrapPackage.Literals.BOOTSTRAP_ELEMENT__APPEARANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearance(Appearance newAppearance, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAppearance, BootstrapPackage.TABLE_CELL__APPEARANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppearance(Appearance newAppearance) {
		eDynamicSet(BootstrapPackage.TABLE_CELL__APPEARANCE, BootstrapPackage.Literals.BOOTSTRAP_ELEMENT__APPEARANCE, newAppearance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHeader() {
		return (Boolean)eDynamicGet(BootstrapPackage.TABLE_CELL__HEADER, BootstrapPackage.Literals.TABLE_CELL__HEADER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(boolean newHeader) {
		eDynamicSet(BootstrapPackage.TABLE_CELL__HEADER, BootstrapPackage.Literals.TABLE_CELL__HEADER, newHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getColSpan() {
		return (Integer)eDynamicGet(BootstrapPackage.TABLE_CELL__COL_SPAN, BootstrapPackage.Literals.TABLE_CELL__COL_SPAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColSpan(int newColSpan) {
		eDynamicSet(BootstrapPackage.TABLE_CELL__COL_SPAN, BootstrapPackage.Literals.TABLE_CELL__COL_SPAN, newColSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRowSpan() {
		return (Integer)eDynamicGet(BootstrapPackage.TABLE_CELL__ROW_SPAN, BootstrapPackage.Literals.TABLE_CELL__ROW_SPAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRowSpan(int newRowSpan) {
		eDynamicSet(BootstrapPackage.TABLE_CELL__ROW_SPAN, BootstrapPackage.Literals.TABLE_CELL__ROW_SPAN, newRowSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consumer<Object> asConsumer(Context context) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BootstrapPackage.TABLE_CELL__APPEARANCE:
				return basicSetAppearance(null, msgs);
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
			case BootstrapPackage.TABLE_CELL__TITLE:
				return getTitle();
			case BootstrapPackage.TABLE_CELL__DESCRIPTION:
				return getDescription();
			case BootstrapPackage.TABLE_CELL__APPEARANCE:
				return getAppearance();
			case BootstrapPackage.TABLE_CELL__HEADER:
				return isHeader();
			case BootstrapPackage.TABLE_CELL__COL_SPAN:
				return getColSpan();
			case BootstrapPackage.TABLE_CELL__ROW_SPAN:
				return getRowSpan();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BootstrapPackage.TABLE_CELL__TITLE:
				setTitle((String)newValue);
				return;
			case BootstrapPackage.TABLE_CELL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BootstrapPackage.TABLE_CELL__APPEARANCE:
				setAppearance((Appearance)newValue);
				return;
			case BootstrapPackage.TABLE_CELL__HEADER:
				setHeader((Boolean)newValue);
				return;
			case BootstrapPackage.TABLE_CELL__COL_SPAN:
				setColSpan((Integer)newValue);
				return;
			case BootstrapPackage.TABLE_CELL__ROW_SPAN:
				setRowSpan((Integer)newValue);
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
			case BootstrapPackage.TABLE_CELL__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case BootstrapPackage.TABLE_CELL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BootstrapPackage.TABLE_CELL__APPEARANCE:
				setAppearance((Appearance)null);
				return;
			case BootstrapPackage.TABLE_CELL__HEADER:
				setHeader(HEADER_EDEFAULT);
				return;
			case BootstrapPackage.TABLE_CELL__COL_SPAN:
				setColSpan(COL_SPAN_EDEFAULT);
				return;
			case BootstrapPackage.TABLE_CELL__ROW_SPAN:
				setRowSpan(ROW_SPAN_EDEFAULT);
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
			case BootstrapPackage.TABLE_CELL__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case BootstrapPackage.TABLE_CELL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case BootstrapPackage.TABLE_CELL__APPEARANCE:
				return getAppearance() != null;
			case BootstrapPackage.TABLE_CELL__HEADER:
				return isHeader() != HEADER_EDEFAULT;
			case BootstrapPackage.TABLE_CELL__COL_SPAN:
				return getColSpan() != COL_SPAN_EDEFAULT;
			case BootstrapPackage.TABLE_CELL__ROW_SPAN:
				return getRowSpan() != ROW_SPAN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case BootstrapPackage.TABLE_CELL__TITLE: return NcorePackage.MODEL_ELEMENT__TITLE;
				case BootstrapPackage.TABLE_CELL__DESCRIPTION: return NcorePackage.MODEL_ELEMENT__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == HtmlElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == BootstrapElement.class) {
			switch (derivedFeatureID) {
				case BootstrapPackage.TABLE_CELL__APPEARANCE: return BootstrapPackage.BOOTSTRAP_ELEMENT__APPEARANCE;
				default: return -1;
			}
		}
		if (baseClass == ConsumerFactory.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case NcorePackage.MODEL_ELEMENT__TITLE: return BootstrapPackage.TABLE_CELL__TITLE;
				case NcorePackage.MODEL_ELEMENT__DESCRIPTION: return BootstrapPackage.TABLE_CELL__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == HtmlElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == BootstrapElement.class) {
			switch (baseFeatureID) {
				case BootstrapPackage.BOOTSTRAP_ELEMENT__APPEARANCE: return BootstrapPackage.TABLE_CELL__APPEARANCE;
				default: return -1;
			}
		}
		if (baseClass == ConsumerFactory.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == HtmlElement.class) {
			switch (baseOperationID) {
				case HtmlPackage.HTML_ELEMENT___AS_CONSUMER__CONTEXT: return BootstrapPackage.TABLE_CELL___AS_CONSUMER__CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == BootstrapElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ConsumerFactory.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BootstrapPackage.TABLE_CELL___AS_CONSUMER__CONTEXT:
				try {
					return asConsumer((Context)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //TableCellImpl
