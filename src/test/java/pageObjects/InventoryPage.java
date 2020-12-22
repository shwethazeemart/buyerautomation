package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class InventoryPage {


	private static WebDriver driver;

	public InventoryPage(WebDriver driver) {


		InventoryPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	public static void navigateTo_invoiceprocesspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}

	@FindBy(xpath = "//div[text()='Murugan Idli Shop, Chennai']")
	private static WebElement btn_outletbtn;


	@FindBy(xpath = "(//a[contains(@class,'tab ng-star-inserted')])[2]")
	private static WebElement btn_Listsbtn;

	@FindBy(xpath = "//div[@class='mt-2 ml-auto']//a[1]")
	private static WebElement btn_Newlistsbtn;

	@FindBy(xpath = "//input[@formcontrolname='shelveName']")
	private static WebElement InventoryPage_listname;

	@FindBy(xpath = "(//button[contains(@class,'btn btn-primary')])[3]")
	private static WebElement InventoryPage_Nextbtn;

	@FindBy(xpath = "(//label[contains(@class,'custom-control custom-checkbox')])[2]")
	private static WebElement InventoryPage_checkbox;

	@FindBy(xpath = "//button[text()='Done']")
	private static WebElement InventoryPage_Donebtn;

	@FindBy(xpath = "//div[text()='lingesh']")
	private static WebElement InventoryPage_lingeshlist;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	private static WebElement InventoryPage_Newstockcountbtn; 

	@FindBy(xpath = "//button[@class='btn btn-success']")
	private static WebElement InventoryPage_Startstockcountbtn; 

	@FindBy(xpath = "//input[@class='form-control ng-star-inserted']")
	private static WebElement InventoryPage_Increasecountedquantitybox; 

	@FindBy(xpath = "//input[@class='form-control ng-star-inserted']")
	private static WebElement InventoryPage_Increasesecondtimecountedquantity; 

	@FindBy(xpath = "//input[@class='form-control ng-star-inserted']")
	private static WebElement InventoryPage_Increasethirdtimecountedquantity;

	@FindBy(xpath = "//input[@class='form-control ng-star-inserted']")
	private static WebElement InventoryPage_Increasefourthtimecountedquantity;

	@FindBy(xpath = "//input[@class='form-control ng-star-inserted']")
	private static WebElement InventoryPage_Increasefifthtimecountedquantity;

	@FindBy(xpath = "//button[text()='Save']")
	private static WebElement InventoryPage_Savebtn;

	@FindBy(xpath = "//button[text()='Save stock count']")
	private static WebElement InventoryPage_Savestockcountbtn;

	@FindBy(xpath = "//button[text()=' Record adjustment ']")
	private static WebElement InventoryPage_Recordadjusmentbtn;

	@FindBy(xpath = "(//select[contains(@class,'custom-select wth100')])[2]")
	private static WebElement InventoryPage_Found;

	@FindBy(xpath = "(//select[contains(@class,'custom-select wth100')])[3]") 
	private static WebElement InventoryPage_ParisianBagutte;

	@FindBy(xpath = "//input[@formcontrolname='itemQty']")
	private static WebElement InventoryPage_valueofquantityboxfield;

	@FindBy(xpath = "//textarea[@formcontrolname='notes']") 
	private static WebElement InventoryPage_Notesfieldlingesh;

	@FindBy(xpath = "//button[contains(@class,'px-4 py-2')]")
	private static WebElement InventoryPage_Finalsavebtn;


	public void Clicks_in_murugan_idli_shop_outlet() throws InterruptedException {
		btn_outletbtn.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks_in_Lists() throws InterruptedException {
		btn_Listsbtn.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_in_New_list() {
		btn_Newlistsbtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void type_the_name_in_list_name(String listname) throws InterruptedException {
		InventoryPage_listname.sendKeys(listname);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_in_next_button() {
		InventoryPage_Nextbtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_the_check_box() {
		InventoryPage_checkbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks_Done_button() {
		InventoryPage_Donebtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks_the_lingesh_list() {
		InventoryPage_lingeshlist.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks_the_New_stock_count() {
		InventoryPage_Newstockcountbtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public void Clicks_the_Start_stock_count_button() {
		InventoryPage_Startstockcountbtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	/*public void Clicks_the_increase_counted_Quantity_of_parisian_Baguetee() {
		InventoryPage_Increasecountedquantity.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));



	}*/

	/*public void Clicks_the_increase_second_time_counted_Quantity_of_parisian_Baguetee() {
		InventoryPage_Increasesecondtimecountedquantity.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));



	}*/

	

	public void Clicks_Save_button() {
		InventoryPage_Savebtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public void Clicks_Save_stock_count_POPUP_button() {
		InventoryPage_Savestockcountbtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public void Click_Record_adjusment_button() {
		InventoryPage_Recordadjusmentbtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static void click_Found() {
		InventoryPage_Found.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownOwnerElement() {
		return InventoryPage_Found;
	}

	public static void click_ParisianBagutte() {
		InventoryPage_ParisianBagutte.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownOwnerElementofitem() {
		return InventoryPage_ParisianBagutte;
	}

	public void type_the_value_of_Quantity_box_field(String Quantity) throws InterruptedException {
		InventoryPage_valueofquantityboxfield.sendKeys(Quantity);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void type_Notes_in_the_Notes_fieldlingesh_found(String Notes) throws InterruptedException {
		InventoryPage_Notesfieldlingesh.sendKeys(Notes);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {   
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_final_Save_button() {
		InventoryPage_Finalsavebtn.click();
		try {
			Thread.sleep(5000); 
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_the_increase_counted_Quantity_of_parisian_Baguetee() {
		//WebElement Category_Display_Order;
		InventoryPage_Increasecountedquantitybox.clear();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(InventoryPage_Increasecountedquantitybox)).clear();;

	}

	public void Clicks_the_increase_second_time_counted_Quantity_of_parisian_Baguetee() {
		InventoryPage_Increasesecondtimecountedquantity.sendKeys("10");
		//WebElement Category_Increase_Value;

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(InventoryPage_Increasesecondtimecountedquantity)).click();

		//Category_Display_Order.clear();
		//Category_Display_Order.sendKeys("1");

		//wait.until(ExpectedConditions.visibilityOf(Category_Increase_Value)).click();


	}	

}
