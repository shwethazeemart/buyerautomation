package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class Newrecurringorderspage {

	private static WebDriver driver;

	public Newrecurringorderspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
		
	}
	public void navigateTo_Orderspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	public void isTosterMessageFound1(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));
	}
	
	@FindBy(xpath="//*[contains(text(),'Orders')]")
	private static WebElement menubar_orders; 
	
	@FindBy(xpath = "//button[text()=' New order']")
	private static WebElement orderspage_Neworder; 
	
	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));
	}
	
	@FindBy(xpath="//*[contains(text(),'Orders')]")
	private static WebElement menubar_orders; 
	
	@FindBy(xpath = "//button[text()=' New order']")
	private static WebElement orderspage_Neworder; 
		
	}
	
	
	
}
