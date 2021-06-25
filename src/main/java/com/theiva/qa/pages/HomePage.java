package com.theiva.qa.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.theiva.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[text()=' thanga ']")
	WebElement displayedUserName;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage validateUser(){
		displayedUserName.isDisplayed();
		Assert.assertEquals(displayedUserName.getText(),"thangba");
		return this;
	}
	
}
