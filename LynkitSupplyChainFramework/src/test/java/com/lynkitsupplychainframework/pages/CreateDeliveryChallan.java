package com.lynkitsupplychainframework.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateDeliveryChallan {
	WebDriver driver;

	public CreateDeliveryChallan(WebDriver ldriver)
	{
		this.driver=ldriver;
		}
	//Login Web elements
	@FindBy(xpath="//input[@placeholder='E-MAIL/UserID']") WebElement uname; 
	@FindBy(xpath="//input[@placeholder='PASSWORD']") WebElement pass;
	@FindBy(xpath="//button[@class='login-bt ft-btn']") WebElement loginButton;

	//Goods Receipt menu Web element
	@FindBy(xpath="//a[contains(text(),'Goods Receipt')]") WebElement goodReceiptButton;

	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-list[1]/main[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]") WebElement atHubGR;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-list[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]") WebElement selectGR;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-list[1]/main[1]/div[1]/div[1]/div[5]/div[4]/div[1]") WebElement createDeliveryChallan;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-list[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]") WebElement tMode;
	@FindBy(xpath="/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[3]") WebElement modeAir;
	
	//Bill No and Description Web element
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-list[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]") WebElement ewayBillNum;
	
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-list[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]") WebElement flightNo;
			
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-list[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/input[1]") WebElement fDate;
	
	//Consignor popup
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-list[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]") WebElement fromConsignor;
	@FindBy(xpath="/html[1]/body[1]/div[5]/div[1]/div[3]/button[1]") WebElement consignorPopup;
	
	//Hub Dropdown
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-list[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]") WebElement selectHubDropdown;

	@FindBy(xpath="/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[6]") WebElement mayapuriHub;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-list[1]/div[1]/div[1]/div[1]/div[2]/button[1]") WebElement createDelChallanButton;
	@FindBy(xpath="/html[1]/body[1]/div[5]/div[1]/div[3]/button[1]") WebElement confirmToCreateChal;
	
	@FindBy(xpath="/html[1]/body[1]/div[5]/div[1]/div[3]/button[1]") WebElement okClick;
	
	public void loginToSupplyChain(String username, String password) throws InterruptedException
	{
	uname.sendKeys(username);
	pass.sendKeys(password);
	loginButton.click();
	goodReceiptButton.click();
	Thread.sleep(2000);
	
	atHubGR.click();
	Thread.sleep(2000);
	selectGR.click();
	Thread.sleep(2000);
	createDeliveryChallan.click();
	Thread.sleep(2000);
	}	
	
	public void createDelChallan(String enterEWayBill, String enterFlightNo, String enterFDate) throws InterruptedException
	{

		tMode.click();
		modeAir.click();
		ewayBillNum.sendKeys(enterEWayBill);
		flightNo.sendKeys(enterFlightNo);
		fDate.sendKeys(enterFDate);
		Thread.sleep(2000);
	}
	
		public void consignorPopup() throws InterruptedException
		{	
		fromConsignor.click();
		Thread.sleep(2000);
		consignorPopup.click();
		Thread.sleep(4000);
		selectHubDropdown.click();
		Thread.sleep(2000);
		mayapuriHub.click();
		Thread.sleep(2000);
		
	}
		public void createDC() throws InterruptedException
		{
			createDelChallanButton.click();                                         
			Thread.sleep(2000);
			confirmToCreateChal.click();                                           
			Thread.sleep(2000);
			okClick.click();
			}
	}
	
