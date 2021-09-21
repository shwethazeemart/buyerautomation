package pageObjects;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class BuyerPNF7797page {

	private static WebDriver driver;

	public BuyerPNF7797page(WebDriver driver) {


		BuyerPNF7797page.driver = driver;
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
	
	
	@FindBy(xpath = "//select[@formcontrolname='inventoryId']")
	private static WebElement BuyerPNF7797page_Inventorylistvelu;
	
	@FindBy(xpath = "//button[text()=' New stock count ']")
	private static WebElement BuyerPNF7797page_Newstockcountbutton;
	
	@FindBy(xpath = "//button[@type='submit']")
	private static WebElement BuyerPNF7797page_Startcountbutton;
	
	
	@FindBy(xpath = "//input[@type='number']")
	private static WebElement BuyerPNF7797page_Enterthequantity;
	
	@FindBy(xpath = "//button[text()='Save stock count']")
	private static WebElement BuyerPNF7797page_Popmessagesavebutton;
	
	@FindBy(xpath = "//div[text()='velu']")
	private static WebElement BuyerPNF7797page_Velulist;
	
	@FindBy(xpath = "//button[text()='Save']")
	private static WebElement BuyerPNF7797page_Savebutton;
	
	
	@FindBy(xpath = "(//div[@class='pl-1']//a)[2]")
	private static WebElement BuyerPNF7797page_Listmenuitem;
	
	
	
	
	public static void click_Inventorylistvelu() throws InterruptedException {
		BuyerPNF7797page_Inventorylistvelu.click();
		Thread.sleep(5000);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownElementvelu() {
		return BuyerPNF7797page_Inventorylistvelu;
	}

	public static void Clickonnewstockcountbutton() {
		BuyerPNF7797page_Newstockcountbutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}

	

	public static void Enterthequantity(String quantity) {
		BuyerPNF7797page_Enterthequantity.sendKeys(quantity);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonpopmessagesavebuton() {
		BuyerPNF7797page_Popmessagesavebutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clicklistmenuitem() {
		BuyerPNF7797page_Listmenuitem.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonvelulist() {
		BuyerPNF7797page_Velulist.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Seetwentyhourtimeformat() {
		String s1= driver.findElement(By.xpath("(//div[@class='overall_amount']//span)[2]")).getText();
		System.out.println("Display the twenty hour format :" +s1);
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Clickonsavebutton() {
		BuyerPNF7797page_Savebutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void ClickonStartstockcountbutton() {
		BuyerPNF7797page_Startcountbutton.click();
		try { 
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
