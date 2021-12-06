package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class BuyerNewslistingpage {

	private static WebDriver driver;

	public BuyerNewslistingpage(WebDriver driver) {


		BuyerNewslistingpage.driver = driver;
		PageFactory.initElements(driver, this);
	} 

	public void navigateTo_LogInPage2() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
	}

	public static void navigateTo_invoiceprocesspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}
	
	
	@FindBy(xpath = "//a[@class='nav-link active']")
	private static WebElement BuyerNewslistingpage_Newsmenubar;
	
	@FindBy(xpath = "//div[contains(@class,'news_list mb-4')]//div")
	private static WebElement BuyerNewslistingpage_testnotification;
	
	@FindBy(xpath = "//div[@class='py-5 px-5']//button[1]")
	private static WebElement BuyerNewslistingpage_whatsapplink;
	
	
	
	@FindBy(xpath = "//div[contains(@class,'pop_close cursor')]//img[1]")
	private static WebElement BuyerNewslistingpage_closeiconbutton;
	

	public static void ClickonNewsmenubar() {
		BuyerNewslistingpage_Newsmenubar.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	
	}

	public static void Clickthetestnotification() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		BuyerNewslistingpage_testnotification.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	
	}

		

	
	public static void Clickoncloseicon() {
		BuyerNewslistingpage_closeiconbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	
	}

	public static void navigate_to_buyer_panel() {
		driver.navigate().to("http://dev.buyer.zeemart.asia/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonthewhatsapplink() {
		BuyerNewslistingpage_whatsapplink.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	
	}


	

	
	
}