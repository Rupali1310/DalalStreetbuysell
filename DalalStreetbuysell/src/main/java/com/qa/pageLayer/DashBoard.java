package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class DashBoard extends TestBase {
	
	public DashBoard()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement search_box;
	public void enterCompanyName(String companyname)
	{
		search_box.sendKeys(companyname);
	}
	@FindBy(partialLinkText="WIPRO")
	private WebElement company_name_wipro;
	public void clickOnCompanyNameWipro()
	{
		company_name_wipro.click();
	}
	
	@FindBy(partialLinkText="INFOSYS")
	private WebElement company_name_infosys;
	public void clickCompanyNameInfosys()
	{
		company_name_infosys.click();
	}

}
