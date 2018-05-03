/**
 * 
 */
package com.suzlon.assessment.application.ui.providers;

import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;

/**
 * @author Ayesha
 *
 */
public class TurbineModelContentProvider implements IStructuredContentProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		if(inputElement instanceof List) {
			return ((List)inputElement).toArray();
		}
		return null;
	}

}
