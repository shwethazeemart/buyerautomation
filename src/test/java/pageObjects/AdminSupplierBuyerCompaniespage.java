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

public class AdminSupplierBuyerCompaniespage {

	private static WebDriver driver; 

	public AdminSupplierBuyerCompaniespage(WebDriver driver) {


		AdminSupplierBuyerCompaniespage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}


	@FindBy(xpath = "//a[contains(text(),'Buyer companies')] ")
	private static WebElement AdminSupplierBuyerCompaniespage_BuyerCompanies;
	
	@FindBy(xpath = "//button[contains(text(),'Link to company')]  ")
	private static WebElement AdminSupplierBuyerCompaniespage_LinkCompany;
	
	@FindBy(xpath = "//div[@class='p-3 container-fluid clearfix border-0']/child::ul/child::li[2]/descendant::button[text()=' Save settings ']  ")
	private static WebElement AdminSupplierBuyerCompaniespage_SaveSetting;
	
	@FindBy(xpath = "//a[contains(text(),' Actions')]")
	private static WebElement AdminSupplierBuyerCompaniespage_ActionIcon;
	
	@FindBy(xpath = "//a[contains(text(),'Edit details')]")
	private static WebElement AdminSupplierBuyerCompaniespage_EditDetails;
	
	@FindBy(xpath = "//input[contains(@id,'customCompanyId')]") 
	private static WebElement AdminSupplierBuyerCompaniespage_EnterCompanyid;
	
	
	

	public static void buyerCompaniesClick() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250);");
		AdminSupplierBuyerCompaniespage_BuyerCompanies.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}

	public static void linkCompanyClick() {
		AdminSupplierBuyerCompaniespage_LinkCompany.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void companySelect() {
		driver.findElement(By.xpath("//select[contains(@id,'companyId')]")).sendKeys("VELU M");
		List<WebElement> list= driver.findElements(By.xpath("//select[contains(@id,'companyId')]//option"));
		//System.out.println("total number of suggestion in search box :::= =>" +list.size());
		for(int i=0; i<list.size(); i++) {
			//System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("VELU MASALA")) {
				list.get(i).click();
				break;
			}
		}

	}

	public static void saveSettingsButtonClick() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250);");
		driver.findElement(By.xpath("//div[contains(@class,'form_container container-fluid')]")).click();
		AdminSupplierBuyerCompaniespage_SaveSetting.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void actionIconClick() throws InterruptedException {
		Thread.sleep(5000);
		AdminSupplierBuyerCompaniespage_ActionIcon.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void editDetailsClick() {
		AdminSupplierBuyerCompaniespage_EditDetails.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void enterComapnyid(String companyid) throws InterruptedException {
		Thread.sleep(5000);
		AdminSupplierBuyerCompaniespage_EnterCompanyid.sendKeys(companyid); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
