package com.suzlon.assessment.application;

import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }
    
    @Override
    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        return new ActionBarAdvisor(configurer);
    }
    
    @Override
    public void preWindowOpen() {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        configurer.setInitialSize(new Point(560, 350));
        configurer.setShowCoolBar(false);
        configurer.setShowStatusLine(true);
        configurer.setShowMenuBar(true);
    }
    @Override
    public void postWindowCreate() {
    	// TODO Auto-generated method stub

//   	try {
//			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(TurbinesNavigationView.ID);
//			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(TurbineDetailsView.ID);
//		} catch (PartInitException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	super.postWindowCreate();
    }
}
