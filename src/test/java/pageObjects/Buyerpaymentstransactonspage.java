package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyerpaymentstransactonspage {

	private static WebDriver driver;

	public Buyerpaymentstransactonspage(WebDriver driver) {


		Buyerpaymentstransactonspage.driver = driver;
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
	
	
	//@FindBy(xpath = "//input[@placeholder='Search invoice']")
	//private static WebElement Buyerpaymentstransactonspage_Transactionsicon;
	
	@FindBy(xpath = "//select[@formcontrolname='selectCompany']")
	private static WebElement Buyerpaymentstransactonspage_selectsakthimasala;
	
	@FindBy(xpath = "//select[@formcontrolname='selectSupplier']")
	private static WebElement Buyerpaymentstransactonspage_selectmrfruits;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private static WebElement Buyerpaymentstransactonspage_Searchicon;
	
	@FindBy(xpath = "//div[@class='d-flex align-items-center']//a[1]")
	private static WebElement Buyerpaymentstransactonspage_Downloadbutton;
	
	@FindBy(xpath = "(//div[@class='datatable-body-cell-label'])[2]")
	private static WebElement Buyerpaymentstransactonspage_Listedsupplier;
	
	@FindBy(xpath = "//p[text()='Payments']")
	private static WebElement Buyerpaymentstransactonspage_Paymentsbackbutton;
	
	
	
	
	
	public static void Clickontransactions() {
		//Buyerpaymentstransactonspage_Transactionsicon.click();
		WebElement transactions = driver.findElement(By.linkText("Transactions"));
		transactions.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Selectsakthimasala() throws InterruptedException {
		Buyerpaymentstransactonspage_selectsakthimasala.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementsakthimasala() {
		return Buyerpaymentstransactonspage_selectsakthimasala;
	
	}
	
	public static void Selectsuppliermrfruits() throws InterruptedException {
		Buyerpaymentstransactonspage_selectmrfruits.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementmrfruits() {
		return Buyerpaymentstransactonspage_selectmrfruits;
	
	}
	public static void Selectdatefromcalendaricon() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@formcontrolname='transactionDate']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='01Mar2021-31Mar2021';", DateBox);
		
	}
	public static void Clicksearchicon() {
		Buyerpaymentstransactonspage_Searchicon.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static void Clickondownloadbutton() {
		Buyerpaymentstransactonspage_Downloadbutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}
	public static void Clickonlistedsupplier() {
		Buyerpaymentstransactonspage_Listedsupplier.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickonpaymentsbackbutton() {
		Buyerpaymentstransactonspage_Paymentsbackbutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
