package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminBuyerEditSettingsPage {

		private static WebDriver driver;

		public AdminBuyerEditSettingsPage(WebDriver driver) {


			AdminBuyerEditSettingsPage.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public static void navigateTo_LogInPage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
		}

		public void isTosterMessageFound(String msg) {
			WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

		}

		@FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
		private static WebElement AdminBuyerEditSettingsPage_EditSettings;

		public static void ClickOnEditSettings() throws InterruptedException {
			AdminBuyerEditSettingsPage_EditSettings.click();
			Thread.sleep(5000);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}
}
