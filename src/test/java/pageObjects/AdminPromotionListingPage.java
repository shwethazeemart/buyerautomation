package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class AdminPromotionListingPage {


		private static WebDriver driver;

		public AdminPromotionListingPage(WebDriver driver) {


			AdminPromotionListingPage.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public static void navigateTo_LogInPage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
		}

		public void isTosterMessageFound(String msg) {
			WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

		}
		
		
		@FindBy(xpath = "(//datatable-body-cell[contains(@class,'actionActive cellAlignLeft')])[10]")
		private static WebElement AdminOrderDetailsPage_Order;
		
	
}
