package com.lynkitsupplychainframework.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.lynkitsupplychainframework.utility.BrowserFactory;
import com.lynkitsupplychainframework.utility.ConfigDataProvider;
import com.lynkitsupplychainframework.utility.ExcelDataProvider;
import com.lynkitsupplychainframework.utility.Helper;


public class BaseClass {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;

	@BeforeSuite
	public void setUpSuite()
	{
		Reporter.log("Setting up reports and Test is gettinge ready", true);
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider();
		ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"./Reports/SupplyChain "+Helper.getCurrentDateTime()+".html"));
	report=new ExtentReports();
	report.attachReporter(extent);
	
	Reporter.log("Setting Done: Test can be started", true);
	}
	
	@BeforeClass
	public void setup()
	{
		Reporter.log("Trying to start Browser and Getting application ready", true);
		
		driver=BrowserFactory.startApplication(driver, config.getBrowser(), config.getStagingURL());
	
		Reporter.log("Browser and Application is up and running", true);
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
	BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) throws IOException
	{
		Reporter.log("Test is about to end", true);
		if(result.getStatus()==ITestResult.FAILURE)
		{
		
		logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.pass("Test Passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
	}
		report.flush();
		Reporter.log("Test Completed >>> Reports Generated", true);	
	}
	
	
}
