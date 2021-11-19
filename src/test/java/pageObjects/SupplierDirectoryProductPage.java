package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierDirectoryProductPage {

	static WebDriver driver;

	public SupplierDirectoryProductPage(WebDriver driver) {


		SupplierDirectoryProductPage.driver = driver;
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
	

	@FindBy(xpath = "//div[@class='pl-4']//button")
	private static WebElement SupplierDirectoryProductPage_ManageProducts;
	
	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	private static WebElement SupplierDirectoryProductPage_Textbox;
	
	@FindBy(xpath = "//button[text()='Search ']")
	private static WebElement SupplierDirectoryProductPage_Search;
	
	@FindBy(xpath = "(//div[@class='zmDropDown']//a)[2]")
	private static WebElement SupplierDirectoryProductPage_Unlist;
	
	@FindBy(xpath = "(//a[@routerlinkactive='active'])[3]")
	private static WebElement SupplierDirectoryProductPage_List;
	
	@FindBy(xpath = "(//a[@routerlinkactive='active'])[2]")
	private static WebElement SupplierDirectoryProductPage_Editdetails;
	
	@FindBy(xpath = "(//div[@class='form-group col-md-6']//input)[2]")
	private static WebElement SupplierDirectoryProductPage_ProductCodeEnter;
	
	@FindBy(xpath = "(//div[@class='form-group col-md-6']//input)[2]")
	private static WebElement SupplierDirectoryProductPage_ProductCode;
	
	//@FindBy(xpath = "//button[@id='button-basic']")
   //private static WebElement SupplierDirectoryProductPage_Clear;
		
	
	@FindBy(xpath = "//button[text()=' Done & update in catalogue ']")
	private static WebElement SupplierDirectoryProductPage_DoneUpdateCatalogue;
	
	//@FindBy(xpath = "//button[@id='button-basic']")
    //private static WebElement SupplierDirectoryProductPage_ActionsDropdown;
		

	
	
	public static void ClicktheManageaproducts() {
		SupplierDirectoryProductPage_ManageProducts.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Textboxclick() {
		SupplierDirectoryProductPage_Textbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Searchclick() {
		SupplierDirectoryProductPage_Search.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Unlistclick() {
		SupplierDirectoryProductPage_Unlist.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void listclick() {
		SupplierDirectoryProductPage_List.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
			}

	public static void Editdetailsclick() {
		SupplierDirectoryProductPage_Editdetails.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	

	public static void SupplierProductCodeclear() {
		SupplierDirectoryProductPage_ProductCode.clear();
				try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void DoneUpdateCatalogueclick() {
		SupplierDirectoryProductPage_DoneUpdateCatalogue.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	
	public static void ActionsDropdownclick() {
		WebElement actions = driver.findElement(By.linkText("Actions"));
		actions.click();
		//SupplierDirectoryProductPage_ActionsDropdown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void SupplierProductCodeEnter(String code) {
		SupplierDirectoryProductPage_ProductCodeEnter.sendKeys(code);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}


	
	

}
