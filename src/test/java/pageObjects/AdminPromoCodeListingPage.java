package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminPromoCodeListingPage {

	    private static WebDriver driver;
	
			
		public AdminPromoCodeListingPage(WebDriver driver) 
		{
			AdminPromoCodeListingPage.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public static void navigateTo_LogInPage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
		}

		public void isTosterMessageFound(String msg) {
			WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

		}

		@FindBy(xpath = "//a[text()=' Promo codes ']")
		private static WebElement AdminPromoCodeListingPage_PromocodesTab;

		@FindBy(xpath = "//input[@placeholder='Search code']")
		private static WebElement AdminPromoCodeListingPage_SearchCode;
		
		@FindBy(xpath = "//select[@formcontrolname='status']")
		private static WebElement AdminPromoCodeListingPage_Status;
		
		@FindBy(xpath = "//button[text()='Search']")
		private static WebElement AdminPromoCodeListingPage_SearchIcon;

		@FindBy(xpath = "(//a[@class='zmdropDownBtn'])[1]")
		private static WebElement AdminPromoCodeListingPage_Actions;

		@FindBy(xpath = "//input[@formcontrolname='promoCode']")
		private static WebElement AdminPromoCodeListingPage_ViewPromocode;

		@FindBy(xpath = "//button[text()='Save']")
		private static WebElement AdminPromoCodeListingPage_Save;
		
		@FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
		private static WebElement AdminPromoCodeListingPage_ViewDetails;

		@FindBy(xpath = "//p[text()='Promo codes']")
		private static WebElement AdminPromoCodeListingPage_BackToPromocodes;

		@FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
		private static WebElement AdminPromoCodeListingPage_EndPromo;
		
		@FindBy(xpath = "//button[@class='close']//img[1]")
		private static WebElement AdminPromoCodeListingPage_CloseIcon;

		
		public static void ClickPromocodesTab() {
			AdminPromoCodeListingPage_PromocodesTab.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
	
		}
		public static void ClickSearchCode() {
			AdminPromoCodeListingPage_SearchCode.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void EnterSearchCode(String code) {
			AdminPromoCodeListingPage_SearchCode.sendKeys(code);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}
		
		public static void clickStatus() {
			AdminPromoCodeListingPage_Status.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
		public static WebElement getDropDownstatusElement() {
			return AdminPromoCodeListingPage_Status;
		}
		
		public static void SelectcalendaValidity() {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)");
			WebElement DateBox=driver.findElement(By.xpath("//input[@placeholder='Validity period']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].value='1 Feb 2022';", DateBox);

		}
		
		public static void ClicktheSearchIcon() {
			AdminPromoCodeListingPage_SearchIcon.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		
			public static void clickActionsDropdown() {
			AdminPromoCodeListingPage_Actions.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public static WebElement getDropDownActionsElement() {
			return AdminPromoCodeListingPage_Actions;
		}

		public static void ViewPromocode(String promocode) {
			AdminPromoCodeListingPage_ViewPromocode.sendKeys(promocode);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickSaveBtn() {
			AdminPromoCodeListingPage_Save.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public static void ViewDetailsClick() {
			AdminPromoCodeListingPage_ViewDetails.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void BackToPromocodes() {
			AdminPromoCodeListingPage_BackToPromocodes.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickEndPromo() {
			AdminPromoCodeListingPage_EndPromo.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickCloseIcon() {
			AdminPromoCodeListingPage_CloseIcon.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		

		
		
		
		
		}		
		
		

