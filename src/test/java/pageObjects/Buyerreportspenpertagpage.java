package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyerreportspenpertagpage {

	private static WebDriver driver;

	public Buyerreportspenpertagpage(WebDriver driver) {


		Buyerreportspenpertagpage.driver = driver;
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
	//private static WebElement Buyerreportspenpertagpage_Spendingpertag;
	
	@FindBy(xpath = "//input[@placeholder='Search tag']")
	private static WebElement Buyerreportspenpertagpage_Searchbox;
	
	@FindBy(xpath = "//input[@placeholder='Search tag']")
	private static WebElement Buyerreportspenpertagpage_Enterthetagname;
	
	@FindBy(xpath = "(//a[@class='export-mclr'])[1]")
	private static WebElement Buyerreportspenpertagpage_Filter;
	
	@FindBy(xpath = "//div[text()=' Outlets  ']")
	private static WebElement Buyerreportspenpertagpage_Outlets;
	
	@FindBy(xpath = "(//input[@name='zmSelectPopup'])[3]")
	private static WebElement Buyerreportspenpertagpage_Checkboxofvelumasala;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private static WebElement Buyerreportspenpertagpage_Applybutton;
	
	@FindBy(xpath = "//a[@class='filter-reset ml-3']")
	private static WebElement Buyerreportspenpertagpage_Resetbutton;
	
	@FindBy(xpath = "//div[@class='page__header']/following-sibling::div[1]")
	private static WebElement Buyerreportspenpertagpage_Outside;
	
	@FindBy(xpath = "//div[text()=' Suppliers  ']")
	private static WebElement Buyerreportspenpertagpage_Suppliers;
	
	@FindBy(xpath = "//input[@type='checkbox']") 
	private static WebElement Buyerreportspenpertagpage_Checkboxofsabari;
	
	@FindBy(xpath = "(//a[@class='export-mclr'])[2]")
	private static WebElement Buyerreportspenpertagpage_Exportdownloadbutton;	
	
	
	@FindBy(xpath = "(//div[contains(@class,'datatable-body-cell-label')])[1]")
	private static WebElement Buyerreportspenpertagpage_Masalatag;
	
	@FindBy(xpath = "(//a[@class='export-mclr'])[1]")
	private static WebElement Buyerreportspenpertagpage_Exportbuttoninmasala;
	
	@FindBy(xpath = "(//a[@class='export-mclr'])[2]")
	private static WebElement Buyerreportspenpertagpage_Filtertaginmasala;
	
	@FindBy(xpath = "//div[@class='d-flex nav__back']/following-sibling::div[1]")
	private static WebElement Buyerreportspenpertagpage_Outsidetaginmasala;
	
	
		

	public static void Clickonspendingpertag() {
		WebElement spendingPerTagSee = driver.findElement(By.className("yellowBox"));
		spendingPerTagSee.click();
				try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Clicksearchbox() {
		Buyerreportspenpertagpage_Searchbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
		
	}
	public static void Entertagnameinsearchbox(String name) {
		Buyerreportspenpertagpage_Enterthetagname.sendKeys(name);
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
		Buyerreportspenpertagpage_Filter.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Clickonoutlets() {
		Buyerreportspenpertagpage_Outlets.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void ClickonCheckboxofvelumasala() {
		//Buyerreportspenpertagpage_Checkboxofvelumasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonapplybutton() {
		Buyerreportspenpertagpage_Applybutton.click();
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
		Buyerreportspenpertagpage_Outside.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonsuppliers() {
		Buyerreportspenpertagpage_Suppliers.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickoncheckboxofsabari() {
		Buyerreportspenpertagpage_Checkboxofsabari.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonexportdownloadbutton() {
		Buyerreportspenpertagpage_Exportdownloadbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	
	
	public static void Clickonmasalatag() {
		Buyerreportspenpertagpage_Masalatag.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Clickonexportbuttoninmasala() {
		Buyerreportspenpertagpage_Exportbuttoninmasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonfiltertaginmasala() {
		Buyerreportspenpertagpage_Filtertaginmasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonoutsidetaginmasala() {
		Buyerreportspenpertagpage_Outsidetaginmasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonoutlet() {
		Buyerreportspenpertagpage_Checkboxofvelumasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

}
