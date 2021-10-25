package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Supplierorderslistingpage {

	private static WebDriver driver;

	public Supplierorderslistingpage(WebDriver driver) {


		Supplierorderslistingpage.driver = driver;
		PageFactory.initElements(driver, this);
	} 

	public static void navigateTo_LogInPage3() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}

	public static void navigateTo_invoiceprocesspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}



	@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	private static WebElement Supplierorderslistingpage_Downloadbutton;

	@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	private static WebElement Supplierorderslistingpage_Downloadpicklistbutton;
	
	@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	private static WebElement Supplierorderslistingpage_Outletlist;
	
	@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	private static WebElement Supplierorderslistingpage_FinalDownloadbutton;
	
	@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	private static WebElement Supplierorderslistingpage_Closeicondownloadpicklist;
	
	@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	private static WebElement Supplierorderslistingpage_Ordernumbersearchbox;
	
	@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	private static WebElement Supplierorderslistingpage_Entertheordernumber;
	
	@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	private static WebElement Supplierorderslistingpage_Searchicon;
	
	@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	private static WebElement Supplierorderslistingpage_Ordernumber;
	
	@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	private static WebElement Supplierorderslistingpage_Deliverylocation;
	
	@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	private static WebElement Supplierorderslistingpage_Filtericon;












	public static void Clickdownloadbuttoninorderpage() {
		Supplierorderslistingpage_Downloadbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickondownloadpicklistbutton() {
		Supplierorderslistingpage_Downloadpicklistbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Selectdateindownloadpicklist() {

		WebElement DateBox=driver.findElement(By.xpath("//input[@placeholder='Select date']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='25Oct2021';", DateBox);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void clickoutletslistitem() {
		Supplierorderslistingpage_Outletlist.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementoutletslist() {
		return Supplierorderslistingpage_Outletlist;
	}

	public static void Clickfinaldownloadbutton() {
		Supplierorderslistingpage_FinalDownloadbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickcloseicondownloadpicklist() {
		Supplierorderslistingpage_Closeicondownloadpicklist.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonordernumbersearchbox() {
		Supplierorderslistingpage_Ordernumbersearchbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Entertheordernumber(String ordernumber) {
		Supplierorderslistingpage_Entertheordernumber.sendKeys(ordernumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clicksearchicon() {
		Supplierorderslistingpage_Searchicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clearonordernumber() {
		Supplierorderslistingpage_Ordernumber.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void deliverylocation() {
		Supplierorderslistingpage_Deliverylocation.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementDeliverylocation() {
		return Supplierorderslistingpage_Deliverylocation;
	}

	public static void Selectorderdaterange() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@placeholder='Select date']"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].value='25Oct2021';", DateBox);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Selectdeliverydaterange() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@placeholder='Select date']"));

		JavascriptExecutor jst = (JavascriptExecutor) driver;

		jst.executeScript("arguments[0].value='27Oct2021';", DateBox);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonfiltericon() {
		Supplierorderslistingpage_Filtericon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonorderstatus() {
		Supplierorderslistingpage_Filtericon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}























































}
