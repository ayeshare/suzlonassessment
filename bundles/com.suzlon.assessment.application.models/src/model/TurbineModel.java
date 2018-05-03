/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turbine Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.TurbineModel#getName <em>Name</em>}</li>
 *   <li>{@link model.TurbineModel#getTurbineDetail <em>Turbine Detail</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getTurbineModel()
 * @model
 * @generated
 */
public interface TurbineModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.ModelPackage#getTurbineModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.TurbineModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	
	/**
	 * Returns the value of the '<em><b>Turbine Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turbine Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turbine Detail</em>' reference.
	 * @see #setTurbineDetail(TurbineDetail)
	 * @see model.ModelPackage#getTurbineModel_TurbineDetail()
	 * @model
	 * @generated
	 */
	TurbineDetail getTurbineDetail();

	/**
	 * Sets the value of the '{@link model.TurbineModel#getTurbineDetail <em>Turbine Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turbine Detail</em>' reference.
	 * @see #getTurbineDetail()
	 * @generated
	 */
	void setTurbineDetail(TurbineDetail value);


} // TurbineModel
