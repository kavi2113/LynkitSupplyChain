package com.lynkitsupplychainframework.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.lynkitsupplychainframework.pages.BaseClass;
import com.lynkitsupplychainframework.pages.PTLDoorDelivery;

import com.lynkitsupplychainframework.utility.ExcelDataProvider;

public class PTLDoorDeliveryTest extends BaseClass{

ExcelDataProvider excel=new ExcelDataProvider();
	
	@Test(priority=1)
	public void loginApp()
	{
		logger=report.createTest("Login to Supply Chain");
	//driver=BrowserFactory.startApplication(driver, "Chrome", "https://lynkit.io/login");
		//loginPage.loginToSupplyChain("btmaster@gmail.com", "1234");
		logger.info("Starting application");
		PTLDoorDelivery loginPage=PageFactory.initElements(driver, PTLDoorDelivery.class);
		loginPage.loginToSupplyChain(excel.getStringData("Login",1,0), excel.getStringData("Login",1,1));
		logger.pass("Login Success");
		}
	
	@Test(priority=2)
	public void basicDetails()
	{
		PTLDoorDelivery loginPage=PageFactory.initElements(driver, PTLDoorDelivery.class);
		loginPage.basicDetails();
		}
	
	@Test(priority=3)
	public void createBill()
	{
		PTLDoorDelivery loginPage=PageFactory.initElements(driver, PTLDoorDelivery.class);
		loginPage.createBill(excel.getStringData("GR",0,2), excel.getStringData("GR",0,3), excel.getStringData("GR",0,4));
		}

	@Test(priority=4)
	public void weightDetails()
	{
		PTLDoorDelivery loginPage=PageFactory.initElements(driver, PTLDoorDelivery.class);
		loginPage.weightDetails(excel.getStringData("GR",0,5),excel.getStringData("GR",0,6),excel.getStringData("GR",0,7),excel.getStringData("GR",0,8));
		}

	@Test(priority=5)
	public void invoiceDetails()
	{
		PTLDoorDelivery loginPage=PageFactory.initElements(driver, PTLDoorDelivery.class);
		loginPage.invoiceDetails(excel.getStringData("GR",0,9),excel.getStringData("GR",0,10),excel.getStringData("GR",0,11));
		}
	
	@Test(priority=6)
	public void paymentDetails()
	{
		PTLDoorDelivery loginPage=PageFactory.initElements(driver, PTLDoorDelivery.class);
		loginPage.paymentDetails(excel.getStringData("GR",0,12),excel.getStringData("GR",0,13),excel.getStringData("GR",0,14));
		}
	
	@Test(priority=7)
	public void createGoods()
	{
		PTLDoorDelivery loginPage=PageFactory.initElements(driver, PTLDoorDelivery.class);
		loginPage.createGbutton();
		}	
}
