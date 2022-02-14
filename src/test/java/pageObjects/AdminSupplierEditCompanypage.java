package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminSupplierEditCompanypage {

	private static WebDriver driver; 

	public AdminSupplierEditCompanypage(WebDriver driver) {


		AdminSupplierEditCompanypage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}
	
	@FindBy(xpath = "(//a[@class='zmdropDownBtn'])[1]")
	private static WebElement AdminSupplierEditCompanypage_Actiondropdown;

	@FindBy(xpath = "//input[@formcontrolname='alias']")
	private static WebElement AdminSupplierEditCompanypage_AlsoknoeasField;
	
	@FindBy(xpath = "//input[@formcontrolname='alias']")
	private static WebElement AdminSupplierEditCompanypage_EnteralsoKnowasfield;
	
	@FindBy(xpath = "//input[@formcontrolname='regNo']")
	private static WebElement AdminSupplierEditCompanypage_CompanyRegistration;
	
	@FindBy(xpath = "//input[@formcontrolname='regNo']")
	private static WebElement AdminSupplierEditCompanypage_EnterCompanyName;
	
	@FindBy(xpath = "//span[text()=' Update ']")
	private static WebElement AdminSupplierEditCompanypage_UpdateButton;
	
	@FindBy(xpath = "//a[text()='Edit general & company details '] ") 
	private static WebElement AdminSupplierEditCompanypage_EditCompany;




	public static void actionbootstrapDropdownClick() {
		AdminSupplierEditCompanypage_Actiondropdown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
}

	public static void alsoKnowasFieldClear() {
		AdminSupplierEditCompanypage_AlsoknoeasField.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void enteralsoKnowasField(String knowas) {
		AdminSupplierEditCompanypage_EnteralsoKnowasfield.sendKeys(knowas);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void companyRegistratonClear() {
		AdminSupplierEditCompanypage_CompanyRegistration.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}

	public static void EnterCompanyName(String companyregistrationnumber) {
		AdminSupplierEditCompanypage_EnterCompanyName.sendKeys(companyregistrationnumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void updateButtonClick() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");
		AdminSupplierEditCompanypage_UpdateButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void editCompanyClick() {
		AdminSupplierEditCompanypage_EditCompany.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}































}







































































