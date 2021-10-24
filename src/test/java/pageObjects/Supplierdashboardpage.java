package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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

	@FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
	private static WebElement Supplierdashboardpage_Thisweekintotalorderpage;

	@FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
	private static WebElement Supplierdashboardpage_Thisquarterintotalpage;

	@FindBy(xpath = "(//a[@class='dropdown-item'])[4]")
	private static WebElement Supplierdashboardpage_YTDintotalorderpage;

	@FindBy(xpath = "//button[@id='basic-link']")
	private static WebElement Supplierdashboardpage_Byteam;

	@FindBy(xpath = "(//ul[@id='basic-link-dropdown'])[1]")
	private static WebElement Supplierdashboardpage_Showall;

	//@FindBy(xpath = "//p[text()='Customers']")
	//private static WebElement Supplierdashboardpage_Outstandinginvoice;

	@FindBy(xpath = "(//a[@id='basic-link'])[2]")
	private static WebElement Supplierdashboardpage_Allcategories;

	@FindBy(xpath = "(//a[@id='basic-link'])[3]")
	private static WebElement Supplierdashboardpage_Thismmonthinsalesbycategory;

	@FindBy(xpath = "(//ul[contains(@class,'dropdown-menu show')]//a)[2]")
	private static WebElement Supplierdashboardpage_Thisweekinsalescategory;

	//@FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
	//private static WebElement Supplierdashboardpage_Thisquarterinsalescategory;
	 

	@FindBy(xpath = "(//a[contains(@class,'dropdown-item')])[4]") 
	private static WebElement Supplierdashboardpage_YTDinsalescategory;
	
	//@FindBy(how = How.LINK_TEXT, using="YTD")
	//private static WebElement Supplierdashboardpage_YTDinsalescategory;

	@FindBy(xpath = "(//a[contains(@id,'basic-link')])[4]")
	private static WebElement Supplierdashboardpage_Thismonthinbestperformingcustomer;

	//@FindBy(xpath = "(//ul[@id='basic-link-dropdown']//a)[2]")
	//private static WebElement Supplierdashboardpage_Thisweekinbestperformingcustomer;
 
	@FindBy(xpath = "(//ul[@role='menu']//a)[3]")
	private static WebElement Supplierdashboardpage_Thisquarterinbestperformingcustomer;

	@FindBy(xpath = "(//a[@class='dropdown-item'])[4]")
	private static WebElement Supplierdashboardpage_YTDinbestperformingcustomer;

	@FindBy(xpath = "//p[text()='View all ']")
	private static WebElement Supplierdashboardpage_Viewallinbestperformingcustomer;

	@FindBy(xpath = "(//a[contains(@id,'basic-link')])[5]")
	private static WebElement Supplierdashboardpage_Overfourteendaysinslippingaway;

	//@FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
	//private static WebElement Supplierdashboardpage_Overthirdtydaysinslippingaway;

	//@FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
	//private static WebElement Supplierdashboardpage_Oversixtydaysinslippingaway;

	//@FindBy(xpath = "(//a[@class='dropdown-item'])[4]")
	//private static WebElement Supplierdashboardpage_Overninetydaysinslippingaway;

	@FindBy(xpath = "(//p[text()='View all '])[2]")
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

	public static void Clickonwelcomebackicon() {
		WebElement sabari=driver.findElement(By.xpath("//div[@class='flex__bwn']//p[1]"));
		sabari.getText();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickontotalordersicon() {
		WebElement velu=driver.findElement(By.xpath("(//p[@class='summary_label'])[1]"));
		velu.getText();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonnumberofordersicon() {
		WebElement sairam=driver.findElement(By.xpath("(//p[@class='summary_label'])[2]"));
		sairam.getText();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickondeliveryordersicon() {
		WebElement murugan=driver.findElement(By.xpath("//p[contains(.,'Deliveries0')]"));
		murugan.getText();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonthismonthintotalorderpage() throws InterruptedException {
		Thread.sleep(5000);
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
		WebElement murugansamy=driver.findElement(By.xpath("//div[text()=' Outstanding invoices ']"));
		murugansamy.getText();

		//Supplierdashboardpage_Outstandinginvoice.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonallcategories() {
		//JavascriptExecutor  = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,250)");
		Supplierdashboardpage_Allcategories.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonthismonthinsalesbycategory() throws InterruptedException {
		Thread.sleep(5000);
		//JavascriptExecutor  = (JavascriptExecutor) driver;
		//js.executeScript("scroll(0, 250);");
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
		WebElement thisQuarter = driver.findElement(By.linkText("This quarter"));
		thisQuarter.click();
		//Supplierdashboardpage_Thisquarterinsalescategory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void ClickonYTDinsalescategory() throws InterruptedException {
		Thread.sleep(5000);
		//WebElement yTD = driver.findElement(By.cssSelector("ul#basic-link-dropdown>li:nth-of-type(4)>a"));
		//yTD.click();
		Supplierdashboardpage_YTDinsalescategory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonthismonthinbestperformingcustomer() throws InterruptedException {
		Thread.sleep(5000);
		Supplierdashboardpage_Thismonthinbestperformingcustomer.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonthisweekinbestperformingcustomer() {
		WebElement thisWeek = driver.findElement(By.linkText("This week"));
		thisWeek.click();
		//Supplierdashboardpage_Thisweekinbestperformingcustomer.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonthisquarterinbestperformingcustomer() {
		//WebElement thisQuarter1 = driver.findElement(By.linkText("This quarter"));
		//thisQuarter1.click(); 
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
		//JavascriptExecutor  = (JavascriptExecutor) driver;
		//js.executeScript("scroll(0, 250);");
		Supplierdashboardpage_Overfourteendaysinslippingaway.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonoverthirdtydaysinslippingaway() {
		WebElement overDays = driver.findElement(By.linkText("Over 30 days"));
		overDays.click();
		//Supplierdashboardpage_Overthirdtydaysinslippingaway.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));		
	}

	public static void Clickonoversixtydaysinslippingaway() {
		WebElement overDays = driver.findElement(By.linkText("Over 60 days"));
		overDays.click();
		//Supplierdashboardpage_Oversixtydaysinslippingaway.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonoverninetydaysinslippingaway() {
		WebElement overDays = driver.findElement(By.linkText("Over 90 days"));
		overDays.click();
		//Supplierdashboardpage_Overninetydaysinslippingaway.click();
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

	public static void Clickscrolldown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	}












































