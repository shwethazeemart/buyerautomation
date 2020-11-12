package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class OrdersPage {

		private static WebDriver driver;

		public OrdersPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public void navigateTo_Orderspage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		}
		
		public void isTosterMessageFound(String msg) {
			WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));
		}
		
		
		@FindBy(xpath = "(//a[@class='nav-link']//span)[2]")
		private static WebElement menubar_orders;
		
		@FindBy(xpath = "//div[@class='btn-group']//button")
		private static WebElement orderspage_Neworder;
		
		@FindBy(xpath = "//li[@class='ng-star-inserted']//a")
		private static WebElement orderspage_Neworder1;
		
		@FindBy(xpath = "//div[text()='velu masala2020']")
		private static WebElement orderspage_velumasala2020;
		
		@FindBy(xpath = "//datatable-body-cell[contains(@class,'datatable-body-cell actionActive')]//div")
		private static WebElement orderspage_Addtoorder;
		
		@FindBy(xpath = "(//button[@data-field='quant[2]'])[2]")
		private static WebElement orderspage_IncreaseAddtoorder;
		
		@FindBy(xpath = "(//button[@data-field='quant[2]'])[2]")
		private static WebElement orderspage_IncreaseAddtoorder1;
		
		@FindBy(xpath = "(//order-qty-plus-minus[@class='ng-star-inserted']//div)[2]")
		private static WebElement orderspage_Addtoorder1;
		
		@FindBy(xpath = "//div[@class='submit_button ng-star-inserted']//button[1]")
		private static WebElement orderspage_Revieworder;
		
		@FindBy(xpath = "//button[text()=' Place Order ']")
		private static WebElement orderspage_PlaceOrder;
		
		@FindBy(xpath = "//div[text()='#202011110003']")
		private static WebElement link_TxtBoxContent;
		
		@FindBy(xpath = "//button[text()='Back to Orders']")
		private static WebElement orderspage_BacktoOrderbutton;
		
		@FindBy(xpath = "//div[@class='pr-2']//input[1]")
		private static WebElement OrdersPage_OrderID;
		
		@FindBy(xpath = "(//div[@class='btn-group']//button)[3]")
		private static WebElement orderspage_Searchbutton;
		
		
		public static void click_orders() {
			menubar_orders.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));		
		}

		public static void click_Neworder() {
			orderspage_Neworder.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public static void click_Neworder1() {
			orderspage_Neworder1.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}

		public static void click_velumasala2020() {
			orderspage_velumasala2020.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public static void click_Addtoorder() {
			orderspage_Addtoorder.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public static void click_IncreaseAddtoorder() {
			orderspage_IncreaseAddtoorder.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public static void click_IncreaseAddtoorder1() {
			orderspage_IncreaseAddtoorder1.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public static void click_Addtoorder1() {
			orderspage_Addtoorder1.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public static void click_Revieworder() {
			orderspage_Revieworder.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		
		public static void click_PlaceOrder() {
			orderspage_PlaceOrder.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public String TxtBoxContent() {
			 return link_TxtBoxContent.getAttribute("value");
		}
		
		public static void click_BacktoOrderbutton() {
			orderspage_BacktoOrderbutton.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		
		}
		public static void paste_OrderID(Object orderID) {
			OrdersPage_OrderID.sendKeys("202011110003");
		}
		public static void click_Searchbutton() {
			orderspage_Searchbutton.click();
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

		
}
