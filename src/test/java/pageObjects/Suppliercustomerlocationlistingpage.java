package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Suppliercustomerlocationlistingpage {

	private static WebDriver driver;

	public Suppliercustomerlocationlistingpage(WebDriver driver) {


		Suppliercustomerlocationlistingpage.driver = driver;
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


	@FindBy(xpath = "//input[@placeholder='Search location']")
	private static WebElement Suppliercustomerlocationlistingpage_Enterthenamesearchbox;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private static WebElement Suppliercustomerlocationlistingpage_Checkbox;
	
	@FindBy(xpath = "//button[text()=' Apply outlet settings from... ']")
	private static WebElement Suppliercustomerlocationlistingpage_Applybutton;
	
	@FindBy(xpath = "//select[@formcontrolname='outletCopyFrom']")
	private static WebElement Suppliercustomerlocationlistingpage_Sakthimasalaoutlet;
	
	@FindBy(xpath = "//button[text()='Select all']")
	private static WebElement Suppliercustomerlocationlistingpage_Selectallbutton;
	
	@FindBy(xpath = "//button[text()=' Apply']")
	private static WebElement Suppliercustomerlocationlistingpage_Applybuttonoutletsettingpage;
	
	@FindBy(xpath = "//button[text()=' Clear ']")
	private static WebElement Suppliercustomerlocationlistingpage_Clearbutton;
	
	//@FindBy(xpath = "//button[text()=' New customer ']")
	//private static WebElement Suppliercustomerlocationlistingpage_Actionsdropdown;
	
	@FindBy(xpath = "(//a[@routerlinkactive='active'])[2]")
	private static WebElement Suppliercustomerlocationlistingpage_Managesetting;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Suppliercustomerlocationlistingpage_Customersbackbutton;
	
	@FindBy(xpath = "(//a[@routerlinkactive='active'])[3]")
	private static WebElement Suppliercustomerlocationlistingpage_Managemarketlist;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Suppliercustomerlocationlistingpage_Cutomerbackbuttoninmanagemarket;
	
	@FindBy(xpath = "//span[text()='Default settings']")
	private static WebElement Suppliercustomerlocationlistingpage_Defaultsetting;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Suppliercustomerlocationlistingpage_Backbuttonindefaultsetting;
	
	@FindBy(xpath = "//button[text()=' New customer ']")
	private static WebElement Suppliercustomerlocationlistingpage_Newcustomers;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Suppliercustomerlocationlistingpage_Customerbackbuttonnewcutomerpage;










	public static void Enterthenameinsearchbox(String Sakthimasala100) {
		Suppliercustomerlocationlistingpage_Enterthenamesearchbox.sendKeys(Sakthimasala100);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickoncheckbox() {
		Suppliercustomerlocationlistingpage_Checkbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonapplybutton() {
		Suppliercustomerlocationlistingpage_Applybutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Selectoutletsettings()  {
		Suppliercustomerlocationlistingpage_Sakthimasalaoutlet.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementoutletsettings() {
		return Suppliercustomerlocationlistingpage_Sakthimasalaoutlet;
	}

	public static void Clickselectallbutton() {
		Suppliercustomerlocationlistingpage_Selectallbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonapplybuttonoutletsettingpage() {
		Suppliercustomerlocationlistingpage_Applybuttonoutletsettingpage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonclearbutton() {
		Suppliercustomerlocationlistingpage_Clearbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonactionsdropdown() {
		WebElement actions = driver.findElement(By.linkText("Actions"));
		actions.click();
		//Suppliercustomerlocationlistingpage_Actionsdropdown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clcikonmanagesettings() {
		Suppliercustomerlocationlistingpage_Managesetting.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clickoncustomersbackbutton() {
		Suppliercustomerlocationlistingpage_Customersbackbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonmanagemarketlist() {
		Suppliercustomerlocationlistingpage_Managemarketlist.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickcustomerbackbuttoninmanagemarket() {
		Suppliercustomerlocationlistingpage_Cutomerbackbuttoninmanagemarket.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickondefaultsetting() {
		Suppliercustomerlocationlistingpage_Defaultsetting.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickbackbuttonindefaultsettings() {
		Suppliercustomerlocationlistingpage_Backbuttonindefaultsetting.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonnewcustomers() {
		Suppliercustomerlocationlistingpage_Newcustomers.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clickoncustomerbackbuttoninnewcustomerpage() {
		Suppliercustomerlocationlistingpage_Customerbackbuttonnewcutomerpage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}















































}
