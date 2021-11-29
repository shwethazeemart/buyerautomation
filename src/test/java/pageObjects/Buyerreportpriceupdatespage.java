package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyerreportpriceupdatespage {

	private static WebDriver driver;

	public Buyerreportpriceupdatespage(WebDriver driver) {


		Buyerreportpriceupdatespage.driver = driver;
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
	
	
	//@FindBy(xpath = "//h1[text()='Price updates']")
	//private static WebElement Buyerreportpriceupdatespage_Priceupdatesicon;
	
	@FindBy(xpath = "//input[@placeholder='Search SKU']")
	private static WebElement Buyerreportpriceupdatespage_Searchbox;
	
	@FindBy(xpath = "//input[@placeholder='Search SKU']")
	private static WebElement Buyerreportpriceupdatespage_Enterskunameinsearchbox;
	
	@FindBy(xpath = "//span[contains(@name,'daterange')]")
	private static WebElement Buyerreportpriceupdatespage_Calendaricon;
	
	@FindBy(xpath = "//li[@data-range-key='YTD']")
	private static WebElement Buyerreportpriceupdatespage_YTDfromcalendar;
	
	@FindBy(xpath = "//select[contains(@id,'country')]")
	private static WebElement Buyerreportpriceupdatespage_selectoutlet;
	
	@FindBy(xpath = "(//a[@class='export-mclr'])[1]")
	private static WebElement Buyerreportpriceupdatespage_Filtericon;
	
	@FindBy(xpath = "//select[contains(@class,'custom-select filter-dropdown')]")
	private static WebElement Buyerreportpriceupdatespage_Selectsuppliername;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private static WebElement Buyerreportpriceupdatespage_Applybutton;
	
	@FindBy(xpath = "//a[contains(@class,'filter-reset')]")
	private static WebElement Buyerreportpriceupdatespage_Resetbutton;
	
	@FindBy(xpath = "//div[@class='page__header users']/following-sibling::div[1]")
	private static WebElement Buyerreportpriceupdatespage_Outsideicon;
	
	@FindBy(xpath = "//div[@class='pl-2']//a[1]")
	private static WebElement Buyerreportpriceupdatespage_Exportdownloadbutton;
	
	@FindBy(xpath = "//p[text()='Spending report']")
	private static WebElement Buyerreportpriceupdatespage_Reportsbackbutton;
	
	@FindBy(xpath = "//img[@src='../assets/zmcore/img/left-report-b-icon.svg']/following-sibling::p[1]")
	private static WebElement Buyerreportpriceupdatespage_Reportsbackbuttoninsku;
	
	@FindBy(xpath = "//div[@class='pl-2']//a[1]")
	private static WebElement Buyerreportpriceupdatespage_Downloadbuttonfirstpage;
	
	
	
	
	public static void Clickonpriceupdatesicon() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, 1000);");
		WebElement priceUpdatesShowsAll = driver.findElement(By.className("skyBlueBox"));
		priceUpdatesShowsAll.click();
		//Buyerreportpriceupdatespage_Priceupdatesicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clicksearchbox() {
		Buyerreportpriceupdatespage_Searchbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Enterskunameinsearchbox(String sku) {
		Buyerreportpriceupdatespage_Enterskunameinsearchbox.sendKeys(sku);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickoncalendaricon() {
		Buyerreportpriceupdatespage_Calendaricon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void ClickonYTDfromcalendar() {
		Buyerreportpriceupdatespage_YTDfromcalendar.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	public static void Selectvelumasala() throws InterruptedException {
		Buyerreportpriceupdatespage_selectoutlet.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementoutletname() {
		return Buyerreportpriceupdatespage_selectoutlet;
	
	}
	
	
	public static void Clickonfilter() {
		Buyerreportpriceupdatespage_Filtericon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	

	public static void Selectsuppliersabari() throws InterruptedException {
		Buyerreportpriceupdatespage_Selectsuppliername.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	
	public static WebElement getDropDownElementsuppliername() {
		return Buyerreportpriceupdatespage_Selectsuppliername;
	}
	
	public static void Clickapplybutton() throws InterruptedException {
		Thread.sleep(5000);
		Buyerreportpriceupdatespage_Applybutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickresetbutton() throws InterruptedException {
		//WebElement reset = driver.findElement(By.linkText("Reset"));
		//reset.click();
		Buyerreportpriceupdatespage_Resetbutton.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonoutsideicon() {
		Buyerreportpriceupdatespage_Outsideicon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickexportdownloadbutton() {
		Buyerreportpriceupdatespage_Exportdownloadbutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickreportsbackbutton() {
		Buyerreportpriceupdatespage_Reportsbackbutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Clickreportbackbuttoninsku() {
		Buyerreportpriceupdatespage_Reportsbackbuttoninsku.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickondownloadbuttonfirstpage() {
		Buyerreportpriceupdatespage_Downloadbuttonfirstpage.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
		
	}
	
	
	
		
	

