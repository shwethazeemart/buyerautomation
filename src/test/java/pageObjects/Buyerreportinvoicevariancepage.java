package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;
 
public class Buyerreportinvoicevariancepage {


	private static WebElement Buyerreportinvoicevariancepage_selectoutlet = null;

	private static WebDriver driver;
	

	public Buyerreportinvoicevariancepage(WebDriver driver) {


		Buyerreportinvoicevariancepage.driver = driver;
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
	
	
	
	//@FindBy(xpath = "//h1[text()='Invoice variance']")
	//private static WebElement Buyerreportinvoicevariancepage_Invoicevariance;
	
	@FindBy(xpath = "//input[@placeholder='Search invoice']")
	private static WebElement Buyerreportinvoicevariancepage_Searchbox;
	
	@FindBy(xpath = "//input[@placeholder='Search invoice']")
	private static WebElement Buyerreportinvoicevariancepage_Enterinvoicenumber;
	
	@FindBy(xpath = "//select[contains(@id,'country')]")
	private static WebElement Buyerreportinvoicevariancepage_selectvelumasala;
	
	@FindBy(xpath = "(//a[@class='export-mclr'])[1]")
	private static WebElement Buyerreportinvoicevariancepage_Filter;
	
	@FindBy(xpath = "(//select[contains(@class,'custom-select filter-dropdown')])[1]")
	private static WebElement Buyerreportinvoicevariancepage_selectsupplier;
	
	@FindBy(xpath = "(//select[contains(@class,'custom-select filter-dropdown')])[2]")
	private static WebElement Buyerreportinvoicevariancepage_Exactmatch;
		
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private static WebElement Buyerreportinvoicevariancepage_Applybutton;
	
	@FindBy(xpath = "//div[@class='filter-apply']//a[1]")
	private static WebElement Buyerreportinvoicevariancepage_Resetbutton;
	
	@FindBy(xpath = "//div[@class='container-fluid']/following-sibling::div[1]")
	private static WebElement Buyerreportinvoicevariancepage_Outside;
	
	@FindBy(xpath = "//div[@class='pl-2']//a[1]")
	private static WebElement Buyerreportinvoicevariancepage_Exportdownloadbutton;	
	
	@FindBy(xpath = "//img[@src='../assets/zmcore/img/left-report-b-icon.svg']/following-sibling::p[1]")
	private static WebElement Buyerreportinvoicevariancepage_Reportsbackbutton;
	
	//Receving report
	
	@FindBy(xpath = "//h1[contains(text(),'Receiving report')]")
	private static WebElement Buyerreportinvoicevariancepage_RecevingReport;
	
	@FindBy(xpath = "//select[contains(@formcontrolname,'outletId')]")
	private static WebElement Buyerreportinvoicevariancepage_Outlet;
	
	@FindBy(xpath = "(//input[contains(@name,'periodRadio')])[2]")
	private static WebElement Buyerreportinvoicevariancepage_RadioButton;
	
	@FindBy(xpath = "//button[contains(text(),'Generate report')]")
	private static WebElement Buyerreportinvoicevariancepage_GenerateReport;
	
	
	
	 
	public static void Clickinvoicevarianceicon() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, 1000);");
		WebElement invoiceVar = driver.findElement(By.xpath("//h1[contains(text(),'Invoice variance')]"));
		invoiceVar.click();
		//Buyerreportinvoicevariancepage_Invoicevariance.click(); 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clicksearchbox() {
		Buyerreportinvoicevariancepage_Searchbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Entertheinvoicenumber(String invoice) {
		Buyerreportinvoicevariancepage_Enterinvoicenumber.sendKeys(invoice);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Selectdatefromcalendar() {
		WebElement DateBox=driver.findElement(By.xpath("//span[contains(@name,'daterange')]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='01Jan2021-31Aug2021';", DateBox);
	}
	

	public static void Selectsupplier() throws InterruptedException {
		Thread.sleep(5000);
		Buyerreportinvoicevariancepage_selectsupplier.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementsabari() {
		return Buyerreportinvoicevariancepage_selectsupplier;
	
	}
	
		public static void Selectmatchstatus() throws InterruptedException {
			Buyerreportinvoicevariancepage_Exactmatch.click();
			Thread.sleep(5000);
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
		public static WebElement getDropDownElementstatus() {
			return Buyerreportinvoicevariancepage_Exactmatch;
		}
		public static void Clickexportdownloadbutton() throws InterruptedException {
			Buyerreportinvoicevariancepage_Exportdownloadbutton.click();
			//Thread.sleep(5000);
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public static void Clickonapplybutton() throws InterruptedException {
			Thread.sleep(5000);
			Buyerreportinvoicevariancepage_Applybutton.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public static void Clickonresetbutton() throws InterruptedException {
			Thread.sleep(5000);
			//WebElement reset = driver.findElement(By.linkText("Reset"));
			//reset.click();
			Buyerreportinvoicevariancepage_Resetbutton.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public static void Clickonoutside() {
			//WebElement reportsInvoiceVariance = driver.findElement(By.className("page__header"));
			//reportsInvoiceVariance.click();
			Buyerreportinvoicevariancepage_Outside.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
			
		}
		public static void Clickreportsbackbutton() {
			Buyerreportinvoicevariancepage_Reportsbackbutton.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public static void Selectvelumasala() throws InterruptedException {
			Buyerreportinvoicevariancepage_selectvelumasala.click();
			Thread.sleep(5000);
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
							
		public static WebElement getDropDownElementoutletname() {
			return Buyerreportinvoicevariancepage_selectvelumasala;

		}

		public static void Clickfilter() throws InterruptedException {
			Thread.sleep(5000);
			Buyerreportinvoicevariancepage_Filter.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		
		}
		public static void grnIconClick() throws InterruptedException {
			Thread.sleep(5000);
			boolean buttonPresence=driver.findElement(By.xpath("//span[contains(text(),'GRN match')]")).isDisplayed();
			System.out.println("The GRN is dispalyed:"+buttonPresence); 
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		
		//receving report
		
		public static void recevingReportClick() throws InterruptedException {
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0, 1000);");
			Buyerreportinvoicevariancepage_RecevingReport.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		
		public static void SelectOutlet() throws InterruptedException {
			Thread.sleep(5000);
			Buyerreportinvoicevariancepage_Outlet.click();
			Thread.sleep(5000);
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
		public static WebElement getDropDownElementOutlet() {
			return Buyerreportinvoicevariancepage_Outlet;
		
		}
		public static void selectSupplier() {
			driver.findElement(By.xpath("//div[@role='combobox']//input[1]")).sendKeys("VELU MASALA",Keys.ENTER);
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

			
		}
		public static void radioButtonClick() throws InterruptedException {
			Thread.sleep(5000);
			Buyerreportinvoicevariancepage_RadioButton.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		public static void selectdatefromCalendar() {
			WebElement DateBox=driver.findElement(By.xpath("//input[contains(@formcontrolname,'periodOrderDate')]"));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].value='1 Jan 2022 - 24 Mar 2022';", DateBox);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

			
		}
		public static void generateReportClick() {
			//Thread.sleep(5000);
			Buyerreportinvoicevariancepage_GenerateReport.click();
			try { 
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}
		
		
	
	}
	