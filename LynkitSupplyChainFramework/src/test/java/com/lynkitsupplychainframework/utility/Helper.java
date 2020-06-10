package com.lynkitsupplychainframework.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	public static String captureScreenshot(WebDriver driver)
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String screenshotPath=System.getProperty("user.dir")+"./Screenshots/Login"+getCurrentDateTime()+".png";
		try
		{
		FileHandler.copy(src, new File(screenshotPath));	
		System.out.println("Screenshot captured");
		}
		catch(IOException e)
		{
		System.out.println("Unable to capture screenshot"+e.getMessage());	
		}
		return screenshotPath;
	}
	
	public static String getCurrentDateTime()
	{
		
		DateFormat customFormat=new SimpleDateFormat("MM_dd_YYYY_HH_mm_ss");
Date currentDate=new Date();
return customFormat.format(currentDate);
	}

}
