package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Supplierorderseinvoicepage {

	private static WebDriver driver;

	public Supplierorderseinvoicepage(WebDriver driver) {


		Supplierorderseinvoicepage.driver = driver;
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



	@FindBy(xpath = "(//datatable-body-cell[contains(@class,'datatable-body-cell sort-active')]/following-sibling::datatable-body-cell)[3] ")
	private static WebElement Supplierorderseinvoicepage_Firstorderinorderlist;
	
	@FindBy(xpath = "//button[text()='Acknowledge ']")
	private static WebElement Supplierorderseinvoicepage_Acknowledgebutton;
	
	@FindBy(xpath = "//button[text()='Create e-Invoice ']")
	private static WebElement Supplierorderseinvoicepage_Createeinvoiceicon;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	private static WebElement Supplierorderseinvoicepage_Emailfield;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	private static WebElement Supplierorderseinvoicepage_Enteremailineinvoicefield;
	
	@FindBy(xpath = "(//span[text()='Delivery fee']/following::input)[1]")
	private static WebElement Supplierorderseinvoicepage_Deliveryfield;
	
	@FindBy(xpath = "(//span[text()='Delivery fee']/following::input)[1]")
	private static WebElement Supplierorderseinvoicepage_Enterdeliveryfees;
	
	@FindBy(xpath = "//button[text()=' Save and issue ']")
	private static WebElement Supplierorderseinvoicepage_Savaandissuebutton;
	
	@FindBy(xpath = "//button[@id='button-basic']")
	private static WebElement Supplierorderseinvoicepage_Optionsdropdown;
	
	//@FindBy(xpath = "//button[@id='button-basic']")
	//private static WebElement Supplierorderseinvoicepage_Downloadpackingslip;
	
	//@FindBy(xpath = "//button[@id='button-basic']")
	//private static WebElement Supplierorderseinvoicepage_Markasshipped;
	
	@FindBy(xpath = "//div[@class='d-flex nav__back']")
	private static WebElement Supplierorderseinvoicepage_Backorderbutton;
	
	@FindBy(xpath = "(//datatable-body-cell[contains(@class,'datatable-body-cell sort-active')]/following-sibling::datatable-body-cell)[35]")
	private static WebElement Supplierorderseinvoicepage_Fifthorderinorderlist;
	
	//@FindBy(xpath = "//button[@id='button-basic']")
	//private static WebElement Supplierorderseinvoicepage_Partiallyshipped;
	
	@FindBy(xpath = "(//datatable-body-cell[contains(@class,'datatable-body-cell sort-active')]/following-sibling::datatable-body-cell)[43]")
	private static WebElement Supplierorderseinvoicepage_Sixthorderinorderlist;
	
	//@FindBy(xpath = "//button[@id='button-basic']")
	//private static WebElement Supplierorderseinvoicepage_Voidorder;
	
	@FindBy(xpath = "//div[text()=' Requested by buyer ']")
	private static WebElement Supplierorderseinvoicepage_Requestedbybuyer;
	
	@FindBy(xpath = "//button[text()='Void order']")
	private static WebElement Supplierorderseinvoicepage_Voidorderbuttonfinally;
	
	//@FindBy(xpath = "//button[@id='button-basic']")
	//private static WebElement Supplierorderseinvoicepage_Downloadpdfbutton;
	
	@FindBy(xpath = "//button[@type='submit']")
	private static WebElement Supplierorderseinvoicepage_Okbuttonofpopupmessage;
	
	
	

	

	public static void Clickfirstorderinorderlist() {
		Supplierorderseinvoicepage_Firstorderinorderlist.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonacknowledgebutton() {
		Supplierorderseinvoicepage_Acknowledgebutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickoncreateeinvoiceicon() {
		Supplierorderseinvoicepage_Createeinvoiceicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonemaildfield() {
		Supplierorderseinvoicepage_Emailfield.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Enteremailineinvoicefield(String emailfield) {
		Supplierorderseinvoicepage_Enteremailineinvoicefield.sendKeys(emailfield);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickondedeliveryfield() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0, 1000);");
		Supplierorderseinvoicepage_Deliveryfield.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Enterdeliveyfees(String deliveryfees) {
		Supplierorderseinvoicepage_Enterdeliveryfees.sendKeys(deliveryfees);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonsaveandissuebutton() {
		Supplierorderseinvoicepage_Savaandissuebutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickoptionsdropdown() throws InterruptedException {
		Thread.sleep(5000);
		Supplierorderseinvoicepage_Optionsdropdown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickondownloadpackingslip() {
		WebElement downloadPackingSlip = driver.findElement(By.linkText("Download packing slip"));
		downloadPackingSlip.click(); 
        //Supplierorderseinvoicepage_Downloadpackingslip.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonmarkasshipped() {
		WebElement markAsShipped = driver.findElement(By.linkText("Mark as Shipped"));
		markAsShipped.click();
		//Supplierorderseinvoicepage_Markasshipped.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonbackorderbutton() {
		Supplierorderseinvoicepage_Backorderbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonfifthorderinorderlist() {
		Supplierorderseinvoicepage_Fifthorderinorderlist.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonpartiallyshipped() {
		WebElement markAsPartially = driver.findElement(By.linkText("Mark as Partially Shipped"));
		markAsPartially.click();
		//Supplierorderseinvoicepage_Partiallyshipped.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonsixthorderinorderlist() {
		Supplierorderseinvoicepage_Sixthorderinorderlist.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonvoidorder() {
		WebElement voidOrder = driver.findElement(By.linkText("Void order"));
		voidOrder.click();
		//Supplierorderseinvoicepage_Voidorder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonrequestedbybuyer() {
		Supplierorderseinvoicepage_Requestedbybuyer.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonvoidorderbuttonfinally() {
		Supplierorderseinvoicepage_Voidorderbuttonfinally.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickondownloadpdfbutton() {
		WebElement downloadPDF = driver.findElement(By.linkText("Download PDF"));
		downloadPDF.click();
		//Supplierorderseinvoicepage_Downloadpdfbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickokbuttonofpopmessage() {
		Supplierorderseinvoicepage_Okbuttonofpopupmessage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
