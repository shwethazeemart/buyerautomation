package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminOrderDetailsPage {

	private static WebDriver driver;

	public AdminOrderDetailsPage(WebDriver driver) {


		AdminOrderDetailsPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}
	
	
	@FindBy(xpath = "(//datatable-body-cell[contains(@class,'actionActive cellAlignLeft')])[10]")
	private static WebElement AdminOrderDetailsPage_Order;
	
	@FindBy(xpath = "//a[text()='Details']")
	private static WebElement AdminOrderDetailsPage_DetailsTab;
	
	@FindBy(xpath = "//a[text()='Activity']")
	private static WebElement AdminOrderDetailsPage_ActivityTab;
	
	@FindBy(xpath = "//span[text()='Cancel order']")
	private static WebElement AdminOrderDetailsPage_CancelOrderButton;
	
	@FindBy(xpath = "//textarea[@placeholder='Type reason manually (upto 150 characters)']")
	private static WebElement AdminOrderDetailsPage_ReasonTextbox;
	
	@FindBy(xpath = "//button[text()='Cancel order']")
	private static WebElement AdminOrderDetailsPage_CancelFinalButton;
	
	
	public static void ParticularOrderClicks() {
		AdminOrderDetailsPage_Order.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void ClickDetailsTab() {
		AdminOrderDetailsPage_DetailsTab.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}

	public static void ClickActivityTab() {
		AdminOrderDetailsPage_ActivityTab.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}

	public static void CancelButtonClicks() {
		AdminOrderDetailsPage_CancelOrderButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}

	
	public static void TextboxReasonEnters(String reason) {
		AdminOrderDetailsPage_ReasonTextbox.sendKeys(reason);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}

	public static void FinalCancelButtonClicks() {
		AdminOrderDetailsPage_CancelFinalButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}


}
