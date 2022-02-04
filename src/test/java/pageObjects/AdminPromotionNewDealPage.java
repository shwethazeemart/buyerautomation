package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminPromotionNewDealPage {

	private static WebDriver driver;

	public AdminPromotionNewDealPage(WebDriver driver) {


		AdminPromotionNewDealPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}


	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_NewDeal;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_Supplier;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_EntertheTitle;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_EntertheDescription;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_CarouselBanner;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_SaveCarouselBanner;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_LandingBanner;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_SaveLandingBanner;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_ValueMinimumOrder;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_Radiobutton;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_CutOffTime;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_Applyfee;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_CheckBoxMonday;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_EnterCutOfftime;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_TimeField;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_SetButton;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_WednesdayCheckbox;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_WednesdayCutOff;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_WedTimeField;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_WedSetBtn;
	
	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_FridayCheckbox;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_FridayCutOffTime;
	
	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_FridayTimeField;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_FridaySetButton;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_AllOutletsRadioBtn;

	@FindBy(xpath = "//a[text()=' Deals ']")
	private static WebElement AdminPromotionListingPage_ByEmail;

	public static void ClickNewDeal() {
		AdminPromotionListingPage_NewDeal.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static void clickOnSupplierIcon() {
		AdminPromotionListingPage_Supplier.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static WebElement getDropDownSupplierElement() {
		return AdminPromotionListingPage_Supplier;
	}

	public static void EntertheTitle(String Title) {
		AdminPromotionListingPage_EntertheTitle.sendKeys(Title);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void EnterDescription(String Description) {
		AdminPromotionListingPage_EntertheDescription.sendKeys(Description);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void CarouselBannerClick() {
		AdminPromotionListingPage_CarouselBanner.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickOnUploadfile() {
		WebElement uploadBox=driver.findElement(By.xpath("(//input[@class='custom-file-input'])[1]"));
		uploadBox.sendKeys("E://Zeemart//employers-750x300.jpg");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}

	public static void SavetheCarouselBanner() {
		AdminPromotionListingPage_SaveCarouselBanner.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickLandingBanner() {
		AdminPromotionListingPage_LandingBanner.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickOnUploadLandingFile() {
		WebElement uploadBox=driver.findElement(By.xpath("((//input[@class='custom-file-input'])[2]"));
		uploadBox.sendKeys("E://Zeemart//employers-750x300.jpg");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}

	public static void SaveLandingBanner() {
		AdminPromotionListingPage_SaveLandingBanner.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void SelectcalendarByJS() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@placeholder='From']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='1 Feb 2022';", DateBox);


	}
	public static void SelectcalendarByJSendDate() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@placeholder='Until']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='22 Feb 2022';", DateBox);

	}

	public static void EnterValueOfMinimumOrder(String minimumorder) {
		AdminPromotionListingPage_ValueMinimumOrder.sendKeys(minimumorder);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickradiobutton() {
		AdminPromotionListingPage_Radiobutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void CutOffTime(String cutOfftime) {
		AdminPromotionListingPage_CutOffTime.sendKeys(cutOfftime);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void clickOnApplyFee() {
		AdminPromotionListingPage_Applyfee.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownApplyfeeElement() {
		return AdminPromotionListingPage_Applyfee;
	}

	public static void SelectToallOrders() {
		//AdminPromotionListingPage_ToallOrders.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static void CheckboxMonday() {
		AdminPromotionListingPage_CheckBoxMonday.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void EnterCutOfftime(String mondayCutOfftime) {
		AdminPromotionListingPage_EnterCutOfftime.sendKeys();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void ClicktheTimeField() {
		AdminPromotionListingPage_TimeField.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void ClickSetButton() {
		AdminPromotionListingPage_SetButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void WednesdayCheckbox() {
		AdminPromotionListingPage_WednesdayCheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void WednesdayCutOfftime(String wedCutOfftime) {
		AdminPromotionListingPage_WednesdayCutOff.sendKeys();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void ClickTimeFieldWed() {
		AdminPromotionListingPage_WedTimeField.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void ClickWedSetBtn() {
		AdminPromotionListingPage_WedSetBtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void FridayCheckbox() {
		AdminPromotionListingPage_FridayCheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void FridayCutOffTime(String fridayCutOfftime) {
		AdminPromotionListingPage_FridayCutOffTime.sendKeys();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void FridayTimeField() {
		AdminPromotionListingPage_FridayTimeField.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void FridaySetButton() {
		AdminPromotionListingPage_FridaySetButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void RadioBtnofAllOutlets() {
		AdminPromotionListingPage_AllOutletsRadioBtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void EnterByemail(String byemail) {
		AdminPromotionListingPage_ByEmail.sendKeys();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	}
	














