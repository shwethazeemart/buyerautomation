package stepDefinitions;

import org.hamcrest.MatcherAssert;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PasswordResetPage;

/**
 * 
 * @author AjanthanSivalingarajah
 * @since 2020/05/12
 *
 */
public class PasswordResetSteps {
    private TestContext testContext;
    private PasswordResetPage passwordResetPage;

    public PasswordResetSteps(TestContext testContext) {
        super();
        this.testContext = testContext;
        this.passwordResetPage = testContext.getPageObjectManager().getPasswordResetPage();
    }

    @Then("User shown with Reset password screen {string}")
    public void user_shown_with_Reset_password_screen(String passwordResetScreenTitle) {

        String pageTitle = testContext.getWebDriverManager().getDriver().getTitle();
        System.out.println("current page title on testing:" + pageTitle);
        System.out.println("Assertion url : " + passwordResetScreenTitle);

        MatcherAssert.assertThat("Should land on dashboard page", passwordResetScreenTitle.equals(pageTitle));
    }

    @When("User enters invalid email for password reset {string}")
    public void user_enters_invalid_email_for_password_reset(String invalidEmail) {
       passwordResetPage.enter_EmailAddress(invalidEmail);
      
    }

    @Then("User shown with valid email error message {string}")
    public void user_shown_with_valid_email_error_message(String errorMessage) {
       passwordResetPage.enter_EmailAddress(errorMessage);
    }

    @Then("User enters valid but unregisterd email for password reset {string}")
    public void user_enters_valid_but_unregisterd_email_for_password_reset(String validUnregisteredEmail) {
        passwordResetPage.enter_EmailAddress(validUnregisteredEmail);
    }

    @When("User clicks on Send request for password reset")
    public void user_clicks_on_Send_request_for_password_reset() {
     passwordResetPage.click_SendRequestBtn();   
    }

    @Then("User shown with non registered email error message {string}")
    public void user_shown_with_non_registered_email_error_message(String errorMessage) {
    	passwordResetPage.enter_EmailAddress(errorMessage);
    }

    @When("User enters valid registered email {string}")
    public void user_enters_valid_registered_email(String validEmail) {
        passwordResetPage.enter_EmailAddress(validEmail);
    }

    @Then("User shown with password reset email sent screen")
    public void user_shown_with_password_reset_email_sent_screen() {
    	String pagetitle = passwordResetPage.toString();
        System.out.println("password reset email sent screen: " + pagetitle);
    }

}
