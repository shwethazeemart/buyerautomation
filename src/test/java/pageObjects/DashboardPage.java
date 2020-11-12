package pageObjects;

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

	@FindBy(how = How.NAME, using = "dashboard")
	private WebElement btn_Dashboard;

	public String getPageTitle() {
		return driver.getTitle();
	}

	/*public String getBackgroundColor() {
		 return btn_Dashboard.getAttribute("background-color");
	}*/

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

}