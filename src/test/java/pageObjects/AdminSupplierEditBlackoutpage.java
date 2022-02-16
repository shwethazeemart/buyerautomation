package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminSupplierEditBlackoutpage {

	private static WebDriver driver; 

	public AdminSupplierEditBlackoutpage(WebDriver driver) {


		AdminSupplierEditBlackoutpage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}
	
	@FindBy(xpath = "//input[contains(@id,'filterOrder')]")
	private static WebElement AdminSupplierEditBlackoutpage_Searchbox;
	
	@FindBy(xpath = "//input[contains(@id,'filterOrder')]")
	private static WebElement AdminSupplierEditBlackoutpage_EnterSupplierName;
	
	@FindBy(xpath = "//button[contains(text(),' Search')] ")
	private static WebElement AdminSupplierEditBlackoutpage_SearchButton;
	
	@FindBy(xpath = "//a[contains(text(),'Edit blackout dates for delivery')]  ")
	private static WebElement AdminSupplierEditBlackoutpage_EditBalckout;
	
	@FindBy(xpath = "//button[text()=' Add ']")
	private static WebElement AdminSupplierEditBlackoutpage_AddButton;
	
	@FindBy(xpath = "(//button[@class='close']//img)[1] ")
	private static WebElement AdminSupplierEditBlackoutpage_CloseIconButton;
	

	public static void searchtextboxClear() {
		AdminSupplierEditBlackoutpage_Searchbox.clear(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void enterSupplierName(String suppliername) {
		AdminSupplierEditBlackoutpage_EnterSupplierName.sendKeys(suppliername);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void searchButtonClick() {
		AdminSupplierEditBlackoutpage_SearchButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void selectDatefromCalendar() throws InterruptedException {
		Thread.sleep(5000);
		WebElement DateBoxtwo=driver.findElement(By.xpath("//input[contains(@formcontrolname,'blackoutDate')]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='16 Feb 2022';", DateBoxtwo);

	}

	public static void addButtonClick() {
		AdminSupplierEditBlackoutpage_AddButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void closeIconClick() {
		AdminSupplierEditBlackoutpage_CloseIconButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void editBackoutClick() {
		AdminSupplierEditBlackoutpage_EditBalckout.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
