package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class InvoicesPage {

	private static WebDriver driver;

	public InvoicesPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_Invoicesspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}

	//@FindBy(xpath="//span[contains(text(),'Invoices')]") 
	//private static WebElement menubar_Invoices;  

	@FindBy(xpath="(//a[@ng-reflect-klass='nav-link pt-0'])[2]")
	private static WebElement Invoicespage_Uploads; 

	@FindBy(xpath="//button[text()=' Upload invoice ']") 
	private static WebElement Invoicespage_Uploadinvoice; 

	@FindBy(xpath="//div[@class='popup_outlet_item cursor']") 
	private static WebElement Invoicespage_selectoutlet; 

	//@FindBy(xpath="//input[@id='file']")
	//private static WebElement Invoicespage_Uploadimage; 

	@FindBy(xpath="//button[@class='btn btn-primary']")  
	private static WebElement Invoicespage_Uploadbutton; 

	/*public static void clickInvoices() {
			Actions action = new Actions(driver);
		    action.moveToElement(driver.findElement(By.linkText("Invoices"))).click().build().perform();

		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));


		  }*/

	public static void click_Uploads() throws InterruptedException {
		Invoicespage_Uploads.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	

	}

	public static void click_Uploadinvoice() {
		Invoicespage_Uploadinvoice.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	

	}

	public static void click_selectoutlet() {
		Invoicespage_selectoutlet.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	

	}
	/* public static void (String[] args) {
			returnInvoicespage_driver.click(); 
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));	

		}*/

	public static void click_Uploadbutton() {
		Invoicespage_Uploadbutton.click();
		
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

	public static void Clicks_on_upload_the_image() {
		//invoiceprocesspageSteps_Paymentsterms.click();
		//Invoicespage_Uploadimage.click();
		WebElement uploadBox=driver.findElement(By.xpath("//input[@id='file']"));
		uploadBox.sendKeys("E:\\Zeemart All\\Zeemart payslip\\file_example_PNG_2100kB.png");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}
	/*public static WebElement Uploadimage() {
		return Invoicespage_Uploadimage ;
	}*/ 
}







