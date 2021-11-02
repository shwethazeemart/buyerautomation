package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyerreportspenpersupplierpage {

	private static WebDriver driver;

	public Buyerreportspenpersupplierpage(WebDriver driver) {


		Buyerreportspenpersupplierpage.driver = driver;
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
	
	
	//@FindBy(xpath = "//a[contains(@class,'pull-right export-mclr')]")
	//private static WebElement Buyerreportspenpersupplierpage_Spendingpersupplier;
	
	@FindBy(xpath = "//input[@placeholder='Search suppliers']") 
	private static WebElement Buyerreportspenpersupplierpage_Searchbox;
	
	@FindBy(xpath = "//input[@placeholder='Search suppliers']")
	private static WebElement Buyerreportspenpersupplierpage_Enterthename;
	
	@FindBy(xpath = "//div[text()=' Outlets  ']")
	private static WebElement Buyerreportspenpersupplierpage_Outlets;
	
	@FindBy(xpath = "(//input[@name='zmSelectPopup'])[3]")
	private static WebElement Buyerreportspenpersupplierpage_Checkboxvelumasala;
	
	@FindBy(xpath = "(//a[@class='export-mclr'])[2]")
	private static WebElement Buyerreportspenpersupplierpage_Exportdownloadbutton;
	
	
	@FindBy(xpath = "//div[@class='btn-group px-2']")
	private static WebElement Buyerreportspenpersupplierpage_Filter;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private static WebElement Buyerreportspenpersupplierpage_Applybutton;
	
	@FindBy(xpath = "//div[@class='flex__bwn flex__pad']/following-sibling::div[1]")
	private static WebElement Buyerreportspenpersupplierpage_Outside;
	
	@FindBy(xpath = "(//div[contains(@class,'datatable-body-cell-label')])[10]")
	private static WebElement Buyerreportspenpersupplierpage_Sabaritwofiftysupplier;
	
	
	 
	
	public static void Clickonspendingpersupplier() {
		WebElement spendingPerSupplierUse = driver.findElement(By.className("orangeBox"));
		spendingPerSupplierUse.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clicksearchbox() {
		Buyerreportspenpersupplierpage_Searchbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Enterthenameinsearchbox(String name) {
		Buyerreportspenpersupplierpage_Enterthename.sendKeys(name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Clickonoutlets() {
		Buyerreportspenpersupplierpage_Outlets.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickoncheckboxvelumasala() {
		//Buyerreportspenpersupplierpage_Checkboxvelumasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void ClickExportdownloadbutton() {
		Buyerreportspenpersupplierpage_Exportdownloadbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Selectdatefromcalendar() {
		WebElement DateBox=driver.findElement(By.xpath("//span[contains(@name,'daterange')]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='30Jul2021-30Aug2021';", DateBox);
	}
	public static void Clickonfilter() {
		Buyerreportspenpersupplierpage_Filter.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonapplybutton() {
		Buyerreportspenpersupplierpage_Applybutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonresetbutton() {
		WebElement reset = driver.findElement(By.linkText("Reset"));
		reset.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Clickonoutside() {
		Buyerreportspenpersupplierpage_Outside.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonsabaritwofiftysupplier() {
		Buyerreportspenpersupplierpage_Sabaritwofiftysupplier.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonoutlet() {
		Buyerreportspenpersupplierpage_Checkboxvelumasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
		
	}
	
	
	
	
	
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

