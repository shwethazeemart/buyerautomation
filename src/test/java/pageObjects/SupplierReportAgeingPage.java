package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierReportAgeingPage {


	private static WebDriver driver;

	public SupplierReportAgeingPage(WebDriver driver) {


		SupplierReportAgeingPage.driver = driver;
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
	//private static WebElement SupplierReportAgeingPage_AgeingReceviables;

	@FindBy(xpath = "//button[text()='Update ']")
	private static WebElement SupplierReportAgeingPage_UpdateButton;

	@FindBy(xpath = "//button[text()='Export']")
	private static WebElement SupplierReportAgeingPage_ExportButton;

	@FindBy(xpath = "(//div[contains(@class,'datatable-body-cell-label')])[8]")
	private static WebElement SupplierReportAgeingPage_FirstCompany;

	@FindBy(xpath = "//select[@formcontrolname='currentOutletId']")
	private static WebElement SupplierReportAgeingPage_SelectOutlet;
	
	@FindBy(xpath = "(//div[contains(@class,'datatable-body-cell-label')])[11]")
	private static WebElement SupplierReportAgeingPage_FirstInvoice;






	public static void AgeingReceviablesClick() {
		WebElement ageingReceivablesSeeHow = driver.findElement(By.className("aquaBox"));
		ageingReceivablesSeeHow.click();
		//SupplierReportAgeingPage_AgeingReceviables.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void UpdateButtonClick() {
		SupplierReportAgeingPage_UpdateButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void ExportButtonClick() {
		SupplierReportAgeingPage_ExportButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void FirstCompanyClick() {
		SupplierReportAgeingPage_FirstCompany.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void SelectOutletDropdownList() throws InterruptedException {
		Thread.sleep(5000);
		SupplierReportAgeingPage_SelectOutlet.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementOutlet() {
		return SupplierReportAgeingPage_SelectOutlet;
	}

	public static void FirstInvoiceClick() {
		SupplierReportAgeingPage_FirstInvoice.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}




















}
