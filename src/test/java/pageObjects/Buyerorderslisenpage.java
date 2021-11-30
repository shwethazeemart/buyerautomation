package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyerorderslisenpage {

	private static WebDriver driver;

	public Buyerorderslisenpage(WebDriver driver) {


		Buyerorderslisenpage.driver = driver;
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

	
	

	@FindBy(xpath = "//button[@id='button-basic']")
	private static WebElement Buyerorderslisenpage_Neworderdropdown;
	
	@FindBy(xpath = "//div[text()='Orders']")
	private static WebElement Buyerorderslisenpage_Outsideicon;
	
	@FindBy(xpath = "(//button[@id='button-basic'])[2]")
	private static WebElement Buyerorderslisenpage_Downloadicon;
	
	@FindBy(xpath = "//ul[contains(@class,'dropdown-menu dropdown-menu-right')]//a[1]")
	private static WebElement Buyerorderslisenpage_Downloadrecevinglist;
	
	@FindBy(xpath = "//select[contains(@id,'outlet')]")
	private static WebElement Buyerorderslisenpage_Velumasala2020;
	
	@FindBy(xpath = "//button[text()=' Download ']")
	private static WebElement Buyerorderslisenpage_Downloadbutton;
	
	@FindBy(xpath = "//span[text()='All orders ']")
	private static WebElement Buyerorderslisenpage_Allordersicon;
	 
	@FindBy(xpath = "//span[text()='Needs approval']")
	private static WebElement Buyerorderslisenpage_Needapprovalicon;
	
	@FindBy(xpath = "//span[text()='Drafts']")
	private static WebElement Buyerorderslisenpage_Draftsicon;
	
	@FindBy(xpath = "//span[text()='Recurring orders']")
	private static WebElement Buyerorderslisenpage_Recurringordericon;
	
	@FindBy(xpath = "//input[@formcontrolname='orderId']")
	private static WebElement Buyerorderslisenpage_Searchboxorderid;
	
	@FindBy(xpath = "//input[@formcontrolname='orderId']")
	private static WebElement Buyerorderslisenpage_Entertheorderidinsearchbox;
	
	@FindBy(xpath = "//button[text()='Search']")
	private static WebElement Buyerorderslisenpage_Searchicon;
	
	@FindBy(xpath = "//input[@formcontrolname='orderId']")
	private static WebElement Buyerorderslisenpage_Searchbox;
	
	@FindBy(xpath = "//img[@src='assets/zmcore/img/close-grey.svg']")
	private static WebElement Buyerorderslisenpage_Closebuttonofdeliverydate;
	
	@FindBy(xpath = "//img[@src='assets/zmcore/img/close-grey.svg']")
	private static WebElement Buyerorderslisenpage_Closebuttononplaceddate;
	
	@FindBy(xpath = "//div[text()=' Outlet  ']")
	private static WebElement Buyerorderslisenpage_Outletfiltericon;
	
	@FindBy(xpath = "//div[text()=' Supplier  ']")
	private static WebElement Buyerorderslisenpage_Suppliericon;
	
	@FindBy(xpath = "//div[text()=' Order status  ']")
	private static WebElement Buyerorderslisenpage_Orderstatusicon;
	
	@FindBy(xpath = "//div[text()=' Invoicing status  ']")
	private static WebElement Buyerorderslisenpage_Invoicingstatus;
	
	@FindBy(xpath = "//div[text()=' Order type  ']")
	private static WebElement Buyerorderslisenpage_Ordertype;
	
	@FindBy(xpath = "(//input[@class='custom-control-input'])[2]")
	private static WebElement Buyerorderslisenpage_Checkboxoffirstorder;
	
	@FindBy(xpath = "//button[text()=' Download orders ']")
	private static WebElement Buyerorderslisenpage_Downloadorderbutton;
	
	@FindBy(xpath = "//button[text()=' Download orders (detailed) ']")
	private static WebElement Buyerorderslisenpage_Downloadorderdetailedbutton;
	
	@FindBy(xpath = "//button[text()=' Mark as received ']")
	private static WebElement Buyerorderslisenpage_Markasreceviedbutton;
	
	@FindBy(xpath = "//button[text()=' Clear ']")
	private static WebElement Buyerorderslisenpage_Clearbutton;
	
	@FindBy(xpath = "(//datatable-body-cell[contains(@class,'datatable-body-cell sort-active')])[3]")
	private static WebElement Buyerorderslisenpage_Sabarisupplier;
	
	@FindBy(xpath = "//button[text()=' Repeat ']")
	private static WebElement Buyerorderslisenpage_Repeatorder;
	
	@FindBy(xpath = "//button[text()=' Receive ']")
	private static WebElement Buyerorderslisenpage_Receiveorder;
	
	@FindBy(xpath = "//button[text()='Yes, mark as received']")
	private static WebElement Buyerorderslisenpage_Yesmarkedbutton;
	
	//@FindBy(xpath = "//li[@class='active']//a[1]")
	//private static WebElement Buyerorderslisenpage_Activity;
	
	@FindBy(xpath = "//span[text()=' Cancel this and linked orders']")
	private static WebElement Buyerorderslisenpage_Cancelandlinkedbutton;
	
	@FindBy(xpath = "(//div[text()=' Change of quantity/date/SKU '])[1]")
	private static WebElement Buyerorderslisenpage_Reason;
	
	@FindBy(xpath = "//button[text()='Confirm Cancellation']")
	private static WebElement Buyerorderslisenpage_Confirmcancelbutton;
	
	@FindBy(xpath = "(//datatable-body-cell[contains(@class,'datatable-body-cell sort-active ng-star-inserted')])[21]")
	private static WebElement Buyerorderslisenpage_Sabarisupplierorder;
	
	@FindBy(xpath = "//a[contains(@class,'btn pdf_btn')]")
	private static WebElement Buyerorderslisenpage_PDFdownloadbutton;
	
	
	

	@FindBy(xpath = "//h4[text()='Download receiving list']/following-sibling::button")

	private static WebElement Buyerorderslisenpage_Closeicon;
	
	@FindBy(xpath = "(//div[@class='btn-group ml-auto']//a)[1]")
	private static WebElement Buyerorderslisenpage_Filterinorderpage;
	
	@FindBy(xpath = "//input[@placeholder='Search ']/following-sibling::a[1]")
	private static WebElement Buyerorderslisenpage_Selectalllink;
	
	@FindBy(xpath = "//button[text()='Apply']") 
	private static WebElement Buyerorderslisenpage_Applybuttoninorder;
	
	@FindBy(xpath = "//a[@class='filter-reset ml-3']")
	private static WebElement Buyerorderslisenpage_Resetbuttoninorder;
	
	
	
	
	
	
	

	public static void Clickonneworderdropdown() {
		Buyerorderslisenpage_Neworderdropdown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonoutsideicon() {
		Buyerorderslisenpage_Outsideicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clickondownloadicon() {
		Buyerorderslisenpage_Downloadicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ClickonDownloadrecevinglist() {
		Buyerorderslisenpage_Downloadrecevinglist.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Selectdatefromcalendar() throws InterruptedException {
		Thread.sleep(5000);
		WebElement DateBox=driver.findElement(By.xpath("(//input[@placeholder='Delivery date'])[2]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='29 Sept 2021';", DateBox);
		
	}

	
	public static void click_velumasala2020() throws InterruptedException {
		Thread.sleep(5000);
		Buyerorderslisenpage_Velumasala2020.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementvelumasala2020() {
		return Buyerorderslisenpage_Velumasala2020;
	}

	public static void Clickondownloadbutton() {
		Buyerorderslisenpage_Downloadbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonallordersicon() {
		Buyerorderslisenpage_Allordersicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonneedapprovalicon() {
		Buyerorderslisenpage_Needapprovalicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickondraftsicon() {
		Buyerorderslisenpage_Draftsicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonrecurringordersicon() {
		Buyerorderslisenpage_Recurringordericon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonsearchboxorderid() {
		Buyerorderslisenpage_Searchboxorderid.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Entertheorderidinsearchbox(String orderid) {
		Buyerorderslisenpage_Entertheorderidinsearchbox.sendKeys(orderid);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clickonsearchicon() {
		Buyerorderslisenpage_Searchicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clearthesearchbox() {
		Buyerorderslisenpage_Searchbox.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Selectdeliverydatefromcalendar() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@formcontrolname='deliveryDateRange']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='02Sep2021-18Sep2021';", DateBox);
		
	}

	public static void Clickclosebuttondeliverydate() {
		Buyerorderslisenpage_Closebuttonofdeliverydate.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonplaceddatefromcalendar() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@formcontrolname='orderDateRange']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='01Sep2021-18Sep2021';", DateBox);
		
	}

	public static void Clickonclosebuttontoplaceddate() {
		Buyerorderslisenpage_Closebuttononplaceddate.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonoutletinfilter() {
		Buyerorderslisenpage_Outletfiltericon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonsupplier() {
		Buyerorderslisenpage_Suppliericon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clickorderstatus() {
		Buyerorderslisenpage_Orderstatusicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickoninvoicingstatus() {
		Buyerorderslisenpage_Invoicingstatus.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonordertype() {
		Buyerorderslisenpage_Ordertype.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickoncheckboxoffirstorder() throws InterruptedException {
		Thread.sleep(5000);
		Buyerorderslisenpage_Checkboxoffirstorder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickondownloadorderbutton() {
		Buyerorderslisenpage_Downloadorderbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickdownloadorderdetailed() {
		Buyerorderslisenpage_Downloadorderdetailedbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonmarkasreceviedbutton() {
		Buyerorderslisenpage_Markasreceviedbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonclearbutton() {
		Buyerorderslisenpage_Clearbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonsabarisupplierorder() {
		Buyerorderslisenpage_Sabarisupplier.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonrepeatorder() {
		Buyerorderslisenpage_Repeatorder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void ClickReceiveorder() {
		Buyerorderslisenpage_Receiveorder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clickyesmarkedbutton() {
		Buyerorderslisenpage_Yesmarkedbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ClickonActivity() {
		WebElement activity = driver.findElement(By.linkText("Activity"));
		activity.click();
		//Buyerorderslisenpage_Activity.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clickoncancelandlinkedbutton() {
		Buyerorderslisenpage_Cancelandlinkedbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonreason() {
		Buyerorderslisenpage_Reason.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonconfirmcancelbutton() {
		Buyerorderslisenpage_Confirmcancelbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonsabarisupplier() {
		Buyerorderslisenpage_Sabarisupplierorder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ClickonPDFdownloadbutton() {
		Buyerorderslisenpage_PDFdownloadbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clickoncloseicon() {
		Buyerorderslisenpage_Closeicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonfilterinorderpage() throws InterruptedException {
		Thread.sleep(5000);
		Buyerorderslisenpage_Filterinorderpage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonselectall() {
		Buyerorderslisenpage_Selectalllink.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void ClickonApplybuttoninorder() {
		Buyerorderslisenpage_Applybuttoninorder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonresetbuttoninorder() {
		Buyerorderslisenpage_Resetbuttoninorder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
