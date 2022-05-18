package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class BuyerRecipesListingPage {

		private static WebDriver driver;

		public BuyerRecipesListingPage(WebDriver driver) {


			BuyerRecipesListingPage.driver = driver;
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
		
		
		@FindBy(xpath = "//input[@placeholder='Search outlet name']")
		private static WebElement BuyerRecipesListingPage_SearchTextBox;
		
		
		
		public static void ClickSearchTextbox() {
			BuyerRecipesListingPage_SearchTextBox.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));


		}
		
	
}
