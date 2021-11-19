package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierReportSkuPage {

	private static WebDriver driver;

	public SupplierReportSkuPage(WebDriver driver) {


		SupplierReportSkuPage.driver = driver;
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


	@FindBy(xpath = "(//div[@class='col-4']//div)[3]")
	private static WebElement SupplierReportSkuPage_OrdersReceviedSku;
	
	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	private static WebElement SupplierReportSkuPage_SearchBox;
	
	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	private static WebElement SupplierReportSkuPage_SkuNameEnter;
	
	@FindBy(xpath = "//select[@formcontrolname='currentOutletId']")
	private static WebElement SupplierReportSkuPage_SelectOutlet;
	
	@FindBy(xpath = "//button[text()='Search ']")
	private static WebElement SupplierReportSkuPage_SearchIcon;
	
	@FindBy(xpath = "//button[text()='Export']")
	private static WebElement SupplierReportSkuPage_ExportIcon;
	
	@FindBy(xpath = "(//datatable-body-cell[contains(@class,'datatable-body-cell sort-active ng-star-inserted')])[4]")
	private static WebElement SupplierReportSkuPage_SkuOrder;
	
	@FindBy(xpath = "//label[text()=' bdl ']")
	private static WebElement SupplierReportSkuPage_BdlIcon;
	
	@FindBy(xpath = "//label[text()=' bch ']")
	private static WebElement SupplierReportSkuPage_BchIcon;
	
	@FindBy(xpath = "//label[text()=' blk ']")
	private static WebElement SupplierReportSkuPage_BlkIcon;
	
	@FindBy(xpath = "//label[text()=' box ']")
	private static WebElement SupplierReportSkuPage_BoxIcon;
	
	@FindBy(xpath = "//a[@class='pull-right export-mclr']")
	private static WebElement SupplierReportSkuPage_FilterIcon;
	
	@FindBy(xpath = "//select[@formcontrolname='outletId']")
	private static WebElement SupplierReportSkuPage_SelectOutletTwo;
	
	@FindBy(xpath = "//div[@class='pl-2']//a[1]")
	private static WebElement SupplierReportSkuPage_ExportIconTwo;
	
	@FindBy(xpath = "//button[text()='Apply']")
	private static WebElement SupplierReportSkuPage_ApplyButton;
	
	
	
	
	

	public static void OrdersReceviedSkuClick() {
		SupplierReportSkuPage_OrdersReceviedSku.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void SearchBoxClick() {
		SupplierReportSkuPage_SearchBox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void SkuNameEnter(String skuname) {
		SupplierReportSkuPage_SkuNameEnter.sendKeys(skuname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void SelectDatefromCalendar() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@formcontrolname='invoiceDate']"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].value='1 Nov 2021 - 18 Nov 2021';", DateBox);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	
	
	public static void SelectOutletDropdownList() throws InterruptedException {
		Thread.sleep(5000);
		SupplierReportSkuPage_SelectOutlet.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementOutlet() {
		return SupplierReportSkuPage_SelectOutlet;
	}

	public static void SearchIconClick() throws InterruptedException {
		Thread.sleep(5000);
		SupplierReportSkuPage_SearchIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ExportIconClick() throws InterruptedException {
		Thread.sleep(5000);
		SupplierReportSkuPage_ExportIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void SkuOrderClick() throws InterruptedException {
		Thread.sleep(5000);
		SupplierReportSkuPage_SkuOrder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void BdlClick() {
		SupplierReportSkuPage_BdlIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void BchClick() {
		SupplierReportSkuPage_BchIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void BlkClick() {
		SupplierReportSkuPage_BlkIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void BoxClick() {
		SupplierReportSkuPage_BoxIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void FilterClick() {
		SupplierReportSkuPage_FilterIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	public static void SelectOutletTwoDropdownList() throws InterruptedException {
		Thread.sleep(5000);
		SupplierReportSkuPage_SelectOutletTwo.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementOutletTwo() {
		return SupplierReportSkuPage_SelectOutletTwo;
	}

	public static void ExportIconTwoClick() throws InterruptedException {
		Thread.sleep(5000);
		SupplierReportSkuPage_ExportIconTwo.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ApplyButtonClick() {
		SupplierReportSkuPage_ApplyButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	
	
	
	

	
	
	
}
