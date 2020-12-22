package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DashboardPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.Userspage;

public class UserspageSteps {


	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private InvoicesPage invoicespage;
	private Userspage userspage;
	private DashboardPage dashboradpage;

	public UserspageSteps(TestContext testContext) { 
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = testContext.getPageObjectManager().getLogInPage();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.userspage = (Userspage)testContext.getPageObjectManager().getUsersPage();
	}


	@And("User Clicks on Users in the side navigation menubar")
	public void user_Clicks_on_Users_in_the_side_navigation_menubar() throws InterruptedException {
		dashboradpage.clickUsers();
	}

	@Then("User is Clicks in Add new user button")
	public void user_is_Clicks_in_Add_new_user_button() throws InterruptedException {
		Userspage.click_Addnewuser(); 
	}

	@And("User are Select Company in the textbox lists")
	public void user_are_Select_Company_in_the_textbox_lists() {
		Userspage.click_VELUMASALA();
		//WebElement VELUMASALA = Userspage.getDropDownElement();
		//Select select=new Select(VELUMASALA);
		//select.selectByIndex(1);
	}

	@Then("User is Selct Outlet in the textbox lists")
	public void user_is_Selct_Outlet_in_the_textbox_lists() {
		Userspage.click_velumasala2020();
		//WebElement velumasala2020 = Userspage.getDropDownOutletElement();
		//Select select=new Select(velumasala2020);
		// select.selectByIndex(1);
	}
	@When("User enter the First name in the First name field{string}")
	public void user_enter_the_First_name_in_the_First_name_field_lingesh(String Firstname) throws InterruptedException {
		Userspage.paste_Firstname(Firstname);
	}

	@Then("User enter the Last name in the Last name field{string}")
	public void user_enter_the_Last_name_in_the_Last_name_field_sabari(String Lastname) {
		Userspage.paste_Lastname(Lastname);
	}
	@Then("User enter Job title in the Job title field{string}") 
	public void user_enter_Job_title_in_the_Job_title_field_ATZ(String Jobtitle) {
		Userspage.paste_Jobtitle(Jobtitle);
	}

	@Then("User are enter Email in the Email field{string}")
	public void user_are_enter_Email_in_the_Email_field_lingeshsabari10072009_gmail_com(String Email) {
		Userspage.enter_Email(Email);
	}


	@And("User is Clicks checkbox")
	public void user_is_Clicks_checkbox() {
		WebElement checkBoxSelected = Userspage.getDropDownOutletcheckBoxElement();
		boolean isSelected=checkBoxSelected.isSelected();
	}
	@Then("User are clear the Mobile phone field")
	public void user_are_clear_the_Mobile_phone_field() throws InterruptedException {
		Userspage.clear_Mobilefield();
	}
	
	@Then("User are enter Mobile phone in the Mobile phone field{string}")
	public void user_are_enter_Mobile_phone_in_the_Mobile_phone_field(String Mobilephone) throws InterruptedException {
		Userspage.enter_Mobilephone(Mobilephone); 
	} 

	/*@Then("User are enter Mobile phone in the Mobile phone field{double}")
	public void user_are_enter_Mobile_phone_in_the_Mobile_phone_field(Double Mobilephone) {
		Userspage.enter_Mobilephone(Mobilephone);
	}*/


	@And("User is upload Profile photo in that field")
	public void user_is_upload_Profile_photo_in_that_field() throws InterruptedException {
		Userspage.click_Profilephoto();
	}

	@Then("User is Select Owner in the permissions dropdown")
	public void user_is_Select_Owner_in_the_permissions_dropdown() {
		WebElement Owner = Userspage.getDropDownOwnerElement();
		Select select=new Select(Owner);
		select.selectByIndex(1);
	}

	@Then("User is Clicks Save button") 
	public void user_is_Clicks_Save_button() {
		//Userspage.click_Savebutton(); 
	}


}


