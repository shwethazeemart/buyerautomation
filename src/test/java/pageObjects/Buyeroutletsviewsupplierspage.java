package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyeroutletsviewsupplierspage {

	private static WebDriver driver;
	
	public Buyeroutletsviewsupplierspage(WebDriver driver) {


		Buyeroutletsviewsupplierspage.driver = driver;
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

	@FindBy(xpath = "(//a[@class='zmdropDownBtn'])[3]")
	private static WebElement Buyeroutletsviewsupplierspage_ActionsOfEditOutlet;
	
	//@FindBy(xpath = "(//div[@class='datatable-body-cell-label']//div)[3]")
	//private static WebElement Buyeroutletsviewsupplierspage_Viewmarketlist;
	
	@FindBy(xpath = "//input[@placeholder='Product code or name']")
	private static WebElement Buyeroutletsviewsupplierspage_Searchbox;
	
	@FindBy(xpath = "//input[@placeholder='Product code or name']")
	private static WebElement Buyeroutletsviewsupplierspage_Entername;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private static WebElement Buyeroutletsviewsupplierspage_Checkboxofproductcode;
	
	@FindBy(xpath = "//button[text()='Edit tags ']")
	private static WebElement Buyeroutletsviewsupplierspage_Edittags;
	
	@FindBy(xpath = "//h4[text()='Add tags']/following-sibling::button")
	private static WebElement Buyeroutletsviewsupplierspage_Edittagscloseicon;
	
	@FindBy(xpath = "//button[text()='Delete ']")
	private static WebElement Buyeroutletsviewsupplierspage_Deletebutton;
	
   @FindBy(xpath = "//h4[text()='Delete selected products?']/following-sibling::button")
	private static WebElement Buyeroutletsviewsupplierspage_Deletebuttoncloseicon;
   
   @FindBy(xpath = "//button[text()='Disable ']")
	private static WebElement Buyeroutletsviewsupplierspage_DisableButton;
   
   @FindBy(xpath = "(//button[@class='close']//img)[2]")
	private static WebElement Buyeroutletsviewsupplierspage_DisableCloseIcon;
	
	@FindBy(xpath = "//button[@id='button-basic']")
	private static WebElement Buyeroutletsviewsupplierspage_Optionsicon;
	
	@FindBy(xpath = "//button[text()=' Copy to other outlets ']")
	private static WebElement Buyeroutletsviewsupplierspage_CopyToOtherOutlets;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-clear-blue')]")
	private static WebElement Buyeroutletsviewsupplierspage_Selectallicon;
	
	@FindBy(xpath = "//button[text()=' OK ']")
	private static WebElement Buyeroutletsviewsupplierspage_Okbutton;
	
	//@FindBy(xpath = "(//div[@class='datatable-body-cell-label']//div)[3]")
	//private static WebElement Buyeroutletsviewsupplierspage_Doenloadmarketlist;
	
	@FindBy(xpath = "//button[text()='Select all']")
	private static WebElement Buyeroutletsviewsupplierspage_BelowSelectallicon;
	 
	
	public static void ClickActionsOfEditOutlet() {
		Buyeroutletsviewsupplierspage_ActionsOfEditOutlet.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	public static void Clickviewmarketlist() {
		WebElement viewMarketList = driver.findElement(By.linkText("View market list"));
        viewMarketList.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clicksearchbox() {
		Buyeroutletsviewsupplierspage_Searchbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Enternameinsearchbox(String name) {
		Buyeroutletsviewsupplierspage_Entername.sendKeys(name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void ClickCheckboxofproductcode() {
		Buyeroutletsviewsupplierspage_Checkboxofproductcode.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickonedittags() {
		Buyeroutletsviewsupplierspage_Edittags.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonedittagscloseicon() {
		Buyeroutletsviewsupplierspage_Edittagscloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickondeletebutton() {
		Buyeroutletsviewsupplierspage_Deletebutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickondeletebuttoncloseicon() {
		Buyeroutletsviewsupplierspage_Deletebuttoncloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	
	   public static void ClickCopytoOtherOutlets() {
		   Buyeroutletsviewsupplierspage_CopyToOtherOutlets.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
			}
	
	public static void Clickonselectallicon() {
		Buyeroutletsviewsupplierspage_Selectallicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void Clickonbelowselectallicon() {
		Buyeroutletsviewsupplierspage_BelowSelectallicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonokbutton() {
		Buyeroutletsviewsupplierspage_Okbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void Clickonclearcheckbox() {
		WebElement clear = driver.findElement(By.linkText("Clear"));
		clear.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickoptionsicon() {
		Buyeroutletsviewsupplierspage_Optionsicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
				
	}
		
	public static void Clickondownloadmarketlist() {
		WebElement downloadMarketlist = driver.findElement(By.linkText("Download marketlist"));
        downloadMarketlist.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void ClickDisable() {
		Buyeroutletsviewsupplierspage_DisableButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
				
	}
	public static void ClickDisableCloseIcon() {
		Buyeroutletsviewsupplierspage_DisableCloseIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
		
}
