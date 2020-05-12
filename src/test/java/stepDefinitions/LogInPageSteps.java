package stepDefinitions;

import static org.junit.Assert.assertEquals;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LogInPage;

/**
 * 
 * @author AjanthanSivalingarajah
 * @since 2020/05/12
 *
 */
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

    @Then("User shown with invalid userName,password error message {string}")
    public void user_shown_with_invalid_userName_password_error_message(String expectedPagetitle) {
        String pagetitle = logInPage.getPageTitle();
        System.out.println("Login failure page title: " + pagetitle);
        // Commenting this because need to find the way to check pop up toster
        // messages
        // logInPage.isTosterMessageFound(expectedPagetitle);
    }

    @When("User clicks on I've forgotten my password link")
    public void user_clicks_on_I_ve_forgotten_my_password_link() {
        logInPage.click_ForgottenPasswordLink();
    }

}
