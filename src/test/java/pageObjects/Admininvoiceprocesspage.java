package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Admininvoiceprocesspage {
	private static WebDriver driver;

	public Admininvoiceprocesspage(WebDriver driver) {


		Admininvoiceprocesspage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}


	@FindBy(xpath = "//button[text()=' Oldest first ']")
	private static WebElement Admininvoiceprocesspage_Sortbydropdowm;

	@FindBy(xpath = "(//a[@class='dropdown-item fntcs'])[2]")
	private static WebElement Admininvoiceprocesspage_Newestfirst;

	@FindBy(xpath = "(//button[text()='Process'])")
	private static WebElement Admininvoiceprocesspage_processbutton;

	@FindBy(xpath = "//input[@placeholder='Enter Order No.']")
	private static WebElement Admininvoiceprocesspage_Enter_Order_number;

	@FindBy(xpath = "//button[text()=' Use data ']")
	private static WebElement Admininvoiceprocesspage_Use_data_button;

	@FindBy(xpath = "//button[text()='Yes, proceed!']")
	private static WebElement Admininvoiceprocesspage_Yes_processed_POPUP_message;

	@FindBy(xpath = "//input[contains(@placeholder,'Enter Invoice No.')]")
	private static WebElement Admininvoiceprocesspage_Enter_Invoice_number;

	@FindBy(xpath = "//button[contains(text(),'Validate')] ")
	private static WebElement Admininvoiceprocesspage_validate_button;

	@FindBy(xpath = "//select[@id='paymentterm']")
	private static WebElement Admininvoiceprocesspage_NET60;
	
	@FindBy(xpath = "//input[@name='deliveryFee']")
	private static WebElement Admininvoiceprocesspage_Delivery_fee_textbox;
	
	@FindBy(xpath = "//input[@name='deliveryFee']")
	private static WebElement Admininvoiceprocesspage_Enter_the_value_in_delivery_fee;
		
	@FindBy(xpath = "//button[text()='Publish this invoice']")
	private static WebElement Admininvoiceprocesspage_publish_this_invoice_button;
	
	@FindBy(xpath = "//button[contains(text(),'Process')]")
	private static WebElement Admininvoiceprocesspage_OutletsProcess;
	
	@FindBy(xpath = "//select[contains(@id,'country')]")
	private static WebElement Admininvoiceprocesspage_Velumasala2;
	


	
	public static String getPageTitle() {
		return driver.getTitle();   
	}


	public void Clicks_in_Sort_by_dropdown() throws InterruptedException {
		Thread.sleep(5000);
		Admininvoiceprocesspage_Sortbydropdowm.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_in_Newest_first() {
		Admininvoiceprocesspage_Newestfirst.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void ClicksOutlet_process_button() throws InterruptedException {
		Thread.sleep(5000);
		Admininvoiceprocesspage_processbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public void Enter_Order_number_in_the_Order_number_field(String ordernumber) throws InterruptedException {
		Admininvoiceprocesspage_Enter_Order_number.sendKeys(ordernumber);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_Use_data_button() {
		Admininvoiceprocesspage_Use_data_button.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public void Clicks_Yes_processed_POPUP_message() {
		Admininvoiceprocesspage_Yes_processed_POPUP_message.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Enter_Invoice_number(String invoicenumber) {
		Admininvoiceprocesspage_Enter_Invoice_number.sendKeys(invoicenumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_validate_button() {
		Admininvoiceprocesspage_validate_button.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	} 

	public static void SelectcalendarByJS() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@placeholder='Select date']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='18March2022';", DateBox);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void click_NET60() throws InterruptedException {
		Thread.sleep(5000);
		Admininvoiceprocesspage_NET60.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownOwnerElement() {
		return Admininvoiceprocesspage_NET60;
	}

	public void Clear_the_Delivery_fee_textbox() throws InterruptedException {
		Admininvoiceprocesspage_Delivery_fee_textbox.clear();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Enter_the_value_in_delivery_fee(String deliveryfees) {
		Admininvoiceprocesspage_Enter_the_value_in_delivery_fee.sendKeys(deliveryfees);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks_publish_this_invoice_button() {
		Admininvoiceprocesspage_publish_this_invoice_button.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void outletsProcessClick() throws InterruptedException {
		Thread.sleep(7000);
		Admininvoiceprocesspage_OutletsProcess.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	
	
	public static void click_VELUMASALA2() throws InterruptedException {
		Thread.sleep(5000);
		Admininvoiceprocesspage_Velumasala2.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownOwnerElement0fvelumasala2() {
		return Admininvoiceprocesspage_Velumasala2;
	}
	


}
