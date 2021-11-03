package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierUserListPage {

	private static WebDriver driver;

	public SupplierUserListPage(WebDriver driver) {


		SupplierUserListPage.driver = driver;
		PageFactory.initElements(driver, this);
	} 

	public static void navigateTo_LogInPage3() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}

	public static void navigateTo_invoiceprocesspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(false,false,false,true));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}



	@FindBy(xpath = "//button[text()=' Add new']")
	private static WebElement SupplierUserListPage_Addnew;

	//@FindBy(xpath = "//button[@id='button-basic']")
	//private static WebElement SupplierUserListPage_Newuser;

	@FindBy(xpath = "//input[@formcontrolname='firstName']")
	private static WebElement SupplierUserListPage_Firstnameenter;

	@FindBy(xpath = "//input[@formcontrolname='lastName']")
	private static WebElement SupplierUserListPage_Lastnameenter;

	@FindBy(xpath = "//input[@formcontrolname='title']")
	private static WebElement SupplierUserListPage_Jobtitleenter;

	@FindBy(xpath = "//input[@formcontrolname='email']")
	private static WebElement SupplierUserListPage_Emailenter;

	@FindBy(xpath = "//input[@formcontrolname='phone']")
	private static WebElement SupplierUserListPage_Mobilenumber;

	@FindBy(xpath = "//input[@formcontrolname='phone']")
	private static WebElement SupplierUserListPage_Mobilenumberenter;

	@FindBy(xpath = "//input[@formcontrolname='whatsapp']")
	private static WebElement SupplierUserListPage_Whatsappnumber;

	@FindBy(xpath = "//input[@formcontrolname='whatsapp']")
	private static WebElement SupplierUserListPage_Whatsappnumberenter;
	
	@FindBy(xpath = "//select[@formcontrolname='supplierRoleGroup']")
	private static WebElement SupplierUserListPage_Permission;
	
	@FindBy(xpath = "//button[text()='Save & exit ']")
	private static WebElement SupplierUserListPage_SaveandExit;
	
	//@FindBy(xpath = "//button[@id='button-basic']")
	//private static WebElement SupplierUserListPage_Checkbox;
	
	//@FindBy(xpath = "//button[@id='button-basic']")
	//private static WebElement SupplierUserListPage_Clear;
	
	@FindBy(xpath = "(//button[contains(@class,'btn btn-gray-blue')])[2]")
	private static WebElement SupplierUserListPage_Disable;
	
	@FindBy(xpath = "//button[text()='Yes, disable']")
	private static WebElement SupplierUserListPage_Yesdisable;
	
	@FindBy(xpath = "//img[@src='assets/zmcore/img/zm-22-tick-green.svg']")
	private static WebElement SupplierUserListPage_Enable;
	
	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	private static WebElement SupplierUserListPage_Textbox;
	
	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	private static WebElement SupplierUserListPage_NameTextBoxEnter;
	
	//@FindBy(xpath = "//button[@id='button-basic']")
	//private static WebElement SupplierUserListPage_ActionsDropdown;
	
	//@FindBy(xpath = "//button[@id='button-basic']")
	//private static WebElement SupplierUserListPage_EditDetails;
	
	@FindBy(xpath = "//input[@formcontrolname='title']")
	private static WebElement SupplierUserListPage_JobTitle;
	
	@FindBy(xpath = "//button[text()='Save']")
	private static WebElement SupplierUserListPage_Save;
	
	@FindBy(xpath = "//button[text()='Search ']")
	private static WebElement SupplierUserListPage_Search;





	public static void AddNewDropdownclick() {
		SupplierUserListPage_Addnew.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void Newuserclick() {
		WebElement newUser = driver.findElement(By.linkText("New user"));
		newUser.click();
		//SupplierUserListPage_Newuser.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void FirstNameEnter(String firstname) {
		SupplierUserListPage_Firstnameenter.sendKeys(firstname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void LastNameEnter(String lastname) {
		SupplierUserListPage_Lastnameenter.sendKeys(lastname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void JobTitleEnter(String jobtitle) {
		SupplierUserListPage_Jobtitleenter.sendKeys(jobtitle);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void EmailEnter(String email) {
		SupplierUserListPage_Emailenter.sendKeys(email);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void MobileNumberClear() {
		SupplierUserListPage_Mobilenumber.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void MobileNumberEnter(String mobilenumber) {
		SupplierUserListPage_Mobilenumberenter.sendKeys(mobilenumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void WhatsappNumberClear() {
		SupplierUserListPage_Whatsappnumber.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void WhatsappNumberEnter(String whatsappnumber) {
		SupplierUserListPage_Whatsappnumberenter.sendKeys(whatsappnumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void ProfilePhotoUpload() throws InterruptedException {
		WebElement uploadphoto=driver.findElement(By.xpath("//input[@name='file']"));
		uploadphoto.sendKeys("E:\\Zeemart All\\Chromedriver91\\Download5mb.jpg");
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}




	public static void PermissionSelectDropdown() {
		SupplierUserListPage_Permission.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public WebElement getDropDownElementOwner() {
		return SupplierUserListPage_Permission;
	}

	public static void SaveandExitclick() {
		SupplierUserListPage_SaveandExit.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void CheckBoxclick() throws InterruptedException {
		Thread.sleep(5000);
		//SupplierUserListPage_Checkbox.click();
		
		WebElement chkFBPersist = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));					
        for (int i=0; i<2; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
        }
	}

	public static void Clearclick() {
		WebElement clear = driver.findElement(By.linkText("Clear"));
		clear.click();
		//SupplierUserListPage_Clear.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Disableclick() {
		SupplierUserListPage_Disable.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void Yesdisableclick() {
		SupplierUserListPage_Yesdisable.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Enableclick() {
		SupplierUserListPage_Enable.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Textboxclick() {
		SupplierUserListPage_Textbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void NameTextBoxEnter(String name) {
		SupplierUserListPage_NameTextBoxEnter.sendKeys(name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

		
	}

	public static void ActionsDropdownclick() {
		WebElement actions = driver.findElement(By.linkText("Actions"));
		actions.click();
		//SupplierUserListPage_ActionsDropdown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void EditDetailsclick() {
		WebElement editDetails = driver.findElement(By.linkText("Edit details"));
		editDetails.click();
		//SupplierUserListPage_EditDetails.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void JobTitleclear() {
		SupplierUserListPage_JobTitle.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Saveclick() {
		SupplierUserListPage_Save.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void Searchclick() {
		SupplierUserListPage_Search.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void CheckBoxthirdclick() throws InterruptedException {
		Thread.sleep(5000);
		WebElement chkFBPersist = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));					
        for (int i=0; i<2; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
        }
	}

	public static void CheckBoxFourthclick() throws InterruptedException {
		Thread.sleep(5000);
		WebElement chkFBPersist = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));					
        for (int i=0; i<2; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
        }
	}
		
	}















































