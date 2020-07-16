package com.lynkitsupplychainframework.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.lynkitsupplychainframework.pages.BaseClass;
import com.lynkitsupplychainframework.pages.FTLGodown;
import com.lynkitsupplychainframework.utility.ExcelDataProvider;

public class FTLGodownTest extends BaseClass{
	//WebDriver driver;
	ExcelDataProvider excel=new ExcelDataProvider();
	
	@Test(priority=1)
	public void loginApp() throws InterruptedException
	{
		logger=report.createTest("Login to Supply Chain");
	//driver=BrowserFactory.startApplication(driver, "Chrome", "https://lynkit.io/login");
		//loginPage.loginToSupplyChain("btmaster@gmail.com", "1234");
		logger.info("Starting application");
		FTLGodown loginPage=PageFactory.initElements(driver, FTLGodown.class);
		loginPage.loginToSupplyChain(excel.getStringData("Login",1,0), excel.getStringData("Login",1,1));
		logger.pass("Login Success");
		}
	
	@Test(priority=2)
	public void basicDetails() throws InterruptedException
	{
		FTLGodown loginPage=PageFactory.initElements(driver, FTLGodown.class);
		loginPage.basicDetails();
		}
	
	@Test(priority=3)
	public void createBill()
	{
		FTLGodown loginPage=PageFactory.initElements(driver, FTLGodown.class);
		loginPage.createBill(excel.getStringData("GR",0,2), excel.getStringData("GR",0,3), excel.getStringData("GR",0,4));
		}
	
	
	@Test(priority=4)
	public void weightDetails()
	{
		FTLGodown loginPage=PageFactory.initElements(driver, FTLGodown.class);
		loginPage.weightDetails(excel.getStringData("GR",0,5),excel.getStringData("GR",0,6),excel.getStringData("GR",0,7),excel.getStringData("GR",0,8));
		}

	@Test(priority=5)
	public void invoiceDetails()
	{
		FTLGodown loginPage=PageFactory.initElements(driver, FTLGodown.class);
		loginPage.invoiceDetails(excel.getStringData("GR",0,9),excel.getStringData("GR",0,10),excel.getStringData("GR",0,11));
		}
	
	@Test(priority=6)
	public void paymentDetails() throws InterruptedException
	{
		FTLGodown loginPage=PageFactory.initElements(driver, FTLGodown.class);
		loginPage.paymentDetails(excel.getStringData("GR",0,12),excel.getStringData("GR",0,13),excel.getStringData("GR",0,14));
		}
	
	@Test(priority=7)
	public void transportDetails() throws InterruptedException
	{
		FTLGodown loginPage=PageFactory.initElements(driver, FTLGodown.class);
		loginPage.transportDetails(excel.getStringData("GR",0,12),excel.getStringData("GR",0,13),excel.getStringData("GR",0,14));
		}
	
	
	
	@Test(priority=8)
	public void createGoods()
	{
		FTLGodown loginPage=PageFactory.initElements(driver, FTLGodown.class);
		loginPage.createGbutton();
		}	
}
