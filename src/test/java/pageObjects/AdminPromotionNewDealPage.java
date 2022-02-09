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


	@FindBy(xpath = "//button[text()=' New deal ']")
	private static WebElement AdminPromotionListingPage_NewDeal;

	@FindBy(xpath = "//select[@formcontrolname='supplierId']")
	private static WebElement AdminPromotionListingPage_Supplier;

	@FindBy(xpath = "//input[@formcontrolname='title']")
	private static WebElement AdminPromotionListingPage_EntertheTitle;

	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	private static WebElement AdminPromotionListingPage_EntertheDescription;

	@FindBy(xpath = "//button[text()='Save']")
	private static WebElement AdminPromotionListingPage_SaveCarouselBanner;

	@FindBy(xpath = "//button[text()='Save']")
	private static WebElement AdminPromotionListingPage_SaveLandingBanner;

	@FindBy(xpath = "//input[@formcontrolname='deliveryFeePolicyMinOrderAmount']")
	private static WebElement AdminPromotionListingPage_ValueMinimumOrder;

	@FindBy(xpath = "(//input[@name='deliveryFeePolicyType'])[2]")
	private static WebElement AdminPromotionListingPage_Radiobutton;

	@FindBy(xpath = "//input[@formcontrolname='deliveryFeePolicyFeeAmount']")
	private static WebElement AdminPromotionListingPage_CutOffTime;

	@FindBy(xpath = "//select[@formcontrolname='deliveryFeePolicyCondition']")
	private static WebElement AdminPromotionListingPage_Applyfee;
	
	@FindBy(xpath = "//select[@formcontrolname='deliveryFeePolicyCondition']")
	private static WebElement AdminPromotionListingPage_ToallOrders;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private static WebElement AdminPromotionListingPage_CheckBoxMonday;

	@FindBy(xpath = "(//input[@formcontrolname='days'])[1]")
	private static WebElement AdminPromotionListingPage_EnterCutOfftime;

	@FindBy(xpath = "(//div[@class='d-inline-flex']//input)[3]")
	private static WebElement AdminPromotionListingPage_TimeField;

	@FindBy(xpath = "//span[text()=' Set ']")
	private static WebElement AdminPromotionListingPage_SetButton;

	@FindBy(xpath = "(//input[@formcontrolname='status'])[3]")
	private static WebElement AdminPromotionListingPage_WednesdayCheckbox;

	@FindBy(xpath = "(//input[@formcontrolname='days'])[3]")
	private static WebElement AdminPromotionListingPage_WednesdayCutOff;

	@FindBy(xpath = "(//div[@class='d-inline-flex']//input)[7]")
	private static WebElement AdminPromotionListingPage_WedTimeField;

	@FindBy(xpath = "//span[text()=' Set ']")
	private static WebElement AdminPromotionListingPage_WedSetBtn;
	
	@FindBy(xpath = "(//input[@formcontrolname='status'])[5]")
	private static WebElement AdminPromotionListingPage_FridayCheckbox;

	@FindBy(xpath = "(//input[@formcontrolname='days'])[5]")
	private static WebElement AdminPromotionListingPage_FridayCutOffTime;
	
	@FindBy(xpath = "(//div[@class='d-inline-flex']//input)[11]")
	private static WebElement AdminPromotionListingPage_FridayTimeField;

	@FindBy(xpath = "//span[text()=' Set ']")
	private static WebElement AdminPromotionListingPage_FridaySetButton;

	@FindBy(xpath = "(//input[@formcontrolname='allOutlets'])[1]")
	private static WebElement AdminPromotionListingPage_AllOutletsRadioBtn;

	@FindBy(xpath = "//input[@formcontrolname='notifyEmail']")
	private static WebElement AdminPromotionListingPage_ByEmail;

	@FindBy(xpath = "//div[contains(@class,'form-group col-md-12')]//button[1]")
	private static WebElement AdminPromotionListingPage_NextSKU;
	
	@FindBy(xpath = "//button[text()=' Add SKU ']")
	private static WebElement AdminPromotionListingPage_AddSKU;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private static WebElement AdminPromotionListingPage_FirstCheckbox;
	
	@FindBy(xpath = "(//a[@class='optional'])[1]")
	private static WebElement AdminPromotionListingPage_UOMOptions;
	
	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private static WebElement AdminPromotionListingPage_DealPriceOption;

	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private static WebElement AdminPromotionListingPage_DealPrice;
	
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	private static WebElement AdminPromotionListingPage_OriginalPrice;

	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	private static WebElement AdminPromotionListingPage_MOQOption;
	
	@FindBy(xpath = "(//input[@class='form-control'])[3]")
	private static WebElement AdminPromotionListingPage_MOQField;
	
	@FindBy(xpath = "//input[contains(@class,'form-control ng-pristine')]")
	private static WebElement AdminPromotionListingPage_ShelfLife;

	@FindBy(xpath = "//a[text()=' Save changes ']")
	private static WebElement AdminPromotionListingPage_SaveChanges;


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
		//AdminPromotionListingPage_CarouselBanner.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickOnUploadfile() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		WebElement bannerone=driver.findElement(By.xpath("(//input[@class='custom-file-input'])[1]"));
	    bannerone.click();
		Thread.sleep(5000);
		WebElement uploadBox=driver.findElement(By.xpath("//input[@class='ngx-file-drop__file-input']"));
		uploadBox.sendKeys("E:/Zeemart/employers-750x300.jpg");
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
		//AdminPromotionListingPage_LandingBanner.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	
	public static void ClickOnUploadLandingFile() throws InterruptedException {
		Thread.sleep(5000);
		WebElement bannertwo=driver.findElement(By.xpath("(//input[@class='custom-file-input'])[2]"));
	    bannertwo.click();
		Thread.sleep(5000);
		WebElement uploadBox=driver.findElement(By.xpath("//input[@class='ngx-file-drop__file-input']"));
		uploadBox.sendKeys("E:/Zeemart/employers-750x300.jpg");
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
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		WebElement DateBox=driver.findElement(By.xpath("//input[@formcontrolname='startDate']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='1 Feb 2022';", DateBox);


	}
	public static void SelectcalendarByJSendDate() throws InterruptedException {
		Thread.sleep(5000);
		WebElement DateBoxtwo=driver.findElement(By.xpath("//input[@formcontrolname='endDate']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='22 Feb 2022';", DateBoxtwo);

	}

	public static void EnterValueOfMinimumOrder(String Minimumorder) throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		AdminPromotionListingPage_ValueMinimumOrder.sendKeys(Minimumorder);
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
		AdminPromotionListingPage_ToallOrders.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static void CheckboxMonday() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		AdminPromotionListingPage_CheckBoxMonday.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static void EnterCutOfftime(String MondayCutOfftime) {
		AdminPromotionListingPage_EnterCutOfftime.sendKeys(MondayCutOfftime);
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

	public static void WednesdayCutOfftime(String WedCutOfftime) {
		AdminPromotionListingPage_WednesdayCutOff.sendKeys(WedCutOfftime);
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
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		AdminPromotionListingPage_FridayCheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void FridayCutOffTime(String FridayCutOfftime) {
		AdminPromotionListingPage_FridayCutOffTime.sendKeys(FridayCutOfftime);
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

	public static void EnterByemail(String Byemail) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		AdminPromotionListingPage_ByEmail.sendKeys(Byemail);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClicktheNextSku() {
		//WebElement element = driver.findElement(By.xpath("//form[@class='ng-dirty ng-touched ng-valid']/child::div[2]/child::div/child::div/button[text()=' Next: SKU']"));
		//element.click();
		AdminPromotionListingPage_NextSKU.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickAddSKU() throws InterruptedException {
		Thread.sleep(5000);
		AdminPromotionListingPage_AddSKU.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void FirstCheckbox() {
		AdminPromotionListingPage_FirstCheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickUOMOptions() {
		AdminPromotionListingPage_UOMOptions.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClearBlockField() {
		//AdminPromotionListingPage_BlockField.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClearDealPriceOption() {
		AdminPromotionListingPage_DealPriceOption.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void DealPriceEnter(String dealprice) {
		AdminPromotionListingPage_DealPrice.sendKeys(dealprice);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void OriginalPriceEnter(String originalprice) {
		AdminPromotionListingPage_OriginalPrice.sendKeys(originalprice);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClearMOQOption() {
		AdminPromotionListingPage_MOQOption.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void MOQFieldEnter(String mOQ) {
		AdminPromotionListingPage_MOQField.sendKeys(mOQ);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void EnterShelfLife(String shelflife) {
		AdminPromotionListingPage_ShelfLife.sendKeys(shelflife);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickSaveChanges() {
		AdminPromotionListingPage_SaveChanges.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	
	}
	














