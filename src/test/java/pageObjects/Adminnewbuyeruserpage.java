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

public class Adminnewbuyeruserpage {

	private static WebDriver driver;

	public Adminnewbuyeruserpage(WebDriver driver) {


		Adminnewbuyeruserpage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}


	@FindBy(xpath = "//button[text()=' Add new user']")
	private static WebElement Adminnewbuyeruserpage_Addnewuser;

	@FindBy(xpath = "(//a[@class='dropdown-item fc-blue'])[1]")
	private static WebElement Adminnewbuyeruserpage_Newbuyeruser;

	@FindBy(xpath = "//input[@formcontrolname='firstName']")
	private static WebElement Adminnewbuyeruserpage_Enterfirstname;

	@FindBy(xpath = "//input[@formcontrolname='lastName']")
	private static WebElement Adminnewbuyeruserpage_Enterlastname;

	@FindBy(xpath = "//input[@formcontrolname='title']")
	private static WebElement Adminnewbuyeruserpage_Enterjobtitle;

	@FindBy(xpath = "//input[@formcontrolname='email']")
	private static WebElement Adminnewbuyeruserpage_EnterEmail;

	@FindBy(xpath = "(//label[contains(@class,'custom-control custom-checkbox')])[1]")
	private static WebElement Adminnewbuyeruserpage_Checkbox;

	@FindBy(xpath = "//input[@formcontrolname='phone']")
	private static WebElement Adminnewbuyeruserpage_Mobilefield;

	@FindBy(xpath = "//input[@formcontrolname='phone']")
	private static WebElement Adminnewbuyeruserpage_Entermobilenumber;

	@FindBy(xpath = "//select[@formcontrolname='roleGroup']")
	private static WebElement Adminnewbuyeruserpage_NewbuyeruserOwner;

	@FindBy(xpath = "//button[text()='Save changes']")
	private static WebElement Adminnewbuyeruserpage_Savechangesbutton;

	@FindBy(xpath = "(//a[contains(@class,'tab ng-star-inserted')])[1]")
	private static WebElement Adminnewbuyeruserpage_Buyersicon;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	private static WebElement Adminnewbuyeruserpage_EnterEmailfield;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	private static WebElement Adminnewbuyeruserpage_Searchbutton;


	public void Clicks_in_Add_new_user_dropdown() {
		Adminnewbuyeruserpage_Addnewuser.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_in_New_Buyer_user() {
		Adminnewbuyeruserpage_Newbuyeruser.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Select_Company() throws InterruptedException {
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("VENKAT MASALA",Keys.ENTER);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Select_Outlet() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("venkatmasala220",Keys.ENTER);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Enter_First_name(String firstname) {
		Adminnewbuyeruserpage_Enterfirstname.sendKeys(firstname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Enter_Last_name(String lastname) {
		Adminnewbuyeruserpage_Enterlastname.sendKeys(lastname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Enter_Job_title(String jobtitle) {
		Adminnewbuyeruserpage_Enterjobtitle.sendKeys(jobtitle);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Enter_Email(String Email) {
		Adminnewbuyeruserpage_EnterEmail.sendKeys(Email);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_checkbox() {
		Adminnewbuyeruserpage_Checkbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public void Clear_Mobile_field() {
		Adminnewbuyeruserpage_Mobilefield.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public void Enter_Mobile_number(String mobilenumber) {
		Adminnewbuyeruserpage_Entermobilenumber.sendKeys(mobilenumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void upload_the_profilephoto() throws InterruptedException {
		WebElement uploadBox=driver.findElement(By.xpath("//input[@name='file']"));
		uploadBox.sendKeys("E:\\Zeemart All\\LIC Bill\\file_example_JPG_5mb.jpg");
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void click_Owner() throws InterruptedException {
		Adminnewbuyeruserpage_NewbuyeruserOwner.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownOwnerElement() {
		return Adminnewbuyeruserpage_NewbuyeruserOwner;
	}

	public void Clicks_Save_changes_button() {
		Adminnewbuyeruserpage_Savechangesbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_Buyers_icon() {
		Adminnewbuyeruserpage_Buyersicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public void Enter_the_Email_in_the_Email_field(String Emailfield) {
		Adminnewbuyeruserpage_EnterEmailfield.sendKeys(Emailfield);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_serach_button() {
		Adminnewbuyeruserpage_Searchbutton.click();
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
