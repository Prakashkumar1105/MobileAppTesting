package FleetAndTech_Checklist;
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
import org.appium.pageobjct.android.Checklists.Checklists;
import org.appium.pageobjct.android.PLT.PartsAndLabor;
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

public class FC_TC_TechAccept_Enroute_MarkAsRepaired extends BasicCodesToStartApp  {
	
	@Test 
	public void PLT_in_EventDetailsPage() throws InterruptedException, IOException  {

		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		ServiceEventCreation EventCreation = new ServiceEventCreation(driver);
		EditServiceEvent EditTheEvent = new EditServiceEvent(driver);
		TechnicianActions TechAction = new TechnicianActions(driver);
		PartsAndLabor PLT = new PartsAndLabor(driver);
		AcceptAndAssignToTech SP_Admin_Action = new AcceptAndAssignToTech(driver);
		AssignToServiceCenterFromTD FSC = new AssignToServiceCenterFromTD(driver);
		Checklists checklist = new Checklists(driver);
		
				
		LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("SP2_admin_User"));    //	prakash+addsp2@reach24.net     , prakash+spadmin@reach24.net                                              //	prakash+tdadmin@reach24.net , prakash+stgadd+drv@reach24.net, prakash+tdadmin@reach24.net
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));
		LoginAndEventCreation.login();
		LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(3000);
		LoginAndEventCreation.confirmlocation();

		EventCreation.clickservicerequest();
		EventCreation.SelectEquipmentType();
		EventCreation.EnterEquipmentnumber(StoreProperties.get("Equipment_Number"));
		checklist.SetEP(StoreProperties.get("Equipment_Provider"));
		checklist.SetFleet(StoreProperties.get("Fleet"));
		EventCreation.SelectLocationType();
		EventCreation.ClickNextButton();
		EventCreation.ClickAddservicelineitem();
		EventCreation.SelectSystem();
		EventCreation.SelectSubsystem();
		EventCreation.Selectservice();
		EventCreation.SelectDefect();
		EventCreation.SelectLocation();		
		EventCreation.ClickServicelineNextbutton();
		EventCreation.ClickDonebutton();             
		Thread.sleep(3000);
		
		EditTheEvent.ClickserviceAndInspection();
		Thread.sleep(3000);
		TechAction.ClickFilter();
		TechAction.Click_submitted();
		Thread.sleep(2000);
		TechAction.Clickassignedevent();
		Thread.sleep(2000);
		SP_Admin_Action.ClickMoreAcion();
		SP_Admin_Action.ClickAssigntech();
		checklist.Select_Tech();
		Thread.sleep(5000);
		TechAction.ClickAcceptButton();
		TechAction.GiveETA();
		TechAction.ClickConfrimETAButton();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		FSC.Click_usersetting();
		FSC.Click_logouticon();
		FSC.Click_yesButton();
		Thread.sleep(3000);
			
	
		LoginAndEventCreation.setusername(StoreProperties.get("SP2_Tech1_User"));  
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));
		LoginAndEventCreation.login();
		LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(2000);
		LoginAndEventCreation.confirmlocation();    
		EditTheEvent.ClickserviceAndInspection();
		Thread.sleep(3000);
		TechAction.ClickFilter();
		checklist.Click_Inprocess();
		Thread.sleep(2000);
		TechAction.Clickassignedevent();
		
	// For Tech Accept action
		
		checklist.Click_TechAccept();
		checklist.Select_Date();
		checklist.Select_Dropdown();
		checklist.Enter_Number(StoreProperties.get("Number"));
		checklist.Enter_Name(StoreProperties.get("Text"));
		checklist.AddImage();
		
		checklist.Select_Date();
		checklist.Enter_Name(StoreProperties.get("Text"));
		checklist.AttachImage();
		checklist.Enter_Number(StoreProperties.get("Number"));
		checklist.Select_Dropdown();
		Thread.sleep(6000);

		// For Departure action 
		
		checklist.Click_Deparure_button();
		checklist.Select_Date();
		checklist.Select_Dropdown();
		checklist.Enter_Number(StoreProperties.get("Number"));
		checklist.Enter_Name(StoreProperties.get("Text"));
		checklist.AttachImage();
		//checklist.AddImage();
		
		checklist.Select_Date();
		checklist.Enter_Name(StoreProperties.get("Text"));
		checklist.AttachImage();
		checklist.Enter_Number(StoreProperties.get("Number"));
		checklist.Select_Dropdown();
		checklist.Click_allow();
		Thread.sleep(6000);
		
		// For Arrived action 
		
		checklist.Click_Arrived_button();
		checklist.Select_Date();
		checklist.Select_Dropdown();
		checklist.Enter_Number(StoreProperties.get("Number"));
		checklist.Enter_Name(StoreProperties.get("Text"));
		checklist.AttachImage();
		//checklist.AddImage();
		
		checklist.Select_Date();
		checklist.Enter_Name(StoreProperties.get("Text"));
		checklist.AttachImage();
		checklist.Enter_Number(StoreProperties.get("Number"));
		checklist.Select_Dropdown();
		TechAction.ClickConfrimETAButton();
		Thread.sleep(3000);
		
		// For Mark as Repaired action 
		
		TechAction.Click_MarkAsRepair_button();
		Thread.sleep(2000);
		TechAction.Click_MarkAsRepaired_Button();
		checklist.Select_Date();
		checklist.Select_Dropdown();
		checklist.Enter_Number(StoreProperties.get("Number"));
		checklist.Enter_Name(StoreProperties.get("Text"));
		checklist.AttachImage();
		//checklist.AddImage();
		
		checklist.Select_Date();
		checklist.Enter_Name(StoreProperties.get("Text"));
		checklist.AttachImage();
		checklist.Enter_Number(StoreProperties.get("Number"));
		checklist.Select_Dropdown();
	}	  
	}	
	