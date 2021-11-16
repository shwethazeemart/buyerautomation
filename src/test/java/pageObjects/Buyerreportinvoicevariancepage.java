package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;
 
public class Buyerreportinvoicevariancepage {

	private static final WebElement Buyerreportinvoicevariancepage_selectoutlet = null;

	private static WebDriver driver;

	public Buyerreportinvoicevariancepage(WebDriver driver) {


		Buyerreportinvoicevariancepage.driver = driver;
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
	//private static WebElement Buyerreportinvoicevariancepage_Invoicevariance;
	
	@FindBy(xpath = "//input[@placeholder='Search invoice']")
	private static WebElement Buyerreportinvoicevariancepage_Searchbox;
	
	@FindBy(xpath = "//input[@placeholder='Search invoice']")
	private static WebElement Buyerreportinvoicevariancepage_Enterinvoicenumber;
	
	@FindBy(xpath = "//select[contains(@id,'country')]")
	private static WebElement Buyerreportinvoicevariancepage_selectvelumasala;
	
	@FindBy(xpath = "(//a[@class='export-mclr'])[1]")
	private static WebElement Buyerreportinvoicevariancepage_Filter;
	
	@FindBy(xpath = "(//select[contains(@class,'custom-select filter-dropdown')])[1]")
	private static WebElement Buyerreportinvoicevariancepage_selectsupplier;
	
	@FindBy(xpath = "(//select[contains(@class,'custom-select filter-dropdown')])[2]")
	private static WebElement Buyerreportinvoicevariancepage_Exactmatch;
	
	
	
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private static WebElement Buyerreportinvoicevariancepage_Applybutton;
	
	@FindBy(xpath = "//div[@class='filter-apply']//a[1]")
	private static WebElement Buyerreportinvoicevariancepage_Resetbutton;
	
	@FindBy(xpath = "//div[@class='flex__bwn px-r5']/following-sibling::div[1]")
	private static WebElement Buyerreportinvoicevariancepage_Outside;
	
	@FindBy(xpath = "//div[@class='pl-2']//a[1]")
	private static WebElement Buyerreportinvoicevariancepage_Exportdownloadbutton;
	
	
	@FindBy(xpath = "//img[@src='../assets/zmcore/img/left-report-b-icon.svg']/following-sibling::p[1]")
	private static WebElement Buyerreportinvoicevariancepage_Reportsbackbutton;
	
	
	
	 
	public static void Clickinvoicevarianceicon() {
		WebElement invoiceVar = driver.findElement(By.className("violetBox"));
		invoiceVar.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clicksearchbox() {
		Buyerreportinvoicevariancepage_Searchbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Entertheinvoicenumber(String invoice) {
		Buyerreportinvoicevariancepage_Enterinvoicenumber.sendKeys(invoice);
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
		js.executeScript("arguments[0].value='01Jan2021-31Aug2021';", DateBox);
	}
	
	
	public static void Selectvelumasala() throws InterruptedException {
		Buyerreportinvoicevariancepage_selectvelumasala.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	
	
	
	public static void Selectsupplier() throws InterruptedException {
		Thread.sleep(5000);
		Buyerreportinvoicevariancepage_selectsupplier.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementsabari() {
		return Buyerreportinvoicevariancepage_selectsupplier;
	
	}
	
		public static void Selectmatchstatus() throws InterruptedException {
			Buyerreportinvoicevariancepage_Exactmatch.click();
			Thread.sleep(5000);
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
		public static WebElement getDropDownElementstatus() {
			return Buyerreportinvoicevariancepage_Exactmatch;
		}
		public static void Clickexportdownloadbutton() throws InterruptedException {
			Buyerreportinvoicevariancepage_Exportdownloadbutton.click();
			//Thread.sleep(5000);
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public static void Clickonapplybutton() throws InterruptedException {
			Thread.sleep(5000);
			Buyerreportinvoicevariancepage_Applybutton.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public static void Clickonresetbutton() throws InterruptedException {
			Thread.sleep(5000);
			//WebElement reset = driver.findElement(By.linkText("Reset"));
			//reset.click();
			Buyerreportinvoicevariancepage_Resetbutton.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public static void Clickonoutside() {
			//WebElement reportsInvoiceVariance = driver.findElement(By.className("page__header"));
			//reportsInvoiceVariance.click();
			Buyerreportinvoicevariancepage_Outside.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
			
		}
		public static void Clickreportsbackbutton() {
			Buyerreportinvoicevariancepage_Reportsbackbutton.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		
		public static WebElement getDropDownElementoutletname() {
			return Buyerreportinvoicevariancepage_selectoutlet;

		}
		
		public static void Clickfilter() throws InterruptedException {
			Thread.sleep(5000);
			Buyerreportinvoicevariancepage_Filter.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

