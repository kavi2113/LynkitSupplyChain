
package com.lynkitsupplychainframework.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.lynkitsupplychainframework.pages.BaseClass;
import com.lynkitsupplychainframework.pages.CreateDeliveryChallan;

import com.lynkitsupplychainframework.utility.ExcelDataProvider;

public class CreateDeliveryChallanTest extends BaseClass{
ExcelDataProvider excel=new ExcelDataProvider();
	
	@Test(priority=1)
	public void loginApp() throws InterruptedException
	{
		logger=report.createTest("Login to Supply Chain");
	//driver=BrowserFactory.startApplication(driver, "Chrome", "https://lynkit.io/login");
		//loginPage.loginToSupplyChain("btmaster@gmail.com", "1234");
		logger.info("Starting application");
		CreateDeliveryChallan loginPage=PageFactory.initElements(driver, CreateDeliveryChallan.class);
		loginPage.loginToSupplyChain(excel.getStringData("Login",1,0), excel.getStringData("Login",1,1));
		logger.pass("Login Success");
		}
	

	@Test(priority=2)
	public void createDelChallan() throws InterruptedException
	{
		CreateDeliveryChallan loginPage=PageFactory.initElements(driver, CreateDeliveryChallan.class);
		loginPage.createDelChallan(excel.getStringData("DC",1,0),excel.getStringData("DC",1,1),excel.getStringData("DC",1,2));
		}
	
	@Test(priority=3)
	public void consignorPopup() throws InterruptedException
	{
		CreateDeliveryChallan loginPage=PageFactory.initElements(driver, CreateDeliveryChallan.class);
		loginPage.consignorPopup();
		}
	
	@Test(priority=4)
	public void createDC() throws InterruptedException
	{
		CreateDeliveryChallan loginPage=PageFactory.initElements(driver, CreateDeliveryChallan.class);
		loginPage.createDC();
		}
}
