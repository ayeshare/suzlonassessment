/**
 * 
 */
package com.suzlon.assessment.application;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.part.IntroPart;

/**
 * @author Ayesha
 *
 */
public class SuzlonAssessmentIntro extends IntroPart {
	private Composite composite;
	private FormToolkit toolkit;
	private ScrolledForm form;
	@Override
	public void standbyStateChanged(boolean standby) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createPartControl(Composite parent) {
		toolkit = new FormToolkit(parent.getDisplay());
		form = toolkit.createScrolledForm(parent);
		form.getBody().setLayout(new TableWrapLayout());
		composite = toolkit.createComposite(form.getBody(),SWT.NULL);
		TableWrapLayout tl = new TableWrapLayout();
		tl.numColumns=1;
		tl.horizontalSpacing=0;
		tl.leftMargin=20;
		tl.rightMargin=20;
		composite.setLayout(tl);
		composite.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB,TableWrapData.FILL_GRAB));
		Label lblWelcomeText = toolkit.createLabel(composite,"Welcome");
		lblWelcomeText.setText("Welcome");
		lblWelcomeText.setFont(new Font(Display.getDefault(), "Arial", 20, SWT.BOLD));
		Label lblMessage = toolkit.createLabel(composite,"This app tests my RCP Skills");
		lblMessage.setFont(new Font(Display.getDefault(), "Arial", 14, SWT.NORMAL));
		form.getBody().layout(true);
		
	}

	@Override
	public void setFocus() {
		form.getBody().setFocus();		
	}

	
}
