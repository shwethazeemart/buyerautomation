package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Supplierinvoicesaddcreditnotepage {

	private static WebDriver driver;

	public Supplierinvoicesaddcreditnotepage(WebDriver driver) {


		Supplierinvoicesaddcreditnotepage.driver = driver;
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


	@FindBy(xpath = "(//datatable-body-cell[contains(@class,'datatable-body-cell sort-active')]/following-sibling::datatable-body-cell)[3]")
	private static WebElement Supplierinvoicesaddcreditnotepage_Firstinvoiceinlists;
	
	@FindBy(xpath = "//button[text()=' Mark as Paid ']")
	private static WebElement Supplierinvoicesaddcreditnotepage_Markaspaidtext;
	
	@FindBy(xpath = "//button[text()='Yes, Mark as Paid']")
	private static WebElement Supplierinvoicesaddcreditnotepage_Yesmarkaspaidpopup;
	
	@FindBy(xpath = "//button[@id='button-basic']")
	private static WebElement Supplierinvoicesaddcreditnotepage_Optionsdropdownicon;
	
	//@FindBy(xpath = "//button[text()=' New invoice ']")
	//private static WebElement Supplierinvoicesaddcreditnotepage_Addcreditnotelink;
	
	@FindBy(xpath = "(//input[contains(@class,'form-control b-none')])[2]")
	private static WebElement Supplierinvoicesaddcreditnotepage_Quantityfield;
	
	@FindBy(xpath = "(//input[contains(@class,'form-control b-none')])[2]")
	private static WebElement Supplierinvoicesaddcreditnotepage_Quantityfieldicon;
	
	@FindBy(xpath = "(//input[contains(@class,'form-control b-none')])[2]")
	private static WebElement Supplierinvoicesaddcreditnotepage_Enteronquantityvalue;
	
	@FindBy(xpath = "//button[text()=' Save and issue ']")
	private static WebElement Supplierinvoicesaddcreditnotepage_Saveandissuebutton;
	
	//@FindBy(xpath = "//button[text()=' New invoice ']")
	//private static WebElement Supplierinvoicesaddcreditnotepage_Duplicateoptions;
	
	@FindBy(xpath = "(//button[contains(@class,'btn btn-success')])[3]")
	private static WebElement Supplierinvoicesaddcreditnotepage_Saveandissuebuttoninduplicate;
	
	@FindBy(xpath = "//a[@class='dropdown-item pink-text']")
	private static WebElement Supplierinvoicesaddcreditnotepage_Voidlink;
	
	@FindBy(xpath = "//textarea[contains(@name,'voidInvoice')]")
	private static WebElement Supplierinvoicesaddcreditnotepage_Reasonpopupmessage;
	
	@FindBy(xpath = "//textarea[contains(@name,'voidInvoice')]")
	private static WebElement Supplierinvoicesaddcreditnotepage_Enteronreasonpopupmessage;
	
	//@FindBy(xpath = "//button[text()=' New invoice ']")
	//private static WebElement Supplierinvoicesaddcreditnotepage_DownloadDO;
	
	
	
	
	
	

	public static void Clickonfirstinvoiceinlists() {
		Supplierinvoicesaddcreditnotepage_Firstinvoiceinlists.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonmarkaspaid() {
		Supplierinvoicesaddcreditnotepage_Markaspaidtext.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickononoptionsdropdownicon() {
		Supplierinvoicesaddcreditnotepage_Optionsdropdownicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clickonaddcreditnote() {
		WebElement addCreditNote = driver.findElement(By.linkText("Add credit note"));
		addCreditNote.click();
		//Supplierinvoicesaddcreditnotepage_Addcreditnotelink.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonquantityfieldincreditnotepage() {
		Supplierinvoicesaddcreditnotepage_Quantityfield.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clearquantityfield() {
		Supplierinvoicesaddcreditnotepage_Quantityfieldicon.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Enteronquantityvalueinquantityfield(String quantityvalue) {
		Supplierinvoicesaddcreditnotepage_Enteronquantityvalue.sendKeys(quantityvalue);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonscrolldownincreditnotepage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonsaveandissuebutton() throws InterruptedException {
		Thread.sleep(5000);
		Supplierinvoicesaddcreditnotepage_Saveandissuebutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonduplicateoptionsindropdown() {
		WebElement duplicate = driver.findElement(By.linkText("Duplicate"));
		duplicate.click();
		//Supplierinvoicesaddcreditnotepage_Duplicateoptions.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonscrolldowninduplicatepage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonsaveandissuebuttoninduplicatepage() throws InterruptedException {
		Thread.sleep(5000);
		Supplierinvoicesaddcreditnotepage_Saveandissuebuttoninduplicate.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonvoidlinkininvoicepage() {
		Supplierinvoicesaddcreditnotepage_Voidlink.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonreasonpopupmessagefield() {
		Supplierinvoicesaddcreditnotepage_Reasonpopupmessage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	

	public static void ClickondownloadDOinoptionsfield() {
		WebElement downloadDO = driver.findElement(By.linkText("Download DO"));
		downloadDO.click();
		//Supplierinvoicesaddcreditnotepage_DownloadDO.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonyesmarkpaidpopup() {
		Supplierinvoicesaddcreditnotepage_Yesmarkaspaidpopup.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Enteronreasoninopoup(String reason) {
		Supplierinvoicesaddcreditnotepage_Enteronreasonpopupmessage.sendKeys(reason);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
}
