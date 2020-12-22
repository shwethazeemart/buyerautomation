package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
		
		//driver.get("http://dev.buyer.zeemart.asia/sg/pages/orders/allorders");
		
		@FindBy(xpath = "//input[contains(@name,'loginEmail')]") 
		private WebElement btn_loginEmail;
		
		//@FindBy(linkText="Orders")
		//private static WebElement menubar_Orders;  
		
		@FindBy(xpath = "//button[text()=' New order']") 
		private static WebElement orderspage_Neworder; 
		
		@FindBy(xpath = "//li[@class='ng-star-inserted']//a") 
		private static WebElement orderspage_Neworder1;
		
		@FindBy(xpath = "(//button[@class='btn btn-info']//i)[2]")
		private static WebElement orderspage_Neworder2;
		
		@FindBy(xpath = "//button[@data-type='plus']")
		private static WebElement orderspage_Neworder3;
		
		@FindBy(xpath = "//span[@id='sideMenu_Orders']")
		private  WebElement btn_Orders;
		
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
		
		//@FindBy(xpath = "//div[@class='d-flex align-items-center']//div")
		//private static WebElement Orderspage_link_TxtBoxContent;
		
		
		@FindBy(xpath = "//button[text()='Back to Orders']")
		private static WebElement orderspage_BacktoOrderbutton;
		
		@FindBy(xpath = "//div[@class='pr-2']//input[1]")
		private static WebElement OrdersPage_OrderID;
		
		@FindBy(xpath = "//span[@id='sideMenu_Orders']")
		private static WebElement button_Orders;
		
		@FindBy(xpath = "(//div[@class='btn-group']//button)[3]")
		private static WebElement orderspage_Searchbutton;
		
		@FindBy(xpath = "//button[@data-type='plus']")
		private static WebElement orderspage_secondtimeIncreaseAddtoorder;
		
		@FindBy(xpath = "//button[@data-type='plus']//i[1]")
		private static WebElement orderspage_thirdimeIncreaseAddtoorder;
		
		@FindBy(xpath = "//button[@data-type='plus']//i[1]")
		private static WebElement orderspage_fourthtimeIncreaseAddtoorder;
		 
		@FindBy(xpath = "(//button[@class='btn btn-info']//i)[2]")
		private static WebElement orderspage_fthtimeIncreaseAddtoorder;
		
		@FindBy(xpath = "(//datatable-body-cell[@ng-reflect-row-index='5']//div)[2]")
		private static WebElement orderspage_newlycreatedorder;
		
		@FindBy(xpath = "//p[text()='Orders']")
		private static WebElement orderspage_backbuttonordersr;
		
		
		public void navigateTo_LogInPage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		}
		
		
		@FindBy(xpath = "//input[@placeholder='Password']")
		private static WebElement btn_loginpassword;
		
		@FindBy(xpath = "//button[text()='Log in']")
		private static WebElement btn_loginbtn;
		
		@FindBy(xpath = "(//li[@role='menuitem']//a)[2]")
		private static WebElement orderspage_Newrecurringorders;
		
		public void enter_LoginEmail(String email) { 
			btn_loginEmail.sendKeys(email);
		}
		
		/*public void enter_Password(String password) {
			btn_password.sendKeys(password);
		}*/
		
		public static void enter_loginpassword(String loginpassword) {
			btn_loginpassword.sendKeys(loginpassword);
		}
		
		public static void click_LoginBtn() {
			btn_loginbtn.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}
		
		
		

		public static void click_Neworder() throws InterruptedException {
			orderspage_Neworder.click();
			Thread.sleep(5000);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public static void click_Neworder1() throws InterruptedException {
			Thread.sleep(5000);
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
		public static void click_IncreaseAddtoorder2() {
			orderspage_IncreaseAddtoorder1.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}
		public static void click_IncreaseAddtoorder3() {
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
		/*public String TxtBoxContent() {
			return Orderspage_link_TxtBoxContent.getAttribute("value");
		}*/
		
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
			OrdersPage_OrderID.sendKeys("202011130001");
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

		public static void click_secondtimeIncreaseAddtoorder() {
			orderspage_secondtimeIncreaseAddtoorder.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}

		public static void click_thirdimeIncreaseAddtoorder() {
			orderspage_thirdimeIncreaseAddtoorder.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}

		public static void click_fourthtimeIncreaseAddtoorder() {
			orderspage_fourthtimeIncreaseAddtoorder.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}

		public static void click_fifthtimeIncreaseAddtoorder() {
			orderspage_fthtimeIncreaseAddtoorder.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}

		public static void click_newlycreatedorder() {
			orderspage_newlycreatedorder.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}

		public static void click_backbuttonorders() {
			orderspage_backbuttonordersr.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}

		public static void click_Newrecurringorders() {
			orderspage_Newrecurringorders.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		
			
		} 
		
	/*	public static void clickOrders() {
		
			button_Orders.click();
			
		  }*/
		}

			
		
			
		
			
		
			
		

		

