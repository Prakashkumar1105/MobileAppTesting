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

public class SP_AdminCompleteTheEvent  extends AndroidActions {
AndroidDriver driver;
	
	public SP_AdminCompleteTheEvent (AndroidDriver driver) 
	
	{
		super(driver);
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Complete']")
	private WebElement Complete1;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Complete']")
	private WebElement Complete2;

	
	public void Click_complete_Button() {
		Complete1.click();
		
	}

	public void complete_The_event() {
		Complete2.click();
	}
}



