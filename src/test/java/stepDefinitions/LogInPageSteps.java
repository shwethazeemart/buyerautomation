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
    private LogInPage loginPage3;
    
    public LogInPageSteps(TestContext testContext) {
        super();
        this.testContext = testContext;
        this.logInPage = testContext.getPageObjectManager().getLogInPage1();
        this.logInPage2 = testContext.getPageObjectManager().getLogInPage2();
        this.loginPage3 = testContext.getPageObjectManager().getLogInPage3();
        
    }

   
    @Given("User are available in login page")
	public void user_are_available_in_login_page() {
		LogInPage.navigateTo_LogInPage1();
	}
    
    @Given("User is on available Login Page")
   	public void user_is_on_available_Login_Page() {
   		LogInPage.navigateTo_LogInPage3();
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
    
   

	@When("User enter correct username{string}")
	public void user_enter_correct_username_velumanieswaran2020_gmail_com(String loginEmail) {
	   LogInPage.Entercorrcectusername(loginEmail);	
	}

	@When("User enter correct password{string}")
	public void user_enter_correct_password_123456Zm(String loginPassword) {
		LogInPage.Entercorrectpassword(loginPassword);
	}

	@When("User is click login button in supplier panel")
	public void user_is_click_login_button_in_supplier_panel() throws InterruptedException {
		LogInPage.Clickloginbutton();
	}

    @Then("User shown with invalid userName,password error message {string}")
    public void user_shown_with_invalid_userName_password_error_message(String string) {
		String errormessage = logInPage.getPageTitle();
		String pageTitle = errormessage;
		System.out.println("passwordresetpage failure page title: " + pageTitle);
	
    
    }
}
