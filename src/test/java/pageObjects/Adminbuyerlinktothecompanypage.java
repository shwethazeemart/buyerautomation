package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Adminbuyerlinktothecompanypage {


	private static WebDriver driver;

	public Adminbuyerlinktothecompanypage(WebDriver driver) {


		Adminbuyerlinktothecompanypage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}
	
	
	@FindBy(xpath = "(//a[@class='zmdropDownBtn'])[2]")
	private static WebElement Adminbuyerlinktothecompanypage_ABC_PTE_supplier_actions;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private static WebElement Adminbuyerlinktothecompanypage_link_to_company;

	@FindBy(xpath = "//input[@formcontrolname='customCompanyId']")
	private static WebElement Adminbuyerlinktothecompanypage_enter_the_custom_company_id;
	
	@FindBy(xpath = "//button[text()=' Save settings ']")
	private static WebElement Adminbuyerlinktothecompanypage_save_settings;

	
	
	public static void clicks_on_the_ABC_PTE_supplier_actions() { 
		Adminbuyerlinktothecompanypage_ABC_PTE_supplier_actions.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void clicks_on_the_Buyers_companies() {
		driver.findElement(By.linkText("Buyer companies")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void clicks_on_the_link_to_company() {
		Adminbuyerlinktothecompanypage_link_to_company.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Select_company_in_the_autocomplete_text_box() throws InterruptedException {
		driver.findElement(By.xpath("//select[@id='companyId']")).sendKeys("VELU FRUITS",Keys.ENTER);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	

	public static void clicks_on_the_save_settings() {
		Adminbuyerlinktothecompanypage_save_settings.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void enter_the_custom_company_id_CGP123(String companyid) {
		Adminbuyerlinktothecompanypage_enter_the_custom_company_id.sendKeys(companyid);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
