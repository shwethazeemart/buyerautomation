package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class OutletsPagesteps {

	private static WebDriver driver;

	public OutletsPagesteps(WebDriver driver) {


		OutletsPagesteps.driver = driver;
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
	
	
	@FindBy(xpath = "(//div[@class='datatable-body-cell-label']//div)[3]")
	private static WebElement OutletsPagesteps_actions_dropdown;  
	
	@FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
	private static WebElement OutletsPagesteps_View_suppliers;
	
	//@FindBy(xpath = "//div[@class='ng-star-inserted']//a[1]")
	//private static WebElement OutletsPagesteps_Actions_dropdown;
	
	@FindBy(xpath = "(//a[@routerlinkactive='active'])[2]")
	private static WebElement OutletsPagesteps_view_orders;
	
	
	
	public static void clicks_actions_dropdown() throws InterruptedException {
		OutletsPagesteps_actions_dropdown.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}

	public static void clicks_View_suppliers() {
		OutletsPagesteps_View_suppliers.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void clicks_on_the_actions_dropdown() {
		WebElement actions = driver.findElement(By.linkText("Actions"));
		actions.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clicks_on_the_view_orders() {
		OutletsPagesteps_view_orders.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

