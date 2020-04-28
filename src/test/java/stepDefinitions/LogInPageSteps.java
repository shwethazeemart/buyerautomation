package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
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
}
