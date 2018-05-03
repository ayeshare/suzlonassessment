/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com/suzlon/models/turbine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.suzlon.models.turbine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.TurbineModelImpl <em>Turbine Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TurbineModelImpl
	 * @see model.impl.ModelPackageImpl#getTurbineModel()
	 * @generated
	 */
	int TURBINE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURBINE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Turbine Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURBINE_MODEL__TURBINE_DETAIL = 1;

	/**
	 * The number of structural features of the '<em>Turbine Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURBINE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Turbine Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURBINE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.TurbineDetailImpl <em>Turbine Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TurbineDetailImpl
	 * @see model.impl.ModelPackageImpl#getTurbineDetail()
	 * @generated
	 */
	int TURBINE_DETAIL = 1;

	/**
	 * The feature id for the '<em><b>Rated Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURBINE_DETAIL__RATED_POWER = 0;

	/**
	 * The feature id for the '<em><b>Cutin Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURBINE_DETAIL__CUTIN_WIND_SPEED = 1;

	/**
	 * The feature id for the '<em><b>Rated Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURBINE_DETAIL__RATED_WIND_SPEED = 2;

	/**
	 * The feature id for the '<em><b>Cutout Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURBINE_DETAIL__CUTOUT_WIND_SPEED = 3;

	/**
	 * The number of structural features of the '<em>Turbine Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURBINE_DETAIL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Turbine Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURBINE_DETAIL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link model.TurbineModel <em>Turbine Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turbine Model</em>'.
	 * @see model.TurbineModel
	 * @generated
	 */
	EClass getTurbineModel();

	/**
	 * Returns the meta object for the attribute '{@link model.TurbineModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.TurbineModel#getName()
	 * @see #getTurbineModel()
	 * @generated
	 */
	EAttribute getTurbineModel_Name();

	/**
	 * Returns the meta object for the reference '{@link model.TurbineModel#getTurbineDetail <em>Turbine Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Turbine Detail</em>'.
	 * @see model.TurbineModel#getTurbineDetail()
	 * @see #getTurbineModel()
	 * @generated
	 */
	EReference getTurbineModel_TurbineDetail();

	/**
	 * Returns the meta object for class '{@link model.TurbineDetail <em>Turbine Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turbine Detail</em>'.
	 * @see model.TurbineDetail
	 * @generated
	 */
	EClass getTurbineDetail();

	/**
	 * Returns the meta object for the attribute '{@link model.TurbineDetail#getRatedPower <em>Rated Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Power</em>'.
	 * @see model.TurbineDetail#getRatedPower()
	 * @see #getTurbineDetail()
	 * @generated
	 */
	EAttribute getTurbineDetail_RatedPower();

	/**
	 * Returns the meta object for the attribute '{@link model.TurbineDetail#getCutinWindSpeed <em>Cutin Wind Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cutin Wind Speed</em>'.
	 * @see model.TurbineDetail#getCutinWindSpeed()
	 * @see #getTurbineDetail()
	 * @generated
	 */
	EAttribute getTurbineDetail_CutinWindSpeed();

	/**
	 * Returns the meta object for the attribute '{@link model.TurbineDetail#getRatedWindSpeed <em>Rated Wind Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rated Wind Speed</em>'.
	 * @see model.TurbineDetail#getRatedWindSpeed()
	 * @see #getTurbineDetail()
	 * @generated
	 */
	EAttribute getTurbineDetail_RatedWindSpeed();

	/**
	 * Returns the meta object for the attribute '{@link model.TurbineDetail#getCutoutWindSpeed <em>Cutout Wind Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cutout Wind Speed</em>'.
	 * @see model.TurbineDetail#getCutoutWindSpeed()
	 * @see #getTurbineDetail()
	 * @generated
	 */
	EAttribute getTurbineDetail_CutoutWindSpeed();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.TurbineModelImpl <em>Turbine Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TurbineModelImpl
		 * @see model.impl.ModelPackageImpl#getTurbineModel()
		 * @generated
		 */
		EClass TURBINE_MODEL = eINSTANCE.getTurbineModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURBINE_MODEL__NAME = eINSTANCE.getTurbineModel_Name();

		/**
		 * The meta object literal for the '<em><b>Turbine Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURBINE_MODEL__TURBINE_DETAIL = eINSTANCE.getTurbineModel_TurbineDetail();

		/**
		 * The meta object literal for the '{@link model.impl.TurbineDetailImpl <em>Turbine Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TurbineDetailImpl
		 * @see model.impl.ModelPackageImpl#getTurbineDetail()
		 * @generated
		 */
		EClass TURBINE_DETAIL = eINSTANCE.getTurbineDetail();

		/**
		 * The meta object literal for the '<em><b>Rated Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURBINE_DETAIL__RATED_POWER = eINSTANCE.getTurbineDetail_RatedPower();

		/**
		 * The meta object literal for the '<em><b>Cutin Wind Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURBINE_DETAIL__CUTIN_WIND_SPEED = eINSTANCE.getTurbineDetail_CutinWindSpeed();

		/**
		 * The meta object literal for the '<em><b>Rated Wind Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURBINE_DETAIL__RATED_WIND_SPEED = eINSTANCE.getTurbineDetail_RatedWindSpeed();

		/**
		 * The meta object literal for the '<em><b>Cutout Wind Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURBINE_DETAIL__CUTOUT_WIND_SPEED = eINSTANCE.getTurbineDetail_CutoutWindSpeed();

	}

} //ModelPackage
