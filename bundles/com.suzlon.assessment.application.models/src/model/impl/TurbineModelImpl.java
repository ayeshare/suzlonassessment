/**
 */
package model.impl;

import model.ModelPackage;
import model.TurbineDetail;
import model.TurbineModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turbine Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.TurbineModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.TurbineModelImpl#getTurbineDetail <em>Turbine Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurbineModelImpl extends MinimalEObjectImpl.Container implements TurbineModel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTurbineDetail() <em>Turbine Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurbineDetail()
	 * @generated
	 * @ordered
	 */
	protected TurbineDetail turbineDetail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurbineModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TURBINE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURBINE_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurbineDetail getTurbineDetail() {
		if (turbineDetail != null && turbineDetail.eIsProxy()) {
			InternalEObject oldTurbineDetail = (InternalEObject)turbineDetail;
			turbineDetail = (TurbineDetail)eResolveProxy(oldTurbineDetail);
			if (turbineDetail != oldTurbineDetail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.TURBINE_MODEL__TURBINE_DETAIL, oldTurbineDetail, turbineDetail));
			}
		}
		return turbineDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurbineDetail basicGetTurbineDetail() {
		return turbineDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurbineDetail(TurbineDetail newTurbineDetail) {
		TurbineDetail oldTurbineDetail = turbineDetail;
		turbineDetail = newTurbineDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURBINE_MODEL__TURBINE_DETAIL, oldTurbineDetail, turbineDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TURBINE_MODEL__NAME:
				return getName();
			case ModelPackage.TURBINE_MODEL__TURBINE_DETAIL:
				if (resolve) return getTurbineDetail();
				return basicGetTurbineDetail();
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
			case ModelPackage.TURBINE_MODEL__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.TURBINE_MODEL__TURBINE_DETAIL:
				setTurbineDetail((TurbineDetail)newValue);
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
			case ModelPackage.TURBINE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.TURBINE_MODEL__TURBINE_DETAIL:
				setTurbineDetail((TurbineDetail)null);
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
			case ModelPackage.TURBINE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.TURBINE_MODEL__TURBINE_DETAIL:
				return turbineDetail != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}


} //TurbineModelImpl
