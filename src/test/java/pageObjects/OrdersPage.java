package pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
	public void navigateTo_LogInPage2() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
	}

	public void navigateTo_Orderspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false)); 
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

	@FindBy(xpath = "(//a[@class='dropdown-item fc-blue'])[1]") 
	private static WebElement orderspage_Neworder1;

	@FindBy(xpath = "(//button[@class='btn btn-info']//i)[2]")
	private static WebElement orderspage_Neworder2;

	@FindBy(xpath = "//button[@data-type='plus']")
	private static WebElement orderspage_Neworder3;

	@FindBy(xpath = "//span[@id='sideMenu_Orders']")
	private  WebElement btn_Orders;

	@FindBy(xpath = "//div[text()='sabari250']")
	private static WebElement orderspage_velumasala2020;

	@FindBy(xpath = "(//div[contains(@class,'addto cursor')])[1]")
	private static WebElement orderspage_Addtoorder;

	@FindBy(xpath = "(//button[@data-field='quant[2]'])[2]")
	private static WebElement orderspage_IncreaseAddtoorder;

	@FindBy(xpath = "(//button[@data-field='quant[2]'])[2]")
	private static WebElement orderspage_IncreaseAddtoorder1;

	@FindBy(xpath = "(//order-qty-plus-minus[@class='ng-star-inserted']//div)[2]")
	private static WebElement orderspage_Addtoorder1;

	@FindBy(xpath = "//button[text()='Review order']")
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

	//@FindBy(xpath = "(//datatable-body-cell[@ng-reflect-row-index='5']//div)[2]")
	//private static WebElement orderspage_newlycreatedorder;

	@FindBy(xpath = "//p[text()='Orders']")
	private static WebElement orderspage_backbuttonordersr;


	@FindBy(xpath = "//input[@placeholder='Password']")
	private static WebElement btn_loginpassword;

	@FindBy(xpath = "//button[text()='Log in']")
	private static WebElement btn_loginbtn;

	@FindBy(xpath = "(//li[@role='menuitem']//a)[2]")
	private static WebElement orderspage_Newrecurringorders;


	@FindBy(xpath = "//a[@class='pull-right export-mclr']")
	private static WebElement orderspage_filter_option;

	@FindBy(xpath = "//div[text()=' Order status  ']")
	private static WebElement orderspage_order_status;

	@FindBy(xpath = "//span[text()=' Void']")
	private static WebElement orderspage_void_checkbox;

	@FindBy(xpath = "//button[text()='Apply']")
	private static WebElement orderspage_Apply_button;

	//payment outstanding

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	private static WebElement orderspage_Enterthesuppliername;

	@FindBy(xpath = "//button[text()=' Search ']")
	private static WebElement orderspage_Searchiconofsupplierpage;

	@FindBy(xpath = "//a[contains(@class,'zmdropDownBtn')]")
	private static WebElement orderspage_Actionsdropdownsabarisupplier;

	@FindBy(xpath = "(//div[@class='zmDropDown']//a)[3]")
	private static WebElement orderspage_Viewoutletsofsabarisupplier;

	@FindBy(xpath = "(//a[@class='zmdropDownBtn'])[3]")
	private static WebElement orderspage_Actionsdropdownofvelumasala;

	//@FindBy(xpath = "//button[text()=' Search ']")
	//private static WebElement orderspage_Managesettingofvelumasala;

	@FindBy(xpath = "(//label[contains(@class,'custom-control custom-checkbox')])[1]")
	private static WebElement orderspage_Uncheckofdefaultsetting;

	@FindBy(xpath = "(//label[contains(@class,'custom-control custom-checkbox')])[2]")
	private static WebElement orderspage_Checkboxofdisableordering;

	@FindBy(xpath = "//input[@placeholder='Enter mobile number']")
	private static WebElement orderspage_Enterthesmsmobilenumber;

	@FindBy(xpath = "//input[@formcontrolname='newOrderNotifyWhatsapp']")
	private static WebElement orderspage_Enterthewhatsappnumber;

	@FindBy(xpath = "//select[@formcontrolname='disableOrderingReason']")
	private static WebElement orderspage_Paymentoutstanding;

	@FindBy(xpath = "//span[text()=' Update ']")
	private static WebElement orderspage_Updatebuttonfinally;

	@FindBy(xpath = "//div[text()='sabari250']")
	private static WebElement orderspage_Sabaritwofiftysupplier;

	//@FindBy(xpath = "(//button[contains(@type,'button')])[7]")
	//private static WebElement orderspage_Okbutton;

	@FindBy(xpath = "//img[@src='../assets/zmcore/img/close-blue.svg']")
	private static WebElement orderspage_Closeiconinsupplierpage;

	@FindBy(xpath = "//select[@formcontrolname='disableOrderingReason']")
	private static WebElement orderspage_Ordersettingunverified;
	
	@FindBy(xpath = "//select[@formcontrolname='disableOrderingReason']")
	private static WebElement orderspage_Settingnotconfigured;
	
	@FindBy(xpath = "//img[@src='assets/zmcore/img/close-blue-x.svg']")
	private static WebElement orderspage_Closeiconofokbutton;
	
	@FindBy(xpath = "//div[@class='d-flex align-items-baseline']")
	private static WebElement orderspage_POPofsabaritwofifty;
	
	//outstanding payments
	
	@FindBy(xpath = "//div[text()='VELU MASALA3']")
	private static WebElement orderspage_Velumasalathreeinpop;
	
	@FindBy(xpath = "//div[@class='swal2-content']/following-sibling::div[1]")
	private static WebElement orderspage_Popmessage;
	
	@FindBy(xpath = "//img[@src='assets/zmcore/img/close-blue@22.png']")
	private static WebElement orderspage_Closeiconfirstpop;
	
	@FindBy(xpath = "//div[text()='VELU MASALA6']")
	private static WebElement orderspage_Velumasalatsixpop;
	
	@FindBy(xpath = "//div[text()='VELUMASLA250']")
	private static WebElement orderspage_Velumasalatwofiftypop;
	
	//@FindBy(xpath = "(//button[text()='OK'])[2]")
	//private static WebElement orderspage_Okbuttonofpop;



 

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
		//orderspage_velumasala2020.click();
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

	public static void click_BacktoOrderbutton() throws InterruptedException {
		Thread.sleep(5000);
		orderspage_BacktoOrderbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static void paste_OrderID(Object orderID) {
		//OrdersPage_OrderID.sendKeys("202011130001");
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





	public static void clicks_on_the_filter_option() {
		orderspage_filter_option.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}
	public static void clicks_on_the_order_status() {
		orderspage_order_status.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static void clicks_on_the_void_checkbox() {
		orderspage_void_checkbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static void clicks_on_the_Apply_button() {
		orderspage_Apply_button.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	//Payment outstanding


	public static void Usernavigatetoadminpanel() {
		driver.navigate().to("http://dev.admin.zeemart.asia/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Enterthesuppliername(String suppliername) {
		orderspage_Enterthesuppliername.sendKeys(suppliername);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clicksearchiconofsupplierpage() {
		orderspage_Searchiconofsupplierpage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonactionsdropdownsabarisupplier() {
		orderspage_Actionsdropdownsabarisupplier.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonviewoutletsofsabarisupplier() {
		orderspage_Viewoutletsofsabarisupplier.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonactionsdropdownofvelumasala() {
		orderspage_Actionsdropdownofvelumasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void Clickonmanagesettingofvelumasala() {
		WebElement manageSettings = driver.findElement(By.linkText("Manage settings"));
		manageSettings.click();
		//orderspage_Managesettingofvelumasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonuncheckofdefaultsetting() {
		orderspage_Uncheckofdefaultsetting.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickoncheckboxofdisableordering() {
		orderspage_Checkboxofdisableordering.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void click_Paymentoutstanding() {
		orderspage_Paymentoutstanding.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementPaymentoutstanding() {
		return orderspage_Paymentoutstanding;
	}

	/*public static void SelectPaymentoutstanding() throws InterruptedException {
			Thread.sleep(5000);


			/*driver.findElement(By.xpath("//select[@formcontrolname='disableOrderingReason']")).click();
			List<WebElement> list =driver.findElements(By.xpath("//select[@formcontrolname='disableOrderingReason']//select/option"));

	        System.out.println("Total number of item  : "+list.size() );
	        int s=list.size();
	        Thread.sleep(5000);
	        for(int i=0; i<s; i++){

	        	if(list.get(i).getText().equalsIgnoreCase("Payment outstanding")){
	        		System.out.println(list.get(i).getText()); 
	        		list.get(i).click();
	        		break;
	        	}
	        } */


	public static void Entermobilenumber(String smsmobilenumber) {
		orderspage_Enterthesmsmobilenumber.sendKeys(smsmobilenumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static void Enterwhatsappnumber(String whatsappnumber) {
		orderspage_Enterthewhatsappnumber.sendKeys(whatsappnumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickupdatebuttonfinally() {
		orderspage_Updatebuttonfinally.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Usernavigatetobuyerpanel() {
		driver.navigate().to("http://dev.buyer.zeemart.asia/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonokbutton() throws InterruptedException {
		Thread.sleep(5000);
		/*String parentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		while (iterator.hasNext()) {
		   String handle = iterator.next();
		   if (!handle.contains(parentWindow)) {
		                    // Switch to popup 
		                    driver.switchTo().window(handle);
		   }
		}*/
		//orderspage_Okbutton.click();
		//driver.close();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		   }
		
	

	public static void Clickonsabaritwofiftysupplier() throws InterruptedException {
		Thread.sleep(5000);
		orderspage_Sabaritwofiftysupplier.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickoncloseiconinsupplierpage() throws InterruptedException {
		Thread.sleep(5000);
		//WebElement createANew = driver.findElement(By.className("Blue"));
		//createANew.click();
		orderspage_Closeiconinsupplierpage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	} 

	public static void click_Ordersettingunverified() {
		orderspage_Ordersettingunverified.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementOrdersettingunverified() {
		return orderspage_Ordersettingunverified;
	}


	public static void click_Ordersettingnotconfigured() {
		orderspage_Settingnotconfigured.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementOrdersettingnotconfiured() {
		return orderspage_Settingnotconfigured;
	}
	
	public static void Clickoncloseiconofokbutton() throws InterruptedException {
		Thread.sleep(5000);
		String parentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		while (iterator.hasNext()) {
		   String handle = iterator.next();
		   if (!handle.contains(parentWindow)) {
		                    // Switch to popup 
		                    driver.switchTo().window(handle);
		orderspage_Closeiconofokbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		   }
		} 
		
	}
	public static void Clickonpopupofsabaritwofiftysupplier() {
		orderspage_POPofsabaritwofifty.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	//outstanding payments
	public static void Clickonvelumasalathree() throws InterruptedException {
		Thread.sleep(5000);
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentWindowId=it.next();
		System.out.println("parent Window id:" + parentWindowId);
		Thread.sleep(5000);
		
		Iterator<String> k = handler.iterator();
		String handle1 = k.next();
		System.out.println(handle1);
		System.out.println("The display handle1:" + handle1);
		driver.switchTo().window(handle1);
		System.out.println("The display handle1:" +driver.getTitle());
	
		orderspage_Velumasalathreeinpop.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		 
	}
	public static void Clickonokbuttoninpop() throws InterruptedException {
		Thread.sleep(5000);
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentWindowId=it.next();
		System.out.println("parent Window id:" + parentWindowId);
		Iterator<String> m = handler.iterator();
		String handle2 = m.next();
		System.out.println(handle2);
		System.out.println("The display handle1:" + handle2);
		Iterator<String> n = handler.iterator();
		String handle3 = n.next();
		System.out.println(handle3);
		System.out.println("The display handle1:" + handle3);
		driver.switchTo().window(handle3);
		System.out.println("The display handle3:" +driver.getTitle());
		orderspage_Popmessage.click();
		
		//driver.close();
	}
	public static void Clickcloseiconfirstpop() {
		orderspage_Closeiconfirstpop.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickvelumasalasix() throws InterruptedException {
		Thread.sleep(5000);
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentWindowId=it.next();
		System.out.println("parent Window id:" + parentWindowId);
		Thread.sleep(5000);
		
		Iterator<String> k = handler.iterator();
		String handle1 = k.next();
		System.out.println(handle1);
		System.out.println("The display handle1:" + handle1);
		driver.switchTo().window(handle1);
		System.out.println("The display handle1:" +driver.getTitle());
		orderspage_Velumasalatsixpop.click();
		
	}
	public static void Clickvelumasalatwofifty() throws InterruptedException {
		Thread.sleep(5000);
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentWindowId=it.next();
		System.out.println("parent Window id:" + parentWindowId);
		Thread.sleep(5000);
		
		Iterator<String> k = handler.iterator();
		String handle1 = k.next();
		System.out.println(handle1);
		System.out.println("The display handle1:" + handle1);
		driver.switchTo().window(handle1);
		System.out.println("The display handle1:" +driver.getTitle());
		orderspage_Velumasalatwofiftypop.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void click_velumasala2020(String outletname) {
		orderspage_velumasala2020.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	
	 
	
}












