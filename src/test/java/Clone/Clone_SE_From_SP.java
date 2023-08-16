package Clone;


import java.util.concurrent.TimeUnit;

import org.aapium.BasicCodesToStartApp;
import org.appium.pageobjct.android.AssignToServiceCenterFromTD;
import org.appium.pageobjct.android.EditServiceEvent;
import org.appium.pageobjct.android.LoginAndEventCreation;
import org.appium.pageobjct.android.TechnicianActions;
import org.appium.pageobjct.android.clone.CloneServiceEvent;
import org.appium.utils.StoreProperties;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;

public class Clone_SE_From_SP extends BasicCodesToStartApp  {      //Clone_SE_From_TD
	
	
	
	
	@Test 

	public void Clone_With_Walkin() throws InterruptedException  {
	
		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("SP1_Tech_User")); //	prakash+stgadd+drv@reach24.net, prakash+tdadmin@reach24.net
		LoginAndEventCreation.setpassword(StoreProperties.get("Password")); 
		LoginAndEventCreation.login();
		LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(3000);
		//String name = driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm this address']")).getText();
		//Assert.assertEquals(name, "Confirm this address");
		LoginAndEventCreation.confirmlocation();
		
		CloneServiceEvent CloneTheEvent = new CloneServiceEvent(driver);
		CloneTheEvent.ClickserviceAndInspection();
		CloneTheEvent.ClickSearchicon();
		CloneTheEvent.SearchAssignedevent("AA024459");
		Thread.sleep(3000);
		CloneTheEvent.clickassignedevent();
		CloneTheEvent.selectevent();
		CloneTheEvent.Click_EventDetails();
		Thread.sleep(2000);
		CloneTheEvent.ClickThreeDots();
		CloneTheEvent.Click_cloneButton();
		
		// Valiadte Reported loaction
		String SEC_RL1 = driver.findElement(By.xpath("(//android.widget.TextView)[@text='San Francisco, CA, USA']")).getText();
		Assert.assertEquals(SEC_RL1, "San Francisco, CA, USA");
		
		String SEC_EQ_Type1 = driver.findElement(By.xpath("(//android.widget.TextView)[@text='Chassis']")).getText();
		Assert.assertEquals(SEC_EQ_Type1, "Chassis");
		
		String WF_Name = driver.findElement(By.xpath("(//android.widget.TextView)[@text='Walkin Fleet']")).getText();
		Assert.assertEquals(WF_Name, "Walkin Fleet");
		
		String WF_location = driver.findElement(By.xpath("(//android.widget.TextView)[@text='San Francisco, CA, USA']")).getText();
		Assert.assertEquals(WF_location, "San Francisco, CA, USA");
		
		String WF_phnumber = driver.findElement(By.xpath("(//android.widget.TextView)[@text='(122) 333-4444']")).getText();
		Assert.assertEquals(WF_phnumber, "(122) 333-4444");
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Breakdown Notes\").instance(0))"));
		
		String SEC_DN1 = driver.findElement(By.xpath("(//android.widget.EditText)[@text='messi']")).getText();
		Assert.assertEquals(SEC_DN1, "messi");
		
		String SEC_DPN1 = driver.findElement(By.xpath("(//android.widget.EditText)[@text='9342326678']")).getText();
		Assert.assertEquals(SEC_DPN1, "9342326678");
		/*
		String SEC_LOADED1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.view.ViewGroup")).getText();
		Assert.assertEquals(SEC_LOADED1, "LOADED");
		
		String SEC_DRIVER1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup[3]/android.view.ViewGroup")).getText();
		Assert.assertEquals(SEC_DRIVER1, "OUT");
		
		String SEC_LT1 = driver.findElement(By.xpath("(//android.widget.TextView)[@text='In bay']")).getText();
		Assert.assertEquals(SEC_LT1, "In bay");
		*/
		String SEC_BN1 = driver.findElement(By.xpath("(//android.widget.EditText)[@text='Brake plate damage']")).getText();
		Assert.assertEquals(SEC_BN1, "Brake plate damage");
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Chassis\").instance(0))"));
		
		CloneTheEvent.Enter_Equipmentnumber("PQRS123456");
		CloneTheEvent.Click_UseWalkinCustomer();
		CloneTheEvent.Click_AddFleet();
		Thread.sleep(2000);
		//CloneTheEvent.SetEP("Prakash test ");
		CloneTheEvent.ClickNextbutton();
		CloneTheEvent.ClickAddserviceline();
		CloneTheEvent.Addserviceline();
		CloneTheEvent.ClickNextbutton();
		CloneTheEvent.ClickDone();
		Thread.sleep(2000);
		CloneTheEvent.ClickserviceAndInspection();
		TechnicianActions TechAction = new TechnicianActions(driver);
		Thread.sleep(3000);
		TechAction.ClickFilter();
		TechAction.Click_submitted();
		Thread.sleep(2000);
		TechAction.Clickassignedevent();
	
		CloneTheEvent.Click_EventDetails();
		Thread.sleep(2000);
		//CloneTheEvent.OpenNewEvent();
		CloneTheEvent.Click_seemore();
		
		String ASS_EVENT = driver.findElement(By.xpath("//android.widget.TextView[@text='Associated Events']")).getText();
		Assert.assertEquals(ASS_EVENT, "Associated Events");
		
		String WF_Name1 = driver.findElement(By.xpath("(//android.widget.TextView)[@text='Walkin Fleet']")).getText();
		Assert.assertEquals(WF_Name1, "Walkin Fleet");
		
		String WF_location1= driver.findElement(By.xpath("(//android.widget.TextView)[@text='San Francisco, CA, USA']")).getText();
		Assert.assertEquals(WF_location1, "San Francisco, CA, USA");
		
		String WF_phnumber1 = driver.findElement(By.xpath("(//android.widget.TextView)[@text='(122) 333-4444']")).getText();
		Assert.assertEquals(WF_phnumber1, "(122) 333-4444");
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Reported User\").instance(0))"));
		CloneTheEvent.Close_child_event();
		AssignToServiceCenterFromTD FSC = new AssignToServiceCenterFromTD(driver);
		FSC.ClickBackFrom_EventAction();
		FSC.ClickBackFrom_EventAction();
		CloneTheEvent.ClickserviceAndInspection();
		CloneTheEvent.ClickSearchicon();
		CloneTheEvent.SearchAssignedevent("AA024459");
		Thread.sleep(3000);
		CloneTheEvent.clickassignedevent();
		CloneTheEvent.selectevent();
		CloneTheEvent.Click_EventDetails();
		CloneTheEvent.Click_seemore();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Departed Terminal\").instance(0))"));
		
		String ASS_EVENT2 = driver.findElement(By.xpath("//android.widget.TextView[@text='Associated Events']")).getText();
		Assert.assertEquals(ASS_EVENT2, "Associated Events");
		
		

	}	
	

	}
		
		
		
		
		
		
	
