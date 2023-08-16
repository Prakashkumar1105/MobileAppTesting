package Walkin_Fleet;


import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.aapium.BasicCodesToStartApp;
import org.appium.pageobjct.android.AcceptAndAssignToTech;
import org.appium.pageobjct.android.ApproveTheEventByTD;
import org.appium.pageobjct.android.AssignToServiceCenterFromTD;
import org.appium.pageobjct.android.EditServiceEvent;
import org.appium.pageobjct.android.LoginAndEventCreation;
import org.appium.pageobjct.android.SP_AdminCompleteTheEvent;
import org.appium.pageobjct.android.ServiceEventCreation;
import org.appium.pageobjct.android.TechnicianActions;
import org.appium.pageobjct.android.walkin_fleet.SE_Creationwith_WalkinFleet;
import org.appium.pageobjct.android.walkin_fleet.SE_Edit_WalkinFleet;

import org.appium.utils.StoreProperties;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CreateSEWith_WailkinFleet extends BasicCodesToStartApp  {
	
	@Test 

	public void Event_Creation_with_walkinfleet() throws InterruptedException, IOException  {

		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("SP2_admin_User"));    //	prakash+addsp2@reach24.net     , prakash+spadmin@reach24.net                                              //	prakash+tdadmin@reach24.net , prakash+stgadd+drv@reach24.net, prakash+tdadmin@reach24.net
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));
		LoginAndEventCreation.login();
		LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(3000);
		//String name = driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm this address']")).getText();
		//Assert.assertEquals(name, "Confirm this address");
		LoginAndEventCreation.confirmlocation();

	
		ServiceEventCreation EventCreation = new ServiceEventCreation(driver);
		SE_Creationwith_WalkinFleet Walikin_Fleet = new SE_Creationwith_WalkinFleet(driver);
		EventCreation.clickservicerequest();
		EventCreation.SelectEquipmentType();
		EventCreation.EnterEquipmentnumber(StoreProperties.get("Equipment_Number"));
		Walikin_Fleet.Click_UseWalkinCustomer();
		Walikin_Fleet.Enter_TDEP_Name(StoreProperties.get("WalkinFleet_name"));
		Walikin_Fleet.Select_WF_Location();
		Walikin_Fleet.Enter_phnuber(StoreProperties.get("WalkinFleet_PhoneNumber"));
		Walikin_Fleet.Click_AddFleet_button();
		EventCreation.SelectLocationType();
		EventCreation.ClickNextButton();
		EventCreation.ClickAddservicelineitem();
		EventCreation.SelectSystem();
		EventCreation.SelectSubsystem();
		EventCreation.ClickServicelineNextbutton();
		EventCreation.ClickDonebutton();             
		Thread.sleep(3000);
		
		// verify the walkin fleet details in event deatils page
		
		EditServiceEvent EditTheEvent = new EditServiceEvent(driver);
		SE_Edit_WalkinFleet Edit_Walikin_Fleet = new SE_Edit_WalkinFleet(driver);
		
		EditTheEvent.ClickserviceAndInspection();
		EditTheEvent.OpenNewEvent();
		Edit_Walikin_Fleet.Click_eventdetail();
		
		String Verify_WF_Name = driver.findElement(By.xpath("(//android.widget.TextView)[@text='Walkin Fleet1']")).getText();
		Assert.assertEquals(Verify_WF_Name, "Walkin Fleet1");
		
		String Verify_WF_phnumber = driver.findElement(By.xpath("(//android.widget.TextView)[@text='(988) 456-2340']")).getText();
		Assert.assertEquals(Verify_WF_phnumber, "(988) 456-2340"); 
		
		String Verify_WF_location = driver.findElement(By.xpath("(//android.widget.TextView)[@text='Haywards Heath, UK']")).getText();
		Assert.assertEquals(Verify_WF_location, "Haywards Heath, UK");
	
		
	}	  
	}	
	