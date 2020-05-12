package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LogInPage;

public class LogInPageSteps {
	private TestContext testContext;
	private LogInPage logInPage;

	public LogInPageSteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.logInPage = testContext.getPageObjectManager().getLogInPage();
	}

	@Given("User is on Login Page")
	public void user_is_on_Home_Page() {
		logInPage.navigateTo_LogInPage();
	}

	@When("User enters username {string}")
	public void user_enters_username(String loginEmail) {
		logInPage.enter_LoginEmail(loginEmail);
	}

	@Given("User enters password {string}")
	public void user_enters_password(String loginPassword) {
		logInPage.enter_LoginPassword(loginPassword);
	}

	@When("User Clicks Login button")
	public void user_Clicks_Login_button() {
		logInPage.click_LoginBtn();
	}

	@Then("User routed to dashboard page {string}")
	public void user_routed_to_dashboard_page(String string) {
		String pagetitle = logInPage.getPageTitle();
		System.out.println("User routed to dashboard page:" + pagetitle);

	}

	@When("User enters correct username {string}")
	public void user_enters_correct_username(String loginEmail) {
		logInPage.enter_LoginEmail(loginEmail);
	}

	@When("User enters wrong  password {string}")
	public void user_enters_wrong_password(String loginPassword) {
		logInPage.enter_LoginPassword(loginPassword);
	}

	@Then("User shown with error message {string}")
	public void user_shown_with_error_message(String errorMessage) {
		String pagetitle = logInPage.getPageTitle();
		System.out.println("Login failure page title: " + pagetitle);
	}

	@When("User clicks on I have forgotten my password {string}")
	public void user_clicks_on() {
		logInPage.click_ForgottenBtn();
	}

	@Then("User shown with Reset password screen {string}")
	public void user_shown_with_Reset_password_screen(String loginEmailaddress) {
		logInPage.enter_Emailaddress(loginEmailaddress);
	}

	@When("User enters invalid email {string}")
	public void user_enters_invalid_email(String logininvalidEmailaddress) {
		logInPage.enter_invalidEmailaddress(logininvalidEmailaddress);
	}

	@Then("User enters valid but unregistered email {string}")
	public void user_enters_valid_but_unregistered_email(String loginunregisteredEmailaddress) {
		logInPage.enter_validbutunregisteredemail(loginunregisteredEmailaddress);
	}

	@When("User clicks on Send request")
	public void user_clicks_on_Send_request() {
		logInPage.click_SendrequestBtn();
	}

	@Then("User shown with errror message {string}")
	public void user_shown_with_errror_message(String string) {
		String pagetitle = logInPage.getPageTitle();
		System.out.println("Email not valid: " + pagetitle);
	}

	@Then("User enters valid registered email {string}")
	public void user_enters_valid_registered_email(String loginvalidregisteredEmailaddress) {
		logInPage.enter_validregisteredemail(loginvalidregisteredEmailaddress);
	}

	@When("User clickes on Send Request")
	public void user_clickes_on_Send_Request() {
		logInPage.click_SendrequestBtn();
	}

	@Then("User shown with password reset email set screen")
	public void user_shown_with_password_reset_email_set_screen() {
		String pagetitle = logInPage.getPageTitle();
		System.out.println("User shown with password reset email set screen: " + pagetitle);

	}

	@When("User enters invalid email\"user@aacbd.com\"")
	public void user_enters_invalid_email_user_aacbd_com(String logininvalidEmailaddress) {
		logInPage.enter_invalidEmailaddress(logininvalidEmailaddress);
	}

	@Then("User enters valid but unregistered email\"user@aacbd.com\"")
	public void user_enters_valid_but_unregistered_email_user_aacbd_com(String loginunregisteredEmailaddress) {
		logInPage.enter_validbutunregisteredemail(loginunregisteredEmailaddress);
	}

	@When("User enters invalid email\"guindyuser@gmail.com\"")
	public void user_enters_invalid_email_guindyuser_gmail_com(String logininvalidEmailaddress) {
		logInPage.enter_invalidEmailaddress(logininvalidEmailaddress);
	}

	@Then("User enters valid but unregistered email\"guindyuser@gmail.com\"")
	public void user_enters_valid_but_unregistered_email_guindyuser_gmail_com(String loginunregisteredEmailaddress) {
		logInPage.enter_validbutunregisteredemail(loginunregisteredEmailaddress);
	}

}
