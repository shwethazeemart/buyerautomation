package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Adminsupplierpage {

	private static WebDriver driver;

	public Adminsupplierpage(WebDriver driver) {

 
		Adminsupplierpage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private static WebElement Adminsupplierpage_Newsupplierbutton;
	
	@FindBy(xpath = "//select[@formcontrolname='market']")
	private static WebElement Adminsupplierpage_companymarket;
	
	@FindBy(xpath = "//input[@formcontrolname='supplierName']")
	private static WebElement Adminsupplierpage_Compnanyname;
	
	@FindBy(xpath = "//input[@formcontrolname='alias']")
	private static WebElement Adminsupplierpage_Entertradingname;
	
	@FindBy(xpath = "//input[@formcontrolname='regNo']")
	private static WebElement Adminsupplierpage_Entercompanyregisternumber;
	
	@FindBy(xpath = "//input[@formcontrolname='postal']")
	private static WebElement Adminsupplierpage_Enterpostcode;
	
	@FindBy(xpath = "//input[@formcontrolname='line1']")
	private static WebElement Adminsupplierpage_Enter_addresslineone;
	
	@FindBy(xpath = "//input[@formcontrolname='line2']")
	private static WebElement Adminsupplierpage_Enteraddressline2;
	
	@FindBy(xpath = "//input[@formcontrolname='email']")
	private static WebElement Adminsupplierpage_EntersupplierEmail;
	
	@FindBy(xpath = "//input[@formcontrolname='phone']")
	private static WebElement Adminsupplierpage_Supplierphone;
	
	@FindBy(xpath = "//input[@formcontrolname='phone']")
	private static WebElement Adminsupplierpage_Entersupplierphone;
	
	@FindBy(xpath = "//input[@formcontrolname='shortDesc']")
	private static WebElement Adminsupplierpage_Entershortdescription;
	
	@FindBy(xpath = "//textarea[@formcontrolname='desc']")
	private static WebElement Adminsupplierpage_Enterlongdescription;
	
	//@FindBy(xpath = "//select[@formcontrolname='timeZone']")
	//private static WebElement Adminsupplierpage_timezone;
	
	@FindBy(xpath = "//input[@formcontrolname='gstPercent']")
	private static WebElement Adminsupplierpage_EnterGSTvalue;
	
	@FindBy(xpath = "(//div[@class='form-check']//label)[3]")
	private static WebElement Adminsupplierpage_Checkboxinventorydata;
	
	@FindBy(xpath = "(//label[@class='custom-control custom-checkbox mb-2 mr-sm-2 mb-sm-0 custom_control_small_txt zmart smaller'])[4]")
	private static WebElement Adminsupplierpage_checkboxofallownegativeinventory;
	
	@FindBy(xpath = "//input[@formcontrolname='reportReorderEmails']")
	private static WebElement Adminsupplierpage_Emailsendreport;
	
	@FindBy(xpath = "//input[@formcontrolname='reportReorderImmediatly']")
	private static WebElement Adminsupplierpage_Checkboximmediately;
	
	@FindBy(xpath = "//input[@formcontrolname='reportReorderDaily']")
	private static WebElement Adminsupplierpage_Checkboxdailyat;
	
	@FindBy(xpath = "//div[contains(@class,'mari-5 apply_fee_input')]//input[1]")
	private static WebElement Adminsupplierpage_textboxdailyat; 
	
	@FindBy(xpath = "(//span[contains(@class,'owl-dt-control-content owl-dt-control-button-content')])[2]")
	private static WebElement Adminsupplierpage_setinthePOPmessageintheNegativeReport;
	
	@FindBy(xpath = "//input[@formcontrolname='reportReorderWeekly']")
	private static WebElement Adminsupplierpage_Checkboxweeklyon;
	
	@FindBy(xpath = "//select[@formcontrolname='reportReorderWeeklyOn']")
	private static WebElement Adminsupplierpage_Day;
	
	@FindBy(xpath = "(//div[contains(@class,'apply_fee_input time_col_4')]//input)[2]")
	private static WebElement Adminsupplierpage_textboxdayfield;
	
	@FindBy(xpath = "(//span[contains(@class,'owl-dt-control-content owl-dt-control-button-content')])[2]")
	private static WebElement Adminsupplierpage_setinthePOPmessage;
	
	@FindBy(xpath = "//input[@formcontrolname='reportDeliveryEmails']")
	private static WebElement Adminsupplierpage_EmailUpcomingdeliveryfield;
	
	@FindBy(xpath = "(//div[@class='male-1 width_130px']//label)[3]")
	private static WebElement Adminsupplierpage_checkbox_of_daily_at;
	
	@FindBy(xpath = "//div[@class='male-1 width_130px apply_fee']")
	private static WebElement Adminsupplierpage_check_box_of_Weekly_on;
	
	@FindBy(xpath = "//select[@formcontrolname='reportDeliveryWeeklyOn']")
	private static WebElement Adminsupplierpage_Monday;
	
	@FindBy(xpath = "(//div[contains(@class,'mari-1 apply_fee_input')]//input)[2]")
	private static WebElement Adminsupplierpage_Text_box_in_the_day_field;
	
	@FindBy(xpath = "(//span[contains(@class,'owl-dt-control-content owl-dt-control-button-content')])[2]")
	private static WebElement Adminsupplierpage_set_in_the_POP_message;
	
	@FindBy(xpath = "(//div[@class='form-check'])[8] ")
	private static WebElement Adminsupplierpage_Enablecheckbox;
	
	@FindBy(xpath = "//input[@formcontrolname='paymentEnabled']")
	private static WebElement Adminsupplierpage_Enablesupplierpayments;
	
	@FindBy(xpath = "(//input[@name='paymentType'])[2]")
	private static WebElement Adminsupplierpage_Automaticradio;
	//(//input[@name='paymentType'])[1]
	
	@FindBy(xpath = "//input[@formcontrolname='transactionFeePercentage']")
	private static WebElement Adminsupplierpage_Percentagefield;
	
	@FindBy(xpath = "//input[@formcontrolname='transactionFeePercentage']")
	private static WebElement Adminsupplierpage_Percentagevalue;
	
	@FindBy(xpath = "//input[@formcontrolname='transactionFeeFixedAmount']")
	private static WebElement Adminsupplierpage_Fixedfeesfield;
	
	@FindBy(xpath = "//input[@formcontrolname='transactionFeeFixedAmount']")
	private static WebElement Adminsupplierpage_valueofFixedfeesfield;
	
	@FindBy(xpath = "//input[@formcontrolname='regularSummaryEmails']")
	private static WebElement Adminsupplierpage_Emailsupplieractivityfield;
	
	@FindBy(xpath = "//div[@class='flex__center']//a[1]")
	private static WebElement Adminsupplierpage_SaveSupplierOnly;
	
	@FindBy(xpath = "//input[@value='Passive']")
	private static WebElement Adminsupplierpage_subscription_plan_of_radio_button;
	
	@FindBy(xpath = "//input[@formcontrolname='subscriptionEmails']")
	private static WebElement Adminsupplierpage_enter_subscription_email_notification;
	

	public void Clicksin_Newsupplierbutton() {
		Adminsupplierpage_Newsupplierbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	
	}
	
	public static void click_company() throws InterruptedException {
		Adminsupplierpage_companymarket.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDowncompanyElement() {
		return Adminsupplierpage_companymarket;
	}

	public void Company_name(String companyname) {
		Adminsupplierpage_Compnanyname.sendKeys(companyname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	
	}

	public void Enter_tradingname(String tradingname) {
		Adminsupplierpage_Entertradingname.sendKeys(tradingname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Enter_companyregisternumber(String registernumber) {
		Adminsupplierpage_Entercompanyregisternumber.sendKeys(registernumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}

	public void Enter_postcode(String postcode) {
		Adminsupplierpage_Enterpostcode.sendKeys(postcode);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}

	public void Enter_addresslineone(String addressline1) {
		Adminsupplierpage_Enter_addresslineone.sendKeys(addressline1);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}

	public void Enter_addressline2(String addressline2) {
		Adminsupplierpage_Enteraddressline2.sendKeys(addressline2);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}
	
	public void upload_the_profileimage() throws InterruptedException {
		WebElement uploadBox=driver.findElement(By.xpath("//input[@name='file[]']"));
		uploadBox.sendKeys("E:/Zeemart/download (1).jpg");
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Enter_supplierEmail(String supplierEmail) {
		Adminsupplierpage_EntersupplierEmail.sendKeys(supplierEmail);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clear_supplierphonefield() {
		Adminsupplierpage_Supplierphone.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Enter_supplierphone(String supplierphone) {
		Adminsupplierpage_Entersupplierphone.sendKeys(supplierphone);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Enter_shortdescription(String shortdescription) {
		Adminsupplierpage_Entershortdescription.sendKeys(shortdescription);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Enter_longdescription(String longdescription) {
		Adminsupplierpage_Enterlongdescription.sendKeys(longdescription);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Select_timezone() throws InterruptedException {
		driver.findElement(By.xpath("//select[@formcontrolname='timeZone']")).sendKeys("GMT+08:00)Asia/Singapore",Keys.ENTER);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}


	/*public static void click_timezone() throws InterruptedException {
		Adminsupplierpage_timezone.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDowntimezoneElement() {
		return Adminsupplierpage_timezone;
	}*/

	public void Enter_GSTvalue(String GSTvalue) {
		Adminsupplierpage_EnterGSTvalue.sendKeys(GSTvalue);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_checkboxofinventorydata() {
		Adminsupplierpage_Checkboxinventorydata.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_checkboxofallownegativeinventory() {
		Adminsupplierpage_checkboxofallownegativeinventory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}

	public void Enter_Emailsendreport(String reportEmail) {
		Adminsupplierpage_Emailsendreport.sendKeys(reportEmail);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks_checkboximmediately() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Adminsupplierpage_Checkboximmediately.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_Checkboxdailyat() {
		Adminsupplierpage_Checkboxdailyat.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_textboxdailyat() {
		Adminsupplierpage_textboxdailyat.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks_setinthePOPmessageintheNegativeReport() throws InterruptedException {
		Thread.sleep(5000);
		Adminsupplierpage_setinthePOPmessageintheNegativeReport.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_checkboxweeklyon() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Adminsupplierpage_Checkboxweeklyon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void click_day() throws InterruptedException {
		Adminsupplierpage_Day.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDowndayElement() {
		return Adminsupplierpage_Day;
	}

	public void Clicks_textboxdayfield() {
		Adminsupplierpage_textboxdayfield.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}

	public void Clicks_setinthePOPmessage() {
		Adminsupplierpage_setinthePOPmessage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}

	public void Enter_EmailUpcomingdeliveryfield(String upcomingEmail) {
		Adminsupplierpage_EmailUpcomingdeliveryfield.sendKeys(upcomingEmail);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_checkbox_of_daily_at() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Adminsupplierpage_checkbox_of_daily_at.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks_check_box_of_Weekly_on() {
		Adminsupplierpage_check_box_of_Weekly_on.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void click_monday() throws InterruptedException {
		Adminsupplierpage_Monday.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownMondayElement() {
		return Adminsupplierpage_Monday;
	}

	public void Clicks_Text_box_in_the_day_field() {
		Adminsupplierpage_Text_box_in_the_day_field.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_set_in_the_POP_message() {
		Adminsupplierpage_set_in_the_POP_message.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public void Clicks_checkboxofEnablesupplierpayments() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		Adminsupplierpage_Enablesupplierpayments.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void click_Enablecheckbox() throws InterruptedException {	
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1750)");
		Thread.sleep(5000);
		Adminsupplierpage_Enablecheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static WebElement getEnablecheckboxElement() {
		return Adminsupplierpage_Enablecheckbox;
	}		
	
	public static void click_automaticradio() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");	
		Adminsupplierpage_Automaticradio.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getmanualradioElement() {
		return Adminsupplierpage_Automaticradio;
	}

	public void Clear_thePercentagefield() {
		Adminsupplierpage_Percentagefield.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Enter_Percentagevalue(String percentage) {
		Adminsupplierpage_Percentagevalue.sendKeys(percentage);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clear_Fixedfeesfield() {
		Adminsupplierpage_Fixedfeesfield.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Enter_valueofFixedfeesfield(String fixedfees) {
		Adminsupplierpage_valueofFixedfeesfield.sendKeys(fixedfees);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Enter_Emailsupplieractivityfield(String activityEmail) {
		Adminsupplierpage_Emailsupplieractivityfield.sendKeys(activityEmail);
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

	public void clicks_the_subscription_plan_of_radio_button() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Adminsupplierpage_subscription_plan_of_radio_button.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void enter_subscription_email_notification_velumani_zeemart_asia(String enteremail) {
		Adminsupplierpage_enter_subscription_email_notification.sendKeys(enteremail);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void ClickSaveSupplier() {
		Adminsupplierpage_SaveSupplierOnly.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
 
	
	
}
	
	
	
			
	

