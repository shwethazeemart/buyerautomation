package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyerinventoryoutletslisenpage {

	private static WebDriver driver;

	public Buyerinventoryoutletslisenpage(WebDriver driver) {


		Buyerinventoryoutletslisenpage.driver = driver;
		PageFactory.initElements(driver, this);
	} 

	public void navigateTo_LogInPage2() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
	}

	public static void navigateTo_invoiceprocesspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}



	@FindBy(xpath = "//a[@href='/sg/pages/inventoryManage/outlets']")
	private static WebElement Buyerinventoryoutletslisenpage_outletsicon;

	@FindBy(xpath = "//img[@src='./assets/zmcore/img/settings-blue.svg']") 
	private static WebElement Buyerinventoryoutletslisenpage_settings;

	@FindBy(xpath = "//h4[text()='Inventory settings']/following-sibling::button")
	private static WebElement Buyerinventoryoutletslisenpage_settingscloseicon;

	@FindBy(xpath = "//img[@src='./assets/zmcore/img/download-icon.svg']")
	private static WebElement Buyerinventoryoutletslisenpage_exportdownloadicon;

	@FindBy(xpath = "//button[text()='Create new list']")
	private static WebElement Buyerinventoryoutletslisenpage_newlistofsstmasala;

	@FindBy(xpath = "(//div[@class='datatable-body-cell-label']//div)[1]")
	private static WebElement Buyerinventoryoutletslisenpage_velumasala;

	@FindBy(xpath = "//div[text()='sstmasala2020']")
	private static WebElement Buyerinventoryoutletslisenpage_starterplanofsstmasala;

	@FindBy(xpath = "//input[@placeholder='Search outlets']")
	private static WebElement Buyerinventoryoutletslisenpage_searchoutlets;

	@FindBy(xpath = "//input[@placeholder='Search outlets']")
	private static WebElement Buyerinventoryoutletslisenpage_outletname;

	@FindBy(xpath = "//span[text()=' Status ']") 
	private static WebElement Buyerinventoryoutletslisenpage_statusicon;

	@FindBy(xpath = "//label[text()=' Has items below par ']")
	private static WebElement Buyerinventoryoutletslisenpage_checkbox;
	
	@FindBy(xpath = "//button[@class='close pull-right']")
	private static WebElement Buyerinventoryoutletslisenpage_newlistcloseicon;
	
	@FindBy(xpath = "//h4[text()='Upgrade to use this feature']/following-sibling::button")
	private static WebElement Buyerinventoryoutletslisenpage_starterplancloseicon;
	
	
	
	@FindBy(xpath = "//label[text()=' Has items below par ']")
	private static WebElement Buyerinventoryoutletslisenpage_UncheckboxofHasitem;
	
	@FindBy(xpath = "//input[@value='Last count > 31 days ago']")
	private static WebElement Buyerinventoryoutletslisenpage_CheckboxofLastcount;
	
	@FindBy(xpath = "//input[@value='Last count > 31 days ago']")
	private static WebElement Buyerinventoryoutletslisenpage_UncheckboxofLastcount;
	
	//@FindBy(xpath = "//a[contains(@class,'title-clr pl-1 ng-star-inserted')]") 
	//private static WebElement Buyerinventoryoutletslisenpage_returntooutletpage;

	//(//datatable-body-cell[contains(@class,'datatable-body-cell sort-active ng-star-inserted')])[8]

 
	public static void clickoutletsicon() {
		Buyerinventoryoutletslisenpage_outletsicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void clicksettings() {
		Buyerinventoryoutletslisenpage_settings.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void clicksettingscloseicon() {
		Buyerinventoryoutletslisenpage_settingscloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void clickexportdownloadicon() {
		Buyerinventoryoutletslisenpage_exportdownloadicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void clicknewlistofsstmasala() {
		Buyerinventoryoutletslisenpage_newlistofsstmasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void clickonvelumasala() {
		Buyerinventoryoutletslisenpage_velumasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void clickstarterplanofsstmasala() {
		Buyerinventoryoutletslisenpage_starterplanofsstmasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void searchoutlets() {
		Buyerinventoryoutletslisenpage_searchoutlets.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void enteroutletname(String outletname) {
		Buyerinventoryoutletslisenpage_outletname.sendKeys(outletname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void clickstatusicon() {
		Buyerinventoryoutletslisenpage_statusicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void clickcheckbox() {
		Buyerinventoryoutletslisenpage_checkbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void clicknewlistcloseicon() {
		Buyerinventoryoutletslisenpage_newlistcloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void clickstarterplancloseicon() {
		Buyerinventoryoutletslisenpage_starterplancloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void clickreturntooutletpage() throws InterruptedException {
		Thread.sleep(5000);
		//Buyerinventoryoutletslisenpage_returntooutletpage.click();
		WebElement inventory = driver.findElement(By.className("arrow_left"));
		inventory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickuncheckboxogHasitem() {
		Buyerinventoryoutletslisenpage_UncheckboxofHasitem.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickoncheckboxoflastcount() {
		Buyerinventoryoutletslisenpage_CheckboxofLastcount.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonuncheckboxoflastcount() {
		Buyerinventoryoutletslisenpage_UncheckboxofLastcount.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	
	}

	public static void Clickverticallyscrollup() {
		//WebElement DateBox=driver.findElement(By.xpath("//div[@class='d-flex flex_inv_pad']/following-sibling::div[1]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("scroll(0, -250);");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
		
	
	
	}


















