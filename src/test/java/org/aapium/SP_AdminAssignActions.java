package org.aapium;


import java.util.concurrent.TimeUnit;
import org.appium.pageobjct.android.AcceptAndAssignToTech;
import org.appium.pageobjct.android.AssignToServiceCenterFromTD;
import org.appium.pageobjct.android.EditServiceEvent;
import org.appium.pageobjct.android.LoginAndEventCreation;
import org.appium.pageobjct.android.ServiceEventCreation;
import org.appium.pageobjct.android.TechnicianActions;
import org.appium.utils.StoreProperties;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SP_AdminAssignActions extends BasicCodesToStartApp {
	
	
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
		Thread.sleep(4000);
	
		EditTheEvent.OpenNewEvent();
	
		
		AcceptAndAssignToTech SP_Admin_Action = new AcceptAndAssignToTech(driver);
		SP_Admin_Action.ClickMoreAcion();
		SP_Admin_Action.ClickAssigntech();
	//	SP_Admin_Action.SelectTechnician();
		Thread.sleep(3000);
	
	
		
		
		
		
		
		
		
		
		
	
	}
	}

