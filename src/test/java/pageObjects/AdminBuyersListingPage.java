package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminBuyersListingPage {

		private static WebDriver driver;

		public AdminBuyersListingPage(WebDriver driver) {


			AdminBuyersListingPage.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public static void navigateTo_LogInPage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
		}

		public void isTosterMessageFound(String msg) {
			WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

		}
		
		@FindBy(xpath = "//button[text()='Disable']")
		private static WebElement AdminBuyersListingPage_Disable;
		
		@FindBy(xpath = "(//button[@type='button'])[3]")
		private static WebElement AdminBuyersListingPage_ConfirmDisableButton;
		
		@FindBy(xpath = "//button[text()='Enable']")
		private static WebElement AdminBuyersListingPage_Enable;
		
		@FindBy(xpath = "(//button[@type='button'])[3]")
		private static WebElement AdminBuyersListingPage_ConfirmEnableButton;
		
		@FindBy(xpath = "//div[@class='zmDropDown']//a[1]")
		private static WebElement AdminBuyersListingPage_EditDetails;
		
		@FindBy(xpath = "//p[text()='Buyers']")
		private static WebElement AdminBuyersListingPage_BacktoBuyers;
		
		@FindBy(xpath = "(//div[@class='zmDropDown']//a)[2]")
		private static WebElement AdminBuyersListingPage_EditSettings;
		
		@FindBy(xpath = "(//div[@class='zmDropDown']//a)[3]")
		private static WebElement AdminBuyersListingPage_ViewSuppliers;


		public static void ClickOnDisable() {
			AdminBuyersListingPage_Disable.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickOnDisableButton() {
			AdminBuyersListingPage_ConfirmDisableButton.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickOnEnable() {
			AdminBuyersListingPage_Enable.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickOnEnableButton() {
			AdminBuyersListingPage_ConfirmEnableButton.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickOnEditDetails() {
			AdminBuyersListingPage_EditDetails.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickOnBacktoBuyers() {
			AdminBuyersListingPage_BacktoBuyers.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void EditSettings() {
			AdminBuyersListingPage_EditSettings.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickOnViewSuppliers() {
			AdminBuyersListingPage_ViewSuppliers.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}
}
