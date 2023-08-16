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

public class SE_Edit_WalkinFleet extends AndroidActions {
AndroidDriver driver;
	
	public SE_Edit_WalkinFleet (AndroidDriver driver) 
	
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
	
	
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='Event Details']"))
	private WebElement eventdetail;
	
	
	
	
	
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
	
	
	@AndroidFindBy(xpath=("//android.widget.TextView[@text='Please select']"))
	private WebElement ETA;
	
	
	
	
	
	
	
	
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
	
	public void Click_eventdetail() {
		eventdetail.click();
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
	
	 public void Select_ETA() {
		 ETA.click();
		 driver.findElement(By.id("android:id/button1")).click();
		 driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();	
	 }
}



