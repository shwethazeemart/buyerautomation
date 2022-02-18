package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminBuyersEditDetailsPage {

		private static WebDriver driver;

		public AdminBuyersEditDetailsPage(WebDriver driver) {


			AdminBuyersEditDetailsPage.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public static void navigateTo_LogInPage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
		}

		public void isTosterMessageFound(String msg) {
			WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

		}

		@FindBy(xpath = "//div[@class='zmDropDown']//a[1]")
		private static WebElement AdminBuyersEditDetailsPage_EditDetails;
		
		@FindBy(xpath = "//input[@formcontrolname='email']")
		private static WebElement AdminBuyersEditDetailsPage_ClearOutletEmail;
		
		@FindBy(xpath = "//div[@role='combobox']//input[1]")
		private static WebElement AdminBuyersEditDetailsPage_Tags;
		
		@FindBy(xpath = "//div[@role='combobox']//input[1]")
		private static WebElement AdminBuyersEditDetailsPage_EnterTags;

		public static void ClickOnEditDetails() throws InterruptedException {
			AdminBuyersEditDetailsPage_EditDetails.click();
			Thread.sleep(5000);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClearOnOutletEmail() throws InterruptedException {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1250)");
			AdminBuyersEditDetailsPage_ClearOutletEmail.clear();
					try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickOnTags() throws InterruptedException {
			//AdminBuyersEditDetailsPage_Tags.click();
			Thread.sleep(5000);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void EnterTags(String tags) {
			//AdminBuyersEditDetailsPage_EnterTags.sendKeys(tags);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}
}
