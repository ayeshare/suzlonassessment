/**
 */
package model.impl;

import model.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.TURBINE_MODEL: return createTurbineModel();
			case ModelPackage.TURBINE_DETAIL: return createTurbineDetail();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurbineModel createTurbineModel() {
		TurbineModelImpl turbineModel = new TurbineModelImpl();
		return turbineModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurbineDetail createTurbineDetail() {
		TurbineDetailImpl turbineDetail = new TurbineDetailImpl();
		return turbineDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

	@Override
	public List<TurbineModel> getAllModels() {
		List<TurbineModel> models = new ArrayList<>();
		TurbineModel model = createModelDetails("S128",new String[] {"3.0 m/s","2600 kW","9.3 m/s","20 m/s"});
		models.add(model);
		model = createModelDetails("S111",new String[] {"3.0 m/s","2100 kW","10 m/s","21 m/s"});
		models.add(model);
		model = createModelDetails("S97",new String[] {"3.5 m/s","2100 kW","11 m/s","20 m/s"});
		models.add(model);
		model = createModelDetails("S88",new String[] {"4 m/s","2100 kW","14 m/s","25 m/s"});
		models.add(model);
		model = createModelDetails("S82",new String[] {"4 m/s","1500 kW","12 m/s","20 m/s"});
		models.add(model);
		model = createModelDetails("S66",new String[] {"3 m/s","1200 kW","14 m/s","22 m/s"});
		models.add(model);
		model = createModelDetails("S52",new String[] {"4 m/s","600 kW","13 m/s","25 m/s"});
		models.add(model);
		return models;
	}
	
	private TurbineModel createModelDetails(String key,String[] values) {
		TurbineModel model = ModelFactory.eINSTANCE.createTurbineModel();
		model.setName(key);
		TurbineDetail detail = ModelFactory.eINSTANCE.createTurbineDetail();
		detail.setCutinWindSpeed(values[0]);
		detail.setRatedPower(values[1]);
		detail.setRatedWindSpeed(values[2]);
		detail.setCutoutWindSpeed(values[3]);
		model.setTurbineDetail(detail);
		return model;
	}
	
	

} //ModelFactoryImpl
