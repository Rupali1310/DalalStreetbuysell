package com.qa.testLayer;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;

	
	public class LoginPageTest extends TestBase
	{
		@Test
		public void verifyLoginTest() {
		
		LoginPage login=new LoginPage();
		login.enterEmailAddress("vinayakghumare08@gmail.com");
		login.enterPassword("Test@1234");
		login.clickOnLoginButton();
		}
	}


