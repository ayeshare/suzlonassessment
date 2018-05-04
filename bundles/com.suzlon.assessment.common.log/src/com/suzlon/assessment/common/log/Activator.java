package com.suzlon.assessment.common.log;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.service.datalocation.Location;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;




public class Activator implements BundleActivator {

	private static BundleContext context;

	public static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		configureLogbackInBundle(bundleContext.getBundle());
	}

	private void configureLogbackInBundle(Bundle bundle) throws JoranException, IOException {
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        JoranConfigurator jc = new JoranConfigurator();
        jc.setContext(context);
        context.reset();
        String logDir = getWorkspaceLocation();
        context.putProperty("LOG_DIR", logDir);
        Location configurationLocation = Platform.getInstallLocation();
        File logbackFile = new File(configurationLocation.getURL().getPath(), "logback.xml");
        if(logbackFile.exists()) {
            jc.doConfigure(logbackFile);
        } else {
            URL logbackConfigFileUrl = FileLocator.find(bundle, new Path("logback.xml"), null);
            jc.doConfigure(logbackConfigFileUrl.openStream());
        }
    }
	private String getWorkspaceLocation() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
        return workspace.getRoot().getLocation().toFile().getAbsolutePath();	
	}
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
