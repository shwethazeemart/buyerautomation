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
	private Object logInPage2;
    
    
    public LogInPageSteps(TestContext testContext) {
        super();
        this.testContext = testContext;
        this.logInPage = testContext.getPageObjectManager().getLogInPage1();
        this.logInPage2 = testContext.getPageObjectManager().getLogInPage2();
        
    }

   
    @Given("User are available in login page")
	public void user_are_available_in_login_page() {
		LogInPage.navigateTo_LogInPage1();
	}
    
    @Given("User is on login page") 
	public void user_is_on_Login_Page() {
		LogInPage.navigateTo_LogInPage2();
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
    public void user_Clicks_Login_button() throws InterruptedException {
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
