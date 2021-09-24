package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierPNF7856page {

	private static WebDriver driver;

	public SupplierPNF7856page(WebDriver driver) {


		SupplierPNF7856page.driver = driver;
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
	private static WebElement SupplierPNF7856page_Newcustomericon;
	
	@FindBy(xpath = "//label[text()='Company Registration Number (UEN)']/following::input")
	private static WebElement SupplierPNF7856page_EntertheUENnumber;
	
	@FindBy(xpath = "//button[text()='Continue ']")
	private static WebElement SupplierPNF7856page_Continuebutton;
	
	@FindBy(xpath = "//input[@formcontrolname='companyName']")
	private static WebElement SupplierPNF7856page_Enterthecompanyname;
	
	@FindBy(xpath = "//input[@id='postal']")
	private static WebElement SupplierPNF7856page_Enterthepostcode;
	
	@FindBy(xpath = "//input[@id='line1']")
	private static WebElement SupplierPNF7856page_Entertheaddresslineone;
	
	@FindBy(xpath = "//input[@id='line2']")
	private static WebElement SupplierPNF7856page_Entertheaddresslinetwo;
	
	@FindBy(xpath = "//input[@formcontrolname='companyEmail']")
	private static WebElement SupplierPNF7856page_Enterthecompanyemail;
	
	@FindBy(xpath = "//input[@formcontrolname='sameAsAddress']")
	private static WebElement SupplierPNF7856page_Samecompanycheckbox;
	
	@FindBy(xpath = "//button[text()=' Save']")
	private static WebElement SupplierPNF7856page_Savebuttonfinally;
	
	@FindBy(xpath = "//select[@id='country']")
	private static WebElement SupplierPNF7856page_Countryfield;
	
	

	
	public static void Clickonnewcustomericon() {
		SupplierPNF7856page_Newcustomericon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void EnterUENnumber(String UEN) {
		SupplierPNF7856page_EntertheUENnumber.sendKeys(UEN);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickoncontinuebutton() {
		SupplierPNF7856page_Continuebutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Enterthecompanyname(String companyname) {
		SupplierPNF7856page_Enterthecompanyname.sendKeys(companyname);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Selectcountryinaddressfield() throws InterruptedException {
		SupplierPNF7856page_Countryfield.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementsingapore() {
		return SupplierPNF7856page_Countryfield;
	}

	public static void Enterthepostcode(String postcode) {
		SupplierPNF7856page_Enterthepostcode.sendKeys(postcode);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Entertheaddresslineone(String addresslineone) {
		SupplierPNF7856page_Entertheaddresslineone.sendKeys(addresslineone);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Entertheaddresslinetwo(String addresslinetwo) {
		SupplierPNF7856page_Entertheaddresslinetwo.sendKeys(addresslinetwo);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Enterthecompanyemail(String companyemail) {
		SupplierPNF7856page_Enterthecompanyemail.sendKeys(companyemail);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonsamecompanyaddresscheckbox() throws InterruptedException {
		WebElement velu=driver.findElement(By.xpath("(//div[contains(@class,'form_section')])[2]"));
		velu.click();
		Thread.sleep(5000);
		SupplierPNF7856page_Samecompanycheckbox.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonsavebuttonfinally() {
		SupplierPNF7856page_Savebuttonfinally.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
