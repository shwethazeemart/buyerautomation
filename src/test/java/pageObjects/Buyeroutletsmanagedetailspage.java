package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyeroutletsmanagedetailspage {

	private static WebDriver driver;

	public Buyeroutletsmanagedetailspage(WebDriver driver) {


		Buyeroutletsmanagedetailspage.driver = driver;
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
	//private static WebElement Buyeroutletsmanagedetailspage_Managedetails;

	@FindBy(xpath = "//input[@formcontrolname='email']")
	private static WebElement Buyeroutletsmanagedetailspage_Outletemail;
	
	@FindBy(xpath = "//input[@formcontrolname='email']")
	private static WebElement Buyeroutletsmanagedetailspage_Enternewemail;
	
	@FindBy(xpath = "(//div[@class='ng-star-inserted']//p)[3] ")
	private static WebElement Buyeroutletsmanagedetailspage_Managesubscription;
	
	@FindBy(xpath = "(//img[@src='/assets/zmcore/img/close-blue.svg'])[1]")
	private static WebElement Buyeroutletsmanagedetailspage_Managesubscriptioncloseicon;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]") 
	private static WebElement Buyeroutletsmanagedetailspage_Savebutton;
	
	@FindBy(xpath = "(//h1[text()='Zeemart subscription']/following-sibling::div)[1]") 
	private static WebElement Buyeroutletsmanagedetailspage_Firstmanagesubscriptioncloseicon;

	

 
	public static void Clickonmanagedetails() {
		WebElement manageDetails = driver.findElement(By.linkText("Manage details"));
		manageDetails.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}


	public static void Clearonoutletemail() {
		Buyeroutletsmanagedetailspage_Outletemail.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Enternewemail(String Email) {
		Buyeroutletsmanagedetailspage_Enternewemail.sendKeys(Email);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	
	
	public static void Clicksavebutton() {
		Buyeroutletsmanagedetailspage_Savebutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void Clickmanagesubscription() throws InterruptedException {
		Thread.sleep(5000);
		Buyeroutletsmanagedetailspage_Managesubscription.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickmanagesubscriptioncloseicon() {
		Buyeroutletsmanagedetailspage_Managesubscriptioncloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickfirstmanagesubscription() throws InterruptedException {
		Thread.sleep(5000);
		Buyeroutletsmanagedetailspage_Firstmanagesubscriptioncloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}




















}  




































