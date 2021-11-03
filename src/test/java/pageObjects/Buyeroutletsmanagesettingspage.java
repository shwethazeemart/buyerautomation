package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyeroutletsmanagesettingspage {

	private static WebDriver driver;

	public Buyeroutletsmanagesettingspage(WebDriver driver) {


		Buyeroutletsmanagesettingspage.driver = driver;
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


	//@FindBy(xpath = "(//div[@class='datatable-body-cell-label']//div)[3]")
	//private static WebElement Buyeroutletsmanagesettingspage_Managesettings;
	

	@FindBy(xpath = "//input[@class='search-icon form-control']")
	private static WebElement Buyeroutletsmanagesettingspage_Searchbox;
	

	@FindBy(xpath = "//input[@class='search-icon form-control']")
	private static WebElement Buyeroutletsmanagesettingspage_Enterthename;
	
	@FindBy(xpath = "//button[text()=' Add member ']")
	private static WebElement Buyeroutletsmanagesettingspage_Addmemberbutton;
	
	@FindBy(xpath = "//div[@class='selected-list']//div[1]")
	private static WebElement Buyeroutletsmanagesettingspage_Selectusersearchbox;
	
	@FindBy(xpath = "//label[text()='velu eshwar-velueshwar1980@gmail.com']")
	private static WebElement Buyeroutletsmanagesettingspage_Checkboxofaruloli;
	
	//@FindBy(xpath = "(//ul[@class='button_row mt-4']//a)[1]")
	//private static WebElement Buyeroutletsmanagesettingspage_Cancelbutton;
	
	//@FindBy(xpath = "(//ul[@class='button_row mt-4']//a)[2]")
	//private static WebElement Buyeroutletsmanagesettingspage_Addbutton;
	
	@FindBy(xpath = "(//input[@type='email'])[1]")
	private static WebElement Buyeroutletsmanagesettingspage_Weeklyemail;
	 
	@FindBy(xpath = "(//input[@type='email'])[1]")
	private static WebElement Buyeroutletsmanagesettingspage_Enterweeklyemail;
	
	@FindBy(xpath = "//select[@class='custom-select weekdays']")
	private static WebElement Buyeroutletsmanagesettingspage_Selectcutofday;
	
	@FindBy(xpath = "(//input[@type='email'])[2]")
	private static WebElement Buyeroutletsmanagesettingspage_Maillist;
	
	@FindBy(xpath = "(//input[@type='email'])[2]")
	private static WebElement Buyeroutletsmanagesettingspage_Enterlistemail;
	
	@FindBy(xpath = "(//input[@type='email'])[3]")
	private static WebElement Buyeroutletsmanagesettingspage_Outletemail;
	
	@FindBy(xpath = "(//input[@type='email'])[3]")
	private static WebElement Buyeroutletsmanagesettingspage_Enteroutletemail;
	
	@FindBy(xpath = "(//button[contains(@type,'button')])[5]")
	private static WebElement Buyeroutletsmanagesettingspage_Savebutton;
	
	@FindBy(xpath = "(//div[@class='modal-content'])[3]")
	private static WebElement Buyeroutletsmanagesettingspage_Outsidesection;
	
	
	

	public static void Clickmanagesettings() {
		WebElement manageSettings = driver.findElement(By.linkText("Manage settings"));
		manageSettings.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clicksearchbox() {
		Buyeroutletsmanagesettingspage_Searchbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Enterthename(String Name) {
		Buyeroutletsmanagesettingspage_Enterthename.sendKeys(Name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickaddmeemberbutton() {
		Buyeroutletsmanagesettingspage_Addmemberbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickonselectuserserachbox() {
		Buyeroutletsmanagesettingspage_Selectusersearchbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickcheckboxofaruloli() {
		Buyeroutletsmanagesettingspage_Checkboxofaruloli.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickcancelbutton() throws InterruptedException {
		Thread.sleep(5000);
		WebElement cancel = driver.findElement(By.className("float-left"));
		cancel.click();
		//Buyeroutletsmanagesettingspage_Cancelbutton.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickaddbutton() throws InterruptedException {
		Thread.sleep(5000);
		WebElement add = driver.findElement(By.linkText("Add"));
		add.click();
		//Buyeroutletsmanagesettingspage_Addbutton.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clearweeklyemail() {
		Buyeroutletsmanagesettingspage_Weeklyemail.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Enterweeklyemail(String weeklyEmail) {
		Buyeroutletsmanagesettingspage_Enterweeklyemail.sendKeys(weeklyEmail);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	

	public static void Selectcutofday()  {
		Buyeroutletsmanagesettingspage_Selectcutofday.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementcutofday() {
		return Buyeroutletsmanagesettingspage_Selectcutofday;
	}
	
	public static void Clearemaillist() {
		Buyeroutletsmanagesettingspage_Maillist.clear();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Enteremaillist(String email) {
		Buyeroutletsmanagesettingspage_Enterlistemail.sendKeys(email);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clearoutletemail() {
		Buyeroutletsmanagesettingspage_Outletemail.clear();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Enteroutletemail(String outletemail) {
		Buyeroutletsmanagesettingspage_Enteroutletemail.sendKeys(outletemail);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Clicksavebutton() {
		Buyeroutletsmanagesettingspage_Savebutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Clickonoutsidesection() {
		Buyeroutletsmanagesettingspage_Outsidesection.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
