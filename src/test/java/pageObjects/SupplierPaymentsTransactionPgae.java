package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierPaymentsTransactionPgae {

	private static WebDriver driver;

	public SupplierPaymentsTransactionPgae(WebDriver driver) {


		SupplierPaymentsTransactionPgae.driver = driver;
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


	//@FindBy(xpath = "(//div[@class='col-4']//div)[2]")
	//private static WebElement SupplierPaymentsTransactionPgae_TransactionIcon;
	
	@FindBy(xpath = "//button[text()='Search ']")
	private static WebElement SupplierPaymentsTransactionPgae_SearchButton;
	
	@FindBy(xpath = "//img[@src='./assets/zmcore/img/download-icon.svg']")
	private static WebElement SupplierPaymentsTransactionPgae_ExportButton;
	
	@FindBy(xpath = "(//div[contains(@class,'datatable-body-cell-label')])[2]")
	private static WebElement SupplierPaymentsTransactionPgae_FirstCustomer;
	
	@FindBy(xpath = "//p[text()='Payments']")
	private static WebElement SupplierPaymentsTransactionPgae_BackButton;
	
	
	
	
	
	
	
	

	public static void TransactionIconClick() {
		WebElement transaction = driver.findElement(By.linkText("Transaction"));
		transaction.click();
		//SupplierPaymentsTransactionPgae_TransactionIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void SetDatefromCalendar() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@formcontrolname='transactionDate']"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].value='1 Aug 2021 - 30 Aug 2021';", DateBox);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void SearchButtonClick() {
		SupplierPaymentsTransactionPgae_SearchButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void ExportButtonClick() throws InterruptedException {
		Thread.sleep(5000);
		SupplierPaymentsTransactionPgae_ExportButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void FirstCustomerClick() {
		SupplierPaymentsTransactionPgae_FirstCustomer.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void PaymentsBackButtonClick() {
		SupplierPaymentsTransactionPgae_BackButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
