package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierPaymentPlansPage {

	
	
	private static WebDriver driver;

	public SupplierPaymentPlansPage(WebDriver driver) {


		SupplierPaymentPlansPage.driver = driver;
		PageFactory.initElements(driver, this);
	} 

	public static void navigateTo_LogInPage3() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}

	public static void navigateTo_invoiceprocesspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}
	public void navigateTo_LogInPage2() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,true,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}


	//@FindBy(xpath = "(//div[@class='col-4']//div)[2]")
	//private static WebElement SupplierPaymentPlansPage_PaymentPlansIcon;
	
	@FindBy(xpath = "(//div[contains(@class,'datatable-body-cell-label')])[1]")
	private static WebElement SupplierPaymentPlansPage_PaidStatusCompany;
	
	@FindBy(xpath = "//datatable-body-cell[contains(@class,'actionCol cellAlignCenter')]")
	private static WebElement SupplierPaymentPlansPage_BillAmount;
	
	@FindBy(xpath = "(//table[@class='inv-table']//td)[1]")
	private static WebElement SupplierPaymentPlansPage_BillInvoice;
	
	
	


	public static void PaymentPlansIconClick() {
		WebElement paymentPlans = driver.findElement(By.linkText("Payment plans"));
		paymentPlans.click();
		//SupplierPaymentPlansPage_PaymentPlansIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void PaymentFailedStatusSelect() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@formcontrolname='paymentStatus']")).click();
		List<WebElement> list =driver.findElements(By.xpath("//select[@formcontrolname='paymentStatus']/option"));

		
        System.out.println("Total number of item  : "+list.size() );
        int s=list.size();
        //Thread.sleep(5000);
        for(int i=0; i<s; i++){
        	if(list.get(i).getText().equalsIgnoreCase("Failed")){
        		System.out.println(list.get(i).getText()); 
        		list.get(i).click();
        		break;
        	}
        }
        	
        }

	public static void PaymentUnpaidStatusSelect() throws InterruptedException  {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@formcontrolname='paymentStatus']")).click();
		List<WebElement> list =driver.findElements(By.xpath("//select[@formcontrolname='paymentStatus']/option"));

		
        System.out.println("Total number of item  : "+list.size() );
        int s=list.size();
        //Thread.sleep(5000);
        for(int i=0; i<s; i++){
        	
        	if(list.get(i).getText().equalsIgnoreCase("Unpaid")){
        		System.out.println(list.get(i).getText()); 
        		list.get(i).click();
        		break;
        	}
        }
        	
        }

	public static void PaymentPaidStatusSelect() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@formcontrolname='paymentStatus']")).click();
		List<WebElement> list =driver.findElements(By.xpath("//select[@formcontrolname='paymentStatus']/option"));
	
		
        System.out.println("Total number of item  : "+list.size() );
        int s=list.size();
       // Thread.sleep(5000);
        for(int i=0; i<s; i++){
        	
        	if(list.get(i).getText().equalsIgnoreCase("Paid")){
        		System.out.println(list.get(i).getText()); 
        		list.get(i).click();
        		break;
        	}
        }
        	
        }

	public static void PaidStayusCompanyClick() {
		SupplierPaymentPlansPage_PaidStatusCompany.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void IssuedBillAmountClick() {
		SupplierPaymentPlansPage_BillAmount.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void BillInvoiceClick() {
		SupplierPaymentPlansPage_BillInvoice.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
		
	
	
	
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
