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
        logInPage.navigateTo_LogInPage1();
    }

    @When("User enters username {string}")
    public void user_enters_username(String loginEmail) {
        LogInPage.enter_loginEmail(loginEmail);
    }

    @Given("User enters wrong password {string}")
    public void user_enters_wrong__password(String loginPassword) {
        logInPage.enter_wrongPassword(loginPassword);
    }

    @When("User Clicks Login button")
    public void user_Clicks_Login_button() {
        logInPage.click_LoginBtn();
    }
    /*@When("User Clicks Login button")
    public void user_Clicks_Login_buttonadmin() throws InterruptedException {
        logInPage.click_LoginBtnadmin();
    }*/
    
    @Then("User shown with invalid userName,password error message {string}")
    public void user_shown_with_invalid_userName_password_error_message(String string) {
		String errormessage = logInPage.getPageTitle();
		String pageTitle = errormessage;
		System.out.println("passwordresetpage failure page title: " + pageTitle);
    
    }
}
