package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Supplierdashboardpage {

	private static WebDriver driver;

	public Supplierdashboardpage(WebDriver driver) {


		Supplierdashboardpage.driver = driver;
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
	private static WebElement Supplierdashboardpage_Dashboardicon;
	
	@FindBy(xpath = "(//a[@id='basic-link'])[1]")
	private static WebElement Supplierdashboardpage_Thismonthintotalorderpage;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Thisweekintotalorderpage;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Thisquarterintotalpage;

	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_YTDintotalorderpage;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Byteam;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Showall;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Outstandinginvoice;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Allcategories;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Thismmonthinsalesbycategory;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Thisweekinsalescategory;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Thisquarterinsalescategory;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_YTDinsalescategory;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Thismonthinbestperformingcustomer;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Thisweekinbestperformingcustomer;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Thisquarterinbestperformingcustomer;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_YTDinbestperformingcustomer;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Viewallinbestperformingcustomer;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Overfourteendaysinslippingaway;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Overthirdtydaysinslippingaway;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Oversixtydaysinslippingaway;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Overninetydaysinslippingaway;
	
	@FindBy(xpath = "//p[text()='Customers']")
	private static WebElement Supplierdashboardpage_Viewallinslippingaway;



	

	
	
	
	
	
	
	public static void Clickondashboardicon() {
	Supplierdashboardpage_Dashboardicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Checkingwelcomebackicon() {
		WebElement sabari=driver.findElement(By.xpath("//p[@class='title']"));
		sabari.getText();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Checkingtotalordersicon() {
		WebElement velu=driver.findElement(By.xpath("(//p[@class='summary_label'])[1]"));
		velu.getText();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Checkingnumberofordersicon() {
		WebElement sairam=driver.findElement(By.xpath("(//p[@class='summary_label'])[2]"));
		sairam.getText();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Checkingdeliveryordersicon() {
		WebElement murugan=driver.findElement(By.xpath("//p[contains(.,'Deliveries0')]"));
		murugan.getText();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonthismonthintotalorderpage() {
		Supplierdashboardpage_Thismonthintotalorderpage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonthisweekintotalorderpage() {
		Supplierdashboardpage_Thisweekintotalorderpage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonthisquarterintotalorderpage() {
		Supplierdashboardpage_Thisquarterintotalpage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickonYTDintotalorderpage() {
		Supplierdashboardpage_YTDintotalorderpage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonbyteam() {
		Supplierdashboardpage_Byteam.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonshowall() {
		Supplierdashboardpage_Showall.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonoutstandinginvoice() {
		Supplierdashboardpage_Outstandinginvoice.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonallcategories() {
		Supplierdashboardpage_Allcategories.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonthismonthinsalesbycategory() {
		Supplierdashboardpage_Thismmonthinsalesbycategory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonthisweekinsalescategory() {
		Supplierdashboardpage_Thisweekinsalescategory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonthisquarterinsalescategory() {
		Supplierdashboardpage_Thisquarterinsalescategory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void ClickonYTDinsalescategory() {
		Supplierdashboardpage_YTDinsalescategory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonthismonthinbestperformingcustomer() {
		Supplierdashboardpage_Thismonthinbestperformingcustomer.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonthisweekinbestperformingcustomer() {
		Supplierdashboardpage_Thisweekinbestperformingcustomer.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonthisquarterinbestperformingcustomer() {
		Supplierdashboardpage_Thisquarterinbestperformingcustomer.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void ClickonYTDinbestperformingcustomer() {
		Supplierdashboardpage_YTDinbestperformingcustomer.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonviewallinbestperformingcustomer() {
		Supplierdashboardpage_Viewallinbestperformingcustomer.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonoverfourteendaysinslippingaway() {
		Supplierdashboardpage_Overfourteendaysinslippingaway.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonoverthirdtydaysinslippingaway() {
		Supplierdashboardpage_Overthirdtydaysinslippingaway.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));		
	}

	public static void Clickonoversixtydaysinslippingaway() {
		Supplierdashboardpage_Oversixtydaysinslippingaway.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonoverninetydaysinslippingaway() {
		Supplierdashboardpage_Overninetydaysinslippingaway.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonviewallinslippinyaway() {
		Supplierdashboardpage_Viewallinslippingaway.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
