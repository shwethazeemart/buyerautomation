package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierCompanySettingsPage {

	
	private static WebDriver driver;

	public SupplierCompanySettingsPage(WebDriver driver) {


		SupplierCompanySettingsPage.driver = driver;
		PageFactory.initElements(driver, this);
	} 

	public static void navigateTo_LogInPage3() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}

	public static void navigateTo_invoiceprocesspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}
	public void navigateTo_LogInPage2() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}


	@FindBy(xpath = "//zm-sidenav-user-name[text()='MRMANAGER New']")
	private static WebElement SupplierCompanySettingsPage_UserAccount;
	
	@FindBy(xpath = "//div[text()=' Company settings ']")
	private static WebElement SupplierCompanySettingsPage_CompanySetting;
	
	//@FindBy(xpath = "(//div[@class='col-4']//div)[2]")
	//private static WebElement SupplierCompanySettingsPage_DetailsIcon;
	
	@FindBy(xpath = "//a[@href='/sg/pages/companysettings/payments']")
	private static WebElement SupplierCompanySettingsPage_PaymentsIcon;
	
	//@FindBy(xpath = "(//div[@class='col-4']//div)[2]")
	//private static WebElement SupplierCompanySettingsPage_InvoicingIcon;
	
	//@FindBy(xpath = "(//div[@class='col-4']//div)[2]")
	//private static WebElement SupplierCompanySettingsPage_IntegrationIcon;
	
	//@FindBy(xpath = "(//div[@class='col-4']//div)[2]")
	//private static WebElement SupplierCompanySettingsPage_SubscriptionIcon;
	
	//@FindBy(xpath = "(//div[@class='col-4']//div)[2]")
	//private static WebElement SupplierCompanySettingsPage_ViewPricingOptions;
	
	
	
	
	
	
	

	public static void UserAccountClick() throws InterruptedException {
		Thread.sleep(5000);
		SupplierCompanySettingsPage_UserAccount.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void CompanySettingClick() {
		SupplierCompanySettingsPage_CompanySetting.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void DetailsIconClick() throws InterruptedException {
		Thread.sleep(5000);
		WebElement details = driver.findElement(By.linkText("Details"));
		details.click();
		//SupplierCompanySettingsPage_DetailsIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void PaymentsIconClick() {
		//WebElement payments = driver.findElement(By.linkText("Payments"));
		//payments.click();
		SupplierCompanySettingsPage_PaymentsIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void InvoicingIconClick() {
		WebElement invoicing = driver.findElement(By.linkText("Invoicing"));
		invoicing.click();
		//SupplierCompanySettingsPage_InvoicingIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void IntegrationIconClick() {
		WebElement integration = driver.findElement(By.linkText("Integration"));
		integration.click();
		//SupplierCompanySettingsPage_IntegrationIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void SubscriptionIconClick() {
		WebElement subscription = driver.findElement(By.linkText("Subscription"));
		subscription.click();
		//SupplierCompanySettingsPage_SubscriptionIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void ViewPricingoptionsClick() {
		WebElement viewPricingOptions = driver.findElement(By.linkText("View pricing options"));
		viewPricingOptions.click();
		//SupplierCompanySettingsPage_ViewPricingOptions.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
