package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminReportsOutletspage {

	private static WebDriver driver;

	public AdminReportsOutletspage(WebDriver driver) {


		AdminReportsOutletspage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}


	@FindBy(xpath = "//a[text()='Invoice digitisation - By outlet']")
	private static WebElement AdminReportsOutletspage_ByOutletOption;

	@FindBy(xpath = "//button[text()='Search']")
	private static WebElement AdminReportsOutletspage_SearchIcon;

	@FindBy(xpath = "//div[@class='pl-2']//a[1]")
	private static WebElement AdminReportsOutletspage_ExportButton;

	@FindBy(xpath = "(//div[@class='btn-group ml-auto']//a)[1]")
	private static WebElement AdminReportsOutletspage_Filter;

	@FindBy(xpath = "//div[text()=' Outlet  ']")
	private static WebElement AdminReportsOutletspage_OutletFilter;

	@FindBy(xpath = "//a[text()='Select All']")
	private static WebElement AdminReportsOutletspage_AllOptionSelect;

	@FindBy(xpath = "//button[text()='Apply']")
	private static WebElement AdminReportsOutletspage_ApplyButton;

	@FindBy(xpath = "//div[text()=' Processing time  ']")
	private static WebElement AdminReportsOutletspage_ProcessingTime;

	@FindBy(xpath = "//div[text()=' No. of line items  ']")
	private static WebElement AdminReportsOutletspage_NumberofLineItem;

	@FindBy(xpath = "//select[@formcontrolname='processedUserId']")
	private static WebElement AdminReportsOutletspage_User;
	
	@FindBy(xpath = "//a[text()='Reset']")
	private static WebElement AdminReportsOutletspage_ResetButton;






	public static void ByOutletOptionClick() throws InterruptedException {
		Thread.sleep(5000);
		AdminReportsOutletspage_ByOutletOption.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void SelectDatefromCalendar() throws InterruptedException {
		Thread.sleep(5000);
		WebElement DateBox=driver.findElement(By.xpath("//input[@placeholder='Select date']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='01Jun2021-30Jan2022';", DateBox);


	}

	public static void SearchIconClick() {
		AdminReportsOutletspage_SearchIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void exportButtonClick() {
		AdminReportsOutletspage_ExportButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void filterClick() {
		AdminReportsOutletspage_Filter.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void outletFilterClick() {
		AdminReportsOutletspage_OutletFilter.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void allOptionSelect() {
		AdminReportsOutletspage_AllOptionSelect.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void applyButtonClick() {
		AdminReportsOutletspage_ApplyButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void processingtimeClick() {
		AdminReportsOutletspage_ProcessingTime.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void numberofLineitemsClick() {
		AdminReportsOutletspage_NumberofLineItem.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}


	public static void clickUsevelumani() throws InterruptedException {
		AdminReportsOutletspage_User.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementUser() {
		return AdminReportsOutletspage_User;
	}

	public static void resetButtonClick() {
		AdminReportsOutletspage_ResetButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}






































}
