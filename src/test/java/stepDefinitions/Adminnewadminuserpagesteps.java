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
import pageObjects.Adminnewadminuserpage;
import pageObjects.Adminnewbuyeruserpage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class Adminnewadminuserpagesteps {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private AdminInvoiceuploadpage admininvoiceuploadpage;
	private Admininvoiceprocesspage admininvoiceprocesspage;
	private Adminbuyersoutletpage adminbuyersoutletpage;
    private Adminnewbuyeruserpage adminnewbuyeruserpage;
    private Adminnewadminuserpage adminnewadminuserpage;
    
    
	public Adminnewadminuserpagesteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
		this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
		this.adminbuyersoutletpage=(Adminbuyersoutletpage)testContext.getPageObjectManager().getAdminbuyersoutletpageSteps();
		this.adminnewbuyeruserpage=testContext.getPageObjectManager().getAdminnewbuyeruserpageSteps();
		this.logInPage = testContext.getPageObjectManager().getLogInPage1(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.adminnewadminuserpage=testContext.getPageObjectManager().getAdminnewadminuserpagesteps();
	}
	
	
	@When("User Clicks in Admin panel users in the side navigation menubar")
	public void user_Clicks_in_Admin_panel_users_in_the_side_navigation_menubar()  {
	    dashboradpage.clickSuppliernewuser();
	}

	@Then("User are Clicks in Add New user button")
	public void user_are_Clicks_in_Add_New_user_button() {
		adminnewadminuserpage.Clicks_inAddNewuserbutton();
	}

	@And("User are Clicks in New Admin user")
	public void user_are_Clicks_in_New_Admin_user() {
	    adminnewadminuserpage.Clicks_inNewAdminuser();
	}

	@When("User are Select outlet in the autocomplete textbox")
	public void user_are_Select_outlet_in_the_autocomplete_textbox() throws InterruptedException {
	    Adminnewadminuserpage.Select_Outlet();
	}

	@When("User is Select supplier in the autocomplete textbox")
	public void user_is_Select_supplier_in_the_autocomplete_textbox() throws InterruptedException {
	    Adminnewadminuserpage.Select_Supplier();
	}

	@Then("User are Enter First name in the new admin user page{string}")
	public void user_are_Enter_First_name_in_the_new_admin_user_page_lingeshsabari(String firstname) {
	    adminnewadminuserpage.Enter_Firstname(firstname);
	}

	@And("User is Enter Last name in the new admin user page{string}")
	public void user_is_Enter_Last_name_in_the_new_admin_user_page_velumani(String lastname) {
	    adminnewadminuserpage.Enter_Lastname(lastname);
	}

	@Then("User are Enter Job title in the new admin user page{string}")
	public void user_are_Enter_Job_title_in_the_new_admin_user_page_ATZ_test(String jobtitle) {
	    adminnewadminuserpage.Enter_Jobtitle(jobtitle);
	}

	@And("User is Enter Email in the new admin user page{string}")
	public void user_is_Enter_Email_in_the_new_admin_user_page_velumani20101978_gmail_com(String Email) {
	    adminnewadminuserpage.Enter_Email(Email);
	}

	@Then("User are clear the mobile phone field in the new admin user page")
	public void user_are_clear_the_mobile_phone_field_in_the_new_admin_user_page() {
	    adminnewadminuserpage.clear_themobilephonefield();
	}

	@And("User is Enter mobile number in the new admin user page{string}")
	public void user_is_Enter_mobile_number_in_the_new_admin_user_page(String mobilenumber) {
	    adminnewadminuserpage.Enter_mobilenumber(mobilenumber);
	}

	@Then("User are Upload profile photo in the new admin user page")
	public void user_are_Upload_profile_photo_in_the_new_admin_user_page() throws InterruptedException {
	   adminnewadminuserpage.upload_the_profilephoto();
	}

	@When("User is Select language in the dropdown field of new admin user page")
	public void user_is_Select_language_in_the_dropdown_field_of_new_admin_user_page() {
		WebElement language = Adminnewadminuserpage.getDropDownlanguageElement();
		Select select=new Select(language);
		select.selectByIndex(0);
	}

	@When("User are Select market in the dropdown field of new admin user page")
	public void user_are_Select_market_in_the_dropdown_field_of_new_admin_user_page()  {
	    adminnewadminuserpage.Select_Market();
	}
	
	@Then("User is Clicks Singapore market in new admin user page")
	public void user_is_Clicks_Singapore_market_in_new_admin_user_page() {
	   adminnewadminuserpage.Clicks_Singaporemarket();
	}


	@When("User is Select role in the dropdown field of new admin user page")
	public void user_is_Select_role_in_the_dropdown_field_of_new_admin_user_page()  {
	   //adminnewadminuserpage.Select_role();
	}
	@Then("User is Clicks manage orders role in new admin user page")
	public void user_is_Clicks_manage_orders_role_in_new_admin_user_page() {
	    //adminnewadminuserpage.Clicks_manageordersrole();
	}

	@Then("User is Clicks save changes button in the new admin user page")
	public void user_is_Clicks_save_changes_button_in_the_new_admin_user_page() throws InterruptedException {
	   //adminnewadminuserpage.Clicks_savechangesbutton();
	}

	@Then("It should display in the Admin in Admins page")
	public void it_should_display_in_the_Admin_in_Admins_page() {
		String displayadminuser =Adminnewadminuserpage.getPageTitle();
		String pageTitle = displayadminuser;
		System.out.println("page title: " + pageTitle);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
