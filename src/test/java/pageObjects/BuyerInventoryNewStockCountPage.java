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
		
		@FindBy(xpath = "//div[text()='VEL MASALA250']")
		private static WebElement BuyerInventoryNewStockCountPage_Outlet;

		@FindBy(xpath = "//select[@formcontrolname='inventoryId']")
		private static WebElement BuyerInventoryNewStockCountPage_Inventory;
		
		@FindBy(xpath = "//button[@type='submit']")
		private static WebElement BuyerInventoryNewStockCountPage_StartStockCount;

		@FindBy(xpath = "(//input[@class='form-control'])[1]")
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

		public static void ClickInventory() {
			BuyerInventoryNewStockCountPage_Inventory.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
		public static WebElement getDropDownElementshwe() {
			return BuyerInventoryNewStockCountPage_Inventory;
		}

		public static void SelectCountDate() throws InterruptedException {
			Thread.sleep(5000);
			WebElement DateBox=driver.findElement(By.xpath("(//input[@placeholder='Count date']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value='23 May 2022';", DateBox);

		}

		public static void ClickStartStockCount() {
			BuyerInventoryNewStockCountPage_StartStockCount.click();
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

		public static void SelectOutlet() {
			BuyerInventoryNewStockCountPage_Outlet.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		
		
		
		
	
	
}
