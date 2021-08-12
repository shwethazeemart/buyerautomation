package pageObjects;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import managers.FileReaderManager;

	public class Adminbuyeroutletsubscriptionpage {


		private static WebDriver driver;

		public Adminbuyeroutletsubscriptionpage(WebDriver driver) {

 
			Adminbuyeroutletsubscriptionpage.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public static void navigateTo_LogInPage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
		}

		public void isTosterMessageFound(String msg) {
			WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

		}
		
		@FindBy(xpath = "(//div[@class='form-check pato-2']//label)[1]")
		private static WebElement Adminbuyeroutletsubscriptionpage_sg_government_grant_check_box;

	
		@FindBy(xpath = "//label[contains(@class,'custom-control custom-radio')]")
		private static WebElement Adminbuyeroutletsubscriptionpage_click_on_the_radio_button_Growth_billed;
		
		@FindBy(xpath = "//select[contains(@class,'custom-select ng-pristine')]")
		private static WebElement Adminbuyeroutletsubscriptionpage_Giro;
		
		@FindBy(xpath = "(//div[@class='mari-2']//label)[2]")
		private static WebElement Adminbuyeroutletsubscriptionpage_radio_button_of_Renew_with_same_plan_settings;
		
		@FindBy(xpath = "//input[@formcontrolname='subscriptionEmails']")
		private static WebElement Adminbuyeroutletsubscriptionpage_EnterEmail;
		
		@FindBy(xpath = "(//div[@class='form-check pato-2']//label)[2]")
		private static WebElement Adminbuyeroutletsubscriptionpage_checkbox_of_Paying_for_invoice_processing;
		
		
		
		
		@FindBy(xpath = "//input[@formcontrolname='searchText']")
		private static WebElement Adminbuyeroutletsubscriptionpage_entername;
		
		@FindBy(xpath = "//button[text()=' Search ']")
		private static WebElement Adminbuyeroutletsubscriptionpage_search_icon;
		
		@FindBy(xpath = "(//a[contains(@class,'zmdropDownBtn')])[1]")
		private static WebElement Adminbuyeroutletsubscriptionpage_Action_dropdown;
		
		@FindBy(xpath = "//div[@ng-reflect-click-outside-enabled='true']//a[1]")
		private static WebElement Adminbuyeroutletsubscriptionpage_Edit_button;
		
		@FindBy(xpath = "//button[@type='submit']")
		private static WebElement Adminbuyeroutletsubscriptionpage_savechanges_button;
		
		
		public void click_on_the_sg_government_grant_check_box() {
			Adminbuyeroutletsubscriptionpage_sg_government_grant_check_box.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public void click_on_the_radio_button_Growth_billed() {
			Adminbuyeroutletsubscriptionpage_click_on_the_radio_button_Growth_billed.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

			
		}
		public static void click_Giro() throws InterruptedException {
			//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			//Adminbuyeroutletsubscriptionpage_Giro.click();
			Thread.sleep(5000);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
	   // public static WebElement getDropDowntoGiroElement() {
		//return Adminbuyeroutletsubscriptionpage_Giro;
		//}
		public static void SelectcalendarByJS() {
			//WebElement DateBox=driver.findElement(By.xpath("//input[@placeholder='Select date']"));

			//JavascriptExecutor js = (JavascriptExecutor) driver;



			//js.executeScript("arguments[0].value='31May2021';", DateBox);
			
		}

		public void click_the_radio_button_of_Renew_with_same_plan_settings() {
			//Adminbuyeroutletsubscriptionpage_radio_button_of_Renew_with_same_plan_settings.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public void enter_email_Send_subscription(String enteremail) {
			Adminbuyeroutletsubscriptionpage_EnterEmail.sendKeys(enteremail);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public void click_on_the_checkbox_of_Paying_for_invoice_processing() {
			Adminbuyeroutletsubscriptionpage_checkbox_of_Paying_for_invoice_processing.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public void navigate_to_buyer_panel() {
			driver.navigate().to("http://dev.buyer.zeemart.asia/");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public void enter_name_in_search_box(String entername) {
			Adminbuyeroutletsubscriptionpage_entername.sendKeys(entername);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public void clicks_the_search_icon() {
			Adminbuyeroutletsubscriptionpage_search_icon.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}

		public void click_the_Action_dropdown() {
			Adminbuyeroutletsubscriptionpage_Action_dropdown.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public void click_the_Edit_button() {
			Adminbuyeroutletsubscriptionpage_Edit_button.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}

		public void Enter_outlet_name_in_autocomplete_text_box() throws InterruptedException {
			driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("sstmasala20",Keys.ENTER);
			Thread.sleep(5000);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public void clicks_savechanges_button() {
			Adminbuyeroutletsubscriptionpage_savechanges_button.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		}
			

	

