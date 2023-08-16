package org.aapium;


import org.appium.pageobjct.android.EditServiceEvent;
import org.appium.pageobjct.android.LoginAndEventCreation;
import org.appium.pageobjct.android.SP_AdminCompleteTheEvent;
import org.appium.utils.StoreProperties;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SP_AdminCompleteActions extends BasicCodesToStartApp {
	

	
	@Test

	public void SPAdminFlow() throws InterruptedException  {
	
		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("SP1_admin_User"));
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));
		LoginAndEventCreation.login();
		LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(2000);
		LoginAndEventCreation.confirmlocation();
		
		EditServiceEvent EditTheEvent = new EditServiceEvent(driver);
		EditTheEvent.ClickserviceAndInspection();
		EditTheEvent.OpenNewEvent();
	
		
		SP_AdminCompleteTheEvent SP_Admin_Complete_Action = new SP_AdminCompleteTheEvent(driver);
		SP_Admin_Complete_Action.Click_complete_Button();
		SP_Admin_Complete_Action.complete_The_event();
		
		
	
	}
	}

