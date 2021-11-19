package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierCustomerCompanyPage {
	
	
	private static WebDriver driver;

	public SupplierCustomerCompanyPage(WebDriver driver) {


		SupplierCustomerCompanyPage.driver = driver;
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


	//@FindBy(xpath = "//input[@placeholder='Search location']")
	//private static WebElement SupplierCustomerCompanyPage_Companiesicon;
	
	@FindBy(xpath = "//button[text()=' New customer ']")
	private static WebElement SupplierCustomerCompanyPage_NewCustomer;
	
	@FindBy(xpath = "//input[contains(@id,'companyRegNo')]")
	private static WebElement SupplierCustomerCompanyPage_CompanyNumberEnter;
	
	@FindBy(xpath = "//button[text()='Continue ']")
	private static WebElement SupplierCustomerCompanyPage_ContinueButton;
	
	@FindBy(xpath = "//input[@formcontrolname='companyName']")
	private static WebElement SupplierCustomerCompanyPage_CompanyNameEnter;
	
	@FindBy(xpath = "//select[@id='country']")
	private static WebElement SupplierCustomerCompanyPage_SelectCountry;
	
	@FindBy(xpath = "//input[@id='postal']")
	private static WebElement SupplierCustomerCompanyPage_PostCodeEnter;
	
	@FindBy(xpath = "//input[@id='line1']")
	private static WebElement SupplierCustomerCompanyPage_AddressLineOneEnter;
	
	@FindBy(xpath = "//input[@id='line2']")
	private static WebElement SupplierCustomerCompanyPage_AddressLineTwoEnter;
	
	@FindBy(xpath = "//input[@formcontrolname='companyEmail']")
	private static WebElement SupplierCustomerCompanyPage_CompanyEmailEnter;
	
	@FindBy(xpath = "//button[text()=' Save']")
	private static WebElement SupplierCustomerCompanyPage_SaveButton;
	
	
	
	
	
	
	
	
	

	public static void CompaniesIconClick() {
		WebElement companies = driver.findElement(By.linkText("Companies"));
		companies.click();
		//SupplierCustomerCompanyPage_Companiesicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void NewCustomerClick() {
		SupplierCustomerCompanyPage_NewCustomer.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void CompanyNumberEnter(String UENNumber) {
		//WebElement companyRegNo = driver.findElement(By.id("companyRegNo"));
		//companyRegNo.click();
		SupplierCustomerCompanyPage_CompanyNumberEnter.sendKeys(UENNumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ContinuButtonClick() {
		SupplierCustomerCompanyPage_ContinueButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void CompanyNameEnter(String CompanyName) {
		SupplierCustomerCompanyPage_CompanyNameEnter.sendKeys(CompanyName);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void SelectCountryDropdownList() {
		SupplierCustomerCompanyPage_SelectCountry.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementCountry() {
		return SupplierCustomerCompanyPage_SelectCountry;
	}

	public static void PostCodeEnter(String PostCode) {
		SupplierCustomerCompanyPage_PostCodeEnter.sendKeys(PostCode);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void AddressLineOneEnter(String AddressLineOne) {
		SupplierCustomerCompanyPage_AddressLineOneEnter.sendKeys(AddressLineOne);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void AddressLineTwoEnter(String AddressLineTwo) {
		SupplierCustomerCompanyPage_AddressLineTwoEnter.sendKeys(AddressLineTwo);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void CompanyEmailEnter(String CompanyEmail) {
		SupplierCustomerCompanyPage_CompanyEmailEnter.sendKeys(CompanyEmail);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void CheckboxClick() {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	    //js.executeScript("window.scrollBy(0, 1000);");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		WebElement chkFBPersist = driver.findElement(By.xpath("//input[contains(@id,'sameAsAddress')]"));					
        for (int i=0; i<1; i++) {											
            chkFBPersist.click (); 			
            //System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
        }
	} 
 
	public static void SaveButtonClick() {
		SupplierCustomerCompanyPage_SaveButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	
	
	

}
