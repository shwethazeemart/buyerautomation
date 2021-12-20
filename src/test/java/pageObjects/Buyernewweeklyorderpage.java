package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyernewweeklyorderpage {

	private static WebDriver driver;

	public Buyernewweeklyorderpage(WebDriver driver) {


		Buyernewweeklyorderpage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*public void navigateTo_Orderspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}*/
	
	public void navigateTo_LogInPage2() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
	}
	public void isTosterMessageFound1(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));
	}
	
	@FindBy(xpath = "//a[contains(text(),'New weekly order')]") 
	private static WebElement Buyernewweeklyorderpage_Newweeklyorder;
	
	@FindBy(xpath = "//h3[@class='cursor text-primary']//i[1]") 
	private static WebElement Buyernewweeklyorderpage_Dropdownofweeklyorder;
	
	@FindBy(xpath = "//div[text()='velu masala2020 ']") 
	private static WebElement Buyernewweeklyorderpage_Velumasalainweeklyorder;
	
	@FindBy(xpath = "//input[contains(@name,'pastPeriodCheck')]") 
	private static WebElement Buyernewweeklyorderpage_Checkboxoflastthirtydaysorder;
	
	@FindBy(xpath = "//button[text()=' Download ']") 
	private static WebElement Buyernewweeklyorderpage_Downloadbutton;
	
	@FindBy(xpath = "//button[text()=' Upload & review order ']") 
	private static WebElement Buyernewweeklyorderpage_Uploadandreviewbutton;
	
	
	 
	
	

	public static void Clickonnewweeklyorder() {
		//WebElement newWeeklyOrder = driver.findElement(By.linkText("New weekly order"));
		//newWeeklyOrder.click();
		Buyernewweeklyorderpage_Newweeklyorder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickondropdownofweeklyorder() {
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Buyernewweeklyorderpage_Dropdownofweeklyorder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonvelumasalainweeklyorder() {
		Buyernewweeklyorderpage_Velumasalainweeklyorder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickoncheckboxoflastthirtydaysorder() {
		Buyernewweeklyorderpage_Checkboxoflastthirtydaysorder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickdownloadbutton() {
		Buyernewweeklyorderpage_Downloadbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Uploadtheexcelfile() throws InterruptedException {
		WebElement uploadexcel=driver.findElement(By.xpath("//input[@id='file']"));

		uploadexcel.sendKeys("E:\\Zeemart All\\Feature file\\Weeklyorder_20211225_20211231 (1).xlsx");
		Thread.sleep(5000);
						try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
		
	}

	public static void Clickonuploadandreviewbutton() {
		Buyernewweeklyorderpage_Uploadandreviewbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
