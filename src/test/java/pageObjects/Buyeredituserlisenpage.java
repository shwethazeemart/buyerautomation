package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyeredituserlisenpage {

	private static WebDriver driver;

	public Buyeredituserlisenpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateTo_LogInPage2() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
	}
	public static void navigateTo_Userspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
	}
	
	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));
	}
	

	@FindBy(xpath="(//input[@type='checkbox'])[6]")
	private static WebElement Buyeredituserlisenpage_Checkboxofaruloliuser;
	
	@FindBy(xpath="//button[text()='Delete ']")
	private static WebElement Buyeredituserlisenpage_Deleteicon;
	
	@FindBy(xpath="//button[text()='Delete']")
	private static WebElement Buyeredituserlisenpage_Closedeleteicon;
	

    @FindBy(xpath="(//div[contains(@class,'datatable-body-cell-label')])[26]")
    private static WebElement Buyeredituserlisenpage_Velumanitwouser;
	
	@FindBy(xpath="//input[@formcontrolname='title']")
	private static WebElement Buyeredituserlisenpage_Jobtitle; 
	
	@FindBy(xpath="//input[@formcontrolname='title']")
	private static WebElement Buyeredituserlisenpage_Enterjobtitle;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	private static WebElement Buyeredituserlisenpage_Emailadressfield;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	private static WebElement Buyeredituserlisenpage_EntertheEmail;
	
	@FindBy(xpath="//input[@formcontrolname='phone']")
	private static WebElement Buyeredituserlisenpage_Mobilephonefield;
	
	@FindBy(xpath="//input[@formcontrolname='phone']")
	private static WebElement Buyeredituserlisenpage_Enterthemobilephonenumber;
	
	@FindBy(xpath="//button[text()='Save']")
	private static WebElement Buyeredituserlisenpage_Savebutton;
	
	@FindBy(xpath="//button[text()=' Clear ']")
	private static WebElement Buyeredituserlisenpage_Clearicon;
	
	@FindBy(xpath="//input[@placeholder='Search name']")
	private static WebElement Buyeredituserlisenpage_Searchbox;
	
	@FindBy(xpath="//input[@placeholder='Search name']")
	private static WebElement Buyeredituserlisenpage_Enterthenameinsearchbox;
	
	@FindBy(xpath="//input[@placeholder='Search name']")
	private static WebElement Buyeredituserlisenpage_Searchboxfield; 
	
	
	

	public static void Clickoncheckboxofaruloliuser() {
		Buyeredituserlisenpage_Checkboxofaruloliuser.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickondeleteicon() {
		Buyeredituserlisenpage_Deleteicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clickondeletecloseicon() {
		Buyeredituserlisenpage_Closedeleteicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonvelumanitwouser() {
		Buyeredituserlisenpage_Velumanitwouser.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clearjobtitle() {
		Buyeredituserlisenpage_Jobtitle.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Enterthejobtitle(String title) {
		Buyeredituserlisenpage_Enterjobtitle.sendKeys(title);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ClearEmailfield() {
		Buyeredituserlisenpage_Emailadressfield.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void EntertheEmail(String Email) {
		Buyeredituserlisenpage_EntertheEmail.sendKeys(Email);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clearthemobilephonefield() {
		Buyeredituserlisenpage_Mobilephonefield.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Entermobilephonenumber(String mobilephone) {
		Buyeredituserlisenpage_Enterthemobilephonenumber.sendKeys(mobilephone);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clicksavebutton() {
		Buyeredituserlisenpage_Savebutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickclearicon() {
		Buyeredituserlisenpage_Clearicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clicksearchbox() {
		Buyeredituserlisenpage_Searchbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Enterthenameinsearchbox(String name) {
		Buyeredituserlisenpage_Enterthenameinsearchbox.sendKeys(name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clearsearchboxfield() {
		Buyeredituserlisenpage_Searchboxfield.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	} 
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
