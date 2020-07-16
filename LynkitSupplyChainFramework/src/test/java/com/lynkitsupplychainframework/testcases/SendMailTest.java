package com.lynkitsupplychainframework.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.lynkitsupplychainframework.pages.BaseClass;
import com.lynkitsupplychainframework.pages.SendMail;
import com.lynkitsupplychainframework.utility.ExcelDataProvider;

public class SendMailTest  extends BaseClass{
ExcelDataProvider excel=new ExcelDataProvider();
	
	@Test(priority=1)
	public void loginApp() throws InterruptedException
	{
		logger=report.createTest("Login to Supply Chain");
	//driver=BrowserFactory.startApplication(driver, "Chrome", "https://lynkit.io/login");
		//loginPage.loginToSupplyChain("btmaster@gmail.com", "1234");
		logger.info("Starting application");
		SendMail sendM=PageFactory.initElements(driver, SendMail.class);
		sendM.loginToSupplyChain(excel.getStringData("Login",1,0), excel.getStringData("Login",1,1));
		logger.pass("Login Success");
		}
}
