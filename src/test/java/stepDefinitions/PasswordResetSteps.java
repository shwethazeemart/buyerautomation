package stepDefinitions;

import org.hamcrest.MatcherAssert;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import pageObjects.LogInPage;
import pageObjects.PasswordResetPage;

/**
 * 
 * @author AjanthanSivalingarajah
 * @since 2020/05/12
 *
 */


public class PasswordResetSteps {

	private TestContext testContext;
	private PasswordResetPage PasswordResetPage;
	private LogInPage logInPage;
	

	public PasswordResetSteps(TestContext testContext) { 
		super(); 
		this.testContext = testContext;
		this.PasswordResetPage = testContext.getPageObjectManager().getPasswordResetPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		
	}
	/*@Given("User are available in login page")
	public void user_are_available_in_login_page() {
		LogInPage.navigateTo_LogInPage2();
	}*/
	@Given("User is on Login Page")
	public void user_is_on_Login_Page() {
		LogInPage.navigateTo_LogInPage2();
	}
	
	@When("User enters exact username {string}")
	public void user_enters_exact_username(String loginEmail) {
		logInPage.enter_loginEmail(loginEmail);
	}
	
	@Then("User enters valid registered email {string}")
	public void user_enters_valid_registered_email(String validEmail) {
		logInPage.enter_validEmailAddress(validEmail);

	
	}
	
	@When("User clicks on I've forgotten my password link")
	public void user_clicks_on_I_ve_forgotten_my_password_link() {
		PasswordResetPage.click_ForgottenPasswordLink();
	}

	@Then("User shown with Reset password screen {string}")
	public void user_shown_with_Reset_password_screen(String passwordResetScreenTitle) {

		String pageTitle = testContext.getWebDriverManager().getDriver().getTitle();
		System.out.println("current page title on testing:" + pageTitle);
		System.out.println("Assertion url : " + passwordResetScreenTitle);

		MatcherAssert.assertThat("Should land on dashboard page", passwordResetScreenTitle.equals(pageTitle));
	}

	@When("User enters invalid email for password reset page {string}")
	public void user_enters_invalid_email_for_password_reset_page(String invalidEmailaddress) {
		PasswordResetPage.enter_EmailAddress(invalidEmailaddress);
	}
	@When("User clicks on Send request for password reset")
	public void user_clicks_on_Send_request_for_password_reset() {
		PasswordResetPage.click_SendRequestBtn();
	}

	@Then("User shown with invalid email error message {string}")
	public void user_shown_with_valid_email_error_message(String string) {
		String errormessage = PasswordResetPage.getPageTitle1();
		String pageTitle = errormessage;
		System.out.println("passwordresetpage failure page title: " + pageTitle);

	}

	@When("User enters valid but unregisterd email for password reset {string}")
	public void user_enters_valid_but_unregisterd_email_for_password_reset(String unregisteredEmailaddress) {
		PasswordResetPage.enter_EmailAddress(unregisteredEmailaddress);
		String errormessage = PasswordResetPage.getPageTitle1();
		String pageTitle = errormessage;
		System.out.println("passwordresetpage failure page title: " + pageTitle);

	}

	@Then("User shown with non registered email error message {string}")
	public void user_shown_with_non_registered_email_error_message(String string) {
		String errormessage = PasswordResetPage.getPageTitle1();
		String pageTitle = errormessage;
		System.out.println("passwordresetpage failure page title: " + pageTitle);

	}
	@Then("User get display the popup message")
	public void user_get_display_the_popup_message() {
		String popupmessage = PasswordResetPage.getPageTitle1();
		String pageTitle = popupmessage;
		System.out.println("passwordresetpage failure page title: " + pageTitle);

	}
	
}
