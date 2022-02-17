package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminEssentialsPage {

		private static WebDriver driver;

		public AdminEssentialsPage(WebDriver driver) {


			AdminEssentialsPage.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public static void navigateTo_LogInPage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
		}

		public void isTosterMessageFound(String msg) {
			WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

		}

		@FindBy(xpath = "//a[@href='/sg/pages/suppliers/essentials-list']")
		private static WebElement AdminEssentialsPage_EssentialsTab;
		
		@FindBy(xpath = "//input[@placeholder='Search supplier']")
		private static WebElement AdminEssentialsPage_SupplierName;

		@FindBy(xpath = "//select[@formcontrolname='status']")
		private static WebElement AdminEssentialsPage_Status;
		
		@FindBy(xpath = "//button[text()='Search']")
		private static WebElement AdminEssentialsPage_SearchBtn;

		@FindBy(xpath = "(//a[@class='zmdropDownBtn'])[1]")
		private static WebElement AdminEssentialsPage_Actions;
		
		@FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
		private static WebElement AdminEssentialsPage_ViewSettings;
		
		@FindBy(xpath = "//select[@formcontrolname='supplierId']")
		private static WebElement AdminEssentialsPage_SupplierDropdown;
		
		@FindBy(xpath = "//input[@formcontrolname='shortDesc']")
		private static WebElement AdminEssentialsPage_ShortDescrip;
		
		@FindBy(xpath = "//textarea[@formcontrolname='description']")
		private static WebElement AdminEssentialsPage_Description;
		
		@FindBy(xpath = "//button[text()='Save']")
		private static WebElement AdminEssentialsPage_SaveLandingBanner;
		
		@FindBy(xpath = "//input[@formcontrolname='rebatePercentage']")
		private static WebElement AdminEssentialsPage_RebatePercent;
			
		@FindBy(xpath = "//button[text()='Save']")
		private static WebElement AdminEssentialsPage_SaveCarousebanner;
				
		@FindBy(xpath = "//input[@formcontrolname='deliveryFeePolicyMinOrderAmount']")
		private static WebElement AdminEssentialsPage_MinimumOrder;
		
		@FindBy(xpath = "(//input[@formcontrolname='deliveryFeePolicyType'])[2]")
		private static WebElement AdminEssentialsPage_RadioButton;
		
		@FindBy(xpath = "//input[@formcontrolname='deliveryFeePolicyFeeAmount']")
		private static WebElement AdminEssentialsPage_CutOffTime;
		
		@FindBy(xpath = "//select[@formcontrolname='deliveryFeePolicyCondition']")
		private static WebElement AdminEssentialsPage_Applyfee;
		
		@FindBy(xpath = "(//input[@type='checkbox'])[3]")
		private static WebElement AdminEssentialsPage_CheckboxofMonday;
		
		@FindBy(xpath = "//input[@formcontrolname='days']")
		private static WebElement AdminEssentialsPage_CutOffTimeMonday;
		
		@FindBy(xpath = "(//div[@class='d-inline-flex']//input)[3]")
		private static WebElement AdminEssentialsPage_Time;
		
		@FindBy(xpath = "//span[text()=' Set ']")
		private static WebElement AdminEssentialsPage_SetButton;
		
		@FindBy(xpath = "(//input[@type='checkbox'])[5]")
		private static WebElement AdminEssentialsPage_CheckboxWednesday;
		
		@FindBy(xpath = "(//input[@formcontrolname='days'])[3]")
		private static WebElement AdminEssentialsPage_CutOffTimeWednes;
		
		@FindBy(xpath = "(//div[@class='d-inline-flex']//input)[7]")
		private static WebElement AdminEssentialsPage_WednesTime;
		
		@FindBy(xpath = "//span[text()=' Set ']")
		private static WebElement AdminEssentialsPage_WednesSetBtn;
		
		@FindBy(xpath = "(//input[@formcontrolname='allOutlets'])[1]")
		private static WebElement AdminEssentialsPage_AllOutletsRadioBtn;
		
		@FindBy(xpath = "//input[@formcontrolname='notifyEmail']")
		private static WebElement AdminEssentialsPage_ByEmail;
		
		@FindBy(xpath = "//button[@class='btn btn-primary pull-right']")
		private static WebElement AdminEssentialsPage_UpdateSettings;
				
		public static void ClickEssentialsTab() {
			AdminEssentialsPage_EssentialsTab.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}

		public static void EnterSupplierName(String name) {
			AdminEssentialsPage_SupplierName.sendKeys(name);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));
		}
		

		    public static void clickOnStatus() {
			AdminEssentialsPage_Status.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
					.executeScript("return document.readyState").equals("complete"));

		}
		    public static WebElement getDropDownStatusElement() {
				return AdminEssentialsPage_Status;
			}

			public static void ClickSearchBtn() {
				AdminEssentialsPage_SearchBtn.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ClickActions() throws InterruptedException {
				Thread.sleep(5000);
				AdminEssentialsPage_Actions.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ViewSettingsClick() throws InterruptedException {
				Thread.sleep(5000);
				AdminEssentialsPage_ViewSettings.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void SupplierDropdownClick() {
				AdminEssentialsPage_SupplierDropdown.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static WebElement getDropDownsupplierElement() {
				return AdminEssentialsPage_SupplierDropdown;
			}

			public static void EnterShortDescrip(String descrip) {
				AdminEssentialsPage_ShortDescrip.sendKeys(descrip);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void EnterDescription(String description) {
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)");
				AdminEssentialsPage_Description.sendKeys(description);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ClickLandingBanner() throws InterruptedException {
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)");
				
				WebElement bannertwo=driver.findElement(By.xpath("(//input[@class='custom-file-input'])[1]"));
			    bannertwo.click();
				Thread.sleep(5000);
				WebElement uploadBox=driver.findElement(By.xpath("//input[@class='ngx-file-drop__file-input']"));
				uploadBox.sendKeys("E:/Zeemart/employers-750x300.jpg");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));	
			}
			public static void ClickSaveLandingBanner() {
				AdminEssentialsPage_SaveLandingBanner.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void EnterRebatePercent(String percentvalue) {
				AdminEssentialsPage_RebatePercent.sendKeys(percentvalue);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ClickCarousebanner() throws InterruptedException {
				WebElement bannertwo=driver.findElement(By.xpath("(//input[@class='custom-file-input'])[2]"));
			    bannertwo.click();
				Thread.sleep(5000);
				WebElement uploadBox=driver.findElement(By.xpath("//input[@class='ngx-file-drop__file-input']"));
				uploadBox.sendKeys("E:/Zeemart/employers-750x300.jpg");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));	
			
			}

			public static void ClickSaveCarousebanner() {
				AdminEssentialsPage_SaveCarousebanner.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void SelectCalendarFromdate() {
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)");
				WebElement DateBox=driver.findElement(By.xpath("//input[@formcontrolname='startTime']"));

				JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("arguments[0].value='1 Feb 2022';", DateBox);
			}

			public static void SelectCalendarUntildate() throws InterruptedException {
				Thread.sleep(5000);
				WebElement DateBoxtwo=driver.findElement(By.xpath("//input[@formcontrolname='endTime']"));

				JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("arguments[0].value='22 Feb 2022';", DateBoxtwo);

			}

			public static void EnterMinimumOrder(String minimumorder) {
				AdminEssentialsPage_MinimumOrder.sendKeys(minimumorder);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ClickonRadioBtn() {
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)");
				AdminEssentialsPage_RadioButton.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void EnterCutOffTime(String cutOffTime) {
				AdminEssentialsPage_CutOffTime.sendKeys(cutOffTime);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}
			    
			public static void clickOnApplyFee() throws InterruptedException {
				Thread.sleep(5000);
				AdminEssentialsPage_Applyfee.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));

			}
			public static WebElement getDropDownApplyfeeElement() {
				return AdminEssentialsPage_Applyfee;
			}

			public static void CheckboxofMonday() {
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)");
				AdminEssentialsPage_CheckboxofMonday.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));

			}

			public static void EnterCutOffTimeMonday(String mondaycutoff) {
				AdminEssentialsPage_CutOffTimeMonday.sendKeys(mondaycutoff);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ClicktheTime() {
				AdminEssentialsPage_Time.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void clickOnSetBtn() {
				AdminEssentialsPage_SetButton.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ClickCheckboxWednes() {
				AdminEssentialsPage_CheckboxWednesday.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void EnterCutOffTimeWednes(String wednescutoff) {
				AdminEssentialsPage_CutOffTimeWednes.sendKeys(wednescutoff);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ClickWednesTime() {
				AdminEssentialsPage_WednesTime.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ClickSet() {
				AdminEssentialsPage_WednesSetBtn.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void ClickAllOutletsRadioBtn() {
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)");
				AdminEssentialsPage_AllOutletsRadioBtn.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

			public static void EnterByEmail(String byemail) {
				AdminEssentialsPage_ByEmail.sendKeys(byemail);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}
			
			public static void ClickUpdateSettings() {
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)");
				AdminEssentialsPage_UpdateSettings.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
						.executeScript("return document.readyState").equals("complete"));
			}

}
		