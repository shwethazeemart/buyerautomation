package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierReportSalesCustomerPage {
	
		private static WebDriver driver;

		public SupplierReportSalesCustomerPage(WebDriver driver) {
			SupplierReportSalesCustomerPage.driver = driver;
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


		@FindBy(xpath = "(//div[@class='col-4']//div)[5]")
		private static WebElement SupplierReportSalesCustomerPage_SalesCustomer;
		
		@FindBy(xpath = "(//div[@class='col-4']//div)[5]")
		private static WebElement SupplierReportSalesCustomerPage_ClearDate;
		
		@FindBy(xpath = "//div[@class='pl-2']//a[1]")
		private static WebElement SupplierReportSalesCustomerPage_Export;
		

		public static void ClickSalesCustomer() {
			SupplierReportSalesCustomerPage_SalesCustomer.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void SelectDateSalesCustomer() {
			WebElement DateBox=driver.findElement(By.xpath("//input[@formcontrolname='salesReportDate']"));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].value='1 Jan 2021 - 26 May 2022';", DateBox);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClearDate() {
			SupplierReportSalesCustomerPage_ClearDate.clear();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));	
			}

		public static void ClickExport() {
			SupplierReportSalesCustomerPage_Export.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));	
		}
		
}
