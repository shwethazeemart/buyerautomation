package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class AdminnewbuyeruserpageSteps {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private AdminInvoiceuploadpage admininvoiceuploadpage;
	private Admininvoiceprocesspage admininvoiceprocesspage;
	private Adminbuyersoutletpage adminbuyersoutletpage;
    private Adminnewbuyeruserpage adminnewbuyeruserpage;
    
    
	public AdminnewbuyeruserpageSteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
		this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
		this.adminbuyersoutletpage=(Adminbuyersoutletpage)testContext.getPageObjectManager().getAdminbuyersoutletpageSteps();
		this.adminnewbuyeruserpage=testContext.getPageObjectManager().getAdminnewbuyeruserpageSteps();
		this.testContext = testContext;
		this.logInPage = testContext.getPageObjectManager().getLogInPage(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
	}
	
	@When("User Clicks on Admin Users in the side navigation menubar")
	public void user_Clicks_on_Admin_Users_in_the_side_navigation_menubar() throws InterruptedException {
	   dashboradpage.clickBuyersnewuser();
	}

	@Then("User is Clicks in Add new user dropdown")
	public void user_is_Clicks_in_Add_new_user_dropdown() {
	    adminnewbuyeruserpage.Clicks_in_Add_new_user_dropdown();
	}

	@And("User are Clicks in New Buyer user")
	public void user_are_Clicks_in_New_Buyer_user() {
	    adminnewbuyeruserpage.Clicks_in_New_Buyer_user();
	}

	@When("User is Select Company in autocomplete text box")
	public void user_is_Select_Company_in_autocomplete_text_box() throws InterruptedException {
	    Adminnewbuyeruserpage.Select_Company();
	}

	@When("User is Select Outlet in autocomplete text box")
	public void user_is_Select_Outlet_in_autocomplete_text_box() throws InterruptedException {
	  Adminnewbuyeruserpage.Select_Outlet();
	}

	@Then("User is Enter First name in the First name field{string}")
	public void user_is_Enter_First_name_in_the_First_name_field_velumani(String firstname) {
	    adminnewbuyeruserpage.Enter_First_name(firstname);
	}

	@And("User is Enter Last name in the Last name field{string}")
	public void user_is_Enter_Last_name_in_the_Last_name_field_eswaran(String lastname) {
	    adminnewbuyeruserpage.Enter_Last_name(lastname);
	}

	@Then("User is Enter Job title{string}")
	public void user_is_Enter_Job_title_ATZ(String jobtitle) {
	  adminnewbuyeruserpage.Enter_Job_title(jobtitle);
	}

	@And("User are Enter Email in the Email field{string}")
	public void user_are_Enter_Email_in_the_Email_field_velumani20101978_gmail_com(String Email) {
	    adminnewbuyeruserpage.Enter_Email(Email);
	}

	@Then("User is Clicks checkbox of send Email notification")
	public void user_is_Clicks_checkbox_of_send_Email_notification() {
	    adminnewbuyeruserpage.Clicks_checkbox();
	}

	@And("User are Clear Mobile field")
	public void user_are_Clear_Mobile_field() {
	   adminnewbuyeruserpage.Clear_Mobile_field();
	}

	@Then("User is Enter Mobile number in the mobile field{string}")
	public void user_is_Enter_Mobile_number_in_the_mobile_field(String mobilenumber) {
	    adminnewbuyeruserpage.Enter_Mobile_number(mobilenumber);
	}

	@And("User are Upload Profile photo in the Profile field")
	public void user_are_Upload_Profile_photo_in_the_Profile_field() throws InterruptedException {
	    adminnewbuyeruserpage.upload_the_profilephoto();
	}

	@When("User are Select Permissions in the Permissions field")
	public void user_are_Select_Permissions_in_the_Permissions_field() {
		WebElement Owner = Adminnewbuyeruserpage.getDropDownOwnerElement();
		Select select=new Select(Owner);
		select.selectByIndex(3);
	}

	@Then("User is Clicks Save changes button")
	public void user_is_Clicks_Save_changes_button() {
	    //adminnewbuyeruserpage.Clicks_Save_changes_button();
	}

	@And("User is Clicks Buyers icon")
	public void user_is_Clicks_Buyers_icon() {
	    //adminnewbuyeruserpage.Clicks_Buyers_icon();
	}

	@Then("User Enter the Email in the Email fieldvelumani{string}")
	public void user_Enter_the_Email_in_the_Email_fieldvelumani20101978_gmail_com(String Emailfield) {
	   // adminnewbuyeruserpage.Enter_the_Email_in_the_Email_field(Emailfield);
	}

	@And("User are Clicks serach button")
	public void user_are_Clicks_serach_button() {
	   //adminnewbuyeruserpage.Clicks_serach_button();
	}

	@Then("It should display the particular User in Buyers page")
	public void it_should_display_the_particular_User_in_Buyers_page() {
		String displayuser =Adminnewbuyeruserpage.getPageTitle();
		String pageTitle = displayuser;
		System.out.println("page title: " + pageTitle);
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
