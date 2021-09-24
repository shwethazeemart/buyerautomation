package pageObjects;
//testing purpose

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

/**
 * 
 * @author AjanthanSivalingarajah
 * @since 2020/05/12
 *
 */
public class LogInPage {
	private static WebDriver driver;

	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(how = How.NAME, using = "loginEmail")
	private static WebElement txtbx_loginEmail;


	@FindBy(how = How.NAME, using = "wrongPassword")
	private WebElement txtbx_wrongPassword;*/
 
	@FindBy(xpath = "//input[contains(@name,'loginEmail')]")
	private static WebElement btn_loginEmail;
	

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement btn_wrongPassword;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private static WebElement btn_loginpassword;

	/*@FindBy(xpath = "//div[@class='form-group']//button[text()='Log in']")
	private static WebElement btn_loginbtn;*/
    
	@FindBy(xpath ="//button[text()='Log in']")
	private static WebElement btn_loginbtn;
	
	
	@FindBy(xpath = "//input[contains(@name,'loginEmail')]")
	private static WebElement LogInPage_Entercorrectusername;
	

	@FindBy(xpath = "//input[@placeholder='Password']")
	private static WebElement LogInPage_Entercorrectpassword;
	 
	@FindBy(xpath ="//button[text()='Log in']")
	private static WebElement LogInPage_Loginbutton;
	
	
	public String getPageTitle() {
		return driver.getTitle();   
	}

	public static void navigateTo_LogInPage1() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}
	public static void navigateTo_LogInPage2() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
	}
	
	public static void navigateTo_LogInPage3() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}

	/*public static void enter_LoginEmail(String email) {
		btn_loginEmail.sendKeys(email); 
	}*/
	 
	public void enter_wrongPassword(String wrongPassword) {
		btn_wrongPassword.sendKeys(wrongPassword);
	}

	public static void click_LoginBtn() throws InterruptedException {
		btn_loginbtn.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	/*public void click_LoginBtnadmin() throws InterruptedException {
		btn_loginbtn.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}*/

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));
	}

	public void enter_correctPassword(String loginPassword) {
		// TODO Auto-generated method stub
		
	}

	public void enter_validEmailAddress(String validEmail) {
		// TODO Auto-generated method stub
		
	}

	public static void enter_Password(String password) {
		// TODO Auto-generated method stub
		
	}

	public static void enter_loginpassword(String loginpassword) {
		btn_loginpassword.sendKeys(loginpassword);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void enter_loginEmail(String loginEmail) {
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		btn_loginEmail.sendKeys(loginEmail);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		 
	}

	public static void Entercorrcectusername(String loginEmail) {
		LogInPage_Entercorrectusername.sendKeys(loginEmail);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Entercorrectpassword(String loginPassword) {
		LogInPage_Entercorrectpassword.sendKeys(loginPassword);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clickloginbutton() throws InterruptedException {
		Thread.sleep(5000);
		LogInPage_Loginbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	

	

	
}