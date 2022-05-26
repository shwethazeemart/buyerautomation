package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminSupplierSubscriptionInvoicepage {

	
	private static WebDriver driver; 

	public AdminSupplierSubscriptionInvoicepage(WebDriver driver) {


		AdminSupplierSubscriptionInvoicepage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}


	@FindBy(xpath = "//a[contains(text(),'Upload subscription invoice')] ")
	private static WebElement AdminSupplierSubscriptionInvoicepage_UploadSubscription;
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'amountV1')]")
	private static WebElement AdminSupplierSubscriptionInvoicepage_EnterAmount;
	 
	@FindBy(xpath = "//button[contains(text(),'Upload')]")
	private static WebElement AdminSupplierSubscriptionInvoicepage_UploadButton;
	
	@FindBy(xpath = "//input[@formcontrolname='taxRegNo']")
	private static WebElement AdminSupplierSubscriptionInvoicepage_GSTnumber;
	
	

	public static void uploadSubscriptionInvoiceClick() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250);");
		AdminSupplierSubscriptionInvoicepage_UploadSubscription.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void enterAmount(String amount) {
		AdminSupplierSubscriptionInvoicepage_EnterAmount.sendKeys(amount); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void selectInvoiceDate() {
		WebElement DateBox=driver.findElement(By.xpath("//input[contains(@formcontrolname,'invoiceDate')]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='18 Feb 2022';", DateBox);
	}

	public static void selectFile() throws InterruptedException {
		Thread.sleep(5000);
		WebElement uploadimage1=driver.findElement(By.xpath("//input[contains(@name,'file[]')]"));
		uploadimage1.sendKeys("E:\\Zeemart All\\2     750x300 5mb.jpg");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void uploadButtonClick() {
		AdminSupplierSubscriptionInvoicepage_UploadButton.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void EnterGSTnumber(String number) {
		AdminSupplierSubscriptionInvoicepage_GSTnumber.sendKeys(number); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
