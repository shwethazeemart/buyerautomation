package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierReportOutletPage {

	private static WebDriver driver;

	public SupplierReportOutletPage(WebDriver driver) {


		SupplierReportOutletPage.driver = driver;
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


	@FindBy(xpath = "(//div[@class='col-4']//div)[2]")
	private static WebElement SupplierReportOutletPage_ReceviedOutlet;
	
	@FindBy(xpath = "//a[@class='pull-right export-mclr']")
	private static WebElement SupplierReportOutletPage_FilterIcon;
	
	@FindBy(xpath = "//select[@formcontrolname='companyId']")
	private static WebElement SupplierReportOutletPage_SelectAllCustomer;
	
	@FindBy(xpath = "//select[@formcontrolname='teamId']")
	private static WebElement SupplierReportOutletPage_SelectTeam;
	
	@FindBy(xpath = "//button[text()='Apply']")
	private static WebElement SupplierReportOutletPage_ApplyButton;
	
	@FindBy(xpath = "(//div[contains(@class,'datatable-body-cell-label')])[7]")
	private static WebElement SupplierReportOutletPage_OutletIcon;
	
	@FindBy(xpath = "//div[@class='d-flex']//a[1]")
	private static WebElement SupplierReportOutletPage_ExportButton;
	
	@FindBy(xpath = "//button[text()='Search ']")
	private static WebElement SupplierReportOutletPage_SearchIcon;
	
	
	
	
	

	public static void ReceivedOutletClick() {
		SupplierReportOutletPage_ReceviedOutlet.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void DateSelectfromCalendar() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@formcontrolname='invoiceDate']"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].value='1 Jan 2022 - 31 Jan 2022';", DateBox);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void FilterClick() throws InterruptedException {
		Thread.sleep(5000);
		SupplierReportOutletPage_FilterIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
		
	
	
	public static void SelectAllCustomerDropdownList() throws InterruptedException {
		Thread.sleep(5000);
		SupplierReportOutletPage_SelectAllCustomer.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementAllCustomer() {
		return SupplierReportOutletPage_SelectAllCustomer;
	}
	
	
	public static void SelectTeamDropdownList() throws InterruptedException {
		Thread.sleep(5000);
		SupplierReportOutletPage_SelectTeam.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementTeam() {
		return SupplierReportOutletPage_SelectTeam;
	}

	public static void ApplyButtonClick() {
		SupplierReportOutletPage_ApplyButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void OutletIconClick() {
		SupplierReportOutletPage_OutletIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ExportButtonClick() {
		SupplierReportOutletPage_ExportButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void SearchIconClick() {
		SupplierReportOutletPage_SearchIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
