package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyerdashboardlisenpage {

	private static WebDriver driver;

	public Buyerdashboardlisenpage(WebDriver driver) {


		Buyerdashboardlisenpage.driver = driver;
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

	///html/body/ngb-modal-window/div/div/addordermodal/div[1]/span/img
	///html/body/app-root/app-default/div[2]/app-dashboard/outletselectormodel/div/div/div/div/div[1]/img
	//(//img[@src='./assets/zmcore/img/close-blue.svg'])[2]

	@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	private static WebElement Buyerdashboardlisenpage_Dashboardmenubar;

	@FindBy(xpath = "//button[text()=' New order ']")
	private static WebElement Buyerdashboardlisenpage_Neworder;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/addordermodal/div[1]/span/img")
	private static WebElement Buyerdashboardlisenpage_Newordercloseicon;

	@FindBy(xpath = "//button[text()=' Upload invoice ']")
	private static WebElement Buyerdashboardlisenpage_Uploadinvoiceicon;

	@FindBy(xpath = "/html/body/app-root/app-default/div[2]/app-dashboard/outletselectormodel/div/div/div/div/div[1]/img")
	private static WebElement Buyerdashboardlisenpage_Uploadinvoicecloseicon;

	@FindBy(xpath = "//div[text()='Spending overview']/following-sibling::select")
	private static WebElement Buyerdashboardlisenpage_velumasala;

	@FindBy(xpath = "//label[text()=' YTD ']")
	private static WebElement Buyerdashboardlisenpage_YTDicon;

	@FindBy(xpath = "//label[text()=' Last year ']")
	private static WebElement Buyerdashboardlisenpage_Lastyearicon;

	@FindBy(xpath = "//label[text()=' Past 12 weeks ']")
	private static WebElement Buyerdashboardlisenpage_Psttwelveweekicon;

	@FindBy(xpath = "//button[text()=' View spending report ']")
	private static WebElement Buyerdashboardlisenpage_Viewspendingreporticon;

	@FindBy(xpath = "//span[contains(@id,'sideMenu_Dashboard')]")
	private static WebElement Buyerdashboardlisenpage_Dashboardsidenavigationmenubar;

	@FindBy(xpath = "//div[text()=' Top expenditures ']/following-sibling::select")
	private static WebElement Buyerdashboardlisenpage_velumasalatwenty;

	@FindBy(xpath = "(//a[@role='tab'])[2]")
	private static WebElement Buyerdashboardlisenpage_SKUicon;

	@FindBy(xpath = "(//a[@role='tab'])[3]")
	private static WebElement Buyerdashboardlisenpage_Categoryicon;
	
	@FindBy(xpath = "(//a[@role='tab'])[1]")
	private static WebElement Buyerdashboardlisenpage_Suppliericon;
	
	@FindBy(xpath = "//label[text()=' This month ']")
	private static WebElement Buyerdashboardlisenpage_Thismonthicon;
	
	@FindBy(xpath = "//label[text()=' This week ']")
	private static WebElement Buyerdashboardlisenpage_Thismonthweekicon;
	
	@FindBy(xpath = "//label[text()=' Last week ']")
	private static WebElement Buyerdashboardlisenpage_Lastweekicon;
	
	@FindBy(xpath = "//label[text()=' Last month ']")
	private static WebElement Buyerdashboardlisenpage_Lastmonthicon;
	
	@FindBy(xpath = "(//div[@class='supplier_tab_inner_info']/following-sibling::a)[1]")
	private static WebElement Buyerdashboardlisenpage_Viewspendingbysupplier; 



	
	
	
	@FindBy(xpath = "//div[text()='sabari250']")
	private static WebElement Buyerdashboardlisenpage_Sabarisupplier;

	
	@FindBy(xpath = "//input[@type='checkbox']")
	private static WebElement Buyerdashboardlisenpage_Showfavouritescheckbox;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private static WebElement Buyerdashboardlisenpage_Showfavouritesuncheckbox;
	
	@FindBy(xpath = "//a[contains(@class,'pull-right export-mclr')]")
	private static WebElement Buyerdashboardlisenpage_Filtericon;
	
	@FindBy(xpath = "//div[text()=' Tags  ']")
	private static WebElement Buyerdashboardlisenpage_Tagsicon;
	
	//@FindBy(xpath = "(//div[@class='supplier_tab_inner_info']/following-sibling::a)[1]")
	//private static WebElement Buyerdashboardlisenpage_Selecticon;
	
	@FindBy(xpath = "//div[text()='sabari250']")
	private static WebElement Buyerdashboardlisenpage_Outsideorderpage;
	
	@FindBy(xpath = "//div[text()=' Categories  ']")
	private static WebElement Buyerdashboardlisenpage_Categoriesicon;
	
	@FindBy(xpath = "//div[text()=' Certifications  ']")
	private static WebElement Buyerdashboardlisenpage_Certificationsicon;
	
	@FindBy(xpath = "//input[@placeholder='SKU name']")
	private static WebElement Buyerdashboardlisenpage_Searchboxicon;
	
	@FindBy(xpath = "//input[@placeholder='SKU name']")
	private static WebElement Buyerdashboardlisenpage_Enternamesearchbox;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/addordermodal/div[1]/span/img")
	private static WebElement Buyerdashboardlisenpage_Closeiconinorderpage;
	
	@FindBy(xpath = "//b[text()='velu masala2020']")
	private static WebElement Buyerdashboardlisenpage_Velumasalaicon;
	
	@FindBy(xpath = "//button[text()='Done']")
	private static WebElement Buyerdashboardlisenpage_Donebutton;
	
	@FindBy(xpath = "//button[text()='Apply']")
	private static WebElement Buyerdashboardlisenpage_Applybutton;
	
	@FindBy(xpath = "//a[@class='filter-reset ml-3']")
	private static WebElement Buyerdashboardlisenpage_Resetbutton;
	
	



	public static void ClickonDashboardmenubar() {
		Buyerdashboardlisenpage_Dashboardmenubar.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonneworder() {
		Buyerdashboardlisenpage_Neworder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickonNewordercloseicon() {
		Buyerdashboardlisenpage_Newordercloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonuploadinvoiceicon() {
		Buyerdashboardlisenpage_Uploadinvoiceicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonuploadinvoicecloseicon() {
		Buyerdashboardlisenpage_Uploadinvoicecloseicon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void click_velumasala()  {
		Buyerdashboardlisenpage_velumasala.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementvelumasala() {
		return Buyerdashboardlisenpage_velumasala;
	}

	public static void ClickonYTDicon() throws InterruptedException {
		Thread.sleep(5000); 
		Buyerdashboardlisenpage_YTDicon.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void ClickonLastyearicon() {
		Buyerdashboardlisenpage_Lastyearicon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonpasttwelveweekicon() {
		Buyerdashboardlisenpage_Psttwelveweekicon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonviewspendingreoprticon() {
		Buyerdashboardlisenpage_Viewspendingreporticon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickondashboardsidenavigationmenubar() {
		Buyerdashboardlisenpage_Dashboardsidenavigationmenubar.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}


	public static void click_velumasalatetwentytwenty()  {
		Buyerdashboardlisenpage_velumasalatwenty.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementvelumasalatwentytwenty() {
		return Buyerdashboardlisenpage_velumasalatwenty;
	}

	public static void ClickonSKUicon() throws InterruptedException {
		Thread.sleep(5000);
		Buyerdashboardlisenpage_SKUicon.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickoncategoryicon() {
		Buyerdashboardlisenpage_Categoryicon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void Clickonsuppliericon() {
		Buyerdashboardlisenpage_Suppliericon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Clickonthismonthicon() {
		Buyerdashboardlisenpage_Thismonthicon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickonthisweekicon() {
		Buyerdashboardlisenpage_Thismonthweekicon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonlastweekicon() {
		Buyerdashboardlisenpage_Lastweekicon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clickonlastmonthicon() {
		Buyerdashboardlisenpage_Lastmonthicon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Clickonviewspendingbusupplier() {
		Buyerdashboardlisenpage_Viewspendingbysupplier.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	

	public static void Clickonsabarisupplier() {
		Buyerdashboardlisenpage_Sabarisupplier.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Clickshowfavouritescheckbox() {
		Buyerdashboardlisenpage_Showfavouritescheckbox.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonshowfavouritesuncheckbox() {
		Buyerdashboardlisenpage_Showfavouritesuncheckbox.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonfilter() {
		Buyerdashboardlisenpage_Filtericon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ClickonTags() {
		Buyerdashboardlisenpage_Tagsicon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonselectiocn() {
		//Buyerdashboardlisenpage_Selecticon.click();
		WebElement selectAll = driver.findElement(By.linkText("Select All"));
		selectAll.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonoutsideoforderpage() throws InterruptedException {
		Thread.sleep(5000);
		Buyerdashboardlisenpage_Outsideorderpage.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickoncategories() {
		Buyerdashboardlisenpage_Categoriesicon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickoncertifications() {
		Buyerdashboardlisenpage_Certificationsicon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonsearchbox() {
		Buyerdashboardlisenpage_Searchboxicon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Enternameinsearchbox(String name) {
		Buyerdashboardlisenpage_Enternamesearchbox.sendKeys(name);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickoncloseiconinorderpage() {
		Buyerdashboardlisenpage_Closeiconinorderpage.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonvelumasala() {
		Buyerdashboardlisenpage_Velumasalaicon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonuploadimage() throws InterruptedException {
		WebElement uploadBox=driver.findElement(By.xpath("//input[@id='file']"));
		uploadBox.sendKeys("E:\\Zeemart All\\download.jpg");
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { 
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
		
		
	}

	public static void ClickDonebutton() throws InterruptedException {
		Thread.sleep(5000);
		Buyerdashboardlisenpage_Donebutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonapplybutton() {
		Buyerdashboardlisenpage_Applybutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonresetbutton() throws InterruptedException {
		Thread.sleep(5000);
		Buyerdashboardlisenpage_Resetbutton.click();
		//WebElement reset = driver.findElement(By.linkText("Reset"));
		//reset.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}






































}
