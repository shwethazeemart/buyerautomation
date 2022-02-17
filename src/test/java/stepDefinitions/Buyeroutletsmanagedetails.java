package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.Buyeroutletsmanagedetailspage;
import pageObjects.DashboardPage;
import pageObjects.LogInPage;
import pageObjects.Newrecurringorderspage;
import pageObjects.OrdersPage;

public class Buyeroutletsmanagedetails {

	private TestContext testContext;
	private OrdersPage orderspage;
	private Object OrderID;
	private LogInPage logInPage;
	private DashboardPage dashboradpage;
	private Object outletspage;
	private Newrecurringorderspage newrecurringorderspage;
    private Buyeroutletsmanagedetailspage buyeroutletsmanagedetails;
    
    
	public Buyeroutletsmanagedetails(TestContext testContext) {
		super();
		this.testContext = testContext;
		this.orderspage = testContext.getPageObjectManager().getOrdersPage();
		this.logInPage = (LogInPage) testContext.getPageObjectManager().getLogInPage2();
		this.dashboradpage = testContext.getPageObjectManager().getDashboardPage();
		this.outletspage = testContext.getPageObjectManager().getOutletspage();
		this.newrecurringorderspage=(Newrecurringorderspage)testContext.getPageObjectManager().getNewRecurringOrderspageSteps();
		this.buyeroutletsmanagedetails = testContext.getPageObjectManager().getBuyeroutletsmanagedetailspage();
		
	}
	
	
	@Then("User clicks on Manage details")
	public void user_clicks_on_Manage_details() {
	   Buyeroutletsmanagedetailspage.Clickonmanagedetails();
	}

	@Then("User clear on outlet email")
	public void user_clear_on_outlet_email() {
	    Buyeroutletsmanagedetailspage.Clearonoutletemail();
	}

	@Then("User enter the new email id{string}")
	public void user_enter_the_new_email_id_lingeshsabari2009_gmail_com(String Email) {
	      Buyeroutletsmanagedetailspage.Enternewemail(Email);
		
	}

	@Then("User click on manage subscription")
	public void user_click_on_manage_subscription() throws InterruptedException {
	    //Buyeroutletsmanagedetailspage.Clickmanagesubscription();
	}

	@Then("User click on manage subscription close icon")
	public void user_click_on_manage_subscription_close_icon() {
          //Buyeroutletsmanagedetailspage.Clickmanagesubscriptioncloseicon();

	}
	
	@Then("User click on save button")
	public void user_click_on_save_button() {
	    Buyeroutletsmanagedetailspage.Clicksavebutton();
	}


	@Then("User click on first manage subscription")
	public void user_click_on_first_manage_subscription() throws InterruptedException {
         //Buyeroutletsmanagedetailspage.Clickfirstmanagesubscription();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
