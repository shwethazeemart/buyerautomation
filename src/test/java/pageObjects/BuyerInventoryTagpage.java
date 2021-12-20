package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class BuyerInventoryTagpage {


	private static WebDriver driver;

	public BuyerInventoryTagpage(WebDriver driver) {


		BuyerInventoryTagpage.driver = driver;
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
	
	
	@FindBy(xpath = "(//div[@class='datatable-body-cell-label'])[2]  ")
	private static WebElement BuyerInventoryTagpage_FirstStockcount;
	
	@FindBy(xpath = "//span[text()='Add tags']")
	private static WebElement BuyerInventoryTagpage_AddTagButton;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private static WebElement BuyerInventoryTagpage_SaveButton;
	
	@FindBy(xpath = "//a[contains(@class,'title-clr pl-1')]")
	private static WebElement BuyerInventoryTagpage_BackButton;
	
	@FindBy(xpath = "//button[text()=' Consumption report ']")
	private static WebElement BuyerInventoryTagpage_ConsumptionReport;
	
	

	public static void FirstStockcountClick() {
		BuyerInventoryTagpage_FirstStockcount.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void AddTagButtonClick() {
		BuyerInventoryTagpage_AddTagButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void SaveButtonClick() throws InterruptedException {
		Thread.sleep(5000);
		BuyerInventoryTagpage_SaveButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void BackButtonClick() throws InterruptedException {
		Thread.sleep(5000);
		BuyerInventoryTagpage_BackButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ConsumptionReportClick() throws InterruptedException {
		Thread.sleep(5000);
		BuyerInventoryTagpage_ConsumptionReport.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
