package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		WebElement image=driver.findElement(By.xpath("//input[@type='file']"));
		image.sendKeys("E:/Zeemart/employers-750x300.jpg");
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
}
