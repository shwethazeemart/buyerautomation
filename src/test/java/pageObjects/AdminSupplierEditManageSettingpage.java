package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminSupplierEditManageSettingpage {


	private static WebDriver driver; 

	public AdminSupplierEditManageSettingpage(WebDriver driver) {


		AdminSupplierEditManageSettingpage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}


	@FindBy(xpath = "//button[contains(text(),' Manage settings')] ")
	private static WebElement AdminSupplierEditManageSettingpage_ManageSetting;
	
	@FindBy(xpath = "//input[contains(@id,'minOrder')]")
	private static WebElement AdminSupplierEditManageSettingpage_MinimumOrder;
	
	@FindBy(xpath = "//input[contains(@id,'minOrder')]")
	private static WebElement AdminSupplierEditManageSettingpage_EnterMinimumOrder;
	
	@FindBy(xpath = "//button[contains(text(),' Save')] ")
	private static WebElement AdminSupplierEditManageSettingpage_SaveButton;




	public static void manageSettingClick() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250);");
		AdminSupplierEditManageSettingpage_ManageSetting.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void minimumOrderClear() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");
		AdminSupplierEditManageSettingpage_MinimumOrder.clear(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}

	public static void enterMinimumOrder(String minimumorder) {
		AdminSupplierEditManageSettingpage_EnterMinimumOrder.sendKeys(minimumorder); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void saveButtonClick() {
		AdminSupplierEditManageSettingpage_SaveButton.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}











































































}
