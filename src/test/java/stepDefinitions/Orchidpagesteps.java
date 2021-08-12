package stepDefinitions;

import org.openqa.selenium.WebElement;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AdminInvoiceuploadpage;
import pageObjects.Adminbuyersoutletpage;
import pageObjects.Admininvoiceprocesspage;
import pageObjects.Adminsuppliersviewoutletspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Orchidpage;
import pageObjects.OrdersPage;

public class Orchidpagesteps {

	private TestContext testContext;
	private OrdersPage orderspage;
	//private txtBoxContent txtBoxContent;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private AdminInvoiceuploadpage admininvoiceuploadpage;
	private Admininvoiceprocesspage admininvoiceprocesspage;
	private Orchidpage orchidpage;

	public Orchidpagesteps(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.admininvoiceuploadpage=(AdminInvoiceuploadpage)testContext.getPageObjectManager().getAdminInvoiceuploadpageSteps();
		this.admininvoiceprocesspage=(Admininvoiceprocesspage)testContext.getPageObjectManager().getAdmininvoiceprocesspageSteps();
		this.orchidpage=testContext.getPageObjectManager().getOrchidpagesteps();
		
		this.testContext = testContext;
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2(); 
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
	}
	@Given("User is navigateTo LogInPage")
	public void user_is_navigateTo_LogInPage() {
		 orchidpage.user_is_navigateTo_LogInPage(); 
	}

	
	@When("User is  Clicks in Home link button")
	public void user_is_Clicks_in_Home_link_button() throws InterruptedException {
	    dashboradpage.Clicksinhomepage();
	}

	@When("User is Clicks POP Message in the Home page")
	public void user_is_Clicks_POP_Message_in_the_Home_page() throws InterruptedException {
	    orchidpage.ClickPOPmessage();
	}

	@When("User is Clicks in online booking link")
	public void user_is_Clicks_in_online_booking_link() throws InterruptedException {
	    orchidpage.Clicksonlinebookoinglink(); 
	}

	@When("User is enter exact Email Address in the Email Address field{string}")
	public void user_is_enter_exact_Email_Address_in_the_Email_Address_field_velumani_zeemart_asia(String Email) {
	    //orchidpage.enter_exact_Email_Address(Email);
	}

	@Then("User is enter full name of the playerone{string}")
	public void user_is_enter_full_name_of_the_playerone_velumanieswaran(String playerone) {
	    orchidpage.enter_full_name_of_the_playerone(playerone);
	}

	@Then("User is enter membership number one{string}")
	public void user_is_enter_membership_number_one(String membershipnumberone) {
	   orchidpage.enter_membership_number_one(membershipnumberone); 
	}

	@Then("User is enter mobilenumber{string}")
	public void user_is_enter_mobilenumber(String mobilenumber) {
	    orchidpage.enter_mobilenumber(mobilenumber);
	}

	@Then("Users is Clicks date in calendar field")
	public void users_is_Clicks_date_in_calendar_field() {
	    Orchidpage.SelectcalendarByJS();
	}

	@Then("User is Clicks Radio button in booking type")
	public void user_is_Clicks_Radio_button_in_booking_type() {
		WebElement automaticradio = Orchidpage.getapplyfeesradioElement();
		automaticradio.click();
	}

	@Then("User is enter prepare tee time{string}")
	public void user_is_enter_prepare_tee_time(String teetime) {
	    orchidpage.enter_prepare_tee_time(teetime);
	}

	@Then("User is enter player name two{string}")
	public void user_is_enter_player_name_two_eswarannagappan(String playernametwo) {
	   orchidpage.enter_player_name_two(playernametwo);
	}

	@Then("User is enter membership number two{string}")
	public void user_is_enter_membership_number_two(String membershipnumbertwo) {
	 orchidpage.enter_membership_numbertwo(membershipnumbertwo);   
	}

	@Then("User is enter player name three{string}")
	public void user_is_enter_player_name_three_logambaleswaran(String playernamethree) {
	    orchidpage.enter_player_name_three(playernamethree);
	}

	@Then("User is enter membership number three{string}")
	public void user_is_enter_membership_number_three(String membershipnumberthree) {
		orchidpage.enter_membership_numberthree(membershipnumberthree);   
	}

	@Then("User is enter player name four{string}")
	public void user_is_enter_player_name_four_vekatammalarthanari(String playernamefour) {
	    orchidpage.enter_player_name_four(playernamefour);
	}

	@Then("User is enter membership number four{string}")
	public void user_is_enter_membership_number_four(String membershipnumberfour) {
	    orchidpage.enter_membership_number_four(membershipnumberfour);
	}

	@Then("User is Clicks the next button")
	public void user_is_Clicks_the_next_button() {
	   //orchidpage.Clicks_the_next_button();
	}

	@Then("It should display orchid another page")
	public void it_should_display_orchid_another_page() {
		//String displayinorchidpage =Orchidpage.getPageTitle();
		//String pageTitle = displayinorchidpage;
		//System.out.println("page title: " + pageTitle);
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
