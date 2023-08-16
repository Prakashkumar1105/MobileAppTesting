package org.aapium;


import java.util.concurrent.TimeUnit;

import org.appium.pageobjct.android.EditServiceEvent;
import org.appium.pageobjct.android.LoginAndEventCreation;
import org.appium.pageobjct.android.TechnicianActions;
import org.appium.utils.StoreProperties;
import org.testng.annotations.Test;

public class SP_TechActions extends BasicCodesToStartApp {
	
	@SuppressWarnings("deprecation")
	@Test

	public void TechFlow() throws InterruptedException  {
	
		LoginAndEventCreation LoginAndEventCreation = new LoginAndEventCreation(driver);
		LoginAndEventCreation.clickstart();
		LoginAndEventCreation.setusername(StoreProperties.get("SP1_Tech_User"));  //	prakash+sp1technician@reach24.net, prakashtechsp1@reach24.net
		LoginAndEventCreation.setpassword(StoreProperties.get("Password"));
		LoginAndEventCreation.login();
		LoginAndEventCreation.allowlocationpermission();
		Thread.sleep(2000);
		LoginAndEventCreation.confirmlocation();
		
		EditServiceEvent EditTheEvent = new EditServiceEvent(driver);
		EditTheEvent.ClickserviceAndInspection();
	
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
		
	  /*  TechAction.ClickSearchicon();
		TechAction.SearchAssignedevent("AA024200");
		Thread.sleep(3000);
		TechAction.clickassignedevent();
		TechAction.selectevent();
	*/
		
		//PLT
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		TechAction.select_FC_Datefield();
		TechAction.Enter_FC_Number("9876334");
		TechAction.Enter_FC_Name("Test");
		Thread.sleep(3000);
		TechAction.Enter_Name("Tech");
		TechAction.Enter_Number("67574535");
		Thread.sleep(3000);
		TechAction.Select_Date();
	
		Thread.sleep(2000);
		TechAction.Select_Dropdown();
		

		
//		TechAction.ClickSearchicon();
//		TechAction.SearchAssignedevent("AA020262");
//		Thread.sleep(3000);
//		TechAction.clickassignedevent();
//		TechAction.selectevent();
//		Thread.sleep(2000);
//		TechAction.click_TechAccept();
		
		
		
	
	}
	}

