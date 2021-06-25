package com.theiva.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.theiva.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//finding Page locators 
	
	@FindBy(className="text-account")
	WebElement loginlink;
	
	@FindBy(id="username")
	WebElement userNameTxt;
	
	@FindBy(id="password")
	WebElement passwordTxt;
	
	@FindBy(name="login")
	WebElement loginBtn;
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	//Actions
	
	public LoginPage navigatToLoginPage() {
		
		System.out.println("entered into home page");
		
		//driver.findElement(By.className("text-account")).click();;
		loginlink.click();
		return this;
	}
	
	public LoginPage enterUserName() {
		userNameTxt.sendKeys("thanga@therkins.com");
		return this;
	}
	
	public LoginPage enterPassword() {
		passwordTxt.sendKeys("Theiva@3sons");
		return this;
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
		//return new HomePage();
	}
	
	public HomePage login(){
		loginlink.click();
		userNameTxt.sendKeys("thanga@therkins.com");
		passwordTxt.sendKeys("Theiva@3sons");
		loginBtn.click();
		//loginBtn.click();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", loginBtn);
		    	
		return new HomePage();
	}
	
	
}
