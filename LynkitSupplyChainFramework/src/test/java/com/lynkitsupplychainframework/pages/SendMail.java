package com.lynkitsupplychainframework.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendMail {

	WebDriver driver;

	public SendMail(WebDriver ldriver)
	{
		this.driver=ldriver;
		}
	//Login Web elements
	@FindBy(xpath="//input[@placeholder='E-MAIL/UserID']") WebElement uname; 
	@FindBy(xpath="//input[@placeholder='PASSWORD']") WebElement pass;
	@FindBy(xpath="//button[@class='login-bt ft-btn']") WebElement loginButton;

	//Delivery Challan menu Web element
	@FindBy(xpath="//a[contains(text(),'Delivery Challan')]") WebElement deliveryChallanButton;

	
	//At Hub Web element
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-challan-list[1]/main[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]") WebElement atHub;
	
	
	@FindBy(xpath="//div[@class='content_holder']//div[1]//div[3]//div[4]//i[1]") WebElement detail;
	
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-challan-detail[1]/main[1]/div[1]/div[2]/div[1]/button[1]") WebElement sendDC;
	
	@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[3]/button[1]") WebElement confirmDispatch;
	
	@FindBy(xpath="//div[@class='content_holder']//div[1]//div[3]//div[2]//i[1]") WebElement shareButton;
	@FindBy(xpath="//input[@id='sendgrEmail']") WebElement typeEmail;
	@FindBy(xpath="//textarea[@placeholder='Email Notification...']") WebElement typeNotification;
	@FindBy(xpath="//span[contains(text(),'Proceed')]") WebElement proceedButton;
	@FindBy(xpath="/html[1]/body[1]/div[5]/div[1]/div[3]/button[1]") WebElement yesButton;
	@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[3]/button[1]") WebElement okButton;

	public void loginToSupplyChain(String username, String password)
	{
	uname.sendKeys(username);
	pass.sendKeys(password);
	loginButton.click();
	deliveryChallanButton.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	atHub.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	shareButton.click();
	typeEmail.sendKeys("kavinder@lynkit.in");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	typeNotification.sendKeys("PTL Godown GR");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	proceedButton.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	yesButton.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	okButton.click();
	}
	
	
	}
	
