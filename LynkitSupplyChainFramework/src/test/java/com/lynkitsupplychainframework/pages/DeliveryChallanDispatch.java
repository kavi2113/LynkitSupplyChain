package com.lynkitsupplychainframework.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeliveryChallanDispatch {

	WebDriver driver;

	public DeliveryChallanDispatch(WebDriver ldriver)
	{
		this.driver=ldriver;
		}
	//Login Web elements
	@FindBy(xpath="//input[@placeholder='E-MAIL/UserID']") WebElement uname; 
	@FindBy(xpath="//input[@placeholder='PASSWORD']") WebElement pass;
	@FindBy(xpath="//button[@class='login-bt ft-btn']") WebElement loginButton;

	//Goods Receipt menu Web element
	@FindBy(xpath="//a[contains(text(),'Delivery Challan')]") WebElement deliveryChallanButton;

	
	//Bill No and Description Web element
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-list[1]/main[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]") WebElement pendingGR;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-list[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]") WebElement selectGR;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-list[1]/main[1]/div[1]/div[1]/div[5]/div[4]/div[1]") WebElement createDeliveryChallan;
	
	
	public void loginToSupplyChain(String username, String password)
	{
	uname.sendKeys(username);
	pass.sendKeys(password);
	loginButton.click();
	deliveryChallanButton.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	}
	
