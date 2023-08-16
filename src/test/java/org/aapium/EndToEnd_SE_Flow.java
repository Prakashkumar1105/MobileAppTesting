package org.aapium;


import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.appium.pageobjct.android.AcceptAndAssignToTech;
import org.appium.pageobjct.android.ApproveTheEventByTD;
import org.appium.pageobjct.android.AssignToServiceCenterFromTD;
import org.appium.pageobjct.android.EditServiceEvent;
import org.appium.pageobjct.android.LoginAndEventCreation;
import org.appium.pageobjct.android.SP_AdminCompleteTheEvent;
import org.appium.pageobjct.android.ServiceEventCreation;
import org.appium.pageobjct.android.TechnicianActions;

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

public class EndToEnd_SE_Flow extends BasicCodesToStartApp  {
	
	
	// Scenario and steps
//		1. Login as a TD-admin+driver user
//		2. create a new event 
//		3. edit event like 
//			reported location, add associated numbers, Breakdownnotes, Fleet pofiles
//			Add tire service line and save the event
//		4. Logout and login as a SP-admin user 
//		5. Open the newly created event and assign to SP-tech wothout accept the event
//		6. Logout and login as a SP-Tech user 
//		7. Go and filter the submitted event and accept with ETA
//		8. Add the PLT in service lines 
//		9. Edit the service line in Mark as repaired page
//		10. Tech checklist questions for Mark as repaired
//		11. Logged out and login as a SP-admin and complete the event 
//		12. Logged out and login as a TD-admin+driver and Approve the event 
//
	
	
	
	@Test 
		
	public void TDflow() throws InterruptedException, IOException  {

							
		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("TD_User"));                                                       //	prakash+tdadmin@reach24.net , prakash+stgadd+drv@reach24.net, prakash+tdadmin@reach24.net
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));
		LoginAndEventCreation.login();
		LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(3000);
		//String name = driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm this address']")).getText();
		//Assert.assertEquals(name, "Confirm this address");
		LoginAndEventCreation.confirmlocation();

	
		ServiceEventCreation EventCreation = new ServiceEventCreation(driver);
		EventCreation.clickservicerequest();
		EventCreation.SelectEquipmentType();
		EventCreation.EnterEquipmentnumber(StoreProperties.get("Equipment_Number"));
		EventCreation.SetEP(StoreProperties.get("Equipment_Provider"));
		EventCreation.SelectLocationType();
		//EventCreation.SelectNotLoaded();
		//EventCreation.Slect_driverOut();
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
		
		EditServiceEvent EditTheEvent = new EditServiceEvent(driver);
		EditTheEvent.ClickserviceAndInspection();
		EditTheEvent.OpenNewEvent();
		EditTheEvent.Clickediticon();
		EditTheEvent.ChangeReportedLocation();
		EditTheEvent.EnterAssosiatedpowerunit(StoreProperties.get("Assosiatedpowerunit"));
		EditTheEvent.EnterAssociatedcontainer(StoreProperties.get("Associatedcontainer"));
		EditTheEvent.Clicknotloaded();
		EditTheEvent.EnterBreakdownnotes(StoreProperties.get("Breakdownnotes"));
		EditTheEvent.ClickFleetinstruction();
		EditTheEvent.EnterPOdetail(StoreProperties.get("Po_Number"));
		EditTheEvent.EnterLicensePlate(StoreProperties.get("License_Plate"));
		EditTheEvent.EnterDOT(StoreProperties.get("Dot_Number"));
		EditTheEvent.EnterODOmeter(StoreProperties.get("Odometer_Reading"));
		EditTheEvent.EnterHubometer(StoreProperties.get("Hubometer_Reading"));
		EditTheEvent.EnterVechilemodel(StoreProperties.get("Vehicle_Mode"));
		EditTheEvent.ClickNextbutton();
		EditTheEvent.ClickAddserviceline();
		EditTheEvent.Addserviceline();
		//EditTheEvent.AddimageFromGallery();
		EditTheEvent.ClickNextbutton2();
		EditTheEvent.ClickDone();  
		Thread.sleep(3000);
	
		
		AssignToServiceCenterFromTD FSC = new AssignToServiceCenterFromTD(driver);
		FSC.ClickAssignToServiceCenter();
		Thread.sleep(11000);
		FSC.ClickAssignButton();
		Thread.sleep(3000);
		FSC.Close_EventdetailScreen();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));  
		FSC.Click_usersetting();
		FSC.Click_logouticon();
		FSC.Click_yesButton();
		Thread.sleep(3000);
	
	}	
	@Test (dependsOnMethods = {"TDflow"})

	public void SC_Admin_flow() throws InterruptedException  {
		
		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		//LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("SP1_admin_User"));
		LoginAndEventCreation.setpassword(StoreProperties.get("Password")); 
		LoginAndEventCreation.login();
		//LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(2000);
		LoginAndEventCreation.confirmlocation();
		

		EditServiceEvent EditTheEvent = new EditServiceEvent(driver);
		EditTheEvent.ClickserviceAndInspection();
		Thread.sleep(4000);
		
		EditTheEvent.OpenNewEvent();
	
		
		AcceptAndAssignToTech SP_Admin_Action = new AcceptAndAssignToTech(driver);
		SP_Admin_Action.ClickMoreAcion();
		SP_Admin_Action.ClickAssigntech();
		SP_Admin_Action.SelectTechnician();
		Thread.sleep(3000);
		
		AssignToServiceCenterFromTD FSC = new AssignToServiceCenterFromTD(driver);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		FSC.Click_usersetting();
		FSC.Click_logouticon();
		FSC.Click_yesButton();
		Thread.sleep(3000);  
	}  
	 
	@Test (dependsOnMethods = {"SC_Admin_flow"})
	public void SP_Tech_Flow() throws InterruptedException {
		
		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		//LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("SP1_Tech_User"));  //	prakash+sp1technician@reach24.net, prakashtechsp1@reach24.net
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));
		LoginAndEventCreation.login();
		//LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(2000);
		LoginAndEventCreation.confirmlocation();
		
		
		EditServiceEvent EditTheEvent = new EditServiceEvent(driver);
		EditTheEvent.ClickserviceAndInspection();
		Thread.sleep(4000);
	
		TechnicianActions TechAction = new TechnicianActions(driver);
		Thread.sleep(3000);
		TechAction.ClickFilter();
		TechAction.Click_submitted();
		Thread.sleep(2000);
		TechAction.Clickassignedevent();
		Thread.sleep(2000);
		TechAction.ClickAcceptButton();
		TechAction.GiveETA();
		TechAction.ClickConfrimETAButton();
		Thread.sleep(3000);
	 
		//PLT
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TechAction.ClickServiceline();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TechAction.SelectServiceLine();
		Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.attributeContains(driver.findElement(By.xpath("//android.widget.TextView[@text='Add']")), "text", "Add"));
		TechAction.ClickAddPLT();
		Thread.sleep(2000);
		TechAction.Click_AddPart_Button();
		TechAction.Click_AddDefaultPart_Button();
		Thread.sleep(2000);
		TechAction.Select_DefaultPart();
		TechAction.Click_Addselected_Button();
		Thread.sleep(2000);
		TechAction.Click_Addlabor();
		Thread.sleep(2000);
		TechAction.Click_SpecialService();
		TechAction.Select_Regularhours();
		Thread.sleep(2000);
		TechAction.Enter_hoursWorked("2");
		TechAction.Click_AddLabor_Button();
		Thread.sleep(3000);
		TechAction.Click_Savechanges_Button();
		Thread.sleep(3000);
		TechAction.ClickBackButton();
		TechAction.Close_EventDetailsPage();
		
		//Edit the service line in Mark as repaired 	
		
		TechAction.Click_MarkAsRepair_button();
		Thread.sleep(3000);
		TechAction.Click_editfor_serviceline();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TechAction.Click_edit_defect();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TechAction.Click_edit_location();
		TechAction.Clickdone1();


		//Tech checklist questions for Mark as repaired
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		TechAction.Click_MarkAsRepaired_Button();
		Thread.sleep(3000);
		TechAction.select_FC_Datefield();
		TechAction.Enter_FC_Number("9876334");
		TechAction.Enter_FC_Name("Test");
		TechAction.Enter_Name("Tech");
		Thread.sleep(3000);
		TechAction.Enter_Number("67574535");
		Thread.sleep(3000);
		TechAction.Select_Date();
		TechAction.Select_Dropdown();
		Thread.sleep(6000);
		
		AssignToServiceCenterFromTD FSC = new AssignToServiceCenterFromTD(driver);
		Thread.sleep(2000);
		FSC.ClickBackFrom_EventAction();
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		FSC.Click_usersetting();
		FSC.Click_logouticon();
		FSC.Click_yesButton();
		Thread.sleep(3000);
	}
	
	@Test (dependsOnMethods = {"SP_Tech_Flow"})
	public void SP_Admin_Complete_Flow() throws InterruptedException {
	
		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		//LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("SP1_admin_User"));
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));
		LoginAndEventCreation.login();
		//LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(2000);
		LoginAndEventCreation.confirmlocation();
		
		EditServiceEvent EditTheEvent = new EditServiceEvent(driver);
		EditTheEvent.ClickserviceAndInspection();
		EditTheEvent.OpenNewEvent();
		Thread.sleep(4000);
	
		SP_AdminCompleteTheEvent SP_Admin_Complete_Action = new SP_AdminCompleteTheEvent(driver);
		SP_Admin_Complete_Action.Click_complete_Button();
		SP_Admin_Complete_Action.complete_The_event();
		Thread.sleep(3000);
		AssignToServiceCenterFromTD FSC = new AssignToServiceCenterFromTD(driver);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		FSC.Click_usersetting();
		FSC.Click_logouticon();
		FSC.Click_yesButton();
		Thread.sleep(3000);
	
	}
	@Test (dependsOnMethods = {"SP_Admin_Complete_Flow"})
	public void TD_Admin_Approve_Flow() throws InterruptedException {
	
		
		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		//LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("TD_User")); //	prakash+stgadd+drv@reach24.net, prakash+tdadmin@reach24.net
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));
		LoginAndEventCreation.login();
		//LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(3000);
		
		String name = driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm this address']")).getText();
		Assert.assertEquals(name, "Confirm this address");
		LoginAndEventCreation.confirmlocation();
	
		EditServiceEvent EditTheEvent = new EditServiceEvent(driver);
		EditTheEvent.ClickserviceAndInspection();
		EditTheEvent.OpenNewEvent();
		Thread.sleep(4000);
		
		ApproveTheEventByTD ApproveAction = new ApproveTheEventByTD(driver);
		ApproveAction.Click_Approve_Button();
	
	}   
	
	
	}
		
		
		
		
		
		
	