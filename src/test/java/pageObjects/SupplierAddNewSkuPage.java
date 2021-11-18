package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierAddNewSkuPage {

	private static WebDriver driver;

	public SupplierAddNewSkuPage(WebDriver driver) {


		SupplierAddNewSkuPage.driver = driver;
		PageFactory.initElements(driver, this);
	} 

	public static void navigateTo_LogInPage3() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}

	public static void navigateTo_invoiceprocesspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}


	@FindBy(xpath = "//input[@formcontrolname='productName']")
	private static WebElement SupplierAddNewSkuPage_SkuNameEnter;
	
	@FindBy(xpath = "//div[text()='No brand selected']/following-sibling::div")
	private static WebElement SupplierAddNewSkuPage_BrandField;
	
	@FindBy(xpath = "(//div[@role='option'])[2]")
	private static WebElement SupplierAddNewSkuPage_BrandOptions;
	
	@FindBy(xpath = "//input[@formcontrolname='supplierProductCode']")
	private static WebElement SupplierAddNewSkuPage_ProductCodeEnter;
	
	@FindBy(xpath = "//select[@formcontrolname='mainCategoryId']")
	private static WebElement SupplierAddNewSkuPage_SelectCategory;
	
	@FindBy(xpath = "//select[@formcontrolname='subCategoryId1']")
	private static WebElement SupplierAddNewSkuPage_SelectSubCategory;
	
	@FindBy(xpath = "//button[text()=' Add unit size']")
	private static WebElement SupplierAddNewSkuPage_AddUnitSize;
	
	@FindBy(xpath = "(//select[@formcontrolname='unitSize'])[2]")
	private static WebElement SupplierAddNewSkuPage_SelectOrder;
	
	@FindBy(xpath = "//input[@formcontrolname='unitQuantity']")
	private static WebElement SupplierAddNewSkuPage_BaseUnitSize;
	
	@FindBy(xpath = "//input[@formcontrolname='unitQuantity']")
	private static WebElement SupplierAddNewSkuPage_BaseUnitSizeEnter;
	
	@FindBy(xpath = "(//select[@formcontrolname='unitSize'])[3]")
	private static WebElement SupplierAddNewSkuPage_SelectOneOrder;
	
	@FindBy(xpath = "(//select[@formcontrolname='unitSize'])[4]")
	private static WebElement SupplierAddNewSkuPage_SelectTwoOrder;
	
	
	@FindBy(xpath = "//a[@class='optional opened']")
	private static WebElement SupplierAddNewSkuPage_OptionalMoreDetails;
	
	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	private static WebElement SupplierAddNewSkuPage_Description;
	
	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	private static WebElement SupplierAddNewSkuPage_DescriptionEnter;
	
	@FindBy(xpath = "//select[@formcontrolname='condition']")
	private static WebElement SupplierAddNewSkuPage_SelectCondition;
	
	@FindBy(xpath = "//input[@formcontrolname='time']")
	private static WebElement SupplierAddNewSkuPage_ShelfLifeEnter;
	
	@FindBy(xpath = "//select[@formcontrolname='duration']")
	private static WebElement SupplierAddNewSkuPage_SelectDays;
	
	@FindBy(xpath = "//select[@formcontrolname='countryOfOrigin']")
	private static WebElement SupplierAddNewSkuPage_SelectCountryOrigin;
	
	@FindBy(xpath = "//input[@formcontrolname='upcEanNumber']")
	private static WebElement SupplierAddNewSkuPage_UpcNumberEnter;
	
	@FindBy(xpath = "//button[text()=' Done & list in catalogue ']")
	private static WebElement SupplierAddNewSkuPage_DoneListButton;
	
	
	
	
	@FindBy(xpath = "//select[@formcontrolname='subCategoryId2']")
	private static WebElement SupplierAddNewSkuPage_SelectSubCategoryTwo;
	
	@FindBy(xpath = "(//input[@formcontrolname='unitQuantity'])[2]")
	private static WebElement SupplierAddNewSkuPage_BaseUnitSizeOne;
	
	@FindBy(xpath = "(//input[@formcontrolname='unitQuantity'])[2]")
	private static WebElement SupplierAddNewSkuPage_BaseUnitSizeOneEnter;
	
	@FindBy(xpath = "(//input[@formcontrolname='unitQuantity'])[3]")
	private static WebElement SupplierAddNewSkuPage_BaseUnitSizeTwo;
	
	@FindBy(xpath = "(//input[@formcontrolname='unitQuantity'])[3]")
	private static WebElement SupplierAddNewSkuPage_BaseUnitSizeTwoEnter;
	
	
	
	
	

	public static void SkuNameEnter(String skuname) {
		SupplierAddNewSkuPage_SkuNameEnter.sendKeys(skuname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void BrandFieldClick() {
		SupplierAddNewSkuPage_BrandField.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void BarndOptionsClick() {
		SupplierAddNewSkuPage_BrandOptions.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ProductCodeEnter(String productcode) {
		SupplierAddNewSkuPage_ProductCodeEnter.sendKeys(productcode);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	
	public static void SelectCategoryDropdownList() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		SupplierAddNewSkuPage_SelectCategory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementCategory() {
		return SupplierAddNewSkuPage_SelectCategory;
	}
	
	
	
	public static void SelectSubCategoryDropdownList() throws InterruptedException {
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		SupplierAddNewSkuPage_SelectSubCategory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementSubCategory() {
		return SupplierAddNewSkuPage_SelectSubCategory;
	}
	
	public static void SelectSubCategoryTwoDropdownList() throws InterruptedException {
		Thread.sleep(5000);
		SupplierAddNewSkuPage_SelectSubCategoryTwo.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementSubCategoryTwo() {
		return SupplierAddNewSkuPage_SelectSubCategoryTwo;
	}

	public static void PhotoUploadClick() throws InterruptedException {
		WebElement uploadphoto=driver.findElement(By.xpath("//input[contains(@name,'file[]')]"));
		uploadphoto.sendKeys("E:\\Zeemart All\\Feature file\\2     750x300 5mb.jpg");
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
		
		
	}

	public static void AddUnitSizeClick() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, 1000);");
		Thread.sleep(5000);
		SupplierAddNewSkuPage_AddUnitSize.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	
	public static void SelectOrderunitsizeDropdownList() {
		SupplierAddNewSkuPage_SelectOrder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementOrderunitsize() {
		return SupplierAddNewSkuPage_SelectOrder;
	}

	public static void BaseUnitSizeClear() {
		SupplierAddNewSkuPage_BaseUnitSize.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void BaseUnitSizeEnter(String unitsize) {
		SupplierAddNewSkuPage_BaseUnitSizeEnter.sendKeys(unitsize);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	
	
	
	public static void SelectOneOrderunitsizeDropdownList() {
		SupplierAddNewSkuPage_SelectOneOrder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementOneOrderunitsize() {
		return SupplierAddNewSkuPage_SelectOneOrder;
	}
	
	public static void SelectTwoOrderunitsizeDropdownList() {
		SupplierAddNewSkuPage_SelectTwoOrder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementTwoOrderunitsize() {
		return SupplierAddNewSkuPage_SelectTwoOrder;
	}

	public static void OptionalMoreDetailsClick() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, 1000);");
	    WebElement optionalAdd = driver.findElement(By.xpath("//div[@formgroupname='directorySettings']/following-sibling::div[1]"));
	    optionalAdd.click();
	    Thread.sleep(5000);
		SupplierAddNewSkuPage_OptionalMoreDetails.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void DescriptionClick() throws InterruptedException {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	    //js.executeScript("window.scrollBy(0, 1000);");
	    Thread.sleep(5000);
		SupplierAddNewSkuPage_Description.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void DescriptionEnter(String description) {
		SupplierAddNewSkuPage_DescriptionEnter.sendKeys(description);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void HalalCheckboxClick() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		WebElement chkFBPersist = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));					
        for (int i=0; i<1; i++) {											
            chkFBPersist.click (); 			
            //System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
        }
		
	}

	public static void VegetarianCheckboxClick() {
		WebElement chkFBPersist = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));					
        for (int i=0; i<1; i++) {											
            chkFBPersist.click (); 			
            //System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
        }
		
	}
	
	
	
	public static void SelectConditionDropdownList() {
		SupplierAddNewSkuPage_SelectCondition.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementCondition() {
		return SupplierAddNewSkuPage_SelectCondition;
	}

	public static void ShelfLifeEnter(String shelflife) {
		SupplierAddNewSkuPage_ShelfLifeEnter.sendKeys(shelflife);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void SelectDaysDropdownList() {
		SupplierAddNewSkuPage_SelectDays.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementDays() {
		return SupplierAddNewSkuPage_SelectDays;
	}
	
	
	public static void SelectCountryOriginDropdownList() {
		SupplierAddNewSkuPage_SelectCountryOrigin.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementCountryOrigin() {
		return SupplierAddNewSkuPage_SelectCountryOrigin;
	}

	public static void UPCNumberEnter(String upcnumber) {
		SupplierAddNewSkuPage_UpcNumberEnter.sendKeys(upcnumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void DoneandListButtonClick() {
		SupplierAddNewSkuPage_DoneListButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void BaseUnitSizeOneEnter(String unitsize) {
		SupplierAddNewSkuPage_BaseUnitSizeOneEnter.sendKeys(unitsize);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void BaseUnitSizeOneClear() {
		SupplierAddNewSkuPage_BaseUnitSizeOne.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void BaseUnitSizeTwoClear() {
		SupplierAddNewSkuPage_BaseUnitSizeTwo.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void BaseUnitSizeTwoEnter(String unitsize) {
		SupplierAddNewSkuPage_BaseUnitSizeTwoEnter.sendKeys(unitsize);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
