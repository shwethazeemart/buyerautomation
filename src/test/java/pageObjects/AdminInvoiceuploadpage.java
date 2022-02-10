package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminInvoiceuploadpage {

	private static WebDriver driver;

	public AdminInvoiceuploadpage(WebDriver driver) {


		AdminInvoiceuploadpage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}
	 
	@FindBy(xpath = "//input[contains(@name,'loginEmail')]")
	private static WebElement AdminInvoiceuploadpage_enter_exact_username;
	
	@FindBy(xpath = "//input[contains(@name,'loginPassword')]")
	private static WebElement AdminInvoiceuploadpage_enter_exact_password;
	
	@FindBy(xpath = "//select[contains(@name,'market')]")
	private static WebElement AdminInvoiceuploadpage_Singapore;
	
	@FindBy(xpath = "//button[contains(@type,'submit')]")
	private static WebElement AdminInvoiceuploadpage_press_the_Admin_login_button;
	
	@FindBy(xpath = "//button[@btncheckboxfalse='0']")
	private static WebElement btn_Uploadinvoicebtn;

	@FindBy(xpath = "//button[text()=' Upload ']") 
	private static WebElement btn_Uploadbtn;
 
	@FindBy(xpath = "//button[text()='Done']") 
	private static WebElement AdminInvoiceuploadpage_DoneButton;


	public void Clicks_in_Upload_invoice() throws InterruptedException {
		btn_Uploadinvoicebtn.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Select_Outlet() throws InterruptedException {
		driver.findElement(By.xpath("//div[@role='combobox']//input[1]")).sendKeys("Sakthimasala100",Keys.ENTER);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_the_upload_file() {


	}

	public void Clicks_the_Upload_button() throws InterruptedException {		
		btn_Uploadbtn.click();
		Thread.sleep(5000);
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

	public void enter_exact_username_guna_zeemart_asia(String username) {
		AdminInvoiceuploadpage_enter_exact_username.sendKeys(username);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void enter_exact_password_2p$2s_QU(String password) {
		AdminInvoiceuploadpage_enter_exact_password.sendKeys(password);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	public static void click_Singapore() {
		AdminInvoiceuploadpage_Singapore.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownOwnerElement() {
		return AdminInvoiceuploadpage_Singapore;
	}

	public void press_the_Admin_login_button() {
		AdminInvoiceuploadpage_press_the_Admin_login_button.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void ClickDoneButton() {
		AdminInvoiceuploadpage_DoneButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}


}

 



















