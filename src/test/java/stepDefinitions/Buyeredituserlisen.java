package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeredituserlisenpage;
import pageObjects.DashboardPage;
import pageObjects.InvoicesPage;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;
import pageObjects.Userspage;

public class Buyeredituserlisen {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private InvoicesPage invoicespage;
	private Userspage userspage;
	private DashboardPage dashboradpage;
	private Buyeredituserlisenpage buyeredituserlisen;

	public Buyeredituserlisen(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.invoicespage = (InvoicesPage) testContext.getPageObjectManager().getInvoicesPage();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.userspage = (Userspage) testContext.getPageObjectManager().getUsersPage();
		this.buyeredituserlisen = testContext.getPageObjectManager().getBuyeredituserlisenpage();
	}

	@Then("User is click on check box of user {string}")
	public void user_is_click_on_check_box_of_user(String username) {
		Buyeredituserlisenpage.Clickoncheckboxofuser();
	}
	
	@Then("User click on delete icon")
	public void user_click_on_delete_icon() {
		Buyeredituserlisenpage.Clickondeleteicon();
	}

	@Then("User click on delete close icon")
	public void user_click_on_delete_close_icon() {
		 Buyeredituserlisenpage.Clickondeletecloseicon();
	}

	@Then("User click on user {string}")
	public void user_click_on_user(String string) {
		Buyeredituserlisenpage.Clickonuser();
	}

	@Then("User clear the job title")
	public void user_clear_the_job_title() {
		Buyeredituserlisenpage.Clearjobtitle();
	}

	@Then("User enter the job title{string}")
	public void user_enter_the_job_title_AtoZ_test(String title) {
		Buyeredituserlisenpage.Enterthejobtitle(title);
	}

	@Then("User clear the Email address")
	public void user_clear_the_Email_address() {
		// Buyeredituserlisenpage.ClearEmailfield();
	}

	@Then("User enter the Email in email filed{string}")
	public void user_enter_the_Email_in_email_filed_velumanieswaran2020_gmail_com(String Email) {
		// Buyeredituserlisenpage.EntertheEmail(Email);
	}

	@Then("User clear the mobile phone field")
	public void user_clear_the_mobile_phone_field() {
		Buyeredituserlisenpage.Clearthemobilephonefield();
	}

	@Then("User enter the mobile number in mobile phone field{string}")
	public void user_enter_the_mobile_number_in_mobile_phone_field(String mobilephone) {
		Buyeredituserlisenpage.Entermobilephonenumber(mobilephone);
	}

	@Then("User click save button in edit user page")
	public void user_click_save_button_in_edit_user_page() {
		Buyeredituserlisenpage.Clicksavebutton();
	}

	@Then("User click on clear icon in edit user page")
	public void user_click_on_clear_icon_in_edit_user_page() {
		Buyeredituserlisenpage.Clickclearicon();
	}

	@Then("User click on search box in edit user page")
	public void user_click_on_search_box_in_edit_user_page() {
		Buyeredituserlisenpage.Clicksearchbox();
	}

	@Then("User enter the name in search box in edit user page{string}")
	public void user_enter_the_name_in_search_box_in_edit_user_page_velu_mani2(String name) {
		Buyeredituserlisenpage.Enterthenameinsearchbox(name);
	}

	@Then("User clear on search box in edit user page")
	public void user_clear_on_search_box_in_edit_user_page() {
		Buyeredituserlisenpage.Clearsearchboxfield();
	}

}
