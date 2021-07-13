package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Adminnewsupplieruserpage {

	private static WebDriver driver;

	public Adminnewsupplieruserpage(WebDriver driver) {


		Adminnewsupplieruserpage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}
	
	
	@FindBy(xpath = "//button[text()=' Add new user']")
	private static WebElement Adminnewsupplieruserpage_AddNewuserbutton;
	
	@FindBy(xpath = "(//li[@role='menuitem']//a)[2]")
	private static WebElement Adminnewsupplieruserpage_Newsupplieruser;
	
	@FindBy(xpath = "//select[@formcontrolname='supplierId']")
	private static WebElement Adminnewsupplieruserpage_VENKATMASALA;
	
	@FindBy(xpath = "//input[@formcontrolname='firstName']")
	private static WebElement Adminnewsupplieruserpage_EnterFirstname;
	
	@FindBy(xpath = "//input[@formcontrolname='lastName']")
	private static WebElement Adminnewsupplieruserpage_EnterLastname;
	
	@FindBy(xpath = "//input[@formcontrolname='email']")
	private static WebElement Adminnewsupplieruserpage_EnterEmail;
	
	@FindBy(xpath = "//input[@formcontrolname='phone']")
	private static WebElement Adminnewsupplieruserpage_mobilephonefield;
	
	@FindBy(xpath = "//input[@formcontrolname='phone']")
	private static WebElement Adminnewsupplieruserpage_Entermobilenumber;
	
	@FindBy(xpath = "//input[@formcontrolname='title']")
	private static WebElement Adminnewsupplieruserpage_Enterjobtitle;
	
	@FindBy(xpath = "//span[text()=' Save changes ']")
	private static WebElement Adminnewsupplieruserpage_Savechangesbutton;
	
	
	

	public void Clicks_AddNewuserbutton() {
		Adminnewsupplieruserpage_AddNewuserbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Clicks__Newsupplieruser() {
		Adminnewsupplieruserpage_Newsupplieruser.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	public static void click_VenkatMasala() throws InterruptedException {
		Adminnewsupplieruserpage_VENKATMASALA.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownsupplierElement() {
		return Adminnewsupplieruserpage_VENKATMASALA;
	}

	public void Enter_Firstnameinthenewsupplieruserpage(String firstname) {
		Adminnewsupplieruserpage_EnterFirstname.sendKeys(firstname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Enter_Lastnameinthenewsupplieruserpage(String lastname) {
		Adminnewsupplieruserpage_EnterLastname.sendKeys(lastname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Enter_Emailinthenewsupplieruser_page(String Email) {
		Adminnewsupplieruserpage_EnterEmail.sendKeys(Email);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clear_mobilephonefield() {
		Adminnewsupplieruserpage_mobilephonefield.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void Enter_mobilenumber(String mobilenumber) {
		Adminnewsupplieruserpage_Entermobilenumber.sendKeys(mobilenumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Enter_jobtitle(String jobtitle) {
		Adminnewsupplieruserpage_Enterjobtitle.sendKeys(jobtitle);
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

	public void Clicks_Savechangesbutton() {
		Adminnewsupplieruserpage_Savechangesbutton.click();
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
