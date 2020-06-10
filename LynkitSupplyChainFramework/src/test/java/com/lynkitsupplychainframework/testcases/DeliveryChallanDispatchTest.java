package com.lynkitsupplychainframework.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.lynkitsupplychainframework.pages.BaseClass;

import com.lynkitsupplychainframework.pages.DeliveryChallanDispatch;
import com.lynkitsupplychainframework.utility.ExcelDataProvider;

public class DeliveryChallanDispatchTest  extends BaseClass{
ExcelDataProvider excel=new ExcelDataProvider();
	
	@Test(priority=1)
	public void loginApp()
	{
		logger=report.createTest("Login to Supply Chain");
	//driver=BrowserFactory.startApplication(driver, "Chrome", "https://lynkit.io/login");
		//loginPage.loginToSupplyChain("btmaster@gmail.com", "1234");
		logger.info("Starting application");
		DeliveryChallanDispatch loginPage=PageFactory.initElements(driver, DeliveryChallanDispatch.class);
		loginPage.loginToSupplyChain(excel.getStringData("Login",1,0), excel.getStringData("Login",1,1));
		logger.pass("Login Success");
		}
}
