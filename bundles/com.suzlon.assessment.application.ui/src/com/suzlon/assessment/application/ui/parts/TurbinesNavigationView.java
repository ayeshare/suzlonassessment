package com.suzlon.assessment.application.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.suzlon.assessment.application.ui.providers.TurbineLabelProvider;
import com.suzlon.assessment.application.ui.providers.TurbineModelContentProvider;

import model.ModelFactory;

public class TurbinesNavigationView {
	private static final Logger LOG = LoggerFactory.getLogger(TurbinesNavigationView.class);
	public static final String ID="com.suzlon.assessment.application.ui.partDescFragment.TurbinesNavigationView";
	private TableViewer modelViewer;
	@Inject
	private ESelectionService selectionService;

	@Inject
	private EPartService partService;
	@PostConstruct
	public void createPartControl(Composite parent) {
		LOG.debug("Enter in create part control of turbines navigation view");

		final Composite modelComposite = new Composite(parent, SWT.NONE);
		modelComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		final TableColumnLayout tableColumnLayout = new TableColumnLayout();
		modelComposite.setLayout(tableColumnLayout);

		// Table viewer
		modelViewer = new TableViewer(modelComposite, SWT.FULL_SELECTION);
		modelViewer.getTable().setLinesVisible(false);
		modelViewer.getTable().setHeaderVisible(false);
		final TableViewerColumn firstNameColumn = new TableViewerColumn(
				modelViewer, SWT.NONE);
		firstNameColumn.getColumn().setText("Model");
		tableColumnLayout.setColumnData(firstNameColumn.getColumn(),new ColumnWeightData(100));
		modelViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {
						LOG.debug("Selection changed in turbines model view");
						IStructuredSelection selection = (IStructuredSelection) event
								.getSelection();
						selectionService.setSelection(selection.getFirstElement());
					}
				});
		
		modelViewer.addDoubleClickListener(new IDoubleClickListener() {
			boolean partExist=false;
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				// TODO Auto-generated method stub
				
				for(MPart part: partService.getParts() ){
					if(part.getLabel().equals("Turbine Details")){
						partService.showPart(part, PartState.ACTIVATE);
						partExist=true;
					}
					if(partExist)break;
				}
				IStructuredSelection selection = (IStructuredSelection) event
						.getSelection();
				selectionService.setSelection(selection.getFirstElement());
			}
		});
		TurbineModelContentProvider contentProvider = new TurbineModelContentProvider();

		modelViewer.setContentProvider(contentProvider);

		
		modelViewer.setLabelProvider(new TurbineLabelProvider());

		LOG.debug("Fetching models");
		modelViewer.setInput(ModelFactory.eINSTANCE.getAllModels());
		LOG.info("Fetched turbine models");
		GridLayoutFactory.fillDefaults().generateLayout(parent);
		LOG.debug("End of create part control in turbines navigation view");
		
	}

	@Focus
	public void setFocus() {
		modelViewer.getControl().setFocus();

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
		if (modelViewer != null)
			modelViewer.setSelection(new StructuredSelection(o));
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
