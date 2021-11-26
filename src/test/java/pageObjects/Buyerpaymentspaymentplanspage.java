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



	private static final boolean Dashboardcolouryellow = false;

	private static final char[] colrisnotyellow = null;

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
	
	@FindBy(xpath = "(//div[contains(@class,'datatable-body-cell-label')])[1]")
	private static WebElement Buyerpaymentspaymentplanspage_Listedsupplier;
	
	@FindBy(xpath = "//p[text()='Payments']")
	private static WebElement Buyerpaymentspaymentplanspage_Paymentsbackbutton;

	private static Object Dashboardcolour;





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
	
public static void SelectpaymentstatusUnpaid() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='pr-2'][3]")).click();
		List<WebElement> list =driver.findElements(By.xpath("//div[@class='pr-2'][3]//select/option"));
		
		////div[@class='pr-2'][3]//select
		
		
		
		//div[@class='pr-2'][3]//select
		
		//div[@class='pr-2']//select)[3]
        System.out.println("Total number of item  : "+list.size() );
        int s=list.size();
        Thread.sleep(5000);
        for(int i=0; i<s; i++){
        	
        	if(list.get(i).getText().equalsIgnoreCase("Unpaid")){
        		System.out.println(list.get(i).getText()); 
        		list.get(i).click();
        		break;
        	}
        }
        	
        }
		
	
	
	
	
	public static void Selectpaymentstatuspaid() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='pr-2'][3]")).click();
		List<WebElement> list =driver.findElements(By.xpath("//div[@class='pr-2'][3]//select/option"));
		
		////div[@class='pr-2'][3]//select
		
		
		
		//div[@class='pr-2'][3]//select
		
		//div[@class='pr-2']//select)[3]
        System.out.println("Total number of item  : "+list.size() );
        int s=list.size();
        Thread.sleep(5000);
        for(int i=0; i<s; i++){
        	
        	if(list.get(i).getText().equalsIgnoreCase("Paid")){
        		System.out.println(list.get(i).getText()); 
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
	public static void Selectpaymentstatusfailed() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='pr-2'][3]")).click();
		List<WebElement> list =driver.findElements(By.xpath("//div[@class='pr-2'][3]//select/option"));
		
		
		//div[@class='pr-2']//select)[3]
        System.out.println("Total number of item  : "+list.size() );
        int s=list.size();
        Thread.sleep(5000);
        for(int i=0; i<s; i++){
        	
        	if(list.get(i).getText().equalsIgnoreCase("Failed")){
        		System.out.println(list.get(i).getText()); 
        		list.get(i).click();
        		break;
        	}
        } 
        	
        }
	public static void Usernameshouldbedisplayed() {
		String s1= driver.findElement(By.xpath("//p[text()='Welcome back, KOVALAN!']")).getText();
		System.out.println("User name should be displayed : "+ s1);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	public static void Dashboardhighlightedwithyellowcolour() {
		String colrisyellow = driver.findElement(By.xpath("//span[contains(@id,'sideMenu_Dashboard')]"))
			      .getCssValue("color");
		System.out.println(colrisyellow);
		  
		String color_hex;   
		 color_hex = colrisyellow.replaceAll("[^0-9]","") ;
		 System.out.println("Size after split : "+color_hex);  
		 
		 System.out.println("HexaDecimal Code is : "+Integer.toHexString(Integer.parseInt(color_hex)));
		 /*String str = "rgba(242,185,12,1)";
		System.out.println(str.replaceAll("[^0-9]", ""));
		
		String str1[] =str.split("rgba()");
		System.out.println(str1);
		System.out.println(Integer.toHexString(Integer.parseInt(str.replaceAll("[^0-9]", ""))));
		
		System.out.println(Integer.toHexString(24218512));
		System.out.println(Integer.toHexString(242));
		System.out.println(Integer.toHexString(185));
		System.out.println(Integer.toHexString(12));
		System.out.println(Integer.toHexString(1));*/
		
		


		 
//		 System.out.println("Size after split : "+color_hex + " "+Integer.toHexString(Integer.parseInt(color_hex)));
		// String actual_hex = String.format("#%02", Integer.parseInt(color_hex[0].trim()));
		//	System.out.println("Hexa decimal Color format is  : " +actual_hex);
		// String s1=Dash
		/*if(Dashboardcolouryellow) {
			System.out.println("colrisyellow"); 
			
		} else
		{
		System.out.println("Notyellow"); 
		}*/
		//WebElement eleSearch = driver.findElement(By.xpath("//span[contains(@id,'sideMenu_Dashboard')]"));
		//String rgbFormat = eleSearch.getCssValue("background-color");
		//System.out.println("Dashboard highlighted with the yellow colour: " + rgbFormat);  
		try { 
			Thread.sleep(5000); 
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
		
	
	 
		
	}

