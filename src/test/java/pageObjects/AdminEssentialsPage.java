package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminEssentialsPage {

		private static WebDriver driver;

		public AdminEssentialsPage(WebDriver driver) {


			AdminEssentialsPage.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public static void navigateTo_LogInPage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
		}

		public void isTosterMessageFound(String msg) {
			WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

		}

		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminEssentialsPage_EssentialsTab;
		
		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminEssentialsPage_SupplierName;

		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminEssentialsPage_Status;
		
		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminEssentialsPage_SearchBtn;

		public static void ClickEssentialsTab() {
			AdminEssentialsPage_EssentialsTab.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void EnterSupplierName(String name) {
			AdminEssentialsPage_SupplierName.sendKeys(name);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		    public static void clickOnStatus() {
			AdminEssentialsPage_Status.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
		    public static WebElement getDropDownStatusElement() {
				return AdminEssentialsPage_Status;
			}

			public static void ClickSearchBtn() {
				AdminEssentialsPage_SearchBtn.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}
		    
		    
		    
}
		