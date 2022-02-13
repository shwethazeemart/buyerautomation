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

		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminEssentialsPage_Actions;
		
		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminEssentialsPage_ViewSettings;
		
		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminEssentialsPage_SupplierDropdown;
		
		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminEssentialsPage_ShortDescrip;
		
		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminEssentialsPage_Description;
		
		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminEssentialsPage_LandingBanner;
		
		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminEssentialsPage_SaveLandingBanner;
		
		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminEssentialsPage_RebatePercent;
		
		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminEssentialsPage_Carousebanner;
		
		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminEssentialsPage_SaveCarousebanner;
		
		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminEssentialsPage_UpdateSettings;
		
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

			public static void ClickActions() {
				AdminEssentialsPage_Actions.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ViewSettingsClick() {
				AdminEssentialsPage_ViewSettings.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void SupplierDropdownClick() {
				AdminEssentialsPage_SupplierDropdown.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static WebElement getDropDownsupplierElement() {
				return AdminEssentialsPage_SupplierDropdown;
			}

			public static void EnterShortDescrip(String descrip) {
				AdminEssentialsPage_ShortDescrip.sendKeys(descrip);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void EnterDescription(String description) {
				AdminEssentialsPage_Description.sendKeys(description);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ClickLandingBanner() {
				AdminEssentialsPage_LandingBanner.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ClickSaveLandingBanner() {
				AdminEssentialsPage_SaveLandingBanner.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void EnterRebatePercent(String rebate) {
				AdminEssentialsPage_RebatePercent.sendKeys(rebate);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ClickCarousebanner() {
				AdminEssentialsPage_Carousebanner.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ClickSaveCarousebanner() {
				AdminEssentialsPage_SaveCarousebanner.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ClickUpdateSettings() {
				AdminEssentialsPage_UpdateSettings.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}
		    
		    
		    
}
		