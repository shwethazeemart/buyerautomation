package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminSupplierEditDirectorypage {

	
	private static WebDriver driver; 

	public AdminSupplierEditDirectorypage(WebDriver driver) {


		AdminSupplierEditDirectorypage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}
	
	@FindBy(xpath = "//a[contains(text(),'Edit Directory settings')] ")
	private static WebElement AdminSupplierEditDirectorypage_DirectorySetting;
	
	@FindBy(xpath = "//button[contains(text(),' Manage products')] ")
	private static WebElement AdminSupplierEditDirectorypage_ManageProduct;
	
	@FindBy(xpath = "//input[contains(@id,'inlineFormInputGroupUsername')]")
	private static WebElement AdminSupplierEditDirectorypage_EnterSupplierName;
	
	@FindBy(xpath = "//button[contains(text(),' Search')] ")
	private static WebElement AdminSupplierEditDirectorypage_SearchIcon;
	
	@FindBy(xpath = "//input[contains(@id,'inlineFormInputGroupUsername')]")
	private static WebElement AdminSupplierEditDirectorypage_SupplierName;
	
	//@FindBy(xpath = "//select[contains(@formcontrolname,'inDirectory')]")
	//private static WebElement AdminSupplierEditDirectorypage_SelectListed;
	
	//@FindBy(xpath = "//select[contains(@formcontrolname,'inDirectory')]")
	//private static WebElement AdminSupplierEditDirectorypage_SelectUnlisted;
	
	//@FindBy(xpath = "//select[contains(@formcontrolname,'inDirectory')]")
	//private static WebElement AdminSupplierEditDirectorypage_SelectAllSku;
	
	@FindBy(xpath = "(//a[@class='zmdropDownBtn'])[1]")
	private static WebElement AdminSupplierEditDirectorypage_ActionsDropdown;
	
	@FindBy(xpath = "//a[contains(text(),'Unlist')]")
	private static WebElement AdminSupplierEditDirectorypage_UnlistLink;
	
	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	private static WebElement AdminSupplierEditDirectorypage_EditLink;
	
	@FindBy(xpath = "//input[contains(@name,'supplierProductCode')]")
	private static WebElement AdminSupplierEditDirectorypage_ProductCode;
	
	@FindBy(xpath = "//input[contains(@name,'supplierProductCode')]")
	private static WebElement AdminSupplierEditDirectorypage_EnterProductCode;
	
	@FindBy(xpath = "//button[contains(text(),'Done & update in catalogue')]")
	private static WebElement AdminSupplierEditDirectorypage_DoneandUpdateButton;
	
	
	

	public static void editDirectoryClick() {
		AdminSupplierEditDirectorypage_DirectorySetting.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void manageProductsClick() {
		AdminSupplierEditDirectorypage_ManageProduct.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void enterSupplierName(String searchname) {
		AdminSupplierEditDirectorypage_EnterSupplierName.sendKeys(searchname); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void searchIconClick() throws InterruptedException {
		Thread.sleep(7000);
		AdminSupplierEditDirectorypage_SearchIcon.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void supplierNameClear() {
		AdminSupplierEditDirectorypage_SupplierName.clear(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	
	public static void selectListedValue() throws InterruptedException {
		//AdminSupplierEditDirectorypage_SelectListed.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[contains(@formcontrolname,'inDirectory')]")).click();
		List<WebElement> list =driver.findElements(By.xpath("//select[contains(@formcontrolname,'inDirectory')]/option"));

		
        System.out.println("Total number of item  : "+list.size() );
        int s=list.size();
        //Thread.sleep(5000);
        for(int i=0; i<s; i++){
        	if(list.get(i).getText().equalsIgnoreCase("Listed")){
        		System.out.println(list.get(i).getText()); 
        		list.get(i).click();
        		break;
        	}
        }
	}
	
	
	public static void selectUnlistedValue() throws InterruptedException {
		//AdminSupplierEditDirectorypage_SelectUnlisted.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//select[contains(@formcontrolname,'inDirectory')]")).click();
		List<WebElement> list =driver.findElements(By.xpath("//select[contains(@formcontrolname,'inDirectory')]/option"));

		
        System.out.println("Total number of item  : "+list.size() );
        int s=list.size();
        //Thread.sleep(5000);
        for(int i=0; i<s; i++){
        	if(list.get(i).getText().equalsIgnoreCase("Unlisted")){
        		System.out.println(list.get(i).getText()); 
        		list.get(i).click();
        		break;
        	}
        }
	}		
	
	
	public static void selectAllSkusValue() throws InterruptedException {
		//AdminSupplierEditDirectorypage_SelectAllSku.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//select[contains(@formcontrolname,'inDirectory')]")).click();
		List<WebElement> list =driver.findElements(By.xpath("//select[contains(@formcontrolname,'inDirectory')]/option"));

		
        System.out.println("Total number of item  : "+list.size() );
        int s=list.size();
        //Thread.sleep(5000);
        for(int i=0; i<s; i++){
        	if(list.get(i).getText().equalsIgnoreCase("AllSKUs")){
        		System.out.println(list.get(i).getText()); 
        		list.get(i).click();
        		break;
        	}
        }
	}

	public static void actionsDropdownClick() {
		AdminSupplierEditDirectorypage_ActionsDropdown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void unlistIconClick() {
		AdminSupplierEditDirectorypage_UnlistLink.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void editLinkClick() {
		AdminSupplierEditDirectorypage_EditLink.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void productCodeClear() {
		AdminSupplierEditDirectorypage_ProductCode.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void enterProductCode(String productcode) {
		AdminSupplierEditDirectorypage_EnterProductCode.sendKeys(productcode);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void doneandupdateCatalogueClick() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");
		AdminSupplierEditDirectorypage_DoneandUpdateButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
