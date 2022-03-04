package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminSupplierApplyOutletpage {

	private static WebDriver driver; 

	public AdminSupplierApplyOutletpage(WebDriver driver) {


		AdminSupplierApplyOutletpage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}


	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[5]")
	private static WebElement AdminSupplierApplyOutletpage_CheckboxofOutlet;

	@FindBy(xpath = "//button[text()=' Apply outlet settings from... ']")
	private static WebElement AdminSupplierApplyOutletpage_ApplyOutletSetting;
	
	@FindBy(xpath = "//select[contains(@id,'outletCopyFrom')]")
	private static WebElement AdminSupplierApplyOutletpage_OutletDropdown;
	
	
	@FindBy(xpath = "//button[text()='Select all']")
	private static WebElement AdminSupplierApplyOutletpage_SelectAllIcon;
	
	@FindBy(xpath = "//button[text()=' Apply']")
	private static WebElement AdminSupplierApplyOutletpage_ApplyButton;



	public static void checkboxofOutletClick() throws InterruptedException {
		Thread.sleep(5000);
		AdminSupplierApplyOutletpage_CheckboxofOutlet.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void applyOutletSettingClick() {
		AdminSupplierApplyOutletpage_ApplyOutletSetting.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void selectOutletDropdown() throws InterruptedException {
		Thread.sleep(5000);
		AdminSupplierApplyOutletpage_OutletDropdown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getOutletDropdownElement() {
		return AdminSupplierApplyOutletpage_OutletDropdown;
	}

	public static void selectallIconClick() {
		AdminSupplierApplyOutletpage_SelectAllIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}

	public static void applyButtonClick() {
		AdminSupplierApplyOutletpage_ApplyButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}		



















































































}
