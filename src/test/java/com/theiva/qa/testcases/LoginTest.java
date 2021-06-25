package com.theiva.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.theiva.qa.base.TestBase;
import com.theiva.qa.pages.HomePage;
import com.theiva.qa.pages.LoginPage;

public class LoginTest extends TestBase{
	
	public LoginPage homelogin;
	public HomePage homepage;
	
	@BeforeMethod
	public void setUp(){
		startBrowser();
	 homelogin = new LoginPage();	
	}
	
	@Test
	public void successfulLogin() throws InterruptedException {
		
	    homelogin.login();
		Thread.sleep(20000);
		//return homepage;
	}
	
	

}
