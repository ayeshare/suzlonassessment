/**
 * 
 */
package com.suzlon.assessment.application.test;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.results.VoidResult;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.ui.PlatformUI;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class ToggleStatusBarTest{

    private static SWTWorkbenchBot bot;

    @BeforeClass
    public static void beforeClass() throws Exception {
        // don't use SWTWorkbenchBot here which relies on Platform 3.x
    	UIThreadRunnable.syncExec(new VoidResult() {
    		  public void run() {
    		    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().forceActive();
    		  }
    		});
        bot = new SWTWorkbenchBot();
    }
    @Test
    public void executeToggleStatusBar() {
    	SWTBotMenu windowMenu = bot.menu("Window");
    	Assert.assertNotNull(windowMenu);
        SWTBotMenu statusBarMenu = windowMenu.menu("Hide Status Bar");
        Assert.assertNotNull(statusBarMenu);
        statusBarMenu.click();
        Assert.assertEquals("Show &Status Bar",statusBarMenu.getText());
        statusBarMenu.click();
        Assert.assertEquals("Hide &Status Bar",statusBarMenu.getText());
        statusBarMenu.click();
    }
    @Test
    public void closeTurbinesView() {
    	SWTBotView viewById = bot.viewByTitle("Welcome");
        viewById.close();
        SWTBotView turbinesView = bot.viewByTitle("Turbines");
        Assert.assertNotNull(turbinesView);
        turbinesView.close();
        turbinesView.show();
        Assert.assertTrue(turbinesView.isActive());
        
        
        SWTBotView turbineDetailsView = bot.viewByTitle("Turbine Details");
        Assert.assertNotNull(turbineDetailsView);
        turbineDetailsView.close();
        turbineDetailsView.show();
        Assert.assertTrue(turbineDetailsView.isActive());
    }
    @Test
    public void executeOpenPreferences() {
    	Display.getDefault().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				bot.menu("Window").menu("Preferences").click();		
			}
		});
    	
		SWTBotShell prefsShell = bot.shell("Preferences");
		prefsShell.activate();
		SWTBotButton apply = bot.button("Apply and Close");
		bot.waitUntil(org.eclipse.swtbot.swt.finder.waits.Conditions.widgetIsEnabled(apply));
		apply.click();
    }
    
    @Test
    public void executeOpenAbout() {
		bot.menu("Help").menu("About").click();		
		SWTBotShell prefsShell = bot.shell("About");
		prefsShell.activate();
		SWTBotButton apply = bot.button("Close");
		bot.waitUntil(org.eclipse.swtbot.swt.finder.waits.Conditions.widgetIsEnabled(apply));
		apply.click();
    }
    
    
    
    @AfterClass
    public static void sleep() {
        bot.sleep(2000);
    }
}