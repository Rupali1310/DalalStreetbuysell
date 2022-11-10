package com.qa.testLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class SellShareTest  extends TestBase{
	@Test
	public void verifySellShare() throws InterruptedException
	{
		Thread.sleep(2000);
		dash.enterCompanyName("Wipro");
		dash.clickOnCompanyNameWipro();
		Thread.sleep(2000);
		ex.clickOnSellBtn1();
		Thread.sleep(6000);
		ex.enterSellQuantity(100);
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(1000,1200)");
		ex.clickOnSellBtn2();
		String expected_result="Order Created successfully";
		String actual_result=ex.getStatus();
		Assert.assertEquals(actual_result, expected_result);
	}
	@Test
	public void verifySellShareInfosys() throws InterruptedException
	{
		Thread.sleep(2000);
		dash.enterCompanyName("INFOSYS");
		dash.clickCompanyNameInfosys();
		Thread.sleep(2000);
		ex.clickOnSellBtn1();
		Thread.sleep(6000);
		ex.enterSellQuantity(10);
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(1000,1200)");
		ex.clickOnSellBtn2();
		String expected_result="Order Created successfully";
		String actual_result=ex.getStatus();
		Assert.assertEquals(actual_result, expected_result);
	}
	

}
