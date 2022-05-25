package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class BuyerInventoryNewStockCountPage {

		private static WebDriver driver;

		public BuyerInventoryNewStockCountPage(WebDriver driver) {


			BuyerInventoryNewStockCountPage.driver = driver;
			PageFactory.initElements(driver, this);
		} 

		public void navigateTo_LogInPage2() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
		}

		public static void navigateTo_invoiceprocesspage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
		}

		public void isTosterMessageFound(String msg) {
			WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

		}
		
		
		@FindBy(xpath = "//input[@placeholder='Search outlets']")
		private static WebElement BuyerInventoryNewStockCountPage_SearchOutlets;

		@FindBy(xpath = "//div[text()='VEL MASALA250']")
		private static WebElement BuyerInventoryNewStockCountPage_Outletname;
		
		@FindBy(xpath = "//select[@formcontrolname='outletId']")
		private static WebElement BuyerInventoryNewStockCountPage_Outlet;

		@FindBy(xpath = "//select[@formcontrolname='outletId']")
		private static WebElement BuyerInventoryNewStockCountPage_OutletDropdown;
		
		@FindBy(xpath = "//select[@formcontrolname='inventoryId']")
		private static WebElement BuyerInventoryNewStockCountPage_Inventory;
		
		@FindBy(xpath = "//input[contains(@class,'form-control calendar-icon')]")
		private static WebElement BuyerInventoryNewStockCountPage_CalendarCountDate;
		
		@FindBy(xpath = "(//button[@class='btn btn-success'])[2]")
		private static WebElement BuyerInventoryNewStockCountPage_StartStockCount;
		
		@FindBy(xpath = "(//div[@class='d-flex ng-star-inserted']//input)[1]")
		private static WebElement BuyerInventoryNewStockCountPage_CountedQTYBox;
		
		@FindBy(xpath = "(//div[@class='d-flex ng-star-inserted']//input)[1]")
		private static WebElement BuyerInventoryNewStockCountPage_CountedQTY;

		@FindBy(xpath = "//button[text()='Save']")
		private static WebElement BuyerInventoryNewStockCountPage_Save;

		@FindBy(xpath = "(//button[text()='Cancel'])[1]")
		private static WebElement BuyerInventoryNewStockCountPage_Cancel;

		@FindBy(xpath = "//a[@class='pl-4 text_ul_none']")
		private static WebElement BuyerInventoryNewStockCountPage_YesBtn;

		
		public static void ClickSearchOutlets() {
			BuyerInventoryNewStockCountPage_SearchOutlets.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public static void EnterOutletname(String outletname) throws InterruptedException {
			Thread.sleep(5000);
			BuyerInventoryNewStockCountPage_Outletname.sendKeys(outletname);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public static void ClickOutlet() throws InterruptedException {
			Thread.sleep(5000);
			BuyerInventoryNewStockCountPage_Outlet.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
		public static WebElement getDropDownElementSSTmasala20() {
			return BuyerInventoryNewStockCountPage_Outlet;
		}
		
		public static void ClickInventory() {
			BuyerInventoryNewStockCountPage_Inventory.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
		public static WebElement getDropDownElementmani() {
			return BuyerInventoryNewStockCountPage_Inventory;
		}
		
		
				
		public static void ClickCountDate() {
			BuyerInventoryNewStockCountPage_CalendarCountDate.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}
		public static void SelectCountDate() throws InterruptedException {
			Thread.sleep(5000);
			WebElement SelectDate=driver.findElement(By.xpath("//input[@formcontrolname='countDate']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value='24 May 2022';", SelectDate);

		}
		
		public static void ClickStartStockCount() throws InterruptedException {
			Thread.sleep(5000);
			BuyerInventoryNewStockCountPage_StartStockCount.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}		
		
		public static void ClickCountedQTY() {
			BuyerInventoryNewStockCountPage_CountedQTY.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
		public static void ClickCountedQTYBox() {
			BuyerInventoryNewStockCountPage_CountedQTYBox.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void EnterCountedQTY(String CountedQTY) {
			BuyerInventoryNewStockCountPage_CountedQTY.sendKeys(CountedQTY);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public static void ClickSave() {
			BuyerInventoryNewStockCountPage_Save.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public static void ClickCancel() {
			BuyerInventoryNewStockCountPage_Cancel.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public static void ClickYesBtn() {
			BuyerInventoryNewStockCountPage_YesBtn.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));


		}

			
		
	
	
}
