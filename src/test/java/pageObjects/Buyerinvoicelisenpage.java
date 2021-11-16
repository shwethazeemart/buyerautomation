package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyerinvoicelisenpage {

	private static WebDriver driver;

	public Buyerinvoicelisenpage(WebDriver driver) {


		Buyerinvoicelisenpage.driver = driver;
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

	
	

	@FindBy(xpath = "//input[@placeholder='Password']")
	private static WebElement Buyerinvoicelisenpage_exactPassword;
	 
	@FindBy(xpath = "//button[@type='submit']")
	private static WebElement Buyerinvoicelisenpage_loginbutton;
	
	@FindBy(xpath = "//button[text()=' Pay online ']")
	private static WebElement Buyerinvoicelisenpage_Payonline;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-pay-invoice-online/div[1]/span/img")
	private static WebElement Buyerinvoicelisenpage_payonlinecloseicon;
	///html/body/ngb-modal-window/div/div/app-pay-invoice-online/div[1]/span/img
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private static WebElement Buyerinvoicelisenpage_clickuploadinvoice;
	
	@FindBy(xpath = "//img[@src='assets/zmcore/img/close-blue@22.png']")
	private static WebElement Buyerinvoicelisenpage_clickuploadinvoicecloseicon;
	
	
	@FindBy(xpath = "//input[@formcontrolname='invoiceNumber']")
	private static WebElement Buyerinvoicelisenpage_Enterinvoicenumber;
	
	@FindBy(xpath = "//button[text()=' Search ']")
	private static WebElement Buyerinvoicelisenpage_clicksearchicon;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private static WebElement Buyerinvoicelisenpage_clickcheckbox;
	
	@FindBy(xpath = "//button[text()=' Download data ']")
	private static WebElement Buyerinvoicelisenpage_clickdownloaddata;
	

	@FindBy(xpath = "//button[text()='  Export to Accounting system ']")
	private static WebElement Buyerinvoicelisenpage_clickexportaccountingsystem;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	private static WebElement Buyerinvoicelisenpage_clickcancelbuttonaccountingsystem;
	
	@FindBy(xpath = "//a[@class='fc_blue clear']")
	private static WebElement Buyerinvoicelisenpage_clickclearbutton;
	
	@FindBy(xpath = "//div[text()=' INV-21-0000013 ']")
	private static WebElement Buyerinvoicelisenpage_clickoninvoice;
	
	@FindBy(xpath = "//img[@src='../assets/zmcore/img/left-report-b-icon.svg']")
	private static WebElement Buyerinvoicelisenpage_clickonreturninvoiceicon;
	
	@FindBy(xpath = "//div[text()=' CN-21-0000014 ']")
	private static WebElement Buyerinvoicelisenpage_clickoncreditnoteinvoice;
	
	@FindBy(xpath = "//img[@src='assets/zmcore/img/left-report-b-icon.svg']")
	private static WebElement Buyerinvoicelisenpage_clickoncreditnotereturninvoiceicon;
	
	@FindBy(xpath = "//div[text()=' INV-21-0000007 ']")
	private static WebElement Buyerinvoicelisenpage_clickonvoidedinvoice; 
	
	@FindBy(xpath = "//img[@src='../assets/zmcore/img/left-report-b-icon.svg']")
	private static WebElement Buyerinvoicelisenpage_clickonreturnvoidedinvoiceicon;
	
	@FindBy(xpath = "//a[@class='pull-right export-mclr']")
	private static WebElement Buyerinvoicelisenpage_clickonfiltericon; 
	
	@FindBy(xpath = "//input[@formcontrolname='invoiceNumber']")
	private static WebElement Buyerinvoicelisenpage_clearinvoicenumber;
	
	@FindBy(xpath = "//div[contains(@class,'input-group mb-2')]/following-sibling::button[1]")
	private static WebElement Buyerinvoicelisenpage_clicksecondtimesearchicon;
	
	
	@FindBy(xpath = "//input[@formcontrolname='invoiceNumber']")
	private static WebElement Buyerinvoicelisenpage_Entercreditnoteinvoicenumber;
	
	@FindBy(xpath = "//button[text()=' Search ']")
	private static WebElement Buyerinvoicelisenpage_clickthirdtimesearchicon;
	

	@FindBy(xpath = "//input[@formcontrolname='invoiceNumber']")
	private static WebElement Buyerinvoicelisenpage_Entervoidedinvoicenumber;
	
	@FindBy(xpath = "//input[@formcontrolname='invoiceNumber']") 
	private static WebElement Buyerinvoicelisenpage_clearinvoicenumberinfirsttime;
	
	@FindBy(xpath = "//div[text()=' Outlet  ']")
	private static WebElement Buyerinvoicelisenpage_Outleticon;
	
	
	
	//@FindBy(xpath = "//span[text()='From:']")
	//private static WebElement Buyerinvoicelisenpage_clickcalendarfromdate;
	

	//@FindBy(xpath = "//span[text()='To:']")
	//private static WebElement Buyerinvoicelisenpage_clickcalendartodate;
	
	
	
	@FindBy(xpath = "//div[contains(@class,'input-group mb-2')]/following-sibling::button[1]")
	private static WebElement Buyerinvoicelisenpage_clicksearchinsecondtime;
	
	@FindBy(xpath = "//input[@placeholder='Search ']/following-sibling::a[1]")
	private static WebElement Buyerinvoicelisenpage_Selectallicon;
	
	@FindBy(xpath = "//div[@class='main__tabber']//ul")
	private static WebElement Buyerinvoicelisenpage_Outsideicon;
	
	@FindBy(xpath = "//div[text()=' Supplier  ']")
	private static WebElement Buyerinvoicelisenpage_Suppliericon;
	
	@FindBy(xpath = "//div[text()=' Invoices & credit notes  ']")
	private static WebElement Buyerinvoicelisenpage_Invoiceandcreditnoteicon;
	
	@FindBy(xpath = "//div[text()=' Payment status  ']")
	private static WebElement Buyerinvoicelisenpage_Paymentsstatus;
	
	@FindBy(xpath = "//div[text()=' Export status  ']")
	private static WebElement Buyerinvoicelisenpage_Exportstatusinvoicepage;
	
	
	
	
	public void enter_exactPassword(String loginPassword) {
		Buyerinvoicelisenpage_exactPassword.sendKeys(loginPassword);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
 
	public void clickloginbutton() {
		Buyerinvoicelisenpage_loginbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void clickPayonline() {
		Buyerinvoicelisenpage_Payonline.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void clickpayonlinecloseicon() {
		Buyerinvoicelisenpage_payonlinecloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void clickuploadinvoice() {
		Buyerinvoicelisenpage_clickuploadinvoice.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void clickuploadinvoicecloseicon() {
		Buyerinvoicelisenpage_clickuploadinvoicecloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Enterinvoicenumber() {
		Buyerinvoicelisenpage_Enterinvoicenumber.sendKeys("INV-21-0000013");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { 
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
 
	public void clicksearchicon() {
		Buyerinvoicelisenpage_clicksearchicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void clickcheckbox() {
		Buyerinvoicelisenpage_clickcheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void clickdownloaddata() {
		Buyerinvoicelisenpage_clickdownloaddata.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void clickexportaccountingsystem() {
		Buyerinvoicelisenpage_clickexportaccountingsystem.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void clickcancelbuttonaccountingsystem() {
		Buyerinvoicelisenpage_clickcancelbuttonaccountingsystem.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void clickclearbutton() {
		Buyerinvoicelisenpage_clickclearbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void clickoninvoice() {
		Buyerinvoicelisenpage_clickoninvoice.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void clickonreturninvoiceicon() {
		Buyerinvoicelisenpage_clickonreturninvoiceicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void clickoncreditnoteinvoice() {
		Buyerinvoicelisenpage_clickoncreditnoteinvoice.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void clickoncreditnotereturninvoiceicon() {
		Buyerinvoicelisenpage_clickoncreditnotereturninvoiceicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void clickonvoidedinvoice() {
		Buyerinvoicelisenpage_clickonvoidedinvoice.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
			
	}

	public void clickonreturnviodedinvoiceicon() {
		Buyerinvoicelisenpage_clickonreturnvoidedinvoiceicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
			
	}

	public void clickonfiltericon() {
		Buyerinvoicelisenpage_clickonfiltericon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void clearinvoicenumber() {
		Buyerinvoicelisenpage_clearinvoicenumber.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void clicksecondtimesearchicon() {
		Buyerinvoicelisenpage_clicksecondtimesearchicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Entercreditnoteinvoicenumber() {
		Buyerinvoicelisenpage_Entercreditnoteinvoicenumber.sendKeys("INV-121-0000659");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void clickthirdtimesearchicon() {
		Buyerinvoicelisenpage_clickthirdtimesearchicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void Entervoidedinvoicenumber() {
		Buyerinvoicelisenpage_Entervoidedinvoicenumber.sendKeys("INV-121-0000657");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver) 
				.executeScript("return document.readyState").equals("complete"));
	}

	public void clearinvoicenumberinfirsttime() {
		Buyerinvoicelisenpage_clearinvoicenumberinfirsttime.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver) 
				.executeScript("return document.readyState").equals("complete"));
	}

	public void clicksearcchiconinsecondtime() {
		Buyerinvoicelisenpage_clicksearchinsecondtime.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver) 
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void clickoncalendarfromdate() {
		//Buyerinvoicelisenpage_clickcalendarfromdate.click();
		WebElement DateBox=driver.findElement(By.xpath("//input[@placeholder='Select date']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='08Aug2021-10Aug2021';", DateBox);
		
		
		//driver.findElement(By.xpath("//span[text()='From:']"));
	}

	public void Clickonoutlet() {
		Buyerinvoicelisenpage_Outleticon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver) 
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clickonselectall() {
		Buyerinvoicelisenpage_Selectallicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver) 
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void Clickonoutsideoption() {
		Buyerinvoicelisenpage_Outsideicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver) 
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void Clickonsupplier() {
		Buyerinvoicelisenpage_Suppliericon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver) 
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clickoninvoiceandcreditnote() {
		Buyerinvoicelisenpage_Invoiceandcreditnoteicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver) 
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clickonpaymentsstatus() {
		Buyerinvoicelisenpage_Paymentsstatus.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver) 
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void ClickonExportstatusininvoicepage() {
		Buyerinvoicelisenpage_Exportstatusinvoicepage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}  
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver) 
				.executeScript("return document.readyState").equals("complete"));
		
	}

	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
	
		
	
		
















































































