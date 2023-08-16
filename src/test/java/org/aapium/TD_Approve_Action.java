package org.aapium;


import org.appium.pageobjct.android.ApproveTheEventByTD;
import org.appium.pageobjct.android.EditServiceEvent;
import org.appium.pageobjct.android.LoginAndEventCreation;
import org.appium.utils.StoreProperties;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TD_Approve_Action extends BasicCodesToStartApp {
	
	@Test 

	public void TDflow() throws InterruptedException  {
	
		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("TD_User")); //	prakash+stgadd+drv@reach24.net, prakash+tdadmin@reach24.net
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));
		LoginAndEventCreation.login();
		LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(3000);
		
		String name = driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm this address']")).getText();
		Assert.assertEquals(name, "Confirm this address");
		LoginAndEventCreation.confirmlocation();
		
		
		
		
	
		EditServiceEvent EditTheEvent = new EditServiceEvent(driver);
		EditTheEvent.ClickserviceAndInspection();
		EditTheEvent.OpenNewEvent();
		
		ApproveTheEventByTD ApproveAction = new ApproveTheEventByTD(driver);
		ApproveAction.Click_Approve_Button();
		
		
		
	}	
		
	}	
		
		
		
		
	