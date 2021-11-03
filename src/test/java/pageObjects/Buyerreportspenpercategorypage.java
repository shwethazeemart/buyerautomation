package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyerreportspenpercategorypage {

	private static WebDriver driver;

	public Buyerreportspenpercategorypage(WebDriver driver) {


		Buyerreportspenpercategorypage.driver = driver;
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
	
	
	//@FindBy(xpath = "//input[@placeholder='Product code or name']")
	//private static WebElement Buyerreportspenpercategorypage_Spendingpercategory;
	
	
	@FindBy(xpath = "//input[@formcontrolname='category']")
	private static WebElement Buyerreportspenpercategorypage_Searchboxincategory;
	
	@FindBy(xpath = "//input[@formcontrolname='category']")
	private static WebElement Buyerreportspenpercategorypage_Enterthecategoryname;
	
	@FindBy(xpath = "//a[@class='pull-right export-mclr']")
	private static WebElement Buyerreportspenpercategorypage_Filter;
	
	@FindBy(xpath = "//div[text()=' Outlets  ']")
	private static WebElement Buyerreportspenpercategorypage_Outlets;
	
	@FindBy(xpath = "(//input[@name='zmSelectPopup'])[3]")
	private static WebElement Buyerreportspenpercategorypage_Checkboxofvelumasala;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private static WebElement Buyerreportspenpercategorypage_Applybutton;
	
	//@FindBy(xpath = "//input[@placeholder='Product code or name']")
	//private static WebElement Buyerreportspenpercategorypage_Resetbutton;
	
	@FindBy(xpath = "//div[@class='page__header']/following-sibling::div[1]")
	private static WebElement Buyerreportspenpercategorypage_Outside;
	
	@FindBy(xpath = "//div[text()=' Suppliers  ']")
	private static WebElement Buyerreportspenpercategorypage_Suppliers;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private static WebElement Buyerreportspenpercategorypage_Checkboxofsabari;
	
	@FindBy(xpath = "//button[text()='Search']")
	private static WebElement Buyerreportspenpercategorypage_Searchicon;
	
	
	
	@FindBy(xpath = "(//div[contains(@class,'datatable-body-cell-label')])[3]")
	private static WebElement Buyerreportspenpercategorypage_Beercategory;
	
	@FindBy(xpath = "//select[contains(@id,'country')]")
	private static WebElement Buyerreportspenpercategorypage_Selectmonthdropdown;
	
	@FindBy(xpath = "//div[contains(@class,'flex__bwn flex__pad')]")
	private static WebElement Buyerreportspenpercategorypage_OutsideBeercategory;
	
	 
	
	 
	
	public static void Clickspendingpercategory() {
		WebElement spendingPerCategoryFind = driver.findElement(By.className("spendingperBox"));
		spendingPerCategoryFind.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clicksearchboxincategory() {
		 Buyerreportspenpercategorypage_Searchboxincategory.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Enterthecategoryname(String name) {
		Buyerreportspenpercategorypage_Enterthecategoryname.sendKeys(name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Selectdatefromcalendar() {
		
		WebElement DateBox=driver.findElement(By.xpath("//input[@formcontrolname='categoryDateRange']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='01Sep2021-30Sep2021';", DateBox);
		
	}
	public static void Clickfilter() throws InterruptedException {
		Thread.sleep(5000);
		 Buyerreportspenpercategorypage_Filter.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickoutlets() {
		Buyerreportspenpercategorypage_Outlets.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void Clickcheckboxofvelumasala() {
		//Buyerreportspenpercategorypage_Checkboxofvelumasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Clickapplybutton() {
		Buyerreportspenpercategorypage_Applybutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Clickresetbutton() {
		WebElement reset = driver.findElement(By.linkText("Reset"));
		reset.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Clickoutside() {
		Buyerreportspenpercategorypage_Outside.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clicksuppliers() {
		Buyerreportspenpercategorypage_Suppliers.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickcheckboxofsabari() {
		Buyerreportspenpercategorypage_Checkboxofsabari.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clicksearchicon() {
		Buyerreportspenpercategorypage_Searchicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	
	
	public static void ClickonBeercategory() {
		Buyerreportspenpercategorypage_Beercategory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Selectdatefromcalendarinbeer() throws InterruptedException {
		Thread.sleep(5000);
		WebElement DateBox=driver.findElement(By.xpath("//span[@name='daterange']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='07Sep2020-07Sep2021';", DateBox);
	}
	
	
	public static void Selectsoutletmonth() throws InterruptedException {
		Thread.sleep(5000);
		Buyerreportspenpercategorypage_Selectmonthdropdown.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementmonth() {
		return Buyerreportspenpercategorypage_Selectmonthdropdown;
	}
	public static void Clickonoutsidecategoryinbeer() {
		Buyerreportspenpercategorypage_OutsideBeercategory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonoutlet() {
		Buyerreportspenpercategorypage_Checkboxofvelumasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
