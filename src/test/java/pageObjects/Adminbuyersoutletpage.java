package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Adminbuyersoutletpage {

	private static WebDriver driver;

	public Adminbuyersoutletpage(WebDriver driver) {


		Adminbuyersoutletpage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}


	@FindBy(xpath = "//button[text()=' Add new ']")
	private static WebElement Adminbuyersoutletpage_Addnewbdropdown;

	@FindBy(xpath = "(//a[@class='dropdown-item fc-blue'])[1]")
	private static WebElement Adminbuyersoutletpage_NewBuyer;

	//@FindBy(xpath = "//select[@id='companyId']")
	//private static WebElement Adminbuyersoutletpage_VENKATMASALA;

	@FindBy(xpath = "//input[@formcontrolname='name']")
	private static WebElement Adminbuyersoutletpage_EnterOutletname;

	@FindBy(xpath = "//input[@formcontrolname='postal']")
	private static WebElement Adminbuyersoutletpage_Postcode;

	@FindBy(xpath = "//input[@formcontrolname='line1']")
	private static WebElement Adminbuyersoutletpage_EnterAddressLine1;

	@FindBy(xpath = "//input[@formcontrolname='line2']")
	private static WebElement Adminbuyersoutletpage_EnterAddressLine2;

	@FindBy(xpath = "//input[@formcontrolname='email']")
	private static WebElement Adminbuyersoutletpage_EnteroutletEmail;
	
	@FindBy(xpath = "//input[@formcontrolname='phone']")
	private static WebElement Adminbuyersoutletpage_ClearMobilenumber;

	@FindBy(xpath = "//input[@formcontrolname='phone']")
	private static WebElement Adminbuyersoutletpage_Mobilenumber;

	@FindBy(xpath = "//select[@formcontrolname='businessType']")
	private static WebElement Adminbuyersoutletpage_FineDining;

	@FindBy(xpath = "(//label[contains(@class,'custom-control custom-checkbox')])[1]")
	private static WebElement Adminbuyersoutletpage_American;

	@FindBy(xpath = "(//label[contains(@class,'custom-control custom-checkbox')])[3]")
	private static WebElement Adminbuyersoutletpage_Bakery;

	@FindBy(xpath = "(//label[contains(@class,'custom-control custom-checkbox')])[5]")
	private static WebElement Adminbuyersoutletpage_BBQ;

	@FindBy(xpath = "(//div[@class='mb-2 col-md-6 ng-star-inserted'])[25]")
	private static WebElement Adminbuyersoutletpage_Peranakan;

	@FindBy(xpath = "(//div[@class='mb-2 col-md-6 ng-star-inserted'])[27]")
	private static WebElement Adminbuyersoutletpage_SaladHealthy;

	@FindBy(xpath = "(//div[@class='mb-2 col-md-6 ng-star-inserted'])[33]")
	private static WebElement Adminbuyersoutletpage_Vegetarian;

	@FindBy(xpath = "(//div[@class='mb-2 col-md-6 ng-star-inserted'])[35]")
	private static WebElement Adminbuyersoutletpage_Halal;

	@FindBy(xpath = "(//div[@class='mb-2 col-md-6 ng-star-inserted'])[37]")
	private static WebElement Adminbuyersoutletpage_Vegetarianfriendly;

	//@FindBy(xpath = "//input[@formcontrolname='name']")
	//private static WebElement Adminbuyersoutletpage_Tagfield;

	@FindBy(xpath = "//a[@class='text-primary mr-5']")
	private static WebElement Adminbuyersoutletpage_Saveoutlet;

	@FindBy(xpath = "//a[@class='tab active']")
	private static WebElement Adminbuyersoutletpage_Outletsicon;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	private static WebElement Adminbuyersoutletpage_Enteroutlet;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private static WebElement Adminbuyersoutletpage_Searchbutton;




	public void Clicks_in_Add_new_by_dropdown() {
		Adminbuyersoutletpage_Addnewbdropdown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_in_New_Buyer() {
		Adminbuyersoutletpage_NewBuyer.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	/*public static void click_VENKATMASALA() {
		Adminbuyersoutletpage_VENKATMASALA.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownOwnerElement() {
		return Adminbuyersoutletpage_VENKATMASALA;
	}*/




	public static void Select_Company() throws InterruptedException {
		driver.findElement(By.xpath("//select[@id='companyId']")).sendKeys("VENKATMASALA",Keys.ENTER);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Enter_Outlet_name(String outletname) {
		Adminbuyersoutletpage_EnterOutletname.sendKeys(outletname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}


	public void Enter_Post_code(String postcode) {
		Adminbuyersoutletpage_Postcode.sendKeys(postcode);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Enter_Address_Line1(String addressline1) {
		Adminbuyersoutletpage_EnterAddressLine1.sendKeys(addressline1);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public void Enter_Address_Line2(String addressline2) {
		Adminbuyersoutletpage_EnterAddressLine2.sendKeys(addressline2);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void upload_the_image() throws InterruptedException {
		WebElement uploadBox=driver.findElement(By.xpath("//input[@name='file[]']"));
		uploadBox.sendKeys("E:\\Zeemart All\\LIC Bill\\file_example_JPG_5mb.jpg");
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Enter_outlet_Email(String outletEmail) {
		Adminbuyersoutletpage_EnteroutletEmail.sendKeys(outletEmail);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clear_the_Mobile_number_field() {
		Adminbuyersoutletpage_ClearMobilenumber.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Enter_the_Mobile_number(String mobilenumber) {
		Adminbuyersoutletpage_Mobilenumber.sendKeys(mobilenumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Select_Timezone() throws InterruptedException {
		driver.findElement(By.xpath("//select[@id='timeZone']")).sendKeys("(GMT+08:00)Asia/Singapore",Keys.ENTER);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void click_FineDining() {
		Adminbuyersoutletpage_FineDining.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownOwnerElement() {
		return Adminbuyersoutletpage_FineDining;
	}

	public void checkbox_of_American_type_of_cuisine() {
		Adminbuyersoutletpage_American.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void checkbox_of_Bakery_type_of_cuisine() {
		Adminbuyersoutletpage_Bakery.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void checkbox_of_BBQ_type_of_cuisine() {
		Adminbuyersoutletpage_BBQ.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void checkbox_of_Peranakan_other_cuisine_type() {
		Adminbuyersoutletpage_Peranakan.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void checkbox_of_Salad_Healthy_other_cuisine_type() {
		Adminbuyersoutletpage_SaladHealthy.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void checkbox_of_Vegetarian_other_cuisine_type() {
		Adminbuyersoutletpage_Vegetarian.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void checkbox_of_Halal_other_features() {
		Adminbuyersoutletpage_Halal.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void checkbox_of_Vegetarian_friendly_other_features() {
		Adminbuyersoutletpage_Vegetarianfriendly.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Tag_field() {
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys("Velu",Keys.ENTER);
		/*Adminbuyersoutletpage_Tagfield.sendKeys(tagname);*/
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Save_outlet_only_button() {
		Adminbuyersoutletpage_Saveoutlet.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks_outlets_icon() {
		Adminbuyersoutletpage_Outletsicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}


	public void Enter_the_outlet_in_serach_outlet_box_venkatmasal20(String outlet) {
		Adminbuyersoutletpage_Enteroutlet.sendKeys(outlet);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_serach_button() {
		Adminbuyersoutletpage_Searchbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
 
	public static String getPageTitle() {
		return driver.getTitle();   
	}

	
}

















































