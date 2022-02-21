package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminBuyerEditSettingsPage {

	private static WebDriver driver;

	public AdminBuyerEditSettingsPage(WebDriver driver) {


		AdminBuyerEditSettingsPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}

	@FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
	private static WebElement AdminBuyerEditSettingsPage_EditSettings;

	@FindBy(xpath = "//input[@id='inlineFormInputGroupUsername']")
	private static WebElement AdminBuyerEditSettingsPage_SearchBox;

	@FindBy(xpath = "//input[@id='inlineFormInputGroupUsername']")
	private static WebElement AdminBuyerEditSettingsPage_EnterSearchBox;

	@FindBy(xpath = "//label[text()='Buyer_ Automated_3-buyerautomated3@gmail.com']")
	private static WebElement AdminBuyerEditSettingsPage_CheckBox;

	@FindBy(xpath = "//h3[text()='Add member']")
	private static WebElement AdminBuyerEditSettingsPage_OutsideSection;

	@FindBy(xpath = "//button[text()=' Save ']")
	private static WebElement AdminBuyerEditSettingsPage_Savebutton;

	public static void ClickOnEditSettings() throws InterruptedException {
		AdminBuyerEditSettingsPage_EditSettings.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickSearchBox() throws InterruptedException {
		AdminBuyerEditSettingsPage_SearchBox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}

	public static void EnterNameSearchbox(String name) {
		AdminBuyerEditSettingsPage_EnterSearchBox.sendKeys(name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickOnCheckbox() throws InterruptedException {
		AdminBuyerEditSettingsPage_CheckBox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}

	public static void ClickOnSavebutton() {
		AdminBuyerEditSettingsPage_Savebutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}

	public static void ClickOnOutsideSection() {
		AdminBuyerEditSettingsPage_OutsideSection.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
}
