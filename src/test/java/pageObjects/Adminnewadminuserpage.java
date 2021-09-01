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

public class Adminnewadminuserpage {

	private static WebDriver driver;

	public Adminnewadminuserpage(WebDriver driver) {


		Adminnewadminuserpage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}

	@FindBy(xpath = "//button[text()=' Add new user']")
	private static WebElement Adminnewadminuserpage_AddNewuserbutton;

	@FindBy(xpath = "(//a[@class='dropdown-item fc-blue'])[3]")
	private static WebElement Adminnewadminuserpage_NewAdminuser;

	@FindBy(xpath = "//input[@formcontrolname='firstName']")
	private static WebElement Adminnewadminuserpage_EnterFirstname;

	@FindBy(xpath = "//input[@formcontrolname='lastName']")
	private static WebElement Adminnewadminuserpage_Enterlastname;

	@FindBy(xpath = "//input[@formcontrolname='title']")
	private static WebElement Adminnewadminuserpage_Enterjobtitle;

	@FindBy(xpath = "//input[@formcontrolname='email']")
	private static WebElement Adminnewadminuserpage_EnterEmail;

	@FindBy(xpath = "//input[@formcontrolname='phone']")
	private static WebElement Adminnewadminuserpage_Clearmobilephonefield;

	@FindBy(xpath = "//input[@formcontrolname='phone']")
	private static WebElement Adminnewadminuserpage_Entermobilenumber;

	@FindBy(xpath = "//select[@formcontrolname='language']")
	private static WebElement Adminnewadminuserpage_Selectlanguage;

	@FindBy(xpath = "(//div[@class='c-btn form-control'])[1]")
	private static WebElement Adminnewadminuserpage_Market;

	//@FindBy(xpath = "//label[text()='Singapore']")
	//private static WebElement Adminnewadminuserpage_Singaporemarket;

	@FindBy(xpath = "(//div[@class='c-btn form-control'])[2]")
	private static WebElement Adminnewadminuserpage_Role;

	//@FindBy(xpath = "//label[text()='MANAGE_ORDERS']")
	//private static WebElement Adminnewadminuserpage_Manageordersrole;


	@FindBy(xpath = "//button[text()='Save changes']")
	private static WebElement Adminnewadminuserpage_Savechangesbutton;



	public void Clicks_inAddNewuserbutton() {
		Adminnewadminuserpage_AddNewuserbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_inNewAdminuser() {
		Adminnewadminuserpage_NewAdminuser.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Select_Outlet() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@role='combobox']//input)[1]")).sendKeys("venkatmasala220",Keys.ENTER);
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000); 
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));  

	}

	public static void Select_Supplier() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@role='combobox']//input)[2]")).sendKeys("VENKAT MASALA",Keys.ENTER);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Enter_Firstname(String firstname) {
		Adminnewadminuserpage_EnterFirstname.sendKeys(firstname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Enter_Lastname(String lastname) {
		Adminnewadminuserpage_Enterlastname.sendKeys(lastname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Enter_Jobtitle(String jobtitle) {
		Adminnewadminuserpage_Enterjobtitle.sendKeys(jobtitle);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Enter_Email(String Email) {
		Adminnewadminuserpage_EnterEmail.sendKeys(Email);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public void clear_themobilephonefield() {
		Adminnewadminuserpage_Clearmobilephonefield.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Enter_mobilenumber(String mobilenumber) {
		Adminnewadminuserpage_Entermobilenumber.sendKeys(mobilenumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void upload_the_profilephoto() throws InterruptedException {
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

	public static void click_Language() throws InterruptedException {
		Adminnewadminuserpage_Selectlanguage.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownlanguageElement() {
		return Adminnewadminuserpage_Selectlanguage;
	}


	/*public static void Select_Market() {
		driver.findElement(By.xpath("(//div[@class='c-btn form-control'])[1]")).sendKeys("Singapore",Keys.ENTER);
		//Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}


	public static void Select_Role()  {
		driver.findElement(By.xpath("(//div[@class='c-btn form-control'])[2]")).sendKeys("MANAGE_ORDERS",Keys.ENTER);
		//Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}*/

	public void Clicks_savechangesbutton() throws InterruptedException {
		Adminnewadminuserpage_Savechangesbutton.click();
		Thread.sleep(5000);
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

	public static void Select_Market() {
		//Adminnewadminuserpage_Market.click();
		driver.findElement(By.xpath("(//div[@role='combobox']//input)[3]")).sendKeys("Singapore",Keys.ENTER);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_Singaporemarket() {
		//Adminnewadminuserpage_Singaporemarket.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Select_role() {
		//Adminnewadminuserpage_Role.click();
		driver.findElement(By.xpath("(//div[contains(@role,'combobox')])[4]")).sendKeys("MANAGE_ORDERS",Keys.ENTER);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public void Clicks_manageordersrole() {
		//Adminnewadminuserpage_Manageordersrole.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}




































}
