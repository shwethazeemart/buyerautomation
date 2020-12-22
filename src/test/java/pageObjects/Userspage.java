package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Userspage {

	private static WebDriver driver;

	public Userspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_Userspage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));
	}
	

	@FindBy(xpath="//*[@class='button ng-star-inserted']")
	private static WebElement Userspage_Addnewuser; 

	//@FindBy(xpath="//input[@role='combobox']")
	//private static WebElement Userspage_VELUMASALA; 
	
	//@FindBy(xpath="//label[text()='Outlet']/following::input")
	//private static WebElement Userspage_velumasala2020; 
	
	@FindBy(xpath="//*[@formcontrolname='firstName']")
	private static WebElement Userspage_Firstname; 
	
	@FindBy(xpath="//*[@formcontrolname='lastName']")
	private static WebElement Userspage_Lastnamee; 
	
	@FindBy(xpath="//input[@formcontrolname='title']")
	private static WebElement Userspage_Jobtitle; 
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	private static WebElement Userspage_Email; 
	
	@FindBy(xpath="//label[@class='custom-control custom-checkbox mb-2 mr-sm-2 mb-sm-0 custom_control_small_txt zmart smaller']")
	private static WebElement Userspage_checkBoxSelected; 
	
	@FindBy(xpath="//input[@formcontrolname='phone']")
	private static WebElement Userspage_Mobilefield;  
	
	@FindBy(xpath="//input[@formcontrolname='phone']")
	private static WebElement Userspage_Mobilephone; 
	
	@FindBy(xpath="//div[@class='form-group']//select[1]")
	private static WebElement Userspage_Owner;  
	
	//@FindBy(xpath="//button[@type='submit']")
	//private static WebElement Userspage_Savebutton; 
	

	public static void click_Addnewuser() throws InterruptedException {
		Userspage_Addnewuser.click();
		Thread.sleep(2000);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
		
	}
	public static void click_VELUMASALA() {
		//Userspage_VELUMASALA.click();
		driver.findElement(By.xpath("(//input[@role='combobox'])[1]")).sendKeys("VELU MASALA",Keys.ENTER);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	/*public static WebElement getDropDownElement() {
		return Userspage_VELUMASALA;
	}*/
	
	public static void click_velumasala2020() {
		//Userspage_velumasala2020.click();
		driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("velu masala2020",Keys.ENTER);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	/*public static WebElement getDropDownOutletElement() {
		return Userspage_velumasala2020;
	}*/

	public static void paste_Firstname(String firstname) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Userspage_Firstname );
		Thread.sleep(3000);
		Userspage_Firstname.sendKeys(firstname);
		
	}

	public static void paste_Lastname(String lastname) {
		Userspage_Lastnamee.sendKeys(lastname);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void paste_Jobtitle(String jobtitle) {
		Userspage_Jobtitle.sendKeys(jobtitle);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}

	public static void enter_Email(String email) {
		Userspage_Email.sendKeys(email);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	public static void click_checkBoxSelected() {
		Actions builder = new Actions(driver);
		builder.moveToElement(Userspage_checkBoxSelected).click().build().perform();
		
		//Userspage_checkBoxSelected.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownOutletcheckBoxElement() {
		return Userspage_checkBoxSelected;
	}

	/*public static void enter_Mobilephone(Double mobilephone) {
		Userspage_Mobilephone.sendKeys("mobilephone");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}*/
	
	public static void click_Profilephoto() throws InterruptedException {
		WebElement uploadBox=driver.findElement(By.xpath("//input[@name='file']")); 
		uploadBox.sendKeys("E:\\Zeemart All\\LIC Bill\\file_example_JPG_5mb.jpg");
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	
	public static void click_Owner() {
		Userspage_Owner.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getDropDownOwnerElement() {
		return Userspage_Owner;
	}

	public static void click_Savebutton() {
		//Userspage_Savebutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
		
	  }

	public static void clear_Mobilefield() throws InterruptedException {
		// TODO Auto-generated method stub
		Userspage_Mobilefield.clear();
		Thread.sleep(5000);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	
		
	 
	}

	public static void enter_Mobilephone(String mobilephone) throws InterruptedException {
		Userspage_Mobilephone.sendKeys(mobilephone);
		Thread.sleep(5000);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	
		
	 }
	
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
