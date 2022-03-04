package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Supplierinvoiceslistingpage {

	private static WebDriver driver;

	public Supplierinvoiceslistingpage(WebDriver driver) {


		Supplierinvoiceslistingpage.driver = driver;
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


	@FindBy(xpath = "//button[text()=' New invoice ']")
	private static WebElement Supplierinvoiceslistingpage_Newinvoice; 

	@FindBy(xpath = "//div[@class='ng-value-container']/following-sibling::span[1] ") 
	private static WebElement Supplierinvoiceslistingpage_Delivertolocation;

	@FindBy(xpath = "//input[@placeholder='Email']")
	private static WebElement Supplierinvoiceslistingpage_Enteremail;

	@FindBy(xpath = "(//div[contains(@class,'col-4 p-0')]//input)[1]")
	private static WebElement Supplierinvoiceslistingpage_Enterordernumber; 

	@FindBy(xpath = "//select[contains(@class,'custom-select float-left')]")
	private static WebElement Supplierinvoiceslistingpage_Paymentplans;

	@FindBy(xpath = "//input[@placeholder='Name']")
	private static WebElement Supplierinvoiceslistingpage_Entersalespersonname;

	@FindBy(xpath = "//input[@placeholder='Phone']")
	private static WebElement Supplierinvoiceslistingpage_Entermobilenumber;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private static WebElement Supplierinvoiceslistingpage_Addskubutton;

	@FindBy(xpath = "(//div[@role='combobox'])[2]")
	private static WebElement Supplierinvoiceslistingpage_Skunamefield;

	@FindBy(xpath = "//div[contains(@class,'ng-option ng-option-marked')]")
	private static WebElement Supplierinvoiceslistingpage_Sakthimasalasku;

	@FindBy(xpath = "(//input[@class='form-control text-right'])[1] ")
	private static WebElement Supplierinvoiceslistingpage_Quantityfield;

	@FindBy(xpath = "(//input[@class='form-control text-right'])[1] ")
	private static WebElement Supplierinvoiceslistingpage_Enterthequantityvalue;

	@FindBy(xpath = "(//span[@class='flex-1']//input)[1] ")
	private static WebElement Supplierinvoiceslistingpage_Clearunitprice;

	@FindBy(xpath = "(//span[@class='flex-1']//input)[1] ")
	private static WebElement Supplierinvoiceslistingpage_Enterunitpricevalue;

	@FindBy(xpath = "(//input[@class='form-control text-right'])[2]")
	private static WebElement Supplierinvoiceslistingpage_Cleardeliveryfees;

	@FindBy(xpath = "(//input[@class='form-control text-right'])[2]")
	private static WebElement Supplierinvoiceslistingpage_Enterdeliveryfeesvalue;

	@FindBy(xpath = "//button[text()=' Save and issue ']")
	private static WebElement Supplierinvoiceslistingpage_Finalsaveandissuebutton;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private static WebElement Supplierinvoiceslistingpage_Firstinvoicecheckbox;

	//@FindBy(xpath = "//button[text()='Acknowledge ']")
	//private static WebElement Supplierinvoiceslistingpage_Clearbutton;

	@FindBy(xpath = "//button[text()=' Mark as Paid ']")
	private static WebElement Supplierinvoiceslistingpage_Markaspaidbutton;

	@FindBy(xpath = "//button[text()='Yes, Mark as Paid']")
	private static WebElement Supplierinvoiceslistingpage_Yesmarkaspaidbutton;

	@FindBy(xpath = "//button[text()=' Export to Xero ']")
	private static WebElement Supplierinvoiceslistingpage_Exportxerobutton;

	@FindBy(xpath = "//button[text()='Yes, proceed!']")
	private static WebElement Supplierinvoiceslistingpage_Yesproceedpopup;

	@FindBy(xpath = "(//a[@class='zmdropDownBtn'])[3]")
	private static WebElement Supplierinvoiceslistingpage_Actionsdropdownofthirdinvoice;

	@FindBy(xpath = "(//a[@routerlinkactive='active']/following-sibling::a)[3]")
	private static WebElement Supplierinvoiceslistingpage_Voidactionsdropdown;

	@FindBy(xpath = "//textarea[contains(@name,'voidInvoice')]")
	private static WebElement Supplierinvoiceslistingpage_Reasonfield;

	@FindBy(xpath = "//textarea[contains(@name,'voidInvoice')]")
	private static WebElement Supplierinvoiceslistingpage_Enterreasoninpopupmessage;

	@FindBy(xpath = "//button[text()='Void']")
	private static WebElement Supplierinvoiceslistingpage_Voidbuttonpopupmessage;

	//@FindBy(xpath = "//button[text()='Acknowledge ']")
	//private static WebElement Supplierinvoiceslistingpage_Duplicatelinkinactions;

	@FindBy(xpath = "(//button[contains(@class,'btn btn-success')])[3]")
	private static WebElement Supplierinvoiceslistingpage_Saveandissuebuttonofduplicate;

	@FindBy(xpath = "//a[@class='pull-right export-mclr']")
	private static WebElement Supplierinvoiceslistingpage_Filtericoninvoicespage;

	@FindBy(xpath = "//div[text()=' Deliver to  ']")
	private static WebElement Supplierinvoiceslistingpage_Delivertolink;

	//@FindBy(xpath = "//button[text()='Acknowledge ']")
	//private static WebElement Supplierinvoiceslistingpage_Selectalloptions;

	@FindBy(xpath = "//button[text()='Apply']")
	private static WebElement Supplierinvoiceslistingpage_Applybuttonininvoicespage;

	//@FindBy(xpath = "//button[text()='Acknowledge ']")
	//private static WebElement Supplierinvoiceslistingpage_Resetbuttonininvoicespage;

	@FindBy(xpath = "//div[text()=' Invoice status  ']")
	private static WebElement Supplierinvoiceslistingpage_Invoicesstatuslink;

	@FindBy(xpath = "//div[text()=' Payment status  ']")
	private static WebElement Supplierinvoiceslistingpage_Paymentstatuslink;

	@FindBy(xpath = "//div[text()=' Export status  ']")
	private static WebElement Supplierinvoiceslistingpage_Exportstatuslink;

	@FindBy(xpath = "//select[@formcontrolname='dueDate']")
	private static WebElement Supplierinvoiceslistingpage_Duedate;
	
	@FindBy(xpath = "//span[@class='ng-option-label ng-star-inserted']")
	private static WebElement Supplierinvoiceslistingpage_Sakthimasalaoutlet;





	public static void Clickoninnewinvoice() throws InterruptedException {
		Thread.sleep(5000);
		Supplierinvoiceslistingpage_Newinvoice.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}




	public static void Enteremailbilltofield(String email) {
		Supplierinvoiceslistingpage_Enteremail.sendKeys(email);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Enterordernumber(String ordernumber) {
		Supplierinvoiceslistingpage_Enterordernumber.sendKeys(ordernumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}


	public static void paymentterms() {
		Supplierinvoiceslistingpage_Paymentplans.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementPaymentterms() {
		return Supplierinvoiceslistingpage_Paymentplans;
	}

	public static void Entersalespersonnmae(String personname) {
		Supplierinvoiceslistingpage_Entersalespersonname.sendKeys(personname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Entermobilenumber(String mobilenumber) {
		Supplierinvoiceslistingpage_Entermobilenumber.sendKeys(mobilenumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void Clickonaddskubutton() {
		Supplierinvoiceslistingpage_Addskubutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickskunamefield() {
		Supplierinvoiceslistingpage_Skunamefield.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonsakthimasalasku() {
		Supplierinvoiceslistingpage_Sakthimasalasku.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clearthequantityfield() {
		Supplierinvoiceslistingpage_Quantityfield.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Enterthequantityvalue(String quantityvalue) {
		Supplierinvoiceslistingpage_Enterthequantityvalue.sendKeys(quantityvalue);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void Clearunitprice() {
		Supplierinvoiceslistingpage_Clearunitprice.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Enterunitpricevalue(String unitprice) {
		Supplierinvoiceslistingpage_Enterunitpricevalue.sendKeys(unitprice);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Cleardeliveryfees() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");
		Supplierinvoiceslistingpage_Cleardeliveryfees.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}


	public static void Clickonfinalsaveandissuebutton() {
		Supplierinvoiceslistingpage_Finalsaveandissuebutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void Clickonfirstinvoicecheckbox() throws InterruptedException {
		Thread.sleep(5000);
		Supplierinvoiceslistingpage_Firstinvoicecheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void Clickonclearbutton() {
		WebElement clear = driver.findElement(By.linkText("Clear"));
		clear.click();
		//Supplierinvoiceslistingpage_Clearbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonmarkaspaidbutton() {
		Supplierinvoiceslistingpage_Markaspaidbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonyesmarkaspaid() {
		Supplierinvoiceslistingpage_Yesmarkaspaidbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonexportxerofield() {
		Supplierinvoiceslistingpage_Exportxerobutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonyesproceedpopup() {
		Supplierinvoiceslistingpage_Yesproceedpopup.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonactionsdropdownthirdinvoice() throws InterruptedException {
		Thread.sleep(5000);
		Supplierinvoiceslistingpage_Actionsdropdownofthirdinvoice.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonvoidinactiondropdown() {
		Supplierinvoiceslistingpage_Voidactionsdropdown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonreasonfield() {
		Supplierinvoiceslistingpage_Reasonfield.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Enterreasoninpopupmessage(String reason) {
		Supplierinvoiceslistingpage_Enterreasoninpopupmessage.sendKeys(reason);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonvoidbuttonpopupmessage() {
		Supplierinvoiceslistingpage_Voidbuttonpopupmessage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void Clickonduplicateinactions() {
		WebElement duplicate = driver.findElement(By.linkText("Duplicate"));
		duplicate.click();
		//Supplierinvoiceslistingpage_Duplicatelinkinactions.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonfinallysaveandissuebuttonofduplicate() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");
		Supplierinvoiceslistingpage_Saveandissuebuttonofduplicate.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonfiltericon() throws InterruptedException {
		Thread.sleep(5000);
		Supplierinvoiceslistingpage_Filtericoninvoicespage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickondelivertolink() {
		Supplierinvoiceslistingpage_Delivertolink.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonselectalliconininvoicespage() {
		WebElement selectAll = driver.findElement(By.linkText("Select All"));
		selectAll.click();
		//Supplierinvoiceslistingpage_Selectalloptions.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonapplybuttonininvoicespage() {
		Supplierinvoiceslistingpage_Applybuttonininvoicespage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonresetbuttonininvoicespage() {
		WebElement reset = driver.findElement(By.linkText("Reset"));
		reset.click();
		//Supplierinvoiceslistingpage_Resetbuttonininvoicespage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickoninvoicestatuslink() {
		Supplierinvoiceslistingpage_Invoicesstatuslink.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonpaymentstatuslink() {
		Supplierinvoiceslistingpage_Paymentstatuslink.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonexportstatuslink() {
		Supplierinvoiceslistingpage_Exportstatuslink.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}


	public static void Duedateinfilter() {
		Supplierinvoiceslistingpage_Duedate.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementDuedate() {
		return Supplierinvoiceslistingpage_Duedate;
	}

	public static void Clickondeliverylocation() throws InterruptedException {
		Thread.sleep(5000);
		Supplierinvoiceslistingpage_Delivertolocation.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonsakthimasalaoutlet() {
		Supplierinvoiceslistingpage_Sakthimasalaoutlet.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Enterdeliveryfeesinthatfield(String deliveryfees) {
		Supplierinvoiceslistingpage_Enterdeliveryfeesvalue.sendKeys(deliveryfees);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}



















}
