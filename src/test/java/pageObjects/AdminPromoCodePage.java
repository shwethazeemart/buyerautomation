package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminPromoCodePage {

	    private static WebDriver driver;
	
			
		public AdminPromoCodePage(WebDriver driver) 
		{
			AdminPromoCodePage.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public static void navigateTo_LogInPage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
		}

		public void isTosterMessageFound(String msg) {
			WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

		}


		@FindBy(xpath = "//button[text()=' New promo code ']")
		private static WebElement AdminPromoCodePage_PromoCode;

		@FindBy(xpath = "//input[@formcontrolname='promoCode']")
		private static WebElement AdminPromoCodePage_EnterPromoCode;
		
		@FindBy(xpath = "//input[@formcontrolname='title']")
		private static WebElement AdminPromoCodePage_EnterPromoName;

		@FindBy(xpath = "//textarea[@formcontrolname='description']")
		private static WebElement AdminPromoCodePage_EnterPromoDescription;
		
		@FindBy(xpath = "//select[@formcontrolname='applyTo']")
		private static WebElement AdminPromoCodePage_ApplyTo;

		@FindBy(xpath = "//select[@formcontrolname='discountType']")
		private static WebElement AdminPromoCodePage_DiscountType;

		@FindBy(xpath = "//input[@formcontrolname='discountPercentage']")
		private static WebElement AdminPromoCodePage_EnterDiscountPercentage;

		@FindBy(xpath = "//input[@formcontrolname='minOrderAmount']")
		private static WebElement AdminPromoCodePage_EnterMinOrder;

		@FindBy(xpath = "//input[@formcontrolname='noOfUsages']")
		private static WebElement AdminPromoCodePage_EnterOverallQuota;

		@FindBy(xpath = "//button[text()='Save']")
		private static WebElement AdminPromoCodePage_Save;
		

		public static void ClickNewPromoCode() {
			AdminPromoCodePage_PromoCode.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void EnterPromoCode(String promocode) {
			AdminPromoCodePage_EnterPromoCode.sendKeys(promocode);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public static void EnterPromoName(String promoname) {
			AdminPromoCodePage_EnterPromoName.sendKeys(promoname);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public static void EnterPromoDescription(String promodescription) {
			AdminPromoCodePage_EnterPromoDescription.sendKeys(promodescription);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
		
		public static void Click_Profile_Photo() {
			WebElement profilephoto=driver.findElement(By.xpath("//input[@type='file']"));
			profilephoto.sendKeys("E:/Zeemart/download.jpg");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));	
		}

		public static void SelectcalendarFromDate() {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)");
			WebElement DateBox=driver.findElement(By.xpath("//input[@placeholder='Validity period']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].value='1 Feb 2022';", DateBox);

		}
		
		public static void SelectcalendarUntilDate() {
			WebElement DateBox=driver.findElement(By.xpath("//input[@placeholder='Validity period']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].value='9 Feb 2022';", DateBox);

		}		
		
		public static void clickApplyTo() {
			AdminPromoCodePage_ApplyTo.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}		
		public static WebElement getDropDownApplytoElement() {
			return AdminPromoCodePage_ApplyTo;
		}
		
		public static void clickDiscountType() {
			AdminPromoCodePage_DiscountType.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public static WebElement getDropDownDiscountTypeElement() {
			return AdminPromoCodePage_DiscountType;
		}

		public static void EnterDiscountPercentage(String discountpercen) {
			AdminPromoCodePage_EnterDiscountPercentage.sendKeys(discountpercen);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public static void EnterMinOrder(String minorder) {
			AdminPromoCodePage_EnterMinOrder.sendKeys(minorder);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void EnterOverallQuota(String overallquota) {
			AdminPromoCodePage_EnterOverallQuota.sendKeys(overallquota);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClicktheSave() {
			AdminPromoCodePage_Save.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		
		
		

		
		
		
}
