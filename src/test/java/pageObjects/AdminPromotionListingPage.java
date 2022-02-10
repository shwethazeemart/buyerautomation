package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminPromotionListingPage {


		private static WebDriver driver;

		public AdminPromotionListingPage(WebDriver driver) {


			AdminPromotionListingPage.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public static void navigateTo_LogInPage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
		}

		public void isTosterMessageFound(String msg) {
			WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

		}
				
		
		@FindBy(xpath = "//a[text()=' Deals ']")
		private static WebElement AdminPromotionListingPage_Deals;

		@FindBy(xpath = "//input[@placeholder='Search deal']")
		private static WebElement AdminPromotionListingPage_SearchBox;

		@FindBy(xpath = "//input[@placeholder='Search deal']")
		private static WebElement AdminPromotionListingPage_SearchDeal;

		@FindBy(xpath = "//select[@formcontrolname='statuses']")
		private static WebElement AdminPromotionListingPage_SelectStatus;
		
		@FindBy(xpath = "//select[@formcontrolname='supplierId']")
		private static WebElement AdminPromotionListingPage_SupplierDropdown;

		@FindBy(xpath = "//button[text()='Search']")
		private static WebElement AdminPromotionListingPage_SearchIcon;

		@FindBy(xpath = "//a[@class='pull-right export-mclr']")
		private static WebElement AdminPromotionListingPage_OrganiseDeal;

		@FindBy(xpath = "//img[@src='assets/zmcore/img/close-blue.svg']")
		private static WebElement AdminPromotionListingPage_CloseIcon;

		@FindBy(xpath = "//a[@class='zmdropDownBtn']")
		private static WebElement AdminPromotionListingPage_Actions;
		
		@FindBy(xpath = "//button[text()=' New deal ']")
		private static WebElement AdminPromotionListingPage_NewDeal;
		
		@FindBy(xpath = "//p[text()='Promotions']")
		private static WebElement AdminPromotionListingPage_BackButton;
		
		@FindBy(xpath = "//button[text()=' New promo code ']")
		private static WebElement AdminPromotionListingPage_NewPromoCode;
		
		@FindBy(xpath = "//p[text()='Promo codes']")
		private static WebElement AdminPromotionListingPage_PromoCodeBackButton;
		
		public static void ClickonDeals() {
			AdminPromotionListingPage_Deals.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}

		public static void ClickSearchBox() {
			AdminPromotionListingPage_SearchBox.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
					
		}

		public static void EnterSearchDeal(String deal) {
			AdminPromotionListingPage_SearchDeal.sendKeys(deal);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
					
		}
		
		public static void clickOnStatusIcon() {
			AdminPromotionListingPage_SelectStatus.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
		public static WebElement getDropDownStatusElement() {
			return AdminPromotionListingPage_SelectStatus;
}
		
		public static void clickOnSupplierDropdown() {
			AdminPromotionListingPage_SupplierDropdown.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
		public static WebElement getDropDownSupplierElement() {
			return AdminPromotionListingPage_SupplierDropdown;
}

		public static void SearchIconClick() {
			AdminPromotionListingPage_SearchIcon.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickOrganiseDeal() {
			AdminPromotionListingPage_OrganiseDeal.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public static void ClickCloseIcon() {
			AdminPromotionListingPage_CloseIcon.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickActions() {
			AdminPromotionListingPage_Actions.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickNewDeal() {
			AdminPromotionListingPage_NewDeal.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickBackButton() {
			AdminPromotionListingPage_BackButton.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickNewPromoCode() {
			AdminPromotionListingPage_NewPromoCode.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void PromoCodeBackButtonClick() {
			AdminPromotionListingPage_PromoCodeBackButton.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}
		
		
}