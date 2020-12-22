package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Orchidpage {

	private static WebDriver driver;

	public Orchidpage(WebDriver driver) {


		Orchidpage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void navigateTo_LogInPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	} 

	public void isTosterMessageFound(String msg) {
		WebElement tosterMsg = driver.findElement(By.xpath("//*[text()='" + msg + "']"));

	}
	
	@FindBy(xpath = "(//a[@href='https://www.orchidclub.com/'])[1]")
	private static WebElement Orchidpage_Homepage;
	
	@FindBy(xpath = "//i[@class='eicon-close']")
	private static WebElement Orchidpage_POPmessage;
	
	@FindBy(xpath = "//img[@src='https://www.orchidclub.com/wp-content/uploads/2019/10/OnlineGolfBooking_18Dec20-1.png']")
	private static WebElement Orchidpage_Onlinebookinglink;
	
	@FindBy(xpath = "//input[@type='email']")
	private static WebElement Orchidpage_EnterEmailaddress;
	
	@FindBy(xpath = "(//input[@dir='auto'])[2]")
	private static WebElement Orchidpage_Enternameofplayerone;
	
	@FindBy(xpath = "(//input[@dir='auto'])[3]")
	private static WebElement Orchidpage_Entermembershipnumberone;
	
	@FindBy(xpath = "(//input[@class='quantumWizTextinputPaperinputInput exportInput']) [4]")
	private static WebElement Orchidpage_Entermobilenumber;
	
	
	@FindBy(xpath = "(//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle'])[2]")
	private static WebElement Orchidpage_Automaticradio;
	
	@FindBy(xpath = "(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[6]")
	private static WebElement Orchidpage_Enterteetime;
	
	@FindBy(xpath = "(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[7]")
	private static WebElement Orchidpage_Enterplayernametwo;
	
	
	@FindBy(xpath = "(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[8]")
	private static WebElement Orchidpage_Entermembershipnumbertwo;
	
	@FindBy(xpath = "(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[9]")
	private static WebElement Orchidpage_Enterplayernamethree;
	
	@FindBy(xpath = "(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[10]")
	private static WebElement Orchidpage_Entermembershipnumberthree;
	
	@FindBy(xpath = "(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[11]")
	private static WebElement Orchidpage_Enterplayernamefour;
	
	@FindBy(xpath = "(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[12]")
	private static WebElement Orchidpage_Entermembershipnumberfour;
	
	@FindBy(xpath = "//button[text()=' Oldest first ']")
	private static WebElement Orchidpage_Nextbutton;
	
	
	
	
	/*public void Clicksinurl() throws InterruptedException {
		//driver.findElement(By.cssSelector("a[title=\"HOME\"]")).click();		
		
		driver.get("https://www.orchidclub.com/");
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));	
	}*/

	/*public void Clicksinhomepage() {
		//driver.findElement(By.cssSelector("a[title=\"HOME\"]")).click();		
	
		Orchidpage_Homepage.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}*/

	public void ClickPOPmessage() throws InterruptedException {
		Orchidpage_POPmessage.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicksonlinebookoinglink() throws InterruptedException {
			
		//driver.findElement(By.cssSelector("a[title=\"WEEKDAY 18-HOLE&9-HOLE(BUGGY)\"]")).click();		
	
		Orchidpage_Onlinebookinglink.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void enter_exact_Email_Address(String Email) {
		Orchidpage_EnterEmailaddress.sendKeys(Email);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void enter_full_name_of_the_playerone(String playerone) {
		Orchidpage_Enternameofplayerone.sendKeys(playerone);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void enter_membership_number_one(String membershipnumberone) {
		Orchidpage_Entermembershipnumberone.sendKeys(membershipnumberone);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public void enter_mobilenumber(String mobilenumber) {
		Orchidpage_Entermobilenumber.sendKeys(mobilenumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}
	
	public static void SelectcalendarByJS() {
		WebElement DateBox=driver.findElement(By.xpath("//input[@type='date']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='21Dec2020';", DateBox);


	}
	
	public static void click_automaticradio() throws InterruptedException {
		Orchidpage_Automaticradio.click();
		Thread.sleep(5000);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}
	public static WebElement getapplyfeesradioElement() {
		return Orchidpage_Automaticradio;
	}

	public void enter_prepare_tee_time(String teetime) {
		Orchidpage_Enterteetime.sendKeys(teetime);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void enter_player_name_two(String playernametwo) {
		Orchidpage_Enterplayernametwo.sendKeys(playernametwo);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void enter_membership_numbertwo(String membershipnumbertwo) {
		Orchidpage_Entermembershipnumbertwo.sendKeys(membershipnumbertwo);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void enter_player_name_three(String playernamethree) {
		Orchidpage_Enterplayernamethree.sendKeys(playernamethree);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public void enter_membership_numberthree(String membershipnumberthree) {
		Orchidpage_Entermembershipnumberthree.sendKeys(membershipnumberthree);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void enter_player_name_four(String playernamefour) {
		Orchidpage_Enterplayernamefour.sendKeys(playernamefour);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void enter_membership_number_four(String membershipnumberfour) {
		Orchidpage_Entermembershipnumberfour.sendKeys(membershipnumberfour);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public void Clicks_the_next_button() {
		Orchidpage_Nextbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		} 
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}
	
	
	
	public static String getPageTitle() {
		return driver.getTitle();   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
