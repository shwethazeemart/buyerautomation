package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyerinventoryactivitylisenpage {

	private static WebDriver driver;

	public Buyerinventoryactivitylisenpage(WebDriver driver) {


		Buyerinventoryactivitylisenpage.driver = driver;
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



	@FindBy(xpath = "//a[@href='/sg/pages/inventoryManage/activity/OAMIS']")
	private static WebElement Buyerinventoryactivitylisenpage_Activityicon;
	
	@FindBy(xpath = "//img[@src='assets/zmcore/img/download-icon.svg']")
	private static WebElement Buyerinventoryactivitylisenpage_Downloadbutton;
	
	@FindBy(xpath = "//div[text()='velu masala2020']")
	private static WebElement Buyerinventoryactivitylisenpage_Outlet;



	
	
	public static void Clickactivityicon() {
		//WebElement activity = driver.findElement(By.linkText("Activity"));
		//activity.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, -250);");
		Buyerinventoryactivitylisenpage_Activityicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Selectcalendardate() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@placeholder='Select range']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='08Aug2021-27Aug2021';", DateBox);
		
	}

	public static void Clickdownloadbutton() {
		Buyerinventoryactivitylisenpage_Downloadbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ClickonOutlet() {
		Buyerinventoryactivitylisenpage_Outlet.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
