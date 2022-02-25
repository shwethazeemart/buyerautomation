package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminNotificationEditPage {

			private static WebDriver driver;

		public AdminNotificationEditPage(WebDriver driver) {


			AdminNotificationEditPage.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public static void navigateTo_LogInPage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
		}

		public void isTosterMessageFound(String msg) {
			WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

		}

		@FindBy(xpath = "//input[@formcontrolname='title']")
		private static WebElement AdminNotificationEditPage_SearchTitle;
		
		@FindBy(xpath = "//input[@formcontrolname='title']")
		private static WebElement AdminNotificationEditPage_EnterSearchTitle;
		
		@FindBy(xpath = "//select[@formcontrolname='status']")
		private static WebElement AdminNotificationEditPage_SelectStatus;
		
		@FindBy(xpath = "//button[text()='Search ']")
		private static WebElement AdminNotificationEditPage_SearchIcon;
		
		@FindBy(xpath = "(//a[@class='zmdropDownBtn'])[1]")
		private static WebElement AdminNotificationEditPage_ActionsDropdown;
		
		@FindBy(xpath = "//div[@class='zmDropDown']//a[1]")
		private static WebElement AdminNotificationEditPage_Edit;
		
		@FindBy(xpath = "//input[@formcontrolname='title']")
		private static WebElement AdminNotificationEditPage_Clear;
		
		@FindBy(xpath = "//input[@formcontrolname='title']")
		private static WebElement AdminNotificationEditPage_EnterTitle;
		
		@FindBy(xpath = "//button[@type='submit']")
		private static WebElement AdminNotificationEditPage_Save;
		
		@FindBy(xpath = "(//a[@routerlinkactive='active'])[2]")
		private static WebElement AdminNotificationEditPage_Delete;
		
		@FindBy(xpath = "//span[text()='Clear selection']")
		private static WebElement AdminNotificationEditPage_ClearSelectionIcon;
		
		@FindBy(xpath = "(//input[@class='custom-control-input'])[2]")
		private static WebElement AdminNotificationEditPage_Checkbox;
		
		@FindBy(xpath = "//button[text()='Delete ']")
		private static WebElement AdminNotificationEditPage_DeleteOption;

		public static void ClickSearchTitle() {
			AdminNotificationEditPage_SearchTitle.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));	
		}

		public static void EnterSearchTitle(String searchtitle) {
			AdminNotificationEditPage_EnterSearchTitle.sendKeys(searchtitle);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickStatus() {
			AdminNotificationEditPage_SelectStatus.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));	
		}
		public static WebElement getDropDownStatusElement() {
			return AdminNotificationEditPage_SelectStatus;
		}

		public static void ClickSearchIcon() {
			AdminNotificationEditPage_SearchIcon.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));	
		}

		public static void ClickActionsDropdown() {
			AdminNotificationEditPage_ActionsDropdown.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));	
		}

		public static void ClickEdit() {
			AdminNotificationEditPage_Edit.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickClear() {
			AdminNotificationEditPage_Clear.clear();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void EntertheTitle(String title) {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)");
			AdminNotificationEditPage_EnterTitle.sendKeys(title);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickSave() {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1000)");
			AdminNotificationEditPage_Save.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}
		
		public static void ClicktheDelete() {
			AdminNotificationEditPage_Delete.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClicktheClearSelectionIcon() {
			AdminNotificationEditPage_ClearSelectionIcon.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickCheckbox() {
			AdminNotificationEditPage_Checkbox.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void ClickDeleteOption() {
			AdminNotificationEditPage_DeleteOption.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			} 
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		
}
