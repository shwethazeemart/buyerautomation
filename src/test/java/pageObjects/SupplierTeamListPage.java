package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class SupplierTeamListPage {

	private static WebDriver driver;

	public SupplierTeamListPage(WebDriver driver) {


		SupplierTeamListPage.driver = driver;
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




	//@FindBy(xpath = "//button[text()=' Add new']")
	//private static WebElement SupplierTeamListPage_Teams;

	//@FindBy(xpath = "//button[text()=' Add new']")
	//private static WebElement SupplierTeamListPage_NewTeam;

	@FindBy(xpath = "//label[text()='Team name']/following::input")
	private static WebElement SupplierTeamListPage_TeamNameEnter;

	@FindBy(xpath = "//button[text()='Next: Link to outlet ']")
	private static WebElement SupplierTeamListPage_NextLinkOutlet;

	@FindBy(xpath = "//button[text()=' Add new ']")
	private static WebElement SupplierTeamListPage_AddNewbutton;

	@FindBy(xpath = "//div[@role='combobox']//input[1]")
	private static WebElement SupplierTeamListPage_OutletDropdown;
	
	@FindBy(xpath = "//button[text()='Save']")
	private static WebElement SupplierTeamListPage_Savebutton;
	
	//@FindBy(xpath = "//button[text()=' Add new']")
	//private static WebElement SupplierTeamListPage_ActionsDropdown;
	
	//@FindBy(xpath = "//button[text()=' Add new']")
	//private static WebElement SupplierTeamListPage_GotoOutletSetting;
	
	@FindBy(xpath = "(//div[@class='datatable-body-cell-label']//div)[2]")
	private static WebElement SupplierTeamListPage_ActionDropdowninTeams;
	
	@FindBy(xpath = "//label[text()='Team name']/following::input")
	private static WebElement SupplierTeamListPage_TeamName;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	private static WebElement SupplierTeamListPage_Save;
	
	@FindBy(xpath = "(//div[@role='option'])[2]")
	private static WebElement SupplierTeamListPage_FirstDropdown;
	
	//@FindBy(xpath = "//button[text()=' Add new']")
	//private static WebElement SupplierTeamListPage_EditDetails;








	public static void Teamsclick() {
		WebElement teams = driver.findElement(By.linkText("Teams"));
		teams.click();
		//SupplierTeamListPage_Teams.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void NewTeamclick() {
		WebElement newTeam = driver.findElement(By.linkText("New team"));
		newTeam.click();
		//SupplierTeamListPage_NewTeam.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void TeamNameEnter(String TeamName) {
		SupplierTeamListPage_TeamNameEnter.sendKeys(TeamName);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));


	}

	public static void NextLinkOutletclick() {
		SupplierTeamListPage_NextLinkOutlet.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void AddNewbuttonclick() throws InterruptedException {
		Thread.sleep(5000);
		SupplierTeamListPage_AddNewbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}


	

	public static void Savebuttonclick() {
		WebElement selectOutlet = driver.findElement(By.xpath("//h4[text()='Select outlet']"));
		selectOutlet.click();
		SupplierTeamListPage_Savebutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));

	}

	public static void ActionsDropdownclick() throws InterruptedException {
		Thread.sleep(5000);
		WebElement actions = driver.findElement(By.linkText("Actions"));
		actions.click();
		//SupplierTeamListPage_ActionsDropdown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void GotoOutletSettingclick() {
		WebElement goToOutlet = driver.findElement(By.linkText("Go to outlet settings"));
		goToOutlet.click();
		//SupplierTeamListPage_GotoOutletSetting.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void ActionsDropdowninTeamsclick() throws InterruptedException {
		Thread.sleep(5000);
		SupplierTeamListPage_ActionDropdowninTeams.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
		
	}

	public static void TeamNameclear() {
		SupplierTeamListPage_TeamName.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void Saveclick() {
		SupplierTeamListPage_Save.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void OutletDropdownclick() {
		SupplierTeamListPage_OutletDropdown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void FirstDropdownList() {
		SupplierTeamListPage_FirstDropdown.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}

	public static void EditDetailsclick() {
		WebElement editSettings = driver.findElement(By.linkText("Edit settings"));
		editSettings.click();
		//SupplierTeamListPage_EditDetails.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		new WebDriverWait(driver, 30).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		
	}





}
