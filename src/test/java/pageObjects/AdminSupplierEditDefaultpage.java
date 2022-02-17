package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminSupplierEditDefaultpage {

	private static WebDriver driver; 

	public AdminSupplierEditDefaultpage(WebDriver driver) {


		AdminSupplierEditDefaultpage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}
	
	@FindBy(xpath = "//a[contains(text(),'Edit default settings')] ")
	private static WebElement AdminSupplierEditDefaultpage_DefaultSetting;
	
	@FindBy(xpath = "//input[@formcontrolname='deliveryFeePolicyMinOrderAmount']")
	private static WebElement AdminSupplierEditDefaultpage_MinimumOrder;
	
	@FindBy(xpath = "//input[@formcontrolname='deliveryFeePolicyMinOrderAmount']")
	private static WebElement AdminSupplierEditDefaultpage_EnterMinimumOrder;
	
	@FindBy(xpath = "//input[contains(@id,'spName')]")
	private static WebElement AdminSupplierEditDefaultpage_SalesPerson;
	
	
	@FindBy(xpath = "//input[contains(@id,'spName')]")
	private static WebElement AdminSupplierEditDefaultpage_EnterSalesPersonName;
	
	@FindBy(xpath = "//input[contains(@id,'salesPersonPhone')]")
	private static WebElement AdminSupplierEditDefaultpage_SalesPersonPhone;
	
	@FindBy(xpath = "//input[contains(@id,'salesPersonPhone')]")
	private static WebElement AdminSupplierEditDefaultpage_EnterSalesPersonPhone;
	
	@FindBy(xpath = "//span[contains(text(),' Update')]")
	private static WebElement AdminSupplierEditDefaultpage_UpdateButton;
	
	
	
	
	
	

	public static void editDefaultSettingClick() {
		AdminSupplierEditDefaultpage_DefaultSetting.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}

	public static void minimumOrderClear() {
		AdminSupplierEditDefaultpage_MinimumOrder.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void enterMinimumOrder(String minimumorder) {
		AdminSupplierEditDefaultpage_EnterMinimumOrder.sendKeys(minimumorder);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void salesPersonClear() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");
		AdminSupplierEditDefaultpage_SalesPerson.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void enterSalesPersonName(String salesperson) {
		AdminSupplierEditDefaultpage_EnterSalesPersonName.sendKeys(salesperson);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void salesPersonPhoneClear() {
		AdminSupplierEditDefaultpage_SalesPersonPhone.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void enterSalesPersonPhone(String phonenumber) {
		AdminSupplierEditDefaultpage_EnterSalesPersonPhone.sendKeys(phonenumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void updateButtonClick() {
		AdminSupplierEditDefaultpage_UpdateButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
