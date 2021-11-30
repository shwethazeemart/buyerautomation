package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierDirectorySettingPage {

	private static WebDriver driver;

	public SupplierDirectorySettingPage(WebDriver driver) {


		SupplierDirectorySettingPage.driver = driver;
		PageFactory.initElements(driver, this);
	} 

	public static void navigateTo_LogInPage3() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}

	public static void navigateTo_invoiceprocesspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}
	

	@FindBy(xpath = "//button[text()=' Manage settings ']")
	private static WebElement SupplierDirectorySettingPage_ManageSettings;
	
	@FindBy(xpath = "//div[@class='form-group']//textarea[1]")
	private static WebElement SupplierDirectorySettingPage_AbouttheCompany;
	
	//@FindBy(xpath = "//button[@id='button-basic']")
	 //private static WebElement SupplierDirectorySettingPage_Clear;
	
	@FindBy(xpath = "//div[@class='form-group']//textarea[1]")
	private static WebElement SupplierDirectorySettingPage_AboutCompanyEnter;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private static WebElement SupplierDirectorySettingPage_CheckboxoffirstCertification;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	private static WebElement SupplierDirectorySettingPage_SaveButton;
	
	public static void ClickonManageaSettings() {
		SupplierDirectorySettingPage_ManageSettings.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void AbouttheCompanyclear() {
		SupplierDirectorySettingPage_AbouttheCompany.clear();
		try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
}
new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
		.executeScript("return document.readyState").equals("complete"));

}


	
	public static void ClickonCertificationsCheckbox() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		SupplierDirectorySettingPage_CheckboxoffirstCertification.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ClickonSave() {
		SupplierDirectorySettingPage_SaveButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void AbouttheCompanyEnter(String text) {
		SupplierDirectorySettingPage_AboutCompanyEnter.sendKeys(text);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
			}
	}
	
	
	
	
	
	
	
	
	
	
	
