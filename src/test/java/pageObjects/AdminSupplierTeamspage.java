package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminSupplierTeamspage {

	private static WebDriver driver; 

	public AdminSupplierTeamspage(WebDriver driver) {


		AdminSupplierTeamspage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}


	@FindBy(xpath = "//a[contains(text(),'Supplier Teams')] ")
	private static WebElement AdminSupplierTeamspage_SupplierTeams;
	
	@FindBy(xpath = "//button[contains(text(),' Add Team')]  ")
	private static WebElement AdminSupplierTeamspage_AddNewButton;
	
	@FindBy(xpath = "//input[contains(@type,'text')]")
	private static WebElement AdminSupplierTeamspage_EnterTeamName;
	
	@FindBy(xpath = "//button[text()='Next: Link to outlet ']")
	private static WebElement AdminSupplierTeamspage_NextLinkOutlet;
	
	@FindBy(xpath = "//button[text()=' Add new ']")
	private static WebElement AdminSupplierTeamspage_AddNew;
	
	@FindBy(xpath = "//div[@role='combobox']//input[1]")
	private static WebElement AdminSupplierTeamspage_SelectOutlet;
	
	@FindBy(xpath = "//span[contains(text(),'sai fruits 250')]")
	private static WebElement AdminSupplierTeamspage_SecondOutlet;
	
	@FindBy(xpath = "//h4[contains(text(),'Select outlet')]")
	private static WebElement AdminSupplierTeamspage_SelectOutletIcon;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private static WebElement AdminSupplierTeamspage_SaveButton;
	
	@FindBy(xpath = "//a[contains(text(),' Actions')] ")
	private static WebElement AdminSupplierTeamspage_Actiondropdown;
	
	

	public static void supplierTeamsClick() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250);");
		AdminSupplierTeamspage_SupplierTeams.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}

	public static void addNewButttonClick() {
		AdminSupplierTeamspage_AddNewButton.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void enterTeamName(String teamname) {
		AdminSupplierTeamspage_EnterTeamName.sendKeys(teamname); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void addnewClcik() throws InterruptedException {
		Thread.sleep(5000);
		AdminSupplierTeamspage_AddNew.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void nextLinkOutletClick() {
		AdminSupplierTeamspage_NextLinkOutlet.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void selectOutletClick() {
		AdminSupplierTeamspage_SelectOutlet.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void secondOutletClick() {
		AdminSupplierTeamspage_SecondOutlet.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void selectOutletIconClick() {
		AdminSupplierTeamspage_SelectOutletIcon.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void saveButtonClick() {
		AdminSupplierTeamspage_SaveButton.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void actiondropdowneditfieldClick() throws InterruptedException {
		Thread.sleep(5000);
		AdminSupplierTeamspage_Actiondropdown.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
