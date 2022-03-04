package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class BuyerOutletApproverpage {

	private static WebDriver driver;

	public BuyerOutletApproverpage(WebDriver driver) {


		BuyerOutletApproverpage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void navigateTo_LogInPage2() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
	}

	public void navigateTo_Orderspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false)); 
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));
	}


	

	@FindBy(xpath = "(//a[contains(@class,'zmdropDownBtn')])[5] ")
	private static WebElement BuyerOutletApproverpage_ActionDropDown;
	
	@FindBy(xpath = "//a[contains(text(),'Manage settings')]")
	private static WebElement BuyerOutletApproverpage_ManageSetting;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private static WebElement BuyerOutletApproverpage_ApproverCheckbox;
	
	@FindBy(xpath = "//button[contains(text(),'Update approval config')]")
	private static WebElement BuyerOutletApproverpage_FinalUpdateApproverButton;
	
	

	public static void actionDropDownClick() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");
		BuyerOutletApproverpage_ActionDropDown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void manageSettingClick() {
		BuyerOutletApproverpage_ManageSetting.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void approverCheckboxClick() throws InterruptedException {
		Thread.sleep(8000);
		JavascriptExecutor jseone = (JavascriptExecutor)driver;
		jseone.executeScript("window.scrollBy(0,1000)");
		//JavascriptExecutor jsetwo = (JavascriptExecutor)driver;
		//jsetwo.executeScript("window.scrollBy(0,250)");
		BuyerOutletApproverpage_ApproverCheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void finalSaveButtonClick() {
		BuyerOutletApproverpage_FinalUpdateApproverButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
