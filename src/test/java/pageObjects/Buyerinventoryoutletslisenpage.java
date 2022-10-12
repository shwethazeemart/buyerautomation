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

public class Buyerinventoryoutletslisenpage {

	private static WebDriver driver;

	public Buyerinventoryoutletslisenpage(WebDriver driver) {


		Buyerinventoryoutletslisenpage.driver = driver;
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



	@FindBy(xpath = "//a[@href='/sg/pages/inventoryManage/outlets']")
	private static WebElement Buyerinventoryoutletslisenpage_outletsicon;

	@FindBy(xpath = "//img[@src='./assets/zmcore/img/settings-blue.svg']") 
	private static WebElement Buyerinventoryoutletslisenpage_settings;

	@FindBy(xpath = "//h4[text()='Inventory settings']/following-sibling::button")
	private static WebElement Buyerinventoryoutletslisenpage_settingscloseicon;
	
	@FindBy(xpath = "//div[@class='flex__center ml-4']//a[1]")
	private static WebElement Buyerinventoryoutletslisenpage_SelectMostRecentDateRange;

	@FindBy(xpath = "//img[@src='./assets/zmcore/img/download-icon.svg']")
	private static WebElement Buyerinventoryoutletslisenpage_exportdownloadicon;

	@FindBy(xpath = "//button[text()='Create new list']")
	private static WebElement Buyerinventoryoutletslisenpage_newlistofOutletnameOne;

	@FindBy(xpath = "(//div[@class='datatable-body-cell-label']//div)[1]")
	private static WebElement Buyerinventoryoutletslisenpage_velumasala;

	@FindBy(xpath = "//div[text()='sstmasala2020']")
	private static WebElement Buyerinventoryoutletslisenpage_starterplanofOutletnameTwo;

	@FindBy(xpath = "//input[@placeholder='Search outlets']")
	private static WebElement Buyerinventoryoutletslisenpage_searchoutlets;

	@FindBy(xpath = "//input[@placeholder='Search outlets']")
	private static WebElement Buyerinventoryoutletslisenpage_outletname;
	
	@FindBy(xpath = "(//a[@class='export-mclr'])[1]") 
	private static WebElement Buyerinventoryoutletslisenpage_Filter;

	@FindBy(xpath = "//div[text()=' Status  ']") 
	private static WebElement Buyerinventoryoutletslisenpage_statusicon;

	@FindBy(xpath = "(//input[@class='custom-control-input'])[1]")
	private static WebElement Buyerinventoryoutletslisenpage_checkbox;
	
	@FindBy(xpath = "//div[@class='dd-flex']/following-sibling::button[1]")
	private static WebElement Buyerinventoryoutletslisenpage_newlistcloseicon;
	

	@FindBy(xpath = "//h4[text()='Upgrade to use this feature']/following-sibling::button")
	private static WebElement Buyerinventoryoutletslisenpage_starterplancloseicon;
	
	
	
	@FindBy(xpath = "(//input[@class='custom-control-input'])[1]")
	private static WebElement Buyerinventoryoutletslisenpage_UncheckboxofHasitem;
	
	@FindBy(xpath = "(//input[@class='custom-control-input'])[2]")
	private static WebElement Buyerinventoryoutletslisenpage_CheckboxofLastcount;
	
	@FindBy(xpath = "(//input[@class='custom-control-input'])[2]")
	private static WebElement Buyerinventoryoutletslisenpage_UncheckboxofLastcount;
	
	//@FindBy(xpath = "//a[contains(@class,'title-clr pl-1 ng-star-inserted')]") 
	//private static WebElement Buyerinventoryoutletslisenpage_returntooutletpage;

	//(//datatable-body-cell[contains(@class,'datatable-body-cell sort-active ng-star-inserted')])[8]

	@FindBy(xpath = "(//datatable-body-cell[contains(@class,'datatable-body-cell sort-active')])[2]")
	private static WebElement Buyerinventoryoutletslisenpage_Outletname;
	
	
	
	@FindBy(xpath = "(//div[text()='sai fruits 250'])[1]")
	private static WebElement Buyerinventoryoutletslisenpage_ParticularOutlet;
	
	@FindBy(xpath = "//button[contains(text(),'Consumption report')]")
	private static WebElement Buyerinventoryoutletslisenpage_Consumptionreport;
	
	@FindBy(xpath = "//div[text()=' List that works ']")
	private static WebElement Buyerinventoryoutletslisenpage_InventoryList;
	
	@FindBy(xpath = "(//input[contains(@formcontrolname,'type')])[1]")
	private static WebElement Buyerinventoryoutletslisenpage_RadioButton;
	
	@FindBy(xpath = "//button[contains(text(),'Show report')] ")
	private static WebElement Buyerinventoryoutletslisenpage_ShowReport;
	
	
	
	
	
	public static void clickoutletsicon() {
		Buyerinventoryoutletslisenpage_outletsicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	
	public static void clickexportdownloadicon() {
		Buyerinventoryoutletslisenpage_exportdownloadicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	

	public static void clickonvelumasala() {
		Buyerinventoryoutletslisenpage_velumasala.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	
	public static void searchoutlets() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, -250);");
		Thread.sleep(5000);	
		Buyerinventoryoutletslisenpage_searchoutlets.click();		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void enteroutletname(String outletname) {
		Buyerinventoryoutletslisenpage_outletname.sendKeys(outletname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void clickstatusicon() {
		Buyerinventoryoutletslisenpage_statusicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void clickcheckbox() {
		Buyerinventoryoutletslisenpage_checkbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void clicknewlistcloseicon() {
		Buyerinventoryoutletslisenpage_newlistcloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void clickstarterplancloseicon() {
		Buyerinventoryoutletslisenpage_starterplancloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void clickreturntooutletpage() throws InterruptedException {
		Thread.sleep(5000);
		//Buyerinventoryoutletslisenpage_returntooutletpage.click();
		WebElement inventory = driver.findElement(By.className("arrow_left"));
		inventory.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickuncheckboxogHasitem() {
		Buyerinventoryoutletslisenpage_UncheckboxofHasitem.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickoncheckboxoflastcount() {
		Buyerinventoryoutletslisenpage_CheckboxofLastcount.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonuncheckboxoflastcount() {
		Buyerinventoryoutletslisenpage_UncheckboxofLastcount.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	
	}

	public static void Clickverticallyscrollup() {
		//WebElement DateBox=driver.findElement(By.xpath("//div[@class='d-flex flex_inv_pad']/following-sibling::div[1]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("scroll(0, -250);");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void clickOutletnameOne() {
		Buyerinventoryoutletslisenpage_newlistofOutletnameOne.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}



		public static void clickStarterplanofOutletnameTwo() throws InterruptedException {
	        Thread.sleep(5000);
			Buyerinventoryoutletslisenpage_starterplanofOutletnameTwo.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public static void Outletnameclick() {
			Buyerinventoryoutletslisenpage_Outletname.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
		
		//Consumption report

		public static void particularOutletClick() throws InterruptedException {
			Thread.sleep(5000);
			Buyerinventoryoutletslisenpage_ParticularOutlet.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}

		public static void consumptionRepprtClick() throws InterruptedException {
			Thread.sleep(5000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, -250);");
			Buyerinventoryoutletslisenpage_Consumptionreport.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

			
		}

		public static void selectInventoryList() throws InterruptedException {
			WebElement list=driver.findElement(By.xpath("//div[@role='combobox']//input[1]"));
			list.click();
			Buyerinventoryoutletslisenpage_InventoryList.click();
			Thread.sleep(5000);
			WebElement outsidelist=driver.findElement(By.xpath("//label[contains(text(),'Inventory list:')]"));
			outsidelist.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}

		public static void radioButtonClick() {
			Buyerinventoryoutletslisenpage_RadioButton.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}

		public static void dateSelectfromCalendar() {
			WebElement DateBox=driver.findElement(By.xpath("//input[contains(@formcontrolname,'stockCountDate')]"));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].value='07 Dec 2021 - 11 May 2022';", DateBox);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}

		public static void showReportClick() throws InterruptedException {
			Thread.sleep(5000);
			Buyerinventoryoutletslisenpage_ShowReport.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
			
		}

		public static void clickSelectMostRecentDateRange() {
			Buyerinventoryoutletslisenpage_SelectMostRecentDateRange.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void clicktheFilter() {
			Buyerinventoryoutletslisenpage_Filter.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}
		
	
	
	}




















