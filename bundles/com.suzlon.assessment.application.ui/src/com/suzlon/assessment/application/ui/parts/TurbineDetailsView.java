
package com.suzlon.assessment.application.ui.parts;


import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import model.TurbineModel;

public class TurbineDetailsView {

	public static final String ID="com.suzlon.assessment.application.ui.partdescriptor.turbineDetails";
	private Text txtModel;
	private Text txtRatedPower;
	private Text txtCutinWindSpeed;
	private Text txtCutoutWindSpeed;
	private Text txtRatedWindSpeed;
	
	
	@PostConstruct
	public void createPartControl(Composite parent) {
		final Color COLOR_WHITE = new Color(parent.getDisplay(), new RGB(255, 255, 255));
		System.out.println("Enter in detailsview postConstruct");

		final Composite modelComposite = new Composite(parent, SWT.NONE);
		modelComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		modelComposite.setLayout(new GridLayout(2, false));
		Label lblModel = new Label(modelComposite,SWT.NONE);
		lblModel.setText("Model:");
		txtModel = new Text(modelComposite,SWT.FILL);
		txtModel.setEditable(false);
		txtModel.setBackground(COLOR_WHITE);
		txtModel.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,false));
		
		Label lblRatedPower = new Label(modelComposite,SWT.NONE);
		lblRatedPower.setText("Rated Power:");
		txtRatedPower = new Text(modelComposite,SWT.FILL);
		txtRatedPower.setEditable(false);
		txtRatedPower.setBackground(COLOR_WHITE);
		txtRatedPower.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,false));
		
		Label lblCutinSpeed = new Label(modelComposite,SWT.NONE);
		lblCutinSpeed.setText("Cut-in Wind Speed:");
		txtCutinWindSpeed = new Text(modelComposite,SWT.FILL);
		txtCutinWindSpeed.setEditable(false);
		txtCutinWindSpeed.setBackground(COLOR_WHITE);
		txtCutinWindSpeed.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,false));
		
		Label lblRatedWindSpeed = new Label(modelComposite,SWT.NONE);
		lblRatedWindSpeed.setText("Rated Wind Speed:");
		txtRatedWindSpeed = new Text(modelComposite,SWT.FILL);
		txtRatedWindSpeed.setEditable(false);
		txtRatedWindSpeed.setBackground(COLOR_WHITE);
		txtRatedWindSpeed.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,false));
		
		
		Label lblCutoutSpeed = new Label(modelComposite,SWT.FILL);
		lblCutoutSpeed.setText("Cut-out Wind Speed:");
		txtCutoutWindSpeed = new Text(modelComposite,SWT.NONE);
		txtCutoutWindSpeed.setEditable(false);
		txtCutoutWindSpeed.setBackground(COLOR_WHITE);
		txtCutoutWindSpeed.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,false));
		GridLayoutFactory.fillDefaults().generateLayout(parent);
		
	}
	
	
	@Focus
	public void setFocus() {
		txtModel.setFocus();

	}
	
	

	/**
	 * This method is kept for E3 compatiblity. You can remove it if you do not
	 * mix E3 and E4 code. <br/>
	 * With E4 code you will set directly the selection in ESelectionService and
	 * you do not receive a ISelection
	 * 
	 * @param s
	 *            the selection received from JFace (E3 mode)
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) ISelection s) {
		if (s==null || s.isEmpty())
			return;

		if (s instanceof IStructuredSelection) {
			IStructuredSelection iss = (IStructuredSelection) s;
			if (iss.size() == 1)
				setSelection(iss.getFirstElement());
			else
				setSelection(iss.toArray());
		}
	}

	/**
	 * This method manages the selection of your current object. In this example
	 * we listen to a single Object (even the ISelection already captured in E3
	 * mode). <br/>
	 * You should change the parameter type of your received Object to manage
	 * your specific selection
	 * 
	 * @param o
	 *            : the current object received
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Object o) {

		// Remove the 2 following lines in pure E4 mode, keep them in mixed mode
		if (o instanceof ISelection) // Already captured
			return;

		// Test if label exists (inject methods are called before PostConstruct)
		if(txtModel!=null) {
			txtModel.setText(((TurbineModel)o).getName());
			txtCutinWindSpeed.setText(((TurbineModel)o).getTurbineDetail().getCutinWindSpeed());
			txtRatedPower.setText(((TurbineModel)o).getTurbineDetail().getRatedPower());
			txtRatedWindSpeed.setText(((TurbineModel)o).getTurbineDetail().getRatedWindSpeed());
			txtCutoutWindSpeed.setText(((TurbineModel)o).getTurbineDetail().getCutoutWindSpeed());
		}
	}

	/**
	 * This method manages the multiple selection of your current objects. <br/>
	 * You should change the parameter type of your array of Objects to manage
	 * your specific selection
	 * 
	 * @param o
	 *            : the current array of objects received in case of multiple selection
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Object[] selectedObjects) {

		// Test if label exists (inject methods are called before PostConstruct)
		/*if (myLabelInView != null)
			myLabelInView.setText("This is a multiple selection of " + selectedObjects.length + " objects");*/
	}

}