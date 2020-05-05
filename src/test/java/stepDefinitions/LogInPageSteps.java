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

	@When("User enters correct username {string}")
	public void user_enters_correct_username(String loginEmail) {
		logInPage.enter_LoginEmail(loginEmail);
	}

	@When("User enters wrong password {string}")
	public void user_enters_wrong_password(String loginPassword) {
		logInPage.enter_LoginPassword(loginPassword);
	}

	@Then("User shown with error message {string}")
	public void user_shown_with_error_message(String errorMessage) {
		String pagetitle = logInPage.getPageTitle();
		System.out.println("Login failure page title: " + pagetitle);
	}
	@When("User clicks on I've fortgotten my password {string}")
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

	@Then("User enters valid but unregisterd email {string}")
	public void user_enters_valid_but_unregisterd_email(String loginunregisterdEmailaddress) {
	   logInPage.enter_validbutunregisterdemail(loginunregisterdEmailaddress);
	}

	@When("User clicks on Send request")
	public void user_clicks_on_Send_request() {
	    logInPage.click_SendrequestBtn();
	}

	@Then("User shown with error message  {string}")
	public void user_shown_with_error_message1(String string) {
		String pagetitle = logInPage.getPageTitle();
		System.out.println("Email not valid: " + pagetitle);
	}

	@Then("User enters valid registered email {string}")
	public void user_enters_valid_registered_email(String loginvalidregisterdEmailaddress) {
		logInPage.enter_validregisteredemail(loginvalidregisterdEmailaddress);
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


}
