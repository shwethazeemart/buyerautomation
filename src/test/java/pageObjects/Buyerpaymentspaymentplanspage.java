package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Buyerpaymentspaymentplanspage {



	private static WebDriver driver;

	public Buyerpaymentspaymentplanspage(WebDriver driver) {


		Buyerpaymentspaymentplanspage.driver = driver;
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


 
	//@FindBy(xpath = "//select[@formcontrolname='selectCompany']")
	//private static WebElement Buyerpaymentspaymentplanspage_Paymentplansicon;
	
	@FindBy(xpath = "//select[@formcontrolname='companyId']")
	private static WebElement Buyerpaymentspaymentplanspage_Selectcompany;
	
	@FindBy(xpath = "//select[@formcontrolname='supplierId']")
	private static WebElement Buyerpaymentspaymentplanspage_Selectsupplier;
	
	//@FindBy(xpath = "//select[@formcontrolname='soaPaymentStatus']")
	//private static WebElement Buyerpaymentspaymentplanspage_Selectpaymentstatusunpaid;
	
	//@FindBy(xpath = "//select[@formcontrolname='soaPaymentStatus']")
	//private static WebElement Buyerpaymentspaymentplanspage_Selectpaymentstatusfailed;
	
	//@FindBy(xpath = "//select[@formcontrolname='soaPaymentStatus']")
	//private static WebElement Buyerpaymentspaymentplanspage_Selectpaymentstatuspaid;
	
	@FindBy(xpath = "(//div[contains(@class,'datatable-row-center datatable-row-group')]//datatable-body-cell)[2]")
	private static WebElement Buyerpaymentspaymentplanspage_Listedsupplier;
	
	@FindBy(xpath = "//p[text()='Payments']")
	private static WebElement Buyerpaymentspaymentplanspage_Paymentsbackbutton;





	public static void Clickpaymentplansicon() {
		//Buyerpaymentspaymentplanspage_Paymentplansicon.click();
		WebElement paymentPlans = driver.findElement(By.linkText("Payment plans"));
		paymentPlans.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}


	public static void Selectcompany() throws InterruptedException {
		Buyerpaymentspaymentplanspage_Selectcompany.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementtnwineshop() {
		return Buyerpaymentspaymentplanspage_Selectcompany;
		
	}
	public static void Selectsupplier() throws InterruptedException {
		Buyerpaymentspaymentplanspage_Selectsupplier.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementmrfruits() {
		return Buyerpaymentspaymentplanspage_Selectsupplier;
	}

	/*public static void Selectpaymentstatusunpaid() throws InterruptedException {
		Thread.sleep(5000);
		Buyerpaymentspaymentplanspage_Selectpaymentstatusunpaid.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	
	
	
	public static WebElement getDropDownElementUnpaid() {
		return Buyerpaymentspaymentplanspage_Selectpaymentstatusunpaid;
	}*/
	
	/*public static void Selectpaymentstatusfailed() throws InterruptedException {
		Thread.sleep(5000);
		Buyerpaymentspaymentplanspage_Selectpaymentstatusfailed.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementFailed() {
		return Buyerpaymentspaymentplanspage_Selectpaymentstatusfailed;
	}*/

	/*public static void Selectpaymentstatuspaid() throws InterruptedException {
		Buyerpaymentspaymentplanspage_Selectpaymentstatuspaid.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementPaid() {
		return Buyerpaymentspaymentplanspage_Selectpaymentstatuspaid;
	}*/
	
	
	public static void Selectpaymentstatuspaid() throws InterruptedException {
		Thread.sleep(5000);
		List<WebElement> list =driver.findElements(By.xpath("(//div[@class='pr-2']//select)[3]"));
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
        	System.out.println(list.get(i).getText()); 
        	if(list.get(i).getText().contains("Paid")) {
        		list.get(i).click();
        		break;
        	}
        	
        	
        }
		
	}
	
	
	
	public static void Clickonlistedsupplier() throws InterruptedException {
		Thread.sleep(10000);
		Buyerpaymentspaymentplanspage_Listedsupplier.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}
	public static void Clickpaymentsbackbutton() {
		Buyerpaymentspaymentplanspage_Paymentsbackbutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Clickpaymentstatus() throws InterruptedException {
		/*Thread.sleep(5000);
		//WebElement paymentPlans = driver.findElement(By.xpath("//select[@formcontrolname='soaPaymentStatus']"));
		//paymentPlans.click();
		//Buyerpaymentspaymentplanspage_Selectpaymentstatuspaid.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	public static WebElement getDropDownElementPaid() {
		//return Buyerpaymentspaymentplanspage_Selectpaymentstatuspaid;
	}*/


 
	}
}
