package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class BuyerinventorySKUlisenpage {

	private static WebDriver driver;

	public BuyerinventorySKUlisenpage(WebDriver driver) {


		BuyerinventorySKUlisenpage.driver = driver;
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
	
	
	@FindBy(xpath = "//div[text()='velu masala2020']")
	private static WebElement BuyerinventorySKUlisenpage_velumasala;
	
	@FindBy(xpath = "//button[text()=' New stock count ']")
	private static WebElement BuyerinventorySKUlisenpage_stockcount;
	
	@FindBy(xpath = "//img[@src='./assets/zmcore/img/close-blue-x.svg']")
	private static WebElement BuyerinventorySKUlisenpage_stockcountcloseicon;
	
	@FindBy(xpath = "//button[text()=' Record adjustment ']")
	private static WebElement BuyerinventorySKUlisenpage_Recordadjustment;
	
	@FindBy(xpath = "//img[@src='./assets/zmcore/img/close-blue-x.svg']")
	private static WebElement BuyerinventorySKUlisenpage_Recordadjustmentcloseicon;
	
	@FindBy(xpath = "(//img[@src='./assets/zmcore/img/download-icon.svg'])[1]")
	private static WebElement BuyerinventorySKUlisenpage_Exportdownloadbutton;
	
	@FindBy(xpath = "//img[@src='assets/zmcore/img/plus-blue.svg']")
	private static WebElement BuyerinventorySKUlisenpage_AddSKU;
	
	@FindBy(xpath = "//p[text()='Add to:']/following-sibling::select")
	private static WebElement BuyerinventorySKUlisenpage_veluSKU;
	
	@FindBy(xpath = "(//input[contains(@class,'custom-control-input')])[10]")
	private static WebElement BuyerinventorySKUlisenpage_CheckboxofSKU;
	
	@FindBy(xpath = "//button[text()='Done']")
	private static WebElement BuyerinventorySKUlisenpage_Donebutton;
	
	@FindBy(xpath = "(//input[contains(@class,'custom-control-input')])[6]")
	private static WebElement BuyerinventorySKUlisenpage_FirstcheckboxofSKU;
	
	@FindBy(xpath = "//button[text()=' Edit par level ']")
	private static WebElement BuyerinventorySKUlisenpage_Editparlevel;
	
	@FindBy(xpath = "(//img[@class='p-close'])[1]")
	private static WebElement BuyerinventorySKUlisenpage_Editparlevelcloseicon;
	
	@FindBy(xpath = "//button[text()=' Remove from inventory ']")
	private static WebElement BuyerinventorySKUlisenpage_Removefrominventory;
	
	@FindBy(xpath = "(//img[@src='./assets/zmcore/img/close-blue.svg'])[3]")
	private static WebElement BuyerinventorySKUlisenpage_Removefrominventorycloseicon;
	
	@FindBy(xpath = "//button[text()=' Clear ']")
	private static WebElement BuyerinventorySKUlisenpage_Clearicon;
	
	 

	public static void clickvelumasala() {
		BuyerinventorySKUlisenpage_velumasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void clicknewstockcount() {
		BuyerinventorySKUlisenpage_stockcount.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void clicknewstockcountcloseicon() {
		BuyerinventorySKUlisenpage_stockcountcloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void clickrecordadjustment() {
		BuyerinventorySKUlisenpage_Recordadjustment.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Recordadjstmentcloseicon() {
		BuyerinventorySKUlisenpage_Recordadjustmentcloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickexportdownloadbutton() {
		BuyerinventorySKUlisenpage_Exportdownloadbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void clickAddSKU() {
		BuyerinventorySKUlisenpage_AddSKU.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void click_SKUvelu() throws InterruptedException {
		BuyerinventorySKUlisenpage_veluSKU.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementSKU() {
		return BuyerinventorySKUlisenpage_veluSKU;
	}

	public static void ClickcheckboxSKU() {
		BuyerinventorySKUlisenpage_CheckboxofSKU.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void clickdonebutton() {
		BuyerinventorySKUlisenpage_Donebutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void clickfirstchckboxofSKU() {
		BuyerinventorySKUlisenpage_FirstcheckboxofSKU.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void clickonEditparlevel() {
		BuyerinventorySKUlisenpage_Editparlevel.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickEditparlevelcloseicon() {
		BuyerinventorySKUlisenpage_Editparlevelcloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void clickremovefrominventory() {
		BuyerinventorySKUlisenpage_Removefrominventory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickremovefrominventorycloseicon() {
		BuyerinventorySKUlisenpage_Removefrominventorycloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonclearicon() {
		BuyerinventorySKUlisenpage_Clearicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
