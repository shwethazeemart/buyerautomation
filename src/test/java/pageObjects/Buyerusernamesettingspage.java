package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyerusernamesettingspage {

	private static WebDriver driver;

	public Buyerusernamesettingspage(WebDriver driver) {


		Buyerusernamesettingspage.driver = driver;
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
	
	 
	
	
	//@FindBy(xpath = "//input[@placeholder='Search tag']")
	//private static WebElement Buyerusernamesettingspage_Usernameinrighthandside;
	
	@FindBy(xpath = "//span[text()=' Settings']")
	private static WebElement Buyerusernamesettingspage_Settingdropdownicon;
	
	@FindBy(xpath = "//a[text()=' Details ']/following-sibling::a")
	private static WebElement Buyerusernamesettingspage_Linkedcompanies;
	
	@FindBy(xpath = "(//a[@class='zmdropDownBtn'])[2]")
	private static WebElement Buyerusernamesettingspage_Velumasaladropdownicon;
	
	@FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
	private static WebElement Buyerusernamesettingspage_Managepaymentsettings;
	
	@FindBy(xpath = "//p[text()=' My account']")
	private static WebElement Buyerusernamesettingspage_Backbuttonofmyaccount;
	
	
	@FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
	private static WebElement Buyerusernamesettingspage_Manageintegration;
	
	
	
	

	public static void Clickusernameinrighthandside() {
		WebElement veluMani = driver.findElement(By.tagName("zm-sidenav-user-name"));
		veluMani.click();
		
		//Buyerusernamesettingspage_Usernameinrighthandside.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clcikonsetting() {
		Buyerusernamesettingspage_Settingdropdownicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickonlinkedcompanies() {
		Buyerusernamesettingspage_Linkedcompanies.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonvelumasaladropdownicon() {
		Buyerusernamesettingspage_Velumasaladropdownicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonmanagepaymentsettings() {
		Buyerusernamesettingspage_Managepaymentsettings.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickbackbuttonofmyaccount() {
		Buyerusernamesettingspage_Backbuttonofmyaccount.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickonmanageintegration() {
		Buyerusernamesettingspage_Manageintegration.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
