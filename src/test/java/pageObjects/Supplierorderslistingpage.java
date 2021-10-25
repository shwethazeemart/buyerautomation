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



	@FindBy(xpath = "//button[@id='button-basic']")
	private static WebElement Supplierorderslistingpage_Downloadbutton;

	//@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	//private static WebElement Supplierorderslistingpage_Downloadpicklistbutton;
	
	@FindBy(xpath = "//select[contains(@id,'outlet')]")
	private static WebElement Supplierorderslistingpage_Outletlist;
	
	@FindBy(xpath = "(//button[text()=' Download '])[2]")
	private static WebElement Supplierorderslistingpage_FinalDownloadbutton;
	
	@FindBy(xpath = "//img[@src='/assets/zmcore/img/close-blue.svg']")
	private static WebElement Supplierorderslistingpage_Closeicondownloadpicklist;
	
	@FindBy(xpath = "//input[@placeholder='Order number']")
	private static WebElement Supplierorderslistingpage_Ordernumbersearchbox;
	
	@FindBy(xpath = "//input[@placeholder='Order number']")
	private static WebElement Supplierorderslistingpage_Entertheordernumber;
	
	@FindBy(xpath = "//button[text()=' Search ']")
	private static WebElement Supplierorderslistingpage_Searchicon;
	
	@FindBy(xpath = "//input[@placeholder='Order number']")
	private static WebElement Supplierorderslistingpage_Ordernumber;
	
	@FindBy(xpath = "//select[@formcontrolname='outletId']")
	private static WebElement Supplierorderslistingpage_Deliverylocation;
	
	@FindBy(xpath = "//a[@class='pull-right export-mclr']")
	private static WebElement Supplierorderslistingpage_Filtericon;
	
	@FindBy(xpath = "//div[text()=' Order status  ']")
	private static WebElement Supplierorderslistingpage_Orderstatus;
	
	//@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	//private static WebElement Supplierorderslistingpage_Selectallopiton;
	
	//@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	//private static WebElement Supplierorderslistingpage_Resetbutton;
	
	@FindBy(xpath = "//div[text()=' Delivery status  ']")
	private static WebElement Supplierorderslistingpage_Deliverystatus;
	
	@FindBy(xpath = "//div[text()=' Invoicing status  ']")
	private static WebElement Supplierorderslistingpage_Invoicingstatus;
	
	@FindBy(xpath = "//div[text()=' Acknowledgement status  ']")
	private static WebElement Supplierorderslistingpage_Acknowledgementstatus;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private static WebElement Supplierorderslistingpage_Checkboxofsecondorder;
	
	@FindBy(xpath = "//button[text()=' Clear ']")
	private static WebElement Supplierorderslistingpage_Clearoption;
	
	@FindBy(xpath = "(//button[@id='button-basic'])[2]")
	private static WebElement Supplierorderslistingpage_Markasicon;
	
	@FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
	private static WebElement Supplierorderslistingpage_Acknowledgedicon;
	
	@FindBy(xpath = "//button[@type='submit']")
	private static WebElement Supplierorderslistingpage_Okbuttonpopupmessage;
	
	@FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
	private static WebElement Supplierorderslistingpage_Shippedicon;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[4]")
	private static WebElement Supplierorderslistingpage_Checkboxofthirdorder;
	
	//@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	//private static WebElement Supplierorderslistingpage_Partiallyshipped;
	
	@FindBy(xpath = "//b[text()=' Download CSV']")
	private static WebElement Supplierorderslistingpage_Downloadcsvbutton;
	
	@FindBy(xpath = "//b[text()='Download CSV (detailed)']")
	private static WebElement Supplierorderslistingpage_Downloadcsvdetailedbutton;
	
	@FindBy(xpath = "(//a[@class='zmdropDownBtn'])[3]")
	private static WebElement Supplierorderslistingpage_Actionsdropdownoffirstorder;
	
	//@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	//private static WebElement Supplierorderslistingpage_Voidorder;
	
	@FindBy(xpath = "//div[text()=' Requested by buyer ']")
	private static WebElement Supplierorderslistingpage_Requestedbybuyer;
	
	@FindBy(xpath = "//button[text()='Void order']")
	private static WebElement Supplierorderslistingpage_Finalvoidbutton;
	
	
	@FindBy(xpath = "//button[text()='Apply']")
	private static WebElement Supplierorderslistingpage_Applybutton;





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
		WebElement downloadPickList = driver.findElement(By.linkText("Download pick list"));
		downloadPickList.click();
		//Supplierorderslistingpage_Downloadpicklistbutton.click();
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
		WebElement DateBox=driver.findElement(By.xpath("//input[@formcontrolname='orderDateRange']"));

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
		WebElement DateBox=driver.findElement(By.xpath("//input[@formcontrolname='deliveryDateRange']"));

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
		Supplierorderslistingpage_Orderstatus.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Selectalloption() {
		WebElement selectAll = driver.findElement(By.linkText("Select All"));
		selectAll.click();
		//Supplierorderslistingpage_Selectallopiton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonresetbutton() {
		WebElement reset = driver.findElement(By.linkText("Reset"));
		reset.click();
		//Supplierorderslistingpage_Resetbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickondeliverystatus() {
		Supplierorderslistingpage_Deliverystatus.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickoninvoicingstatus() {
		Supplierorderslistingpage_Invoicingstatus.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonacknowledgementstatus() {
		Supplierorderslistingpage_Acknowledgementstatus.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickoncheckboxofsecondorder() {
		Supplierorderslistingpage_Checkboxofsecondorder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonclearoption() {
		Supplierorderslistingpage_Clearoption.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonmarkasicon() {
		Supplierorderslistingpage_Markasicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonacknowledgedicon() {
		Supplierorderslistingpage_Acknowledgedicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonokbuttonpopupmessage() {
		Supplierorderslistingpage_Okbuttonpopupmessage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clickonshippedicon() {
		Supplierorderslistingpage_Shippedicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickoncheckboxthirdorder() {
		Supplierorderslistingpage_Checkboxofthirdorder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonpartiallyshipped() {
		WebElement partiallyShipped = driver.findElement(By.linkText("Partially Shipped"));
		partiallyShipped.click();
		//Supplierorderslistingpage_Partiallyshipped.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickondownloadcsvbutton() {
		Supplierorderslistingpage_Downloadcsvbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickondownloadcsvdetailedbutton() {
		Supplierorderslistingpage_Downloadcsvdetailedbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clickonactiondropdowninfirstorder() {
		Supplierorderslistingpage_Actionsdropdownoffirstorder.click();
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
		//Supplierorderslistingpage_Voidorder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonrequestedbybuyer() {
		Supplierorderslistingpage_Requestedbybuyer.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonfinalvoidbutton() {
		Supplierorderslistingpage_Finalvoidbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	

	public static void Clickonapplybuttoninsupplierorderpage() {
		Supplierorderslistingpage_Applybutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}























































}
