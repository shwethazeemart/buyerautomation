package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminNewEssentialsPage {

		private static WebDriver driver;

		public AdminNewEssentialsPage(WebDriver driver) {


			AdminNewEssentialsPage.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public static void navigateTo_LogInPage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
		}

		public void isTosterMessageFound(String msg) {
			WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

		}
		
		@FindBy(xpath = "//button[text()=' New Essentials listing ']")
		private static WebElement AdminNewEssentialsPage_NewEssentialsListing;
		
		@FindBy(xpath = "//button[@type='submit']")
		private static WebElement AdminNewEssentialsPage_NextSKU;
		
		@FindBy(xpath = "(//input[@type='text'])[2]")
		private static WebElement AdminNewEssentialsPage_PriceOptionFieldClear;
		
		@FindBy(xpath = "(//input[@type='text'])[2]")
		private static WebElement AdminNewEssentialsPage_PriceField;
		
		@FindBy(xpath = "//a[contains(@class,'btn btn-success')]")
		private static WebElement AdminNewEssentialsPage_AddToListing;

		public static void ClickNewEssentialsListing() {
			AdminNewEssentialsPage_NewEssentialsListing.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickOnNextSKU() {
			AdminNewEssentialsPage_NextSKU.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClearPriceOptionField() throws InterruptedException {
			Thread.sleep(5000);
			AdminNewEssentialsPage_PriceOptionFieldClear.clear();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void EnterPriceField(String price) throws InterruptedException {
			Thread.sleep(5000);
			AdminNewEssentialsPage_PriceField.sendKeys(price);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickonAddToListing() {
			AdminNewEssentialsPage_AddToListing.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}
		
}
