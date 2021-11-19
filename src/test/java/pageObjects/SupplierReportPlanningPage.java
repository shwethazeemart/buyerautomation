package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierReportPlanningPage {

	private static WebDriver driver;

	public SupplierReportPlanningPage(WebDriver driver) {


		SupplierReportPlanningPage.driver = driver;
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


	@FindBy(xpath = "//div[@class='col-4']//div")
	private static WebElement SupplierReportPlanningPage_SupplyPlanning;
	
	@FindBy(xpath = "//button[text()=' Generate Report']")
	private static WebElement SupplierReportPlanningPage_GenerateReport;
	
	@FindBy(xpath = "//button[text()='Download as CSV']")
	private static WebElement SupplierReportPlanningPage_DownloadasCsv;
	
	@FindBy(xpath = "(//datatable-body-cell[contains(@class,'datatable-body-cell sort-active text_overflow_name ng-star-inserted')])[1]")
	private static WebElement SupplierReportPlanningPage_FirstCode;
	
	@FindBy(xpath = "//input[@formcontrolname='stockQuantity']")
	private static WebElement SupplierReportPlanningPage_StockCount;
	
	@FindBy(xpath = "//input[@formcontrolname='stockQuantity']")
	private static WebElement SupplierReportPlanningPage_StockCountEnter;
	
	@FindBy(xpath = "//button[text()='Save']")
	private static WebElement SupplierReportPlanningPage_SaveButton;
	
	
	
	
	
	

	public static void SupplyPlanningClick() {
		SupplierReportPlanningPage_SupplyPlanning.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void DateSetfromCalendar() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@placeholder='to date']"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].value='27 Nov 2021';", DateBox);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}

	public static void GenerateReportClick() {
		SupplierReportPlanningPage_GenerateReport.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void DownloadasCsvClick() {
		SupplierReportPlanningPage_DownloadasCsv.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void FirstCodeClick() {
		SupplierReportPlanningPage_FirstCode.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void StockCountClear() {
		SupplierReportPlanningPage_StockCount.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void StockCountEnter(String stockcount) {
		SupplierReportPlanningPage_StockCountEnter.sendKeys(stockcount);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void CheckboxClick() {
		WebElement chkFBPersist = driver.findElement(By.xpath("//input[@formcontrolname='isTopUp']"));					
        for (int i=0; i<1; i++) {											
            chkFBPersist.click (); 			
            //System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
        }
	
		
	}

	public static void SaveButtonClick() {
		SupplierReportPlanningPage_SaveButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
}
