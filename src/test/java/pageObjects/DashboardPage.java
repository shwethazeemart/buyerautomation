package pageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

/**
 * 
 * @author AjanthanSivalingarajah
 * @since 2020/05/12
 *
 */

//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
public class DashboardPage {
	private static WebDriver driver;
	
	

	public DashboardPage(WebDriver driver) {
		DashboardPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	/*public class DashboardPage2 {
		private static WebDriver driver;

		public DashboardPage2(WebDriver driver) {
			DashboardPage.driver = driver;
			PageFactory.initElements(driver, this);
		}*/

	/*@FindBy(how = How.NAME, using = "dashboard")
	private WebElement btn_Dashboard;*/

	@FindBy(xpath = "//a[@class='nav-link active']")
	private WebElement btn_Dashboard;


	@FindBy(xpath = "//span[@id='sideMenu_Orders']")
	private  WebElement button_Orders;

	@FindBy(xpath = "//span[@id='sideMenu_Invoices']")
	private  WebElement button_Invoices;

	@FindBy(xpath = "//span[@id='sideMenu_Invoices']")
	private  WebElement button_AdminInvoices;

	@FindBy(xpath = "//span[@id='sideMenu_Buyers']")
	private static WebElement button_AdminBuyers;

	@FindBy(xpath = "//span[@id='sideMenu_Users']")
	private  WebElement button_Adminnewbuyeruser;

	@FindBy(xpath = "//span[@id='sideMenu_Users']")
	private  WebElement button_Adminnewsupplieruser;

	@FindBy(xpath = "//span[@id='sideMenu_Suppliers']")
	private  WebElement button_AdminSuppliers;
	 
	//span[contains(@id,'sideMenu_Buyers')]
	@FindBy(xpath = "//span[contains(@Id,'sideMenu_Users')] ")
	private  WebElement button_Users;

	@FindBy(xpath = "//span[contains(@Id,'sideMenu_Inventory')] ")
	private  WebElement button_Inventory;
	
	@FindBy(xpath = "//span[contains(@Id,'sideMenu_Outlets')] ")
	private  WebElement button_Outlets;
	
	@FindBy(xpath = "//span[contains(@Id,'sideMenu_Payments')] ")
	private  WebElement button_payments;


	@FindBy(xpath = "//html/body/div[2]/header/div[1]/div[2]/nav/ul/li[1]/a")
	private static WebElement Orchidpage_Homelinkbutton;

	@FindBy(xpath = "//span[contains(@id,'sideMenu_Reports')]")
	private static WebElement button_Reports;

	@FindBy(xpath = "//span[contains(@id,'sideMenu_Invoices')]")
	private static WebElement LogInPage_SupplierInvoices;
	
	@FindBy(xpath = "//span[contains(@id,'sideMenu_Customers')]")
	private static WebElement LogInPage_SupplierCustomers;

	@FindBy(xpath = "//span[contains(@id,'sideMenu_News')]")
	private  WebElement button_News;
	
	@FindBy(xpath = "//span[contains(@id,'sideMenu_Orders')]") 
	private static  WebElement button_Supplierorders;
	
	@FindBy(xpath = "//span[contains(@id,'sideMenu_Invoices')]") 
	private static  WebElement button_Supplierinvoices;
	
	@FindBy(xpath = "//a[@href='/sg/pages/usermanagement']") 
	private static  WebElement button_Supplierusers;
	
	@FindBy(xpath = "//span[contains(@id,'sideMenu_Catalogue')]") 
	private static  WebElement button_Suppliercatalogue;
	

	@FindBy(xpath = "//span[contains(@id,'sideMenu_Directory')]") 
	private static  WebElement button_Supplierdirectory;
	

	@FindBy(xpath = "//span[contains(@id,'sideMenu_Reports')]") 
	private static  WebElement button_SupplierReports;
	
	@FindBy(xpath = "//span[contains(@id,'sideMenu_Payments')]") 
	private static  WebElement button_SupplierPayments;
	
	



	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getBackgroundColor() {
		return btn_Dashboard.getAttribute("background-color");
	}

	public static void navigateTo_DashboardPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}
	public static void navigateTo_DashboardPage2() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
	}
	
	public static void navigateTo_DashboardPage3() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}
	
	
	// @FindBy(xpath = "//button[text()=' Search ']")
	// private WebElement btn_search;

	// public void navigateTo_DashboardPage() {
	// driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	// }
	// public void enter_Search_OrderId(String searchText) {
	// txtbx_filterOrder.sendKeys(searchText);
	// }

	public void click_DashboardBtn() {
		btn_Dashboard.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void clickNews() throws InterruptedException {

		button_News.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	//	public void clickOrders() {
	//		btn_Orders.click();
	//		//return this;
	//		
	//	}
	
	public void clickOrders() throws InterruptedException {
		Thread.sleep(5000);
		button_Orders.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	public void clickInvoices() throws InterruptedException {
		Thread.sleep(5000);
		button_Invoices.click();
		Thread.sleep(5000); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public void clickUsers() throws InterruptedException {
		button_Users.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
 
	public void clickInventory() {
		button_Inventory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	public void clickPayments() {	
		button_payments.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	public void clickAdminInvoices() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		button_AdminInvoices.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void click_AdminBuyers() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Thread.sleep(5000);
		button_AdminBuyers.click();		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void clickBuyersnewuser() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Thread.sleep(7000);
		button_Adminnewbuyeruser.click();
		//Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void clickAdminSuppliers() throws InterruptedException {
		Thread.sleep(7000);
		button_AdminSuppliers.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	public void clickSuppliernewuser() throws InterruptedException  {
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Thread.sleep(5000);
		button_Adminnewsupplieruser.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public void Clicksinhomepage() throws InterruptedException {
		//driver.findElement(By.cssSelector("a[title=\"HOME\"]")).click();		
		Orchidpage_Homelinkbutton.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}

	public void clickOutlets()  {
		button_Outlets.click();
		//Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void clickReports() throws InterruptedException {
		button_Reports.click();
		Thread.sleep(10000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}  
	
	public static void Clickoninvoiceinthesidemenu() throws InterruptedException {
		Thread.sleep(5000);
		LogInPage_SupplierInvoices.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}  
	
		
	public static void ClickonCustomersinthesidemenu() throws InterruptedException {
		Thread.sleep(5000);
		LogInPage_SupplierCustomers.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}  
	
	public static void Clickonorders() throws InterruptedException {
		Thread.sleep(5000);
		button_Supplierorders.click();
		Thread.sleep(5000); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void Clickonsupplierinvoices() throws InterruptedException {
		Thread.sleep(5000);
		button_Supplierinvoices.click();
		Thread.sleep(5000); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void ClickonsupplierUsersicon() throws InterruptedException{
		Thread.sleep(5000);
		button_Supplierusers.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	public static void ClickonsupplierCatalogueicon() throws InterruptedException{
		Thread.sleep(5000);
		button_Suppliercatalogue.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ClickonDirectoryinthesidemenu() throws InterruptedException {
		Thread.sleep(5000);
		button_Supplierdirectory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void ClickonsupplierReportsicon() throws InterruptedException{
		Thread.sleep(5000);
		button_SupplierReports.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void ClickonsupplierPaymentsicon() throws InterruptedException{
		Thread.sleep(5000);
		button_SupplierPayments.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
}
