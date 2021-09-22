package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierPNF7857page {

	
	private static WebDriver driver;

	public SupplierPNF7857page(WebDriver driver) {


		SupplierPNF7857page.driver = driver;
		PageFactory.initElements(driver, this);
	} 

	public static void navigateTo_LogInPage3() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}

	public static void navigateTo_invoiceprocesspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}
	
	
	@FindBy(xpath = "//button[text()=' New customer ']")
	private static WebElement SupplierPNF7857page_Newcustomer;
	
	@FindBy(xpath = "//label[text()='Company Registration Number (UEN)']/following::input")
	private static WebElement SupplierPNF7857page_EntertheUENfield;
	
	@FindBy(xpath = "//button[text()='Continue ']")
	private static WebElement SupplierPNF7857page_Continuebutton;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private static WebElement SupplierPNF7857page_Checkboxofvelumasala;
	
	@FindBy(xpath = "//textarea[@placeholder='eg. Locations not listed above']")
	private static WebElement SupplierPNF7857page_Enterinformation;
	
	@FindBy(xpath = "//button[text()=' Submit']")
	private static WebElement SupplierPNF7857page_Submitbutton;
	
	
	
	

	public static void Clickonnewcustomericon() {
		SupplierPNF7857page_Newcustomer.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void EntertheUENfield(String UEN) {
		SupplierPNF7857page_EntertheUENfield.sendKeys(UEN);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickoncontinuebutton() {
		SupplierPNF7857page_Continuebutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Uploadimage() throws InterruptedException {
		WebElement uploadBox=driver.findElement(By.xpath("//input[@id='file']"));
		uploadBox.sendKeys("E:\\Zeemart All\\download.jpg");
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Selectcheckboxofvelumasala() throws InterruptedException {
		WebElement s1= driver.findElement(By.xpath("//div[@class='form-check p-3']"));
		s1.click();
		Thread.sleep(5000);
		SupplierPNF7857page_Checkboxofvelumasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Enterinformation(String information) {
		SupplierPNF7857page_Enterinformation.sendKeys(information);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clicksubmitbutton() {
		SupplierPNF7857page_Submitbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
