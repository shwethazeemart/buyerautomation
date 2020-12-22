package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

/**
 * 
 * @author AjanthanSivalingarajah
 * @since 2020/05/12
 *
 */
public class DashboardPage {
	private static WebDriver driver;

	public DashboardPage(WebDriver driver) {
		DashboardPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*@FindBy(how = How.NAME, using = "dashboard")
	private WebElement btn_Dashboard;*/
	
	@FindBy(xpath = "//a[@class='nav-link active']")
	private WebElement btn_Dashboard;
	

	@FindBy(xpath = "//span[@id='sideMenu_Orders']")
	private  WebElement button_Orders;
	
	@FindBy(xpath = "//span[contains(@Id,'sideMenu_Invoices')]")
	private  WebElement button_Invoices;
	
	@FindBy(xpath = "//span[@id='sideMenu_Invoices']//parent::a")
	private  WebElement button_AdminInvoices;
	
	@FindBy(xpath = "//span[@id='sideMenu_Buyers']//parent::a")
	private  WebElement button_AdminBuyers;
	
	@FindBy(xpath = "//span[@id='sideMenu_Users']//parent::a")
	private  WebElement button_Adminnewbuyeruser;
	
	@FindBy(xpath = "//span[@id='sideMenu_Users']//parent::a")
	private  WebElement button_Adminnewsupplieruser;
	
	@FindBy(xpath = "//span[@id='sideMenu_Suppliers']//parent::a")
	private  WebElement button_AdminSuppliers;
	
	@FindBy(xpath = "//span[contains(@Id,'sideMenu_Users')] ")
	private  WebElement button_Users;
	
	
	@FindBy(xpath = "//span[contains(@Id,'sideMenu_Inventory')] ")
	private  WebElement button_Inventory;
	
	@FindBy(xpath = "//html/body/div[2]/header/div[1]/div[2]/nav/ul/li[1]/a")
	private static WebElement Orchidpage_Homelinkbutton;
	

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getBackgroundColor() {
		return btn_Dashboard.getAttribute("background-color");
	}

	public static void navigateTo_DashboardPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	// @FindBy(xpath = "//button[text()=' Search ']")
	// private WebElement btn_search;

	// public void navigateTo_DashboardPage() {
	// driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	// }
	// public void enter_Search_OrderId(String searchText) {
	// txtbx_filterOrder.sendKeys(searchText);
	// }

	public void click_DashboardBtn() {
		btn_Dashboard.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
//	public void clickOrders() {
//		btn_Orders.click();
//		//return this;
//		
//	}
	public void clickOrders() throws InterruptedException {
	
		button_Orders.click();
		Thread.sleep(5000);

}
	public void clickInvoices() throws InterruptedException {
		button_Invoices.click();
		Thread.sleep(5000); 

}
	public void clickUsers() throws InterruptedException {
		
		button_Users.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
public void clickInventory() throws InterruptedException {
		
		button_Inventory.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
public void clickAdminInvoices() throws InterruptedException {
	button_AdminInvoices.click();
	Thread.sleep(5000);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	}
	new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
			.executeScript("return document.readyState").equals("complete"));
}

public void clickAdminBuyers() throws InterruptedException {
	button_AdminBuyers.click();
	Thread.sleep(5000);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	}
	new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
			.executeScript("return document.readyState").equals("complete"));
}

public void clickBuyersnewuser() throws InterruptedException {
	button_Adminnewbuyeruser.click();
	Thread.sleep(5000);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	}
	new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
			.executeScript("return document.readyState").equals("complete"));
}

public void clickAdminSuppliers() throws InterruptedException {
	button_AdminSuppliers.click();
	Thread.sleep(5000);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	}
	new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
			.executeScript("return document.readyState").equals("complete"));
}
public void clickSuppliernewuser() throws InterruptedException {
	button_Adminnewsupplieruser.click();
	Thread.sleep(5000);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	}
	new WebDriverWait(driver, 50).until(webDriver -> ((JavascriptExecutor) webDriver)
			.executeScript("return document.readyState").equals("complete"));
}
public void Clicksinhomepage() throws InterruptedException {
	//driver.findElement(By.cssSelector("a[title=\"HOME\"]")).click();		
	Orchidpage_Homelinkbutton.click();
	Thread.sleep(5000);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
	} 
	new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
			.executeScript("return document.readyState").equals("complete"));	
}

}
