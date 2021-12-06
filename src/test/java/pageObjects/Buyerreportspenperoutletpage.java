package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyerreportspenperoutletpage {

	private static WebDriver driver;

	public Buyerreportspenperoutletpage(WebDriver driver) {


		Buyerreportspenperoutletpage.driver = driver;
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
	
	
	
	//@FindBy(xpath = "//input[@placeholder='Product code or name']")
	//private static WebElement Buyerreportspenperoutletpage_Spendingperoutlet;
	
	@FindBy(xpath = "//a[contains(@class,'pull-right export-mclr')]")
	private static WebElement Buyerreportspenperoutletpage_Filter;
	
	@FindBy(xpath = "//div[text()=' Suppliers  ']")
	private static WebElement Buyerreportspenperoutletpage_Suppliers;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private static WebElement Buyerreportspenperoutletpage_Sabaricheckbox;
	
	@FindBy(xpath = "//button[text()='Apply']")
	private static WebElement Buyerreportspenperoutletpage_Applybutton;
	
	@FindBy(xpath = "//a[contains(text(),'Reset')]")
	private static WebElement Buyerreportspenperoutletpage_Resetbutton;
	
	@FindBy(xpath = "//div[@class='flex__bwn flex__pad']")
	private static WebElement Buyerreportspenperoutletpage_Outside;
	
	@FindBy(xpath = "//div[text()=' Invoice/credit note  ']")
	private static WebElement Buyerreportspenperoutletpage_Invoiceandcreditnote;
	
	@FindBy(xpath = "(//input[@name='zmSelectPopup'])[1]")
	private static WebElement Buyerreportspenperoutletpage_Checkboxofprocessed;
	
	@FindBy(xpath = "(//input[@name='zmSelectPopup'])[2]")
	private static WebElement Buyerreportspenperoutletpage_Checkboxofissued;
	
	@FindBy(xpath = "//div[text()=' Payment status  ']")
	private static WebElement Buyerreportspenperoutletpage_Paymentstatus;
	
	@FindBy(xpath = "(//input[@name='zmSelectPopup'])[1]")
	private static WebElement Buyerreportspenperoutletpage_Unpaidcheckbox;
	
	@FindBy(xpath = "(//input[@name='zmSelectPopup'])[2]")
	private static WebElement Buyerreportspenperoutletpage_Paidcheckbox;
	
	@FindBy(xpath = "//div[text()=' Export status  ']")
	private static WebElement Buyerreportspenperoutletpage_Exportstatus;
	
	@FindBy(xpath = "(//input[@name='zmSelectPopup'])[1]")
	private static WebElement Buyerreportspenperoutletpage_Clickonexportedcheckbox;
	
	@FindBy(xpath = "(//input[@name='zmSelectPopup'])[2]")
	private static WebElement Buyerreportspenperoutletpage_Clickonnotexportedcheckbox;
	
	
	
	@FindBy(xpath = "//span[contains(@name,'daterange')]")
	private static WebElement Buyerreportspenperoutletpage_Calendaricon;
	
	
	@FindBy(xpath = "//li[text()='Today']")
	private static WebElement Buyerreportspenperoutletpage_Todaydatefromcalendar;
	
	@FindBy(xpath = "//li[text()='Yesterday']")
	private static WebElement Buyerreportspenperoutletpage_Yesterdaydatefromcalendar;
	
	@FindBy(xpath = "//li[text()='This Week']")
	private static WebElement Buyerreportspenperoutletpage_Thisweekfromcalendar;
	
	@FindBy(xpath = "//li[text()='This Month']")
	private static WebElement Buyerreportspenperoutletpage_Thismonthfromcalendar;
	
	@FindBy(xpath = "//li[@data-range-key='Custom Range']")
	private static WebElement Buyerreportspenperoutletpage_Customrangefromcalendar;
	
	@FindBy(xpath = "//li[@data-range-key='YTD']")
	private static WebElement Buyerreportspenperoutletpage_YTDfromcalendar;
	
	@FindBy(xpath = "(//img[@src='./assets/zmcore/img/download-icon.svg'])[2]")
	private static WebElement Buyerreportspenperoutletpage_downloadbutton;
	
	//@FindBy(xpath = "//span[contains(@name,'daterange')]")
	//private static WebElement Buyerreportspenperoutletpage_Velumasalasummarybutton;
	
	//@FindBy(xpath = "//span[contains(@name,'daterange')]")
	//private static WebElement Buyerreportspenperoutletpage_Velumasaladetailedbutton;
	
	//@FindBy(xpath = "//span[contains(@name,'daterange')]")
	//private static WebElement Buyerreportspenperoutletpage_Velumasalalistinvoicesbutton;
	
	@FindBy(xpath = "(//div[contains(@class,'datatable-body-cell-label')])[10]")
	private static WebElement Buyerreportspenperoutletpage_Outleticon;
	
	@FindBy(xpath = "//div[@class='d-flex']//a[1]")
	private static WebElement Buyerreportspenperoutletpage_Exportdownloadbutton;
	
	@FindBy(xpath = "//select[contains(@id,'country')]")
	private static WebElement Buyerreportspenperoutletpage_Selectmonthdropdown;
	
	@FindBy(xpath = "//p[text()='Spending report']")
	private static WebElement Buyerreportspenperoutletpage_Spendingreportbackbutton;
	
	@FindBy(xpath = "//p[text()='Reports']")
	private static WebElement Buyerreportspenperoutletpage_Reportsbackbutton;
	
	@FindBy(xpath = "//button[contains(@class,'applyBtn btn')]") 
	private static WebElement Buyerreportspenperoutletpage_Applycustomrangebutton;
	
	@FindBy(xpath = "//li[text()='Last Year']")
	private static WebElement Buyerreportspenperoutletpage_Lastyearfromcalendar;
	
	 
	
	
	
	
	
	public static void Clickonspendingoutletcion() {
		WebElement spendingPerOutletSee = driver.findElement(By.className("blueBox"));
        spendingPerOutletSee.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void clickoncalendarfromdate() throws InterruptedException{
		Thread.sleep(5000);
		Buyerreportspenperoutletpage_Calendaricon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		//WebElement DateBox=driver.findElement(By.xpath("//span[contains(@name,'daterange')]"));

		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].value='30Jul2021-30Aug2021';", DateBox);
		
		
	}
	public static void Clickonfilter() {
		Buyerreportspenperoutletpage_Filter.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Clickonsuppliers() {
		Buyerreportspenperoutletpage_Suppliers.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickonsabaricheckbox() {
		Buyerreportspenperoutletpage_Sabaricheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
				
	}
	public static void Clickapplybutton() {
		Buyerreportspenperoutletpage_Applybutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickresetbutton() {
		WebElement reset = driver.findElement(By.linkText("Reset"));
		reset.click();
		Buyerreportspenperoutletpage_Resetbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonoutside() {
		Buyerreportspenperoutletpage_Outside.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickinvoiceandcreditnote() {
		Buyerreportspenperoutletpage_Invoiceandcreditnote.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clcikcheckboxofprocessed() {
		Buyerreportspenperoutletpage_Checkboxofprocessed.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickcheckboxofissued() {
		Buyerreportspenperoutletpage_Checkboxofissued.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickpaymentstatus() {
		Buyerreportspenperoutletpage_Paymentstatus.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickunpaidcheckbox() {
		Buyerreportspenperoutletpage_Unpaidcheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickpaidcheckbox() {
		Buyerreportspenperoutletpage_Paidcheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonexportstatus() {
		Buyerreportspenperoutletpage_Exportstatus.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickonexportedcheckbox() {
		Buyerreportspenperoutletpage_Clickonexportedcheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonnotexportedcheckbox() {
		Buyerreportspenperoutletpage_Clickonnotexportedcheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void ClickexportpageCSV() {
		WebElement exportPageAs = driver.findElement(By.linkText("Export page as CSV"));
		exportPageAs.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickondetailedreport() {
		WebElement detailedReportall = driver.findElement(By.linkText("Detailed report (all outlets)"));
		detailedReportall.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void Clickontodaydatefromcalendar() throws InterruptedException {
		Thread.sleep(5000);
		Buyerreportspenperoutletpage_Todaydatefromcalendar.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickonyesterdaydatefromcalendar() throws InterruptedException {
		Thread.sleep(5000);
		Buyerreportspenperoutletpage_Yesterdaydatefromcalendar.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonthisweekfromcalendar() throws InterruptedException {
		Thread.sleep(5000);
		Buyerreportspenperoutletpage_Thisweekfromcalendar.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonthismonthfromcalendar() throws InterruptedException {
		Thread.sleep(5000);
		Buyerreportspenperoutletpage_Thismonthfromcalendar.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickoncustomrangefromcalendar() throws InterruptedException {
		Thread.sleep(5000);
		Buyerreportspenperoutletpage_Customrangefromcalendar.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void ClickonYTDfromcalendar() throws InterruptedException{
		Thread.sleep(5000);
		Buyerreportspenperoutletpage_YTDfromcalendar.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickondownloadbutton() throws InterruptedException {
		Thread.sleep(5000);
		Buyerreportspenperoutletpage_downloadbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonvelumasalasummarybutton() {
		WebElement summary = driver.findElement(By.linkText("Summary"));
		summary.click();
		//Buyerreportspenperoutletpage_Velumasalasummarybutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonvelumasaladetailedbutton() {
		WebElement detailed = driver.findElement(By.linkText("Detailed"));
		detailed.click();
		//Buyerreportspenperoutletpage_Velumasaladetailedbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonvelumasalalistofinvoicesbutton() {
		WebElement listOfInvoices = driver.findElement(By.linkText("List of invoices"));
		listOfInvoices.click();
		//Buyerreportspenperoutletpage_Velumasalalistinvoicesbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonoutleticon() throws InterruptedException {
		Thread.sleep(5000);
		Buyerreportspenperoutletpage_Outleticon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonexportdownloadbutton() throws InterruptedException {
		Thread.sleep(5000);
		Buyerreportspenperoutletpage_Exportdownloadbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	
	public static void Selectsoutletmonth() throws InterruptedException {
		Buyerreportspenperoutletpage_Selectmonthdropdown.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementmonth() {
		return Buyerreportspenperoutletpage_Selectmonthdropdown;
	
	}
	public static void Clickonbackbuttonofspendingreport() throws InterruptedException {
		Thread.sleep(5000);
		Buyerreportspenperoutletpage_Spendingreportbackbutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}
	public static void Clickbackbuttonofreports() {
		Buyerreportspenperoutletpage_Reportsbackbutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickonapplybuttonincustomrange() {
		Buyerreportspenperoutletpage_Applycustomrangebutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void ClickonLastyearfromcalendar() throws InterruptedException {
		Thread.sleep(5000);
		Buyerreportspenperoutletpage_Lastyearfromcalendar.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickoncheckbox() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
