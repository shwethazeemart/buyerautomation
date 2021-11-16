package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierCatalogueListPage {

	private static WebDriver driver;

	public SupplierCatalogueListPage(WebDriver driver) {


		SupplierCatalogueListPage.driver = driver;
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


	@FindBy(xpath = "//button[text()=' Clear ']")
	private static WebElement SupplierCatalogueListPage_ClearIcon;
	
	@FindBy(xpath = "//button[text()='Hide from customers']")
	private static WebElement SupplierCatalogueListPage_Hidefromcustomers;
	
	@FindBy(xpath = "//button[text()='Unhide']")
	private static WebElement SupplierCatalogueListPage_Unhide;
	
	@FindBy(xpath = "//button[text()=' Add new SKU ']")
	private static WebElement SupplierCatalogueListPage_AddNewSku;
	
	@FindBy(xpath = "//p[text()='Catalogue']")
	private static WebElement SupplierCatalogueListPage_AddNewSkuBackbutton;
	
	@FindBy(xpath = "//button[text()=' Options ']")
	private static WebElement SupplierCatalogueListPage_Options;
	
	//@FindBy(xpath = "//input[@placeholder='Search location']")
	//private static WebElement SupplierCatalogueListPage_ViewDeletedSKU;
	
	@FindBy(xpath = "//p[text()='Catalogue']")
	private static WebElement SupplierCatalogueListPage_ViewDeletedSKUBackbutton;
	
	//@FindBy(xpath = "//input[@placeholder='Search location']")
	//private static WebElement SupplierCatalogueListPage_UploadCatalogue;
	
	@FindBy(xpath = "//p[text()='Catalogue']")
	private static WebElement SupplierCatalogueListPage_UploadCatalogueBackbutton;
	
	//@FindBy(xpath = "//input[@placeholder='Search location']")
	//private static WebElement SupplierCatalogueListPage_EntireCatalogue;
	
	//@FindBy(xpath = "//input[@placeholder='Search location']")
	//private static WebElement SupplierCatalogueListPage_UploadInventory;
	
	@FindBy(xpath = "//p[text()='Catalogue']")
	private static WebElement SupplierCatalogueListPage_UploadInventoryBackbutton;
	
	@FindBy(xpath = "//img[@src='assets/zmcore/img/filter-blue.svg']")
	private static WebElement SupplierCatalogueListPage_FilterIcon;
	
	@FindBy(xpath = "//button[text()='Deselect all']")
	private static WebElement SupplierCatalogueListPage_Deselect;
	
	@FindBy(xpath = "//button[text()='Select all']")
	private static WebElement SupplierCatalogueListPage_Select;
	
	@FindBy(xpath = "//button[text()=' Apply']")
	private static WebElement SupplierCatalogueListPage_SaveButton;
	
	
	
	
	

	public static void CheckboxClick() {
		WebElement chkFBPersist = driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[2]"));					
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
	
	public static void ClearIconClick() {
		SupplierCatalogueListPage_ClearIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	

	public static void HideFromCustomersClick() throws InterruptedException {
		Thread.sleep(5000);
		SupplierCatalogueListPage_Hidefromcustomers.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void UnhideClick() throws InterruptedException {
		Thread.sleep(5000);
		SupplierCatalogueListPage_Unhide.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void AddNewSkuClick() throws InterruptedException {
		Thread.sleep(5000);
		SupplierCatalogueListPage_AddNewSku.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void AddNewSkuBackbuttonClick() {
		SupplierCatalogueListPage_AddNewSkuBackbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void OptionsClick() throws InterruptedException {
		Thread.sleep(5000);
		SupplierCatalogueListPage_Options.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ViewDeletedSKUClick() {
		WebElement viewDeletedSKUs = driver.findElement(By.linkText("View deleted SKUs"));
		viewDeletedSKUs.click();
		//SupplierCatalogueListPage_ViewDeletedSKU.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void BackbuttonofDeletedSKU() {
		SupplierCatalogueListPage_ViewDeletedSKUBackbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void UploadCatalogueClick() {
		WebElement uploadCatalogue = driver.findElement(By.linkText("Upload catalogue"));
		uploadCatalogue.click();
		//SupplierCatalogueListPage_UploadCatalogue.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void BackbuttonofUploadCatalogueClick() {
		SupplierCatalogueListPage_UploadCatalogueBackbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void EntireCatalogueClick() {
		WebElement downloadEntireCatalogue = driver.findElement(By.linkText("Download entire catalogue"));
		downloadEntireCatalogue.click();
		//SupplierCatalogueListPage_EntireCatalogue.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void UploadInventoryClick() {
		WebElement uploadInventory = driver.findElement(By.linkText("Upload inventory"));
		uploadInventory.click();
		//SupplierCatalogueListPage_UploadInventory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void BackbuttonofUploadInventory() {
		SupplierCatalogueListPage_UploadInventoryBackbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void FilterClick() throws InterruptedException {
		Thread.sleep(5000);
		SupplierCatalogueListPage_FilterIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void DeselectOptionsClick() {
		SupplierCatalogueListPage_Deselect.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void SelectOptionsClick() {
		SupplierCatalogueListPage_Select.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void SaveButtonClick() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, 1000);");
		SupplierCatalogueListPage_SaveButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	

		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
