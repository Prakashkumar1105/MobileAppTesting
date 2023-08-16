package org.appium.pageobjct.android.PLT;

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

public class PartsAndLabor extends AndroidActions {
AndroidDriver driver;
	
	public PartsAndLabor (AndroidDriver driver) 
	
	{
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	// Add plt from Event details page
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter ther number']")
	private WebElement Partcode ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Search part']")
	private WebElement Search_part ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add Custom']")
	private WebElement Add_Custom ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter the number']")
	private WebElement code ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter the description']")
	private WebElement discription ;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
	private WebElement Groupcode ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Done']")
	private WebElement done ;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
	private WebElement EditWorkingHours ;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup")				  
	private WebElement Delete_Part ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Edit']")
	private WebElement PLT_EditButton;
	
	// For mark as repaired
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='View Parts / Labor details ']")
	private WebElement View_Parts_details ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Wheels, rims, lugs, tires']")
	private WebElement Verify_PLT_Tireservice ;
	
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")
	private WebElement Edit_brakes ;
	
	
	
	
	
	
	
	
	
	
	 public void Enter_Partcode(String num) {
		 Partcode.sendKeys(num);
		 
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Search part\"));")); 
		 }
	 public void Click_Search_part_Button() {
		 Search_part.click(); 
	 }
	 
	 public void Click_Add_Custom_Button() {
		 Add_Custom.click();
	 }
	 
	 public void Enter_PartLabor_code(String codenum){
		 code.sendKeys(codenum);
	 }
	 
	 public void Enter_discription(String dis) {
		 discription.sendKeys(dis);
	 }
	 
	 public void Enter_Groupcode(String Gcode) {
		 Groupcode.sendKeys(Gcode);
	 }
	 
	 public void Click_done_Button() {
		 done.click();
	 }
	 public void Edit_workingHours(String hours) throws InterruptedException {
		 EditWorkingHours.click();
		  EditWorkingHours.sendKeys(hours);
		  driver.hideKeyboard();
	 }
	 
	 public void Delete_PartDetail() {
		 Delete_Part.click();
	 }
	 
	 public void Click_PLT_EditButton() {
		 PLT_EditButton.click();
	 }
	 
	 // for mark as repaired
	 
	 public void Click_View_Parts_details() {
		 View_Parts_details.click();
	 }
	 
	 public void Click_Verify_PLT_Tireservice() {
		 Verify_PLT_Tireservice.click();
	 }
	 public void Click_Edit_brakes() {
		 Edit_brakes.click();
		 
	 }
	 
	 
}



