package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyerreportspenperskupage {

	private static WebDriver driver;

	public Buyerreportspenperskupage(WebDriver driver) {


		Buyerreportspenperskupage.driver = driver;
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
	//private static WebElement Buyerreportspenperskupage_Spendingpersku;
	
	@FindBy(xpath = "//input[@placeholder='Search SKU']")
	private static WebElement Buyerreportspenperskupage_Searchbox;
	
	@FindBy(xpath = "//input[@placeholder='Search SKU']")
	private static WebElement Buyerreportspenperskupage_Enterthesku;
	
	@FindBy(xpath = "(//a[@class='export-mclr'])[1]")
	private static WebElement Buyerreportspenperskupage_Filter;
	
	@FindBy(xpath = "//div[text()=' Outlets  ']")
	private static WebElement Buyerreportspenperskupage_Outlets;
	
	@FindBy(xpath = "(//input[@name='zmSelectPopup'])[3]")
	private static WebElement Buyerreportspenperskupage_Checkboxvelumasala;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private static WebElement Buyerreportspenperskupage_Applybutton;
	
	//@FindBy(xpath = "//a[contains(@class,'pull-right export-mclr')]")
	//private static WebElement Buyerreportspenperskupage_Resetbutton;
	
	@FindBy(xpath = "//div[@class='page__header']/following-sibling::div[1]")
	private static WebElement Buyerreportspenperskupage_Outside;
	
	@FindBy(xpath = "//div[text()=' Suppliers  ']")
	private static WebElement Buyerreportspenperskupage_Supplier;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private static WebElement Buyerreportspenperskupage_Checkboxofsabari;
	
	@FindBy(xpath = "(//a[@class='export-mclr'])[2]")
	private static WebElement Buyerreportspenperskupage_Exportdownloadbutton;
	
	
	 

	public static void Clickonspendingsku() {
		WebElement spendingPerSKUSee = driver.findElement(By.className("greenBox"));
		spendingPerSKUSee.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonsearchbox() {
		Buyerreportspenperskupage_Searchbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Entertheskuinsearchbox(String name) {
		Buyerreportspenperskupage_Enterthesku.sendKeys(name);
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
		Buyerreportspenperskupage_Filter.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonoutlets() {
		Buyerreportspenperskupage_Outlets.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickcheckboxofvelumasala() {
		Buyerreportspenperskupage_Checkboxvelumasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickapplybutton() {
		Buyerreportspenperskupage_Applybutton.click();
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
		Buyerreportspenperskupage_Outside.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonsupplier() {
		Buyerreportspenperskupage_Supplier.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickcheckboxofsabari() {
		Buyerreportspenperskupage_Checkboxofsabari.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickexportdownloadbutton() {
		Buyerreportspenperskupage_Exportdownloadbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
