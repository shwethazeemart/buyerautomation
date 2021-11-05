package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import pageObjects.OrdersPage;
import pageObjects.SupplierTeamListPage;
import pageObjects.SupplierUserListPage;
import pageObjects.Suppliercustomerlocationlistingpage;
import pageObjects.Supplierdashboardpage;
import pageObjects.Supplierorderslistingpage;

public class SupplierUsersList {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private Object logInPage;
	private DashboardPage dashboradpage;
	private Suppliercustomerlocationlistingpage suppliercustomerlocationlisting;
	private Supplierdashboardpage supplierdashboard;
	private Supplierorderslistingpage supplierorderslisting;
	private SupplierUserListPage supplierUserList;
	
	

	public SupplierUsersList(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage =  testContext.getPageObjectManager().getLogInPage3();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.suppliercustomerlocationlisting=testContext.getPageObjectManager().getSuppliercustomerlocationlistingpage();
		this.supplierdashboard=	testContext.getPageObjectManager().getSupplierdashboardpage();
		this.supplierorderslisting=testContext.getPageObjectManager().getSupplierorderslistingpage();
		this.supplierUserList=testContext.getPageObjectManager().getSupplierUserListPage();
		
		
	}



	@Then("User click on Users side navigation list menubar")
	public void user_click_on_Users_side_navigation_list_menubar() throws InterruptedException {
		DashboardPage.ClickonsupplierUsersicon();
	}

	@Then("User click on add new in users page")
	public void user_click_on_add_new_in_users_page() {
		SupplierUserListPage.AddNewDropdownclick();
	}
 
	@Then("User click on new user in users page")
	public void user_click_on_new_user_in_users_page() {
		SupplierUserListPage.Newuserclick();
	}

	@Then("User enter on first name in new user page{string}")
	public void user_enter_on_first_name_in_new_user_page_lingesh(String firstname) {
		SupplierUserListPage.FirstNameEnter(firstname);
	}

	@Then("User enter on last name in new user page{string}")
	public void user_enter_on_last_name_in_new_user_page_sabari(String lastname) {
		SupplierUserListPage.LastNameEnter(lastname);
	}

	@Then("User enter on job title in new user page{string}")
	public void user_enter_on_job_title_in_new_user_page_AtoZtest(String jobtitle) {
		SupplierUserListPage.JobTitleEnter(jobtitle);
	}

	@Then("User enter on email in new user page{string}")
	public void user_enter_on_email_in_new_user_page_velusai22010_gmail_com(String email) {
		SupplierUserListPage.EmailEnter(email);
	}

	@Then("User clear on mobile number in new user page")
	public void user_clear_on_mobile_number_in_new_user_page() {
		SupplierUserListPage.MobileNumberClear();
	}

	@Then("User enter on mobile number in new user page{string}")
	public void user_enter_on_mobile_number_in_new_user_page(String mobilenumber) {
		SupplierUserListPage.MobileNumberEnter(mobilenumber);
	}

	@Then("User clear on whatsapp number in new user page")
	public void user_clear_on_whatsapp_number_in_new_user_page() {
		SupplierUserListPage.WhatsappNumberClear();
	}

	@Then("User enter on whatsapp number in new user page{string}")
	public void user_enter_on_whatsapp_number_in_new_user_page(String whatsappnumber) {
		SupplierUserListPage.WhatsappNumberEnter(whatsappnumber);
	}

	@Then("User on upload the profile photo in new user page")
	public void user_on_upload_the_profile_photo_in_new_user_page() throws InterruptedException {
		SupplierUserListPage.ProfilePhotoUpload();
	}

	@Then("User select on permission in dropdown field")
	public void user_select_on_permission_in_dropdown_field() {
		WebElement owner = supplierUserList.getDropDownElementOwner();
		Select select=new Select(owner);
		select.selectByIndex(2);
	}

	@Then("User click on save and exit button")
	public void user_click_on_save_and_exit_button() {
		SupplierUserListPage.SaveandExitclick(); 
	}

	@Then("User click on second checkbox of users page")
	public void user_click_on_second_checkbox_of_users_page() throws InterruptedException {
		SupplierUserListPage.CheckBoxclick();
	}

	@Then("User click on clear button in users page")
	public void user_click_on_clear_button_in_users_page() {
		//SupplierUserListPage.Clearclick(); 
	}

	@Then("User click on disable button inusers page")
	public void user_click_on_disable_button_inusers_page() {
		//SupplierUserListPage.Disableclick();
	}

	@Then("User click on yes disable popup message")
	public void user_click_on_yes_disable_popup_message() {
		//SupplierUserListPage.Yesdisableclick();
	}

	@Then("User click on enable button in users page")
	public void user_click_on_enable_button_in_users_page() {
		//SupplierUserListPage.Enableclick();
	}

	@Then("User click on textbox in users page")
	public void user_click_on_textbox_in_users_page() {
		SupplierUserListPage.Textboxclick();
	}

	@Then("User enter on name textbox field{string}")
	public void user_enter_on_name_textbox_field_velu_mani(String name) {
		SupplierUserListPage.NameTextBoxEnter(name);
	}

	@Then("User click on actions dropdown field")
	public void user_click_on_actions_dropdown_field() {
		SupplierUserListPage.ActionsDropdownclick();
	}

	@Then("User click on edit details icon in dropdown field")
	public void user_click_on_edit_details_icon_in_dropdown_field() {
		SupplierUserListPage.EditDetailsclick();
	}

	@Then("User clear on jobtitle field in edit user page")
	public void user_clear_on_jobtitle_field_in_edit_user_page() {
		SupplierUserListPage.JobTitleclear();
	}

	@Then("User click on save button in edit user page")
	public void user_click_on_save_button_in_edit_user_page() {
		SupplierUserListPage.Saveclick();
	}

	@Then("User click on search button in users page")
	public void user_click_on_search_button_in_users_page() {
	    SupplierUserListPage.Searchclick();
	}



	@Then("User click on Third checkbox of users page")
	public void user_click_on_Third_checkbox_of_users_page() throws InterruptedException {
	    SupplierUserListPage.CheckBoxthirdclick();
	}

	@Then("User click on fourth checkbox of users page")
	public void user_click_on_fourth_checkbox_of_users_page() throws InterruptedException {
	    //SupplierUserListPage.CheckBoxFourthclick();
	}










































}
