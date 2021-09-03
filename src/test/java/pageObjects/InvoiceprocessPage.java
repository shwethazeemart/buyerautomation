package pageObjects;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class InvoiceprocessPage {

	private static WebDriver driver;

	public InvoiceprocessPage(WebDriver driver) {


		InvoiceprocessPage.driver = driver;
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

	@FindBy(xpath = "//input[contains(@name,'loginEmail')]")
	private static WebElement btn_loginEmail;


	@FindBy(xpath = "(//a[@ng-reflect-klass='nav-link pt-0'])[2]")
	private static WebElement Invoicespage_Uploads;
	
	@FindBy(xpath = "//button[text()='Today']")
	private static WebElement invoiceprocesspageSteps_Todaybutton;

	@FindBy(xpath = "(//button[contains(@class,'btn btn-success')])[1]")
	private static WebElement btn_processbtn;

	@FindBy(xpath = "//select[contains(@id,'country')]")
	private static WebElement invoiceprocesspageSteps_sabari250;

	@FindBy(xpath = "//input[@placeholder='Invoice number']")
	private static WebElement btn_invoicenumber;


	@FindBy(xpath = "//button[text()=' Use data ']")
	private static WebElement invoiceprocesspageSteps_Usedata;

	@FindBy(xpath = "(//button[@type='button'])[1]")
	private static WebElement invoiceprocesspageSteps_yesprocessedPOP;

	@FindBy(xpath = "//select[contains(@class,'custom-select ng-untouched')]")
	private static WebElement invoiceprocesspageSteps_Paymentsterms;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	private static WebElement invoiceprocesspageSteps_Validatebutton;
	 
	@FindBy(xpath = "//button[contains(@class,'btn btn-success')]")
	private static WebElement invoiceprocesspageSteps_Publishbutton;


	public void enter_LoginEmail(String email) {
		btn_loginEmail.sendKeys(email);
	}

	public static void click_processbutton() throws InterruptedException {
		btn_processbtn.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void click_velumasala2020() throws InterruptedException {
		invoiceprocesspageSteps_sabari250.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public WebElement getDropDownElement() {
		return invoiceprocesspageSteps_sabari250;
	} 

	public static void click_Ordernumber() {
		driver.findElement(By.xpath("(//div[@role='combobox']//input)[1]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Enter_Ordernumber() throws InterruptedException {
		
		/*driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys("202011250051"); 
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='202011250051']"))));
		driver.findElement(By.xpath("//span[text()='202011250051']")).click();
	}*/
       
		/*driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys("202011160002");
		List<WebElement> autoSuggest = driver.findElements(By.xpath("//span[text()='202011160002']"));

		System.out.println("Size of the AutoSuggets is = " + autoSuggest.size());

		for (WebElement a : autoSuggest)
			System.out.println("Values are = " + a.getText());
		    autoSuggest.get(2).click();
	}*/
		driver.findElement(By.xpath("(//div[@role='combobox']//input)[1]")).sendKeys("202108100015",Keys.ENTER);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	/*WebElement autoOptions= driver.findElement(By.xpath("(//input[@role='combobox'])[1]"));
		autoOptions.sendKeys("202011160002");

		List<WebElement> optionsToSelect = driver.findElements(By.xpath("//span[text()='202011160002']"));

		for(WebElement option : optionsToSelect){
		    System.out.println(option);
		    if(option.getText().equals("202011160002")) { 
		        System.out.println("Trying to select: "+"202011160002");
		        option.click();
		        break;
		    }
		}*/
	}

	

	/*Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//input[@role='combobox'])[1]"))).click().build().perform();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys(value);
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	} */

	//	public static void Select_Ordernumber() throws InterruptedException { 
	//		Actions action = new Actions(driver);
	//		action.moveToElement(driver.findElement(By.xpath("//span[text()='202011160002']"))).click().build().perform();
	//		
	//		Thread.sleep(5000);
	//		try {
	//			Thread.sleep(5000);
	//		} catch (InterruptedException e) {
	//		}
	//		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
	//				.executeScript("return document.readyState").equals("complete"));
	//
	//	}
	//invoiceprocesspageSteps_Ordernumber.click();
	/*WebElement OrderNumber=driver.findElement(By.xpath("//*[@class='col-5 p-0']//input[@role='combobox']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;



		 js.executeScript("arguments[0].value='202011170001';", OrderNumber);
		}*/

	public static void click_Usedata() throws InterruptedException {
		invoiceprocesspageSteps_Usedata.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void click_yesprocessedPOP() throws InterruptedException {
		invoiceprocesspageSteps_yesprocessedPOP.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}
	public static void click_Paymentsterms() {
		invoiceprocesspageSteps_Paymentsterms.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementPaymentsterms() {
		return invoiceprocesspageSteps_Paymentsterms;
	}

	public static void click_Validatebutton() {
		invoiceprocesspageSteps_Validatebutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void click_Publishbutton() {
		invoiceprocesspageSteps_Publishbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}
	public static String getPageTitle() {
		return driver.getTitle();
	}

	public static void enter_invoicenumber(String invoicenumber) {
		btn_invoicenumber.sendKeys("INV-20123456789");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}
	public static void SelectcalendarByJS() {

 


		///*JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.findElementxpath('//input[@placeholder='Select date']').removeAttribute('readonly',0);");

		//js.executeScript("document.findElementxpath('//input[@placeholder='Select date']'). */

		//js.executeScript("document.findElementxpath('//input[@placeholder='Select date']').click();", "");
		//((JavascriptExecutor)driver).executeScript ("document.findElementclassName('form-control calendar-icon').removeAttribute('readonly',0);"); // Enables the from date box

		//((JavascriptExecutor) driver).execute_script("document.getElementsByClassName('ms-crm-ImageStrip-btn_off_lookup ms-crm-Lookup')[0].click();"); 
		//jsExecutor.executeScript("document.getElementById('firstName').value='testuser'");






		WebElement DateBox=driver.findElement(By.xpath("//input[@placeholder='Select date']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;



		js.executeScript("arguments[0].value='10Aug2021';", DateBox);
		//dateBox.sendKeys("17-Nov-2020");
		//DateBox.clear();
		//DateBox.sendKeys("17Nov2020");

	}

	public static void clicks_Todaybutton() {
		invoiceprocesspageSteps_Todaybutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	} 

	/*public  WebElement SelectcalendarByJS() {
		return invoiceprocesspageSteps_selectDateByJS;

		//WebElement date= driver.findElement(By.xpath("//input[contains(@class,'form-control calendar-icon')]"));
		//String dateVal="17-11-2020";
		//selectDateByJS(driver,date,dateVal);
		// InvoiceprocessPage.selectDateByJS(driver, element, dateVal);

	}

	public static void selectDateByJS( WebElement element,String dateVal) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value',"+dateVal+"');",element);


	}*/


}



