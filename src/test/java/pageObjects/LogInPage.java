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
public class LogInPage {
	private final WebDriver driver;

	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(how = How.NAME, using = "loginEmail")
	private WebElement txtbx_loginEmail;


	@FindBy(how = How.NAME, using = "wrongPassword")
	private WebElement txtbx_wrongPassword;*/

	@FindBy(xpath = "//div[@class='form-group']//input")
	private WebElement btn_loginEmail;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement btn_wrongPassword;

	@FindBy(xpath = "//div[@class='form-group']//button[text()='Log in']")
	private WebElement btn_loginbtn;

	public String getPageTitle() {
		return driver.getTitle();   
	}

	public void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	public void enter_LoginEmail(String email) {
		btn_loginEmail.sendKeys(email);
	}
	
	public void enter_wrongPassword(String wrongPassword) {
		btn_wrongPassword.sendKeys(wrongPassword);
	}

	public void click_LoginBtn() {
		btn_loginbtn.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));
	}

	public void enter_correctPassword(String loginPassword) {
		// TODO Auto-generated method stub
		
	}
}