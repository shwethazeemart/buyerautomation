package stepDefinitions;

import org.openqa.selenium.support.ui.Select;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LogInPage;
import pageObjects.OrdersPage;

public class NewRecurringOrderspage {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
    private NewRecurringOrderspage newrecurringorderspage;

	public NewRecurringOrderspage(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = testContext.getPageObjectManager().getLogInPage();
		this.newrecurringorderspage = testContext.getPageObjectManager().getNewRecurringOrderspage(); 


	}
	

		@Given("User are in New recurring orders login page")
		public void user_are_in_New_recurring_orders_login_page() {
			logInPage.navigateTo_LogInPage();
		}

		@When("User once enter valueable username {string}")
		public void user_onse_enter_valueable_username(String loginEmail) {
			LogInPage.enter_loginEmail(loginEmail);
		}

		@When("User once enter valuable password {string}")
		public void user_once_enter_valuable_password(String loginpassword) {
			LogInPage.enter_loginpassword(loginpassword);
		}

		@When("User once click login button")
		public void user_once_click_login_button() {
			LogInPage.click_LoginBtn();
		}

		@Given("User are in Orders Page")
		public void user_are_in_Orders_Page() {
			orderspage.navigateTo_Orderspage();
		}

		@Given("User in Clicks New order dropdown value")
		public void user_in_Clicks_New_order_dropdown_value() {
			OrdersPage.click_Neworder();

		}

		@Given("User Clicks New recurring orders in the dropdown value")
		public void user_Clicks_New_recurring_orders_in_the_dropdown_value() {
			OrdersPage.click_Newrecurringorders();
		}

		@Given("User select outlet in the dropdown list")
		public void user_select_outlet_in_the_dropdown_list() {
		    Select select=new Select(null);
		    select.selectByIndex(2);
		}

		@Given("User select supplier in the dropdown list")
		public void user_select_supplier_in_the_dropdown_list() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Given("User Clicks on deliver date in tuesday")
		public void user_Clicks_on_deliver_date_in_tuesday() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Given("User Clicks on Add to order in the first product")
		public void user_Clicks_on_Add_to_order_in_the_first_product() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("User Clicks on increase the order button in the first product")
		public void user_Clicks_on_increase_the_order_button_in_the_first_product() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("User Clicks on second time increase the order button in the first product")
		public void user_Clicks_on_second_time_increase_the_order_button_in_the_first_product() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("User Clicks on third time increase the order button in the first product")
		public void user_Clicks_on_third_time_increase_the_order_button_in_the_first_product() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("User Clicks on fourth time increase the order button in the first product")
		public void user_Clicks_on_fourth_time_increase_the_order_button_in_the_first_product() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("User Clicks on Add to order in the second product")
		public void user_Clicks_on_Add_to_order_in_the_second_product() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("User Clicks on increase the order button in the second product")
		public void user_Clicks_on_increase_the_order_button_in_the_second_product() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("User Clicks on second time increase the order button in the second product")
		public void user_Clicks_on_second_time_increase_the_order_button_in_the_second_product() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("User Clicks on Review Oreder button")
		public void user_Clicks_on_Review_Oreder_button() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("User Clicks on Save recurring order")
		public void user_Clicks_on_Save_recurring_order() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("It should display the particular order in recurring orders page")
		public void it_should_display_the_particular_order_in_recurring_orders_page() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}


	}


