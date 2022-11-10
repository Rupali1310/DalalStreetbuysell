package com.qa.testLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.DashBoard;
import com.qa.pageLayer.ExchangePage;
import com.qa.testBase.TestBase;

public class BuyShareTest  extends TestBase{
	@Test
	public void verifyBuyScenariosWipro() throws InterruptedException
	{
	    Thread.sleep(2000);
		dash.enterCompanyName("wipro");
		Thread.sleep(2000);
		dash.clickOnCompanyNameWipro();;
		Thread.sleep(2000);
		 ex.clickOnBuyButton1();
		 ex.enterQuantityOfShare(10);
		 Thread.sleep(2000);
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(1000,1100)");
		// Thread.sleep(3000);
		ex.clickOnBuyButton2();
		Thread.sleep(2000);
		 String expected_result="Order Created successfully";
		String actual_result=ex.getStatus();
		Assert.assertEquals(actual_result, expected_result);
		

	}
	@Test
	public void verifyBuyScenarioInfosys() throws InterruptedException
	{
		Thread.sleep(2000);
		dash.enterCompanyName("infosys");
		Thread.sleep(2000);
		dash.clickCompanyNameInfosys();
		Thread.sleep(3000);
		ex.clickOnBuyButton1();
		Thread.sleep(5000);
		ex.enterQuantityOfShare(10);
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(1000,1100)");
		ex.clickOnBuyButton2();
		Thread.sleep(2000);
		 String expected_result="Order Created successfully";
		String actual_result=ex.getStatus();
		Assert.assertEquals(actual_result, expected_result);
	}

}
