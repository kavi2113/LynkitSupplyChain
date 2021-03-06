package com.lynkitsupplychainframework.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.lynkitsupplychainframework.pages.BaseClass;

import com.lynkitsupplychainframework.pages.PTLGodown;
import com.lynkitsupplychainframework.utility.ExcelDataProvider;


public class PTLGodownTest  extends BaseClass{
	
ExcelDataProvider excel=new ExcelDataProvider();
	
	@Test(priority=1)
	public void loginApp() throws InterruptedException
	{
		logger=report.createTest("Login to Supply Chain");
	//driver=BrowserFactory.startApplication(driver, "Chrome", "https://lynkit.io/login");
		//loginPage.loginToSupplyChain("btmaster@gmail.com", "1234");
		logger.info("Starting application");
		PTLGodown loginPage=PageFactory.initElements(driver, PTLGodown.class);
		loginPage.loginToSupplyChain(excel.getStringData("Login",1,0), excel.getStringData("Login",1,1));
		logger.pass("Login Success");
		}
	
	@Test(priority=2)
	public void basicDetails() throws InterruptedException
	{
		PTLGodown loginPage=PageFactory.initElements(driver, PTLGodown.class);
		loginPage.basicDetails();
		}
	
	@Test(priority=3)
	public void createBill()
	{
		PTLGodown loginPage=PageFactory.initElements(driver, PTLGodown.class);
		loginPage.createBill(excel.getStringData("GR",0,2), excel.getStringData("GR",0,3), excel.getStringData("GR",0,4));
		}

	@Test(priority=4)
	public void weightDetails()
	{
		PTLGodown loginPage=PageFactory.initElements(driver, PTLGodown.class);
		loginPage.weightDetails(excel.getStringData("GR",0,5),excel.getStringData("GR",0,6),excel.getStringData("GR",0,7),excel.getStringData("GR",0,8));
		}

	@Test(priority=5)
	public void invoiceDetails()
	{
		PTLGodown loginPage=PageFactory.initElements(driver, PTLGodown.class);
		loginPage.invoiceDetails(excel.getStringData("GR",0,9),excel.getStringData("GR",0,10),excel.getStringData("GR",0,11));
		}
	
	@Test(priority=6)
	public void paymentDetails() throws InterruptedException
	{
		PTLGodown loginPage=PageFactory.initElements(driver, PTLGodown.class);
		loginPage.paymentDetails(excel.getStringData("GR",0,12),excel.getStringData("GR",0,13),excel.getStringData("GR",0,14));
		}
	
	@Test(priority=7)
	public void createGoods() throws InterruptedException
	{
		PTLGodown loginPage=PageFactory.initElements(driver, PTLGodown.class);
		loginPage.createGbutton();
		}	

		
}
