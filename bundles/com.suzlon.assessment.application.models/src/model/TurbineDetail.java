/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turbine Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.TurbineDetail#getRatedPower <em>Rated Power</em>}</li>
 *   <li>{@link model.TurbineDetail#getCutinWindSpeed <em>Cutin Wind Speed</em>}</li>
 *   <li>{@link model.TurbineDetail#getRatedWindSpeed <em>Rated Wind Speed</em>}</li>
 *   <li>{@link model.TurbineDetail#getCutoutWindSpeed <em>Cutout Wind Speed</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getTurbineDetail()
 * @model
 * @generated
 */
public interface TurbineDetail extends EObject {
	/**
	 * Returns the value of the '<em><b>Rated Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Power</em>' attribute.
	 * @see #setRatedPower(String)
	 * @see model.ModelPackage#getTurbineDetail_RatedPower()
	 * @model
	 * @generated
	 */
	String getRatedPower();

	/**
	 * Sets the value of the '{@link model.TurbineDetail#getRatedPower <em>Rated Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Power</em>' attribute.
	 * @see #getRatedPower()
	 * @generated
	 */
	void setRatedPower(String value);

	/**
	 * Returns the value of the '<em><b>Cutin Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cutin Wind Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cutin Wind Speed</em>' attribute.
	 * @see #setCutinWindSpeed(String)
	 * @see model.ModelPackage#getTurbineDetail_CutinWindSpeed()
	 * @model
	 * @generated
	 */
	String getCutinWindSpeed();

	/**
	 * Sets the value of the '{@link model.TurbineDetail#getCutinWindSpeed <em>Cutin Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cutin Wind Speed</em>' attribute.
	 * @see #getCutinWindSpeed()
	 * @generated
	 */
	void setCutinWindSpeed(String value);

	/**
	 * Returns the value of the '<em><b>Rated Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Wind Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Wind Speed</em>' attribute.
	 * @see #setRatedWindSpeed(String)
	 * @see model.ModelPackage#getTurbineDetail_RatedWindSpeed()
	 * @model
	 * @generated
	 */
	String getRatedWindSpeed();

	/**
	 * Sets the value of the '{@link model.TurbineDetail#getRatedWindSpeed <em>Rated Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Wind Speed</em>' attribute.
	 * @see #getRatedWindSpeed()
	 * @generated
	 */
	void setRatedWindSpeed(String value);

	/**
	 * Returns the value of the '<em><b>Cutout Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cutout Wind Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cutout Wind Speed</em>' attribute.
	 * @see #setCutoutWindSpeed(String)
	 * @see model.ModelPackage#getTurbineDetail_CutoutWindSpeed()
	 * @model
	 * @generated
	 */
	String getCutoutWindSpeed();

	/**
	 * Sets the value of the '{@link model.TurbineDetail#getCutoutWindSpeed <em>Cutout Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cutout Wind Speed</em>' attribute.
	 * @see #getCutoutWindSpeed()
	 * @generated
	 */
	void setCutoutWindSpeed(String value);

} // TurbineDetail
