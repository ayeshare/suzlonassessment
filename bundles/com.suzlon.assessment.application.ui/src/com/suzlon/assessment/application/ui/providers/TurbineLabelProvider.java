/**
 * 
 */
package com.suzlon.assessment.application.ui.providers;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import com.suzlon.assessment.application.ui.parts.TurbineDetailsView;

import model.TurbineDetail;
import model.TurbineModel;

/**
 * @author Ayesha
 *
 */
public class TurbineLabelProvider implements ITableLabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return true;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if(element instanceof TurbineModel) {
			return ((TurbineModel)element).getName();
		}
		else if(element instanceof TurbineDetailsView) {
			switch(columnIndex) {
			case 0: return ((TurbineDetail)element).getRatedPower();
			case 1: return ((TurbineDetail)element).getCutinWindSpeed();
			case 2: return ((TurbineDetail)element).getRatedWindSpeed();
			case 3: return ((TurbineDetail)element).getCutoutWindSpeed();
			}
		}
		return "";
	}

}
