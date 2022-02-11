package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class AdminBuyerNewCompanypage {


	private static WebDriver driver;

	public AdminBuyerNewCompanypage(WebDriver driver) {


		AdminBuyerNewCompanypage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(true,false,false,false));
	}

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}

	@FindBy(xpath = "//a[text()='New Company']")
	private static WebElement AdminBuyerNewCompanypage_NewCompany;


	@FindBy(xpath = "//input[@placeholder='Registered name']")
	private static WebElement AdminBuyerNewCompanypage_EnterRegisteredname;
	
	@FindBy(xpath = "//input[@placeholder='Alias name (eg. trading name)']")
	private static WebElement AdminBuyerNewCompanypage_Enteraliasname;
	
	@FindBy(xpath = "//input[@placeholder='Post code']")
	private static WebElement AdminBuyerNewCompanypage_EnterPostCode;
	
	@FindBy(xpath = "//input[@placeholder='Address Line 1']")
	private static WebElement AdminBuyerNewCompanypage_EnterAddressLineOne;
	
	@FindBy(xpath = "//input[@formcontrolname='line2']")
	private static WebElement AdminBuyerNewCompanypage_EnterAddressLineTwo;
	
	@FindBy(xpath = "//input[@formcontrolname='regNo']")
	private static WebElement AdminBuyerNewCompanypage_EnterCompanyRegistrationNumber;
	
	@FindBy(xpath = "//input[@formcontrolname='taxRegNo']")
	private static WebElement AdminBuyerNewCompanypage_EnterTaxRegistrationNumber;
	
	@FindBy(xpath = "//input[@formcontrolname='email']")
	private static WebElement AdminBuyerNewCompanypage_EnterCompanyEmail;
	
	@FindBy(xpath = "//input[@formcontrolname='phone']")
	private static WebElement AdminBuyerNewCompanypage_CompanyPhoneNumber;
	
	@FindBy(xpath = "//input[@formcontrolname='phone']")
	private static WebElement AdminBuyerNewCompanypage_EnterCompanyPhoneNumber;
	
	@FindBy(xpath = "//input[@formcontrolname='finaxarEnabled']")
	private static WebElement AdminBuyerNewCompanypage_FinaxarCheckbox;
	
	@FindBy(xpath = "//a[text()='Save company ']")
	private static WebElement AdminBuyerNewCompanypage_SaveCompany;





	public static void newCompanyClick() {
		AdminBuyerNewCompanypage_NewCompany.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void enterregisteredName(String registeredname) {
		AdminBuyerNewCompanypage_EnterRegisteredname.sendKeys(registeredname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void enteraliasname(String aliasname) {
		AdminBuyerNewCompanypage_Enteraliasname.sendKeys(aliasname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void enterPostCode(String postcode) {
		AdminBuyerNewCompanypage_EnterPostCode.sendKeys(postcode);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void enterAddressLineOne(String addresslineone) {
		AdminBuyerNewCompanypage_EnterAddressLineOne.sendKeys(addresslineone);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void enterAddressLineTwo(String addresslinetwo) {
		AdminBuyerNewCompanypage_EnterAddressLineTwo.sendKeys(addresslinetwo);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void enterCompanyRegisterationNumber(String companyregistrationnumber) {
		AdminBuyerNewCompanypage_EnterCompanyRegistrationNumber.sendKeys(companyregistrationnumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void enterTaxRegisterationNumber(String taxregistrationnumber) {
		AdminBuyerNewCompanypage_EnterTaxRegistrationNumber.sendKeys(taxregistrationnumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void acraCertificateClick() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		WebElement uploadimage1=driver.findElement(By.xpath("//input[@name='acrafile[]']"));
		uploadimage1.sendKeys("E:\\Zeemart All\\2     750x300 5mb.jpg");
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void logoClick() throws InterruptedException {
		Thread.sleep(5000);
		WebElement uploadimage2=driver.findElement(By.xpath("//input[@name='file[]']"));
		uploadimage2.sendKeys("E:\\Zeemart All\\2     750x300 5mb.jpg");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void enterCompanyEmail(String companyemail) {
		AdminBuyerNewCompanypage_EnterCompanyEmail.sendKeys(companyemail);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void companyPhoneNumberClear() {
		AdminBuyerNewCompanypage_CompanyPhoneNumber.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void enterCompanyPhoneNumber(String companyphonenumber) {
		AdminBuyerNewCompanypage_EnterCompanyPhoneNumber.sendKeys(companyphonenumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void finaxarCheckboxClick() {
		AdminBuyerNewCompanypage_FinaxarCheckbox.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void SaveCompanyButtonClick() {
		AdminBuyerNewCompanypage_SaveCompany.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}































































































}
