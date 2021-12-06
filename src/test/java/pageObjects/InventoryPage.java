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

	public void navigateTo_LogInPage2() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
	}
 
	/*public static void navigateTo_invoiceprocesspage() { 
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false));
	}*/

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}

	@FindBy(xpath = "//div[text()='velu masala2020']")
	private static WebElement btn_outletbtn;


	@FindBy(xpath = "(//div[@class='pl-1']//a)[2]")
	private static WebElement btn_Listsbtn;

	@FindBy(xpath = "//div[@class='mt-2 ml-auto']//a[1]")
	private static WebElement btn_Newlistsbtn;

	@FindBy(xpath = "//input[@formcontrolname='shelveName']")
	private static WebElement InventoryPage_listname;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private static WebElement InventoryPage_Nextbtn;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private static WebElement InventoryPage_checkbox;

	@FindBy(xpath = "//button[text()='Done']")
	private static WebElement InventoryPage_Donebtn;

	@FindBy(xpath = "//div[text()='sairam']")
	private static WebElement InventoryPage_list;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	private static WebElement InventoryPage_Newstockcountbtn; 

	@FindBy(xpath = "//button[text()='Start stock count ']")
	private static WebElement InventoryPage_Startstockcountbtn; 

	@FindBy(xpath = "//input[@type='number']")
	private static WebElement InventoryPage_Increasecountedquantitybox; 

	@FindBy(xpath = "//input[@type='number']")
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

	@FindBy(xpath = "//button[text()=' Adjustment ']")
	private static WebElement InventoryPage_Recordadjusmentbtn;

	@FindBy(xpath = "(//select[contains(@class,'custom-select wth100')])[2]")
	private static WebElement InventoryPage_Found;

	@FindBy(xpath = "(//select[contains(@class,'custom-select wth100')])[3]") 
	private static WebElement InventoryPage_ParisianBagutte;

	@FindBy(xpath = "//input[@formcontrolname='itemQty']")
	private static WebElement InventoryPage_valueofquantityboxfield;

	@FindBy(xpath = "//textarea[@formcontrolname='notes']") 
	private static WebElement InventoryPage_Notesfieldlingesh;

	@FindBy(xpath = "//button[text()='Save ']")
	private static WebElement InventoryPage_Finalsavebtn;


	
	@FindBy(xpath = "//div[text()='velu masala2020']")
	private static WebElement InventoryPage_Velumasala2020_outlets;
	
	@FindBy(xpath = "(//div[@class='pl-1']//a)[3]")
	private static WebElement InventoryPage_Activity_icon;
	 
	@FindBy(xpath = "//span[@class='icon_download']//img[1]")
	private static WebElement InventoryPage_Export_icon;
	
	
	
	@FindBy(xpath = "//div[text()='velu masala2020']")
	private static WebElement InventoryPage_velumasala2020_outlet;
	
	@FindBy(xpath = "//div[contains(@class,'form-group align-self-center')]//a[1]")
	private static WebElement InventoryPage_Add_SKU_button;
	
	@FindBy(xpath = "//select[@class='custom-select float-left']")
	private static WebElement InventoryPage_click_Invetorylist;
	
	@FindBy(xpath = "(//label[contains(@class, 'custom-control custom-checkbox custom_control_small_txt zmart')])[6]")
	private static WebElement InventoryPage_checkbox_of_pipers_SKU;
	
	@FindBy(xpath = "//button[text()='Done']")
	private static WebElement InventoryPage_Done_button;
	
	@FindBy(xpath = "//select[@formcontrolname='reason']")
	private static WebElement InventoryPage_Inventoryreasonmissing;
	
	@FindBy(xpath = "//select[@formcontrolname='reason']")
	private static WebElement InventoryPage_Inventoryreasonpromotion;
	
	@FindBy(xpath = "//select[@formcontrolname='reason']")
	private static WebElement InventoryPage_Inventoryreasontransferin;
	
	@FindBy(xpath = "//select[@formcontrolname='reason']")
	private static WebElement InventoryPage_Inventoryreasontransferout;
	
	@FindBy(xpath = "//div[text()='vsla']")
	private static WebElement InventoryPage_vslalist;
	
	 
	

	public void Clicks_in_Lists() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, -250);");
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

	public void Click_Record_adjusment_button() throws InterruptedException {
		Thread.sleep(5000);
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
		
	}

	public void Clicks_the_increase_second_time_counted_Quantity_of_parisian_Baguetee() {
		InventoryPage_Increasesecondtimecountedquantity.sendKeys("10");
		//WebElement Category_Increase_Value;

		
		//Category_Display_Order.clear();
		//Category_Display_Order.sendKeys("1");

		//wait.until(ExpectedConditions.visibilityOf(Category_Increase_Value)).click();


	}

	public void Clicks_outlet() throws InterruptedException {
		btn_outletbtn.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_the_list() {
		InventoryPage_list.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void clicks_on_the_Cavenagh4_outlets() throws InterruptedException {
		InventoryPage_Velumasala2020_outlets.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}

	public void clicks_on_the_Activity_icon() throws InterruptedException {
		InventoryPage_Activity_icon.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void clicks_on_the_Export_icon() throws InterruptedException {
		InventoryPage_Export_icon.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}
	
	
	
	

	public void clicks_on_the_velumasala2020_outlet() throws InterruptedException {
		InventoryPage_velumasala2020_outlet.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}

	public void clicks_on_the_Add_SKU_button() throws InterruptedException {
		InventoryPage_Add_SKU_button.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void click_Inventorylist() {
		InventoryPage_click_Invetorylist.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementInventorylist() {
		return InventoryPage_click_Invetorylist;
	}

	public void clicks_on_the_checkbox_of_pipers_SKU() throws InterruptedException {
		InventoryPage_checkbox_of_pipers_SKU.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void clicks_on_the_Done_button() throws InterruptedException {
		InventoryPage_Done_button.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void click_InventoryReasonmissing() {
		InventoryPage_Inventoryreasonmissing.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementInventoryReasonmissing() {
		return InventoryPage_Inventoryreasonmissing;
	}
	
	
	public static void click_InventoryReasonpromotion() {
		InventoryPage_Inventoryreasonpromotion.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementInventoryReasonpromotion() {
		return InventoryPage_Inventoryreasonpromotion;
	}
		
	
	public static void click_InventoryReasontransferin() {
		InventoryPage_Inventoryreasontransferin.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementInventoryReasontransferin() {
		return InventoryPage_Inventoryreasontransferin;
	}
	
	
	
	public static void click_InventoryReasontransferout() {
		InventoryPage_Inventoryreasontransferout.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementInventoryReasontransferout() {
		return InventoryPage_Inventoryreasontransferout;
	}

	public void Clickvslalist() {
		InventoryPage_vslalist.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

		
	}	


