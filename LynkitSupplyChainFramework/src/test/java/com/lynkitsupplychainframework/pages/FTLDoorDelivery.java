package com.lynkitsupplychainframework.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FTLDoorDelivery {
WebDriver driver;

public FTLDoorDelivery(WebDriver ldriver)
{
	this.driver=ldriver;
}

//Login
@FindBy(xpath="//input[@placeholder='E-MAIL/UserID']") WebElement uname; 
@FindBy(xpath="//input[@placeholder='PASSWORD']") WebElement pass;
@FindBy(xpath="//button[@class='login-bt ft-btn']") WebElement loginButton;

//Goods Receipt menu
@FindBy(xpath="//a[contains(text(),'Goods Receipt')]") WebElement goodReceiptButton;

//Create Goods Receipt button
@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-list[1]/main[1]/div[1]/div[1]/div[5]/div[4]/div[1]") WebElement grButton;

//PaymentType
@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-create[1]/main[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/span[1]/span[1]/span[1]") WebElement lrType;	
@FindBy(xpath="//li[contains(text(),'Credit')]") WebElement lrTypeCredit;

//To select Contract type
@FindBy(xpath="//*[@id='form7']/div[2]/div[2]/span/span[1]/span") WebElement conType;
@FindBy(xpath="//li[contains(text(),'Full Truck Load')]") WebElement fullTruck;

//To select Delivery Type
@FindBy(xpath="//*[@id='form7']/div[2]/div[3]/span/span[1]/span") WebElement delType;
@FindBy(xpath="//li[contains(text(),'Door Delivery')]")  WebElement delDoorDelivery;

//To select Transportation Mode
@FindBy(xpath="//*[@id='form7']/div[2]/div[4]/span/span[1]/span") WebElement transMode;
@FindBy(xpath="//li[contains(text(),'Road')]") WebElement transModeRoad;

//To select Truck
@FindBy(xpath="//*[@id='form7']/div[3]/div[1]/div/span/span[1]/span") WebElement selectTruck;
@FindBy(xpath="//li[contains(text(),'DL9AC1223 (Truck 12 wheel (22 Feet))')]") WebElement selectTruckValue;

//Enter Driver Name
@FindBy(xpath="//*[@id='form7']/div[3]/div[2]/input") WebElement driverName;

//Enter Driver MObile No
@FindBy(xpath="//*[@id='form7']/div[3]/div[3]/input") WebElement dMobile;

//To select Consignor
//label[contains(text(),'Consignor')]
@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-create[1]/main[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/span[1]/span[1]") WebElement selectConsignor;
@FindBy(xpath="/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]") WebElement consignorName;

//To select consignee
@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-receipt-create[1]/main[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/span[1]/span[1]/span[1]") WebElement selectConsignee;
@FindBy(xpath="/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[2]") WebElement consigneeName;

//Bill No and Description Web element
@FindBy(xpath="//input[@id='validationTooltip024']") WebElement billNum;
@FindBy(xpath="//input[@placeholder='Description']") WebElement grDescription;
@FindBy(xpath="//input[@placeholder='HSN Code']") WebElement grHSNCode;


@FindBy(xpath="//input[@placeholder='Actual Weight']") WebElement actualWeight;
@FindBy(xpath="//input[@placeholder='Weight Charged']") WebElement wCharged;
@FindBy(xpath="//input[@placeholder='Packages types']") WebElement pkgType;
@FindBy(xpath="//input[@placeholder='No. of Pkgs']") WebElement nop;

//Invoide detail
@FindBy(xpath="//*[@id='form7']/div[9]/div[2]/div/div/div[1]/input") WebElement invoiceNo;
@FindBy(xpath="//input[@id='invoiceDate-0']") WebElement invDate;
@FindBy(xpath="//*[@id='form7']/div[9]/div[2]/div/div/div[3]/input") WebElement invValue;


@FindBy(xpath="//input[@id='validationTooltip015']") WebElement advFreight;
@FindBy(xpath="//*[@id='form7']/div[12]/div[2]/div/div/div[2]/div/select") WebElement selectFreightType;
@FindBy(xpath="//option[contains(text(),'Freight')]")  WebElement selectFreight;
@FindBy(xpath="//div[@class='filed-input-div cth']//input[@class='form-control ng-untouched ng-pristine ng-valid']") WebElement fCharge;
@FindBy(xpath="//input[@id='validationTooltip016']") WebElement expDate;

//select Source Hub
@FindBy(xpath="/html/body/app-root/app-receipt-create/main/div/div[2]/div/form/div[15]/div[1]/div/div/span/span[1]/span") WebElement selectSourceType;
@FindBy(xpath="//li[contains(text(),'Testing Station')]") WebElement selectSource;


//Pick and Destination Address
@FindBy(xpath="//div[@class='col-4']//label[@class='custom-switch-btn']") WebElement pickAddress;
@FindBy(xpath="//div[@class='col-5']//label[@class='custom-switch-btn']")WebElement destAddress;

@FindBy(xpath="//span[contains(text(),'Create Goods Receipt')]") WebElement createGRButton;

@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']") WebElement confirmPopup;


public void loginToSupplyChain(String username, String password) throws InterruptedException
{
uname.sendKeys(username);
pass.sendKeys(password);
loginButton.click();
goodReceiptButton.click();
grButton.click();
Thread.sleep(2000);
}

public void basicDetails() throws InterruptedException
{
	//Selection of LR Type
	lrType.click();	
	lrTypeCredit.click();
	
	//To select Contract type
	conType.click();
	fullTruck.click();

	//To select Delivery Type
	delType.click();
	delDoorDelivery.click();

	//To select Transportation Mode
	transMode.click();
	transModeRoad.click();

	//To select Truck
	//selectTruck.click();
	//selectTruckValue.click();

	//Enter Driver Name
	//driverName.sendKeys(enterdriverName);

	//Enter Driver MObile No
	//dMobile.sendKeys(enterdriverMobile);

	//To select Consignor
	selectConsignor.click();
	consignorName.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	Thread.sleep(2000);
	
	//To select consignee
	selectConsignee.click();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	consigneeName.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}

public void createBill(String grBillNum, String cgrDescription, String grCode)
{
billNum.sendKeys(grBillNum);

grDescription.sendKeys(cgrDescription);
grHSNCode.sendKeys(grCode);
}

public void weightDetails(String createAW, String createAWC, String cpkgType, String cnop)
{
actualWeight.sendKeys(createAW);
wCharged.sendKeys(createAWC);
pkgType.sendKeys(cpkgType);
nop.sendKeys(cnop);
}

public void invoiceDetails(String createInvNo, String createInvDate,String createInvValue)
{
	invoiceNo.sendKeys(createInvNo);
	invDate.sendKeys(createInvDate);
	invValue.sendKeys(createInvValue);
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
}

public void paymentDetails(String createAdvFreight,String createFCharge, String createExpDate)
{
	advFreight.sendKeys(createAdvFreight);
	selectFreightType.click();
	selectFreight.click();
	
	fCharge.sendKeys(createFCharge);
	expDate.sendKeys(createExpDate);
	
	selectSourceType.click();
	selectSource.click();
   
    pickAddress.click();
    destAddress.click();
 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

public void createGbutton()
{
	createGRButton.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	confirmPopup.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}