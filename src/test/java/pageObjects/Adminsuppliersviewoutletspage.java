package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Adminsuppliersviewoutletspage {

	
	private static WebDriver driver;

	public Adminsuppliersviewoutletspage(WebDriver driver) {

 
		Adminsuppliersviewoutletspage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}

	@FindBy(xpath = "//a[@class='tab active']")
	private static WebElement Adminsuppliersviewoutletspage_Suppliersicon;
	
	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	private static WebElement Adminsuppliersviewoutletspage_Entersuppliername;
	
	@FindBy(xpath = "//button[text()=' Search ']")
	private static WebElement Adminsuppliersviewoutletspage_Searchbutton;
	
	@FindBy(xpath = "//div[@class='ng-star-inserted']//a[1]")
	private static WebElement Adminsuppliersviewoutletspage_Actionsdropdown;
	
	@FindBy(xpath = "(//a[@routerlinkactive='active']/following-sibling::a)[2]")
	private static WebElement Adminsuppliersviewoutletspage_Viewoutlets;
	
	@FindBy(xpath = "//button[text()='Link outlets']")
	private static WebElement Adminsuppliersviewoutletspage_Linkoutlets;
	
	@FindBy(xpath = "//input[@formcontrolname='customOutletId']")
	private static WebElement Adminsuppliersviewoutletspage_Entercustomoutletid;
	
	@FindBy(xpath = "//input[@formcontrolname='customBillingId']")
	private static WebElement Adminsuppliersviewoutletspage_Entercustombillingid;
	
	@FindBy(xpath = "(//label[@class='custom-control custom-checkbox custom_control_small_txt zmart m-0'])[1]")
	private static WebElement Adminsuppliersviewoutletspage_Checkbox;
	
	@FindBy(xpath = "//input[@formcontrolname='newOrderNotifyEmail']")
	private static WebElement Adminsuppliersviewoutletspage_EnterEmail;
	
	@FindBy(xpath = "//input[@placeholder='Enter mobile number']")
	private static WebElement Adminsuppliersviewoutletspage_Entermobilenumbersms;
	
	@FindBy(xpath = "//input[@formcontrolname='newOrderNotifyWhatsapp']")
	private static WebElement Adminsuppliersviewoutletspage_Entermobilenumberwhatsapp;
	
	@FindBy(xpath = "//input[@formcontrolname='deliveryFeePolicyMinOrderAmount']")
	private static WebElement Adminsuppliersviewoutletspage_Enterminimumamount;
	
	@FindBy(xpath = "(//label[@class='custom-control custom-checkbox custom_control_small_txt zmart m-0'])[4]")
	private static WebElement Adminsuppliersviewoutletspage_Enablecheckbox;
	
	@FindBy(xpath = "(//label[contains(@class,'custom-control custom-radio')])[2]")
	private static WebElement Adminsuppliersviewoutletspage_Automaticradio;
	
	@FindBy(xpath = "//input[@formcontrolname='deliveryFeePolicyFeeAmount']")
	private static WebElement Adminsuppliersviewoutletspage_Increasecountedquantitybox;
	
	@FindBy(xpath = "//input[@formcontrolname='deliveryFeePolicyFeeAmount']")
	private static WebElement Adminsuppliersviewoutletspage_Increasesecondtimecountedquantity;
	
	@FindBy(xpath = "//input[@formcontrolname='deliveryFeePolicyFeeAmount']")
	private static WebElement Adminsuppliersviewoutletspage_Firsttimeincrement;
	
	@FindBy(xpath = "//select[@formcontrolname='deliveryFeePolicyCondition']")
	private static WebElement Adminsuppliersviewoutletspage_Allorders;
	
	@FindBy(xpath = "(//label[@class='custom-control custom-checkbox custom_control_small_txt zmart m-0'])[6]")
	private static WebElement Adminsuppliersviewoutletspage_EnableMondaycheckbox;
	
	@FindBy(xpath = "//input[@formcontrolname='cutOffTimesMondayDays']")
	private static WebElement Adminsuppliersviewoutletspage_Entermondaycutofftime;
	
	@FindBy(xpath = "//input[@ng-reflect-name='cutOffTimesMondayTime']")
	private static WebElement Adminsuppliersviewoutletspage_Clickmondaytimefield;
	
	@FindBy(xpath = "//span[text()='Set']")
	private static WebElement Adminsuppliersviewoutletspage_ClickmondayPOPmessage;
	
	@FindBy(xpath = "(//label[@class='custom-control custom-checkbox custom_control_small_txt zmart m-0'])[7]")
	private static WebElement Adminsuppliersviewoutletspage_EnableTuesdaycheckbox;
	
	@FindBy(xpath = "//input[@formcontrolname='cutOffTimesTuesdayDays']")
	private static WebElement Adminsuppliersviewoutletspage_Entertuesdaycutofftime;
	
	@FindBy(xpath = "//input[@ng-reflect-name='cutOffTimesTuesdayTime']")
	private static WebElement Adminsuppliersviewoutletspage_Clicktuesdaytimefield;
	
	@FindBy(xpath = "//span[text()='Set']")
	private static WebElement Adminsuppliersviewoutletspage_ClicktuesdayPOPmessage;
	
	@FindBy(xpath = "//input[@formcontrolname='vehicleNo']")
	private static WebElement Adminsuppliersviewoutletspage_Entervehiclenumber;
	
	@FindBy(xpath = "//input[@formcontrolname='recipientEmail']")
	private static WebElement Adminsuppliersviewoutletspage_Enterrecipient;
	
	@FindBy(xpath = "//select[@formcontrolname='paymentTerms']")
	private static WebElement Adminsuppliersviewoutletspage_Paymentterms;
	
	@FindBy(xpath = "//input[@formcontrolname='salesPersonName']")
	private static WebElement Adminsuppliersviewoutletspage_Enterinsalespersonname;
	
	@FindBy(xpath = "//input[@placeholder='Phone']")
	private static WebElement Adminsuppliersviewoutletspage_Enterphonenumber;
	
	@FindBy(xpath = "//textarea[@formcontrolname='notes']")
	private static WebElement Adminsuppliersviewoutletspage_Entermessageinnotesfield;
	
	@FindBy(xpath = "//span[text()=' Save changes ']")
	private static WebElement Adminsuppliersviewoutletspage_Savechangesbutton;
	
	
	
	
	
	public void Clicks_Suppliersicon() {
		Adminsuppliersviewoutletspage_Suppliersicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Enter_namesuppliersearchbox(String suppliername) {
		Adminsuppliersviewoutletspage_Entersuppliername.sendKeys(suppliername);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks_Searchbutton() {
		Adminsuppliersviewoutletspage_Searchbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_Actionsdropdown() {
		Adminsuppliersviewoutletspage_Actionsdropdown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_Viewoutlets() {
		Adminsuppliersviewoutletspage_Viewoutlets.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks_Linkoutlets() {
		Adminsuppliersviewoutletspage_Linkoutlets.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void Select_Company() throws InterruptedException {
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("venkatmasala220",Keys.ENTER);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}


	public void Enter_thecustomoutletID(String outletid) {
		Adminsuppliersviewoutletspage_Entercustomoutletid.sendKeys(outletid);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Enter_custom_billingID(String billingid) {
		Adminsuppliersviewoutletspage_Entercustombillingid.sendKeys(billingid);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks_thecheckbox() {
		Adminsuppliersviewoutletspage_Checkbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Enter_EmailintheEmailaddressfield(String Email) {
		Adminsuppliersviewoutletspage_EnterEmail.sendKeys(Email);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Enter_mobilenumberintheSMSfield(String mobilenumbersms) throws InterruptedException {
		Adminsuppliersviewoutletspage_Entermobilenumbersms.sendKeys(mobilenumbersms);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void Enter_mobile_number_whatsapp_field(String mobilenumberwhatsapp) {
		Adminsuppliersviewoutletspage_Entermobilenumberwhatsapp.sendKeys(mobilenumberwhatsapp);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Enter_minimumamount(String minimumamount) {
		Adminsuppliersviewoutletspage_Enterminimumamount.sendKeys(minimumamount);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void click_Enablecheckbox() throws InterruptedException {
		Adminsuppliersviewoutletspage_Enablecheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static WebElement getEnablecheckboxElement() {
		return Adminsuppliersviewoutletspage_Enablecheckbox;
	}		
	
	public static void click_automaticradio() throws InterruptedException {
		Adminsuppliersviewoutletspage_Automaticradio.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getapplyfeesradioElement() {
		return Adminsuppliersviewoutletspage_Automaticradio;
	}
	
	public void Clicks_the_increase_counted_Quantity_of_apply_fees() {
		//WebElement Category_Display_Order;
		Adminsuppliersviewoutletspage_Increasecountedquantitybox.clear();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(Adminsuppliersviewoutletspage_Increasecountedquantitybox)).clear();;

	}

	public void Clicks_the_increase_second_time_counted_Quantity_of_apply_fees() {
		Adminsuppliersviewoutletspage_Increasesecondtimecountedquantity.sendKeys("10");
		//WebElement Category_Increase_Value;

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(	Adminsuppliersviewoutletspage_Increasesecondtimecountedquantity)).click();

		//Category_Display_Order.clear();
		//Category_Display_Order.sendKeys("1");

		//wait.until(ExpectedConditions.visibilityOf(Category_Increase_Value)).click();


	}

	public void First_timeClicksinincrementfield() {
		Adminsuppliersviewoutletspage_Firsttimeincrement.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}	

	
	public static void click_allorders() throws InterruptedException {
		Adminsuppliersviewoutletspage_Allorders.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDowntoallordersElement() {
		return Adminsuppliersviewoutletspage_Allorders;
	}
	
	public static void click_Enablemondaycheckbox() throws InterruptedException {
		Adminsuppliersviewoutletspage_EnableMondaycheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static WebElement getEnablemondaycheckboxElement() {
		return Adminsuppliersviewoutletspage_EnableMondaycheckbox;
	
	}

	public void Enter_mondaycutofftime(String mondaycutofftime) {
		Adminsuppliersviewoutletspage_Entermondaycutofftime.sendKeys(mondaycutofftime);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks_mondaytimefield() {
		Adminsuppliersviewoutletspage_Clickmondaytimefield.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_POPmessageofsetinmonday() {
		Adminsuppliersviewoutletspage_ClickmondayPOPmessage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}	
	
	
	public static void click_Enabletuesdaycheckbox() throws InterruptedException {
		Adminsuppliersviewoutletspage_EnableTuesdaycheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static WebElement getEnabletuesdaycheckboxElement() {
		return Adminsuppliersviewoutletspage_EnableTuesdaycheckbox;
	
	}

	public void Enter_tuesdaycutofftime(String tuesdaycutofftime) {
		Adminsuppliersviewoutletspage_Entertuesdaycutofftime.sendKeys(tuesdaycutofftime);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_tuesdaytimefield() {
		Adminsuppliersviewoutletspage_Clicktuesdaytimefield.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void Clicks_POPmessageofsetintuesday() {
		Adminsuppliersviewoutletspage_ClicktuesdayPOPmessage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Enter_Vehiclenumber(String vehiclenumber) {
		Adminsuppliersviewoutletspage_Entervehiclenumber.sendKeys(vehiclenumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Enter_Recipientmail(String recipientEmail) {
		Adminsuppliersviewoutletspage_Enterrecipient.sendKeys(recipientEmail);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void click_paymentterms() throws InterruptedException {
		Adminsuppliersviewoutletspage_Paymentterms.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownpaymenttermsElement() {
		return Adminsuppliersviewoutletspage_Paymentterms;
	}

	public void Enter_nameinoursalesperson(String salespersonname) {
		Adminsuppliersviewoutletspage_Enterinsalespersonname.sendKeys(salespersonname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Enter_phonenumber(String phonenumber) throws InterruptedException {
		Adminsuppliersviewoutletspage_Enterphonenumber.sendKeys(phonenumber);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Enter_messageinthenotesfield(String notesfield) {
		Adminsuppliersviewoutletspage_Entermessageinnotesfield.sendKeys(notesfield);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks_savechangesbutton() {
		Adminsuppliersviewoutletspage_Savechangesbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static String getPageTitle() {
		return driver.getTitle();   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
