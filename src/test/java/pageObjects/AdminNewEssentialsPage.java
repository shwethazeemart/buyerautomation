package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

		@FindBy(xpath = "//a[@href='/sg/pages/suppliers/essentials-list']")
		private static WebElement AdminEssentialsPage_EssentialsTab;
		
}
