package org.appium.pageobjct.android;

import org.appium.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AcceptAndAssignToTech extends AndroidActions {
AndroidDriver driver;
	
	public AcceptAndAssignToTech (AndroidDriver driver) 
	
	{
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	
	
	//driver.findElement(By.xpath("//android.view.ViewGroup[@class='android.view.ViewGroup']")).click();
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[13]")
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[13]/android.view.ViewGroup")
	private WebElement MoreAction;
	
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")
	//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[16]/android.widget.TextView")                        
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Assign Tech']")                        
	private WebElement Assigntech;
	
	//driver.findElement(By.xpath("//android.widget.TextView[@text='SP1 test - tech']")).click();
	@AndroidFindBy(xpath="//android.widget.TextView[@text='MAT SP1 - tech']")
	//@AndroidFindBy(xpath="//android.widget.TextView[@text='SP1 test - tech']")
	private WebElement selecttech;
	
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Accept']")).click();
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Accept']")
		//@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[12]/android.widget.TextView")
		private WebElement AcceptTheEvent ;
		
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='60 min']")).click();
		@AndroidFindBy(xpath="//android.widget.TextView[@text='60 min']")
		private WebElement ETA ;
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm']")).click();
		@AndroidFindBy(xpath="//android.widget.TextView[@text='Confirm']")
		private WebElement ConfrimETA;
	
	

	
	public void ClickMoreAcion() {
		MoreAction.click();
		
	}
	
	public void ClickAssigntech() {
		Assigntech.click();
	}
	
	public void SelectTechnician() {
		selecttech.click();
	}
	
	public void ClickAcceptButton() {
		AcceptTheEvent.click();
	}
	
	public void GiveETA() {
		ETA.click();
	}
	
	public void ClickConfrimETAButton() {
		ConfrimETA.click();
		
	}
}



