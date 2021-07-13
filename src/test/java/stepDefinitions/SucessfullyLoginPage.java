package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LogInPage;
import pageObjects.SucessfullyLoginpage;

public class SucessfullyLoginPage {

	private TestContext testContext;
	private SucessfullyLoginpage sucessfullyLoginPage;

	public SucessfullyLoginPage(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.sucessfullyLoginPage = testContext.getPageObjectManager().getSucessfullyLoginPage();
	}

	/*@Given("User are available in login page")
	public void user_are_available_in_login_page() {
		LogInPage.navigateTo_LogInPage2(); 
	}*/
	
	
	@When("User enters correct username {string}")
	public void user_enters_correct_username(String loginEmail) {
		sucessfullyLoginPage.enter_LoginEmail(loginEmail);
	}
	@When("User enters password {string}")
	public void user_enters_password(String loginpassword) {
		sucessfullyLoginPage.enter_Loginpassword(loginpassword);
	}

	@When("User enters correct password {string}") 
	public void user_enters_correct_password(String correctPassword) {
		sucessfullyLoginPage.enter_correctPassword(correctPassword);
	}

	/* @When("User Clicks Login button")
    public void user_Clicks_Login_button() {
        logInPage.click_LoginBtn();
    }*/

	@Then("User routed to dashboard page {string}")
	public void user_routed_to_dashboard_page(String string) {
		String pagetitle = sucessfullyLoginPage.getPageTitle();
		System.out.println("Login failure page title: " + pagetitle);
	}

}
