package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyeroutletslistingpage {

	private static WebDriver driver;

	public Buyeroutletslistingpage(WebDriver driver) {


		Buyeroutletslistingpage.driver = driver;
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


	

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private static WebElement Buyeroutletslistingpage_Sstmasalacheckbox;
	
	@FindBy(xpath = "//button[text()='Make inactive']")
	private static WebElement Buyeroutletslistingpage_Makeinactive;
	
	@FindBy(xpath = "//span[text()='This action cannot be undone']/following::input")
	private static WebElement Buyeroutletslistingpage_EntertheDisableintextbox;
	
	@FindBy(xpath = "//button[text()='Yes, make inactive']")
	private static WebElement Buyeroutletslistingpage_Makeinactivebutton;
	
	@FindBy(xpath = "//button[text()='Make active']")
	private static WebElement Buyeroutletslistingpage_Makeonactiveicon;
	
	@FindBy(xpath = "(//a[@class='zmdropDownBtn'])[3]")
	private static WebElement Buyeroutletslistingpage_Actionsdropdownvelumasala;
	
	@FindBy(xpath = "(//a[@routerlinkactive='active'])[2]")
	private static WebElement Buyeroutletslistingpage_Managedetails;
	
	@FindBy(xpath = "//p[text()='Outlets']")
	private static WebElement Buyeroutletslistingpage_Backbuttonofoutlets;
	
	@FindBy(xpath = "(//a[@routerlinkactive='active'])[3] ")
	private static WebElement Buyeroutletslistingpage_Managesettings;
	
	@FindBy(xpath = "(//a[@routerlinkactive='active']/following-sibling::a)[2]")
	private static WebElement Buyeroutletslistingpage_Viewsuppliers;
	
	@FindBy(xpath = "//input[@placeholder='Search outlet name']")
	private static WebElement Buyeroutletslistingpage_Entertheoutletname;
	 
	
	
	
	

	public static void Clickonsstmasalacheckbox() {
		Buyeroutletslistingpage_Sstmasalacheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickonmakeinactive() {
		Buyeroutletslistingpage_Makeinactive.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void EntertheDisableintextbox(String DISABLE) {
		Buyeroutletslistingpage_EntertheDisableintextbox.sendKeys(DISABLE);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickyesmakeinactivebutton() {
		Buyeroutletslistingpage_Makeinactivebutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonmakeactiveicon() {
		Buyeroutletslistingpage_Makeonactiveicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Clickonactionsdropdownvelumasala() {
		Buyeroutletslistingpage_Actionsdropdownvelumasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickonmanagedetails() {
		Buyeroutletslistingpage_Managedetails.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickonbackbuttonofoutlets() {
		Buyeroutletslistingpage_Backbuttonofoutlets.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonmanagesettings() {
		Buyeroutletslistingpage_Managesettings.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonviewsuppliers() {
		Buyeroutletslistingpage_Viewsuppliers.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Entertheoutletname(String velumasala2020) {
		Buyeroutletslistingpage_Entertheoutletname.sendKeys(velumasala2020);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
