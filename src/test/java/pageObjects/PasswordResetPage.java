package pageObjects;

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
public class PasswordResetPage {
	private static WebDriver driver;

	public PasswordResetPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*public static void navigateTo_LogInPage2() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false));
	}*/
	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));
	}

	@FindBy(xpath = "//a[@href='/validate-email?userType=BUYER']")
	private WebElement link_forgotten;

	@FindBy(xpath = "//input[contains(@name,'loginEmail')]")
	private WebElement btn_validEmail;
	
	@FindBy(xpath = "//input[@formcontrolname='name']")
	private WebElement btn_loginEmail;

	@FindBy(xpath = "//div[@class='forgot_password']//a[1]")
	private WebElement btn_forgottenlink;

	@FindBy(xpath = "//input[contains(@class,'form-control mb-2')]")
	private WebElement txtbx_invalidEmailaddress;


	@FindBy(xpath = "//input[contains(@class,'form-control mb-2')]")
	private WebElement txtbx_unregisteredEmailaddress;


	@FindBy(xpath = "//button[@type='submit']") 
	private WebElement btn_Sendreq;

	

	public void enter_EmailAddress(String email) {
		btn_loginEmail.sendKeys(email);
	}
	public void enter_validEmailAddress(String email) {
		btn_loginEmail.sendKeys(email);
	}
	public String getPageTitle1() {
		return driver.getTitle();  
	}
	public void enter_PasswordResetPage(String invalidEmailaddres) {
		txtbx_invalidEmailaddress.sendKeys(invalidEmailaddres);
	}

	public void enter_PasswordResetPage1(String unregisteredEmailaddress) {
		txtbx_unregisteredEmailaddress.sendKeys(unregisteredEmailaddress);
	}

	public void click_SendRequestBtn() {
		btn_Sendreq.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public void click_ForgottenPasswordLink() {
		link_forgotten.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	
	
}
