package com.suzlon.assessment.application;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import com.suzlon.assessment.application.ui.parts.TurbineDetailsView;
import com.suzlon.assessment.application.ui.parts.TurbinesNavigationView;

public class Perspective implements IPerspectiveFactory {

	@Override	
	public void createInitialLayout(IPageLayout layout) {
		
		layout.setEditorAreaVisible(false);
		layout.addStandaloneView(TurbinesNavigationView.ID,  true, IPageLayout.LEFT, 0.30f, layout.getEditorArea());
		layout.addStandaloneView(TurbineDetailsView.ID,  true, IPageLayout.RIGHT, 0.70f, layout.getEditorArea());
	}
}
