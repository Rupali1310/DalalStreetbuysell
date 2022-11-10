package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.pageLayer.DashBoard;
import com.qa.pageLayer.ExchangePage;
import com.qa.pageLayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static 	LoginPage login;
	public static DashBoard dash;
	 public static ExchangePage ex;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	       login=new LoginPage();
		login.enterEmailAddress("vinayakghumare08@gmail.com");
		login.enterPassword("Test@1234");
		login.clickOnLoginButton();
		 dash=new DashBoard();
		 ex=new  ExchangePage();
	
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}

}
