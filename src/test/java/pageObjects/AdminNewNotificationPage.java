package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminNewNotificationPage {

		private static WebDriver driver;

	public AdminNewNotificationPage(WebDriver driver) {


		AdminNewNotificationPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}

	@FindBy(xpath = "//button[text()=' New notification ']")
	private static WebElement AdminNewNotificationPage_NewNotification;
	
	@FindBy(xpath = "//input[@formcontrolname='shortDescription']")
	private static WebElement AdminNewNotificationPage_ShortDescription;
	
	@FindBy(xpath = "//textarea[@formcontrolname='fullDescription']")
	private static WebElement AdminNewNotificationPage_FullDescription;
	
	@FindBy(xpath = "(//input[contains(@name,'callToAction')])[3]")
	private static WebElement AdminNewNotificationPage_InternalLink;
	
	@FindBy(xpath = "//select[contains(@formcontrolname,'gotoLink')]")
	private static WebElement AdminNewNotificationPage_InternalLinkDropdown;
	
	@FindBy(xpath = "//textarea[@formcontrolname='fullDescription']")
	private static WebElement AdminNewNotificationPage_EnterButtonValue;
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'gotoButtonLabel')]")
	private static WebElement AdminNewNotificationPage_CreateOrder;
	

	public static void ClickNewNotification() {
		AdminNewNotificationPage_NewNotification.click();
				try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void EnterShortDescription(String descrip) {
		AdminNewNotificationPage_ShortDescription.sendKeys(descrip);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void EnterFullDescription(String fulldescrip) {
		AdminNewNotificationPage_FullDescription.sendKeys(fulldescrip);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickImage() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		WebElement image=driver.findElement(By.xpath("//input[contains(@name,'file[]')]"));
		image.sendKeys("E:\\Zeemart All\\Feature file\\Velu5mb.jpg");
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void internalLinkClick() throws InterruptedException {
		AdminNewNotificationPage_InternalLink.click();
		//driver.findElement(By.xpath("//select[contains(@formcontrolname,'gotoLink')]")).sendKeys("Create order",Keys.ENTER);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	
	}
		
	

	public static void gotoDropdownClick() {
		driver.findElement(By.xpath("//select[contains(@formcontrolname,'gotoLink')]")).sendKeys("Create order",Keys.ENTER);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void enterbuttonLabelValue(String label) {
		AdminNewNotificationPage_EnterButtonValue.sendKeys(label);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void createOrderClick() {
		AdminNewNotificationPage_CreateOrder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
}
