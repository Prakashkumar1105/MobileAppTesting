package org.appium.pageobjct.android.walkin_fleet;

import org.appium.utils.AndroidActions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SE_Creationwith_WalkinFleet extends AndroidActions {
AndroidDriver driver;
	
	public SE_Creationwith_WalkinFleet (AndroidDriver driver) 
	
	{
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup")).click();
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup")
	private WebElement servicerequest ;
	
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView")).click();
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView"))
	private WebElement Equipmenttype;
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Enter the number']")).sendKeys("ABCD123456");
	@AndroidFindBy(xpath=("//android.widget.EditText[@text='Enter the number']"))
	private WebElement Equipmentnumber;
	
	
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.widget.TextView")).click();
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Search Equipment Provider']")).sendKeys("prakash test ep");
	//driver.findElement(By.xpath("//android.widget.TextView[@class='android.widget.TextView']")).click();
	
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='Use Walk-in Customer']"))
	private WebElement UseWalkinCustomer;
	
	@AndroidFindBy(xpath=("//android.widget.EditText[@text='Enter name of EP/TD']"))
	private WebElement TDEP_Name;
	
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='select the address']"))
	private WebElement address;
	
	@AndroidFindBy(xpath=("//android.widget.EditText[@text='Enter phone number']"))
	private WebElement phnumber;
	
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='Add Fleet']"))
	private WebElement AddFleet;
	
	
	
	
	
	//driver.findElement(By.xpath("//android.view.ViewGroup[@class='android.view.ViewGroup']")).click();
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='Yard check']"))
	private WebElement LocationType;
	
	//@AndroidFindBy(accessibility=("loadedc_false"))
	@AndroidFindBy(xpath=("//android.view.ViewGroup[@content-desc=\"loadedc_false\"]"))
	private WebElement unload ;
	
	//@AndroidFindBy(accessibility=("driver_with-unitc_false"))
	@AndroidFindBy(xpath=("//android.view.ViewGroup[@content-desc=\"driver_with-unitc_false\"]"))
	private WebElement driverOut ;
	
	
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")).click();
	//@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"))
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='Next']"))
	private WebElement Nextbutton;
	
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]")).click();
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]"))
	private WebElement Addservicelineitem;
	
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")).click();
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]"))
	private WebElement System;
	
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]"))
	private WebElement Subsystem;
	
	//driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup")).click();
	@AndroidFindBy(xpath=("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup"))
	private WebElement Service;
	
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView[2]"))
	private WebElement defect ;
	
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.TextView[2]"))
	private WebElement location ;
	
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='Next']"))
	private WebElement ServicelineNextbutton;
	
	
	//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup"))
	private WebElement Donebutton;
	
	
	public void clickservicerequest() throws InterruptedException {
		
			servicerequest.click();
			Thread.sleep(2000);

		
	}
	
	public void SelectEquipmentType() {
		Equipmenttype.click();
	}
	
	public void EnterEquipmentnumber(String EQnumber) {
		Equipmentnumber.sendKeys(EQnumber);
	}
	
	public void Click_UseWalkinCustomer() {
		UseWalkinCustomer.click();
		}
	public void Enter_TDEP_Name(String WF_name) {
		TDEP_Name.sendKeys(WF_name);
	}
	
	public void Select_WF_Location() throws InterruptedException {
		try {
			address.click();
			driver.findElement(By.xpath("//android.widget.EditText[@text='Type to search a location']")).click();
			driver.findElement(By.xpath("//android.widget.EditText[@text='Type to search a location']")).sendKeys("Hayward");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Switch")).click();
			
			
			
			
		}catch(StaleElementReferenceException e) {
			e.printStackTrace();      }
		}
	public void Enter_phnuber(String WF_number) throws InterruptedException {
		Thread.sleep(3000);
		phnumber.sendKeys(WF_number);
	
	}
	 public void Click_AddFleet_button() throws InterruptedException {
		 
		 AddFleet.click();
		 Thread.sleep(3000);
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Add fleet profile\"));"));
			
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	public void SelectLocationType() {
		LocationType.click();
	}
	
	public void SelectNotLoaded() {
		unload.click();
		
	}
	public void Slect_driverOut() {
		driverOut.click();
	}
	public void ClickNextButton() {
		Nextbutton.click();
	}
	public void ClickAddservicelineitem () {
		try {
			Addservicelineitem.click();
		}
		catch (StaleElementReferenceException e) {
			
		}
	}
	public void SelectSystem() {
		try {
			System.click();
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView")).click();	
		
		}
		catch (StaleElementReferenceException e) {
			
		}
		}
	
	public void SelectSubsystem () {
		
		try {
			Subsystem.click();
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView")).click();
		
			
		}
		catch (StaleElementReferenceException e) {
			
		}
			
	
		}
	public void Selectservice() {
		
		try {

			Service.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='ABSECUCable - ReplaceW/New']")).click(); 

		}
		catch (StaleElementReferenceException e) {
			
		}
		
			
		}
	public void SelectDefect() {
	try {
		
		defect.click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView")).click();
	}
	catch (StaleElementReferenceException e) {
		
	}
	}
	public void SelectLocation() {
		try {
			location.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='Under']")).click();
		}
		catch (StaleElementReferenceException e) {
			
		}
	}
	
	public void ClickServicelineNextbutton() {
		ServicelineNextbutton.click();
	}
	public void ClickDonebutton() {
		Donebutton.click();
	}

	
}



