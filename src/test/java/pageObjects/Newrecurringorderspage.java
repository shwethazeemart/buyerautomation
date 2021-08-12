package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Newrecurringorderspage {

	private static WebDriver driver;

	public Newrecurringorderspage(WebDriver driver) {


		Newrecurringorderspage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*public void navigateTo_Orderspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}*/
	
	public void navigateTo_LogInPage2() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
	}
	public void isTosterMessageFound1(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));
	}
	
	@FindBy(xpath = "(//button[contains(@class,'btn btn-primary')])[2]") 
	private static WebElement Newrecurringorderspage_Neworder; 
	
	@FindBy(xpath = "(//a[@class='dropdown-item fc-blue'])[2]") 
	private static WebElement Newrecurringorderspage_Newrecurring; 
	 
	@FindBy(xpath = "//select[@formcontrolname='outletId']") 
	private static WebElement Newrecurringorderspage_Velumasala2020; 
	
	@FindBy(xpath = "//select[@formcontrolname='supplierId']") 
	private static WebElement Newrecurringorderspage_Supplier_sabari250; 
	
	@FindBy(xpath = "//span[@formgroupname='1']")  
	private static WebElement Newrecurringorderspage_Deliverdatetuesday; 
	
	@FindBy(xpath = "//span[@formgroupname='2']") 
	private static WebElement Newrecurringorderspage_Deliverdatewednesday; 
	
	@FindBy(xpath = "(//div[@class='w-100 d-flex']//label)[2]") 
	private static WebElement Newrecurringorderspage_checkboxPublicholiday; 
	
	@FindBy(xpath = "(//input[contains(@formcontrolname,'endDate')])[1]") 
	private static WebElement Newrecurringorderspage_Radiobutton; 
	 
	@FindBy(xpath = "//select[@formcontrolname='contactPerson']") 
	private static WebElement Newrecurringorderspage_Contactperson_velumanieswaran2020; 
	
	@FindBy(xpath = "//button[text()='Done']") 
	private static WebElement Newrecurringorderspage_Donebutton; 
	
	@FindBy(xpath = "//div[text()[normalize-space()='Add to order']]") 
	private static WebElement Newrecurringorderspage_Addtoorder; 
	
	@FindBy(xpath = "//button[@data-type='plus']") 
	private static WebElement Newrecurringorderspage_FirsttimeincreaseAddtoorder; 
	
	@FindBy(xpath = "//button[@data-type='plus']") 
	private static WebElement Newrecurringorderspage_SecondtimeincreaseAddtoorder; 
	
	@FindBy(xpath = "//button[@data-type='plus']") 
	private static WebElement Newrecurringorderspage_ThirdtimeincreaseAddtoorder; 
	
	@FindBy(xpath = "//button[@data-type='plus']") 
	private static WebElement Newrecurringorderspage_FourthtimeincreaseAddtoorder; 
	
	@FindBy(xpath = "//button[@data-type='plus']") 
	private static WebElement Newrecurringorderspage_FifthtimeincreaseAddtoorder; 
	
	@FindBy(xpath = "//button[@data-type='plus']") 
	private static WebElement Newrecurringorderspage_SixthtimeincreaseAddtoorder; 
	
	@FindBy(xpath = "//button[@data-type='plus']") 
	private static WebElement Newrecurringorderspage_seventimeincreaseAddtoorder; 
	
	@FindBy(xpath = "//button[@data-type='plus']") 
	private static WebElement Newrecurringorderspage_eighttimeincreaseAddtoorder; 
	
	@FindBy(xpath = "//button[@data-type='plus']") 
	private static WebElement Newrecurringorderspage_ninethtimeincreaseAddtoorder;
	
	@FindBy(xpath = "//button[@data-type='plus']") 
	private static WebElement Newrecurringorderspage_tenthtimeincreaseAddtoorder;
	
	@FindBy(xpath = "//button[@data-type='plus']") 
	private static WebElement Newrecurringorderspage_eleventhtimeincreaseAddtoorder;
	
	@FindBy(xpath = "//button[@data-type='plus']") 
	private static WebElement Newrecurringorderspage_twvelthtimeincreaseAddtoorder;
	
	@FindBy(xpath = "//button[@data-type='plus']") 
	private static WebElement Newrecurringorderspage_thirteenthtimeincreaseAddtoorder;
	
	@FindBy(xpath = "//button[@data-type='plus']") 
	private static WebElement Newrecurringorderspage_fourteenthtimeincreaseAddtoorder;
	
	@FindBy(xpath = "//button[@data-type='plus']") 
	private static WebElement Newrecurringorderspage_fifteenthtimeincreaseAddtoorder;
	
	
	
	@FindBy(xpath = "//button[text()='Review order']") 
	private static WebElement Newrecurringorderspage_Revieworderbtn; 
	
	@FindBy(xpath = "//button[text()=' Save recurring order ']") 
	private static WebElement Newrecurringorderspage_Saverecurringorderbtn; 
	
	
	
	

	public static void Clicks_New_order_dropdown_value()  {
		Newrecurringorderspage_Neworder.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	

	public void Clicks_New_recurring_orders_in_the_dropdown_value() {
		Newrecurringorderspage_Newrecurring.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void click_Velumasala2020() throws InterruptedException {
		Thread.sleep(5000);
		Newrecurringorderspage_Velumasala2020.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownOwnerElement() {
		return Newrecurringorderspage_Velumasala2020;
	}
	
	public static void click_Supplier_sabari250() throws InterruptedException {
		Newrecurringorderspage_Supplier_sabari250.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementsupplier() {
		return Newrecurringorderspage_Supplier_sabari250;
	}

	public void Clicks_on_deliver_date_in_tuesday() throws InterruptedException {
		Newrecurringorderspage_Deliverdatetuesday.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_on_deliver_date_in_wednesday() throws InterruptedException {
		Newrecurringorderspage_Deliverdatewednesday.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_on_checkbox_Public_holidays() {
		Newrecurringorderspage_checkboxPublicholiday.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_on_Radio_button_of_Never() {
		Newrecurringorderspage_Radiobutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void click_Contactperson_velumanieswaran2020() throws InterruptedException {
		Newrecurringorderspage_Contactperson_velumanieswaran2020.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownOwnerElementcontactperson() {
		return Newrecurringorderspage_Contactperson_velumanieswaran2020;
	}

	public void Clicks_on_the_Done_button() {
		Newrecurringorderspage_Donebutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void Clicks_on_Add_to_order_in_the_first_product() {
		Newrecurringorderspage_Addtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void Clicks_on_first_time_increase_the_order_button_in_the_first_product() {
		Newrecurringorderspage_FirsttimeincreaseAddtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void Clicks_on_second_time_increase_the_order_button_in_the_first_product() {
		Newrecurringorderspage_SecondtimeincreaseAddtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_on_third_time_increase_the_order_button_in_the_first_product() {
		Newrecurringorderspage_ThirdtimeincreaseAddtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_on_fourth_time_increase_the_order_button_in_the_first_product() {
		Newrecurringorderspage_FourthtimeincreaseAddtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_on_fifth_time_increase_the_order_button_in_the_first_product() {
		Newrecurringorderspage_FifthtimeincreaseAddtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void Clicks_on_sixth_time_increase_the_order_button_in_the_first_product() {
		Newrecurringorderspage_SixthtimeincreaseAddtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
		
	}

	public void Clicks_on_Review_Oreder_button() {
		Newrecurringorderspage_Revieworderbtn.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_on_Save_recurring_order() {
		Newrecurringorderspage_Saverecurringorderbtn.click();
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

	public void Clicks_on_seven_time_increase_the_order_button_in_the_first_product() {
		Newrecurringorderspage_seventimeincreaseAddtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void Clicks_on_eight_time_increase_the_order_button_in_the_first_product() {
		Newrecurringorderspage_eighttimeincreaseAddtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_on_nineth_time_increase_the_order_button_in_the_first_product() {
		Newrecurringorderspage_ninethtimeincreaseAddtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks_on_tenth_time_increase_the_order_button_in_the_first_product() {
		Newrecurringorderspage_tenthtimeincreaseAddtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_on_eleventh_time_increase_the_order_button_in_the_first_product() {
		Newrecurringorderspage_eleventhtimeincreaseAddtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_on_twvelth_time_increase_the_order_button_in_the_first_product() {
		Newrecurringorderspage_twvelthtimeincreaseAddtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_on_thirteenth_time_increase_the_order_button_in_the_first_product() {
		Newrecurringorderspage_thirteenthtimeincreaseAddtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void Clicks_on_fourteenth_time_increase_the_order_button_in_the_first_product() {
		Newrecurringorderspage_fourteenthtimeincreaseAddtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_on_fifteenth_time_increase_the_order_button_in_the_first_product() {
		Newrecurringorderspage_fifteenthtimeincreaseAddtoorder.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
}
