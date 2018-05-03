/**
 */
package model.impl;

import model.ModelPackage;
import model.TurbineDetail;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turbine Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.TurbineDetailImpl#getRatedPower <em>Rated Power</em>}</li>
 *   <li>{@link model.impl.TurbineDetailImpl#getCutinWindSpeed <em>Cutin Wind Speed</em>}</li>
 *   <li>{@link model.impl.TurbineDetailImpl#getRatedWindSpeed <em>Rated Wind Speed</em>}</li>
 *   <li>{@link model.impl.TurbineDetailImpl#getCutoutWindSpeed <em>Cutout Wind Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurbineDetailImpl extends MinimalEObjectImpl.Container implements TurbineDetail {
	/**
	 * The default value of the '{@link #getRatedPower() <em>Rated Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedPower()
	 * @generated
	 * @ordered
	 */
	protected static final String RATED_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRatedPower() <em>Rated Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedPower()
	 * @generated
	 * @ordered
	 */
	protected String ratedPower = RATED_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCutinWindSpeed() <em>Cutin Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutinWindSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final String CUTIN_WIND_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCutinWindSpeed() <em>Cutin Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutinWindSpeed()
	 * @generated
	 * @ordered
	 */
	protected String cutinWindSpeed = CUTIN_WIND_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedWindSpeed() <em>Rated Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedWindSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final String RATED_WIND_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRatedWindSpeed() <em>Rated Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedWindSpeed()
	 * @generated
	 * @ordered
	 */
	protected String ratedWindSpeed = RATED_WIND_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCutoutWindSpeed() <em>Cutout Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutoutWindSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final String CUTOUT_WIND_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCutoutWindSpeed() <em>Cutout Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutoutWindSpeed()
	 * @generated
	 * @ordered
	 */
	protected String cutoutWindSpeed = CUTOUT_WIND_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurbineDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TURBINE_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRatedPower() {
		return ratedPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedPower(String newRatedPower) {
		String oldRatedPower = ratedPower;
		ratedPower = newRatedPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURBINE_DETAIL__RATED_POWER, oldRatedPower, ratedPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCutinWindSpeed() {
		return cutinWindSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCutinWindSpeed(String newCutinWindSpeed) {
		String oldCutinWindSpeed = cutinWindSpeed;
		cutinWindSpeed = newCutinWindSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURBINE_DETAIL__CUTIN_WIND_SPEED, oldCutinWindSpeed, cutinWindSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRatedWindSpeed() {
		return ratedWindSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedWindSpeed(String newRatedWindSpeed) {
		String oldRatedWindSpeed = ratedWindSpeed;
		ratedWindSpeed = newRatedWindSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURBINE_DETAIL__RATED_WIND_SPEED, oldRatedWindSpeed, ratedWindSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCutoutWindSpeed() {
		return cutoutWindSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCutoutWindSpeed(String newCutoutWindSpeed) {
		String oldCutoutWindSpeed = cutoutWindSpeed;
		cutoutWindSpeed = newCutoutWindSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURBINE_DETAIL__CUTOUT_WIND_SPEED, oldCutoutWindSpeed, cutoutWindSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TURBINE_DETAIL__RATED_POWER:
				return getRatedPower();
			case ModelPackage.TURBINE_DETAIL__CUTIN_WIND_SPEED:
				return getCutinWindSpeed();
			case ModelPackage.TURBINE_DETAIL__RATED_WIND_SPEED:
				return getRatedWindSpeed();
			case ModelPackage.TURBINE_DETAIL__CUTOUT_WIND_SPEED:
				return getCutoutWindSpeed();
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
			case ModelPackage.TURBINE_DETAIL__RATED_POWER:
				setRatedPower((String)newValue);
				return;
			case ModelPackage.TURBINE_DETAIL__CUTIN_WIND_SPEED:
				setCutinWindSpeed((String)newValue);
				return;
			case ModelPackage.TURBINE_DETAIL__RATED_WIND_SPEED:
				setRatedWindSpeed((String)newValue);
				return;
			case ModelPackage.TURBINE_DETAIL__CUTOUT_WIND_SPEED:
				setCutoutWindSpeed((String)newValue);
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
			case ModelPackage.TURBINE_DETAIL__RATED_POWER:
				setRatedPower(RATED_POWER_EDEFAULT);
				return;
			case ModelPackage.TURBINE_DETAIL__CUTIN_WIND_SPEED:
				setCutinWindSpeed(CUTIN_WIND_SPEED_EDEFAULT);
				return;
			case ModelPackage.TURBINE_DETAIL__RATED_WIND_SPEED:
				setRatedWindSpeed(RATED_WIND_SPEED_EDEFAULT);
				return;
			case ModelPackage.TURBINE_DETAIL__CUTOUT_WIND_SPEED:
				setCutoutWindSpeed(CUTOUT_WIND_SPEED_EDEFAULT);
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
			case ModelPackage.TURBINE_DETAIL__RATED_POWER:
				return RATED_POWER_EDEFAULT == null ? ratedPower != null : !RATED_POWER_EDEFAULT.equals(ratedPower);
			case ModelPackage.TURBINE_DETAIL__CUTIN_WIND_SPEED:
				return CUTIN_WIND_SPEED_EDEFAULT == null ? cutinWindSpeed != null : !CUTIN_WIND_SPEED_EDEFAULT.equals(cutinWindSpeed);
			case ModelPackage.TURBINE_DETAIL__RATED_WIND_SPEED:
				return RATED_WIND_SPEED_EDEFAULT == null ? ratedWindSpeed != null : !RATED_WIND_SPEED_EDEFAULT.equals(ratedWindSpeed);
			case ModelPackage.TURBINE_DETAIL__CUTOUT_WIND_SPEED:
				return CUTOUT_WIND_SPEED_EDEFAULT == null ? cutoutWindSpeed != null : !CUTOUT_WIND_SPEED_EDEFAULT.equals(cutoutWindSpeed);
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
		result.append(" (ratedPower: ");
		result.append(ratedPower);
		result.append(", cutinWindSpeed: ");
		result.append(cutinWindSpeed);
		result.append(", ratedWindSpeed: ");
		result.append(ratedWindSpeed);
		result.append(", cutoutWindSpeed: ");
		result.append(cutoutWindSpeed);
		result.append(')');
		return result.toString();
	}

} //TurbineDetailImpl
