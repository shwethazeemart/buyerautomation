package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminOrderListingPage {
	
	private static WebDriver driver;

	public AdminOrderListingPage(WebDriver driver) {


		AdminOrderListingPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}
	
	
	@FindBy(xpath = "//input[@formcontrolname='orderId']")
	private static WebElement AdminOrderListingPage_OrderID;
	
	@FindBy(xpath = "//input[@formcontrolname='orderId']")
	private static WebElement AdminOrderListingPage_EnterOrderID;
	
	@FindBy(xpath = "//button[text()='Search']")
	private static WebElement AdminOrderListingPage_SearchIcon;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private static WebElement AdminOrderListingPage_FirstCheckbox;

	@FindBy(xpath = "(//button[text()='1 selected']/following-sibling::button)[1]")
	private static WebElement AdminOrderListingPage_Checkbox;

	@FindBy(xpath = "//a[contains(@class,'pull-right btn-clear-blue')]")
	private static WebElement AdminOrderListingPage_Filtericon;
	
	@FindBy(xpath = "//div[text()=' Outlet  ']")
	private static WebElement AdminOrderListingPage_Outlet;
	
	@FindBy(xpath = "//a[text()='Select All']")
	private static WebElement AdminOrderListingPage_SelectAll;
	
	@FindBy(xpath = "//button[text()='Apply']")
	private static WebElement AdminOrderListingPage_Applybtn;
	
	@FindBy(xpath = "//a[text()='Reset']")
	private static WebElement AdminOrderListingPage_Resetbtn;	
	
	@FindBy(xpath = "//div[text()=' Supplier  ']")
	private static WebElement AdminOrderListingPage_Supplier;
	
	@FindBy(xpath = "//div[text()=' Order status  ']")
	private static WebElement AdminOrderListingPage_OrderStatus;
	
	@FindBy(xpath = "//div[text()=' Invoicing status  ']")
	private static WebElement AdminOrderListingPage_InvoiceStatus;
	
	@FindBy(xpath = "//div[text()=' Order type  ']")
	private static WebElement AdminOrderListingPage_OrderType;
	

	public static void ClickOrderID() {
		AdminOrderListingPage_OrderID.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void EnterOrderID(String orderid) {
		AdminOrderListingPage_EnterOrderID.sendKeys(orderid);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void SelectDatefromCalendar() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@formcontrolname='deliveryDateRange']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='01Jan2022-13Jan2022';", DateBox);
			}

	public static void SelectPlacedOnfromCalendar() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@formcontrolname='orderDateRange']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='13Jan2022-20Jan2022';", DateBox);
		
	}

	public static void ClickSearchIcon() {
		AdminOrderListingPage_SearchIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void FirstCheckboxClick() {
		AdminOrderListingPage_FirstCheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
			
	}

	public static void ClickClearbtn() throws InterruptedException {
		Thread.sleep(5000);
		AdminOrderListingPage_Checkbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
				
	}

	public static void ClickFiltericon() throws InterruptedException {
		Thread.sleep(5000);
		AdminOrderListingPage_Filtericon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
			
	}

	public static void OutletClick() {
		AdminOrderListingPage_Outlet.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
			
		}

	public static void ClicktheSelectAll() {
		AdminOrderListingPage_SelectAll.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
				
	}

	public static void ClickApplybtn() {
		AdminOrderListingPage_Applybtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
				
	}

	public static void FiltericonClick() throws InterruptedException {
		Thread.sleep(5000);
		AdminOrderListingPage_Filtericon.click();
				try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
				
	}

	public static void ClickResetbtn() {
		AdminOrderListingPage_Resetbtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
			
	}

	public static void ClicktheSupplier() {
		AdminOrderListingPage_Supplier.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
				
	}

	public static void ClicktheOrderStatus() {
		AdminOrderListingPage_OrderStatus.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
				
	}

	public static void ClicktheInvoiceStatus() {
		AdminOrderListingPage_InvoiceStatus.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
				
		
	}

	public static void ClicktheOrderType() {
		AdminOrderListingPage_OrderType.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
				
				
	}




	

}
