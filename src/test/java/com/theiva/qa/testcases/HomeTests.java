package com.theiva.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.theiva.qa.base.TestBase;
import com.theiva.qa.pages.HomePage;
import com.theiva.qa.pages.LoginPage;

public class HomeTests extends TestBase {
	
public HomePage homepage;
public LoginPage loginpage;
	
	@BeforeMethod
	public void setUp(){
		startBrowser();
	 loginpage = new LoginPage();
	 homepage=new HomePage();
	 homepage=loginpage.login();
	}
//first test case
	@Test
	public void verifyHomepageLogo() {
		 homepage.validateUser();
	}
}
