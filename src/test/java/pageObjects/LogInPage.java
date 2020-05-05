package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class LogInPage {
	private final WebDriver driver;

	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "loginEmail")
	private WebElement txtbx_loginEmail;

	@FindBy(how = How.NAME, using = "loginPassword")
	private WebElement txtbx_loginPassword;

	@FindBy(xpath = "//div[@class='form-group']//button[text()='Log in']")
	private WebElement btn_loginEmail;

	@FindBy(xpath = "//a[@href='/validate-email?userType=BUYER']")
	private WebElement btn_forgotten;

	@FindBy(xpath = "//input[@formcontrolname='name']")
	private WebElement Emailaddress;

	@FindBy(xpath = "//app-validate-email[@class='ng-star-inserted']//div[1]")
	private WebElement btn_Sendreq;

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	public void enter_LoginEmail(String loginEmail) {
		txtbx_loginEmail.sendKeys(loginEmail);
	}

	public void enter_LoginPassword(String loginPassword) {
		txtbx_loginPassword.sendKeys(loginPassword);
	}

	public void click_LoginBtn() {
		btn_loginEmail.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}

		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void click_ForgottenBtn() {
		btn_forgotten.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}

		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void enter_Emailaddress(String loginEmailaddress) {
		Emailaddress.sendKeys(loginEmailaddress);
	}

	public void enter_invalidEmailaddress(String logininvalidEmailaddress) {
		Emailaddress.sendKeys(logininvalidEmailaddress);
	}

	public void enter_validbutunregisteredemail(String loginunregisteredEmailaddress) {
		Emailaddress.sendKeys(loginunregisteredEmailaddress);
	}

	public void click_SendrequestBtn() {
		btn_Sendreq.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}

		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void enter_validregisteredemail(String loginvalidregisteredEmailaddress) {
		Emailaddress.sendKeys(loginvalidregisteredEmailaddress);
	}

}
