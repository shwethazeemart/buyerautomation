package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminReportsUserspage {

	private static WebDriver driver;

	public AdminReportsUserspage(WebDriver driver) {


		AdminReportsUserspage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}


	@FindBy(xpath = "//a[text()='Invoice digitisation - By processor user']")
	private static WebElement AdminReportsUserspage_ByprocessorUser;

	@FindBy(xpath = "//a[text()='Users'] ")
	private static WebElement AdminReportsUserspage_UserIcon;

	@FindBy(xpath = "//button[text()=' Search ']")
	private static WebElement AdminReportsUserspage_SearchIcon;

	@FindBy(xpath = "//div[@class='btn-group']/following-sibling::div[1] ")
	private static WebElement AdminReportsUserspage_ExportDownloadButton;
	
	@FindBy(xpath = "(//div[@class='btn-group']//a)[1]")
	private static WebElement AdminReportsUserspage_FilterUsers;
	
	@FindBy(xpath = "//div[text()=' Processed User  ']")
	private static WebElement AdminReportsUserspage_ProcessedUser;
	
	@FindBy(xpath = "//a[text()='Select All']")
	private static WebElement AdminReportsUserspage_SelectAlloption;
	
	@FindBy(xpath = "//button[text()='Apply']")
	private static WebElement AdminReportsUserspage_ApplyButton;
	
	@FindBy(xpath = "//a[text()='Reset']")
	private static WebElement AdminReportsUserspage_Resetbutton;



	public static void byprocessorUserClick() throws InterruptedException {
		Thread.sleep(5000);
		AdminReportsUserspage_ByprocessorUser.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void userIconClick() {
		AdminReportsUserspage_UserIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void selectDatformCalendar() throws InterruptedException {
		Thread.sleep(5000);
		WebElement DateBox=driver.findElement(By.xpath("//input[@formcontrolname='processedDate']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='01Jul2021-30Jan2022';", DateBox);

	}

	public static void searchIconClick() throws InterruptedException {
		Thread.sleep(5000);
		AdminReportsUserspage_SearchIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void expoertdownloadButtonClick() throws InterruptedException {
		Thread.sleep(5000);
		AdminReportsUserspage_ExportDownloadButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void filterClickinUsers() {
		AdminReportsUserspage_FilterUsers.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void processedUserClick() {
		AdminReportsUserspage_ProcessedUser.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void selectAllOptionClick() {
		AdminReportsUserspage_SelectAlloption.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void applubuttonClick() {
		AdminReportsUserspage_ApplyButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void resetButtonClick() throws InterruptedException {
		Thread.sleep(5000);
		AdminReportsUserspage_Resetbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}










































}
